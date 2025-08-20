use crate::client::MeijerClient;
use crate::models::ListItem;
use std::collections::HashMap;
use anyhow::{Result, anyhow};
use serde_json::{Value, Map};

pub struct MeijerList {
    meijer_client: MeijerClient,
    endpoints: HashMap<String, String>,
}

impl MeijerList {
    pub fn new(meijer_client: MeijerClient) -> Self {
        let mut endpoints = HashMap::new();
        endpoints.insert("get_list".to_string(), "/loyalty/shoppinglist/GetList".to_string());
        endpoints.insert("add_item".to_string(), "/loyalty/shoppinglist/AddListItem".to_string());
        endpoints.insert("delete_item".to_string(), "/loyalty/shoppinglist/DeleteListItem/{itemId}".to_string());
        endpoints.insert("mark_complete".to_string(), "/loyalty/shoppinglist/MarkAsCompleted/{itemId}".to_string());
        endpoints.insert("mark_incomplete".to_string(), "/loyalty/shoppinglist/MarkAsNotCompleted/{itemId}".to_string());
        endpoints.insert("update_item".to_string(), "/loyalty/shoppinglist/UpdateListItem/{itemId}".to_string());
        endpoints.insert("reorder_item".to_string(), "/loyalty/shoppinglist/listItem/order".to_string());
        endpoints.insert("delete_all".to_string(), "/loyalty/shoppinglist/DeleteAllListItems".to_string());
        endpoints.insert("get_favorites".to_string(), "/loyalty/shoppinglist/GetFavoritesList".to_string());
        endpoints.insert("add_favorite".to_string(), "/loyalty/shoppinglist/AddFavoritesListItem".to_string());
        endpoints.insert("delete_favorite".to_string(), "/loyalty/shoppinglist/DeleteBulkListItems".to_string());
        endpoints.insert("delete_bulk_favorites".to_string(), "/loyalty/shoppinglist/DeleteBulkListItems".to_string());

        Self {
            meijer_client,
            endpoints,
        }
    }

    pub fn get(&self) -> Result<Vec<ListItem>> {
        if !self.meijer_client._ensure_authenticated() {
            return Err(anyhow!("Authentication required"));
        }

        let url = format!("{}{}",
            self.meijer_client.api_base_url(),
            self.endpoints.get("get_list").unwrap()
        );

        let mut headers = self.meijer_client._get_api_headers()?;
        // Use exact same Accept header as Python version
        headers.insert("Accept".to_string(), "application/meijer.shoppingList.ShoppingList-v1.0+json".to_string());

        let response = self.meijer_client._make_request("GET", &url, headers)?;

        if response.status().is_success() {
            let data: HashMap<String, Value> = response.json()?;

            let mut items = Vec::new();
            if let Some(list_items) = data.get("listItems").and_then(|v| v.as_array()) {
                for item_data in list_items {
                    if let Some(item_obj) = item_data.as_object() {
                        let mapped_data = self.map_api_response_to_listitem(item_obj)?;
                        items.push(mapped_data);
                    }
                }
            }

            Ok(items)
        } else if response.status().as_u16() == 401 {
            Err(anyhow!("Authentication failed - token may be expired"))
        } else if response.status().as_u16() == 404 {
            // List doesn't exist yet, return empty list
            Ok(Vec::new())
        } else {
            Err(anyhow!("API error {}: {}", response.status(), response.text()?))
        }
    }

    pub fn get_filtered(&self, completed: bool, pending: bool) -> Result<Vec<ListItem>> {
        let items = self.get()?;

        let filtered_items: Vec<ListItem> = if completed && !pending {
            items.into_iter().filter(|item| item.is_complete).collect()
        } else if pending && !completed {
            items.into_iter().filter(|item| !item.is_complete).collect()
        } else {
            items
        };

        Ok(filtered_items)
    }

    pub fn add(&self, item_name: &str, quantity: i32, notes: Option<&str>) -> Result<bool> {
        // Generate a simple UPC from the item name hash (like Python version)
        let hash_value = self.calculate_hash(item_name);
        let upc = format!("ITEM_{}", hash_value % 10000);
        
        self.add_item_with_details(
            &upc,
            quantity,
            Some(item_name),
            notes,
            1,
        )
    }

    pub fn add_item_with_details(
        &self,
        upc: &str,
        quantity: i32,
        description: Option<&str>,
        notes: Option<&str>,
        display_order: i32,
    ) -> Result<bool> {
        let url = format!("{}{}", 
            self.meijer_client.api_base_url(), 
            self.endpoints.get("add_item").unwrap()
        );

        let mut headers = self.meijer_client._get_api_headers()?;
        headers.insert("Content-Type".to_string(), "application/vnd.meijer.listManagement.list-v1.0+json".to_string());
        headers.insert("Accept".to_string(), "application/vnd.meijer.listManagement.list-v1.0+json".to_string());

        // Create request body matching Python structure
        let data = serde_json::json!({
            "listItems": [{
                "listItemId": 0,
                "itemDescription": description.unwrap_or(&format!("Product {}", upc)),
                "quantity": quantity,
                "itemPartNumber": upc,
                "listItemTypeId": 1,
                "itemDisplayOrder": display_order,
                "storeId": null,
                "notes": notes,
                "isComplete": false,
                "isFavorite": false,
                "listingId": null,
                "promotionStart": null,
                "promotionEnd": null,
                "couponId": null
            }]
        });

        let response = self.meijer_client._make_request_with_json("POST", &url, headers, Some(data))?;

        Ok(response.status().as_u16() == 200 || response.status().as_u16() == 201)
    }

