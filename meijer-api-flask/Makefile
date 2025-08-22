# Meijer API Flask Server Makefile

.PHONY: help install run test clean docker-build docker-run docker-stop

# Default target
help:
	@echo "Available commands:"
	@echo "  install      - Install Python dependencies"
	@echo "  run          - Run the Flask server in development mode"
	@echo "  test         - Run the test suite"
	@echo "  clean        - Clean up Python cache files"
	@echo "  docker-build - Build Docker image"
	@echo "  docker-run   - Run with Docker Compose"
	@echo "  docker-stop  - Stop Docker Compose services"

# Install dependencies
install:
	pip install -r requirements.txt

# Run the server
run:
	python app.py

# Run tests
test:
	python test_server.py

# Clean up
clean:
	find . -type f -name "*.pyc" -delete
	find . -type d -name "__pycache__" -delete
	find . -type f -name "*.pyo" -delete
	find . -type f -name "*.pyd" -delete
	find . -type f -name ".coverage" -delete
	find . -type d -name "*.egg-info" -exec rm -rf {} +
	find . -type d -name ".pytest_cache" -exec rm -rf {} +

# Docker commands
docker-build:
	docker build -t meijer-api-flask .

docker-run:
	docker-compose up -d

docker-stop:
	docker-compose down

docker-logs:
	docker-compose logs -f meijer-api

# Development helpers
format:
	black app.py test_server.py

lint:
	flake8 app.py test_server.py

# Quick start
start: install run

# Quick start with Docker
start-docker: docker-build docker-run
