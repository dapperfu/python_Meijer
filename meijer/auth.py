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
from typing import Optional, Tuple

from requests.auth import AuthBase

from .models import AuthTokens


class MeijerAuth(AuthBase):
    """Custom authentication class for Meijer API requests."""

    def __init__(self, bearer_token: str):
        self.bearer_token = bearer_token

    def __call__(self, request):
        request.headers["Authorization"] = f"Bearer {self.bearer_token}"
        return request


class TokenStorage:
    """Handles persistent storage of authentication tokens."""

    def __init__(self, storage_file: str = "meijer_tokens.pkl"):
        self.storage_file = storage_file

    def save_tokens(self, tokens: AuthTokens) -> bool:
        """Save tokens to persistent storage."""
        try:
            with open(self.storage_file, "wb") as f:
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

            with open(self.storage_file, "rb") as f:
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


def load_auth_from_config_file(
    config_file_path: str = None,
) -> Optional[Tuple[str, str]]:
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
            config_file_path = home_dir / ".config" / "meijer.txt"
        else:
            config_file_path = Path(config_file_path)

        if not config_file_path.exists():
            logging.debug(f"Config file not found: {config_file_path}")
            return None

        logging.info(f"📂 Loading auth from JSON config: {config_file_path}")

        with open(config_file_path, "r") as f:
            config_data = json.load(f)

        bearer_token = config_data.get("bearer")
        user_agent = config_data.get("user_agent", "")

        if bearer_token:
            logging.info("✅ Loaded bearer token from config file")
            return bearer_token, user_agent
        else:
            logging.warning("⚠️ No bearer token found in config file")
            return None

    except Exception as e:
        logging.error(f"❌ Failed to load config file: {e}")
        return None


def extract_bearer_token_from_mitmproxy(
    log_file: str,
) -> Optional[Tuple[str, str, float]]:
    """
    Extract bearer token from mitmproxy log file.

    Args:
        log_file: Path to the mitmproxy log file

    Returns:
        Tuple of (bearer_token, user_agent, timestamp) if found, None otherwise
    """
    try:
        from mitmproxy import io
        from mitmproxy.http import HTTPFlow

        flows = []
        with open(log_file, "rb") as f:
            reader = io.FlowReader(f)
            for flow in reader.stream():
                if isinstance(flow, HTTPFlow):
                    flows.append(flow)

        # Find the most recent request with a bearer token
        bearer_requests = []
        for flow in flows:
            if flow.request and hasattr(flow.request, "headers"):
                headers = dict(flow.request.headers)

                # Look for Authorization header with Bearer token
                auth_header = None
                for header_name, header_value in headers.items():
                    if header_name.lower() == "authorization":
                        auth_header = header_value
                        break

                if auth_header and auth_header.startswith("Bearer "):
                    bearer_token = auth_header[7:]  # Remove "Bearer " prefix
                    user_agent = headers.get("user-agent", "")
                    timestamp = flow.timestamp_start

                    bearer_requests.append(
                        {
                            "bearer_token": bearer_token,
                            "user_agent": user_agent,
                            "timestamp": timestamp,
                        }
                    )

        if bearer_requests:
            # Sort by timestamp (newest first) and return the most recent
            bearer_requests.sort(key=lambda x: x["timestamp"], reverse=True)
            latest = bearer_requests[0]
            return latest["bearer_token"], latest["user_agent"], latest["timestamp"]

        return None

    except ImportError:
        logging.error("mitmproxy not available for log parsing")
        return None
    except Exception as e:
        logging.error(f"Failed to extract bearer token from log: {e}")
        return None
