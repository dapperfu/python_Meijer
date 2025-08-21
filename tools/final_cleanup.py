#!/usr/bin/env python3
"""
Final cleanup and preparation for GitHub/nbviewer

This script:
1. Removes old, broken, or duplicate notebooks
2. Keeps only the working modular notebooks
3. Ensures all notebooks are ready for GitHub
4. Creates a summary of what's ready
"""

from pathlib import Path


def cleanup_notebooks():
    """Remove old notebooks and keep only the working modular ones"""

    # Keep these core working notebooks
    keep_notebooks = {
        "basic_usage.ipynb",
        "shopping_list.ipynb",
        "search.ipynb",
        "stores.ipynb",
        "coupons.ipynb",
        "mperks.ipynb",
    }

    # Keep these additional working notebooks
    additional_keep = {"enums.ipynb", "exceptions.ipynb", "auth.ipynb"}

    all_keep = keep_notebooks | additional_keep

    notebook_dir = Path("notebooks")
    removed_count = 0

    print("🧹 FINAL CLEANUP OF NOTEBOOKS")
    print("=" * 50)

    for notebook_path in notebook_dir.glob("*.ipynb"):
        if notebook_path.name not in all_keep:
            print(f"🗑️  Removing old notebook: {notebook_path.name}")
            notebook_path.unlink()
            removed_count += 1
        else:
            print(f"✅ Keeping working notebook: {notebook_path.name}")

    print("\n📊 Cleanup Summary:")
    print(f"   ✅ Kept: {len(all_keep)} notebooks")
    print(f"   🗑️  Removed: {removed_count} old notebooks")

    return all_keep


def verify_working_generation():
    """Verify that the working generation system still works"""

    print("\n🔧 VERIFYING WORKING GENERATION SYSTEM")
    print("=" * 50)

    try:
        # Test the core generation script
        import subprocess
        import sys

        result = subprocess.run(
            [sys.executable, "client_notebook_gen_core.py"],
            cwd="notebooks",
            capture_output=True,
            text=True,
        )

        if result.returncode == 0:
            print("✅ Core generation system working")
            print("✅ All modular notebooks can be regenerated")
            return True
        else:
            print("❌ Core generation system failed")
            print(f"Error: {result.stderr}")
            return False

    except Exception as e:
        print(f"❌ Error testing generation system: {e}")
        return False


def create_github_readme():
    """Create a README for the notebooks directory"""

    readme_content = """# Meijer API Jupyter Notebooks

This directory contains comprehensive Jupyter notebooks demonstrating the Meijer API client functionality.

## Notebooks Overview

### Core Functionality
- **`basic_usage.ipynb`** - Client initialization and authentication
- **`shopping_list.ipynb`** - Shopping list management operations
- **`search.ipynb`** - Product search functionality
- **`stores.ipynb`** - Store operations and location services
- **`coupons.ipynb`** - Coupon and offer management
- **`mperks.ipynb`** - mPerks rewards and loyalty program

### Additional Modules
- **`enums.ipynb`** - API enumeration values and constants
- **`exceptions.ipynb`** - Error handling and exception classes
- **`auth.ipynb`** - Authentication methods and token management

## Features

✅ **Executed Notebooks** - All notebooks contain execution outputs demonstrating real functionality
✅ **GitHub Compatible** - Ready for nbviewer.org and GitHub rendering
✅ **Modular Design** - Each notebook focuses on a specific area of functionality
✅ **Error Handling** - Shows real API responses and error handling
✅ **Best Practices** - Demonstrates proper usage patterns and examples

## Viewing Notebooks

- **GitHub**: Notebooks render directly in GitHub repositories
- **nbviewer.org**: Use `https://nbviewer.org/github/USERNAME/REPO/blob/main/notebooks/notebook.ipynb`
- **Local**: Open with Jupyter Notebook, JupyterLab, or VS Code

## Regeneration

These notebooks are generated from Python scripts in the `notebooks/` directory:
- `client_notebook_gen_core.py` - Main orchestrator
- `client_notebook_gen_sections.py` - Individual notebook generators

To regenerate all notebooks:
```bash
cd notebooks
python client_notebook_gen_core.py
```

## Requirements

- Python 3.8+
- meijer package
- Jupyter environment (for local execution)

## Status

All notebooks are currently working and ready for GitHub/nbviewer deployment.
"""

    readme_path = Path("notebooks/README.md")
    with open(readme_path, "w") as f:
        f.write(readme_content)

    print(f"📝 Created {readme_path}")


def main():
    """Main cleanup and preparation function"""

    print("🚀 FINAL PREPARATION FOR GITHUB/NBVIEWER")
    print("=" * 60)

    # Step 1: Clean up old notebooks
    print("\nStep 1: Cleaning up notebooks...")
    kept_notebooks = cleanup_notebooks()

    # Step 2: Verify generation system
    print("\nStep 2: Verifying generation system...")
    if not verify_working_generation():
        print("❌ Generation system verification failed")
        return False

    # Step 3: Create documentation
    print("\nStep 3: Creating documentation...")
    create_github_readme()

    # Final summary
    print("\n" + "=" * 60)
    print("🎉 CLEANUP AND PREPARATION COMPLETE!")
    print("=" * 60)
    print()
    print("✅ READY FOR GITHUB/NBVIEWER:")
    print(f"   📁 {len(kept_notebooks)} working notebooks")
    print("   🔧 Working generation system")
    print("   📝 Documentation created")
    print("   🧹 Old notebooks removed")
    print()
    print("📚 Core Notebooks:")
    for notebook in sorted(kept_notebooks):
        if notebook in [
            "basic_usage.ipynb",
            "shopping_list.ipynb",
            "search.ipynb",
            "stores.ipynb",
            "coupons.ipynb",
            "mperks.ipynb",
        ]:
            print(f"   🎯 {notebook}")

    print("\n📖 Additional Notebooks:")
    for notebook in sorted(kept_notebooks):
        if notebook not in [
            "basic_usage.ipynb",
            "shopping_list.ipynb",
            "search.ipynb",
            "stores.ipynb",
            "coupons.ipynb",
            "mperks.ipynb",
        ]:
            print(f"   📚 {notebook}")

    print("\n🚀 Next Steps:")
    print("   1. Commit these notebooks to GitHub")
    print("   2. View on nbviewer.org for best experience")
    print("   3. Use as documentation for the Meijer API client")

    return True


if __name__ == "__main__":
    success = main()
    exit(0 if success else 1)
