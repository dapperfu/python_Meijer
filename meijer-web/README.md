# Meijer Web Application

A modern web frontend for the Meijer CLI application, built with Flask, Bootstrap, and Jinja2. This application provides a beautiful and intuitive user interface for managing Meijer shopping lists, cart, coupons, stores, and account settings.

## Features

### 🛒 Shopping Cart Management
- **View Cart**: Display all items in your shopping cart with details
- **Add Items**: Add products by UPC code with quantity and store selection
- **Remove Items**: Remove individual items or clear entire cart
- **Cart Defrag**: Consolidate duplicate items and optimize cart layout
- **Real-time Updates**: Live cart information and total cost calculation

### 📝 Shopping List Management
- **Create Lists**: Build and organize your shopping lists
- **Add Items**: Add items with descriptions, quantities, and notes
- **Mark Complete**: Check off items as you shop
- **Progress Tracking**: Visual progress bar showing completion status
- **Smart Organization**: Auto-sort and categorize items

### 🏷️ Coupons & Offers
- **Browse Coupons**: View available digital coupons and offers
- **Clip Coupons**: Save coupons to your account with one click
- **Filter Options**: Sort by category, savings amount, and expiration
- **Savings Calculator**: Track total potential savings

### 🏪 Store Locator
- **Find Stores**: Search by city, ZIP code, or coordinates
- **Store Details**: View services, hours, and contact information
- **Service Filters**: Filter by curbside pickup, delivery, pharmacy, gas
- **Directions**: Get directions to any store location

### ⚙️ Account Settings
- **Profile Management**: Update personal information and preferences
- **Security Settings**: Manage passwords and two-factor authentication
- **Preferences**: Customize shopping experience and notifications
- **Data Management**: Export/import data and manage privacy

### 🔐 Authentication
- **Secure Login**: Email and password authentication
- **Password Reset**: Self-service password recovery
- **Session Management**: View and manage active sessions
- **Help System**: Comprehensive sign-in assistance

## Technology Stack

- **Backend**: Flask (Python web framework)
- **Frontend**: Bootstrap 5 (CSS framework)
- **Templating**: Jinja2 (Template engine)
- **Styling**: Custom CSS with responsive design
- **JavaScript**: Vanilla JS with modern ES6+ features
- **Icons**: Font Awesome 6
- **Dependencies**: Inherits from parent Meijer package

## Installation

### Prerequisites
- Python 3.8 or higher
- Access to the parent Meijer package
- Virtual environment (recommended)

### Setup Instructions

1. **Clone or navigate to the project directory**
   ```bash
   cd meijer-web
   ```

2. **Create and activate a virtual environment**
   ```bash
   python -m venv venv
   source venv/bin/activate  # On Windows: venv\Scripts\activate
   ```

3. **Install dependencies**
   ```bash
   pip install -r requirements.txt
   ```

4. **Set environment variables (optional)**
   ```bash
   export SECRET_KEY="your-secret-key-here"
   export FLASK_ENV="development"
   ```

5. **Run the application**
   ```bash
   python app.py
   ```

6. **Access the application**
   Open your browser and navigate to `http://127.0.0.1:5000`

## Project Structure

```
meijer-web/
├── app.py                 # Main Flask application
├── requirements.txt       # Python dependencies
├── README.md             # This file
├── templates/            # Jinja2 HTML templates
│   ├── base.html        # Base template with navigation
│   ├── index.html       # Home page
│   ├── cart.html        # Shopping cart management
│   ├── shopping_list.html # Shopping list management
│   ├── coupons.html     # Coupons and offers
│   ├── stores.html      # Store locator
│   ├── settings.html    # Account settings
│   ├── auth/            # Authentication templates
│   │   └── login.html   # Login page
│   └── errors/          # Error pages
│       ├── 404.html     # Page not found
│       └── 500.html     # Server error
├── static/              # Static assets
│   ├── css/            # Stylesheets
│   │   └── style.css   # Custom CSS
│   ├── js/             # JavaScript files
│   │   └── app.js      # Main application JS
│   └── images/         # Image assets
└── venv/               # Virtual environment (created during setup)
```

