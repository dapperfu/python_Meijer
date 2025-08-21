package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import r7.C16870c;

/* loaded from: classes4.dex */
public class j implements d<InputStream> {

    /* renamed from: g, reason: collision with root package name */
    static final b f64617g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final d7.h f64618a;

    /* renamed from: b, reason: collision with root package name */
    private final int f64619b;

    /* renamed from: c, reason: collision with root package name */
    private final b f64620c;

    /* renamed from: d, reason: collision with root package name */
    private HttpURLConnection f64621d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f64622e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f64623f;

    interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(d7.h hVar, int i10) {
        this(hVar, i10, f64617g);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionA = this.f64620c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f64619b);
            httpURLConnectionA.setReadTimeout(this.f64619b);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new HttpException("URL.openConnection threw", 0, e10);
        }
    }

    private InputStream j(URL url, int i10, URL url2, Map<String, String> map) throws IOException {
        if (i10 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionC = c(url, map);
        this.f64621d = httpURLConnectionC;
        try {
            httpURLConnectionC.connect();
            this.f64622e = this.f64621d.getInputStream();
            if (this.f64623f) {
                return null;
            }
            int iF = f(this.f64621d);
            if (h(iF)) {
                return g(this.f64621d);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new HttpException(iF);
                }
                try {
                    throw new HttpException(this.f64621d.getResponseMessage(), iF);
                } catch (IOException e10) {
                    throw new HttpException("Failed to get a response message", iF, e10);
                }
            }
            String headerField = this.f64621d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new HttpException("Bad redirect url: " + headerField, iF, e11);
            }
        } catch (IOException e12) {
            throw new HttpException("Failed to connect or obtain data", f(this.f64621d), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f64623f = true;
    }

    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection())));
        }
    }

    j(d7.h hVar, int i10, b bVar) {
        this.f64618a = hVar;
        this.f64619b = i10;
        this.f64620c = bVar;
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f64622e = C16870c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    FS.log_d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f64622e = httpURLConnection.getInputStream();
            }
            return this.f64622e;
        } catch (IOException e10) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f64622e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f64621d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f64621d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public X6.a d() {
        return X6.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        long jB = r7.g.b();
        try {
            try {
                aVar.f(j(this.f64618a.f(), 0, null, this.f64618a.c()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    FS.log_v("HttpUrlFetcher", "Finished http url fetcher fetch in " + r7.g.a(jB));
                }
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    FS.log_d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    FS.log_v("HttpUrlFetcher", "Finished http url fetcher fetch in " + r7.g.a(jB));
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                FS.log_v("HttpUrlFetcher", "Finished http url fetcher fetch in " + r7.g.a(jB));
            }
            throw th2;
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                FS.log_d("HttpUrlFetcher", "Failed to get a response code", e10);
                return -1;
            }
            return -1;
        }
    }
}
