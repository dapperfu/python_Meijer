# Version Management with Hatch
.PHONY: version
version:
	@echo "📋 Current version information:"
	@echo "================================="
	@echo "Git tags: $(shell git describe --tags --abbrev=0 2>/dev/null || echo "No tags found")"
	@echo "Current commit: $(shell git rev-parse --short HEAD)"
	@echo "Hatch version: $(shell ${VENV}/bin/hatch version 2>/dev/null || echo "Not available")"
	@echo ""
	@echo "💡 To bump version:"
	@echo "   1. git tag vX.Y.Z"
	@echo "   2. git push --tags"
	@echo "   3. Hatch will automatically use the new version"

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
	${VENV}/bin/python version_tag.py $(TYPE)
