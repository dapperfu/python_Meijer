use std::process;
use clap::Parser;

mod auth;
mod client;
mod cli;
mod commands;
mod models;
mod router;
mod shopping_list;

fn main() {
    let cli = cli::Cli::parse();

    let result = router::route_commands(cli);

    if let Err(e) = result {
        eprintln!("❌ Error: {}", e);
        process::exit(1);
    }
}
