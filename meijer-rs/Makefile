# Makefile for meijer-rs project
# Simple targets for building and managing the Rust binary

# Binary name
BINARY_NAME = meijer-rs
BINARY_PATH = target/release/$(BINARY_NAME)
CURRENT_DIR = .

# Default target
all: build

# Build the project in release mode
build:
	cargo build --release

# Build and copy binary to current directory
install: build
	cp $(BINARY_PATH) $(CURRENT_DIR)/

# Clean build artifacts
clean:
	cargo clean
	rm -f $(CURRENT_DIR)/$(BINARY_NAME)

# Run tests
test:
	cargo test

# Check code without building
check:
	cargo check

# Format code
fmt:
	cargo fmt

# Lint code
clippy:
	cargo clippy

# Install dependencies
deps:
	cargo build

# Show project info
info:
	@echo "Binary: $(BINARY_NAME)"
	@echo "Target: $(BINARY_PATH)"
	@echo "Current dir: $(CURRENT_DIR)"

.PHONY: all build install clean test check fmt clippy deps info
