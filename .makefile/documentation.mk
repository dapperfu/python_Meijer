# Documentation functionality for Meijer API Client
# Documentation generation and serving

.PHONY: docs
docs:
	@echo "📚 Generating documentation with pdoc..."
	@${VENV}/bin/pdoc -o docs meijer/
	@echo "✅ Documentation generated in docs/ directory"

.PHONY: docs-serve
docs-serve:
	@echo "🌐 Serving documentation locally..."
	@echo "📖 Open http://localhost:9999 in your browser"
	@echo "⏹️  Press Ctrl+C to stop"
	@${VENV}/bin/pdoc -p 9999 meijer/

.PHONY: docs-deploy
docs-deploy:
	@echo "🚀 Deploying documentation to GitHub Pages..."
	@./tools/deploy_docs.sh

.PHONY: docs-validate
docs-validate:
	@echo "🔍 Validating documentation standards..."
	@${VENV}/bin/python tools/doc_validator.py --verbose