## API Endpoints

### Cart Management
- `GET /cart` - View shopping cart
- `POST /cart/add` - Add item to cart
- `POST /cart/remove/<index>` - Remove item from cart
- `POST /cart/clear` - Clear all items
- `POST /cart/defrag` - Defragment cart
- `GET /api/cart/items` - Get cart items as JSON

### Shopping List
- `GET /list` - View shopping list
- `POST /list/add` - Add item to list
- `POST /list/remove/<index>` - Remove item from list
- `POST /list/toggle/<index>` - Toggle item completion
- `GET /api/list/items` - Get list items as JSON

### Coupons
- `GET /coupons` - View available coupons
- `POST /coupons/clip/<id>` - Clip a coupon

### Stores
- `GET /stores` - View store locations
- `POST /stores/search` - Search for stores

### Account
- `GET /settings` - Account settings page
- `GET /auth/login` - Login page
- `POST /auth/login` - Authenticate user
- `GET /auth/logout` - Logout user

## Configuration

### Environment Variables
- `SECRET_KEY`: Flask secret key for sessions
- `FLASK_ENV`: Environment mode (development/production)
- `FLASK_DEBUG`: Enable debug mode

### Flask Configuration
- **Secret Key**: Auto-generated for development
- **Bootstrap Theme**: Cosmo (Bootstrap 5)
- **Host**: 127.0.0.1 (localhost)
- **Port**: 5000
- **Debug**: Enabled in development

## Development

### Running in Development Mode
```bash
export FLASK_ENV=development
export FLASK_DEBUG=1
python app.py
```

### Code Style
- **Python**: Follow PEP 8 guidelines
- **JavaScript**: ES6+ with modern practices
- **CSS**: BEM methodology for class naming
- **HTML**: Semantic HTML5 with accessibility

### Testing
```bash
# Install test dependencies
pip install pytest flask-testing

# Run tests
pytest
```

## Deployment

### Production Considerations
1. **Set proper SECRET_KEY**
2. **Disable debug mode**
3. **Use production WSGI server (Gunicorn, uWSGI)**
4. **Configure reverse proxy (Nginx, Apache)**
5. **Set up SSL/TLS certificates**
6. **Configure logging and monitoring**

### Docker Deployment
```dockerfile
FROM python:3.9-slim
WORKDIR /app
COPY requirements.txt .
RUN pip install -r requirements.txt
COPY . .
EXPOSE 5000
CMD ["gunicorn", "--bind", "0.0.0.0:5000", "app:app"]
```

## Browser Support

- **Chrome**: 90+
- **Firefox**: 88+
- **Safari**: 14+
- **Edge**: 90+
- **Mobile**: iOS Safari 14+, Chrome Mobile 90+

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests if applicable
5. Submit a pull request

## License

This project is part of the Meijer CLI application suite. Please refer to the parent project for licensing information.

## Support

For issues and questions:
1. Check the existing documentation
2. Review the CLI application for reference
3. Open an issue in the project repository
4. Contact the development team

## Roadmap

### Phase 1 (Current)
- ✅ Basic Flask application structure
- ✅ Core templates and styling
- ✅ Cart and shopping list management
- ✅ Store locator functionality
- ✅ Basic authentication system

### Phase 2 (Planned)
- 🔄 Advanced cart operations (defrag, optimization)
- 🔄 Real-time notifications
- 🔄 Advanced search and filtering
- 🔄 User preferences and customization
- 🔄 Mobile app-like experience

### Phase 3 (Future)
- 📋 Advanced analytics and reporting
- 📋 Integration with external services
- 📋 Advanced security features
- 📋 Performance optimizations
- 📋 API rate limiting and caching

## Acknowledgments

- **Meijer CLI Team**: For the underlying functionality
- **Flask Community**: For the excellent web framework
- **Bootstrap Team**: For the responsive CSS framework
- **Font Awesome**: For the comprehensive icon library

---

**Note**: This is a demonstration application. Some functionality may be simulated for development purposes. In production, integrate with actual Meijer APIs and services.
