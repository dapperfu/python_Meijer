"""Meijer object file."""
import base64
import json
import os
from typing import List

import requests
from cached_property import cached_property

from .MeijerList import MeijerList
from .requests import RequestsMixin

# From Meijer_v5.20.1_apkpure.com/res/values/strings.xml
account_services_client_id = "mma"
account_services_secret = "drAqas76Re7RekeBanaMaNEMah7paDE5"
# Token string, decoded
token_decoded = f"{account_services_client_id}:{account_services_secret}".encode(
    "UTF-8"
)
# Token string, encoded
basic_token = base64.encodebytes(token_decoded).decode("UTF-8").strip()


class Meijer(RequestsMixin):
    def __init__(self, meijer_api_key: str = None):
        """Meijer: Use the Meijer App, programatically, in Python.

        meijer_api_key: email & password separated by pipe (|)
            Default read from environment variable MEIJER_API_KEY.
        """
        if meijer_api_key is None:
            meijer_api_key = os.environ["MEIJER_API_KEY"]
        user, password = meijer_api_key.strip().split("|")
        self.user = user
        self.password = password
        self.list = MeijerList(self)
        self.login()

    def login(self):
        request = dict()
        request["url"] = "https://login.meijer.com/as/token.oauth2"
        request["headers"] = {"Authorization": f"Basic {basic_token}"}
        request["params"] = {
            "grant_type": "password",
            "scope": "openid",
            "username": self.user,
            "password": self.password,
        }

        # access_token=<JWT Token>
        # refresh_token=<Refresh Token>
        # token_type=Bearer
        # expires_in=604799 (7 days)
        r = self.post(**request)
        for key, value in r.items():
            setattr(self, key, value)

        # Break apart the JWT to get the MeijerID data
        # scope=['openid']
        # client_id=mma
        # iss=https://login.meijer.com/
        # sub=<INT>
        # eguest_id=<INT>
        # has_digital=<INT>
        # digital_id=<INT>
        # has_mperks=<INT>
        # mperks_shopper_id=<INT>
        # mperks_ext_shopper_id=<UUID>
        # exp=<>
        _, meijer_id64, _ = self.access_token.split(".")
        ids = json.loads(base64.decodebytes(f"{meijer_id64}=".encode()))
        for key, value in ids.items():
            setattr(self, key, value)
        self.bearer_token = f"{self.token_type} {self.access_token}"
        #
        self.session.headers.update({"Authorization": self.bearer_token})

    @cached_property
    def coupons(self):
        # Coupons
        request = dict()
        request["url"] = "https://mperksservices.meijer.com/dgtlmPerksMMA/api/offers"
        request["headers"] = {
            "Accept": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
            "Content-Type": "application/vnd.meijer.digitalmperks.offers-v1.0+json",
        }
        request["json"] = json.loads(
            '{"categoryId":"","ceilingCount":0,"ceilingDuration":0,"currentPage":1,"displayReasonFilters":[],"getOfferCountPerDepartment":true,"offerClass":1,"offerIds":[],"pageSize":9999,"rewardCouponId":0,"searchCriteria":"","showClippedCoupons":false,"showOnlySpecialOffers":false,"showRedeemedOffers":false,"sortType":"BySuggested","storeId":52,"tagId":"","upcList":[],"zip":""}'
        )
        r = self.post(**request)
        return r["listOfCoupons"]

    def clip(self, coupon):
        if isinstance(coupon, dict):
            meijerOfferId = coupon["meijerOfferId"]
        elif isinstance(coupon, [str, int]):
            meijerOfferId = coupon

        request = {
            "url": "https://mperksservices.meijer.com/dgtlmPerksMMA/api/offers/Clip",
            "json": {"meijerOfferId": meijerOfferId},
        }
        request["headers"] = {
            "Accept": "application/vnd.meijer.digitalmperks.clip-v1.0+json",
            "Content-Type": "application/vnd.meijer.digitalmperks.clip-v1.0+json",
        }
        r = self.post(**request)

    def stores(self, location: List[float] = None, distance: float = None):
        if location is None:
            latitude, longitude = 43.016570, -85.726290
        else:
            latitude, longitude = location
        if distance is None:
            distance = 10000

        request = {
            "url": "https://mservices.meijer.com/storeinfo/api/mobile/near",
            "headers": {"Version": "7"},
        }
        request["params"] = {
            "latitude": latitude,
            "longitude": longitude,
            "miles": distance,
            "numToReturn": "10000",
        }
        r = self.get(**request)
        return r["store"]

    def get_store(self, store_id):
        request = dict()
        request[
            "url"
        ] = "https://mservices.meijer.com/storeinfo/api/mobile/stores/{}?dataVariant=2".format(
            store_id
        )
        request["headers"] = {"Version": "7"}
        r = self.get(**request)
        return r["store"]

    def get_upc(self, upc="4125010200", storeID="226"):
        request = dict()
        request[
            "url"
        ] = f"https://mservices.meijer.com/DRNavMobileSvc/search/products?storeId={storeID}&q.upc={upc}"
        request["headers"] = {
            "Accept": "application/vnd.meijer.search.product-v1.2+json"
        }
        r = self.get(**request)
        return r

    def get_name(self, name="chicken", storeID="226"):
        request = dict()
        request[
            "url"
        ] = f"https://ac.cnstrc.com/search/{name}?page=1&num_results_per_page=30&filters%5BavailableInStores%5D={storeID}&key=key_GdYuTcnduTUtsZd6"
        request["headers"] = {
            "Accept": "application/vnd.meijer.search.product-v1.2+json"
        }
        r = self.get(**request)
        return r

    def add_to_cart(self, upc="4125010200", storeID="226"):
        request = dict()
        request[
            "url"
        ] = f"https://api.meijer.com/digital/occ/v3/carts/current/add/{upc}/1.0?store={storeID}&fields=FULL&retainOutOfStock=true"
        request["headers"] = {
            "Accept": "application/json",
            "Ocp-Apim-Subscription-Key": "58763460fcb547f99a1c82e5daa4cbf6"

        }
        r = self.post(**request)
        return r

    def get_receipts(self):
        request = dict()
        request[
            "url"
        ] = f"https://mperksservices.meijer.com/dgtlmPerksMMA/api/digitalreceipt/DigitalReceiptsSummary"
        request["json"] = {}
        request["headers"] = {
            "Accept": "application/vnd.meijer.digitalmperks.digitalreceipts-v2.0+json",
            "Platform": "Android",
            "Version": "8.4.3",
            "Build": "80403000",
            "Content-Type": "application/vnd.meijer.digitalmperks.digitalreceipts-v2.0+json"

        }
        r = self.post(**request)
        return r

    def get_digital_receipt(self, receiptID):
        request = dict()
        request[
            "url"
        ] = f"https://mperksservices.meijer.com/dgtlmPerksMMA/api/digitalreceipt/ViewDigitalReceipt"

        request["json"] = {"receiptID": receiptID}
        request["headers"] = {
            "Accept": "application/vnd.meijer.digitalmperks.viewdigitalreceipt-v1.0+json",
            "Platform": "Android",
            "Version": "8.4.3",
            "Build": "80403000",
            "Content-Type": "application/vnd.meijer.digitalmperks.viewdigitalreceipt-v1.0+json"


        }
        r = self.post(**request)
        return r

    def __repr__(self):
        return "Meijer<>"

    def __enter__(self):
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        pass
