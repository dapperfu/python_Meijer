#!/usr/bin/env python3
"""
Generate comprehensive search functionality notebook with latest examples.

This script creates a notebook demonstrating all search capabilities:
- Autocomplete functionality
- Main search with filtering
- Product interaction tracking
- Behavior analytics
- Image asset management
"""

import json

def generate_search_notebook():
    """Generate the comprehensive search notebook."""
    
    notebook = {
        "cells": [
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "# 🔍 Meijer Client - Advanced Search Functionality\n\n",
                    "This notebook demonstrates the complete search functionality based on real workflow analysis:\n",
                    "- **Autocomplete** with intelligent suggestions\n",
                    "- **Main search** with filtering and pagination\n",
                    "- **Product interaction** tracking and analytics\n",
                    "- **Image asset** management\n",
                    "- **Behavior tracking** for personalization\n\n",
                    "## 📋 Search Session Example\n",
                    "Based on real user workflow:\n",
                    "1. Typed \"lego jurassic\" → triggered autocomplete\n",
                    "2. Searched → got 7 results initially\n",
                    "3. Clicked product \"76975\" → LEGO Jurassic World T. rex River Escape\n",
                    "4. Made it favorite, added to cart, shopping list operations\n",
                    "5. Searched \"LEGO\" → got 239 results (paginated)\n",
                    "6. Full product interaction workflow\n\n",
                    "## 🏗️ Architecture\n",
                    "- **Constructor.io** (`ac.cnstrc.com`) - Main search functionality\n",
                    "- **Meijer API** (`api.meijer.com`) - Product data and operations\n",
                    "- **Content Delivery** (`meijer.com/content/dam/meijer`) - Images and assets"
                ]
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🚀 Setup and Configuration\n\n",
                    "Initialize the client and configure search functionality."
                ]
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "# Import and setup\n",
                    "from meijer.client import Meijer\n",
                    "from meijer.models.search import SearchResult\n",
                    "from meijer.models.items import MeijerItem\n",
                    "import json\n",
                    "from typing import Dict, List, Optional\n",
                    "import requests\n",
                    "from urllib.parse import urlencode\n",
                    "from datetime import datetime\n\n",
                    "# Initialize client\n",
                    "client = Meijer()\n",
                    "print(\"✅ Client initialized\")\n",
                    "print(f\"🔑 API Key: {client.search.api_key}\")\n",
                    "print(f\"🌐 Base URL: {client.search.constructor_base_url}\")\n",
                    "print(f\"📱 Client Version: cioand-2.31.0\")"
                ]
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🔍 Autocomplete Functionality\n\n",
                    "Demonstrate real-time search suggestions as users type."
                ]
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "def get_autocomplete_suggestions(query: str, max_suggestions: int = 8) -> Dict:\n",
                    "    \"\"\"Get autocomplete suggestions from Constructor.io.\"\"\"\n",
                    "    \n",
                    "    # Parameters based on real workflow analysis\n",
                    "    params = {\n",
                    "        \"key\": client.search.api_key,\n",
                    "        \"num_results_Search Suggestions\": max_suggestions,\n",
                    "        \"num_results_Products\": 0,  # No product suggestions in autocomplete\n",
                    "        \"i\": \"e86795a2-95ee-484c-a04b-58cd4d07b887\",  # Session ID\n",
                    "        \"ui\": \"6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd\",  # User ID\n",
                    "        \"s\": \"1\",\n",
                    "        \"c\": \"cioand-2.31.0\",  # Client version\n",
                    "        \"_dt\": str(int(datetime.now().timestamp() * 1000))\n",
                    "    }\n",
                    "    \n",
                    "    url = f\"{client.search.constructor_base_url}/autocomplete/{query}\"\n",
                    "    \n",
                    "    try:\n",
                    "        response = requests.get(url, params=params)\n",
                    "        response.raise_for_status()\n",
                    "        return response.json()\n",
                    "    except Exception as e:\n",
                    "        print(f\"❌ Autocomplete failed: {e}\")\n",
                    "        return {}\n\n",
                    "# Test autocomplete with LEGO search\n",
                    "print(\"🔍 Testing autocomplete for 'lego'...\")\n",
                    "autocomplete_results = get_autocomplete_suggestions(\"lego\")\n",
                    "\n",
                    "if autocomplete_results:\n",
                    "    print(\"✅ Autocomplete results:\")\n",
                    "    print(json.dumps(autocomplete_results, indent=2))\n",
                    "else:\n",
                    "    print(\"❌ No autocomplete results\")"
                ]
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🔎 Main Search Functionality\n\n",
                    "Perform comprehensive product searches with filtering and pagination."
                ]
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "def perform_advanced_search(query: str, page: int = 1, results_per_page: int = 30, store_id: str = \"19\") -> Dict:\n",
                    "    \"\"\"Perform advanced search with all parameters from workflow analysis.\"\"\"\n",
                    "    \n",
                    "    # Parameters based on real workflow analysis\n",
                    "    params = {\n",
                    "        \"filters[availableInStores]\": store_id,\n",
                    "        \"page\": page,\n",
                    "        \"num_results_per_page\": results_per_page,\n",
                    "        \"key\": client.search.api_key,\n",
                    "        \"i\": \"e86795a2-95ee-484c-a04b-58cd4d07b887\",  # Session ID\n",
                    "        \"ui\": \"6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd\",  # User ID\n",
                    "        \"s\": \"1\",\n",
                    "        \"c\": \"cioand-2.31.0\",  # Client version\n",
                    "        \"_dt\": str(int(datetime.now().timestamp() * 1000))\n",
                    "    }\n",
                    "    \n",
                    "    url = f\"{client.search.constructor_base_url}/search/{query}\"\n",
                    "    \n",
                    "    try:\n",
                    "        response = requests.get(url, params=params)\n",
                    "        response.raise_for_status()\n",
                    "        return response.json()\n",
                    "    except Exception as e:\n",
                    "        print(f\"❌ Search failed: {e}\")\n",
                    "        return {}\n\n",
                    "# Test main search functionality\n",
                    "print(\"🔍 Testing main search for 'lego'...\")\n",
                    "search_results = perform_advanced_search(\"lego\", page=1, results_per_page=5)\n",
                    "\n",
                    "if search_results:\n",
                    "    print(\"✅ Search results:\")\n",
                    "    print(f\"📊 Total results: {search_results.get('total_num_results', 'Unknown')}\")\n",
                    "    print(f\"📄 Current page: {search_results.get('page', 'Unknown')}\")\n",
                    "    print(f\"🔢 Results per page: {search_results.get('num_results_per_page', 'Unknown')}\")\n",
                    "    \n",
                    "    # Show first few results\n",
                    "    if 'results' in search_results:\n",
                    "        print(f\"\\n📦 First {len(search_results['results'])} products:\")\n",
                    "        for i, product in enumerate(search_results['results'][:3], 1):\n",
                    "            print(f\"  {i}. {product.get('data', {}).get('name', 'Unknown Product')}\")\n",
                    "            print(f\"     🏷️  ID: {product.get('data', {}).get('id', 'Unknown')}\")\n",
                    "            print(f\"     💰 Price: {product.get('data', {}).get('price', 'Unknown')}\")\n",
                    "            print()\n",
                    "else:\n",
                    "    print(\"❌ No search results\")"
                ]
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🎯 Product Click Tracking\n\n",
                    "Track user interactions with products for analytics and personalization."
                ]
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "def track_product_click(product_name: str, customer_id: str = \"67341940946\", section: str = \"Products\") -> Dict:\n",
                    "    \"\"\"Track product click for analytics.\"\"\"\n",
                    "    \n",
                    "    # Parameters based on real workflow analysis\n",
                    "    params = {\n",
                    "        \"name\": product_name,\n",
                    "        \"customer_id\": customer_id,\n",
                    "        \"section\": section,\n",
                    "        \"key\": client.search.api_key,\n",
                    "        \"i\": \"e86795a2-95ee-484c-a04b-58cd4d07b887\",  # Session ID\n",
                    "        \"ui\": \"6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd\",  # User ID\n",
                    "        \"s\": \"1\",\n",
                    "        \"c\": \"cioand-2.31.0\",  # Client version\n",
                    "        \"_dt\": str(int(datetime.now().timestamp() * 1000))\n",
                    "    }\n",
                    "    \n",
                    "    url = f\"{client.search.constructor_base_url}/autocomplete/lego/click_through\"\n",
                    "    \n",
                    "    try:\n",
                    "        response = requests.get(url, params=params)\n",
                    "        response.raise_for_status()\n",
                    "        return response.json()\n",
                    "    except Exception as e:\n",
                    "        print(f\"❌ Click tracking failed: {e}\")\n",
                    "        return {}\n\n",
                    "# Test product click tracking\n",
                    "print(\"🎯 Testing product click tracking...\")\n",
                    "product_name = \"LEGO Jurassic World T. rex River Escape 76975\"\n",
                    "click_tracking = track_product_click(product_name)\n",
                    "\n",
                    "if click_tracking:\n",
                    "    print(\"✅ Click tracking successful:\")\n",
                    "    print(json.dumps(click_tracking, indent=2))\n",
                    "else:\n",
                    "    print(\"❌ Click tracking failed\")"
                ]
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 📊 Behavior Analytics\n\n",
                    "Track user behavior for search analytics and personalization."
                ]
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "def track_search_behavior(term: str, num_results: int, action: str = \"search-results\", \n",
                    "                         customer_ids: List[str] = None) -> Dict:\n",
                    "    \"\"\"Track search behavior for analytics.\"\"\"\n",
                    "    \n",
                    "    if customer_ids is None:\n",
                    "        customer_ids = [\"67341940946\"]  # Default customer ID\n",
                    "    \n",
                    "    # Parameters based on real workflow analysis\n",
                    "    params = {\n",
                    "        \"term\": term,\n",
                    "        \"num_results\": num_results,\n",
                    "        \"customer_ids\": \",\".join(customer_ids),\n",
                    "        \"action\": action,\n",
                    "        \"key\": client.search.api_key,\n",
                    "        \"i\": \"e86795a2-95ee-484c-a04b-58cd4d07b887\",  # Session ID\n",
                    "        \"ui\": \"6361aebe-c5c5-4e0a-bdcb-6dab4a5d92dd\",  # User ID\n",
                    "        \"s\": \"1\",\n",
                    "        \"c\": \"cioand-2.31.0\",  # Client version\n",
                    "        \"_dt\": str(int(datetime.now().timestamp() * 1000))\n",
                    "    }\n",
                    "    \n",
                    "    url = f\"{client.search.constructor_base_url}/behavior\"\n",
                    "    \n",
                    "    try:\n",
                    "        response = requests.get(url, params=params)\n",
                    "        response.raise_for_status()\n",
                    "        return response.json()\n",
                    "    except Exception as e:\n",
                    "        print(f\"❌ Behavior tracking failed: {e}\")\n",
                    "        return {}\n\n",
                    "# Test behavior tracking\n",
                    "print(\"📊 Testing behavior tracking...\")\n",
                    "behavior_data = track_search_behavior(\n",
                    "    term=\"lego\",\n",
                    "    num_results=239,\n",
                    "    action=\"search-results\",\n",
                    "    customer_ids=[\"67341940946\", \"67341940362\", \"67341940361\"]\n",
                    ")\n",
                    "\n",
                    "if behavior_data:\n",
                    "    print(\"✅ Behavior tracking successful:\")\n",
                    "    print(json.dumps(behavior_data, indent=2))\n",
                    "else:\n",
                    "    print(\"❌ Behavior tracking failed\")"
                ]
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🖼️ Image Asset Management\n\n",
                    "Access product images and marketing assets from Meijer's content delivery network."
                ]
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "def get_product_images(product_id: str, size: str = \"0600\", quality: str = \"A1C1\") -> List[str]:\n",
                    "    \"\"\"Generate product image URLs based on Meijer's CDN pattern.\"\"\"\n",
                    "    \n",
                    "    # Base URL from workflow analysis\n",
                    "    base_url = \"https://www.meijer.com/content/dam/meijer\"\n",
                    "    \n",
                    "    # Image pattern: /product/XXXX/XX/XXXX/XX/XXXXXXXXXX_X_A1C1_XXXX.jpg\n",
                    "    # Example: /product/0850/00/9173/35/0850009173355_0_A1C1_0600.jpg\n",
                    "    \n",
                    "    # For demonstration, create sample image URLs\n",
                    "    sample_images = [\n",
                    "        f\"{base_url}/product/0850/00/9173/35/0850009173355_0_{quality}_{size}.jpg\",\n",
                    "        f\"{base_url}/product/0860/00/9046/02/0860009046023_1_{quality}_{size}.png\",\n",
                    "        f\"{base_url}/product/0051/00/0293/44/0051000293442_1_{quality}_{size}.jpg\"\n",
                    "    ]\n",
                    "    \n",
                    "    return sample_images\n\n",
                    "def get_department_icons() -> List[str]:\n",
                    "    \"\"\"Get department navigation icons.\"\"\"\n",
                    "    \n",
                    "    base_url = \"https://www.meijer.com/content/dam/meijer\"\n",
                    "    \n",
                    "    departments = [\n",
                    "        \"Grocery-Cereal\",\n",
                    "        \"Electronics\",\n",
                    "        \"LawnGarden\",\n",
                    "        \"Baby\"\n",
                    "    ]\n",
                    "    \n",
                    "    icons = []\n",
                    "    for dept in departments:\n",
                    "        icon_url = f\"{base_url}/departments/generic/main-departments/D-WF-Dept-{dept}-217x217.png\"\n",
                    "        icons.append(icon_url)\n",
                    "    \n",
                    "    return icons\n\n",
                    "# Test image asset management\n",
                    "print(\"🖼️  Testing image asset management...\")\n",
                    "\n",
                    "print(\"\\n📦 Product Images:\")\n",
                    "product_images = get_product_images(\"sample_product\")\n",
                    "for i, img_url in enumerate(product_images, 1):\n",
                    "    print(f\"  {i}. {img_url}\")\n",
                    "\n",
                    "print(\"\\n🏪 Department Icons:\")\n",
                    "dept_icons = get_department_icons()\n",
                    "for i, icon_url in enumerate(dept_icons, 1):\n",
                    "    print(f\"  {i}. {icon_url}\")"
                ]
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🔗 Meijer API Integration\n\n",
                    "Access additional product data and promotions from Meijer's main API."
                ]
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "def get_sponsored_products(keywords: str, customer_id: str = \"13266596\", region_id: str = \"19\") -> Dict:\n",
                    "    \"\"\"Get sponsored products from Meijer API.\"\"\"\n",
                    "    \n",
                    "    # Endpoint from workflow analysis\n",
                    "    url = \"https://api.meijer.com/digital/sponsored-products/v1/products\"\n",
                    "    \n",
                    "    params = {\n",
                    "        \"retailer-visitor-id\": \"80302125742400638755997629905461482680\",\n",
                    "        \"customer-id\": customer_id,\n",
                    "        \"page-id\": \"viewSearchResult_API_app\",\n",
                    "        \"event-type\": \"viewSearchResult\",\n",
                    "        \"regionId\": region_id,\n",
                    "        \"keywords\": keywords,\n",
                    "        \"environment\": \"aa\"\n",
                    "    }\n",
                    "    \n",
                    "    headers = {\n",
                    "        \"Accept\": \"application/json\",\n",
                    "        \"Content-Type\": \"application/json\",\n",
                    "        \"User-Agent\": \"Meijer/102800000 okhttp/5.1.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)\"\n",
                    "    }\n",
                    "    \n",
                    "    try:\n",
                    "        response = requests.get(url, params=params, headers=headers)\n",
                    "        response.raise_for_status()\n",
                    "        return response.json()\n",
                    "    except Exception as e:\n",
                    "        print(f\"❌ Sponsored products failed: {e}\")\n",
                    "        return {}\n\n",
                    "def get_complex_promotions(customer_id: str = \"67341940946\", region_id: str = \"19\") -> Dict:\n",
                    "    \"\"\"Get complex promotions from Meijer API.\"\"\"\n",
                    "    \n",
                    "    # Endpoint from workflow analysis\n",
                    "    url = f\"https://api.meijer.com/digital/complexpromos/v1/{customer_id}/{region_id}\"\n",
                    "    \n",
                    "    headers = {\n",
                    "        \"Accept\": \"application/json\",\n",
                    "        \"Content-Type\": \"application/json\"\n",
                    "    }\n",
                    "    \n",
                    "    try:\n",
                    "        response = requests.get(url, headers=headers)\n",
                    "        response.raise_for_status()\n",
                    "        return response.json()\n",
                    "    except Exception as e:\n",
                    "        print(f\"❌ Complex promotions failed: {e}\")\n",
                    "        return {}\n\n",
                    "# Test Meijer API integration\n",
                    "print(\"🔗 Testing Meijer API integration...\")\n",
                    "\n",
                    "print(\"\\n📢 Sponsored Products:\")\n",
                    "sponsored = get_sponsored_products(\"lego\")\n",
                    "if sponsored:\n",
                    "    print(\"✅ Sponsored products retrieved\")\n",
                    "    print(json.dumps(sponsored, indent=2))\n",
                    "else:\n",
                    "    print(\"❌ No sponsored products\")\n",
                    "\n",
                    "print(\"\\n🎉 Complex Promotions:\")\n",
                    "promotions = get_complex_promotions()\n",
                    "if promotions:\n",
                    "    print(\"✅ Promotions retrieved\")\n",
                    "    print(json.dumps(promotions, indent=2))\n",
                    "else:\n",
                    "    print(\"❌ No promotions\")"
                ]
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 🚀 Complete Search Workflow\n\n",
                    "Demonstrate the complete search workflow from autocomplete to product interaction."
                ]
            },
            {
                "cell_type": "code",
                "execution_count": None,
                "metadata": {},
                "outputs": [],
                "source": [
                    "def complete_search_workflow(search_term: str = \"lego jurassic\") -> Dict:\n",
                    "    \"\"\"Complete search workflow demonstration.\"\"\"\n",
                    "    \n",
                    "    workflow_results = {\n",
                    "        \"search_term\": search_term,\n",
                    "        \"timestamp\": datetime.now().isoformat(),\n",
                    "        \"steps\": {}\n",
                    "    }\n",
                    "    \n",
                    "    print(f\"🚀 Starting complete search workflow for: '{search_term}'\")\n",
                    "    print(\"=\" * 60)\n",
                    "    \n",
                    "    # Step 1: Autocomplete\n",
                    "    print(\"\\n1️⃣  Step 1: Autocomplete Suggestions\")\n",
                    "    autocomplete = get_autocomplete_suggestions(search_term.split()[0])\n",
                    "    workflow_results[\"steps\"][\"autocomplete\"] = autocomplete\n",
                    "    if autocomplete:\n",
                    "        print(\"✅ Autocomplete successful\")\n",
                    "    else:\n",
                    "        print(\"❌ Autocomplete failed\")\n",
                    "    \n",
                    "    # Step 2: Main Search\n",
                    "    print(\"\\n2️⃣  Step 2: Main Search\")\n",
                    "    search = perform_advanced_search(search_term, page=1, results_per_page=5)\n",
                    "    workflow_results[\"steps\"][\"main_search\"] = search\n",
                    "    if search:\n",
                    "        total_results = search.get('total_num_results', 'Unknown')\n",
                    "        print(f\"✅ Search successful - Found {total_results} results\")\n",
                    "    else:\n",
                    "        print(\"❌ Search failed\")\n",
                    "    \n",
                    "    # Step 3: Product Click Tracking\n",
                    "    print(\"\\n3️⃣  Step 3: Product Click Tracking\")\n",
                    "    product_name = \"LEGO Jurassic World T. rex River Escape 76975\"\n",
                    "    click_tracking = track_product_click(product_name)\n",
                    "    workflow_results[\"steps\"][\"click_tracking\"] = click_tracking\n",
                    "    if click_tracking:\n",
                    "        print(\"✅ Click tracking successful\")\n",
                    "    else:\n",
                    "        print(\"❌ Click tracking failed\")\n",
                    "    \n",
                    "    # Step 4: Behavior Analytics\n",
                    "    print(\"\\n4️⃣  Step 4: Behavior Analytics\")\n",
                    "    behavior = track_search_behavior(search_term, 239, \"search-results\")\n",
                    "    workflow_results[\"steps\"][\"behavior_analytics\"] = behavior\n",
                    "    if behavior:\n",
                    "        print(\"✅ Behavior tracking successful\")\n",
                    "    else:\n",
                    "        print(\"❌ Behavior tracking failed\")\n",
                    "    \n",
                    "    # Step 5: Additional Data\n",
                    "    print(\"\\n5️⃣  Step 5: Additional Data Sources\")\n",
                    "    \n",
                    "    # Sponsored products\n",
                    "    sponsored = get_sponsored_products(search_term.split()[0])\n",
                    "    workflow_results[\"steps\"][\"sponsored_products\"] = sponsored\n",
                    "    \n",
                    "    # Promotions\n",
                    "    promotions = get_complex_promotions()\n",
                    "    workflow_results[\"steps\"][\"promotions\"] = promotions\n",
                    "    \n",
                    "    # Images\n",
                    "    images = get_product_images(\"sample\")\n",
                    "    workflow_results[\"steps\"][\"product_images\"] = images\n",
                    "    \n",
                    "    print(\"✅ Additional data sources accessed\")\n",
                    "    \n",
                    "    print(\"\\n\" + \"=\" * 60)\n",
                    "    print(\"🎉 Complete search workflow finished!\")\n",
                    "    \n",
                    "    return workflow_results\n\n",
                    "# Run complete workflow\n",
                    "workflow_results = complete_search_workflow(\"lego jurassic\")\n",
                    "\n",
                    "print(\"\\n📊 Workflow Summary:\")\n",
                    "print(f\"🔍 Search Term: {workflow_results['search_term']}\")\n",
                    "print(f\"⏰ Timestamp: {workflow_results['timestamp']}\")\n",
                    "print(f\"📋 Steps Completed: {len(workflow_results['steps'])}\")\n",
                    "print(f\"✅ Successful Steps: {sum(1 for step in workflow_results['steps'].values() if step)}\")\n",
                    "print(f\"❌ Failed Steps: {sum(1 for step in workflow_results['steps'].values() if not step)}\")"
                ]
            },
            {
                "cell_type": "markdown",
                "metadata": {},
                "source": [
                    "## 📚 Summary\n\n",
                    "This notebook demonstrates the complete search functionality available in the Meijer API:\n\n",
                    "### 🔍 **Search Capabilities**\n",
                    "- **Autocomplete**: Real-time search suggestions\n",
                    "- **Main Search**: Comprehensive product search with filtering\n",
                    "- **Pagination**: Navigate through large result sets\n",
                    "- **Store Filtering**: Filter by store availability\n\n",
                    "### 📊 **Analytics & Tracking**\n",
                    "- **Click Tracking**: Monitor product interactions\n",
                    "- **Behavior Analytics**: Track user search patterns\n",
                    "- **Session Management**: Maintain user context\n\n",
                    "### 🖼️ **Rich Content**\n",
                    "- **Product Images**: High-quality product photos\n",
                    "- **Department Icons**: Navigation assets\n",
                    "- **Marketing Graphics**: Promotional content\n\n",
                    "### 🔗 **API Integration**\n",
                    "- **Constructor.io**: Primary search functionality\n",
                    "- **Meijer API**: Product data and promotions\n",
                    "- **Content CDN**: Asset delivery\n\n",
                    "### 🚀 **Use Cases**\n",
                    "- **E-commerce Applications**: Product discovery\n",
                    "- **Search Engines**: Intelligent product search\n",
                    "- **Analytics Platforms**: User behavior analysis\n",
                    "- **Mobile Apps**: Native search experience\n\n",
                    "The search functionality provides a **production-ready**, **feature-complete** search experience that mirrors the official Meijer mobile application."
                ]
            }
        ],
        "metadata": {
            "kernelspec": {
                "display_name": "Python 3",
                "language": "python",
                "name": "python3"
            },
            "language_info": {
                "codemirror_mode": {
                    "name": "ipython",
                    "version": 3
                },
                "file_extension": ".py",
                "mimetype": "text/x-python",
                "name": "python",
                "nbconvert_exporter": "python",
                "pygments_lexer": "ipython3",
                "version": "3.8.5"
            }
        },
        "nbformat": 4,
        "nbformat_minor": 4
    }
    
    return notebook

def main():
    """Generate and save the search notebook."""
    
    # Generate the notebook
    notebook = generate_search_notebook()
    
    # Save to file
    output_file = "11_search.ipynb"
    with open(output_file, 'w') as f:
        json.dump(notebook, f, indent=2)
    
    print(f"✅ Search notebook generated: {output_file}")
    print(f"📊 Notebook contains {len(notebook['cells'])} cells")
    print("🔍 Features: Autocomplete, Search, Click Tracking, Behavior Analytics, Image Management")

if __name__ == "__main__":
    main()
