package com.bugsnag.android;

import android.net.TrafficStats;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J=\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(¨\u0006)"}, d2 = {"Lcom/bugsnag/android/F;", "Lcom/bugsnag/android/H;", "Lcom/bugsnag/android/y;", "connectivity", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(Lcom/bugsnag/android/y;Lcom/bugsnag/android/D0;)V", "Ljava/net/URL;", "url", "", "json", "", "integrity", "", "headers", "Ljava/net/HttpURLConnection;", "e", "(Ljava/net/URL;[BLjava/lang/String;Ljava/util/Map;)Ljava/net/HttpURLConnection;", "", "code", "conn", "Lcom/bugsnag/android/L;", "status", "", "d", "(ILjava/net/HttpURLConnection;Lcom/bugsnag/android/L;)V", "Lcom/bugsnag/android/V0;", "payload", "Lcom/bugsnag/android/K;", "deliveryParams", "a", "(Lcom/bugsnag/android/V0;Lcom/bugsnag/android/K;)Lcom/bugsnag/android/L;", "Lcom/bugsnag/android/e0;", "b", "(Lcom/bugsnag/android/e0;Lcom/bugsnag/android/K;)Lcom/bugsnag/android/L;", "urlString", "c", "(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;)Lcom/bugsnag/android/L;", "Lcom/bugsnag/android/y;", "Lcom/bugsnag/android/D0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class F implements H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6629y connectivity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    @Override // com.bugsnag.android.H
    public L b(C6591e0 payload, K deliveryParams) throws IOException {
        L lC = c(deliveryParams.getEndpoint(), C6591e0.i(payload, 0, 1, null).a(), payload.e(), deliveryParams.b());
        this.logger.f(Intrinsics.q("Error API request finished with status ", lC));
        return lC;
    }

    public final L c(String urlString, byte[] json, String integrity, Map<String, String> headers) {
        TrafficStats.setThreadStatsTag(1);
        InterfaceC6629y interfaceC6629y = this.connectivity;
        if (interfaceC6629y != null && !interfaceC6629y.b()) {
            return L.UNDELIVERED;
        }
        HttpURLConnection httpURLConnectionE = null;
        try {
            try {
                try {
                    httpURLConnectionE = e(new URL(urlString), json, integrity, headers);
                    int responseCode = httpURLConnectionE.getResponseCode();
                    L lA = L.INSTANCE.a(responseCode);
                    d(responseCode, httpURLConnectionE, lA);
                    httpURLConnectionE.disconnect();
                    return lA;
                } catch (OutOfMemoryError e10) {
                    this.logger.b("Encountered OOM delivering payload, falling back to persist on disk", e10);
                    L l10 = L.UNDELIVERED;
                    if (httpURLConnectionE != null) {
                        httpURLConnectionE.disconnect();
                    }
                    return l10;
                }
            } catch (IOException e11) {
                this.logger.b("IOException encountered in request", e11);
                L l11 = L.UNDELIVERED;
                if (httpURLConnectionE != null) {
                    httpURLConnectionE.disconnect();
                }
                return l11;
            } catch (Exception e12) {
                this.logger.b("Unexpected error delivering payload", e12);
                L l12 = L.FAILURE;
                if (httpURLConnectionE != null) {
                    httpURLConnectionE.disconnect();
                }
                return l12;
            }
        } catch (Throwable th2) {
            if (httpURLConnectionE != null) {
                httpURLConnectionE.disconnect();
            }
            throw th2;
        }
    }

    private final void d(int code, HttpURLConnection conn, L status) {
        BufferedReader bufferedReader;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.logger.f("Request completed with code " + code + ", message: " + ((Object) conn.getResponseMessage()) + ", headers: " + conn.getHeaderFields());
            Result.b(Unit.f143329a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.b(ResultKt.a(th2));
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream(), Charsets.UTF_8), 8192);
            try {
                this.logger.d(Intrinsics.q("Received request response: ", TextStreamsKt.d(bufferedReader)));
                Unit unit = Unit.f143329a;
                CloseableKt.a(bufferedReader, null);
                Result.b(Unit.f143329a);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.b(ResultKt.a(th3));
        }
        try {
            if (status != L.DELIVERED) {
                bufferedReader = new BufferedReader(new InputStreamReader(conn.getErrorStream(), Charsets.UTF_8), 8192);
                try {
                    this.logger.g(Intrinsics.q("Request error details: ", TextStreamsKt.d(bufferedReader)));
                    Unit unit2 = Unit.f143329a;
                    CloseableKt.a(bufferedReader, null);
                } finally {
                }
            }
            Result.b(Unit.f143329a);
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.b(ResultKt.a(th4));
        }
    }

    public F(InterfaceC6629y interfaceC6629y, D0 d02) {
        this.connectivity = interfaceC6629y;
        this.logger = d02;
    }

    private final HttpURLConnection e(URL url, byte[] json, String integrity, Map<String, String> headers) throws IOException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection()));
        if (uRLConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(json.length);
            if (integrity != null) {
                httpURLConnection.addRequestProperty("Bugsnag-Integrity", integrity);
            }
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value != null) {
                    httpURLConnection.addRequestProperty(key, value);
                }
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(json);
                Unit unit = Unit.f143329a;
                CloseableKt.a(outputStream, null);
                return httpURLConnection;
            } finally {
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
    }

    @Override // com.bugsnag.android.H
    public L a(V0 payload, K deliveryParams) {
        L lC = c(deliveryParams.getEndpoint(), R6.q.f32021a.g(payload), payload.f(), deliveryParams.b());
        this.logger.f(Intrinsics.q("Session API request finished with status ", lC));
        return lC;
    }
}
