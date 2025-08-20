use clap::{Parser, Subcommand};
use std::process;

mod auth;
mod client;
mod models;
mod shopping_list;

#[derive(Parser)]
#[command(name = "meijer-rs")]
#[command(about = "🛒 Meijer Shopping List CLI Tool (Rust Implementation)")]
#[command(version = "1.0.0")]
#[command(propagate_version = true)]
struct Cli {
    #[command(subcommand)]
    command: Commands,
}

#[derive(Subcommand)]
enum Commands {
    /// Manage shopping list operations
    List {
        #[command(subcommand)]
        command: ListCommands,
    },
}

#[derive(Subcommand)]
enum ListCommands {
    /// Show shopping list items
    Show {
        /// Show only completed items
        #[arg(long)]
        completed: bool,
        /// Show only pending items
        #[arg(long)]
        pending: bool,
    },
}

fn main() {
    let cli = Cli::parse();

    let result = match &cli.command {
        Commands::List { command } => match command {
            ListCommands::Show { completed, pending } => {
                handle_list_show(*completed, *pending)
            }
        },
    };

    if let Err(e) = result {
        eprintln!("❌ Error: {}", e);
        process::exit(1);
    }
}

fn handle_list_show(completed: bool, pending: bool) -> Result<(), Box<dyn std::error::Error>> {
    // Create client and shopping list
    let client = client::MeijerClient::new();
    let shopping_list = shopping_list::MeijerList::new(client);
    
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
