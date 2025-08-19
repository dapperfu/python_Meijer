# Development Sub-Makefile
# Contains targets for virtual environment, notebooks, and demos

.PHONY: venv
venv: ${VENV}

${VENV}:
	@python3 -mvenv ${@}
	@${VENV}/bin/pip install --upgrade pip setuptools wheel
	@${VENV}/bin/pip install --upgrade --requirement requirements.txt

.PHONY: notebook
notebook:
	@${VENV}/bin/jupyter-notebook

.PHONY: notebooks-gen
notebooks-gen:
	@echo "📚 Generating all notebooks from Python generators..."
	@echo "=================================================="
	@cd notebooks && \
	for gen_file in *_notebook_gen.py; do \
		echo "🔧 Generating from $$gen_file..."; \
		../venv/bin/python "$$gen_file"; \
	done
	@echo "✅ All notebooks generated successfully!"

.PHONY: notebooks-gen-execute
notebooks-gen-execute:
	@echo "🚀 Generating and executing all notebooks..."
	@echo "============================================="
	@$(MAKE) notebooks-gen
	@echo ""
	@$(MAKE) notebooks-execute

.PHONY: notebooks-execute
notebooks-execute:
	@echo "🚀 Executing all notebooks in-place..."
	@echo "======================================"
	@cd notebooks && \
	for notebook in *.ipynb; do \
		if [ -f "$$notebook" ]; then \
			echo "▶️  Executing $$notebook..."; \
			../venv/bin/jupyter nbconvert --to notebook --execute --inplace "$$notebook"; \
		fi; \
	done
	@echo "✅ All notebooks executed successfully!"

.PHONY: demos
demos: ${VENV}
	@echo "🚀 Running all demos in demos/ directory..."
	@echo "=============================================="
	@echo "💡 This will execute all Python demo scripts and report any errors or warnings"
	@echo ""
	@./demos/run_all_demos.sh
