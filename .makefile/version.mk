# Version Management with Hatch
.PHONY: version
version:
	@echo "📋 Current version information:"
	@echo "================================="
	@echo "meijer/__init__.py: $(shell grep '__version__' meijer/__init__.py | sed 's/__version__ = //' | tr -d '"')"
	@echo "Hatch source: file (meijer/__init__.py)"
	@echo "Git tags: $(shell git describe --tags --abbrev=0 2>/dev/null || echo "No tags found")"
	@echo "Current commit: $(shell git rev-parse --short HEAD)"
	@echo ""
	@echo "💡 To bump version:"
	@echo "   make version-bump TYPE=patch|minor|major"

.PHONY: version-bump
version-bump:
	@if [ -z "$(TYPE)" ]; then \
		echo "❌ Error: TYPE parameter required"; \
		echo "💡 Usage: make version-bump TYPE=patch|minor|major"; \
		echo "   patch: 3.2.0 → 3.2.1 (bug fixes)"; \
		echo "   minor: 3.2.0 → 3.3.0 (new features)"; \
		echo "   major: 3.2.0 → 4.0.0 (breaking changes)"; \
		exit 1; \
	fi; \
	echo "🚀 Bumping version $(TYPE)..."; \
	${VENV}/bin/python version_bump.py $(TYPE)
