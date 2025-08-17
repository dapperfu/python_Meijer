package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.a;
import com.google.maps.android.BuildConfig;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* loaded from: classes4.dex */
final class l {

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f62985a;

        /* renamed from: b, reason: collision with root package name */
        private final VolleyError f62986b;

        private b(String str, VolleyError volleyError) {
            this.f62985a = str;
            this.f62986b = volleyError;
        }
    }

    static byte[] c(InputStream inputStream, int i10, c cVar) throws IOException {
        byte[] bArrA;
        m mVar = new m(cVar, i10);
        try {
            bArrA = cVar.a(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrA);
                    if (i11 == -1) {
                        break;
                    }
                    mVar.write(bArrA, 0, i11);
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            com.android.volley.n.e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.b(bArrA);
                    mVar.close();
                    throw th;
                }
            }
            byte[] byteArray = mVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                com.android.volley.n.e("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.b(bArrA);
            mVar.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }

    static void d(long j10, com.android.volley.i<?> iVar, byte[] bArr, int i10) {
        if (com.android.volley.n.f62943b || j10 > 3000) {
            com.android.volley.n.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", iVar, Long.valueOf(j10), bArr != null ? Integer.valueOf(bArr.length) : BuildConfig.TRAVIS, Integer.valueOf(i10), Integer.valueOf(iVar.getRetryPolicy().a()));
        }
    }

    static b e(com.android.volley.i<?> iVar, IOException iOException, long j10, f fVar, byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new TimeoutError());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + iVar.getUrl(), iOException);
        }
        if (fVar == null) {
            if (!iVar.shouldRetryConnectionErrors()) {
                throw new NoConnectionError(iOException);
            }
            return new b("connection", new NoConnectionError());
        }
        int iD = fVar.d();
        com.android.volley.n.c("Unexpected response code %d for %s", Integer.valueOf(iD), iVar.getUrl());
        if (bArr == null) {
            return new b("network", new NetworkError());
        }
        com.android.volley.h hVar = new com.android.volley.h(iD, bArr, false, SystemClock.elapsedRealtime() - j10, fVar.c());
        if (iD == 401 || iD == 403) {
            return new b("auth", new AuthFailureError(hVar));
        }
        if (iD >= 400 && iD <= 499) {
            throw new ClientError(hVar);
        }
        if (iD < 500 || iD > 599 || !iVar.shouldRetryServerErrors()) {
            throw new ServerError(hVar);
        }
        return new b("server", new ServerError(hVar));
    }

    static void a(com.android.volley.i<?> iVar, b bVar) throws VolleyError {
        com.android.volley.m retryPolicy = iVar.getRetryPolicy();
        int timeoutMs = iVar.getTimeoutMs();
        try {
            retryPolicy.b(bVar.f62986b);
            iVar.addMarker(String.format("%s-retry [timeout=%s]", bVar.f62985a, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e10) {
            iVar.addMarker(String.format("%s-timeout-giveup [timeout=%s]", bVar.f62985a, Integer.valueOf(timeoutMs)));
            throw e10;
        }
    }

    static com.android.volley.h b(com.android.volley.i<?> iVar, long j10, List<com.android.volley.e> list) {
        a.C1240a cacheEntry = iVar.getCacheEntry();
        if (cacheEntry == null) {
            return new com.android.volley.h(HttpResponseStatus.REDIRECTION_NOT_MODIFIED, (byte[]) null, true, j10, list);
        }
        return new com.android.volley.h(HttpResponseStatus.REDIRECTION_NOT_MODIFIED, cacheEntry.f62879a, true, j10, e.a(list, cacheEntry));
    }
}
