use crate::client::MeijerClient;
use crate::shopping_list::MeijerList;
use anyhow::Result;

pub fn handle_show(completed: bool, pending: bool) -> Result<()> {
    // Create client and shopping list
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    // Get filtered items
    let items = shopping_list.get_filtered(completed, pending)?;
    
    if items.is_empty() {
        println!("📝 Your shopping list is empty!");
        return Ok(());
    }
    
    // Display items
    let title = if completed && !pending {
        "Completed Items"
    } else if pending && !completed {
        "Pending Items"
    } else {
        "Shopping List"
    };
    
    println!("\n{} ({} items):", title, items.len());
    println!("{}", "─".repeat(50));
    
    for (i, item) in items.iter().enumerate() {
        let status = if item.is_complete { "✅" } else { "⭕" };
        let quantity = if item.quantity > 1 { format!(" (x{})", item.quantity) } else { String::new() };
        let notes = item.notes.as_ref().map(|n| format!(" - {}", n)).unwrap_or_default();
        
        println!("{}. {} {}{}{}", i + 1, status, item.name(), quantity, notes);
    }
    
    // Show summary
    let total = items.len();
    let completed_count = items.iter().filter(|item| item.is_complete).count();
    let pending_count = total - completed_count;
    
    println!("\n📊 Summary: {} total, {} completed, {} pending", total, completed_count, pending_count);
    
    Ok(())
}

pub fn handle_add(item_name: String, quantity: i32, notes: Option<String>) -> Result<()> {
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    println!("➕ Adding item: {} (quantity: {})", item_name, quantity);
    if let Some(ref note) = notes {
        println!("   Notes: {}", note);
    }
    
    // Add the item using the shopping list API
    let success = shopping_list.add(&item_name, quantity, notes.as_deref())?;
    
    if success {
        println!("✅ Successfully added '{}' to shopping list!", item_name);
    } else {
        println!("❌ Failed to add '{}' to shopping list", item_name);
        return Err(anyhow::anyhow!("Failed to add item to shopping list"));
    }
    
    Ok(())
}

pub fn handle_clear() -> Result<()> {
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    println!("🧹 Clearing completed items from shopping list...");
    
    let success = shopping_list.clear_completed()?;
    
    if success {
        println!("✅ Successfully cleared completed items from shopping list!");
    } else {
        println!("❌ Failed to clear completed items");
        return Err(anyhow::anyhow!("Failed to clear completed items"));
    }
    
    Ok(())
}

pub fn handle_clearall() -> Result<()> {
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    println!("🗑️ Clearing all items from shopping list...");
    
    let success = shopping_list.clear_list()?;
    
    if success {
        println!("✅ Successfully cleared all items from shopping list!");
    } else {
        println!("❌ Failed to clear all items");
        return Err(anyhow::anyhow!("Failed to clear all items"));
    }
    
    Ok(())
}

pub fn handle_defrag() -> Result<()> {
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    // TODO: Implement defrag functionality
    println!("🔧 Defragmenting shopping list by organizing items by aisle...");
    println!("🔄 Defrag functionality coming soon!");
    
    Ok(())
}

pub fn handle_estimate() -> Result<()> {
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    // TODO: Implement cost estimation functionality
    println!("💰 Estimating cost of shopping list items...");
    println!("🔄 Cost estimation functionality coming soon!");
    
    Ok(())
}

pub fn handle_export(output: Option<String>) -> Result<()> {
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    // TODO: Implement export functionality
    let output_path = output.unwrap_or_else(|| "shopping_list_export.json".to_string());
    println!("📤 Exporting shopping list to: {}", output_path);
    println!("🔄 Export functionality coming soon!");
    
    Ok(())
}

pub fn handle_favorites() -> Result<()> {
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    println!("⭐ Getting favorite items...");
    
    let favorites = shopping_list.get_favorites()?;
    
    if favorites.is_empty() {
        println!("📝 You have no favorite items!");
        return Ok(());
    }
    
    println!("\n⭐ Favorite Items ({} items):", favorites.len());
    println!("{}", "─".repeat(50));
    
    for (i, item) in favorites.iter().enumerate() {
        let quantity = if item.quantity > 1 { format!(" (x{})", item.quantity) } else { String::new() };
        let notes = item.notes.as_ref().map(|n| format!(" - {}", n)).unwrap_or_default();
        
        println!("{}. ⭐ {}{}{}", i + 1, item.name(), quantity, notes);
    }
    
    println!("\n📊 Total favorites: {}", favorites.len());
    
    Ok(())
}

pub fn handle_import(file_path: String) -> Result<()> {
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    // TODO: Implement import functionality
    println!("📥 Importing shopping list from: {}", file_path);
    println!("🔄 Import functionality coming soon!");
    
    Ok(())
}

pub fn handle_interactive() -> Result<()> {
    let client = MeijerClient::new();
    let shopping_list = MeijerList::new(client);
    
    // TODO: Implement interactive functionality
    println!("🎮 Starting interactive shopping list management...");
    println!("🔄 Interactive functionality coming soon!");
    
    Ok(())
}
