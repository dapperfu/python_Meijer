# Version Management with Hatch

This project uses **Hatch** for automated version management based on git tags.

## How It Works

Hatch automatically derives the package version from git tags:
- **Git tag**: `v3.3.0` → **Package version**: `3.3.0`
- **Git tag**: `v1.2.3` → **Package version**: `1.2.3`

## Configuration

### Hatch Configuration (`hatch.toml`)
```toml
[tool.hatch.version]
source = "git"
```

### Package Configuration (`meijer/__init__.py`)
```python
__version__ = "0.0.0"  # Version managed by Hatch from git tags
```

## Version Management Commands

### Check Current Version
```bash
make version
```

This shows:
- Current git tag
- Current commit hash
- Hatch-derived version

### Create New Version

#### Option 1: Using Make (Recommended)
```bash
make version-tag TYPE=patch    # 3.2.0 → 3.2.1
make version-tag TYPE=minor    # 3.2.0 → 3.3.0
make version-tag TYPE=major    # 3.2.0 → 4.0.0
```

#### Option 2: Direct Script Usage
```bash
python version_tag.py patch    # 3.2.0 → 3.2.1
python version_tag.py minor    # 3.2.0 → 3.3.0
python version_tag.py major    # 3.2.0 → 4.0.0
```

## Version Bumping Workflow

1. **Choose bump type**:
   - `patch`: Bug fixes, small improvements (3.2.0 → 3.2.1)
   - `minor`: New features, backward compatible (3.2.0 → 3.3.0)
   - `major`: Breaking changes (3.2.0 → 4.0.0)

2. **Run version command**:
   ```bash
   make version-tag TYPE=patch
   ```

3. **Confirm the new version** when prompted

4. **Script automatically**:
   - Creates git tag
   - Pushes tag to remote
   - Hatch will use the new version for builds

## Benefits of This Approach

✅ **Single source of truth**: Git tags are the authoritative version  
✅ **Automated**: Hatch handles version extraction automatically  
✅ **Consistent**: No manual file editing required  
✅ **Git-native**: Version history is part of git history  
✅ **CI/CD friendly**: Works seamlessly with automated builds  

## Migration from Old System

The old `version_bump.py` script has been removed. The new system:
- Uses git tags instead of file editing
- Integrates with Hatch's build system
- Provides better automation and consistency

## Troubleshooting

### No Tags Found
If you get "No tags found", create an initial tag:
```bash
git tag v1.0.0
git push --tags
```

### Hatch Version Not Available
Ensure Hatch is installed in your virtual environment:
```bash
venv/bin/pip install hatch
```

### Permission Issues
Ensure you have push access to the repository for creating tags.

## Examples

### Starting a New Project
```bash
git tag v1.0.0
git push --tags
# Hatch will now use version 1.0.0
```

### Bug Fix Release
```bash
make version-tag TYPE=patch
# Creates v1.0.1 tag
# Hatch will use version 1.0.1
```

### Feature Release
```bash
make version-tag TYPE=minor
# Creates v1.1.0 tag
# Hatch will use version 1.1.0
```

### Breaking Change Release
```bash
make version-tag TYPE=major
# Creates v2.0.0 tag
# Hatch will use version 2.0.0
```
