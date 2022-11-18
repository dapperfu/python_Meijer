# ```python-meijer```

- What: Reverse engineered API for Meijer shopping list.
- Why: I can't actually get in contact with a Meijer Engineer. Their Facebook team just "takes feedback."
  On n'est jamais servi si bien que par soi-même.
- How: [mitmproxy](https://mitmproxy.org/), Python with [requests](http://docs.python-requests.org/en/master/)

## Installation 

pip install -e "git+https://github.com/dapperfu/python_Meijer.git#subdirectory=meijer&#egg=meijer" 

## Development Installation

```
git clone https://github.com/dapperfu/python_Meijer.git
cd python_Meijer
# Create & Activate virtual environment
python3 -mvenv venv
source venv/bin/activate
# Install development li
pip install -U pip wheel setuptools
pip install -r requirements.txt
```

## Usage

Meijer login information is stored in the environmental variable `MEIJER_API_KEY`.

```export MEIJER_API_KEY="user|pass"```

1. *Don't use the same login for Meijer's shopping list as your Bank, 'k?*
2. If you use a `|` in your password, you can edit the delimiter in `Meijer.py`

### Shell completion.

Shell completion through [click](https://click.palletsprojects.com/en/8.1.x/shell-completion/)

Add `meijer` Bash completion to the terminal:

```
_meijer_COMPLETE=bash_source meijer > ~/.meijer-complete.bash
echo ". ~/.meijer-complete.bash" >> ~/.bashrc
```

### Shopping list.



```
$ meijer list
Usage: meijer list [OPTIONS] COMMAND [ARGS]...

  Meijer list manipulation.

Options:
  -p, --prompt  Prompt for mPerks username & password
  --help        Show this message and exit.

Commands:
  add    Add items to shopping list.
  clear  Clear current shopping list.
  show   Show current shopping list.
```

Show the list, add something, show the list again.
```
$ meijer list show
[ ] Check the box to mark complete
[ ] Click/Tap here to edit an item
[ ] Press and hold to drag and drop an item
$ meijer list add
Enter your shopping list. Complete with a blank line.
- Tacos
-
$ meijer list show
[ ] Tacos
[ ] Check the box to mark complete
[ ] Click/Tap here to edit an item
[ ] Press and hold to drag and drop an item
```

Clear the list:

```shell
meijer list clear
meijer list show
```

Fancy:

```
cat examples/list

$ meijer list add < examples/list
Enter your shopping list. Complete with a blank line.
- - - - - %

$ meijer list show
[ ] 8% Milk
[ ] 4% Milk
[ ] 2% Milk
[ ] 1% Milk
```

## Development Tools.

- [HTC One M7](https://www.htc.com/us/smartphones/htc-one-m7/).
- Android 6. [Android 7.0+ makes it very difficult to use self signed certs](https://github.com/mitmproxy/mitmproxy/issues/2054#issuecomment-281836486). It's just easier to have an old device laying around for MITM proxy. It is still possible but requires root and more steps than "Install Cert".
- [Meijer Mobile App apk](https://apkpure.com/meijer/com.meijer.mobile.meijer) [[Google Play Link](https://play.google.com/store/apps/details?id=com.meijer.mobile.meijer&hl=en_US)]
- apk decompiler:
  - [Online Android Apk decompiler](http://www.javadecompilers.com/apk)
  - [apktool](https://ibotpeaches.github.io/Apktool/)
- Jupyter Notebook as a development environment.

Use ```shop_n_scan_faker.py``` with mitmproxy to fake any meijer store's location.

https://docs.mitmproxy.org/stable/addons-scripting/

```
# mitmproxy
mitmproxy -s shop_n_scan_faker.py

# mitmweb
mitmweb -s shop_n_scan_faker.py
```

##

## Motivation

The Meijer "[Shop & Scan](https://www.meijer.com/content/content.jsp?pageName=shopandscan&icid=HP:OLA:062418:MoreWays:ShopandScan)" feature is pretty cool, however it has a lot of room for improvement.

- The software barcode scanner is in software and slow. It also misreads the barcode often.
- Hand held barcode scanners [are cheap, fast and accurate](https://www.amazon.com/TaoTronics-Bluetooth-Portable-Processor-Compatible/dp/B06VV65V89/ref=sr_1_4?ie=UTF8&qid=1542388719&sr=8-4&keywords=bluetooth+barcode).
- ~~It's hard to flip between your shopping list and the app.~~
- You can't "parallel" shop with kids or SO. If you both start a shop and scan and try to checkout it'll only import the last one. (We found this one out the hardway).

Decompiling the Meijer.apk it looks like it's mostly just a REST app. So I setup a mitmproxy to watch for traffic.

## Lessons Learned

### Misc.

- Shopping lists doesn't support Unicode, no emoji's for you.

### You can't trick the Meijer App with mock locations.

Tests for Mock Location, in:

5.1.2:

```mobile/meijer/com/meijergo/utils/location/LocationHelper.java```:


```
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
```

5.3.0:

They updated it to give you a warning that Mock Locations are not allowed.

```
public void onLocationChanged(Location location) {
    if (location == null) {
        requestLocation();
        return;
    }
    LocationHelperListener locationHelperListener = this.listener;
    if (locationHelperListener != null) {
        locationHelperListener.onLocationReceived(location.getLatitude(), location.getLongitude(), location.isFromMockProvider());
    }
}
```