    fn calculate_hash(&self, s: &str) -> u64 {
        // Simple hash function to mimic Python's hash() behavior
        let mut hash = 0u64;
        for byte in s.bytes() {
            hash = hash.wrapping_mul(31).wrapping_add(byte as u64);
        }
        hash
    }

    pub fn clear_completed(&self) -> Result<bool> {
        // Get current items
        let items = self.get()?;
        let completed_items: Vec<_> = items.into_iter().filter(|item| item.is_complete).collect();
        
        if completed_items.is_empty() {
            println!("ℹ️ No completed items to clear");
            return Ok(true);
        }
        
        println!("🗑️ Clearing {} completed items...", completed_items.len());
        
        // Delete each completed item
        let mut deleted_count = 0;
        for item in completed_items {
            if self.delete_item(&item.list_item_id.to_string())? {
                deleted_count += 1;
            }
        }
        
        println!("✅ Cleared {} completed items", deleted_count);
        Ok(deleted_count > 0)
    }

    pub fn clear_list(&self) -> Result<bool> {
        // Try bulk delete first
        let url = format!("{}{}", 
            self.meijer_client.api_base_url(), 
            self.endpoints.get("delete_all").unwrap()
        );

        let mut headers = self.meijer_client._get_api_headers()?;
        headers.insert("Content-Type".to_string(), "application/vnd.meijer.listManagement.list-v1.0+json".to_string());
        headers.insert("Accept".to_string(), "application/vnd.meijer.listManagement.list-v1.0+json".to_string());

        let response = self.meijer_client._make_request("DELETE", &url, headers)?;

        if response.status().as_u16() == 200 {
            println!("✅ Successfully cleared all items using bulk delete");
            return Ok(true);
        }

        // Fallback to individual deletion
        println!("⚠️ Bulk delete failed, falling back to individual deletion...");
        let items = self.get()?;
        let mut deleted_count = 0;
        
        for item in items {
            if self.delete_item(&item.list_item_id.to_string())? {
                deleted_count += 1;
            }
        }
        
        println!("✅ Cleared {} items using individual deletion", deleted_count);
        Ok(deleted_count > 0)
    }

    pub fn delete_item(&self, item_id: &str) -> Result<bool> {
        let url = format!("{}/loyalty/shoppinglist/DeleteListItem/{}", 
            self.meijer_client.api_base_url(), 
            item_id
        );

        let headers = self.meijer_client._get_api_headers()?;
        let response = self.meijer_client._make_request("DELETE", &url, headers)?;

        Ok(response.status().as_u16() == 200)
    }

    pub fn get_favorites(&self) -> Result<Vec<ListItem>> {
        let url = format!("{}{}", 
            self.meijer_client.api_base_url(), 
            self.endpoints.get("get_favorites").unwrap()
        );

        let mut headers = self.meijer_client._get_api_headers()?;
        headers.insert("Accept".to_string(), "application/vnd.meijer.favorites-v1.0+json".to_string());

        let response = self.meijer_client._make_request("GET", &url, headers)?;

        if response.status().is_success() {
            let data: HashMap<String, Value> = response.json()?;
            
            let mut items = Vec::new();
            if let Some(favorite_items) = data.get("favoriteListItems").and_then(|v| v.as_array()) {
                for item_data in favorite_items {
                    if let Some(item_obj) = item_data.as_object() {
                        let mapped_data = self.map_api_response_to_listitem(item_obj)?;
                        items.push(mapped_data);
                    }
                }
            }
            
            Ok(items)
        } else {
            println!("❌ Failed to get favorites: {}", response.status());
            Ok(Vec::new())
        }
    }

    fn map_api_response_to_listitem(&self, item_data: &Map<String, Value>) -> Result<ListItem> {
        // Mapping from API response keys to ListItem constructor parameters
        let list_item_id = item_data.get("listItemId")
            .and_then(|v| v.as_i64())
            .unwrap_or(0) as i32;

        let list_item_type_id = item_data.get("listItemTypeId")
            .and_then(|v| v.as_i64())
            .unwrap_or(1) as i32;

        let item_display_order = item_data.get("itemDisplayOrder")
            .and_then(|v| v.as_i64())
            .unwrap_or(1) as i32;

        let item_part_number = item_data.get("itemPartNumber")
            .and_then(|v| v.as_str())
            .map(|s| s.to_string());

        let item_description = item_data.get("itemDescription")
            .and_then(|v| v.as_str())
            .unwrap_or("Unknown Item")
            .to_string();

        let quantity = item_data.get("quantity")
            .and_then(|v| v.as_i64())
            .unwrap_or(1) as i32;

        let store_id = item_data.get("storeId")
            .and_then(|v| v.as_i64())
            .unwrap_or(0) as i32;

        let notes = item_data.get("notes")
            .and_then(|v| v.as_str())
            .map(|s| s.to_string());

        let is_complete = item_data.get("isComplete")
            .and_then(|v| v.as_bool())
            .unwrap_or(false);

        let is_favorite = item_data.get("isFavorite")
            .and_then(|v| v.as_bool())
            .unwrap_or(false);

        let listing_id = item_data.get("listingId")
            .and_then(|v| v.as_str())
            .map(|s| s.to_string());

        let coupon_id = item_data.get("couponId")
            .and_then(|v| v.as_i64())
            .unwrap_or(0) as i32;

        Ok(ListItem {
            list_item_id,
            list_item_type_id,
            item_display_order,
            item_part_number,
            item_description,
            quantity,
            store_id,
            notes,
            is_complete,
            is_favorite,
            listing_id,
            promotion_start: None, // TODO: Parse promotion dates
            promotion_end: None,   // TODO: Parse promotion dates
            coupon_id,
            raw_data: Some(item_data.clone()),
        })
    }
}
