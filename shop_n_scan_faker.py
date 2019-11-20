"""
Fake a location to get into shop'n'scan so you can debug from the comfort of your couch.

If you use mock locations in Android the app detects and shuts you down.

So, just rewrite the URL
"""
import mitmproxy

# Location of the store you would like to Shop'n'Scan at.
emulated_store = {
    "latitude": 43.0080700,
    "longitude": -85.6916800,
}


def request(flow):
    if flow.request.path.startswith("/storeinfo/api/mobile/near"):
        flow.request.path = "/storeinfo/api/mobile/near?latitude={latitude}&longitude={longitude}&miles=2000&numToReturn=250".format(
            **emulated_store
        )
        return
