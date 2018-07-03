# python_Meijer


Reverse engineered API for Meijer apps & services.

## Motivation

The Meijer "[Shop & Scan](https://www.meijer.com/content/content.jsp?pageName=shopandscan&icid=HP:OLA:062418:MoreWays:ShopandScan)" feature is pretty cool, however it is also pretty bad.

1. The barcode scanner is in software and slow. [I have a Bluetooth scanner that is incredibly fast and handheld.](https://www.amazon.com/Inateck-BCST-10-Wireless-Bluetooth-Barcode/dp/B00DZFOH4W)
2. It's hard to flip between your shopping list and the app.

Decompiling the Meijer.apk it looks like it's mostly just a REST app. So I setup a mitmproxy to watch for traffic. 

End goal is for Meijer PR/Engineering to either incorporate my ideas or me to have my own shopping tool, whichever comes first.


## Reverse Engineered With:

1. HTC One M7, rooted.
2. https://mitmproxy.org w/SSL certificated added to phone.
3. [Meijer APK](https://apkpure.com/meijer/com.meijer.mobile.meijer) from apkpure.
3. [Android Apk decompiler](http://www.javadecompilers.com/apk)


### Hurdles.

Tests for Mock Location, in:
```mobile/meijer/com/meijergo/utils/location/LocationHelper.java```:


    public void onLocationChanged(Location location) {
    	if (location != null) {
    		if (location.hasAccuracy()) {
    			if (this.sessionEnv == SessionEnvironment.PRODUCTION && location.isFromMockProvider()) {
    				this.listener.onLocationReceived(0.0d, 0.0d, 0.0f);
    			} else {
    				this.listener.onLocationReceived(location.getLatitude(), location.getLongitude(), location.getAccuracy());
    			}
    		}
    	}
    }
    