/**
 * Meijer Web Application JavaScript
 * Main application functionality and utilities
 */

// Global application state
const MeijerApp = {
    // Configuration
    config: {
        apiBaseUrl: '',
        refreshInterval: 30000, // 30 seconds
        maxRetries: 3,
        animationDuration: 300
    },
    
    // Application state
    state: {
        isAuthenticated: false,
        currentUser: null,
        cartItems: [],
        shoppingList: [],
        notifications: []
    },
    
    // Initialize application
    init() {
        console.log('Initializing Meijer Web Application...');
        this.setupEventListeners();
        this.setupAutoRefresh();
        this.loadInitialData();
        this.setupAnimations();
    },
    
    // Setup global event listeners
    setupEventListeners() {
        // Navigation active state
        this.setupNavigation();
        
        // Form submissions
        this.setupFormHandlers();
        
        // Modal interactions
        this.setupModalHandlers();
        
        // Responsive behavior
        this.setupResponsiveHandlers();
        
        // Keyboard shortcuts
        this.setupKeyboardShortcuts();
    },
    
    // Setup navigation active states
    setupNavigation() {
        const currentPath = window.location.pathname;
        const navLinks = document.querySelectorAll('.navbar-nav .nav-link');
        
        navLinks.forEach(link => {
            if (link.getAttribute('href') === currentPath) {
                link.classList.add('active');
            }
        });
    },
    
    // Setup form handlers
    setupFormHandlers() {
        // Auto-save forms
        document.querySelectorAll('form[data-auto-save]').forEach(form => {
            this.setupAutoSave(form);
        });
        
        // Form validation
        document.querySelectorAll('form').forEach(form => {
            this.setupFormValidation(form);
        });
    },
    
    // Setup modal handlers
    setupModalHandlers() {
        // Auto-focus first input in modals
        document.querySelectorAll('.modal').forEach(modal => {
            modal.addEventListener('shown.bs.modal', function() {
                const firstInput = this.querySelector('input, select, textarea');
                if (firstInput) {
                    firstInput.focus();
                }
            });
        });
    },
    
    // Setup responsive handlers
    setupResponsiveHandlers() {
        // Handle mobile menu toggle
        const navbarToggler = document.querySelector('.navbar-toggler');
        if (navbarToggler) {
            navbarToggler.addEventListener('click', () => {
                this.handleMobileMenuToggle();
            });
        }
        
        // Handle window resize
        window.addEventListener('resize', () => {
            this.handleWindowResize();
        });
    },
    
    // Setup keyboard shortcuts
    setupKeyboardShortcuts() {
        document.addEventListener('keydown', (e) => {
            // Ctrl/Cmd + K: Search
            if ((e.ctrlKey || e.metaKey) && e.key === 'k') {
                e.preventDefault();
                this.focusSearch();
            }
            
            // Ctrl/Cmd + /: Toggle help
            if ((e.ctrlKey || e.metaKey) && e.key === '/') {
                e.preventDefault();
                this.toggleHelp();
            }
            
            // Escape: Close modals
            if (e.key === 'Escape') {
                this.closeAllModals();
            }
        });
    },
    
    // Setup auto-refresh functionality
    setupAutoRefresh() {
        if (this.config.refreshInterval > 0) {
            setInterval(() => {
                this.refreshData();
            }, this.config.refreshInterval);
        }
    },
    
    // Load initial application data
    loadInitialData() {
        // Load user preferences
        this.loadUserPreferences();
        
        // Load cart data if on cart page
        if (window.location.pathname === '/cart') {
            this.loadCartData();
        }
        
        // Load shopping list if on list page
        if (window.location.pathname === '/list') {
            this.loadShoppingListData();
        }
    },
    
    // Setup animations
    setupAnimations() {
        // Add animation classes to elements
        this.addAnimationClasses();
        
        // Setup intersection observer for scroll animations
        this.setupScrollAnimations();
    },
    
    // Add animation classes to elements
    addAnimationClasses() {
        const animatedElements = document.querySelectorAll('.card, .btn, .alert');
        animatedElements.forEach((element, index) => {
            element.classList.add('fade-in');
            element.style.animationDelay = `${index * 0.1}s`;
        });
    },
    
    // Setup scroll animations
    setupScrollAnimations() {
        const observerOptions = {
            threshold: 0.1,
            rootMargin: '0px 0px -50px 0px'
        };
        
        const observer = new IntersectionObserver((entries) => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    entry.target.classList.add('slide-in-left');
                }
            });
        }, observerOptions);
        
        document.querySelectorAll('.card, .alert').forEach(element => {
            observer.observe(element);
        });
    },
    
    // Handle mobile menu toggle
    handleMobileMenuToggle() {
        const navbarCollapse = document.querySelector('.navbar-collapse');
        if (navbarCollapse) {
            navbarCollapse.classList.toggle('show');
        }
    },
    
    // Handle window resize
    handleWindowResize() {
        // Adjust layout for different screen sizes
        if (window.innerWidth < 768) {
            this.enableMobileLayout();
        } else {
            this.disableMobileLayout();
        }
    },
    
    // Enable mobile layout
    enableMobileLayout() {
        document.body.classList.add('mobile-layout');
    },
    
    // Disable mobile layout
    disableMobileLayout() {
        document.body.classList.remove('mobile-layout');
    },
    
    // Focus search functionality
    focusSearch() {
        const searchInput = document.querySelector('input[type="search"], input[placeholder*="search"], input[placeholder*="Search"]');
        if (searchInput) {
            searchInput.focus();
            searchInput.select();
        }
    },
    
    // Toggle help
    toggleHelp() {
        // This would show/hide help overlay
        console.log('Help toggled');
    },
    
    // Close all modals
    closeAllModals() {
        const modals = document.querySelectorAll('.modal');
        modals.forEach(modal => {
            const modalInstance = bootstrap.Modal.getInstance(modal);
            if (modalInstance) {
                modalInstance.hide();
            }
        });
    },
    
    // Load user preferences
    loadUserPreferences() {
        const preferences = localStorage.getItem('meijer_preferences');
        if (preferences) {
            try {
                this.state.preferences = JSON.parse(preferences);
                this.applyUserPreferences();
            } catch (e) {
                console.error('Error loading user preferences:', e);
            }
        }
    },
    
    // Apply user preferences
    applyUserPreferences() {
        if (this.state.preferences) {
            // Apply theme
            if (this.state.preferences.theme) {
                this.setTheme(this.state.preferences.theme);
            }
            
            // Apply other preferences
            if (this.state.preferences.autoRefresh !== undefined) {
                this.config.refreshInterval = this.state.preferences.autoRefresh ? 30000 : 0;
            }
        }
    },
    
    // Set theme
    setTheme(theme) {
        document.body.setAttribute('data-theme', theme);
        localStorage.setItem('meijer_theme', theme);
    },
    
    // Load cart data
    loadCartData() {
        fetch('/api/cart/items')
            .then(response => response.json())
            .then(data => {
                if (data.success) {
                    this.state.cartItems = data.items;
                    this.updateCartUI();
                }
            })
            .catch(error => {
                console.error('Error loading cart data:', error);
            });
    },
    
    // Load shopping list data
    loadShoppingListData() {
        fetch('/api/list/items')
            .then(response => response.json())
            .then(data => {
                if (data.success) {
                    this.state.shoppingList = data.items;
                    this.updateShoppingListUI();
                }
            })
            .catch(error => {
                console.error('Error loading shopping list data:', error);
            });
    },
    
    // Update cart UI
    updateCartUI() {
        // Update cart count in navigation
        const cartCount = document.getElementById('cart-count');
        if (cartCount) {
            cartCount.textContent = this.state.cartItems.length;
        }
        
        // Update cart items display
        this.renderCartItems();
    },
    
    // Update shopping list UI
    updateShoppingListUI() {
        // Update list count in navigation
        const listCount = document.getElementById('list-count');
        if (listCount) {
            listCount.textContent = this.state.shoppingList.length;
        }
        
        // Update list items display
        this.renderShoppingListItems();
    },
    
    // Render cart items
    renderCartItems() {
        // This would update the cart display
        console.log('Cart items updated:', this.state.cartItems);
    },
    
    // Render shopping list items
    renderShoppingListItems() {
        // This would update the shopping list display
        console.log('Shopping list updated:', this.state.shoppingList);
    },
    
    // Refresh data
    refreshData() {
        console.log('Refreshing application data...');
        
        // Refresh cart if on cart page
        if (window.location.pathname === '/cart') {
            this.loadCartData();
        }
        
        // Refresh shopping list if on list page
        if (window.location.pathname === '/list') {
            this.loadShoppingListData();
        }
    },
    
    // Setup auto-save for forms
    setupAutoSave(form) {
        const inputs = form.querySelectorAll('input, select, textarea');
        inputs.forEach(input => {
            input.addEventListener('change', () => {
                this.autoSaveForm(form);
            });
        });
    },
    
    // Auto-save form data
    autoSaveForm(form) {
        const formData = new FormData(form);
        const data = Object.fromEntries(formData.entries());
        
        // Save to localStorage
        const formId = form.id || 'form_' + Math.random().toString(36).substr(2, 9);
        localStorage.setItem(`form_${formId}`, JSON.stringify(data));
        
        // Show auto-save indicator
        this.showAutoSaveIndicator(form);
    },
    
    // Show auto-save indicator
    showAutoSaveIndicator(form) {
        let indicator = form.querySelector('.auto-save-indicator');
        if (!indicator) {
            indicator = document.createElement('div');
            indicator.className = 'auto-save-indicator text-muted small mt-2';
            form.appendChild(indicator);
        }
        
        indicator.textContent = 'Auto-saved';
        indicator.style.opacity = '1';
        
        setTimeout(() => {
            indicator.style.opacity = '0';
        }, 2000);
    },
    
    // Setup form validation
    setupFormValidation(form) {
        const inputs = form.querySelectorAll('input[required], select[required], textarea[required]');
        inputs.forEach(input => {
            input.addEventListener('blur', () => {
                this.validateField(input);
            });
            
            input.addEventListener('input', () => {
                this.clearFieldError(input);
            });
        });
        
        form.addEventListener('submit', (e) => {
            if (!this.validateForm(form)) {
                e.preventDefault();
            }
        });
    },
    
    // Validate individual field
    validateField(field) {
        const value = field.value.trim();
        const isValid = this.isFieldValid(field, value);
        
        if (!isValid) {
            this.showFieldError(field, this.getFieldErrorMessage(field));
        } else {
            this.clearFieldError(field);
        }
        
        return isValid;
    },
    
    // Check if field is valid
    isFieldValid(field, value) {
        if (field.hasAttribute('required') && !value) {
            return false;
        }
        
        if (field.type === 'email' && value) {
            const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            return emailRegex.test(value);
        }
        
        if (field.type === 'tel' && value) {
            const phoneRegex = /^[\+]?[1-9][\d]{0,15}$/;
            return phoneRegex.test(value.replace(/\s/g, ''));
        }
        
        return true;
    },
    
    // Show field error
    showFieldError(field, message) {
        this.clearFieldError(field);
        
        field.classList.add('is-invalid');
        
        const errorDiv = document.createElement('div');
        errorDiv.className = 'invalid-feedback';
        errorDiv.textContent = message;
        
        field.parentNode.appendChild(errorDiv);
    },
    
    // Clear field error
    clearFieldError(field) {
        field.classList.remove('is-invalid');
        
        const errorDiv = field.parentNode.querySelector('.invalid-feedback');
        if (errorDiv) {
            errorDiv.remove();
        }
    },
    
    // Get field error message
    getFieldErrorMessage(field) {
        if (field.hasAttribute('required') && !field.value.trim()) {
            return 'This field is required.';
        }
        
        if (field.type === 'email' && field.value) {
            return 'Please enter a valid email address.';
        }
        
        if (field.type === 'tel' && field.value) {
            return 'Please enter a valid phone number.';
        }
        
        return 'Please check your input.';
    },
    
    // Validate entire form
    validateForm(form) {
        const inputs = form.querySelectorAll('input, select, textarea');
        let isValid = true;
        
        inputs.forEach(input => {
            if (!this.validateField(input)) {
                isValid = false;
            }
        });
        
        return isValid;
    },
    
    // Utility function to show notifications
    showNotification(message, type = 'info', duration = 5000) {
        const notification = document.createElement('div');
        notification.className = `alert alert-${type} alert-dismissible fade show position-fixed`;
        notification.style.cssText = 'top: 20px; right: 20px; z-index: 9999; min-width: 300px;';
        
        notification.innerHTML = `
            ${message}
            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
        `;
        
        document.body.appendChild(notification);
        
        // Auto-remove after duration
        setTimeout(() => {
            if (notification.parentNode) {
                notification.remove();
            }
        }, duration);
        
        // Store in state
        this.state.notifications.push({
            id: Date.now(),
            message,
            type,
            element: notification
        });
    },
    
    // Utility function to format currency
    formatCurrency(amount) {
        return new Intl.NumberFormat('en-US', {
            style: 'currency',
            currency: 'USD'
        }).format(amount);
    },
    
    // Utility function to format dates
    formatDate(date) {
        return new Intl.DateTimeFormat('en-US', {
            year: 'numeric',
            month: 'short',
            day: 'numeric',
            hour: '2-digit',
            minute: '2-digit'
        }).format(new Date(date));
    },
    
    // Utility function to debounce function calls
    debounce(func, wait) {
        let timeout;
        return function executedFunction(...args) {
            const later = () => {
                clearTimeout(timeout);
                func(...args);
            };
            clearTimeout(timeout);
            timeout = setTimeout(later, wait);
        };
    }
};

// Initialize application when DOM is loaded
document.addEventListener('DOMContentLoaded', () => {
    MeijerApp.init();
});

// Export for use in other scripts
window.MeijerApp = MeijerApp;
