# Documentation functionality for Meijer API Client
# Documentation generation and serving with Sphinx

.PHONY: docs
docs: ${VENV}
	@echo "📚 Generating documentation with Sphinx..."
	@${VENV}/bin/sphinx-build -b html docs docs/_build/html
	@echo "✅ Documentation generated in docs/_build/html/ directory"

.PHONY: docs-serve
docs-serve: docs
	@echo "🌐 Serving documentation locally..."
	@echo "📖 Open http://localhost:8000 in your browser"
	@echo "⏹️  Press Ctrl+C to stop"
	@cd docs/_build/html && ${VENV}/bin/python -m http.server 8000

.PHONY: docs-clean
docs-clean:
	@echo "🧹 Cleaning documentation build artifacts..."
	@rm -rf docs/_build/
	@echo "✅ Documentation build artifacts cleaned"

.PHONY: docs-rebuild
docs-rebuild: docs-clean docs
	@echo "🔄 Documentation rebuilt successfully"

.PHONY: docs-deploy
docs-deploy: docs
	@echo "🚀 Deploying documentation to GitHub Pages..."
	@./tools/deploy_docs.sh

.PHONY: docs-validate
docs-validate:
	@echo "🔍 Validating documentation standards..."
	@${VENV}/bin/sphinx-build -b linkcheck docs docs/_build/linkcheck
	@echo "✅ Documentation validation completed"

.PHONY: docs-autobuild
docs-autobuild: ${VENV}
	@echo "🔄 Starting Sphinx autobuild for live documentation updates..."
	@echo "📖 Open http://localhost:8000 in your browser"
	@echo "⏹️  Press Ctrl+C to stop"
	@${VENV}/bin/sphinx-autobuild docs docs/_build/html --host 0.0.0.0 --port 8000
