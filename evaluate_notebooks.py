#!/usr/bin/env python3
"""
Evaluate Jupyter notebooks for GitHub/nbviewer compatibility

This script checks notebooks for:
- Valid JSON format
- Proper nbformat version
- Execution outputs
- Cell structure
- Metadata compatibility
"""

import json
import sys
from pathlib import Path


def evaluate_notebook(notebook_path):
    """Evaluate a single notebook for compatibility"""
    try:
        with open(notebook_path, "r", encoding="utf-8") as f:
            nb = json.load(f)

        issues = []
        warnings = []

        # Check nbformat version
        if nb.get("nbformat") != 4:
            issues.append(f"Invalid nbformat: {nb.get('nbformat')} (should be 4)")

        # Check if notebook has cells
        if "cells" not in nb:
            issues.append("No cells found in notebook")
            return False, issues, warnings

        # Check each cell
        for i, cell in enumerate(nb["cells"]):
            cell_num = i + 1

            # Check cell type
            if "cell_type" not in cell:
                issues.append(f"Cell {cell_num}: Missing cell_type")
                continue

            # Check source content
            if "source" not in cell:
                issues.append(f"Cell {cell_num}: Missing source content")
                continue

            # Check execution count for code cells
            if cell["cell_type"] == "code":
                if "execution_count" not in cell:
                    warnings.append(f"Cell {cell_num}: Missing execution_count")
                elif cell["execution_count"] is None:
                    warnings.append(
                        f"Cell {cell_num}: Not executed (execution_count is null)"
                    )

                # Check outputs
                if "outputs" not in cell:
                    warnings.append(f"Cell {cell_num}: Missing outputs field")
                elif not cell["outputs"]:
                    warnings.append(f"Cell {cell_num}: No execution outputs")

        # Check metadata
        if "metadata" not in nb:
            warnings.append("Missing metadata section")

        # Check if notebook is empty
        if not nb["cells"]:
            issues.append("Notebook has no cells")

        return len(issues) == 0, issues, warnings

    except json.JSONDecodeError as e:
        return False, [f"Invalid JSON: {e}"], []
    except Exception as e:
        return False, [f"Error reading notebook: {e}"], []


def main():
    """Evaluate all notebooks in the notebooks directory"""

    print("🔍 EVALUATING NOTEBOOKS FOR GITHUB/NBVIEWER COMPATIBILITY")
    print("=" * 70)

    notebook_dir = Path("notebooks")
    notebook_files = list(notebook_dir.glob("*.ipynb"))

    if not notebook_files:
        print("❌ No notebook files found in notebooks/ directory")
        return False

    print(f"Found {len(notebook_files)} notebooks to evaluate")
    print()

    all_passed = True
    total_issues = 0
    total_warnings = 0

    for notebook_path in sorted(notebook_files):
        print(f"📊 Evaluating {notebook_path.name}...")

        passed, issues, warnings = evaluate_notebook(notebook_path)

        if passed:
            print("   ✅ PASSED")
        else:
            print("   ❌ FAILED")
            all_passed = False

        if issues:
            print("   🚨 Issues:")
            for issue in issues:
                print(f"      - {issue}")

        if warnings:
            print("   ⚠️  Warnings:")
            for warning in warnings:
                print(f"      - {warning}")

        total_issues += len(issues)
        total_warnings += len(warnings)
        print()

    # Summary
    print("=" * 70)
    print("📊 EVALUATION SUMMARY")
    print("=" * 70)

    if all_passed:
        print("🎉 ALL NOTEBOOKS PASSED COMPATIBILITY CHECKS!")
        print("✅ Ready for GitHub and nbviewer.org")
    else:
        print(
            f"⚠️  {len([f for f in notebook_files if not evaluate_notebook(f)[0]])} NOTEBOOKS HAVE ISSUES"
        )
        print("❌ Some notebooks may not display properly on nbviewer.org")

    print(f"📁 Total notebooks: {len(notebook_files)}")
    print(f"🚨 Total issues: {total_issues}")
    print(f"⚠️  Total warnings: {total_warnings}")

    # Recommendations
    print("\n💡 RECOMMENDATIONS:")
    if total_issues == 0:
        print("✅ All notebooks are ready for GitHub/nbviewer")
        print("✅ Notebooks have proper execution outputs")
        print("✅ JSON format is valid")
    else:
        print("🔧 Fix the issues above before committing to GitHub")
        print("🔧 Ensure all notebooks have valid JSON structure")
        print("🔧 Check that code cells have proper execution outputs")

    if total_warnings > 0:
        print("⚠️  Consider addressing warnings for better nbviewer experience")

    return all_passed


if __name__ == "__main__":
    success = main()
    sys.exit(0 if success else 1)
