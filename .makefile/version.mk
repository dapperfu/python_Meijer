# Version management functionality for Meijer API Client
# Version information and tagging

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
	$(eval CURRENT_TAG := $(shell git describe --tags --abbrev=0 2>/dev/null || echo "0.0.0")) \
	$(eval MAJOR := $(shell echo $(CURRENT_TAG) | cut -d. -f1 | sed 's/v//')) \
	$(eval MINOR := $(shell echo $(CURRENT_TAG) | cut -d. -f2)) \
	$(eval PATCH := $(shell echo $(CURRENT_TAG) | cut -d. -f3)) \
	$(eval NEW_TAG := $(shell case $(TYPE) in \
		patch) echo "v$${MAJOR}.$${MINOR}.$$(($${PATCH}+1))" ;; \
		minor) echo "v$${MAJOR}.$$(($${MINOR}+1)).0" ;; \
		major) echo "v$$(($${MAJOR}+1)).0.0" ;; \
	esac)) \
	echo "📋 Version: $(CURRENT_TAG) → $(NEW_TAG)"; \
	echo "💡 Run: git tag $(NEW_TAG) && git push --tags"
