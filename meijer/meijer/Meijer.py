"""Meijer object file."""
import base64
import json

import requests
from cached_property import cached_property


class Meijer:
    # From Meijer_v5.20.1_apkpure.com/res/values/strings.xml
    account_services_client_id = "mma"
    account_services_secret = "drAqas76Re7RekeBanaMaNEMah7paDE5"
    # Token string, decoded
    token_decoded = f"{account_services_client_id}:{account_services_secret}".encode(
        "UTF-8"
    )
    # Token string, encoded
    basic_token = base64.encodebytes(token_decoded).decode("UTF-8").strip()

    def __init__(self, user: str, password: str):
        """Meijer: Use the Meijer App, programatically, in Python.

        user: username/e-mail address for mperks
        pass: password.
        """
        self.user = user
        self.password = password

        # This is set on login.
        self.bearer_token = None

        # Create a requests session.
        self.session = requests.Session()
        # Login
        self.login()

    def login(self):
        request = dict()
        request["url"] = "https://login.meijer.com/as/token.oauth2"
        request["headers"] = {
            "Authorization": f"Basic {self.basic_token}",
            "Platform": "Android",
            "Version": "5.20.1",
            "Build": "52001000",
            "Content-Type": "application/x-www-form-urlencoded",
            "Connection": "Keep-Alive",
            "Accept-Encoding": "gzip",
            "User-Agent": "okhttp/3.8.0",
        }
        request["params"] = {
            "grant_type": "password",
            "scope": "openid",
            "username": self.user,
            "password": self.password,
        }
        r = self.session.post(**request)
        self.r_ = r  # debugs
        assert r.status_code == 200

        for key, value in r.json().items():
            setattr(self, key, value)

        _, meijer_id64, _ = self.access_token.split(".")
        ids = json.loads(base64.decodebytes(f"{meijer_id64}=".encode()))
        for key, value in ids.items():
            setattr(self, key, value)

        self.bearer_token = f"{self.token_type} {self.access_token}"

    @cached_property
    def coupons(self):
        # Coupons
        request = dict()
        request["url"] = "https://mperksservices.meijer.com/dgtlmPerksMMA/api/offers"
        request["headers"] = {
            "Accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
            "Authorization": self.bearer_token,
            "Platform": "Android",
            "Version": "5.20.1",
            "Build": "52001000",
            "Content-Type": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
            "Connection": "Keep-Alive",
            "Accept-Encoding": "gzip",
            "User-Agent": "okhttp/3.8.0",
        }
        request["json"] = json.loads(
            '{"categoryId":"","ceilingCount":0,"ceilingDuration":0,"currentPage":1,"displayReasonFilters":[],"getOfferCountPerDepartment":true,"offerClass":1,"offerIds":[],"pageSize":9999,"rewardCouponId":0,"searchCriteria":"","showClippedCoupons":false,"showOnlySpecialOffers":false,"showRedeemedOffers":false,"sortType":"BySuggested","storeId":52,"tagId":"","upcList":[],"zip":""}'
        )
        r = self.session.post(**request)
        self.r_ = r
        assert r.status_code == 200
        return r.json()["listOfCoupons"]

    def clip(self, coupon):
        if isinstance(coupon, dict):
            meijerOfferId = coupon["meijerOfferId"]
        elif isinstance(coupon, [str, int]):
            meijerOfferId = coupon

        request[
            "url"
        ] = "https://mperksservices.meijer.com/dgtlmPerksMMA/api/offers/Clip"
        request["headers"] = {
            "Accept": "application/vnd.meijer.digitalmperks.clip-v1.0+json",
            "Authorization": self.bearer_token,
            "Platform": "Android",
            "Version": "5.20.1",
            "Build": "52001000",
            "Content-Type": "application/vnd.meijer.digitalmperks.clip-v1.0+json",
            "Connection": "Keep-Alive",
            "Accept-Encoding": "gzip",
            "User-Agent": "okhttp/3.8.0",
        }
        request["json"] = {"meijerOfferId": meijerOfferId}
        r = self.session.post(**request)
        self.r_ = r
        assert r.status_code == 200

    @cached_property
    def stores(self):
        request = dict()
        request["url"] = "https://mservices.meijer.com/storeinfo/api/mobile/near"
        request["headers"] = {
            "Version": "7",
            "Authorization": self.bearer_token,
            "Connection": "Keep-Alive",
            "Accept-Encoding": "gzip",
            "User-Agent": "okhttp/3.8.0",
        }
        latitude, longitude = 43.016570, -85.726290
        request["params"] = {
            "latitude": latitude,
            "longitude": longitude,
            "miles": "10000",
            "numToReturn": "10000",
        }
        r = self.session.get(**request)
        self.r_ = r
        assert r.status_code == 200
        return r.json()["store"]

    def get_store(self, store_id):
        request = dict()
        request[
            "url"
        ] = "https://mservices.meijer.com/storeinfo/api/mobile/stores/{}?dataVariant=2".format(
            store_id
        )
        request["headers"] = {
            "Version": "7",
            "Authorization": self.bearer_token,
            "Connection": "Keep-Alive",
            "Accept-Encoding": "gzip",
            "User-Agent": "okhttp/3.8.0",
        }
        r = self.session.get(**request)
        self.r_ = r
        assert r.status_code == 200
        return r.json()["store"][0]

    def __repr__(self):
        return "Meijer<>"

    def __enter__(self):
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        pass
