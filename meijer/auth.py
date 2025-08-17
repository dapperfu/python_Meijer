"""
Meijer API Authentication
========================

Authentication classes and utilities for the Meijer API client.
"""

import json
import logging
import os
import pickle
from pathlib import Path
from typing import Optional, Tuple, Dict, Any
from datetime import datetime

from requests.auth import AuthBase

from .models import AuthTokens, OAuthConfig
from .exceptions import MeijerAuthenticationError


class MeijerAuth(AuthBase):
    """Custom authentication class for Meijer API requests."""
    
    def __init__(self, bearer_token: str):
        self.bearer_token = bearer_token
    
    def __call__(self, request):
        request.headers['Authorization'] = f'Bearer {self.bearer_token}'
        return request


class TokenStorage:
    """Handles persistent storage of authentication tokens."""
    
    def __init__(self, storage_file: str = "meijer_tokens.pkl"):
        self.storage_file = storage_file
    
    def save_tokens(self, tokens: AuthTokens) -> bool:
        """Save tokens to persistent storage."""
        try:
            with open(self.storage_file, 'wb') as f:
                pickle.dump(tokens.to_dict(), f)
            return True
        except Exception as e:
            logging.error(f"Failed to save tokens: {e}")
            return False
    
    def load_tokens(self) -> Optional[AuthTokens]:
        """Load tokens from persistent storage."""
        try:
            if not os.path.exists(self.storage_file):
                return None
            
            with open(self.storage_file, 'rb') as f:
                token_data = pickle.load(f)
            
            return AuthTokens.from_dict(token_data)
        except Exception as e:
            logging.error(f"Failed to load tokens: {e}")
            return None
    
    def clear_tokens(self) -> bool:
        """Clear stored tokens."""
        try:
            if os.path.exists(self.storage_file):
                os.remove(self.storage_file)
            return True
        except Exception as e:
            logging.error(f"Failed to clear tokens: {e}")
            return False
    
    def has_tokens(self) -> bool:
        """Check if tokens are stored."""
        return os.path.exists(self.storage_file)


def load_auth_from_config_file(config_file_path: str = None) -> Optional[Tuple[str, str]]:
    """
    Load authentication from .config/meijer.txt JSON config file.
    
    Args:
        config_file_path: Optional path to config file, defaults to ~/.config/meijer.txt
        
    Returns:
        Tuple of (bearer_token, user_agent) if found, None otherwise
    """
    try:
        if config_file_path is None:
            # Use default ~/.config/meijer.txt
            home_dir = Path.home()
            config_file_path = home_dir / '.config' / 'meijer.txt'
        else:
            config_file_path = Path(config_file_path)
        
        if not config_file_path.exists():
            logging.debug(f"Config file not found: {config_file_path}")
            return None
        
        logging.info(f"📂 Loading auth from JSON config: {config_file_path}")
        
        with open(config_file_path, 'r') as f:
            config_data = json.load(f)
        
        # Extract tokens from JSON structure
        tokens = config_data.get('tokens', {})
        bearer_token = tokens.get('access_token')
        
        # Get user agent from config or use default
        user_agent = config_data.get('user_agent')
        if not user_agent:
            user_agent = "Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)"
        
        if bearer_token:
            logging.info(f"✅ Loaded bearer token from JSON config: {bearer_token[:20]}...")
            return bearer_token, user_agent
        
        logging.warning(f"No access token found in JSON config file: {config_file_path}")
        return None
        
    except json.JSONDecodeError as e:
        logging.error(f"Invalid JSON in config file: {e}")
        return None
    except Exception as e:
        logging.error(f"Error loading JSON config file: {e}")
        return None


def load_auth_file(auth_file: str) -> Tuple[Optional[Dict[str, str]], Optional[Tuple[str, str]]]:
    """
    Intelligently load auth file - detects bearer= or user=/password= format.
    
    Args:
        auth_file: Path to auth file
        
    Returns:
        Tuple of (credentials_dict, bearer_tuple) where one or both may be None
    """
    if not auth_file or not os.path.exists(auth_file):
        return None, None
    
    try:
        data = {}
        with open(auth_file, 'r') as f:
            for line in f:
                line = line.strip()
                if '=' in line:
                    key, value = line.split('=', 1)
                    data[key.strip()] = value.strip()
        
        # Check for bearer token
        bearer_token = data.get('bearer') or data.get('bearer_token')
        user_agent = data.get('user_agent')
        
        if bearer_token:
            if not user_agent:
                user_agent = "Meijer/101200000 okhttp/4.12.0 Dalvik/2.1.0 (Linux; U; Android 10; One Build/QQ3A.200705.002)"
            bearer_info = (bearer_token, user_agent)
        else:
            bearer_info = None
        
        # Check for username/password credentials
        username = (data.get('username') or 
                   data.get('user') or 
                   data.get('email'))
        password = (data.get('password') or 
                   data.get('pass') or 
                   data.get('pwd'))
        
        if username and password:
            credentials = {'username': username, 'password': password}
        else:
            credentials = None
        
        return credentials, bearer_info
        
    except Exception as e:
        logging.error(f"Error loading auth file {auth_file}: {e}")
        return None, None 