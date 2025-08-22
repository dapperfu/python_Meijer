#!/usr/bin/env python3
"""
UPC Barcode Generator Script

This script generates UPC barcodes from command line arguments and saves them
as a PNG image with all UPCs displayed in a grid layout.

Usage:
    ./gen_upc.py 629307040245 842595131277 822279082910 070896523112 713733252843 016000275263 046100001899

Requirements:
    - python-barcode>=0.15.1
    - Pillow>=10.0.0
"""

import sys
import argparse
from typing import List, Tuple
from pathlib import Path

try:
    import barcode
    from barcode.writer import ImageWriter
    from PIL import Image
except ImportError as e:
    print(f"Error: Missing required dependency: {e}")
    print("Please install required packages: pip install python-barcode Pillow")
    sys.exit(1)


def validate_upc(upc: str) -> bool:
    """
    Validate UPC format (12 digits).
    
    Args:
        upc: UPC string to validate
        
    Returns:
        bool: True if valid UPC format, False otherwise
    """
    if not upc.isdigit() or len(upc) != 12:
        return False
    
    # Basic UPC-A checksum validation
    digits = [int(d) for d in upc]
    odd_sum = sum(digits[i] for i in range(0, 11, 2))
    even_sum = sum(digits[i] for i in range(1, 10, 2))
    total = odd_sum * 3 + even_sum
    checksum = (10 - (total % 10)) % 10
    
    return checksum == digits[11]


def generate_upc_barcode(upc: str, output_path: str = None) -> Image.Image:
    """
    Generate a UPC barcode image.
    
    Args:
        upc: UPC string to encode
        output_path: Optional path to save individual barcode
        
    Returns:
        PIL.Image: Generated barcode image
    """
    try:
        # Generate UPC-A barcode
        upc_barcode = barcode.get('upca', upc, writer=ImageWriter())
        
        # Save to bytes to get the image
        if output_path:
            upc_barcode.save(output_path)
        
        # Convert to PIL Image using BytesIO
        from io import BytesIO
        img_buffer = BytesIO()
        upc_barcode.write(img_buffer)
        img_buffer.seek(0)
        img = Image.open(img_buffer)
        
        return img
        
    except Exception as e:
        print(f"Error generating barcode for UPC {upc}: {e}")
        return None


def create_combined_image(upcs: List[str], output_filename: str = "upc_barcodes.png") -> None:
    """
    Create a combined image with all UPC barcodes arranged in a grid.
    
    Args:
        upcs: List of UPC strings
        output_filename: Output filename for the combined image
    """
    if not upcs:
        print("No valid UPCs provided.")
        return
    
    # Generate all barcodes
    barcode_images = []
    valid_upcs = []
    
    for upc in upcs:
        if validate_upc(upc):
            img = generate_upc_barcode(upc)
            if img:
                barcode_images.append(img)
                valid_upcs.append(upc)
        else:
            print(f"Warning: Invalid UPC format '{upc}' - skipping")
    
    if not barcode_images:
        print("No valid UPCs to process.")
        return
    
    # Calculate grid dimensions
    num_barcodes = len(barcode_images)
    cols = min(3, num_barcodes)  # Max 3 columns
    rows = (num_barcodes + cols - 1) // cols
    
    # Get dimensions from first barcode
    barcode_width, barcode_height = barcode_images[0].size
    
    # Calculate total image dimensions
    total_width = cols * barcode_width
    total_height = rows * barcode_height
    
    # Create combined image
    combined_img = Image.new('RGB', (total_width, total_height), 'white')
    
    # Place barcodes in grid
    for i, img in enumerate(barcode_images):
        row = i // cols
        col = i % cols
        
        x = col * barcode_width
        y = row * barcode_height
        
        # Paste barcode
        combined_img.paste(img, (x, y))
    
    # Save combined image
    combined_img.save(output_filename)
    print(f"Generated combined UPC barcodes image: {output_filename}")
    print(f"Processed {len(valid_upcs)} valid UPCs")


def main():
    """Main function to handle command line arguments and generate barcodes."""
    parser = argparse.ArgumentParser(
        description="Generate UPC barcodes from command line arguments",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Examples:
  %(prog)s 629307040245 842595131277 822279082910
  %(prog)s 070896523112 713733252843 016000275263 046100001899
        """
    )
    
    parser.add_argument(
        'upcs',
        nargs='+',
        help='UPC codes to generate barcodes for (12-digit format)'
    )
    
    parser.add_argument(
        '-o', '--output',
        default='upc_barcodes.png',
        help='Output filename for the combined image (default: upc_barcodes.png)'
    )
    
    parser.add_argument(
        '-v', '--verbose',
        action='store_true',
        help='Verbose output'
    )
    
    args = parser.parse_args()
    
    if args.verbose:
        print(f"Processing {len(args.upcs)} UPC arguments...")
        print(f"Output file: {args.output}")
    
    # Validate all UPCs first
    invalid_upcs = [upc for upc in args.upcs if not validate_upc(upc)]
    if invalid_upcs:
        print("Warning: The following UPCs have invalid format:")
        for upc in invalid_upcs:
            print(f"  {upc}")
        print()
    
    # Generate combined image
    create_combined_image(args.upcs, args.output)
    
    if args.verbose:
        print("UPC barcode generation completed successfully!")


if __name__ == "__main__":
    main()
