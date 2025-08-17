
# Python Bits
VENV?=venv

.PHONY: venv
venv: ${VENV}

${VENV}:
	@python3 -mvenv ${@}
	@${VENV}/bin/pip install --upgrade pip setuptools wheel
	@${VENV}/bin/pip install --upgrade --requirement requirements.txt

.PHONY: notebook
notebook:
	@${VENV}/bin/jupyter-notebook

.PHONY: log
log:
	@echo "🚀 Starting mitmdump in wireguard mode..."
	@echo "📱 Use the Meijer app while this is running"
	@echo "⏹️  Press Ctrl+C when done to extract auth and cleanup"
	@echo ""
	@mitmdump \
		--mode wireguard \
		-w meijer_mitm.log \
		-s shop_n_scan_faker.py \
		--set block_global=false || \
	(echo "" && \
	 echo "🔄 Extracting authentication tokens..." && \
	 python meijer_cli.py auth meijer_mitm.log && \
	 echo "🧹 Cleaning up log file..." && \
	 rm -f meijer_mitm.log && \
	 echo "✅ Authentication updated and log cleaned up!")