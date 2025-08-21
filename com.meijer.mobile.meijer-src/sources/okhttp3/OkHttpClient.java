package okhttp3;

import Mv.r;
import Rv.o;
import Rv.u;
import bw.c;
import com.fullstory.FS;
import j$.time.Duration;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.d;
import okhttp3.g;
import okhttp3.internal.platform.c;
import okhttp3.m;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u0002:\u0003¡\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001b8G¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 8G¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 8G¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0017\u0010.\u001a\u00020)8G¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8G¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00106\u001a\u00020/8G¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b5\u00103R\u0017\u0010;\u001a\u0002078G¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u0017\u0010>\u001a\u00020/8G¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u0017\u0010A\u001a\u00020/8G¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u00103R\u0017\u0010G\u001a\u00020B8G¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010L\u001a\u0004\u0018\u00010H8G¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b<\u0010KR\u0017\u0010R\u001a\u00020M8G¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010X\u001a\u0004\u0018\u00010S8G¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010^\u001a\u00020Y8G¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010`\u001a\u0002078G¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\b_\u0010:R\u0017\u0010e\u001a\u00020a8G¢\u0006\f\n\u0004\b\u001d\u0010b\u001a\u0004\bc\u0010dR\u0016\u0010h\u001a\u0004\u0018\u00010f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010gR\u0019\u0010m\u001a\u0004\u0018\u00010i8G¢\u0006\f\n\u0004\b,\u0010j\u001a\u0004\bk\u0010lR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020n0 8G¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\bZ\u0010$R\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020p0 8G¢\u0006\f\n\u0004\b=\u0010\"\u001a\u0004\bq\u0010$R\u0017\u0010w\u001a\u00020s8G¢\u0006\f\n\u0004\b@\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010|\u001a\u00020x8G¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\bI\u0010{R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010}8G¢\u0006\r\n\u0004\b~\u0010\u007f\u001a\u0005\bC\u0010\u0080\u0001R\u001a\u0010\u0084\u0001\u001a\u00030\u0082\u00018G¢\u0006\r\n\u0004\bu\u00102\u001a\u0005\b?\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0082\u00018G¢\u0006\r\n\u0004\b#\u00102\u001a\u0005\bN\u0010\u0083\u0001R\u001c\u0010\u0088\u0001\u001a\u00030\u0082\u00018G¢\u0006\u000f\n\u0005\b\u0086\u0001\u00102\u001a\u0006\b\u0087\u0001\u0010\u0083\u0001R\u001b\u0010\u008a\u0001\u001a\u00030\u0082\u00018G¢\u0006\u000e\n\u0004\b'\u00102\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001R\u001b\u0010\u008c\u0001\u001a\u00030\u0082\u00018G¢\u0006\u000e\n\u0004\b\u0019\u00102\u001a\u0006\b\u008b\u0001\u0010\u0083\u0001R\u001c\u0010\u008e\u0001\u001a\u00030\u0082\u00018G¢\u0006\u000f\n\u0005\b\u008b\u0001\u00102\u001a\u0006\b\u008d\u0001\u0010\u0083\u0001R\u001b\u0010\u0091\u0001\u001a\u00030\u008f\u00018G¢\u0006\u000e\n\u0004\bq\u0010c\u001a\u0006\b\u0086\u0001\u0010\u0090\u0001R\u001e\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bV\u0010\u0093\u0001\u001a\u0005\by\u0010\u0094\u0001R\u001e\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b_\u0010\u0097\u0001\u001a\u0005\b~\u0010\u0098\u0001R\u001b\u0010\u009d\u0001\u001a\u00030\u009a\u00018G¢\u0006\u000e\n\u0005\b\\\u0010\u009b\u0001\u001a\u0005\bT\u0010\u009c\u0001R\u0014\u0010 \u0001\u001a\u00020f8G¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¢\u0001"}, d2 = {"Lokhttp3/OkHttpClient;", "Lokhttp3/d$a;", "Lokhttp3/m$a;", "Lokhttp3/OkHttpClient$Builder;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "", "L", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/a;", "f", "(Lokhttp3/HttpUrl;)Lokhttp3/a;", "Lokhttp3/Request;", "request", "Lokhttp3/d;", "b", "(Lokhttp3/Request;)Lokhttp3/d;", "LMv/u;", "listener", "Lokhttp3/m;", "a", "(Lokhttp3/Request;LMv/u;)Lokhttp3/m;", "B", "()Lokhttp3/OkHttpClient$Builder;", "LMv/l;", "LMv/l;", "p", "()LMv/l;", "dispatcher", "", "Lokhttp3/Interceptor;", "Ljava/util/List;", "y", "()Ljava/util/List;", "interceptors", "c", "A", "networkInterceptors", "Lokhttp3/g$c;", "d", "Lokhttp3/g$c;", "r", "()Lokhttp3/g$c;", "eventListenerFactory", "", "e", "Z", "I", "()Z", "retryOnConnectionFailure", "s", "fastFallback", "LMv/a;", "g", "LMv/a;", "()LMv/a;", "authenticator", "h", "t", "followRedirects", "i", "u", "followSslRedirects", "LMv/j;", "j", "LMv/j;", "o", "()LMv/j;", "cookieJar", "Lokhttp3/b;", "k", "Lokhttp3/b;", "()Lokhttp3/b;", "cache", "LMv/m;", "l", "LMv/m;", "q", "()LMv/m;", "dns", "Ljava/net/Proxy;", "m", "Ljava/net/Proxy;", "E", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "n", "Ljava/net/ProxySelector;", "G", "()Ljava/net/ProxySelector;", "proxySelector", "F", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "J", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "O", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lokhttp3/f;", "connectionSpecs", "LMv/r;", "D", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "x", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "LMv/d;", "v", "LMv/d;", "()LMv/d;", "certificatePinner", "Lbw/c;", "w", "Lbw/c;", "()Lbw/c;", "certificateChainCleaner", "", "()I", "callTimeoutMillis", "connectTimeoutMillis", "z", "H", "readTimeoutMillis", "N", "writeTimeoutMillis", "C", "pingIntervalMillis", "M", "webSocketCloseTimeout", "", "()J", "minWebSocketMessageToCompress", "LRv/u;", "LRv/u;", "()LRv/u;", "routeDatabase", "LQv/d;", "LQv/d;", "()LQv/d;", "taskRunner", "LMv/h;", "LMv/h;", "()LMv/h;", "connectionPool", "K", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public class OkHttpClient implements d.a, m.a {

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: I, reason: collision with root package name */
    private static final List<r> f154328I = Nv.k.l(r.f20503f, r.f20501d);

    /* renamed from: J, reason: collision with root package name */
    private static final List<f> f154329J = Nv.k.l(f.f154654i, f.f154656k);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final int writeTimeoutMillis;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int pingIntervalMillis;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int webSocketCloseTimeout;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final long minWebSocketMessageToCompress;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final u routeDatabase;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Qv.d taskRunner;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Mv.h connectionPool;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Mv.l dispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Interceptor> interceptors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Interceptor> networkInterceptors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g.c eventListenerFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean retryOnConnectionFailure;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean fastFallback;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Mv.a authenticator;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean followRedirects;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean followSslRedirects;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Mv.j cookieJar;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final b cache;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Mv.m dns;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Proxy proxy;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ProxySelector proxySelector;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Mv.a proxyAuthenticator;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final SocketFactory socketFactory;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory sslSocketFactoryOrNull;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final X509TrustManager x509TrustManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final List<f> connectionSpecs;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List<r> protocols;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final HostnameVerifier hostnameVerifier;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Mv.d certificatePinner;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final bw.c certificateChainCleaner;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final int callTimeoutMillis;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final int readTimeoutMillis;

    @Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001d\u00109\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u001b\u0010>\u001a\u00020\u00002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;¢\u0006\u0004\b>\u0010?J\u001d\u0010D\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bF\u0010EJ\u0017\u0010I\u001a\u00020\u00002\u0006\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bI\u0010JJ\u001d\u0010K\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bK\u0010EJ\u0017\u0010L\u001a\u00020\u00002\u0006\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bL\u0010JJ\u001d\u0010M\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bM\u0010EJ\u0017\u0010N\u001a\u00020\u00002\u0006\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bN\u0010JJ\r\u0010O\u001a\u00020\u0004¢\u0006\u0004\bO\u0010PR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR \u0010]\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010[\u001a\u0004\b\\\u0010\u0012R \u0010_\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010[\u001a\u0004\b^\u0010\u0012R\"\u0010f\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u00103\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010m\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u00103\u001a\u0004\bk\u0010h\"\u0004\bl\u0010jR\"\u0010s\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010v\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00103\u001a\u0004\bt\u0010h\"\u0004\bu\u0010jR\"\u0010y\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u00103\u001a\u0004\bw\u0010h\"\u0004\bx\u0010jR\"\u0010\"\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R(\u0010&\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\b\u007f\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010*\u001a\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R,\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R%\u0010.\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010n\u001a\u0005\b\u009b\u0001\u0010p\"\u0005\b\u009c\u0001\u0010rR'\u00102\u001a\u0002018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bW\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R+\u0010¨\u0001\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010®\u0001\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b{\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R-\u0010²\u0001\u001a\t\u0012\u0005\u0012\u00030¯\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bR\u0010[\u001a\u0005\b¢\u0001\u0010\u0012\"\u0006\b°\u0001\u0010±\u0001R,\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0087\u0001\u0010[\u001a\u0005\b³\u0001\u0010\u0012\"\u0006\b´\u0001\u0010±\u0001R)\u0010»\u0001\u001a\u00030µ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bb\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R)\u0010Á\u0001\u001a\u00030¼\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bk\u0010½\u0001\u001a\u0006\b\u0093\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R+\u0010Ç\u0001\u001a\u0005\u0018\u00010Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bt\u0010Ã\u0001\u001a\u0006\b\u008c\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R)\u0010Í\u0001\u001a\u00030È\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bw\u0010É\u0001\u001a\u0006\b\u0085\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010Ï\u0001\u001a\u00030È\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010É\u0001\u001a\u0006\b\u009a\u0001\u0010Ê\u0001\"\u0006\bÎ\u0001\u0010Ì\u0001R)\u0010Ñ\u0001\u001a\u00030È\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\\\u0010É\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bÐ\u0001\u0010Ì\u0001R*\u0010Õ\u0001\u001a\u00030È\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010É\u0001\u001a\u0006\bÓ\u0001\u0010Ê\u0001\"\u0006\bÔ\u0001\u0010Ì\u0001R)\u0010Ø\u0001\u001a\u00030È\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010É\u0001\u001a\u0006\bÖ\u0001\u0010Ê\u0001\"\u0006\b×\u0001\u0010Ì\u0001R*\u0010Û\u0001\u001a\u00030È\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÖ\u0001\u0010É\u0001\u001a\u0006\bÙ\u0001\u0010Ê\u0001\"\u0006\bÚ\u0001\u0010Ì\u0001R(\u0010ß\u0001\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b³\u0001\u0010g\u001a\u0006\bÒ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R,\u0010æ\u0001\u001a\u0005\u0018\u00010à\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R,\u0010í\u0001\u001a\u0005\u0018\u00010ç\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001¨\u0006î\u0001"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "LMv/l;", "dispatcher", "h", "(LMv/l;)Lokhttp3/OkHttpClient$Builder;", "LMv/h;", "connectionPool", "f", "(LMv/h;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Interceptor;", "R", "()Ljava/util/List;", "interceptor", "addInterceptor", "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "addNetworkInterceptor", "Lokhttp3/g;", "eventListener", "i", "(Lokhttp3/g;)Lokhttp3/OkHttpClient$Builder;", "", "retryOnConnectionFailure", "X", "(Z)Lokhttp3/OkHttpClient$Builder;", "followProtocolRedirects", "j", "LMv/j;", "cookieJar", "g", "(LMv/j;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/b;", "cache", "b", "(Lokhttp3/b;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/Proxy;", "proxy", "T", "(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;", "LMv/a;", "proxyAuthenticator", "U", "(LMv/a;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/SocketFactory;", "socketFactory", "Z", "(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "a0", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", "", "LMv/r;", "protocols", "S", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "c", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", "d", "j$/time/Duration", "duration", "e", "(Lj$/time/Duration;)Lokhttp3/OkHttpClient$Builder;", "V", "W", "b0", "c0", "a", "()Lokhttp3/OkHttpClient;", "LMv/l;", "t", "()LMv/l;", "setDispatcher$okhttp", "(LMv/l;)V", "LMv/h;", "q", "()LMv/h;", "Y", "(LMv/h;)V", "Ljava/util/List;", "A", "interceptors", "C", "networkInterceptors", "Lokhttp3/g$c;", "Lokhttp3/g$c;", "v", "()Lokhttp3/g$c;", "setEventListenerFactory$okhttp", "(Lokhttp3/g$c;)V", "eventListenerFactory", "J", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "w", "setFastFallback$okhttp", "fastFallback", "LMv/a;", "k", "()LMv/a;", "setAuthenticator$okhttp", "(LMv/a;)V", "authenticator", "x", "setFollowRedirects$okhttp", "followRedirects", "y", "setFollowSslRedirects$okhttp", "followSslRedirects", "LMv/j;", "s", "()LMv/j;", "setCookieJar$okhttp", "(LMv/j;)V", "l", "Lokhttp3/b;", "()Lokhttp3/b;", "setCache$okhttp", "(Lokhttp3/b;)V", "LMv/m;", "m", "LMv/m;", "u", "()LMv/m;", "setDns$okhttp", "(LMv/m;)V", "dns", "n", "Ljava/net/Proxy;", "F", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "o", "Ljava/net/ProxySelector;", "H", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", "p", "G", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "L", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "r", "Ljavax/net/ssl/SSLSocketFactory;", "M", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Q", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "Lokhttp3/f;", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "connectionSpecs", "E", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "z", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "hostnameVerifier", "LMv/d;", "LMv/d;", "()LMv/d;", "setCertificatePinner$okhttp", "(LMv/d;)V", "certificatePinner", "Lbw/c;", "Lbw/c;", "()Lbw/c;", "setCertificateChainCleaner$okhttp", "(Lbw/c;)V", "certificateChainCleaner", "", "I", "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "setConnectTimeout$okhttp", "connectTimeout", "setReadTimeout$okhttp", "readTimeout", "B", "P", "setWriteTimeout$okhttp", "writeTimeout", "D", "setPingInterval$okhttp", "pingInterval", "O", "setWebSocketCloseTimeout$okhttp", "webSocketCloseTimeout", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "LRv/u;", "LRv/u;", "K", "()LRv/u;", "setRouteDatabase$okhttp", "(LRv/u;)V", "routeDatabase", "LQv/d;", "LQv/d;", "N", "()LQv/d;", "setTaskRunner$okhttp", "(LQv/d;)V", "taskRunner", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private int readTimeout;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int writeTimeout;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int pingInterval;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private int webSocketCloseTimeout;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private long minWebSocketMessageToCompress;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private u routeDatabase;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private Qv.d taskRunner;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Mv.l dispatcher;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Mv.h connectionPool;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<Interceptor> interceptors;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<Interceptor> networkInterceptors;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private g.c eventListenerFactory;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean retryOnConnectionFailure;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean fastFallback;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Mv.a authenticator;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean followRedirects;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean followSslRedirects;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private Mv.j cookieJar;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private b cache;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Mv.m dns;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Proxy proxy;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private ProxySelector proxySelector;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Mv.a proxyAuthenticator;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private SocketFactory socketFactory;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private SSLSocketFactory sslSocketFactoryOrNull;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private X509TrustManager x509TrustManagerOrNull;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private List<f> connectionSpecs;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private List<? extends r> protocols;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private HostnameVerifier hostnameVerifier;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private Mv.d certificatePinner;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private bw.c certificateChainCleaner;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private int callTimeout;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private int connectTimeout;

        public Builder() {
            this.dispatcher = new Mv.l();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Nv.k.c(g.f154666b);
            this.retryOnConnectionFailure = true;
            this.fastFallback = true;
            Mv.a aVar = Mv.a.f20439b;
            this.authenticator = aVar;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = Mv.j.f20481b;
            this.dns = Mv.m.f20492b;
            this.proxyAuthenticator = aVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.i(socketFactory, "getDefault(...)");
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.INSTANCE;
            this.connectionSpecs = companion.a();
            this.protocols = companion.b();
            this.hostnameVerifier = bw.d.f60650a;
            this.certificatePinner = Mv.d.f20446d;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.webSocketCloseTimeout = 60000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        public final List<Interceptor> A() {
            return this.interceptors;
        }

        /* renamed from: B, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<Interceptor> C() {
            return this.networkInterceptors;
        }

        /* renamed from: D, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final List<r> E() {
            return this.protocols;
        }

        /* renamed from: F, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        /* renamed from: G, reason: from getter */
        public final Mv.a getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        /* renamed from: H, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* renamed from: I, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* renamed from: J, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        /* renamed from: K, reason: from getter */
        public final u getRouteDatabase() {
            return this.routeDatabase;
        }

        /* renamed from: L, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        /* renamed from: M, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* renamed from: N, reason: from getter */
        public final Qv.d getTaskRunner() {
            return this.taskRunner;
        }

        /* renamed from: O, reason: from getter */
        public final int getWebSocketCloseTimeout() {
            return this.webSocketCloseTimeout;
        }

        /* renamed from: P, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        /* renamed from: Q, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final List<Interceptor> R() {
            return this.interceptors;
        }

        public final Builder S(List<? extends r> protocols) {
            Intrinsics.j(protocols, "protocols");
            List listM1 = CollectionsKt.m1(protocols);
            r rVar = r.f20504g;
            if (!listM1.contains(rVar) && !listM1.contains(r.f20501d)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listM1).toString());
            }
            if (listM1.contains(rVar) && listM1.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listM1).toString());
            }
            if (listM1.contains(r.f20500c)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listM1).toString());
            }
            Intrinsics.h(listM1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (listM1.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            listM1.remove(r.f20502e);
            if (!Intrinsics.e(listM1, this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends r> listUnmodifiableList = Collections.unmodifiableList(listM1);
            Intrinsics.i(listUnmodifiableList, "unmodifiableList(...)");
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final Builder T(Proxy proxy) {
            if (!Intrinsics.e(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final Builder U(Mv.a proxyAuthenticator) {
            Intrinsics.j(proxyAuthenticator, "proxyAuthenticator");
            if (!Intrinsics.e(proxyAuthenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        public final Builder V(long timeout, TimeUnit unit) {
            Intrinsics.j(unit, "unit");
            this.readTimeout = Nv.k.g("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder W(Duration duration) {
            Intrinsics.j(duration, "duration");
            V(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder X(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        public final void Y(Mv.h hVar) {
            this.connectionPool = hVar;
        }

        public final Builder Z(SocketFactory socketFactory) {
            Intrinsics.j(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!Intrinsics.e(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        public final OkHttpClient a() {
            return new OkHttpClient(this);
        }

        public final Builder a0(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            Intrinsics.j(sslSocketFactory, "sslSocketFactory");
            Intrinsics.j(trustManager, "trustManager");
            if (!Intrinsics.e(sslSocketFactory, this.sslSocketFactoryOrNull) || !Intrinsics.e(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = bw.c.INSTANCE.a(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            Intrinsics.j(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            Intrinsics.j(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final Builder b(b cache) {
            this.cache = cache;
            return this;
        }

        public final Builder b0(long timeout, TimeUnit unit) {
            Intrinsics.j(unit, "unit");
            this.writeTimeout = Nv.k.g("timeout", timeout, unit);
            return this;
        }

        public final Builder c(long timeout, TimeUnit unit) {
            Intrinsics.j(unit, "unit");
            this.callTimeout = Nv.k.g("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder c0(Duration duration) {
            Intrinsics.j(duration, "duration");
            b0(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder d(long timeout, TimeUnit unit) {
            Intrinsics.j(unit, "unit");
            this.connectTimeout = Nv.k.g("timeout", timeout, unit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder e(Duration duration) {
            Intrinsics.j(duration, "duration");
            d(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder f(Mv.h connectionPool) {
            Intrinsics.j(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        public final Builder g(Mv.j cookieJar) {
            Intrinsics.j(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        public final Builder h(Mv.l dispatcher) {
            Intrinsics.j(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        public final Builder i(g eventListener) {
            Intrinsics.j(eventListener, "eventListener");
            this.eventListenerFactory = Nv.k.c(eventListener);
            return this;
        }

        public final Builder j(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        /* renamed from: k, reason: from getter */
        public final Mv.a getAuthenticator() {
            return this.authenticator;
        }

        /* renamed from: l, reason: from getter */
        public final b getCache() {
            return this.cache;
        }

        /* renamed from: m, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        /* renamed from: n, reason: from getter */
        public final bw.c getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        /* renamed from: o, reason: from getter */
        public final Mv.d getCertificatePinner() {
            return this.certificatePinner;
        }

        /* renamed from: p, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        /* renamed from: q, reason: from getter */
        public final Mv.h getConnectionPool() {
            return this.connectionPool;
        }

        public final List<f> r() {
            return this.connectionSpecs;
        }

        /* renamed from: s, reason: from getter */
        public final Mv.j getCookieJar() {
            return this.cookieJar;
        }

        /* renamed from: t, reason: from getter */
        public final Mv.l getDispatcher() {
            return this.dispatcher;
        }

        /* renamed from: u, reason: from getter */
        public final Mv.m getDns() {
            return this.dns;
        }

        /* renamed from: v, reason: from getter */
        public final g.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getFastFallback() {
            return this.fastFallback;
        }

        /* renamed from: x, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* renamed from: y, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        /* renamed from: z, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            Intrinsics.j(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.getDispatcher();
            this.connectionPool = okHttpClient.getConnectionPool();
            CollectionsKt.C(this.interceptors, okHttpClient.y());
            CollectionsKt.C(this.networkInterceptors, okHttpClient.A());
            this.eventListenerFactory = okHttpClient.getEventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.getRetryOnConnectionFailure();
            this.fastFallback = okHttpClient.getFastFallback();
            this.authenticator = okHttpClient.getAuthenticator();
            this.followRedirects = okHttpClient.getFollowRedirects();
            this.followSslRedirects = okHttpClient.getFollowSslRedirects();
            this.cookieJar = okHttpClient.getCookieJar();
            this.cache = okHttpClient.getCache();
            this.dns = okHttpClient.getDns();
            this.proxy = okHttpClient.getProxy();
            this.proxySelector = okHttpClient.getProxySelector();
            this.proxyAuthenticator = okHttpClient.getProxyAuthenticator();
            this.socketFactory = okHttpClient.getSocketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.n();
            this.protocols = okHttpClient.D();
            this.hostnameVerifier = okHttpClient.getHostnameVerifier();
            this.certificatePinner = okHttpClient.getCertificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.getCallTimeoutMillis();
            this.connectTimeout = okHttpClient.getConnectTimeoutMillis();
            this.readTimeout = okHttpClient.getReadTimeoutMillis();
            this.writeTimeout = okHttpClient.getWriteTimeoutMillis();
            this.pingInterval = okHttpClient.getPingIntervalMillis();
            this.webSocketCloseTimeout = okHttpClient.getWebSocketCloseTimeout();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
            this.taskRunner = okHttpClient.getTaskRunner();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/OkHttpClient$a;", "", "<init>", "()V", "", "LMv/r;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lokhttp3/f;", "DEFAULT_CONNECTION_SPECS", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.OkHttpClient$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<f> a() {
            return OkHttpClient.f154329J;
        }

        public final List<r> b() {
            return OkHttpClient.f154328I;
        }
    }

    public OkHttpClient(Builder builder) {
        ProxySelector proxySelector;
        List<f> list;
        Intrinsics.j(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.interceptors = Nv.k.x(builder.A());
        this.networkInterceptors = Nv.k.x(builder.C());
        this.eventListenerFactory = builder.getEventListenerFactory();
        boolean retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.retryOnConnectionFailure = retryOnConnectionFailure;
        boolean fastFallback = builder.getFastFallback();
        this.fastFallback = fastFallback;
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = Zv.a.f44146a;
        } else {
            proxySelector = builder.getProxySelector();
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = Zv.a.f44146a;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<f> listR = builder.r();
        this.connectionSpecs = listR;
        this.protocols = builder.E();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        int connectTimeout = builder.getConnectTimeout();
        this.connectTimeoutMillis = connectTimeout;
        int readTimeout = builder.getReadTimeout();
        this.readTimeoutMillis = readTimeout;
        int writeTimeout = builder.getWriteTimeout();
        this.writeTimeoutMillis = writeTimeout;
        int pingInterval = builder.getPingInterval();
        this.pingIntervalMillis = pingInterval;
        this.webSocketCloseTimeout = builder.getWebSocketCloseTimeout();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        u routeDatabase = builder.getRouteDatabase();
        routeDatabase = routeDatabase == null ? new u() : routeDatabase;
        this.routeDatabase = routeDatabase;
        Qv.d taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner == null ? Qv.d.f31483m : taskRunner;
        Mv.h connectionPool = builder.getConnectionPool();
        if (connectionPool == null) {
            list = listR;
            Mv.h hVar = new Mv.h(0, 0L, null, null, null, readTimeout, writeTimeout, connectTimeout, readTimeout, pingInterval, retryOnConnectionFailure, fastFallback, routeDatabase, 31, null);
            builder.Y(hVar);
            connectionPool = hVar;
        } else {
            list = listR;
        }
        this.connectionPool = connectionPool;
        List<f> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = Mv.d.f20446d;
        } else {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((f) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        bw.c certificateChainCleaner = builder.getCertificateChainCleaner();
                        Intrinsics.g(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
                        Intrinsics.g(x509TrustManagerOrNull);
                        this.x509TrustManager = x509TrustManagerOrNull;
                        Mv.d certificatePinner = builder.getCertificatePinner();
                        Intrinsics.g(certificateChainCleaner);
                        this.certificatePinner = certificatePinner.g(certificateChainCleaner);
                    } else {
                        c.Companion aVar = okhttp3.internal.platform.c.INSTANCE;
                        X509TrustManager x509TrustManagerP = aVar.e().p();
                        this.x509TrustManager = x509TrustManagerP;
                        okhttp3.internal.platform.c cVarE = aVar.e();
                        Intrinsics.g(x509TrustManagerP);
                        this.sslSocketFactoryOrNull = cVarE.o(x509TrustManagerP);
                        c.Companion aVar2 = bw.c.INSTANCE;
                        Intrinsics.g(x509TrustManagerP);
                        bw.c cVarA = aVar2.a(x509TrustManagerP);
                        this.certificateChainCleaner = cVarA;
                        Mv.d certificatePinner2 = builder.getCertificatePinner();
                        Intrinsics.g(cVarA);
                        this.certificatePinner = certificatePinner2.g(cVarA);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = Mv.d.f20446d;
        }
        L();
    }

    private final void L() {
        List<Interceptor> list = this.interceptors;
        Intrinsics.h(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<Interceptor> list2 = this.networkInterceptors;
        Intrinsics.h(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<f> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((f) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.e(this.certificatePinner, Mv.d.f20446d)) {
            throw new IllegalStateException("Check failed.");
        }
        Unit unit = Unit.f143329a;
    }

    @JvmName
    public final List<Interceptor> A() {
        return this.networkInterceptors;
    }

    public Builder B() {
        return new Builder(this);
    }

    @JvmName
    /* renamed from: C, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @JvmName
    public final List<r> D() {
        return this.protocols;
    }

    @JvmName
    /* renamed from: E, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @JvmName
    /* renamed from: F, reason: from getter */
    public final Mv.a getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @JvmName
    /* renamed from: G, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @JvmName
    /* renamed from: H, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @JvmName
    /* renamed from: I, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @JvmName
    /* renamed from: J, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @JvmName
    public final SSLSocketFactory K() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @JvmName
    /* renamed from: M, reason: from getter */
    public final int getWebSocketCloseTimeout() {
        return this.webSocketCloseTimeout;
    }

    @JvmName
    /* renamed from: N, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @JvmName
    /* renamed from: O, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @Override // okhttp3.m.a
    public m a(Request request, Mv.u listener) {
        Intrinsics.j(request, "request");
        Intrinsics.j(listener, "listener");
        dw.h hVar = new dw.h(this.taskRunner, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress, this.webSocketCloseTimeout);
        hVar.t(this);
        return hVar;
    }

    @Override // okhttp3.d.a
    public d b(Request request) {
        Intrinsics.j(request, "request");
        return new o(this, request, false);
    }

    public final a f(HttpUrl url) {
        SSLSocketFactory sSLSocketFactoryK;
        HostnameVerifier hostnameVerifier;
        Mv.d dVar;
        Intrinsics.j(url, "url");
        if (url.j()) {
            sSLSocketFactoryK = K();
            hostnameVerifier = this.hostnameVerifier;
            dVar = this.certificatePinner;
        } else {
            sSLSocketFactoryK = null;
            hostnameVerifier = null;
            dVar = null;
        }
        return new a(url.getHost(), url.getPort(), this.dns, this.socketFactory, sSLSocketFactoryK, hostnameVerifier, dVar, this.proxyAuthenticator, this.proxy, this.protocols, this.connectionSpecs, this.proxySelector);
    }

    @JvmName
    /* renamed from: g, reason: from getter */
    public final Mv.a getAuthenticator() {
        return this.authenticator;
    }

    @JvmName
    /* renamed from: h, reason: from getter */
    public final b getCache() {
        return this.cache;
    }

    @JvmName
    /* renamed from: i, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @JvmName
    /* renamed from: j, reason: from getter */
    public final bw.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @JvmName
    /* renamed from: k, reason: from getter */
    public final Mv.d getCertificatePinner() {
        return this.certificatePinner;
    }

    @JvmName
    /* renamed from: l, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @JvmName
    /* renamed from: m, reason: from getter */
    public final Mv.h getConnectionPool() {
        return this.connectionPool;
    }

    @JvmName
    public final List<f> n() {
        return this.connectionSpecs;
    }

    @JvmName
    /* renamed from: o, reason: from getter */
    public final Mv.j getCookieJar() {
        return this.cookieJar;
    }

    @JvmName
    /* renamed from: p, reason: from getter */
    public final Mv.l getDispatcher() {
        return this.dispatcher;
    }

    @JvmName
    /* renamed from: q, reason: from getter */
    public final Mv.m getDns() {
        return this.dns;
    }

    @JvmName
    /* renamed from: r, reason: from getter */
    public final g.c getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @JvmName
    /* renamed from: s, reason: from getter */
    public final boolean getFastFallback() {
        return this.fastFallback;
    }

    @JvmName
    /* renamed from: t, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @JvmName
    /* renamed from: u, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    /* renamed from: v, reason: from getter */
    public final u getRouteDatabase() {
        return this.routeDatabase;
    }

    /* renamed from: w, reason: from getter */
    public final Qv.d getTaskRunner() {
        return this.taskRunner;
    }

    @JvmName
    /* renamed from: x, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @JvmName
    public final List<Interceptor> y() {
        return this.interceptors;
    }

    @JvmName
    /* renamed from: z, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public OkHttpClient() {
        Builder builder = new Builder();
        FS.okhttp_addInterceptors(builder);
        this(builder);
    }
}
