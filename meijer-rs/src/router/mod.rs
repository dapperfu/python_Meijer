use crate::cli::{Cli, Commands, ListCommands};
use crate::commands::list::*;
use anyhow::Result;

pub fn route_commands(cli: Cli) -> Result<()> {
    match cli.command {
        Commands::List { command } => match command {
            ListCommands::Show { completed, pending } => {
                handle_show(completed, pending)
            }
            ListCommands::Add { item_name, quantity, notes } => {
                handle_add(item_name, quantity, notes)
            }
            ListCommands::Clear => {
                handle_clear()
            }
            ListCommands::Clearall => {
                handle_clearall()
            }
            ListCommands::Defrag => {
                handle_defrag()
            }
            ListCommands::Estimate => {
                handle_estimate()
            }
            ListCommands::Export { output } => {
                handle_export(output)
            }
            ListCommands::Favorites => {
                handle_favorites()
            }
            ListCommands::Import { file_path } => {
                handle_import(file_path)
            }
            ListCommands::Interactive => {
                handle_interactive()
            }
        },
    }
}
