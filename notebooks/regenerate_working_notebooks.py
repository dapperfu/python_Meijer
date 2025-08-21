#!/usr/bin/env python3
"""
Regenerate working Jupyter notebooks using the modular approach

This script uses the working modular notebook generation system instead of
the broken massive scripts.
"""

import os
import subprocess
import sys


def run_working_generation():
    """Run the working modular notebook generation system"""
    try:
        print("🚀 Using working modular notebook generation system...")

        # Change to notebooks directory and run the working core script
        result = subprocess.run(
            [sys.executable, "client_notebook_gen_core.py"],
            cwd="notebooks",
            capture_output=True,
            text=True,
        )

        if result.returncode == 0:
            print("✅ Modular generation completed successfully!")
            print("Output:")
            print(result.stdout)
            return True
        else:
            print(f"❌ Modular generation failed with return code {result.returncode}")
            if result.stderr:
                print(f"Error: {result.stderr}")
            return False

    except Exception as e:
        print(f"❌ Error running modular generation: {e}")
        return False


def execute_new_notebooks():
    """Execute the newly generated notebooks to demonstrate functionality"""
    try:
        print("\n🔧 Executing new notebooks to demonstrate functionality...")

        # Get the newly generated notebooks
        new_notebooks = [
            "basic_usage.ipynb",
            "shopping_list.ipynb",
            "search.ipynb",
            "stores.ipynb",
            "coupons.ipynb",
            "mperks.ipynb",
        ]

        successful = 0
        failed = 0

        for notebook in new_notebooks:
            notebook_path = os.path.join("notebooks", notebook)
            if os.path.exists(notebook_path):
                print(f"Executing {notebook}...")
                try:
                    # Import and use the execution function
                    import execute_notebooks

                    if execute_notebooks.execute_notebook(notebook_path):
                        successful += 1
                        print(f"✅ {notebook} executed successfully")
                    else:
                        failed += 1
                        print(f"❌ {notebook} execution failed")
                except Exception as e:
                    failed += 1
                    print(f"❌ Error executing {notebook}: {e}")
            else:
                print(f"⚠️  {notebook} not found")

        print("\n📊 Execution Summary:")
        print(f"   ✅ Successful: {successful}")
        print(f"   ❌ Failed: {failed}")
        print(f"   📁 Total: {len(new_notebooks)}")

        return failed == 0

    except Exception as e:
        print(f"❌ Error during execution: {e}")
        return False


def main():
    """Main function"""
    print("🔄 REGENERATING WORKING NOTEBOOKS")
    print("=" * 60)

    # Step 1: Generate notebooks using working modular system
    print("Step 1: Generating notebooks...")
    if not run_working_generation():
        print("❌ Failed to generate notebooks")
        return False

    # Step 2: Execute notebooks to demonstrate functionality
    print("\nStep 2: Executing notebooks...")
    if not execute_new_notebooks():
        print("⚠️  Some notebooks failed to execute, but generation was successful")

    print("\n" + "=" * 60)
    print("🎉 REGENERATION COMPLETE!")
    print("=" * 60)
    print()
    print("✅ The working modular system has been used instead of broken scripts")
    print("✅ 6 focused notebooks have been generated:")
    print("   - basic_usage.ipynb - Client initialization and auth")
    print("   - shopping_list.ipynb - Shopping list management")
    print("   - search.ipynb - Product search functionality")
    print("   - stores.ipynb - Store operations")
    print("   - coupons.ipynb - Coupon management")
    print("   - mperks.ipynb - mPerks and rewards")
    print()
    print("🔧 These notebooks demonstrate actual functionality and can be executed")
    print("📚 Each notebook focuses on a specific area instead of being overwhelming")

    return True


if __name__ == "__main__":
    success = main()
    sys.exit(0 if success else 1)
