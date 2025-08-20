use serde::{Deserialize, Serialize};
use chrono::{DateTime, Utc};

#[derive(Debug, Clone, Serialize, Deserialize)]
pub enum ItemType {
    Product = 1,
    Coupon = 2,
    WeeklyAd = 3,
    Manual = 4,
}

#[derive(Debug, Clone, Serialize, Deserialize)]
pub struct ListItem {
    pub list_item_id: i32,
    pub list_item_type_id: i32,
    pub item_display_order: i32,
    pub item_part_number: Option<String>,
    pub item_description: String,
    pub quantity: i32,
    pub store_id: i32,
    pub notes: Option<String>,
    pub is_complete: bool,
    pub is_favorite: bool,
    pub listing_id: Option<String>,
    #[serde(with = "chrono::serde::ts_seconds_option")]
    pub promotion_start: Option<DateTime<Utc>>,
    #[serde(with = "chrono::serde::ts_seconds_option")]
    pub promotion_end: Option<DateTime<Utc>>,
    pub coupon_id: i32,
    pub raw_data: Option<serde_json::Map<String, serde_json::Value>>,
}

impl ListItem {
    pub fn new(id: i32, description: String) -> Self {
        Self {
            list_item_id: id,
            list_item_type_id: 1, // Product by default
            item_display_order: 1,
            item_part_number: None,
            item_description: description,
            quantity: 1,
            store_id: 0,
            notes: None,
            is_complete: false,
            is_favorite: false,
            listing_id: None,
            promotion_start: None,
            promotion_end: None,
            coupon_id: 0,
            raw_data: None,
        }
    }

    // Backward compatibility properties
    pub fn id(&self) -> i32 {
        self.list_item_id
    }

    pub fn name(&self) -> &str {
        &self.item_description
    }

    pub fn checked(&self) -> bool {
        self.is_complete
    }

    pub fn is_completed(&self) -> bool {
        self.is_complete
    }

    pub fn is_pending(&self) -> bool {
        !self.is_complete
    }

    pub fn set_complete(&mut self, value: bool) {
        self.is_complete = value;
    }
}
