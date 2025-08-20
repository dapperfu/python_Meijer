use clap::{Parser, Subcommand};

#[derive(Parser)]
#[command(name = "meijer-rs")]
#[command(about = "🛒 Meijer Shopping List CLI Tool (Rust Implementation)")]
#[command(version = "1.0.0")]
#[command(propagate_version = true)]
pub struct Cli {
    #[command(subcommand)]
    pub command: Commands,
}

#[derive(Subcommand)]
pub enum Commands {
    /// Manage shopping list operations
    List {
        #[command(subcommand)]
        command: ListCommands,
    },
}

#[derive(Subcommand)]
pub enum ListCommands {
    /// Show shopping list items
    Show {
        /// Show only completed items
        #[arg(long)]
        completed: bool,
        /// Show only pending items
        #[arg(long)]
        pending: bool,
    },
    /// Add item(s) to shopping list
    Add {
        /// Name/description of the item to add
        item_name: String,
        /// Quantity to add
        #[arg(default_value = "1")]
        quantity: i32,
        /// Optional notes for the item
        #[arg(long)]
        notes: Option<String>,
    },
    /// Clear completed items from shopping list
    Clear,
    /// Clear all items from shopping list (completed and pending)
    Clearall,
    /// Defragment shopping list by organizing items by aisle
    Defrag,
    /// Estimate cost of shopping list items
    Estimate,
    /// Export shopping list to a file
    Export {
        /// Output file path
        #[arg(long)]
        output: Option<String>,
    },
    /// Show favorite items
    Favorites,
    /// Import shopping list from a file
    Import {
        /// Input file path
        file_path: String,
    },
    /// Interactive shopping list management
    Interactive,
}
