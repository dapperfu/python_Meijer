#!/usr/bin/env python3
"""
/**
 * This code written by Claude Sonnet 4 (claude-3-5-sonnet-20241022)
 * Generated via Cursor IDE (cursor.sh) with AI assistance
 * Model: Anthropic Claude 3.5 Sonnet
 * Generation timestamp: 2024-12-19
 * Context: Automated price monitoring script for cron execution
 *
 * Technical details:
 * - LLM: Claude 3.5 Sonnet (2024-10-22)
 * - IDE: Cursor (cursor.sh)
 * - Generation method: AI-assisted pair programming
 * - Code style: Python with full mypy typing and numpy-style docstrings
 * - Dependencies: price_monitor package, logging, pathlib, json
 */

Automated price monitoring script for cron execution.

This script can be run from cron to automatically execute all configured
price monitors and track price changes over time.
"""

import json
import logging
import sys
from datetime import datetime
from pathlib import Path
from typing import Dict, Any, List

# Add the project root to the Python path
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from price_monitor.core import PriceMonitor


def setup_logging(log_file: Path) -> None:
    """
    Set up logging configuration for automated execution.
    
    Parameters
    ----------
    log_file : Path
        Path to the log file
    """
    # Create log directory if it doesn't exist
    log_file.parent.mkdir(parents=True, exist_ok=True)
    
    # Configure logging
    logging.basicConfig(
        level=logging.INFO,
        format='%(asctime)s - %(name)s - %(levelname)s - %(message)s',
        handlers=[
            logging.FileHandler(log_file),
            logging.StreamHandler(sys.stdout)
        ]
    )


def run_all_monitors(price_monitor: PriceMonitor) -> Dict[str, Any]:
    """
    Run all configured price monitors.
    
    Parameters
    ----------
    price_monitor : PriceMonitor
        Initialized price monitor instance
    
    Returns
    -------
    Dict[str, Any]
        Summary of all monitor executions
    """
    monitors = price_monitor.list_monitors()
    
    if not monitors:
        logging.warning("No price monitors configured")
        return {"total_monitors": 0, "results": {}}
    
    logging.info(f"Running {len(monitors)} configured monitors")
    
    results = {}
    total_products = 0
    total_stores = 0
    
    for monitor_id, config in monitors.items():
        if not config.get('enabled', True):
            logging.info(f"Skipping disabled monitor: {config['name']}")
            continue
        
        try:
            logging.info(f"Running monitor: {config['name']} (ID: {monitor_id})")
            logging.info(f"Search query: {config['search_query']}")
            logging.info(f"Stores: {len(config['stores'])}")
            
            # Run the monitor
            monitor_results = price_monitor.run_monitor(monitor_id)
            
            results[monitor_id] = {
                'name': config['name'],
                'status': 'success',
                'products_found': monitor_results['products_found'],
                'stores_scanned': monitor_results['stores_scanned'],
                'errors': monitor_results['errors'],
                'timestamp': monitor_results['timestamp']
            }
            
            total_products += monitor_results['products_found']
            total_stores += monitor_results['stores_scanned']
            
            logging.info(f"Monitor '{config['name']}' completed: {monitor_results['products_found']} products found")
            
        except Exception as e:
            logging.error(f"Failed to run monitor '{config['name']}': {e}")
            results[monitor_id] = {
                'name': config['name'],
                'status': 'error',
                'error': str(e),
                'timestamp': datetime.now().isoformat()
            }
    
    summary = {
        'total_monitors': len(monitors),
        'monitors_run': len([r for r in results.values() if r['status'] == 'success']),
        'total_products_found': total_products,
        'total_stores_scanned': total_stores,
        'execution_timestamp': datetime.now().isoformat(),
        'results': results
    }
    
    return summary


def save_execution_summary(summary: Dict[str, Any], output_dir: Path) -> None:
    """
    Save execution summary to a JSON file.
    
    Parameters
    ----------
    summary : Dict[str, Any]
        Execution summary to save
    output_dir : Path
        Directory to save the summary file
    """
    output_dir.mkdir(parents=True, exist_ok=True)
    
    timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
    filename = f"execution_summary_{timestamp}.json"
    filepath = output_dir / filename
    
    try:
        with open(filepath, 'w') as f:
            json.dump(summary, f, indent=2)
        logging.info(f"Execution summary saved to: {filepath}")
    except Exception as e:
        logging.error(f"Failed to save execution summary: {e}")


def check_clearance_deals(price_monitor: PriceMonitor, min_discount: float = 20.0) -> List[Dict[str, Any]]:
    """
    Check for clearance deals and log significant findings.
    
    Parameters
    ----------
    price_monitor : PriceMonitor
        Initialized price monitor instance
    min_discount : float
        Minimum discount percentage to consider
    
    Returns
    -------
    List[Dict[str, Any]]
        List of clearance deals found
    """
    logging.info(f"Checking for clearance deals with {min_discount}%+ discount")
    
    try:
        deals = price_monitor.find_clearance_deals(min_discount_percent=min_discount)
        
        if deals:
            logging.info(f"Found {len(deals)} clearance deals:")
            for deal in deals:
                logging.info(
                    f"  • Product {deal['product_id']} at store {deal['store_id']}: "
                    f"${deal['oldest_price']:.2f} → ${deal['current_price']:.2f} "
                    f"({deal['discount_percent']:.1f}% off, ${deal['price_drop']:.2f} savings)"
                )
        else:
            logging.info(f"No clearance deals found with {min_discount}%+ discount")
        
        return deals
        
    except Exception as e:
        logging.error(f"Failed to check clearance deals: {e}")
        return []


def main():
    """Main execution function."""
    # Configuration
    data_dir = Path("./price_data")
    log_dir = data_dir / "logs"
    output_dir = data_dir / "executions"
    
    # Set up logging
    log_file = log_dir / f"price_monitor_{datetime.now().strftime('%Y%m%d')}.log"
    setup_logging(log_file)
    
    logging.info("=" * 60)
    logging.info("Starting automated price monitoring execution")
    logging.info("=" * 60)
    
    try:
        # Initialize price monitor
        logging.info("Initializing price monitor...")
        price_monitor = PriceMonitor(data_dir)
        
        # Run all monitors
        logging.info("Executing configured price monitors...")
        summary = run_all_monitors(price_monitor)
        
        # Save execution summary
        logging.info("Saving execution summary...")
        save_execution_summary(summary, output_dir)
        
        # Check for clearance deals
        logging.info("Checking for clearance deals...")
        deals = check_clearance_deals(price_monitor)
        
        # Log final summary
        logging.info("=" * 60)
        logging.info("Price monitoring execution completed")
        logging.info(f"Total monitors: {summary['total_monitors']}")
        logging.info(f"Monitors run successfully: {summary['monitors_run']}")
        logging.info(f"Total products found: {summary['total_products_found']}")
        logging.info(f"Total stores scanned: {summary['total_stores_scanned']}")
        logging.info(f"Clearance deals found: {len(deals)}")
        logging.info("=" * 60)
        
        # Exit with appropriate code
        if summary['monitors_run'] == summary['total_monitors']:
            sys.exit(0)  # Success
        else:
            sys.exit(1)  # Some monitors failed
            
    except Exception as e:
        logging.error(f"Fatal error during execution: {e}", exc_info=True)
        sys.exit(1)


if __name__ == "__main__":
    main()
