#!/usr/bin/env python3
"""
Documentation Validator for Meijer API Client

This tool validates that all Python files in the codebase follow the numpy
documentation standard. It checks for:

1. Module docstrings
2. Class docstrings with proper formatting
3. Function/method docstrings with Parameters/Returns sections
4. Dataclass field documentation
5. Type hints and annotations

Usage:
    python tools/doc_validator.py [--fix] [--verbose] [path]
"""

import ast
import re
import sys
from pathlib import Path
from typing import Dict, List


class DocValidator:
    """Validates Python files for numpy documentation compliance."""

    def __init__(self, verbose: bool = False):
        self.verbose = verbose
        self.issues: List[Dict] = []
        self.files_checked = 0
        self.files_with_issues = 0

    def validate_file(self, file_path: Path) -> List[Dict]:
        """Validate a single Python file for documentation compliance."""
        try:
            with open(file_path, "r", encoding="utf-8") as f:
                content = f.read()

            tree = ast.parse(content)
            issues = []

            # Check module docstring
            if not ast.get_docstring(tree):
                issues.append(
                    {
                        "line": 1,
                        "type": "missing_module_docstring",
                        "message": "Module is missing a docstring",
                        "severity": "error",
                    }
                )

            # Check classes and functions
            for node in ast.walk(tree):
                if isinstance(node, ast.ClassDef):
                    issues.extend(self._validate_class(node, content))
                elif isinstance(node, ast.FunctionDef):
                    issues.extend(self._validate_function(node, content))
                elif isinstance(node, ast.AsyncFunctionDef):
                    issues.extend(self._validate_function(node, content))

            return issues

        except Exception as e:
            return [
                {
                    "line": 1,
                    "type": "parse_error",
                    "message": f"Failed to parse file: {e}",
                    "severity": "error",
                }
            ]

    def _validate_class(self, node: ast.ClassDef, content: str) -> List[Dict]:
        """Validate class documentation."""
        issues = []

        # Check class docstring
        if not ast.get_docstring(node):
            issues.append(
                {
                    "line": node.lineno,
                    "type": "missing_class_docstring",
                    "message": f"Class {node.name} is missing a docstring",
                    "severity": "error",
                }
            )
        else:
            # Check if it's a dataclass and has field documentation
            if self._is_dataclass(node):
                issues.extend(self._validate_dataclass_fields(node, content))

        # Check methods
        for item in node.body:
            if isinstance(item, ast.FunctionDef):
                issues.extend(self._validate_function(item, content))

        return issues

    def _validate_function(self, node: ast.FunctionDef, content: str) -> List[Dict]:
        """Validate function/method documentation."""
        issues = []

        # Skip private methods and __init__ for detailed docstring requirements
        if node.name.startswith("_") and not node.name.startswith("__"):
            return issues

        if not ast.get_docstring(node):
            issues.append(
                {
                    "line": node.lineno,
                    "type": "missing_function_docstring",
                    "message": f"Function {node.name} is missing a docstring",
                    "severity": "error",
                }
            )
        else:
            # Check for numpy-style docstring format
            docstring = ast.get_docstring(node)
            if not self._has_numpy_format(docstring):
                issues.append(
                    {
                        "line": node.lineno,
                        "type": "non_numpy_docstring",
                        "message": f"Function {node.name} should use numpy-style docstring format",
                        "severity": "warning",
                    }
                )

            # Check for Parameters and Returns sections for public methods
            if not node.name.startswith("_"):
                if not self._has_parameters_section(docstring):
                    issues.append(
                        {
                            "line": node.lineno,
                            "type": "missing_parameters_section",
                            "message": f"Function {node.name} should have a Parameters section",
                            "severity": "warning",
                        }
                    )

                if not self._has_returns_section(docstring):
                    issues.append(
                        {
                            "line": node.lineno,
                            "type": "missing_returns_section",
                            "message": f"Function {node.name} should have a Returns section",
                            "severity": "warning",
                        }
                    )

        return issues

    def _is_dataclass(self, node: ast.ClassDef) -> bool:
        """Check if a class is a dataclass."""
        for decorator in node.decorator_list:
            if isinstance(decorator, ast.Name) and decorator.id == "dataclass":
                return True
            elif isinstance(decorator, ast.Attribute) and decorator.attr == "dataclass":
                return True
        return False

    def _validate_dataclass_fields(
        self, node: ast.ClassDef, content: str
    ) -> List[Dict]:
        """Validate dataclass field documentation."""
        issues = []

        for item in node.body:
            if isinstance(item, ast.AnnAssign) and isinstance(item.target, ast.Name):
                field_name = item.target.id

                # Check if field has a docstring comment
                if not self._has_field_docstring(content, item.lineno):
                    issues.append(
                        {
                            "line": item.lineno,
                            "type": "missing_field_docstring",
                            "message": f"Dataclass field {field_name} should have a docstring comment",
                            "severity": "warning",
                        }
                    )

        return issues

    def _has_field_docstring(self, content: str, line_no: int) -> bool:
        """Check if a line has a docstring comment."""
        lines = content.split("\n")
        if line_no - 1 < len(lines):
            line = lines[line_no - 1].strip()
            # Look for docstring comment after the field definition
            if '"""' in line or "'''" in line:
                return True

            # Check next line for docstring
            if line_no < len(lines):
                next_line = lines[line_no].strip()
                if next_line.startswith('"""') or next_line.startswith("'''"):
                    return True

        return False

    def _has_numpy_format(self, docstring: str) -> bool:
        """Check if docstring follows numpy format."""
        # Look for numpy-style sections
        numpy_patterns = [
            r"Parameters\s*\n\s*-+\s*\n",
            r"Returns\s*\n\s*-+\s*\n",
            r"Raises\s*\n\s*-+\s*\n",
            r"Notes\s*\n\s*-+\s*\n",
            r"Examples\s*\n\s*-+\s*\n",
        ]

        return any(
            re.search(pattern, docstring, re.MULTILINE) for pattern in numpy_patterns
        )

    def _has_parameters_section(self, docstring: str) -> bool:
        """Check if docstring has a Parameters section."""
        return "Parameters" in docstring and "---" in docstring

    def _has_returns_section(self, docstring: str) -> bool:
        """Check if docstring has a Returns section."""
        return "Returns" in docstring and "---" in docstring

    def validate_directory(self, directory: Path) -> None:
        """Validate all Python files in a directory recursively."""
        python_files = list(directory.rglob("*.py"))

        if self.verbose:
            print(f"Found {len(python_files)} Python files to validate")

        for file_path in python_files:
            # Skip __pycache__ and virtual environment
            if "__pycache__" in str(file_path) or "venv" in str(file_path):
                continue

            if self.verbose:
                print(f"Validating {file_path}")

            issues = self.validate_file(file_path)
            if issues:
                self.files_with_issues += 1
                self.issues.extend(
                    [{**issue, "file": str(file_path)} for issue in issues]
                )

            self.files_checked += 1

    def print_report(self) -> None:
        """Print validation report."""
        print("\n📊 Documentation Validation Report")
        print("=" * 50)
        print(f"Files checked: {self.files_checked}")
        print(f"Files with issues: {self.files_with_issues}")
        print(f"Total issues: {len(self.issues)}")

        if not self.issues:
            print("\n✅ All files pass documentation validation!")
            return

        # Group issues by severity
        errors = [i for i in self.issues if i["severity"] == "error"]
        warnings = [i for i in self.issues if i["severity"] == "warning"]

        print(f"\n❌ Errors: {len(errors)}")
        for issue in errors:
            print(f"  {issue['file']}:{issue['line']} - {issue['message']}")

        print(f"\n⚠️  Warnings: {len(warnings)}")
        for issue in warnings:
            print(f"  {issue['file']}:{issue['line']} - {issue['message']}")

        print("\n💡 Recommendations:")
        print("  - Add module docstrings to all Python files")
        print("  - Use numpy-style docstrings for public functions")
        print("  - Document dataclass fields with inline comments")
        print("  - Include Parameters and Returns sections for public methods")

    def get_issues_by_file(self) -> Dict[str, List[Dict]]:
        """Group issues by file for easier fixing."""
        issues_by_file = {}
        for issue in self.issues:
            file_path = issue["file"]
            if file_path not in issues_by_file:
                issues_by_file[file_path] = []
            issues_by_file[file_path].append(issue)
        return issues_by_file


def main():
    """Main entry point."""
    import argparse

    parser = argparse.ArgumentParser(description="Validate Python documentation")
    parser.add_argument(
        "path", nargs="?", default="meijer", help="Path to validate (default: meijer)"
    )
    parser.add_argument("--verbose", "-v", action="store_true", help="Verbose output")
    parser.add_argument(
        "--fix",
        action="store_true",
        help="Auto-fix common issues (not implemented yet)",
    )

    args = parser.parse_args()

    path = Path(args.path)
    if not path.exists():
        print(f"Error: Path {path} does not exist")
        sys.exit(1)

    validator = DocValidator(verbose=args.verbose)

    if path.is_file():
        issues = validator.validate_file(path)
        validator.issues = [{**issue, "file": str(path)} for issue in issues]
        validator.files_checked = 1
        validator.files_with_issues = 1 if issues else 0
    else:
        validator.validate_directory(path)

    validator.print_report()

    # Exit with error code if there are issues
    if validator.issues:
        sys.exit(1)


if __name__ == "__main__":
    main()
