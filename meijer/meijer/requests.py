from cached_property import cached_property
import requests
import base64

class RequestsMixin():
    @cached_property
    def session(self):
        # Create a requests session.
        s = requests.Session()
        s.headers.update(
            {
                "Platform": "Android",
                "Version": "5.20.1",
                "Build": "52001000",
                "Content-Type": "application/x-www-form-urlencoded",
                "Connection": "Keep-Alive",
                "Accept-Encoding": "gzip",
                "User-Agent": "okhttp/3.8.0",
            }
        )
        return s

    def post(self, **request):
        r = self.session.post(**request)
        self.r_ = r  # debugs
        assert r.status_code == 200 or r.status_code == 201
        try:
            return r.json()
        except:
            return r

    def get(self, **request):
        r = self.session.get(**request)
        self.r_ = r  # debugs
        assert r.status_code == 200
        try:
            return r.json()
        except:
            return r


    def put(self, **request):
        r = self.session.put(**request)
        self.r_ = r  # debugs
        assert r.status_code == 200
        try:
            return r.json()
        except:
            return r