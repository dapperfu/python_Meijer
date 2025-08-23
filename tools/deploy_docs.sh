#!/bin/bash
"""
Deploy documentation to gh-pages branch for GitHub Pages.

This script:
1. Generates documentation using pdoc
2. Creates/updates the gh-pages branch
3. Pushes the documentation to GitHub Pages
"""

set -e  # Exit on any error

echo "🚀 Deploying documentation to GitHub Pages..."

# Check if we're in a git repository
if ! git rev-parse --git-dir > /dev/null 2>&1; then
    echo "❌ Error: Not in a git repository"
    exit 1
fi

# Check if we have uncommitted changes
if ! git diff-index --quiet HEAD --; then
    echo "⚠️  Warning: You have uncommitted changes. Consider committing them first."
    read -p "Continue anyway? (y/N): " -n 1 -r
    echo
    if [[ ! $REPLY =~ ^[Yy]$ ]]; then
        echo "❌ Deployment cancelled"
        exit 1
    fi
fi

# Generate documentation
echo "📚 Generating documentation with pdoc..."
venv/bin/pdoc -o docs meijer/

# Check if docs were generated
if [ ! -f "docs/index.html" ]; then
    echo "❌ Error: Documentation generation failed"
    exit 1
fi

echo "✅ Documentation generated successfully"

# Create or update gh-pages branch
echo "🌿 Setting up gh-pages branch..."

# Check if gh-pages branch exists
if git show-ref --verify --quiet refs/remotes/origin/gh-pages; then
    echo "📥 Fetching existing gh-pages branch..."
    git fetch origin gh-pages:gh-pages
    git checkout gh-pages
    git pull origin gh-pages
else
    echo "🆕 Creating new gh-pages branch..."
    git checkout --orphan gh-pages
    git rm -rf . || true  # Remove all files, ignore errors if none exist
fi

# Copy documentation files
echo "📋 Copying documentation files..."
cp -r docs/* .

# Add all files
git add .

# Commit changes
echo "💾 Committing documentation..."
git commit -m "Update documentation - $(date)"

# Push to gh-pages branch
echo "🚀 Pushing to gh-pages branch..."
git push origin gh-pages

# Return to main branch
echo "🔄 Returning to main branch..."
git checkout main

echo "✅ Documentation deployed successfully!"
echo ""
echo "🌐 Your documentation should be available at:"
echo "   https://$(git config user.name | tr '[:upper:]' '[:lower:]').github.io/$(basename $(git rev-parse --show-toplevel))"
echo ""
echo "📝 Note: It may take a few minutes for GitHub Pages to update."
echo "   You can check the status in your repository's Settings > Pages"
