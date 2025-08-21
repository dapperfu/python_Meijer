package qh;

import Mv.h;
import com.fullstory.FS;
import java.net.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Headers;
import okhttp3.OkHttpClient;

/* renamed from: qh.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16669c {

    /* renamed from: a, reason: collision with root package name */
    private final long f158460a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f158461b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC16667a f158462c;

    /* renamed from: d, reason: collision with root package name */
    private final Proxy f158463d;

    /* renamed from: e, reason: collision with root package name */
    private final Mv.a f158464e;

    /* renamed from: f, reason: collision with root package name */
    private final OkHttpClient f158465f;

    /* renamed from: g, reason: collision with root package name */
    private final SocketFactory f158466g;

    /* renamed from: h, reason: collision with root package name */
    private final long f158467h;

    /* renamed from: i, reason: collision with root package name */
    private final SSLSocketFactory f158468i;

    /* renamed from: j, reason: collision with root package name */
    private final X509TrustManager f158469j;

    public void a(OkHttpClient.Builder builder) {
        builder.f(new h(5, 5L, TimeUnit.SECONDS));
        long j10 = this.f158460a;
        if (j10 > 0) {
            builder.d(j10, TimeUnit.MILLISECONDS);
        }
        long j11 = this.f158467h;
        if (j11 > 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.V(j11, timeUnit).b0(this.f158467h, timeUnit);
        }
        builder.X(false);
        SocketFactory socketFactory = this.f158466g;
        if (socketFactory != null) {
            builder.Z(socketFactory);
        }
        SSLSocketFactory sSLSocketFactory = this.f158468i;
        if (sSLSocketFactory != null) {
            builder.a0(sSLSocketFactory, this.f158469j);
        }
        Proxy proxy = this.f158463d;
        if (proxy != null) {
            builder.T(proxy);
            Mv.a aVar = this.f158464e;
            if (aVar != null) {
                builder.U(aVar);
            }
        }
    }

    public Iterable<Map.Entry<String, String>> b() {
        return this.f158461b.entrySet();
    }

    public OkHttpClient c() {
        return this.f158465f;
    }

    public Iterable<Map.Entry<String, String>> d() {
        if (this.f158462c == null) {
            return this.f158461b.entrySet();
        }
        HashMap map = new HashMap(this.f158461b);
        this.f158462c.a(map);
        return map.entrySet();
    }

    public Headers.a f() {
        Headers.a aVar = new Headers.a();
        for (Map.Entry<String, String> entry : d()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        return aVar;
    }

    public OkHttpClient.Builder g() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        a(builder);
        return builder;
    }

    public C16669c(long j10, Map<String, String> map, InterfaceC16667a interfaceC16667a, Proxy proxy, Mv.a aVar, SocketFactory socketFactory, long j11, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        Map<String, String> map2;
        this.f158460a = j10 <= 0 ? 10000L : j10;
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        } else {
            map2 = new HashMap<>(map);
        }
        this.f158461b = map2;
        this.f158462c = interfaceC16667a;
        this.f158463d = proxy;
        this.f158464e = aVar;
        this.f158465f = null;
        this.f158466g = socketFactory;
        this.f158467h = j11 > 0 ? j11 : 10000L;
        this.f158468i = sSLSocketFactory;
        this.f158469j = x509TrustManager;
    }

    public static void e(OkHttpClient okHttpClient) {
        if (okHttpClient.getDispatcher() != null) {
            okHttpClient.getDispatcher().a();
            if (okHttpClient.getDispatcher().d() != null) {
                okHttpClient.getDispatcher().d().shutdown();
            }
        }
        if (okHttpClient.getConnectionPool() != null) {
            okHttpClient.getConnectionPool().c();
        }
        if (okHttpClient.getCache() != null) {
            try {
                okHttpClient.getCache().close();
            } catch (Exception unused) {
            }
        }
    }
}
