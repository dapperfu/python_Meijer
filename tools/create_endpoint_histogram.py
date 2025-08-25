#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Create visual histogram of most frequently hit missing endpoints
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: matplotlib, json, typing
 */

Endpoint Frequency Histogram Generator

This script creates a visual histogram of the most frequently hit missing endpoints
to help prioritize implementation efforts.
"""

import json
import matplotlib.pyplot as plt
import matplotlib.patches as mpatches
from typing import Dict, Any


def load_endpoint_data(filename: str = "endpoint_gaps_report.json") -> Dict[str, Any]:
    """Load endpoint analysis data from JSON file."""
    try:
        with open(filename, 'r') as f:
            return json.load(f)
    except FileNotFoundError:
        print(f"❌ File not found: {filename}")
        print("💡 Run tools/endpoint_frequency_analyzer.py first to generate the report")
        return {}
    except json.JSONDecodeError as e:
        print(f"❌ Error parsing JSON: {e}")
        return {}


def create_endpoint_histogram(data: Dict[str, Any], top_n: int = 20) -> None:
    """Create a histogram of the most frequently hit missing endpoints."""
    if not data or "missing_endpoints_by_frequency" not in data:
        print("❌ No endpoint data found")
        return
        
    endpoints = data["missing_endpoints_by_frequency"][:top_n]
    
    if not endpoints:
        print("❌ No missing endpoints found")
        return
        
    # Extract data for plotting
    endpoint_names = []
    hit_counts = []
    categories = []
    priority_scores = []
    
    for endpoint_data in endpoints:
        # Truncate long endpoint names for display
        endpoint_name = endpoint_data["endpoint"]
        if len(endpoint_name) > 50:
            endpoint_name = endpoint_name[:47] + "..."
        endpoint_names.append(endpoint_name)
        
        hit_counts.append(endpoint_data["count"])
        categories.append(endpoint_data["category"])
        priority_scores.append(endpoint_data.get("priority_score", 0))
    
    # Create color mapping for categories
    category_colors = {
        "cart": "#FF6B6B",      # Red
        "search": "#4ECDC4",    # Teal
        "mperks": "#45B7D1",    # Blue
        "auth": "#96CEB4",      # Green
        "other": "#FFEAA7"      # Yellow
    }
    
    colors = [category_colors.get(cat, "#DDA0DD") for cat in categories]
    
    # Create the figure and axis
    fig, (ax1, ax2) = plt.subplots(2, 1, figsize=(16, 12))
    fig.suptitle("Meijer API: Most Frequently Hit Missing Endpoints", fontsize=16, fontweight='bold')
    
    # Plot 1: Hit Count Histogram
    bars1 = ax1.barh(range(len(endpoint_names)), hit_counts, color=colors, alpha=0.8)
    ax1.set_yticks(range(len(endpoint_names)))
    ax1.set_yticklabels(endpoint_names, fontsize=10)
    ax1.set_xlabel("Number of Hits", fontsize=12, fontweight='bold')
    ax1.set_title("Endpoint Hit Frequency", fontsize=14, fontweight='bold')
    ax1.grid(axis='x', alpha=0.3)
    
    # Add value labels on bars
    for i, (bar, count) in enumerate(zip(bars1, hit_counts)):
        width = bar.get_width()
        ax1.text(width + 1, bar.get_y() + bar.get_height()/2, 
                f'{count}', ha='left', va='center', fontweight='bold')
    
    # Plot 2: Priority Score Histogram
    bars2 = ax2.barh(range(len(endpoint_names)), priority_scores, color=colors, alpha=0.8)
    ax2.set_yticks(range(len(endpoint_names)))
    ax2.set_yticklabels(endpoint_names, fontsize=10)
    ax2.set_xlabel("Priority Score", fontsize=12, fontweight='bold')
    ax2.set_title("Implementation Priority Score", fontsize=14, fontweight='bold')
    ax2.grid(axis='x', alpha=0.3)
    
    # Add value labels on bars
    for i, (bar, score) in enumerate(zip(bars2, priority_scores)):
        width = bar.get_width()
        ax2.text(width + 0.5, bar.get_y() + bar.get_height()/2, 
                f'{score:.1f}', ha='left', va='center', fontweight='bold')
    
    # Create legend
    legend_elements = [mpatches.Patch(color=color, label=cat.title()) 
                      for cat, color in category_colors.items()]
    ax1.legend(handles=legend_elements, loc='upper right', title="Categories")
    
    # Adjust layout
    plt.tight_layout()
    
    # Save the plot
    output_file = "endpoint_frequency_histogram.png"
    plt.savefig(output_file, dpi=300, bbox_inches='tight')
    print(f"✅ Histogram saved to: {output_file}")
    
    # Display the plot
    plt.show()


def create_category_breakdown(data: Dict[str, Any]) -> None:
    """Create a pie chart showing the breakdown of missing endpoints by category."""
    if not data or "missing_endpoints_by_category" not in data:
        return
        
    categories = data["missing_endpoints_by_category"]
    
    # Count endpoints per category
    category_counts = {cat: len(endpoints) for cat, endpoints in categories.items()}
    
    if not category_counts:
        return
        
    # Create pie chart
    fig, ax = plt.subplots(figsize=(10, 8))
    fig.suptitle("Missing Endpoints by Category", fontsize=16, fontweight='bold')
    
    # Colors for categories
    colors = ['#FF6B6B', '#4ECDC4', '#45B7D1', '#96CEB4', '#FFEAA7', '#DDA0DD']
    
    wedges, texts, autotexts = ax.pie(
        list(category_counts.values()),
        labels=list(category_counts.keys()),
        autopct='%1.1f%%',
        colors=colors[:len(category_counts)],
        startangle=90
    )
    
    # Enhance text appearance
    for autotext in autotexts:
        autotext.set_color('white')
        autotext.set_fontweight('bold')
    
    ax.axis('equal')
    
    # Save the plot
    output_file = "endpoint_categories_pie.png"
    plt.savefig(output_file, dpi=300, bbox_inches='tight')
    print(f"✅ Category breakdown saved to: {output_file}")
    
    # Display the plot
    plt.show()


def create_implementation_roadmap(data: Dict[str, Any]) -> None:
    """Create a timeline visualization of the implementation roadmap."""
    if not data or "implementation_priority" not in data:
        return
        
    # Define phases and their timeframes
    phases = {
        "Phase 1: Cart & Orders": {"weeks": "1-2", "endpoints": [], "color": "#FF6B6B"},
        "Phase 2: Home Cards": {"weeks": "3-4", "endpoints": [], "color": "#4ECDC4"},
        "Phase 3: Advanced Features": {"weeks": "5-6", "endpoints": [], "color": "#45B7D1"},
        "Phase 4: Specialized": {"weeks": "7-8", "endpoints": [], "color": "#96CEB4"}
    }
    
    # Categorize endpoints by priority score
    priority_endpoints = data["implementation_priority"]
    
    for endpoint_data in priority_endpoints:
        score = endpoint_data.get("priority_score", 0)
        if score >= 80:
            phases["Phase 1: Cart & Orders"]["endpoints"].append(endpoint_data)
        elif score >= 70:
            phases["Phase 2: Home Cards"]["endpoints"].append(endpoint_data)
        elif score >= 60:
            phases["Phase 3: Advanced Features"]["endpoints"].append(endpoint_data)
        else:
            phases["Phase 4: Specialized"]["endpoints"].append(endpoint_data)
    
    # Create timeline visualization
    fig, ax = plt.subplots(figsize=(16, 10))
    fig.suptitle("8-Week Implementation Roadmap", fontsize=16, fontweight='bold')
    
    y_positions = list(range(len(phases)))
    phase_names = list(phases.keys())
    
    # Create timeline bars
    for i, (phase_name, phase_data) in enumerate(phases.items()):
        color = phase_data["color"]
        endpoint_count = len(phase_data["endpoints"])
        
        # Create timeline bar
        ax.barh(i, 2, color=color, alpha=0.8, height=0.6)
        
        # Add phase label
        ax.text(-0.5, i, f"{phase_name}\n({phase_data['weeks']})", 
                ha='right', va='center', fontweight='bold', fontsize=12)
        
        # Add endpoint count
        ax.text(1.0, i, f"{endpoint_count} endpoints", 
                ha='left', va='center', fontweight='bold', fontsize=11)
        
        # Add sample endpoints
        if phase_data["endpoints"]:
            sample_endpoint = phase_data["endpoints"][0]["endpoint"]
            if len(sample_endpoint) > 40:
                sample_endpoint = sample_endpoint[:37] + "..."
            ax.text(2.5, i, f"Sample: {sample_endpoint}", 
                    ha='left', va='center', fontsize=9, style='italic')
    
    # Customize the plot
    ax.set_xlim(-1, 8)
    ax.set_ylim(-0.5, len(phases) - 0.5)
    ax.set_xlabel("Timeline (Weeks)", fontsize=12, fontweight='bold')
    ax.set_title("Implementation Phases and Endpoint Distribution", fontsize=14, fontweight='bold')
    
    # Remove y-axis ticks and labels
    ax.set_yticks([])
    ax.set_yticklabels([])
    
    # Add grid
    ax.grid(axis='x', alpha=0.3)
    
    # Save the plot
    output_file = "implementation_roadmap.png"
    plt.savefig(output_file, dpi=300, bbox_inches='tight')
    print(f"✅ Implementation roadmap saved to: {output_file}")
    
    # Display the plot
    plt.show()


def main():
    """Main function to generate all visualizations."""
    print("📊 Meijer API Endpoint Visualization Generator")
    print("=" * 50)
    
    # Load data
    print("📁 Loading endpoint analysis data...")
    data = load_endpoint_data()
    
    if not data:
        print("❌ Failed to load data. Exiting.")
        return
    
    print(f"✅ Loaded data for {data.get('summary', {}).get('total_missing', 0)} missing endpoints")
    
    # Generate visualizations
    print("\n🎨 Generating visualizations...")
    
    try:
        # Create main histogram
        print("  📈 Creating endpoint frequency histogram...")
        create_endpoint_histogram(data)
        
        # Create category breakdown
        print("  🥧 Creating category breakdown...")
        create_category_breakdown(data)
        
        # Create implementation roadmap
        print("  🗓️ Creating implementation roadmap...")
        create_implementation_roadmap(data)
        
        print("\n✅ All visualizations generated successfully!")
        print("📁 Files created:")
        print("  - endpoint_frequency_histogram.png")
        print("  - endpoint_categories_pie.png")
        print("  - implementation_roadmap.png")
        
    except Exception as e:
        print(f"❌ Error generating visualizations: {e}")
        print("💡 Make sure matplotlib is installed: pip install matplotlib")


if __name__ == "__main__":
    main()
