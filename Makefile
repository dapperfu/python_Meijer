
# Python Bits
VENV?=venv38

.PHONY: venv
venv: ${VENV}

${VENV}:
	@python3.8 -mvenv ${@}
	@${VENV}/bin/pip install --upgrade pip setuptools wheel
	@${VENV}/bin/pip install --upgrade --requirement requirements.txt

.PHONY: notebook
notebook:
	@${VENV}/bin/jupyter-notebook

## Make Documentation
# Generate the README from the Jupyter Notebook.
README.md: README.ipynb
	jupyter-nbconvert --ExecutePreprocessor.timeout=600 --execute --to markdown --output=${@} ${<}

.PHONY: clean.docs
clean.docs:
	rm -rf docs

# All other documents.
IPYNB:=$(wildcard *.ipynb)
MD:=$(patsubst %.ipynb,docs/markdown/%.md,${IPYNB})
PDF:=$(patsubst %.ipynb,docs/pdf/%.pdf,${IPYNB})
HTML:=$(patsubst %.ipynb,docs/html/%.html,${IPYNB})
.PHONY: docs
docs: ${MD} ${PDF} ${HTML}

docs/markdown/%.md: %.ipynb
	mkdir -p `dirname ${@}`
	jupyter-nbconvert --ExecutePreprocessor.timeout=600 --execute --to markdown --output=${@} ${<}

docs/pdf/%.pdf: %.ipynb
	mkdir -p `dirname ${@}`
	-jupyter-nbconvert --ExecutePreprocessor.timeout=600 --execute --to pdf --output=${@} ${<}

docs/html/%.html: %.ipynb
	mkdir -p `dirname ${@}`
	jupyter-nbconvert --ExecutePreprocessor.timeout=600 --execute --to html --output=${@} ${<}
