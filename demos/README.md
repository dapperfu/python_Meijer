# Meijer API Demos

This folder contains simple, focused demos for the Meijer API client.

## Prerequisites

1. **Authentication**: Create `~/.config/meijer.txt` with your Meijer credentials:
   ```json
   {
     "access_token": "your_bearer_token_here",
     "refresh_token": "your_refresh_token_here"
   }
   ```

2. **Installation**: Make sure the `meijer` package is installed in your environment.

## Demo Files

### `demo_all.py` - Comprehensive Demo
Shows all major functionality in one place:
- Authentication
- Shopping lists
- Coupons
- Search
- mPerks
- Stores

**Usage**: `python demo_all.py`

### `demo_mperks.py` - mPerks Demo
Focuses on mPerks earned rewards functionality:
- Earned rewards
- mCard info
- Available rewards
- Reward categories

**Usage**: `python demo_mperks.py`

### `demo_shopping_list.py` - Shopping List Demo
Demonstrates shopping list management:
- Get current list
- Add items (string and UPC)
- Complete items
- Favorites management

**Usage**: `python demo_shopping_list.py`

### `demo_coupons.py` - Coupons Demo
Shows coupon functionality:
- Get available coupons
- Get clipped coupons
- Clip/unclip coupons
- Get offers

**Usage**: `python demo_coupons.py`

### `demo_search.py` - Search Demo
Demonstrates search capabilities:
- Product search
- Barcode lookup
- Store search

**Usage**: `python demo_search.py`

## Running Demos

All demos assume `~/.config/meijer.txt` exists and contains valid authentication. The `Meijer()` constructor will automatically load from this file.

```bash
# From the demos directory
cd demos

# Run comprehensive demo
python demo_all.py

# Run specific functionality demo
python demo_mperks.py
python demo_shopping_list.py
python demo_coupons.py
python demo_search.py
```

## Demo Features

- **Simple and focused**: Each demo shows one area of functionality
- **Error handling**: Graceful error handling with informative messages
- **Authentication check**: Verifies authentication before proceeding
- **Limited output**: Shows only first few results to keep output manageable
- **Emoji indicators**: Visual feedback for different operations

## Troubleshooting

- **Authentication errors**: Check that `~/.config/meijer.txt` exists and contains valid tokens
- **Import errors**: Ensure the `meijer` package is properly installed
- **API errors**: Some endpoints may require specific permissions or may be rate-limited
