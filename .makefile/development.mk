# Development functionality for Meijer API Client
# Notebooks, demos, and development tools

.PHONY: notebook
notebook:
	@${VENV}/bin/jupyter-notebook

.PHONY: regenerate-notebooks
regenerate-notebooks: ${VENV}
	@echo "🔄 Regenerating all Jupyter notebooks from generation scripts..."
	@echo "================================================================"
	@echo "💡 This will run all *_notebook_gen.py scripts to create fresh notebooks"
	@echo ""
	@cd notebooks && ../venv/bin/python regenerate_all_notebooks.py

.PHONY: execute-notebooks
execute-notebooks: ${VENV}
	@echo "🚀 Executing all Jupyter notebooks to demonstrate functionality..."
	@echo "================================================================="
	@echo "💡 This will run all notebooks and show execution outputs"
	@echo ""
	@cd notebooks && ../venv/bin/python execute_notebooks.py

.PHONY: notebook-workflow
notebook-workflow: regenerate-notebooks execute-notebooks
	@echo "🎉 Complete notebook workflow finished!"
	@echo "📚 Notebooks regenerated and executed successfully"

.PHONY: demos
demos: ${VENV}
	@echo "🚀 Running all demos in demos/ directory..."
	@echo "=============================================="
	@echo "💡 This will execute all Python demo scripts and report any errors or warnings"
	@echo ""
	@./demos/run_all_demos.sh
