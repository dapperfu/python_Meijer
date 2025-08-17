package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.constructor.BuildConfig;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public class h extends com.android.volley.toolbox.a {

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f62983a;

    public interface b {
    }

    public h() {
        this(null);
    }

    private void c(HttpURLConnection httpURLConnection, com.android.volley.i<?> iVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", iVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(h(iVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private static boolean i(int i10, int i11) {
        if (i10 != 4) {
            return ((100 <= i11 && i11 < 200) || i11 == 204 || i11 == 304) ? false : true;
        }
        return false;
    }

    static class a extends FilterInputStream implements InputStreamRetargetInterface {

        /* renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f62984a;

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        a(HttpURLConnection httpURLConnection) {
            super(h.j(httpURLConnection));
            this.f62984a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f62984a.disconnect();
        }
    }

    public h(b bVar) {
        this(bVar, null);
    }

    static List<com.android.volley.e> e(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.android.volley.e(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    protected InputStream g(com.android.volley.i<?> iVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    public h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f62983a = sSLSocketFactory;
    }

    private void d(HttpURLConnection httpURLConnection, com.android.volley.i<?> iVar) throws IOException, AuthFailureError {
        byte[] body = iVar.getBody();
        if (body != null) {
            c(httpURLConnection, iVar, body);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream j(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection k(URL url, com.android.volley.i<?> iVar) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionF = f(url);
        int timeoutMs = iVar.getTimeoutMs();
        httpURLConnectionF.setConnectTimeout(timeoutMs);
        httpURLConnectionF.setReadTimeout(timeoutMs);
        httpURLConnectionF.setUseCaches(false);
        httpURLConnectionF.setDoInput(true);
        if (BuildConfig.SERVICE_SCHEME.equals(url.getProtocol()) && (sSLSocketFactory = this.f62983a) != null) {
            ((HttpsURLConnection) httpURLConnectionF).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionF;
    }

    @Override // com.android.volley.toolbox.a
    public f a(com.android.volley.i<?> iVar, Map<String, String> map) throws IOException, AuthFailureError {
        String url = iVar.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(iVar.getHeaders());
        HttpURLConnection httpURLConnectionK = k(new URL(url), iVar);
        try {
            for (String str : map2.keySet()) {
                httpURLConnectionK.setRequestProperty(str, (String) map2.get(str));
            }
            l(httpURLConnectionK, iVar);
            int responseCode = httpURLConnectionK.getResponseCode();
            if (responseCode != -1) {
                if (!i(iVar.getMethod(), responseCode)) {
                    f fVar = new f(responseCode, e(httpURLConnectionK.getHeaderFields()));
                    httpURLConnectionK.disconnect();
                    return fVar;
                }
                return new f(responseCode, e(httpURLConnectionK.getHeaderFields()), httpURLConnectionK.getContentLength(), g(iVar, httpURLConnectionK));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            if (0 == 0) {
                httpURLConnectionK.disconnect();
            }
            throw th2;
        }
    }

    protected HttpURLConnection f(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection())));
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    protected OutputStream h(com.android.volley.i<?> iVar, HttpURLConnection httpURLConnection, int i10) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    void l(HttpURLConnection httpURLConnection, com.android.volley.i<?> iVar) throws IOException, AuthFailureError {
        switch (iVar.getMethod()) {
            case -1:
                byte[] postBody = iVar.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    c(httpURLConnection, iVar, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                d(httpURLConnection, iVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                d(httpURLConnection, iVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                d(httpURLConnection, iVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
