package ph;

import Qv.h;
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

/* renamed from: ph.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16305c {

    /* renamed from: a, reason: collision with root package name */
    private final long f155744a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f155745b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC16303a f155746c;

    /* renamed from: d, reason: collision with root package name */
    private final Proxy f155747d;

    /* renamed from: e, reason: collision with root package name */
    private final Qv.a f155748e;

    /* renamed from: f, reason: collision with root package name */
    private final OkHttpClient f155749f;

    /* renamed from: g, reason: collision with root package name */
    private final SocketFactory f155750g;

    /* renamed from: h, reason: collision with root package name */
    private final long f155751h;

    /* renamed from: i, reason: collision with root package name */
    private final SSLSocketFactory f155752i;

    /* renamed from: j, reason: collision with root package name */
    private final X509TrustManager f155753j;

    public void a(OkHttpClient.Builder builder) {
        builder.f(new h(5, 5L, TimeUnit.SECONDS));
        long j10 = this.f155744a;
        if (j10 > 0) {
            builder.d(j10, TimeUnit.MILLISECONDS);
        }
        long j11 = this.f155751h;
        if (j11 > 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.V(j11, timeUnit).b0(this.f155751h, timeUnit);
        }
        builder.X(false);
        SocketFactory socketFactory = this.f155750g;
        if (socketFactory != null) {
            builder.Z(socketFactory);
        }
        SSLSocketFactory sSLSocketFactory = this.f155752i;
        if (sSLSocketFactory != null) {
            builder.a0(sSLSocketFactory, this.f155753j);
        }
        Proxy proxy = this.f155747d;
        if (proxy != null) {
            builder.T(proxy);
            Qv.a aVar = this.f155748e;
            if (aVar != null) {
                builder.U(aVar);
            }
        }
    }

    public Iterable<Map.Entry<String, String>> b() {
        return this.f155745b.entrySet();
    }

    public OkHttpClient c() {
        return this.f155749f;
    }

    public Iterable<Map.Entry<String, String>> d() {
        if (this.f155746c == null) {
            return this.f155745b.entrySet();
        }
        HashMap map = new HashMap(this.f155745b);
        this.f155746c.a(map);
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

    public C16305c(long j10, Map<String, String> map, InterfaceC16303a interfaceC16303a, Proxy proxy, Qv.a aVar, SocketFactory socketFactory, long j11, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        Map<String, String> map2;
        this.f155744a = j10 <= 0 ? 10000L : j10;
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        } else {
            map2 = new HashMap<>(map);
        }
        this.f155745b = map2;
        this.f155746c = interfaceC16303a;
        this.f155747d = proxy;
        this.f155748e = aVar;
        this.f155749f = null;
        this.f155750g = socketFactory;
        this.f155751h = j11 > 0 ? j11 : 10000L;
        this.f155752i = sSLSocketFactory;
        this.f155753j = x509TrustManager;
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
