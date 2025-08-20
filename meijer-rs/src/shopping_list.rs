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
