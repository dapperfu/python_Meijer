# Requirements Management with Doorstop
# This makefile provides targets for managing requirements using doorstop

# Doorstop configuration
DOORSTOP_PREFIX?=SYS
DOORSTOP_PATH?=./reqs

# Requirements management targets
.PHONY: reqs-init reqs-add reqs-edit reqs-validate reqs-export reqs-publish reqs-tree reqs-help

# Initialize doorstop structure (one-time setup)
reqs-init:
	@echo "🚀 Initializing Doorstop Requirements Management"
	@echo "================================================"
	@echo "Creating document hierarchy: SYS → SRS → TEST"
	@echo ""
	@if [ ! -d "./reqs" ]; then \
		mkdir -p ./reqs; \
		echo "Created reqs/ directory"; \
	fi
	@if [ ! -d "./reqs/sys" ]; then \
		${VENV}/bin/doorstop create SYS ./reqs/sys; \
		echo "Created SYS document"; \
	fi
	@if [ ! -d "./reqs/srs" ]; then \
		${VENV}/bin/doorstop create SRS ./reqs/srs --parent SYS; \
		echo "Created SRS document"; \
	fi
	@if [ ! -d "./reqs/test" ]; then \
		${VENV}/bin/doorstop create TEST ./reqs/test --parent SRS; \
		echo "Created TEST document"; \
	fi
	@echo ""
	@echo "✅ Doorstop structure initialized!"
	@echo "📁 Requirements stored in: ./reqs/"
	@echo "📋 Document hierarchy: SYS → SRS → TEST"
	@echo ""
	@echo "Next steps:"
	@echo "  make reqs-add     - Add new requirement"
	@echo "  make reqs-tree    - View document tree"
	@echo "  make reqs-help    - Show all requirements commands"

# Add new requirement (interactive)
reqs-add:
	@echo "📝 Adding new requirement to ${DOORSTOP_PREFIX} document"
	@echo "Available documents: SYS, SRS, TEST"
	@echo ""
	@read -p "Enter document prefix (SYS/SRS/TEST) [${DOORSTOP_PREFIX}]: " prefix; \
	prefix=$${prefix:-${DOORSTOP_PREFIX}}; \
	${VENV}/bin/doorstop add $$prefix

# Edit requirements (opens editor)
reqs-edit:
	@echo "✏️  Opening requirements editor"
	@echo "Available documents: SYS, SRS, TEST"
	@echo ""
	@read -p "Enter document prefix (SYS/SRS/TEST) [${DOORSTOP_PREFIX}]: " prefix; \
	prefix=$${prefix:-${DOORSTOP_PREFIX}}; \
	${VENV}/bin/doorstop edit $$prefix

# Validate requirement links and consistency
reqs-validate:
	@echo "🔍 Validating requirements links and consistency"
	@echo "================================================"
	@${VENV}/bin/doorstop validate --all
	@echo ""
	@echo "✅ Validation complete!"

# Export requirements to various formats
reqs-export:
	@echo "📤 Exporting requirements"
	@echo "========================"
	@echo "Available formats: html, markdown, csv, yaml"
	@echo ""
	@read -p "Enter format (html/markdown/csv/yaml) [html]: " format; \
	format=$${format:-html}; \
	read -p "Enter document prefix (SYS/SRS/TEST/all) [all]: " prefix; \
	prefix=$${prefix:-all}; \
	if [ "$$prefix" = "all" ]; then \
		${VENV}/bin/doorstop publish --all --format $$format --output ./reqs/export/; \
	else \
		${VENV}/bin/doorstop publish $$prefix --format $$format --output ./reqs/export/; \
	fi
	@echo ""
	@echo "✅ Export complete! Files saved to ./reqs/export/"

# Generate and publish requirement docs
reqs-publish:
	@echo "📚 Publishing requirements documentation"
	@echo "======================================="
	@mkdir -p ./reqs/export
	@${VENV}/bin/doorstop publish --all --format html --output ./reqs/export/
	@${VENV}/bin/doorstop publish --all --format markdown --output ./reqs/export/
	@echo ""
	@echo "✅ Documentation published to ./reqs/export/"
	@echo "📄 HTML: ./reqs/export/index.html"
	@echo "📄 Markdown: ./reqs/export/index.md"

# View document tree structure
reqs-tree:
	@echo "🌳 Requirements Document Tree"
	@echo "============================"
	@${VENV}/bin/doorstop tree
	@echo ""
	@echo "📋 Document hierarchy:"
	@echo "  SYS  - System Requirements"
	@echo "  SRS  - Software Requirements (child of SYS)"
	@echo "  TEST - Test Cases (child of SRS)"

# Show help for requirements management
reqs-help:
	@echo "📋 Requirements Management Commands"
	@echo "=================================="
	@echo ""
	@echo "🚀 Setup:"
	@echo "  make reqs-init     - Initialize doorstop structure (one-time)"
	@echo ""
	@echo "📝 Management:"
	@echo "  make reqs-add      - Add new requirement (interactive)"
	@echo "  make reqs-edit     - Edit requirements (opens editor)"
	@echo "  make reqs-validate - Validate requirement links"
	@echo ""
	@echo "📤 Export & Publish:"
	@echo "  make reqs-export   - Export to HTML/Markdown/CSV/YAML"
	@echo "  make reqs-publish  - Generate and publish requirement docs"
	@echo ""
	@echo "📊 Information:"
	@echo "  make reqs-tree     - View document tree structure"
	@echo "  make reqs-help     - Show this help"
	@echo ""
	@echo "📁 Requirements stored in: ./reqs/"
	@echo "📋 Document hierarchy: SYS → SRS → TEST"
	@echo ""
	@echo "💡 Quick start:"
	@echo "  1. make reqs-init"
	@echo "  2. make reqs-add"
	@echo "  3. make reqs-tree"
