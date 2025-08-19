#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create setup.py for CLI tool installation
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python setup.py with entry points
 * - Dependencies: click, meijer package, tabulate
 */

Setup configuration for Meijer CLI Tool
"""

from setuptools import find_packages, setup

# Read the README file
with open("README.md", "r", encoding="utf-8") as fh:
    long_description = fh.read()

# Read requirements
with open("requirements.txt", "r", encoding="utf-8") as fh:
    requirements = [
        line.strip() for line in fh if line.strip() and not line.startswith("#")
    ]

setup(
    name="meijer-cli",
    version="1.0.0",
    author="Claude Sonnet 4",
    author_email="claude@anthropic.com",
    description="A comprehensive CLI tool for managing Meijer shopping lists",
    long_description=long_description,
    long_description_content_type="text/markdown",
    url="https://github.com/dapperfu/python_Meijer",
    packages=find_packages(),
    classifiers=[
        "Development Status :: 4 - Beta",
        "Intended Audience :: End Users/Desktop",
        "Topic :: Office/Business",
        "License :: OSI Approved :: MIT License",
        "Programming Language :: Python :: 3",
        "Programming Language :: Python :: 3.8",
        "Programming Language :: Python :: 3.9",
        "Programming Language :: Python :: 3.10",
        "Programming Language :: Python :: 3.11",
        "Programming Language :: Python :: 3.12",
    ],
    python_requires=">=3.8",
    install_requires=[
        "click>=8.0.0",
        "tabulate>=0.9.0",
        "requests>=2.25.0",
        "urllib3>=1.26.0",
    ],
    extras_require={
        "dev": [
            "pytest>=6.0.0",
            "black>=21.0.0",
            "mypy>=0.910",
            "rich>=12.0.0",  # For interactive TUI
        ],
        "interactive": [
            "rich>=12.0.0",  # For interactive TUI mode
        ],
    },
    entry_points={
        "console_scripts": [
            "meijer=meijer.cli.main:cli",
        ],
    },
    keywords="meijer, shopping, list, cli, grocery, retail",
    project_urls={
        "Bug Reports": "https://github.com/dapperfu/python_Meijer/issues",
        "Source": "https://github.com/dapperfu/python_Meijer",
        "Documentation": "https://github.com/dapperfu/python_Meijer#readme",
    },
)
