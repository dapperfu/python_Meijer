
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
	@mitmdump --mode wireguard -w meijer_mitm.log -s shop_n_scan_faker.py &
	@sleep 2
	@python meijer_cli.py auth meijer_mitm.log
	# rm meijer_mitm.log