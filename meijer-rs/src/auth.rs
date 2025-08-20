use serde::{Deserialize, Serialize};
use std::collections::HashMap;
use std::fs;
use std::path::PathBuf;
use std::time::{SystemTime, UNIX_EPOCH};
use chrono::{DateTime, Utc};
use anyhow::{Result, anyhow};

#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct AuthTokens {
    pub access_token: String,
    pub refresh_token: String,
    pub expires_in: i64,
    pub token_type: String,
    pub expires_at: Option<String>,
}

impl AuthTokens {
    pub fn new(access_token: String, refresh_token: String, expires_in: i64) -> Self {
        let expires_at = SystemTime::now()
            .duration_since(UNIX_EPOCH)
            .unwrap()
            .as_secs() + expires_in as u64;
        
        let expires_at_str = DateTime::from_timestamp(expires_at as i64, 0)
            .map(|dt| dt.to_rfc3339())
            .unwrap_or_default();

        Self {
            access_token,
            refresh_token,
            expires_in,
            token_type: "Bearer".to_string(),
            expires_at: Some(expires_at_str),
        }
    }

    pub fn is_expired(&self, buffer_seconds: i64) -> bool {
        if let Some(expires_at_str) = &self.expires_at {
            if let Ok(expires_at) = DateTime::parse_from_rfc3339(expires_at_str) {
                let now = Utc::now();
                let buffer = chrono::Duration::seconds(buffer_seconds);
                return now + buffer >= expires_at;
            }
        }
        true
    }

    pub fn to_dict(&self) -> HashMap<String, serde_json::Value> {
        let mut dict = HashMap::new();
        dict.insert("access_token".to_string(), serde_json::Value::String(self.access_token.clone()));
        dict.insert("refresh_token".to_string(), serde_json::Value::String(self.refresh_token.clone()));
        dict.insert("expires_in".to_string(), serde_json::Value::Number(serde_json::Number::from(self.expires_in)));
        dict.insert("token_type".to_string(), serde_json::Value::String(self.token_type.clone()));
        dict.insert("expires_at".to_string(), serde_json::Value::String(self.expires_at.clone().unwrap_or_default()));
        dict
    }

    pub fn from_dict(data: &HashMap<String, serde_json::Value>) -> Result<Self> {
        let access_token = data.get("access_token")
            .and_then(|v| v.as_str())
            .ok_or_else(|| anyhow!("Missing access_token"))?;
        
        let refresh_token = data.get("refresh_token")
            .and_then(|v| v.as_str())
            .ok_or_else(|| anyhow!("Missing refresh_token"))?;
        
        let expires_in = data.get("expires_in")
            .and_then(|v| v.as_i64())
            .ok_or_else(|| anyhow!("Missing expires_in"))?;

        Ok(Self {
            access_token: access_token.to_string(),
            refresh_token: refresh_token.to_string(),
            expires_in,
            token_type: "Bearer".to_string(),
            expires_at: data.get("expires_at")
                .and_then(|v| v.as_str())
                .map(|s| s.to_string()),
        })
    }
}

pub struct TokenStorage {
    storage_file: PathBuf,
    oauth_base_url: String,
    client_id: String,
    refresh_buffer_seconds: i64,
}

impl TokenStorage {
    pub fn new() -> Self {
        let storage_file = Self::get_meijer_config_path("meijer_tokens.pkl");
        let oauth_base_url = "https://id.meijer.com/oauth2/default/v1".to_string();
        let client_id = "0oa1o8g9njWsUvwsx697".to_string();
        let refresh_buffer_seconds = 300; // 5 minutes before expiry

        Self {
            storage_file,
            oauth_base_url,
            client_id,
            refresh_buffer_seconds,
        }
    }

    fn get_meijer_config_path(filename: &str) -> PathBuf {
        if let Some(config_dir) = dirs::config_dir() {
            config_dir.join("meijer").join(filename)
        } else {
            let home = dirs::home_dir().unwrap_or_else(|| PathBuf::from("~"));
            home.join(".config").join("meijer").join(filename)
        }
    }

    pub fn load_tokens(&self) -> Option<AuthTokens> {
        if !self.storage_file.exists() {
            return None;
        }

        // Try to load from pickle file first (Python format)
        if let Ok(tokens) = self.load_tokens_from_pickle() {
            return Some(tokens);
        }

        // Try to load from JSON file
        if let Ok(tokens) = self.load_tokens_from_json() {
            return Some(tokens);
        }

        None
    }

    fn load_tokens_from_pickle(&self) -> Result<AuthTokens> {
        // For now, we'll just return an error since pickle is Python-specific
        // In a real implementation, you might want to use a pickle parser crate
        Err(anyhow!("Pickle format not yet supported in Rust"))
    }

    fn load_tokens_from_json(&self) -> Result<AuthTokens> {
        let content = fs::read_to_string(&self.storage_file)?;
        let data: HashMap<String, serde_json::Value> = serde_json::from_str(&content)?;
        AuthTokens::from_dict(&data)
    }

    pub fn save_tokens(&self, tokens: &AuthTokens) -> Result<()> {
        // Ensure config directory exists
        if let Some(parent) = self.storage_file.parent() {
            fs::create_dir_all(parent)?;
        }

        // Save as JSON for now (easier to debug)
        let content = serde_json::to_string_pretty(&tokens.to_dict())?;
        fs::write(&self.storage_file, content)?;
        Ok(())
    }

    pub fn has_tokens(&self) -> bool {
        self.storage_file.exists()
    }

    pub fn get_valid_tokens(&self) -> Option<AuthTokens> {
        let tokens = self.load_tokens()?;
        
        if tokens.is_expired(self.refresh_buffer_seconds) {
            // Try to refresh tokens
            if self.refresh_tokens(&tokens.refresh_token).is_ok() {
                return self.load_tokens();
            } else {
                return None;
            }
        }
        
        Some(tokens)
    }

    pub fn refresh_tokens(&self, refresh_token: &str) -> Result<()> {
        if refresh_token.is_empty() {
            return Err(anyhow!("No refresh token available"));
        }

        let client = reqwest::blocking::Client::new();
        let refresh_data = [
            ("client_id", self.client_id.as_str()),
            ("grant_type", "refresh_token"),
            ("refresh_token", refresh_token),
        ];

        let response = client.post(&format!("{}/token", self.oauth_base_url))
            .form(&refresh_data)
            .header("Content-Type", "application/x-www-form-urlencoded")
            .header("Accept", "application/json")
            .send()?;

        if response.status().is_success() {
            let token_data: HashMap<String, serde_json::Value> = response.json()?;
            
            let new_tokens = AuthTokens::new(
                token_data.get("access_token")
                    .and_then(|v| v.as_str())
                    .unwrap_or("")
                    .to_string(),
                token_data.get("refresh_token")
                    .and_then(|v| v.as_str())
                    .unwrap_or("")
                    .to_string(),
                token_data.get("expires_in")
                    .and_then(|v| v.as_i64())
                    .unwrap_or(3600),
            );

            self.save_tokens(&new_tokens)?;
            Ok(())
        } else {
            Err(anyhow!("Token refresh failed: {}", response.status()))
        }
    }
}

impl Default for TokenStorage {
    fn default() -> Self {
        Self::new()
    }
}
