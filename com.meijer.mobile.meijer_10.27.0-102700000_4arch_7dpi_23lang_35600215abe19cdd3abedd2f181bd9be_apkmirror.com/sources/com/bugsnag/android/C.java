package com.bugsnag.android;

import Q6.TrimMetrics;
import android.net.TrafficStats;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001'B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020$2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010*J3\u0010,\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00103¨\u00064"}, d2 = {"Lcom/bugsnag/android/C;", "Lcom/bugsnag/android/D;", "Lcom/bugsnag/android/v;", "connectivity", "", "apiKey", "", "maxStringValueLength", "Lcom/bugsnag/android/t0;", "logger", "<init>", "(Lcom/bugsnag/android/v;Ljava/lang/String;ILcom/bugsnag/android/t0;)V", "Lcom/bugsnag/android/Y;", "payload", "", "h", "(Lcom/bugsnag/android/Y;)[B", "Ljava/net/URL;", "url", "json", "", "headers", "Ljava/net/HttpURLConnection;", "g", "(Ljava/net/URL;[BLjava/util/Map;)Ljava/net/HttpURLConnection;", "code", "conn", "Lcom/bugsnag/android/H;", "status", "", "f", "(ILjava/net/HttpURLConnection;Lcom/bugsnag/android/H;)V", "responseCode", "", "e", "(I)Z", "Lcom/bugsnag/android/K0;", "Lcom/bugsnag/android/G;", "deliveryParams", "a", "(Lcom/bugsnag/android/K0;Lcom/bugsnag/android/G;)Lcom/bugsnag/android/H;", "b", "(Lcom/bugsnag/android/Y;Lcom/bugsnag/android/G;)Lcom/bugsnag/android/H;", "urlString", "c", "(Ljava/lang/String;[BLjava/util/Map;)Lcom/bugsnag/android/H;", "d", "(I)Lcom/bugsnag/android/H;", "Lcom/bugsnag/android/v;", "Ljava/lang/String;", "I", "Lcom/bugsnag/android/t0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class C implements D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6498v connectivity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String apiKey;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxStringValueLength;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    private final boolean e(int responseCode) {
        return 400 <= responseCode && 499 >= responseCode && responseCode != 408 && responseCode != 429;
    }

    public final H c(String urlString, byte[] json, Map<String, String> headers) {
        TrafficStats.setThreadStatsTag(1);
        InterfaceC6498v interfaceC6498v = this.connectivity;
        if (interfaceC6498v != null && !interfaceC6498v.b()) {
            return H.UNDELIVERED;
        }
        HttpURLConnection httpURLConnectionG = null;
        try {
            try {
                try {
                    httpURLConnectionG = g(new URL(urlString), json, headers);
                    int responseCode = httpURLConnectionG.getResponseCode();
                    H hD = d(responseCode);
                    f(responseCode, httpURLConnectionG, hD);
                    httpURLConnectionG.disconnect();
                    return hD;
                } catch (IOException e10) {
                    this.logger.b("IOException encountered in request", e10);
                    H h10 = H.UNDELIVERED;
                    if (httpURLConnectionG != null) {
                        httpURLConnectionG.disconnect();
                    }
                    return h10;
                }
            } catch (Exception e11) {
                this.logger.b("Unexpected error delivering payload", e11);
                H h11 = H.FAILURE;
                if (httpURLConnectionG != null) {
                    httpURLConnectionG.disconnect();
                }
                return h11;
            } catch (OutOfMemoryError e12) {
                this.logger.b("Encountered OOM delivering payload, falling back to persist on disk", e12);
                H h12 = H.UNDELIVERED;
                if (httpURLConnectionG != null) {
                    httpURLConnectionG.disconnect();
                }
                return h12;
            }
        } catch (Throwable th2) {
            if (httpURLConnectionG != null) {
                httpURLConnectionG.disconnect();
            }
            throw th2;
        }
    }

    private final void f(int code, HttpURLConnection conn, H status) {
        BufferedReader bufferedReader;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.logger.f("Request completed with code " + code + ", message: " + conn.getResponseMessage() + ", headers: " + conn.getHeaderFields());
            Result.b(Unit.f142422a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.b(ResultKt.a(th2));
        }
        try {
            InputStream inputStream = conn.getInputStream();
            Intrinsics.f(inputStream, "conn.inputStream");
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
            try {
                this.logger.d("Received request response: " + TextStreamsKt.d(bufferedReader));
                Unit unit = Unit.f142422a;
                CloseableKt.a(bufferedReader, null);
                Result.b(Unit.f142422a);
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
            if (status != H.DELIVERED) {
                InputStream errorStream = conn.getErrorStream();
                Intrinsics.f(errorStream, "conn.errorStream");
                bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
                try {
                    this.logger.g("Request error details: " + TextStreamsKt.d(bufferedReader));
                    Unit unit2 = Unit.f142422a;
                    CloseableKt.a(bufferedReader, null);
                } finally {
                }
            }
            Result.b(Unit.f142422a);
        } catch (Throwable th4) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.b(ResultKt.a(th4));
        }
    }

    private final byte[] h(Y payload) {
        Q6.k kVar = Q6.k.f29894c;
        byte[] bArrE = kVar.e(payload);
        if (bArrE.length <= 999700) {
            return bArrE;
        }
        V event = payload.getEvent();
        if (event == null) {
            File eventFile = payload.getEventFile();
            if (eventFile == null) {
                Intrinsics.t();
            }
            event = new C6499v0(eventFile, this.apiKey, this.logger).invoke();
            payload.f(event);
            payload.e(this.apiKey);
        }
        TrimMetrics trimMetricsB = event.f().B(this.maxStringValueLength);
        event.f().getInternalMetrics().b(trimMetricsB.getItemsTrimmed(), trimMetricsB.getDataTrimmed());
        byte[] bArrE2 = kVar.e(payload);
        if (bArrE2.length <= 999700) {
            return bArrE2;
        }
        TrimMetrics trimMetricsA = event.f().A(bArrE2.length - 999700);
        event.f().getInternalMetrics().d(trimMetricsA.d(), trimMetricsA.c());
        return kVar.e(payload);
    }

    public final H d(int responseCode) {
        return (200 <= responseCode && 299 >= responseCode) ? H.DELIVERED : e(responseCode) ? H.FAILURE : H.UNDELIVERED;
    }

    public C(InterfaceC6498v interfaceC6498v, String str, int i10, InterfaceC6495t0 interfaceC6495t0) {
        this.connectivity = interfaceC6498v;
        this.apiKey = str;
        this.maxStringValueLength = i10;
        this.logger = interfaceC6495t0;
    }

    private final HttpURLConnection g(URL url, byte[] json, Map<String, String> headers) throws IOException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection()));
        if (uRLConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(json.length);
            String strA = F.a(json);
            if (strA != null) {
                httpURLConnection.addRequestProperty("Bugsnag-Integrity", strA);
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
                Unit unit = Unit.f142422a;
                CloseableKt.a(outputStream, null);
                return httpURLConnection;
            } finally {
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
    }

    @Override // com.bugsnag.android.D
    public H a(K0 payload, G deliveryParams) {
        H hC = c(deliveryParams.getEndpoint(), Q6.k.f29894c.e(payload), deliveryParams.b());
        this.logger.f("Session API request finished with status " + hC);
        return hC;
    }

    @Override // com.bugsnag.android.D
    public H b(Y payload, G deliveryParams) {
        H hC = c(deliveryParams.getEndpoint(), h(payload), deliveryParams.b());
        this.logger.f("Error API request finished with status " + hC);
        return hC;
    }
}
