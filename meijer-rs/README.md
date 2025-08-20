# Meijer-RS

🛒 Rust implementation of the Meijer CLI tool, providing 1:1 feature compatibility with the Python version.

## Status

This is the initial implementation focusing on the `meijer list show` command. Other subcommands will be implemented in future iterations.

## Features

- **Shopping List Management**: View shopping list items with filtering options
- **CLI Interface**: Clean, intuitive command-line interface using Clap
- **Cross-Platform**: Built with Rust for performance and reliability

## Commands

### Shopping List Commands

```bash
# Show all shopping list items
meijer-rs list show

# Show only completed items
meijer-rs list show --completed

# Show only pending items
meijer-rs list show --pending
```

## Building

```bash
# Build the project
cargo build

# Build optimized release version
cargo build --release

# Run tests
cargo test
```

## Running

```bash
# Run from source
cargo run -- list show

# Run built binary
./target/debug/meijer-rs list show
```

## Project Structure

```
src/
├── main.rs          # CLI entry point and command handling
├── auth.rs          # Authentication and token management
├── client.rs        # Main Meijer API client
├── models.rs        # Data structures and models
└── shopping_list.rs # Shopping list operations
```

## Dependencies

- **clap**: CLI framework with derive macros
- **reqwest**: HTTP client for API calls
- **serde**: Serialization/deserialization
- **tracing**: Logging and diagnostics
- **chrono**: Date and time handling
- **tabled**: Table formatting for output

## Development

This project follows Rust best practices:

- Full type safety with comprehensive error handling
- Modular architecture for easy extension
- Comprehensive testing (coming soon)
- Performance-focused design

## Roadmap

- [x] Basic CLI structure
- [x] `meijer list show` command
- [x] Sample data display
- [ ] Authentication implementation
- [ ] Real API integration
- [ ] Additional list commands (add, remove, complete)
- [ ] Coupon management
- [ ] Product search
- [ ] Store information
- [ ] Cart operations

## Contributing

This is a dual-path implementation alongside the Python version. All changes should maintain 1:1 feature compatibility.
