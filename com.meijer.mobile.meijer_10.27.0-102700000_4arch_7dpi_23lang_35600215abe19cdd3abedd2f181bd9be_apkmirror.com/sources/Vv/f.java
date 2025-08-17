package Vv;

import Vv.v;
import Wv.d;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kw.InterfaceC15329f;
import kw.InterfaceC15330g;
import kw.K;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.i;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0001:B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020+H\u0000¢\u0006\u0004\b/\u0010-J%\u00101\u001a\u00020\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020%0\u00152\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b1\u00102J'\u00103\u001a\u0004\u0018\u00010\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020%0\u00152\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b3\u00102J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J!\u0010:\u001a\u00020 2\u0006\u00108\u001a\u0002072\b\u0010.\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020 H\u0016¢\u0006\u0004\b<\u0010\"J\u000f\u0010=\u001a\u00020 H\u0016¢\u0006\u0004\b=\u0010\"J\u000f\u0010>\u001a\u00020\u0001H\u0016¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020 ¢\u0006\u0004\b@\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010DR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010DR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010DR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010K\u001a\u0004\bE\u0010LR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010DR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u001a\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010D\u001a\u0004\bS\u0010TR\u001a\u0010\u001b\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010F\u001a\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010FR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010`\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010Z\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010eR\u0016\u0010i\u001a\u00020g8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010hR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010p\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010V¨\u0006s"}, d2 = {"LVv/f;", "LVv/v$b;", "LWv/d$a;", "LUv/d;", "taskRunner", "LVv/q;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "LVv/h;", "user", "LVv/r;", "routePlanner", "LQv/s;", PlaceTypes.ROUTE, "", "routes", "attempt", "Lokhttp3/Request;", "tunnelRequest", "connectionSpecIndex", "isTlsFallback", "<init>", "(LUv/d;LVv/q;IIIIIZLVv/h;LVv/r;LQv/s;Ljava/util/List;ILokhttp3/Request;IZ)V", "q", "(ILokhttp3/Request;IZ)LVv/f;", "", "l", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "Lokhttp3/f;", "connectionSpec", "m", "(Ljavax/net/ssl/SSLSocket;Lokhttp3/f;)V", "s", "()Lokhttp3/Request;", "LVv/v$a;", "h", "()LVv/v$a;", "e", "p", "connectionSpecs", "v", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)LVv/f;", "u", "LVv/p;", "c", "()LVv/p;", "LVv/o;", "call", "Ljava/io/IOException;", "a", "(LVv/o;Ljava/io/IOException;)V", "d", "cancel", "g", "()LVv/v$b;", "k", "LUv/d;", "b", "LVv/q;", "I", "f", "Z", "i", "LVv/h;", "j", "LVv/r;", "LQv/s;", "()LQv/s;", "Ljava/util/List;", "t", "()Ljava/util/List;", "n", "Lokhttp3/Request;", "o", "getConnectionSpecIndex$okhttp", "()I", "isTlsFallback$okhttp", "()Z", "canceled", "Ljava/net/Socket;", "r", "Ljava/net/Socket;", "rawSocket", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "socket", "Lokhttp3/i;", "Lokhttp3/i;", "handshake", "LQv/r;", "LQv/r;", "protocol", "Lkw/g;", "Lkw/g;", "source", "Lkw/f;", "w", "Lkw/f;", "sink", "x", "LVv/p;", "connection", "isReady", "y", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class f implements v.b, d.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uv.d taskRunner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q connectionPool;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int readTimeoutMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int writeTimeoutMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int socketConnectTimeoutMillis;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int socketReadTimeoutMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int pingIntervalMillis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean retryOnConnectionFailure;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final h user;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final r routePlanner;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Qv.s route;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<Qv.s> routes;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int attempt;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Request tunnelRequest;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int connectionSpecIndex;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean isTlsFallback;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Socket rawSocket;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Socket socket;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private okhttp3.i handshake;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Qv.r protocol;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15330g source;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15329f sink;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private p connection;

    public f(Uv.d taskRunner, q connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, h user, r routePlanner, Qv.s route, List<Qv.s> list, int i15, Request request, int i16, boolean z11) {
        Intrinsics.j(taskRunner, "taskRunner");
        Intrinsics.j(connectionPool, "connectionPool");
        Intrinsics.j(user, "user");
        Intrinsics.j(routePlanner, "routePlanner");
        Intrinsics.j(route, "route");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.readTimeoutMillis = i10;
        this.writeTimeoutMillis = i11;
        this.socketConnectTimeoutMillis = i12;
        this.socketReadTimeoutMillis = i13;
        this.pingIntervalMillis = i14;
        this.retryOnConnectionFailure = z10;
        this.user = user;
        this.routePlanner = routePlanner;
        this.route = route;
        this.routes = list;
        this.attempt = i15;
        this.tunnelRequest = request;
        this.connectionSpecIndex = i16;
        this.isTlsFallback = z11;
    }

    @Override // Wv.d.a
    public void a(o call, IOException e10) {
        Intrinsics.j(call, "call");
    }

    @Override // Vv.v.b, Wv.d.a
    public void cancel() throws IOException {
        this.canceled = true;
        Socket socket = this.rawSocket;
        if (socket != null) {
            Rv.k.h(socket);
        }
    }

    @Override // Wv.d.a
    public void d() {
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final f q(int attempt, Request tunnelRequest, int connectionSpecIndex, boolean isTlsFallback) {
        return new f(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.user, this.routePlanner, getRoute(), this.routes, attempt, tunnelRequest, connectionSpecIndex, isTlsFallback);
    }

    static /* synthetic */ f r(f fVar, int i10, Request request, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = fVar.attempt;
        }
        if ((i12 & 2) != 0) {
            request = fVar.tunnelRequest;
        }
        if ((i12 & 4) != 0) {
            i11 = fVar.connectionSpecIndex;
        }
        if ((i12 & 8) != 0) {
            z10 = fVar.isTlsFallback;
        }
        return fVar.q(i10, request, i11, z10);
    }

    private final Request s() throws IOException {
        Request request = this.tunnelRequest;
        Intrinsics.g(request);
        String str = "CONNECT " + Rv.k.v(getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl(), true) + " HTTP/1.1";
        while (true) {
            InterfaceC15330g interfaceC15330g = this.source;
            if (interfaceC15330g == null) {
                Intrinsics.y("source");
                interfaceC15330g = null;
            }
            InterfaceC15329f interfaceC15329f = this.sink;
            if (interfaceC15329f == null) {
                Intrinsics.y("sink");
                interfaceC15329f = null;
            }
            Xv.b bVar = new Xv.b(null, this, interfaceC15330g, interfaceC15329f);
            InterfaceC15330g interfaceC15330g2 = this.source;
            if (interfaceC15330g2 == null) {
                Intrinsics.y("source");
                interfaceC15330g2 = null;
            }
            K timeout = interfaceC15330g2.getTimeout();
            long j10 = this.readTimeoutMillis;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.g(j10, timeUnit);
            InterfaceC15329f interfaceC15329f2 = this.sink;
            if (interfaceC15329f2 == null) {
                Intrinsics.y("sink");
                interfaceC15329f2 = null;
            }
            interfaceC15329f2.getTimeout().g(this.writeTimeoutMillis, timeUnit);
            bVar.B(request.getHeaders(), str);
            bVar.a();
            Response.a aVarG = bVar.g(false);
            Intrinsics.g(aVarG);
            Response responseC = aVarG.q(request).c();
            bVar.A(responseC);
            int code = responseC.getCode();
            if (code == 200) {
                return null;
            }
            if (code != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + responseC.getCode());
            }
            Request requestA = getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getProxyAuthenticator().a(getRoute(), responseC);
            if (requestA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt.H("close", Response.j(responseC, "Connection", null, 2, null), true)) {
                return requestA;
            }
            request = requestA;
        }
    }

    @Override // Vv.v.b
    /* renamed from: b */
    public boolean getIsReady() {
        return this.protocol != null;
    }

    @Override // Vv.v.b
    /* renamed from: c */
    public p getConnection() throws IOException {
        this.user.k(getRoute());
        p pVar = this.connection;
        Intrinsics.g(pVar);
        this.user.j(pVar, getRoute());
        t tVarL = this.routePlanner.l(this, this.routes);
        if (tVarL != null) {
            return tVarL.i();
        }
        synchronized (pVar) {
            this.connectionPool.j(pVar);
            this.user.c(pVar);
            Unit unit = Unit.f142422a;
        }
        this.user.a(pVar);
        this.user.h(pVar);
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    @Override // Vv.v.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Vv.v.ConnectResult e() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Vv.f.e():Vv.v$a");
    }

    @Override // Wv.d.a
    /* renamed from: f, reason: from getter */
    public Qv.s getRoute() {
        return this.route;
    }

    @Override // Vv.v.b
    public v.b g() {
        return new f(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.user, this.routePlanner, getRoute(), this.routes, this.attempt, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    @Override // Vv.v.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Vv.v.ConnectResult h() throws java.lang.Throwable {
        /*
            r14 = this;
            java.net.Socket r0 = r14.rawSocket
            if (r0 != 0) goto Laf
            Vv.h r0 = r14.user
            r0.f(r14)
            r1 = 0
            Vv.h r0 = r14.user     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            Qv.s r2 = r14.getRoute()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r0.d(r2)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r14.l()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r1 = 1
            Vv.v$a r2 = new Vv.v$a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L30
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            Vv.h r0 = r3.user
            r0.m(r14)
            return r2
        L27:
            r0 = move-exception
            goto La0
        L2a:
            r0 = move-exception
        L2b:
            r11 = r0
            goto L33
        L2d:
            r0 = move-exception
            r3 = r14
            goto La0
        L30:
            r0 = move-exception
            r3 = r14
            goto L2b
        L33:
            Qv.s r0 = r14.getRoute()     // Catch: java.lang.Throwable -> L27
            okhttp3.a r0 = r0.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r0 = r0.getProxy()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L7c
            Qv.s r0 = r14.getRoute()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r0 = r0.getProxy()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r0 = r0.type()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy$Type r2 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.Throwable -> L27
            if (r0 == r2) goto L7c
            Qv.s r0 = r14.getRoute()     // Catch: java.lang.Throwable -> L27
            okhttp3.a r0 = r0.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String()     // Catch: java.lang.Throwable -> L27
            java.net.ProxySelector r0 = r0.getProxySelector()     // Catch: java.lang.Throwable -> L27
            Qv.s r2 = r14.getRoute()     // Catch: java.lang.Throwable -> L27
            okhttp3.a r2 = r2.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String()     // Catch: java.lang.Throwable -> L27
            okhttp3.HttpUrl r2 = r2.getUrl()     // Catch: java.lang.Throwable -> L27
            java.net.URI r2 = r2.y()     // Catch: java.lang.Throwable -> L27
            Qv.s r4 = r14.getRoute()     // Catch: java.lang.Throwable -> L27
            java.net.Proxy r4 = r4.getProxy()     // Catch: java.lang.Throwable -> L27
            java.net.SocketAddress r4 = r4.address()     // Catch: java.lang.Throwable -> L27
            r0.connectFailed(r2, r4, r11)     // Catch: java.lang.Throwable -> L27
        L7c:
            Vv.h r0 = r3.user     // Catch: java.lang.Throwable -> L27
            Qv.s r2 = r14.getRoute()     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r0.i(r2, r4, r11)     // Catch: java.lang.Throwable -> L27
            Vv.v$a r8 = new Vv.v$a     // Catch: java.lang.Throwable -> L27
            r12 = 2
            r13 = 0
            r10 = 0
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L9e
            Vv.h r0 = r3.user
            r0.m(r14)
            if (r1 != 0) goto L9d
            java.net.Socket r0 = r3.rawSocket
            if (r0 == 0) goto L9d
            Rv.k.h(r0)
        L9d:
            return r8
        L9e:
            r0 = move-exception
            r3 = r9
        La0:
            Vv.h r2 = r3.user
            r2.m(r14)
            if (r1 != 0) goto Lae
            java.net.Socket r1 = r3.rawSocket
            if (r1 == 0) goto Lae
            Rv.k.h(r1)
        Lae:
            throw r0
        Laf:
            r3 = r14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "TCP already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Vv.f.h():Vv.v$a");
    }

    public final void k() {
        Socket socket = this.socket;
        if (socket != null) {
            Rv.k.h(socket);
        }
    }

    public final List<Qv.s> t() {
        return this.routes;
    }

    public final f u(List<okhttp3.f> connectionSpecs, SSLSocket sslSocket) {
        Intrinsics.j(connectionSpecs, "connectionSpecs");
        Intrinsics.j(sslSocket, "sslSocket");
        int i10 = this.connectionSpecIndex + 1;
        int size = connectionSpecs.size();
        for (int i11 = i10; i11 < size; i11++) {
            if (connectionSpecs.get(i11).e(sslSocket)) {
                return r(this, 0, null, i11, this.connectionSpecIndex != -1, 3, null);
            }
        }
        return null;
    }

    public final f v(List<okhttp3.f> connectionSpecs, SSLSocket sslSocket) throws IOException {
        Intrinsics.j(connectionSpecs, "connectionSpecs");
        Intrinsics.j(sslSocket, "sslSocket");
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        f fVarU = u(connectionSpecs, sslSocket);
        if (fVarU != null) {
            return fVarU;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.isTlsFallback);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.g(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.i(string, "toString(...)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    private final void l() throws IOException {
        int i10;
        Socket socketCreateSocket;
        Proxy.Type type = getRoute().getProxy().type();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = b.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i10 != 1 && i10 != 2) {
            socketCreateSocket = new Socket(getRoute().getProxy());
        } else {
            socketCreateSocket = getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getSocketFactory().createSocket();
            Intrinsics.g(socketCreateSocket);
        }
        this.rawSocket = socketCreateSocket;
        if (!this.canceled) {
            socketCreateSocket.setSoTimeout(this.socketReadTimeoutMillis);
            try {
                okhttp3.internal.platform.c.INSTANCE.e().f(socketCreateSocket, getRoute().getSocketAddress(), this.socketConnectTimeoutMillis);
                try {
                    this.source = kw.w.d(kw.w.l(socketCreateSocket));
                    this.sink = kw.w.c(kw.w.h(socketCreateSocket));
                    return;
                } catch (NullPointerException e10) {
                    if (!Intrinsics.e(e10.getMessage(), "throw with null exception")) {
                        return;
                    } else {
                        throw new IOException(e10);
                    }
                }
            } catch (ConnectException e11) {
                ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().getSocketAddress());
                connectException.initCause(e11);
                throw connectException;
            }
        }
        throw new IOException("canceled");
    }

    private final void m(SSLSocket sslSocket, okhttp3.f connectionSpec) throws IOException {
        Qv.r rVarA;
        final okhttp3.a aVar = getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String();
        try {
            if (connectionSpec.getSupportsTlsExtensions()) {
                okhttp3.internal.platform.c.INSTANCE.e().e(sslSocket, aVar.getUrl().getHost(), aVar.f());
            }
            sslSocket.startHandshake();
            SSLSession session = sslSocket.getSession();
            i.Companion companion = okhttp3.i.INSTANCE;
            Intrinsics.g(session);
            final okhttp3.i iVarC = companion.c(session);
            HostnameVerifier hostnameVerifier = aVar.getHostnameVerifier();
            Intrinsics.g(hostnameVerifier);
            boolean zVerify = hostnameVerifier.verify(aVar.getUrl().getHost(), session);
            String strH = null;
            if (!zVerify) {
                List<Certificate> listE = iVarC.e();
                if (!listE.isEmpty()) {
                    Certificate certificate = listE.get(0);
                    Intrinsics.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    throw new SSLPeerUnverifiedException(StringsKt.p("\n            |Hostname " + aVar.getUrl().getHost() + " not verified:\n            |    certificate: " + Qv.d.INSTANCE.a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + fw.d.f132420a.a(x509Certificate) + "\n            ", null, 1, null));
                }
                throw new SSLPeerUnverifiedException("Hostname " + aVar.getUrl().getHost() + " not verified (no certificates)");
            }
            final Qv.d certificatePinner = aVar.getCertificatePinner();
            Intrinsics.g(certificatePinner);
            final okhttp3.i iVar = new okhttp3.i(iVarC.getTlsVersion(), iVarC.getCipherSuite(), iVarC.d(), new Function0() { // from class: Vv.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.n(certificatePinner, iVarC, aVar);
                }
            });
            this.handshake = iVar;
            certificatePinner.d(aVar.getUrl().getHost(), new Function0() { // from class: Vv.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.o(iVar);
                }
            });
            if (connectionSpec.getSupportsTlsExtensions()) {
                strH = okhttp3.internal.platform.c.INSTANCE.e().h(sslSocket);
            }
            this.socket = sslSocket;
            this.source = kw.w.d(kw.w.l(sslSocket));
            this.sink = kw.w.c(kw.w.h(sslSocket));
            if (strH != null) {
                rVarA = Qv.r.INSTANCE.a(strH);
            } else {
                rVarA = Qv.r.f31479d;
            }
            this.protocol = rVarA;
            okhttp3.internal.platform.c.INSTANCE.e().b(sslSocket);
        } catch (Throwable th2) {
            okhttp3.internal.platform.c.INSTANCE.e().b(sslSocket);
            Rv.k.h(sslSocket);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(Qv.d dVar, okhttp3.i iVar, okhttp3.a aVar) {
        fw.c certificateChainCleaner = dVar.getCertificateChainCleaner();
        Intrinsics.g(certificateChainCleaner);
        return certificateChainCleaner.a(iVar.e(), aVar.getUrl().getHost());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(okhttp3.i iVar) {
        List<Certificate> listE = iVar.e();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listE, 10));
        for (Certificate certificate : listE) {
            Intrinsics.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public final v.ConnectResult p() throws IOException {
        Request requestS = s();
        if (requestS == null) {
            return new v.ConnectResult(this, null, null, 6, null);
        }
        Socket socket = this.rawSocket;
        if (socket != null) {
            Rv.k.h(socket);
        }
        int i10 = this.attempt + 1;
        if (i10 < 21) {
            this.user.u(getRoute(), null);
            return new v.ConnectResult(this, r(this, i10, requestS, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.user.i(getRoute(), null, protocolException);
        return new v.ConnectResult(this, null, protocolException, 2, null);
    }
}
