# Enhanced Store Search Functionality

## Overview

This enhancement adds intelligent location parsing and geocoding capabilities to the Meijer store search functionality. The system now supports searching for stores by ZIP codes, city names, and city+state combinations, automatically converting these locations to coordinates for proximity-based store searches.

## What Was Fixed

- **No more hardcoded GPS coordinates**: The system now uses proper Google Maps Geocoding API instead of hardcoded coordinate dictionaries
- **Intelligent location parsing**: Automatically detects and parses various location formats
- **Universal ZIP code support**: Works with ZIP codes from any state, not just Michigan
- **Proper geocoding service**: Uses Google's official geocoding API for accurate coordinate conversion

## How It Works

### 1. Location Input Parsing

The `search_by_location()` method intelligently parses location strings:

- **ZIP Code**: `"46755"` → Automatically detected as 5-digit ZIP
- **City, State**: `"Kendallville, IN"` → Parsed as city and state
- **City State**: `"Kendallville IN"` → Parsed as city and state abbreviation
- **City Only**: `"Kendallville"` → Treated as city name

### 2. Geocoding Service

The system uses Google Maps Geocoding API to convert locations to coordinates:

- **No fallback service**: The system requires a valid Google Maps API key
- **Real-time geocoding**: All coordinates are obtained from Google's API
- **Accurate results**: Uses official Google geocoding data

### 3. Store Search Flow

1. Parse location input (ZIP, city, state)
2. Convert location to coordinates via Google Maps API
3. Search Meijer stores within specified radius
4. Filter results by required services (if specified)
5. Return stores with distance information

## Configuration

### Google Maps API Key

**Required**: Set the `GOOGLE_MAPS_API_KEY` environment variable:

```bash
export GOOGLE_MAPS_API_KEY="your_google_maps_api_key_here"
```

Or pass it directly when creating the geocoding service:

```python
from meijer.geocoding import get_geocoding_service
geocoder = get_geocoding_service("your_api_key")
```

### API Key Setup

1. Go to [Google Cloud Console](https://console.cloud.google.com/)
2. Create a new project or select existing one
3. Enable the Geocoding API
4. Create credentials (API key)
5. Set the API key in your environment

## Usage Examples

### Basic Location Search

```python
from meijer import Meijer

meijer = Meijer()
stores = meijer.client.search_by_location("Kendallville, IN", radius=100)
```

### ZIP Code Search

```python
stores = meijer.client.search_by_location("46755", radius=50)
```

### City + State Search

```python
stores = meijer.client.search_by_location("Fort Wayne IN", radius=75)
```

### Direct Store Search

```python
# Search by city and state
stores = meijer.client.get_stores(city="Kendallville", state="IN", radius=100)

# Search by ZIP code
stores = meijer.client.get_stores(zip_code="46755", radius=100)

# Search by coordinates
stores = meijer.client.get_stores(latitude=41.4414, longitude=-85.2650, radius=100)
```

## Supported Location Formats

| Format | Example | Description |
|--------|---------|-------------|
| ZIP Code | `"46755"` | 5-digit ZIP code |
| City, State | `"Kendallville, IN"` | City name with comma and state |
| City State | `"Kendallville IN"` | City name with space and state abbreviation |
| City Only | `"Kendallville"` | City name only (less accurate) |

## Testing

### Test the Enhanced Search

```python
# Test script to verify functionality
python test_enhanced_store_search.py
```

### Test Geocoding Service

```python
# Test the geocoding service directly
python debug_geocoding.py
```

## Performance Considerations

- **API Rate Limits**: Google Maps API has rate limits (varies by plan)
- **Caching**: Consider implementing coordinate caching for frequently searched locations
- **Error Handling**: System gracefully handles API failures and missing keys

## Troubleshooting

### Common Issues

1. **"Geocoding service not available"**
   - Set `GOOGLE_MAPS_API_KEY` environment variable
   - Verify API key is valid and has Geocoding API enabled

2. **"Request denied" errors**
   - Check API key permissions
   - Verify billing is enabled on Google Cloud project

3. **No stores found**
   - Check if location is valid
   - Verify radius is appropriate for the area
   - Check Meijer API availability

### Debug Mode

Enable debug logging to see detailed geocoding and search information:

```python
import logging
logging.basicConfig(level=logging.DEBUG)
```

## Technical Details

### Architecture

- **Geocoding Module**: `meijer/geocoding.py` - Handles all coordinate conversion
- **Client Integration**: Enhanced `MeijerClient` with location parsing
- **Error Handling**: Graceful degradation when geocoding fails

### Dependencies

- `requests`: HTTP client for Google Maps API calls
- `typing`: Type hints for better code quality
- `logging`: Comprehensive logging for debugging

### API Endpoints

- **Google Maps Geocoding**: `https://maps.googleapis.com/maps/api/geocode/json`
- **Meijer Store Search**: `https://api.meijer.com/digital/storeInfo/v2/stores/proximity`

## Future Enhancements

- **Coordinate Caching**: Cache frequently used coordinates
- **Batch Geocoding**: Support for multiple locations in one request
- **Alternative Services**: Support for other geocoding providers
- **Reverse Geocoding**: Convert coordinates back to addresses
- **Location Validation**: Pre-validate location strings before geocoding

## Security Notes

- **API Key Protection**: Never commit API keys to version control
- **Rate Limiting**: Implement appropriate rate limiting for production use
- **Error Logging**: Avoid logging sensitive location data in production

## Migration from Old System

If you were using the old hardcoded coordinate system:

1. **Remove old code**: All hardcoded coordinates have been removed
2. **Set API key**: Configure `GOOGLE_MAPS_API_KEY` environment variable
3. **Update calls**: Use new `search_by_location()` method
4. **Test thoroughly**: Verify all location searches work correctly

The new system provides more accurate, maintainable, and scalable location search functionality.
