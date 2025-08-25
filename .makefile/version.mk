# Version management functionality for Meijer API Client
# Version information and tagging

.PHONY: version
version:
	@echo "📋 Current version information:"
	@echo "================================="
	@echo "Versioneer version: $(shell ${VENV}/bin/python -c "import meijer; print(meijer.__version__)" 2>/dev/null || echo "Not available")"
	@echo "Git tags: $(shell git describe --tags --abbrev=0 2>/dev/null || echo "No tags found")"
	@echo "Current commit: $(shell git rev-parse --short HEAD)"
	@echo ""
	@echo "💡 To bump version:"
	@echo "   1. git tag vX.Y.Z"
	@echo "   2. git push --tags"
	@echo "   3. Versioneer will automatically use the new version"

.PHONY: version-tag
version-tag:
	@if [ -z "$(TYPE)" ]; then \
		echo "❌ Error: TYPE parameter required"; \
		echo "💡 Usage: make version-tag TYPE=patch|minor|major"; \
		echo "   patch: 3.2.0 → 3.2.1 (bug fixes)"; \
		echo "   minor: 3.2.0 → 3.3.0 (new features)"; \
		echo "   major: 3.2.0 → 4.0.0 (breaking changes)"; \
		exit 1; \
	fi; \
	echo "🚀 Creating new version tag..."; \
	echo "💡 Current tag: $(shell git describe --tags --abbrev=0 2>/dev/null || echo "No tags found")"; \
	echo "💡 To create new tag, run: git tag vX.Y.Z && git push --tags"
