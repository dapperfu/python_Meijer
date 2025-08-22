# Meijer API Flask Caching Server

A local caching server for the Meijer API that allows local testing and development without hitting the real API endpoints.

## Features

- **Local API Proxy**: Forwards requests to the real Meijer API
- **Redis Caching**: Caches responses to reduce API calls
- **Rate Limiting**: Built-in rate limiting to prevent abuse
- **Bearer Token Support**: Accepts all bearer tokens for authentication
- **CORS Enabled**: Cross-origin requests supported
- **Health Monitoring**: Built-in health checks and cache statistics

## API Endpoints

### Health & Monitoring
- `GET /health` - Server health check
- `GET /cache/stats` - Cache statistics
- `POST /cache/clear` - Clear all cached responses

### Meijer API Proxies
- `GET /api/meijer/<endpoint>` - Generic proxy for any Meijer API endpoint
- `GET /api/meijer/digital/occ/v3/carts/current` - Current cart (enhanced caching)
- `GET /api/meijer/digital/homecards/v1/cards/<card_type>` - Homecards
- `GET /api/meijer/digital/mperks40/customer/v1/pointbalance` - MPerks balance
- `GET /api/meijer/digital/product-recommendations/v1/customer/<customer_id>/recommendations/<rec_type>/<store_id>/upc` - Product recommendations
- `GET/POST /api/meijer/digital/hybris/v3/fulfillment/reservationslots` - Fulfillment slots
- `GET/POST /api/meijer/digital/multi-upc/v1/upcs` - Multi-UPC lookups

## Installation

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd meijer-api-flask
   ```

2. **Install dependencies**:
   ```bash
   pip install -r requirements.txt
   ```

3. **Install Redis** (optional, for caching):
   ```bash
   # Ubuntu/Debian
   sudo apt-get install redis-server
   
   # macOS
   brew install redis
   
   # Start Redis
   redis-server
   ```

4. **Configure environment**:
   ```bash
   cp env.example .env
   # Edit .env with your configuration
   ```

## Configuration

### Environment Variables

| Variable | Default | Description |
|----------|---------|-------------|
| `PORT` | 5000 | Server port |
| `FLASK_ENV` | development | Flask environment |
| `REDIS_HOST` | localhost | Redis host |
| `REDIS_PORT` | 6379 | Redis port |
| `REDIS_DB` | 0 | Redis database |
| `CACHE_TTL` | 300 | Cache TTL in seconds |

### Cache TTL by Endpoint

| Endpoint | TTL | Reason |
|----------|-----|---------|
| Cart | 60s | Frequently changing |
| MPerks Balance | 180s | Moderately stable |
| Homecards | 300s | Stable content |
| Fulfillment Slots | 300s | Stable availability |
| Product Recommendations | 600s | Stable recommendations |
| UPC Lookups | 1800s | Very stable product data |

## Usage

### Starting the Server

```bash
# Development mode
python app.py

# Production mode
gunicorn app:app -b 0.0.0.0:5000
```

### Making Requests

The server acts as a proxy, so you can use it as a drop-in replacement for the Meijer API:

```bash
# Instead of:
curl "https://api.meijer.com/digital/occ/v3/carts/current?store=71"

# Use:
curl "http://localhost:5000/api/meijer/digital/occ/v3/carts/current?store=71"
```

### Authentication

Include your bearer token in the Authorization header:

```bash
curl -H "Authorization: Bearer YOUR_TOKEN" \
     "http://localhost:5000/api/meijer/digital/mperks40/customer/v1/pointbalance"
```

### Cache Management

```bash
# View cache statistics
curl "http://localhost:5000/cache/stats"

# Clear all cached responses
curl -X POST "http://localhost:5000/cache/clear"
```

## Development

### Project Structure

```
meijer-api-flask/
├── app.py              # Main Flask application
├── requirements.txt    # Python dependencies
├── env.example        # Environment configuration template
├── README.md          # This file
└── tests/             # Test files (future)
```

### Adding New Endpoints

To add a new specialized endpoint:

1. Add a new route in `app.py`
2. Implement caching logic with appropriate TTL
3. Add rate limiting if needed
4. Update this README

### Testing

```bash
# Health check
curl "http://localhost:5000/health"

# Test proxy endpoint
curl "http://localhost:5000/api/meijer/digital/occ/v3/carts/current?store=71"
```

## Troubleshooting

### Redis Connection Issues

If Redis is not available, the server will run without caching:

```
WARNING: Redis not available: Connection refused
```

### Rate Limiting

If you hit rate limits, the server will return a 429 status code. Adjust limits in `app.py` if needed.

### API Errors

Check the server logs for detailed error information. The server forwards errors from the Meijer API.

## Security Notes

- **Bearer Token Forwarding**: The server forwards all bearer tokens to the Meijer API
- **Rate Limiting**: Built-in rate limiting prevents abuse
- **CORS**: Configure CORS settings for production use
- **Environment Variables**: Never commit sensitive configuration to version control

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request

## License

This project is for development and testing purposes only. Use responsibly and in accordance with Meijer's terms of service.
