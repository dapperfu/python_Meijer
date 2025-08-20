use crate::auth::{TokenStorage, AuthTokens};
use std::collections::HashMap;
use anyhow::{Result, anyhow};
use reqwest::blocking::Client;

pub struct MeijerClient {
    api_base_url: String,
    subscription_key: String,
    token_storage: TokenStorage,
    http_client: Client,
}

impl MeijerClient {
    pub fn new() -> Self {
        Self {
            api_base_url: "https://api.meijer.com".to_string(),
            subscription_key: "a10bc58ac484478d9b3958b1742c3a03".to_string(),
            token_storage: TokenStorage::new(),
            http_client: Client::new(),
        }
    }

    pub fn _get_api_headers(&self) -> Result<HashMap<String, String>> {
        let mut headers = HashMap::new();
        headers.insert("Ocp-Apim-Subscription-Key".to_string(), self.subscription_key.clone());
        headers.insert("Content-Type".to_string(), "application/json".to_string());
        headers.insert("Accept".to_string(), "application/json".to_string());
        
        // Add authentication token if available
        if let Some(tokens) = self.token_storage.get_valid_tokens() {
            headers.insert("Authorization".to_string(), format!("Bearer {}", tokens.access_token));
        }
        
        Ok(headers)
    }

    pub fn _ensure_authenticated(&self) -> bool {
        self.token_storage.get_valid_tokens().is_some()
    }

    pub fn _make_request(&self, method: &str, url: &str, headers: HashMap<String, String>) -> Result<reqwest::blocking::Response> {
        let request = match method.to_uppercase().as_str() {
            "GET" => self.http_client.get(url),
            "POST" => self.http_client.post(url),
            "PUT" => self.http_client.put(url),
            "DELETE" => self.http_client.delete(url),
            "PATCH" => self.http_client.patch(url),
            _ => return Err(anyhow!("Unsupported HTTP method: {}", method)),
        };

        let mut request_builder = request;
        for (key, value) in headers {
            request_builder = request_builder.header(key, value);
        }

        let response = request_builder.send()?;
        Ok(response)
    }

    pub fn get_tokens(&self) -> Option<AuthTokens> {
        self.token_storage.get_valid_tokens()
    }

    pub fn api_base_url(&self) -> &str {
        &self.api_base_url
    }
}

impl Default for MeijerClient {
    fn default() -> Self {
        Self::new()
    }
}
