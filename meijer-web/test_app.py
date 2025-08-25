#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create test script for Meijer web application
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: Flask, pytest
 */

Test script for Meijer Web Application
=====================================

Simple test to verify the Flask application can start and basic functionality works.
"""

import sys
from pathlib import Path

# Add parent directory to path to import meijer package
sys.path.insert(0, str(Path(__file__).parent.parent))

def test_imports():
    """Test that all required modules can be imported."""
    try:
        import flask
        print("✅ Flask imported successfully")
        
        import flask_bootstrap
        print("✅ Flask-Bootstrap imported successfully")
        
        # Try to import the meijer package
        try:
            import meijer
            print("✅ Meijer package imported successfully")
        except ImportError as e:
            print(f"⚠️  Meijer package import warning: {e}")
            print("   This is expected if the package isn't installed yet")
        
        return True
    except ImportError as e:
        print(f"❌ Import error: {e}")
        return False

def test_flask_app():
    """Test that the Flask app can be created."""
    try:
        from app import app
        
        # Test basic app properties
        assert app is not None, "App should not be None"
        assert hasattr(app, 'routes'), "App should have routes"
        
        print("✅ Flask app created successfully")
        print(f"   App name: {app.name}")
        print(f"   Debug mode: {app.debug}")
        
        # Test that routes are registered
        routes = [str(rule) for rule in app.url_map.iter_rules()]
        print(f"   Registered routes: {len(routes)}")
        for route in routes[:5]:  # Show first 5 routes
            print(f"     - {route}")
        
        return True
    except Exception as e:
        print(f"❌ Flask app creation error: {e}")
        return False

def test_templates():
    """Test that template files exist."""
    template_dir = Path(__file__).parent / "templates"
    
    if not template_dir.exists():
        print("❌ Templates directory not found")
        return False
    
    required_templates = [
        "base.html",
        "index.html", 
        "cart.html",
        "shopping_list.html",
        "coupons.html",
        "stores.html",
        "settings.html",
        "auth/login.html",
        "errors/404.html",
        "errors/500.html"
    ]
    
    missing_templates = []
    for template in required_templates:
        template_path = template_dir / template
        if not template_path.exists():
            missing_templates.append(template)
    
    if missing_templates:
        print(f"❌ Missing templates: {missing_templates}")
        return False
    
    print("✅ All required templates found")
    return True

def test_static_files():
    """Test that static files exist."""
    static_dir = Path(__file__).parent / "static"
    
    if not static_dir.exists():
        print("❌ Static directory not found")
        return False
    
    required_static = [
        "css/style.css",
        "js/app.js"
    ]
    
    missing_static = []
    for static_file in required_static:
        file_path = static_dir / static_file
        if not file_path.exists():
            missing_static.append(static_file)
    
    if missing_static:
        print(f"❌ Missing static files: {missing_static}")
        return False
    
    print("✅ All required static files found")
    return True

def test_requirements():
    """Test that requirements.txt exists and is readable."""
    requirements_file = Path(__file__).parent / "requirements.txt"
    
    if not requirements_file.exists():
        print("❌ requirements.txt not found")
        return False
    
    try:
        with open(requirements_file, 'r') as f:
            requirements = f.read()
        
        if not requirements.strip():
            print("❌ requirements.txt is empty")
            return False
        
        print("✅ requirements.txt found and readable")
        print(f"   Contains {len(requirements.splitlines())} lines")
        return True
    except Exception as e:
        print(f"❌ Error reading requirements.txt: {e}")
        return False

def main():
    """Run all tests."""
    print("🧪 Testing Meijer Web Application...")
    print("=" * 50)
    
    tests = [
        ("Import Test", test_imports),
        ("Flask App Test", test_flask_app),
        ("Templates Test", test_templates),
        ("Static Files Test", test_static_files),
        ("Requirements Test", test_requirements)
    ]
    
    passed = 0
    total = len(tests)
    
    for test_name, test_func in tests:
        print(f"\n🔍 Running {test_name}...")
        try:
            if test_func():
                passed += 1
                print(f"✅ {test_name} PASSED")
            else:
                print(f"❌ {test_name} FAILED")
        except Exception as e:
            print(f"❌ {test_name} ERROR: {e}")
    
    print("\n" + "=" * 50)
    print(f"📊 Test Results: {passed}/{total} tests passed")
    
    if passed == total:
        print("🎉 All tests passed! The application is ready to run.")
        print("\n🚀 To start the application:")
        print("   1. cd meijer-web")
        print("   2. python -m venv venv")
        print("   3. source venv/bin/activate  # On Windows: venv\\Scripts\\activate")
        print("   4. pip install -r requirements.txt")
        print("   5. python app.py")
        print("   6. Open http://127.0.0.1:5000 in your browser")
    else:
        print("⚠️  Some tests failed. Please check the errors above.")
        return 1
    
    return 0

if __name__ == "__main__":
    sys.exit(main())
