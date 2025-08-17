
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
	@echo "🚀 Starting mitmweb with multiple listeners..."
	@echo "📱 Use the Meijer app while this is running"
	@echo "🌐 Web interface available at http://localhost:8081"
	@echo "🔌 SOCKS5 proxy available on 0.0.0.0:1080"
	@echo "🌍 HTTP proxy available on 0.0.0.0:8080"
	@echo "⏹️  Press Ctrl+C when done to extract auth and cleanup"
	@echo ""
	@mitmweb \
		--mode wireguard \
		--listen-host 0.0.0.0 \
		--listen-port 8080 \
		--socks5-listen-port 1080 \
		--socks5-listen-host 0.0.0.0 \
		-w meijer_mitm.log \
		-s shop_n_scan_faker.py \
		--set block_global=false || \
	(echo "" && \
	 echo "🔄 Extracting authentication tokens..." && \
	 python meijer_cli.py auth meijer_mitm.log && \
	 echo "🧹 Cleaning up log file..." && \
	 rm -f meijer_mitm.log && \
	 echo "✅ Authentication updated and log cleaned up!")