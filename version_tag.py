#!/usr/bin/env python3
"""
Version tagging script for the Meijer project using Hatch.
This script helps create git tags for version management.
"""

import subprocess
import sys
import re
from typing import Tuple, Optional


def run_command(cmd: list[str]) -> str:
    """Run a command and return the output."""
    try:
        result = subprocess.run(cmd, capture_output=True, text=True, check=True)
        return result.stdout.strip()
    except subprocess.CalledProcessError as e:
        print(f"❌ Command failed: {' '.join(cmd)}")
        print(f"Error: {e.stderr}")
        sys.exit(1)


def get_current_tag() -> Optional[str]:
    """Get the current git tag."""
    try:
        return run_command(["git", "describe", "--tags", "--abbrev=0"])
    except subprocess.CalledProcessError:
        return None


def parse_version(version_str: str) -> Tuple[int, int, int]:
    """Parse version string into major, minor, patch components."""
    # Remove 'v' prefix if present
    version_str = version_str.lstrip('v')
    match = re.match(r'^(\d+)\.(\d+)\.(\d+)$', version_str)
    if not match:
        raise ValueError(f"Invalid version format: {version_str}")
    return tuple(map(int, match.groups()))


def calculate_new_version(current_version: str, bump_type: str) -> str:
    """Calculate new version based on bump type."""
    major, minor, patch = parse_version(current_version)
    
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
    
    return f"v{major}.{minor}.{patch}"


def create_tag(version: str) -> None:
    """Create and push a git tag."""
    print(f"🏷️  Creating tag: {version}")
    
    # Create the tag
    run_command(["git", "tag", version])
    print(f"✅ Tag {version} created locally")
    
    # Push the tag
    print(f"🚀 Pushing tag to remote...")
    run_command(["git", "push", "--tags"])
    print(f"✅ Tag {version} pushed to remote")
    
    print(f"🎉 Version {version} is now live!")
    print(f"💡 Hatch will automatically use this version for builds")


def main():
    """Main function."""
    if len(sys.argv) != 2:
        print("Usage: python version_tag.py <bump_type>")
        print("  bump_type: patch, minor, or major")
        print("")
        print("Examples:")
        print("  python version_tag.py patch   # 3.2.0 → 3.2.1")
        print("  python version_tag.py minor   # 3.2.0 → 3.3.0")
        print("  python version_tag.py major   # 3.2.0 → 4.0.0")
        sys.exit(1)
    
    bump_type = sys.argv[1].lower()
    if bump_type not in ["patch", "minor", "major"]:
        print("❌ Error: bump_type must be 'patch', 'minor', or 'major'")
        sys.exit(1)
    
    print(f"🚀 Bumping version {bump_type}...")
    
    # Get current tag
    current_tag = get_current_tag()
    if not current_tag:
        print("⚠️  No git tags found. Starting with v1.0.0")
        current_tag = "v1.0.0"
    
    print(f"📋 Current version: {current_tag}")
    
    # Calculate new version
    new_version = calculate_new_version(current_tag, bump_type)
    print(f"📋 New version: {new_version}")
    
    # Confirm
    response = input(f"🤔 Create tag {new_version}? (y/N): ").strip().lower()
    if response not in ['y', 'yes']:
        print("❌ Version bump cancelled")
        sys.exit(0)
    
    # Create and push tag
    create_tag(new_version)


if __name__ == "__main__":
    main()
