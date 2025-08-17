package Vv;

import Vv.v;
import Vv.w;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.internal.HttpHeaders;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010,H\u0000¢\u0006\u0004\b.\u0010/J)\u00100\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010,H\u0000¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010=R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010=R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010?R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010?R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b9\u0010BR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010CR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR \u0010S\u001a\b\u0012\u0004\u0012\u00020%0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b<\u0010R¨\u0006T"}, d2 = {"LVv/r;", "LVv/v;", "LUv/d;", "taskRunner", "LVv/q;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "fastFallback", "Lokhttp3/a;", PlaceTypes.ADDRESS, "LVv/u;", "routeDatabase", "LVv/h;", "connectionUser", "<init>", "(LUv/d;LVv/q;IIIIIZZLokhttp3/a;LVv/u;LVv/h;)V", "LVv/t;", "k", "()LVv/t;", "LQv/s;", PlaceTypes.ROUTE, "Lokhttp3/Request;", "g", "(LQv/s;)Lokhttp3/Request;", "LVv/p;", "connection", "n", "(LVv/p;)LQv/s;", "isCanceled", "()Z", "LVv/v$b;", "d", "()LVv/v$b;", "LVv/f;", "h", "()LVv/f;", "planToReplace", "", "routes", "l", "(LVv/f;Ljava/util/List;)LVv/t;", "i", "(LQv/s;Ljava/util/List;)LVv/f;", "failedConnection", "b", "(LVv/p;)Z", "Lokhttp3/HttpUrl;", "url", "f", "(Lokhttp3/HttpUrl;)Z", "a", "LUv/d;", "LVv/q;", "c", "I", "e", "Z", "j", "Lokhttp3/a;", "()Lokhttp3/a;", "LVv/u;", "LVv/h;", "LVv/w$b;", "m", "LVv/w$b;", "routeSelection", "LVv/w;", "LVv/w;", "routeSelector", "o", "LQv/s;", "nextRouteToTry", "Lkotlin/collections/ArrayDeque;", "p", "Lkotlin/collections/ArrayDeque;", "()Lkotlin/collections/ArrayDeque;", "deferredPlans", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class r implements v {

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
    private final boolean fastFallback;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.a address;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final u routeDatabase;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h connectionUser;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private w.b routeSelection;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private w routeSelector;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Qv.s nextRouteToTry;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<v.b> deferredPlans;

    private final Qv.s n(p connection) {
        Qv.s sVarW;
        synchronized (connection) {
            sVarW = null;
            if (connection.getRouteFailureCount() == 0 && connection.getNoNewExchanges() && Rv.k.f(connection.w().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl(), getAddress().getUrl())) {
                sVarW = connection.w();
            }
        }
        return sVarW;
    }

    public r(Uv.d taskRunner, q connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, okhttp3.a address, u routeDatabase, h connectionUser) {
        Intrinsics.j(taskRunner, "taskRunner");
        Intrinsics.j(connectionPool, "connectionPool");
        Intrinsics.j(address, "address");
        Intrinsics.j(routeDatabase, "routeDatabase");
        Intrinsics.j(connectionUser, "connectionUser");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.readTimeoutMillis = i10;
        this.writeTimeoutMillis = i11;
        this.socketConnectTimeoutMillis = i12;
        this.socketReadTimeoutMillis = i13;
        this.pingIntervalMillis = i14;
        this.retryOnConnectionFailure = z10;
        this.fastFallback = z11;
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.connectionUser = connectionUser;
        this.deferredPlans = new ArrayDeque<>();
    }

    private final Request g(Qv.s route) throws IOException {
        Request requestB = new Request.a().v(route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl()).o("CONNECT", null).m("Host", Rv.k.v(route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl(), true)).m("Proxy-Connection", "Keep-Alive").m(HttpHeaders.USER_AGENT, "okhttp/5.1.0").b();
        Request requestA = route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getProxyAuthenticator().a(route, new Response.a().q(requestB).o(Qv.r.f31479d).f(HttpResponseStatus.ERROR_PROXY_AUTHENTICATION_REQUIRED).l("Preemptive Authenticate").r(-1L).p(-1L).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return requestA == null ? requestB : requestA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f j(r rVar, Qv.s sVar, List list, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return rVar.i(sVar, list);
    }

    private final t k() throws IOException {
        Socket socketT;
        boolean z10;
        p pVarV = this.connectionUser.v();
        if (pVarV == null) {
            return null;
        }
        boolean zR = pVarV.r(this.connectionUser.l());
        synchronized (pVarV) {
            try {
                if (!zR) {
                    z10 = !pVarV.getNoNewExchanges();
                    pVarV.z(true);
                    socketT = this.connectionUser.t();
                } else if (pVarV.getNoNewExchanges() || !f(pVarV.w().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl())) {
                    socketT = this.connectionUser.t();
                    z10 = false;
                } else {
                    z10 = false;
                    socketT = null;
                }
            } finally {
            }
        }
        if (this.connectionUser.v() != null) {
            if (socketT == null) {
                return new t(pVarV);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (socketT != null) {
            Rv.k.h(socketT);
        }
        this.connectionUser.n(pVarV);
        this.connectionUser.r(pVarV);
        if (socketT != null) {
            this.connectionUser.w(pVarV);
        } else if (z10) {
            this.connectionUser.q(pVarV);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t m(r rVar, f fVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        return rVar.l(fVar, list);
    }

    @Override // Vv.v
    /* renamed from: a, reason: from getter */
    public okhttp3.a getAddress() {
        return this.address;
    }

    @Override // Vv.v
    public ArrayDeque<v.b> c() {
        return this.deferredPlans;
    }

    @Override // Vv.v
    public boolean f(HttpUrl url) {
        Intrinsics.j(url, "url");
        HttpUrl url2 = getAddress().getUrl();
        return url.getPort() == url2.getPort() && Intrinsics.e(url.getHost(), url2.getHost());
    }

    public final f h() throws IOException {
        Qv.s sVar = this.nextRouteToTry;
        if (sVar != null) {
            this.nextRouteToTry = null;
            return j(this, sVar, null, 2, null);
        }
        w.b bVar = this.routeSelection;
        if (bVar != null && bVar.b()) {
            return j(this, bVar.c(), null, 2, null);
        }
        w wVar = this.routeSelector;
        if (wVar == null) {
            wVar = new w(getAddress(), this.routeDatabase, this.connectionUser, this.fastFallback);
            this.routeSelector = wVar;
        }
        if (!wVar.a()) {
            throw new IOException("exhausted all routes");
        }
        w.b bVarC = wVar.c();
        this.routeSelection = bVarC;
        if (isCanceled()) {
            throw new IOException("Canceled");
        }
        return i(bVarC.c(), bVarC.a());
    }

    public final f i(Qv.s route, List<Qv.s> routes) throws IOException {
        Intrinsics.j(route, "route");
        if (route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getSslSocketFactory() == null) {
            if (!route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().b().contains(okhttp3.f.f154348k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String host = route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl().getHost();
            if (!okhttp3.internal.platform.c.INSTANCE.e().j(host)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + host + " not permitted by network security policy");
            }
        } else if (route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().f().contains(Qv.r.f31482g)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new f(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.connectionUser, this, route, routes, 0, route.c() ? g(route) : null, -1, false);
    }

    @Override // Vv.v
    public boolean isCanceled() {
        return this.connectionUser.isCanceled();
    }

    public final t l(f planToReplace, List<Qv.s> routes) throws IOException {
        p pVarB = this.connectionPool.b(this.connectionUser.l(), getAddress(), this.connectionUser, routes, planToReplace != null && planToReplace.getIsReady());
        if (pVarB == null) {
            return null;
        }
        if (planToReplace != null) {
            this.nextRouteToTry = planToReplace.getRoute();
            planToReplace.k();
        }
        this.connectionUser.a(pVarB);
        this.connectionUser.h(pVarB);
        return new t(pVarB);
    }

    @Override // Vv.v
    public boolean b(p failedConnection) {
        w wVar;
        Qv.s sVarN;
        if (!c().isEmpty() || this.nextRouteToTry != null) {
            return true;
        }
        if (failedConnection != null && (sVarN = n(failedConnection)) != null) {
            this.nextRouteToTry = sVarN;
            return true;
        }
        w.b bVar = this.routeSelection;
        if ((bVar != null && bVar.b()) || (wVar = this.routeSelector) == null) {
            return true;
        }
        return wVar.a();
    }

    @Override // Vv.v
    public v.b d() throws IOException {
        t tVarK = k();
        if (tVarK != null) {
            return tVarK;
        }
        t tVarM = m(this, null, null, 3, null);
        if (tVarM != null) {
            return tVarM;
        }
        if (!c().isEmpty()) {
            return c().removeFirst();
        }
        f fVarH = h();
        t tVarL = l(fVarH, fVarH.t());
        if (tVarL != null) {
            return tVarL;
        }
        return fVarH;
    }
}
