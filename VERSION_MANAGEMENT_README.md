# Version Management with Hatch

This project uses a hybrid version management system combining Hatch (for build management) with a custom version bumping script for reliable version control.

## Overview

- **Hatch**: Manages project configuration and build processes
- **Custom Script**: `version_bump.py` handles version increments across all files
- **Makefile Integration**: Simple commands for version management

## Quick Start

### Check Current Version
```bash
make version
```

### Bump Version
```bash
# Bug fixes and patches
make version-bump TYPE=patch

# New features (non-breaking)
make version-bump TYPE=minor

# Breaking changes
make version-bump TYPE=major
```

## Version Bumping Examples

| Current Version | Bump Type | New Version | Use Case |
|----------------|-----------|-------------|----------|
| 3.3.0 | patch | 3.3.1 | Bug fixes, small improvements |
| 3.3.0 | minor | 3.4.0 | New features, enhancements |
| 3.3.0 | major | 4.0.0 | Breaking changes, major rewrites |

## How It Works

### 1. Version Source
The version is managed in `meijer/__init__.py` as the single source of truth:
```python
__version__ = "3.3.0"
```

### 2. Configuration Files
- **`pyproject.toml`**: No static version field (managed dynamically by Hatch)
- **`hatch.toml`**: Hatch-specific configuration
- **`meijer/__init__.py`**: Contains the actual version number

### 3. Version Bumping Process
When you run `make version-bump TYPE=patch`:

1. The `version_bump.py` script reads the current version from `__init__.py`
2. Increments the appropriate version component
3. Updates `__init__.py` with the new version
4. Optionally updates other files if they contain version fields

### 4. Hatch Integration
Hatch reads the version from `__init__.py` during build processes, ensuring consistency.

## File Structure

```
├── meijer/__init__.py          # Version source (3.3.0)
├── pyproject.toml              # Dynamic version (managed by Hatch)
├── hatch.toml                  # Hatch configuration
├── version_bump.py             # Custom version bumping script
├── hatch_build_hook.py         # Build hook for version sync
└── Makefile                    # Version management commands
```

## Available Commands

### Makefile Targets

| Command | Description |
|---------|-------------|
| `make version` | Display current version information |
| `make version-bump TYPE=<type>` | Bump version by specified type |
| `make version-sync` | Synchronize versions across all files |

### Direct Script Usage

```bash
# Bump patch version
python version_bump.py patch

# Bump minor version  
python version_bump.py minor

# Bump major version
python version_bump.py major
```

## Best Practices

### 1. Version Bumping Workflow
```bash
# 1. Bump version
make version-bump TYPE=patch

# 2. Review changes
git diff

# 3. Commit and push
git add .
git commit -m "Bump version to 3.3.1"
git push
```

### 2. When to Bump Versions
- **Patch (3.3.0 → 3.3.1)**: Bug fixes, documentation updates, minor improvements
- **Minor (3.3.0 → 3.4.0)**: New features, enhancements, non-breaking changes
- **Major (3.3.0 → 4.0.0)**: Breaking changes, major rewrites, significant API changes

### 3. Version Consistency
- Always use the Makefile commands for version management
- The system automatically keeps all files in sync
- Never manually edit version numbers in multiple files

## Troubleshooting

### Common Issues

#### Version Mismatch
If you see version mismatches:
```bash
make version-sync
```

#### Build Errors
If Hatch build fails:
```bash
# Check version configuration
make version

# Verify __init__.py has correct version
cat meijer/__init__.py | grep __version__
```

#### Permission Errors
Ensure the version bump script is executable:
```bash
chmod +x version_bump.py
```

## Advanced Configuration

### Custom Version Patterns
The `version_bump.py` script can be modified to handle different version formats or additional files.

### Hatch Configuration
Modify `hatch.toml` to customize Hatch behavior:
```toml
[tool.hatch.version]
source = "git"  # Use git tags instead of file

[tool.hatch.build.targets.wheel]
packages = ["meijer"]
```

### Build Hooks
The `hatch_build_hook.py` script can be extended to handle additional version synchronization tasks.

## Migration from Manual Version Management

If you were previously managing versions manually:

1. **Remove static versions** from `pyproject.toml`
2. **Use the new commands** instead of manual editing
3. **Run version sync** to ensure consistency:
   ```bash
   make version-sync
   ```

## Support

For issues with version management:
1. Check the current version: `make version`
2. Verify file consistency: `make version-sync`
3. Review the version bump script: `cat version_bump.py`

## Dependencies

- **Hatch**: `>=1.14.0` (installed in virtual environment)
- **Python**: `>=3.8`
- **Make**: Available on most Unix-like systems

## Future Enhancements

- Git tag integration for release management
- Automated changelog generation
- CI/CD integration for version bumping
- Pre-commit hooks for version validation
