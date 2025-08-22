#!/usr/bin/env python3
"""
Complete workflow to update Meijer Flask API server with latest endpoints.

This script automates the entire process:
1. Extract api.meijer.com endpoints from mitmproxy logs
2. Update the Flask API server with new endpoints
3. Generate comprehensive reports and updated code
"""

import json
import logging
import os
import sys
from datetime import datetime
from pathlib import Path
from typing import Any, Dict, List, Optional

# Import our custom tools
sys.path.append(str(Path(__file__).parent))
from extract_api_meijer_endpoints import ApiMeijerEndpointExtractor
from update_flask_api_server import FlaskApiServerUpdater


class MeijerFlaskUpdateWorkflow:
    """Complete workflow for updating Meijer Flask API server."""
    
    def __init__(self, log_file_path: str, flask_app_path: str, output_dir: str = "output"):
        self.log_file_path = Path(log_file_path)
        self.flask_app_path = Path(flask_app_path)
        self.output_dir = Path(output_dir)
        self.logger = self._setup_logging()
        
        # Workflow state
        self.extraction_results = {}
        self.update_results = {}
        self.workflow_summary = {}
        
    def _setup_logging(self) -> logging.Logger:
        """Setup logging configuration."""
        logging.basicConfig(
            level=logging.INFO,
            format='%(asctime)s - %(levelname)s - %(message)s'
        )
        return logging.getLogger(__name__)
    
    def run_workflow(self) -> bool:
        """Run the complete workflow."""
        self.logger.info("🚀 Starting Meijer Flask API update workflow")
        
        # Create output directory
        self.output_dir.mkdir(parents=True, exist_ok=True)
        
        # Step 1: Extract endpoints
        if not self._extract_endpoints():
            self.logger.error("❌ Endpoint extraction failed")
            return False
        
        # Step 2: Update Flask server
        if not self._update_flask_server():
            self.logger.error("❌ Flask server update failed")
            return False
        
        # Step 3: Generate final report
        self._generate_workflow_report()
        
        self.logger.info("✅ Workflow completed successfully")
        return True
    
    def _extract_endpoints(self) -> bool:
        """Step 1: Extract endpoints from mitmproxy logs."""
        self.logger.info("📊 Step 1: Extracting api.meijer.com endpoints")
        
        try:
            # Initialize extractor
            extractor = ApiMeijerEndpointExtractor(str(self.log_file_path))
            
            # Extract endpoints
            if not extractor.extract_endpoints():
                return False
            
            # Generate timestamp for output files
            timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
            
            # Save comprehensive report
            report_file = self.output_dir / f"api_meijer_endpoints_{timestamp}.json"
            extractor.save_report(str(report_file))
            
            # Save Flask routes
            routes_file = self.output_dir / f"flask_routes_{timestamp}.py"
            extractor.save_flask_routes(str(routes_file))
            
            # Store results
            self.extraction_results = {
                'timestamp': timestamp,
                'report_file': str(report_file),
                'routes_file': str(routes_file),
                'total_endpoints': len(extractor.unique_paths),
                'categories': extractor.categorize_endpoints(),
                'endpoints': dict(extractor.endpoints)
            }
            
            self.logger.info(f"✅ Extracted {len(extractor.unique_paths)} endpoints")
            return True
            
        except Exception as e:
            self.logger.error(f"Error in endpoint extraction: {e}")
            return False
    
    def _update_flask_server(self) -> bool:
        """Step 2: Update Flask API server with new endpoints."""
        self.logger.info("🐍 Step 2: Updating Flask API server")
        
        try:
            # Get the latest extraction report
            report_files = list(self.output_dir.glob("api_meijer_endpoints_*.json"))
            if not report_files:
                self.logger.error("No extraction report found")
                return False
            
            # Use the most recent report
            latest_report = max(report_files, key=lambda x: x.stat().st_mtime)
            
            # Initialize updater
            updater = FlaskApiServerUpdater(str(self.flask_app_path), str(latest_report))
            
            # Load existing app
            if not updater.load_existing_app():
                return False
            
            # Load endpoints data
            if not updater.load_endpoints_data():
                return False
            
            # Check if there are new endpoints
            if not updater.new_endpoints:
                self.logger.info("✅ No new endpoints to add - Flask app is already up to date")
                self.update_results = {
                    'new_endpoints_added': 0,
                    'status': 'up_to_date'
                }
                return True
            
            # Generate timestamp for output files
            timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
            
            # Save updated Flask app
            updated_app_file = self.output_dir / f"app_updated_{timestamp}.py"
            updater.save_updated_app(str(updated_app_file))
            
            # Save update report
            update_report_file = self.output_dir / f"flask_update_report_{timestamp}.json"
            updater.save_update_report(str(update_report_file))
            
            # Store results
            self.update_results = {
                'timestamp': timestamp,
                'updated_app_file': str(updated_app_file),
                'update_report_file': str(update_report_file),
                'new_endpoints_added': len(updater.new_endpoints),
                'new_endpoints': list(sorted(updater.new_endpoints)),
                'status': 'updated'
            }
            
            self.logger.info(f"✅ Updated Flask server with {len(updater.new_endpoints)} new endpoints")
            return True
            
        except Exception as e:
            self.logger.error(f"Error in Flask server update: {e}")
            return False
    
    def _generate_workflow_report(self) -> None:
        """Step 3: Generate comprehensive workflow report."""
        self.logger.info("📋 Step 3: Generating workflow report")
        
        # Combine all results
        self.workflow_summary = {
            'workflow_timestamp': datetime.now().isoformat(),
            'log_file_analyzed': str(self.log_file_path),
            'flask_app_updated': str(self.flask_app_path),
            'extraction_results': self.extraction_results,
            'update_results': self.update_results,
            'workflow_status': 'completed'
        }
        
        # Save workflow report
        timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
        workflow_report_file = self.output_dir / f"workflow_report_{timestamp}.json"
        
        with open(workflow_report_file, 'w') as f:
            json.dump(self.workflow_summary, f, indent=2, default=str)
        
        self.logger.info(f"📁 Workflow report saved to: {workflow_report_file}")
    
    def print_summary(self) -> None:
        """Print a summary of the workflow results."""
        print("\n" + "="*60)
        print("🎯 MEIJER FLASK API UPDATE WORKFLOW SUMMARY")
        print("="*60)
        
        # Extraction summary
        if self.extraction_results:
            print(f"\n📊 ENDPOINT EXTRACTION:")
            print(f"  Total endpoints found: {self.extraction_results.get('total_endpoints', 0)}")
            print(f"  Report file: {self.extraction_results.get('report_file', 'N/A')}")
            print(f"  Routes file: {self.extraction_results.get('routes_file', 'N/A')}")
            
            # Print categories
            categories = self.extraction_results.get('categories', {})
            if categories:
                print(f"  Categories:")
                for category, endpoints in categories.items():
                    if endpoints:
                        print(f"    {category}: {len(endpoints)} endpoints")
        
        # Update summary
        if self.update_results:
            print(f"\n🐍 FLASK SERVER UPDATE:")
            print(f"  Status: {self.update_results.get('status', 'N/A')}")
            print(f"  New endpoints added: {self.update_results.get('new_endpoints_added', 0)}")
            
            if self.update_results.get('updated_app_file'):
                print(f"  Updated app: {self.update_results.get('updated_app_file')}")
            
            if self.update_results.get('update_report_file'):
                print(f"  Update report: {self.update_results.get('update_report_file')}")
            
            # Print new endpoints
            new_endpoints = self.update_results.get('new_endpoints', [])
            if new_endpoints:
                print(f"  New endpoints:")
                for endpoint in new_endpoints:
                    print(f"    {endpoint}")
        
        print(f"\n📁 Output directory: {self.output_dir}")
        print("="*60)


def main():
    """Main function to run the workflow."""
    if len(sys.argv) < 3:
        print("Usage: python update_meijer_flask_workflow.py <log_file> <flask_app.py> [output_dir]")
        print("\nExample:")
        print("  python update_meijer_flask_workflow.py meijer.log meijer-api-flask/app.py output")
        sys.exit(1)
    
    log_file = sys.argv[1]
    flask_app = sys.argv[2]
    output_dir = sys.argv[3] if len(sys.argv) > 3 else "output"
    
    # Validate inputs
    if not Path(log_file).exists():
        print(f"❌ Log file not found: {log_file}")
        sys.exit(1)
    
    if not Path(flask_app).exists():
        print(f"❌ Flask app file not found: {flask_app}")
        sys.exit(1)
    
    # Initialize and run workflow
    workflow = MeijerFlaskUpdateWorkflow(log_file, flask_app, output_dir)
    
    if workflow.run_workflow():
        workflow.print_summary()
        print("\n✅ Workflow completed successfully!")
    else:
        print("\n❌ Workflow failed!")
        sys.exit(1)


if __name__ == "__main__":
    main()
