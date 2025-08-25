# Enhanced Meijer Store Search with Geocoding

## Overview

The Meijer store search functionality has been significantly enhanced to support location-based searches using city names, ZIP codes, and addresses. This enhancement addresses the issue where searching for stores in locations like "Kendallville, IN" previously returned no results.

## What Was Fixed

### Before (Limited Functionality)
- Store search only worked with hardcoded Michigan ZIP codes
- City searches were not supported
- No geocoding service integration
- Limited to Michigan locations only

### After (Enhanced Functionality)
- **Full ZIP code support**: Works with any US ZIP code, not just Michigan
- **City name support**: Search by city names like "Kendallville", "Grand Rapids", etc.
- **State support**: Specify state names or abbreviations (e.g., "IN", "Michigan")
- **Geocoding integration**: Automatic conversion of locations to coordinates
- **Fallback support**: Works even without Google Maps API key

## How It Works

The enhanced system follows the same two-step process as the Meijer app:

1. **Geocoding Step**: Convert location (city, ZIP, address) to coordinates
2. **Store Search Step**: Use coordinates to search the Meijer store proximity API

### Geocoding Service

Two geocoding services are available:

#### 1. Google Maps API Service (Recommended)
- **Endpoint**: `https://maps.googleapis.com/maps/api/geocode/json`
- **Features**: 
  - Accurate geocoding for any location worldwide
  - Region biasing for better results
  - Reverse geocoding capabilities
- **Setup**: Set `GOOGLE_MAPS_API_KEY` environment variable

#### 2. Fallback Service
- **Features**: Hardcoded coordinates for common locations
- **Coverage**: Michigan cities + Indiana cities (including Kendallville)
- **Advantage**: Works immediately without API setup
- **Limitation**: Limited to predefined locations

## Usage Examples

### Basic Location Search

```python
from meijer import Meijer

# Initialize client
meijer = Meijer()

# Search by ZIP code
stores = meijer.search_by_location("49508", radius=25)

# Search by city, state
stores = meijer.search_by_location("Kendallville, IN", radius=100)

# Search by city with state abbreviation
stores = meijer.search_by_location("Kendallville IN", radius=100)
```

### Advanced Store Search

```python
# Direct method calls with more control
stores = meijer.client.get_stores(
    city="Kendallville",
    state="IN", 
    radius=100,
    max_results=50
)

# Search by coordinates
stores = meijer.client.get_stores(
    latitude=41.4414,
    longitude=-85.2650,
    radius=100
)
```

### Geocoding Service Usage

```python
from meijer.geocoding import get_geocoding_service

# Get appropriate service (Google Maps API or fallback)
geocoder = get_geocoding_service()

# Geocode a city
coords = geocoder.get_city_coordinates("Kendallville", "IN")
# Returns: (41.4414, -85.2650)

# Geocode a ZIP code
coords = geocoder.get_zip_code_coordinates("46755")
# Returns coordinates for that ZIP code
```

## Supported Location Formats

### ZIP Codes
- **Format**: 5-digit numbers (e.g., "49508", "46755")
- **Support**: Any valid US ZIP code
- **Example**: `meijer.search_by_location("46755", radius=50)`

### City Names
- **Format**: City name only (e.g., "Kendallville")
- **Support**: Any city with coordinates in the geocoding service
- **Example**: `meijer.search_by_location("Kendallville", radius=100)`

### City + State
- **Format**: "City, State" or "City State" (e.g., "Kendallville, IN", "Kendallville IN")
- **Support**: Any city/state combination
- **Example**: `meijer.search_by_location("Kendallville, IN", radius=100)`

### Coordinates
- **Format**: Latitude and longitude values
- **Support**: Any valid coordinates
- **Example**: `meijer.search_by_proximity(41.4414, -85.2650, radius=100)`

## Configuration

### Google Maps API Setup

1. **Get API Key**:
   - Go to [Google Cloud Console](https://console.cloud.google.com/)
   - Enable the Geocoding API
   - Create credentials (API key)

2. **Set Environment Variable**:
   ```bash
   export GOOGLE_MAPS_API_KEY='your_api_key_here'
   ```

3. **Or Pass to Constructor**:
   ```python
   from meijer.geocoding import GeocodingService
   geocoder = GeocodingService("your_api_key_here")
   ```

### Fallback Service (No Setup Required)
- Works immediately without any configuration
- Limited to predefined locations
- Good for testing and basic usage

## Testing

Run the test script to verify functionality:

```bash
python test_enhanced_store_search.py
```

This will test:
- ZIP code geocoding
- City geocoding
- Store search functionality
- Both geocoding services

## Performance Considerations

### Google Maps API Service
- **Rate Limits**: 2,500 requests per day (free tier)
- **Accuracy**: High accuracy for any location
- **Latency**: Network request required

### Fallback Service
- **Rate Limits**: None (local lookup)
- **Accuracy**: Limited to predefined locations
- **Latency**: Instant (no network requests)

## Troubleshooting

### No Stores Found
1. **Check radius**: Increase search radius (e.g., from 25 to 100 miles)
2. **Verify location**: Ensure city/state spelling is correct
3. **Check coordinates**: Verify geocoding is working correctly

### Geocoding Failures
1. **Google Maps API**: Check API key validity and quotas
2. **Fallback service**: Verify location is in the predefined list
3. **Network issues**: Check internet connectivity for API calls

### Store Data Issues
1. **API response**: Check Meijer API status
2. **Authentication**: Verify API keys and tokens
3. **Rate limiting**: Check for API rate limit errors

## Technical Details

### API Endpoints Used
- **Geocoding**: `https://maps.googleapis.com/maps/api/geocode/json`
- **Store Search**: `https://api.meijer.com/digital/storeInfo/v2/stores/proximity`

### Data Flow
1. User provides location (city, ZIP, coordinates)
2. Geocoding service converts to coordinates
3. Coordinates used in Meijer store proximity API
4. Results filtered and returned to user

### Error Handling
- Graceful fallback between geocoding services
- Comprehensive logging for debugging
- User-friendly error messages
- Automatic retry logic for transient failures

## Future Enhancements

- **Caching**: Cache geocoding results to reduce API calls
- **Batch geocoding**: Support multiple locations in single request
- **More providers**: Add OpenStreetMap, Here Maps, etc.
- **Address parsing**: Better address format recognition
- **International support**: Extend beyond US locations

## Contributing

To add more locations to the fallback service:

1. Edit `meijer/geocoding.py`
2. Add coordinates to `FallbackGeocodingService.location_coordinates`
3. Test with the provided test script
4. Submit pull request

## Support

For issues or questions:
1. Check the troubleshooting section above
2. Review the test script for usage examples
3. Check the logs for detailed error information
4. Verify your configuration and API keys
