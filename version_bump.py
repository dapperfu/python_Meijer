#!/usr/bin/env python3
"""
Custom version bumping script for the Meijer project.
This script increments version numbers in both meijer/__init__.py and pyproject.toml.
"""

import re
import sys
from pathlib import Path
from typing import Tuple


def parse_version(version_str: str) -> Tuple[int, int, int]:
    """Parse version string into major, minor, patch components."""
    match = re.match(r'^(\d+)\.(\d+)\.(\d+)$', version_str)
    if not match:
        raise ValueError(f"Invalid version format: {version_str}")
    return tuple(map(int, match.groups()))


def format_version(major: int, minor: int, patch: int) -> str:
    """Format version components into version string."""
    return f"{major}.{minor}.{patch}"


def bump_version(version_str: str, bump_type: str) -> str:
    """Bump version according to semantic versioning rules."""
    major, minor, patch = parse_version(version_str)
    
    if bump_type == "patch":
        patch += 1
    elif bump_type == "minor":
        minor += 1
        patch = 0
    elif bump_type == "major":
        major += 1
        minor = 0
        patch = 0
    else:
        raise ValueError(f"Invalid bump type: {bump_type}. Use 'patch', 'minor', or 'major'")
    
    return format_version(major, minor, patch)


def update_file_version(file_path: Path, old_version: str, new_version: str, pattern: str, replacement: str) -> bool:
    """Update version in a file using regex pattern and replacement."""
    if not file_path.exists():
        print(f"⚠️  File not found: {file_path}")
        return False
    
    content = file_path.read_text()
    new_content = re.sub(pattern, replacement.format(new_version), content)
    
    if new_content != content:
        file_path.write_text(new_content)
        print(f"✅ Updated {file_path}")
        return True
    else:
        print(f"⚠️  No changes made to {file_path}")
        return False


def main():
    """Main function to bump version."""
    if len(sys.argv) != 2:
        print("Usage: python version_bump.py <bump_type>")
        print("  bump_type: patch, minor, or major")
        sys.exit(1)
    
    bump_type = sys.argv[1].lower()
    if bump_type not in ["patch", "minor", "major"]:
        print("Error: bump_type must be 'patch', 'minor', or 'major'")
        sys.exit(1)
    
    print(f"🚀 Bumping version {bump_type}...")
    
    # Read current version from __init__.py
    init_file = Path("meijer/__init__.py")
    if not init_file.exists():
        print("❌ Error: meijer/__init__.py not found")
        sys.exit(1)
    
    init_content = init_file.read_text()
    version_match = re.search(r'__version__\s*=\s*["\']([^"\']+)["\']', init_content)
    if not version_match:
        print("❌ Error: Could not find __version__ in meijer/__init__.py")
        sys.exit(1)
    
    current_version = version_match.group(1)
    new_version = bump_version(current_version, bump_type)
    
    print(f"📋 Version: {current_version} → {new_version}")
    
    # Update __init__.py
    update_file_version(
        init_file,
        current_version,
        new_version,
        r'__version__\s*=\s*["\'][^"\']+["\']',
        '__version__ = "{}"'
    )
    
    # Update pyproject.toml
    pyproject_file = Path("pyproject.toml")
    if pyproject_file.exists():
        update_file_version(
            pyproject_file,
            current_version,
            new_version,
            r'version\s*=\s*["\'][^"\']+["\']',
            'version = "{}"'
        )
    
    # Update hatch.toml if it exists
    hatch_file = Path("hatch.toml")
    if hatch_file.exists():
        # Only update if it has a version field
        hatch_content = hatch_file.read_text()
        if 'version =' in hatch_content:
            update_file_version(
                hatch_file,
                current_version,
                new_version,
                r'version\s*=\s*["\'][^"\']+["\']',
                'version = "{}"'
            )
    
    print(f"🎉 Version bump complete: {new_version}")
    print("💡 Don't forget to commit and push your changes!")


if __name__ == "__main__":
    main()
