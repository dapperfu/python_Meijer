"""
Custom Hatch build hook to synchronize version numbers.
This ensures that the version in pyproject.toml matches the version in meijer/__init__.py
"""

import re
from pathlib import Path


def get_version_from_init():
    """Extract version from meijer/__init__.py"""
    init_file = Path("meijer/__init__.py")
    if not init_file.exists():
        return None
    
    content = init_file.read_text()
    match = re.search(r'__version__\s*=\s*["\']([^"\']+)["\']', content)
    return match.group(1) if match else None


def update_pyproject_version(version):
    """Update version in pyproject.toml"""
    pyproject_file = Path("pyproject.toml")
    if not pyproject_file.exists():
        return False
    
    content = pyproject_file.read_text()
    # Update version in [project] section
    content = re.sub(
        r'version\s*=\s*["\'][^"\']+["\']',
        f'version = "{version}"',
        content
    )
    
    # Update version in [project] section if it exists
    content = re.sub(
        r'(\[project\]\s*\n(?:[^\[]*\n)*?)version\s*=\s*["\'][^"\']+["\']',
        rf'\1version = "{version}"',
        content,
        flags=re.MULTILINE | re.DOTALL
    )
    
    pyproject_file.write_text(content)
    return True


def update_hatch_config_version(version):
    """Update version in hatch.toml"""
    hatch_file = Path("hatch.toml")
    if not hatch_file.exists():
        return False
    
    content = hatch_file.read_text()
    # Update version in [project] section
    content = re.sub(
        r'version\s*=\s*["\'][^"\']+["\']',
        f'version = "{version}"',
        content
    )
    
    hatch_file.write_text(content)
    return True


def main():
    """Main function to synchronize versions"""
    version = get_version_from_init()
    if not version:
        print("Warning: Could not extract version from meijer/__init__.py")
        return
    
    print(f"Synchronizing version {version} across configuration files...")
    
    # Update pyproject.toml
    if update_pyproject_version(version):
        print("✓ Updated pyproject.toml")
    else:
        print("⚠ Could not update pyproject.toml")
    
    # Update hatch.toml
    if update_hatch_config_version(version):
        print("✓ Updated hatch.toml")
    else:
        print("⚠ Could not update hatch.toml")
    
    print(f"Version synchronization complete: {version}")


if __name__ == "__main__":
    main()
