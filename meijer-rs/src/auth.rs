use serde::{Deserialize, Serialize};
use std::collections::HashMap;
use std::fs;
use std::path::PathBuf;
use anyhow::{Result, anyhow};
use dirs;

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
        Self {
            access_token,
            refresh_token,
            expires_in,
            token_type: "Bearer".to_string(),
            expires_at: None,
        }
    }

    pub fn is_expired(&self, _buffer_seconds: i64) -> bool {
        // For now, just check if we have a token
        // In a real implementation, you'd check the expires_at field
        self.access_token.is_empty()
    }

    pub fn to_dict(&self) -> HashMap<String, serde_json::Value> {
        let mut dict = HashMap::new();
        dict.insert("access_token".to_string(), serde_json::Value::String(self.access_token.clone()));
        dict.insert("refresh_token".to_string(), serde_json::Value::String(self.refresh_token.clone()));
        dict.insert("expires_in".to_string(), serde_json::Value::Number(serde_json::Number::from(self.expires_in)));
        dict.insert("token_type".to_string(), serde_json::Value::String(self.token_type.clone()));
        if let Some(expires_at) = &self.expires_at {
            dict.insert("expires_at".to_string(), serde_json::Value::String(expires_at.clone()));
        }
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
}

impl TokenStorage {
    pub fn new() -> Self {
        let storage_file = Self::get_meijer_config_path("auth.txt");
        Self { storage_file }
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

        // Load from JSON file (auth.txt)
        if let Ok(tokens) = self.load_tokens_from_json() {
            return Some(tokens);
        }

        None
    }

    fn load_tokens_from_json(&self) -> Result<AuthTokens> {
        let content = fs::read_to_string(&self.storage_file)?;
        let data: HashMap<String, serde_json::Value> = serde_json::from_str(&content)?;
        AuthTokens::from_dict(&data)
    }

    pub fn get_valid_tokens(&self) -> Option<AuthTokens> {
        println!("🔍 Checking for valid tokens in: {}", self.storage_file.display());

        let tokens = match self.load_tokens() {
            Some(t) => {
                println!("📋 Found tokens - checking expiration...");
                t
            },
            None => {
                println!("❌ No tokens found");
                return None;
            }
        };

        if tokens.is_expired(0) {
            println!("⏰ Tokens are expired!");
            return None;
        }

        println!("✅ Tokens are valid!");
        Some(tokens)
    }
}

impl Default for TokenStorage {
    fn default() -> Self {
        Self::new()
    }
}
