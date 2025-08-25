# Version Management with Hatch

This project uses **Hatch** for automated version management based on file-based versioning.

## How It Works

Hatch automatically reads the package version from `meijer/__init__.py`:
- **File version**: `__version__ = "3.3.0"` → **Package version**: `3.3.0`
- **File version**: `__version__ = "1.2.3"` → **Package version**: `1.2.3`

## Configuration

### Hatch Configuration (`hatch.toml`)
```toml
[tool.hatch.version]
source = "file"
path = "meijer/__init__.py"
```

### Package Configuration (`meijer/__init__.py`)
```python
__version__ = "0.0.1"  # Version managed by Hatch from this file
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
make version-bump TYPE=patch    # 3.2.0 → 3.2.1
make version-bump TYPE=minor    # 3.2.0 → 3.3.0
make version-bump TYPE=major    # 3.2.0 → 4.0.0
```

#### Option 2: Direct Script Usage
```bash
python version_bump.py patch    # 3.2.0 → 3.2.1
python version_bump.py minor    # 3.2.0 → 3.3.0
python version_bump.py major    # 3.2.0 → 4.0.0
```

## Version Bumping Workflow

1. **Choose bump type**:
   - `patch`: Bug fixes, small improvements (3.2.0 → 3.2.1)
   - `minor`: New features, backward compatible (3.2.0 → 3.3.0)
   - `major`: Breaking changes (3.2.0 → 4.0.0)

2. **Run version command**:
   ```bash
   make version-bump TYPE=patch
   ```

3. **Script automatically**:
   - Updates `meijer/__init__.py` with new version
   - Hatch will use the new version for builds

4. **Commit and push**:
   ```bash
   git add meijer/__init__.py
   git commit -m "Bump version to 3.2.1"
   git push
   ```

## Benefits of This Approach

✅ **Single source of truth**: `meijer/__init__.py` is the authoritative version  
✅ **Automated**: Hatch handles version extraction automatically  
✅ **Consistent**: No manual file editing required  
✅ **Simple**: Direct file-based versioning without git tag complexity  
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
# Edit meijer/__init__.py
__version__ = "1.0.0"
# Hatch will now use version 1.0.0
```

### Bug Fix Release
```bash
make version-bump TYPE=patch
# Updates to 1.0.1
# Hatch will use version 1.0.1
```

### Feature Release
```bash
make version-bump TYPE=minor
# Updates to 1.1.0
# Hatch will use version 1.1.0
```

### Breaking Change Release
```bash
make version-bump TYPE=major
# Updates to 2.0.0
# Hatch will use version 2.0.0
```
