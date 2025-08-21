package Rv;

import Rv.v;
import Rv.w;
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

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010,H\u0000¢\u0006\u0004\b.\u0010/J)\u00100\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001a2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010,H\u0000¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010=R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010=R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010=R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010?R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010?R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b;\u0010BR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010CR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR \u0010S\u001a\b\u0012\u0004\u0012\u00020%0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b>\u0010R¨\u0006T"}, d2 = {"LRv/r;", "LRv/v;", "LQv/d;", "taskRunner", "LRv/q;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "fastFallback", "Lokhttp3/a;", PlaceTypes.ADDRESS, "LRv/u;", "routeDatabase", "LRv/h;", "connectionUser", "<init>", "(LQv/d;LRv/q;IIIIIZZLokhttp3/a;LRv/u;LRv/h;)V", "LRv/t;", "k", "()LRv/t;", "LMv/s;", PlaceTypes.ROUTE, "Lokhttp3/Request;", "g", "(LMv/s;)Lokhttp3/Request;", "LRv/p;", "connection", "n", "(LRv/p;)LMv/s;", "isCanceled", "()Z", "LRv/v$b;", "e", "()LRv/v$b;", "LRv/f;", "h", "()LRv/f;", "planToReplace", "", "routes", "l", "(LRv/f;Ljava/util/List;)LRv/t;", "i", "(LMv/s;Ljava/util/List;)LRv/f;", "failedConnection", "c", "(LRv/p;)Z", "Lokhttp3/HttpUrl;", "url", "f", "(Lokhttp3/HttpUrl;)Z", "a", "LQv/d;", "b", "LRv/q;", "I", "d", "Z", "j", "Lokhttp3/a;", "()Lokhttp3/a;", "LRv/u;", "LRv/h;", "LRv/w$b;", "m", "LRv/w$b;", "routeSelection", "LRv/w;", "LRv/w;", "routeSelector", "o", "LMv/s;", "nextRouteToTry", "Lkotlin/collections/ArrayDeque;", "p", "Lkotlin/collections/ArrayDeque;", "()Lkotlin/collections/ArrayDeque;", "deferredPlans", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Qv.d taskRunner;

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
    private Mv.s nextRouteToTry;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<v.b> deferredPlans;

    private final Mv.s n(p connection) {
        Mv.s sVarW;
        synchronized (connection) {
            sVarW = null;
            if (connection.getRouteFailureCount() == 0 && connection.getNoNewExchanges() && Nv.k.f(connection.w().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl(), getAddress().getUrl())) {
                sVarW = connection.w();
            }
        }
        return sVarW;
    }

    public r(Qv.d taskRunner, q connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, okhttp3.a address, u routeDatabase, h connectionUser) {
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

    private final Request g(Mv.s route) throws IOException {
        Request requestB = new Request.a().v(route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl()).o("CONNECT", null).m("Host", Nv.k.v(route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl(), true)).m("Proxy-Connection", "Keep-Alive").m(HttpHeaders.USER_AGENT, "okhttp/5.1.0").b();
        Request requestA = route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getProxyAuthenticator().a(route, new Response.a().q(requestB).o(Mv.r.f20501d).f(HttpResponseStatus.ERROR_PROXY_AUTHENTICATION_REQUIRED).l("Preemptive Authenticate").r(-1L).p(-1L).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return requestA == null ? requestB : requestA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f j(r rVar, Mv.s sVar, List list, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return rVar.i(sVar, list);
    }

    private final t k() throws IOException {
        Socket socketR;
        boolean z10;
        p pVarT = this.connectionUser.t();
        if (pVarT == null) {
            return null;
        }
        boolean zR = pVarT.r(this.connectionUser.i());
        synchronized (pVarT) {
            try {
                if (!zR) {
                    z10 = !pVarT.getNoNewExchanges();
                    pVarT.z(true);
                    socketR = this.connectionUser.r();
                } else if (pVarT.getNoNewExchanges() || !f(pVarT.w().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl())) {
                    socketR = this.connectionUser.r();
                    z10 = false;
                } else {
                    z10 = false;
                    socketR = null;
                }
            } finally {
            }
        }
        if (this.connectionUser.t() != null) {
            if (socketR == null) {
                return new t(pVarT);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (socketR != null) {
            Nv.k.h(socketR);
        }
        this.connectionUser.v(pVarT);
        this.connectionUser.g(pVarT);
        if (socketR != null) {
            this.connectionUser.w(pVarT);
        } else if (z10) {
            this.connectionUser.j(pVarT);
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

    @Override // Rv.v
    /* renamed from: b, reason: from getter */
    public okhttp3.a getAddress() {
        return this.address;
    }

    @Override // Rv.v
    public ArrayDeque<v.b> d() {
        return this.deferredPlans;
    }

    @Override // Rv.v
    public boolean f(HttpUrl url) {
        Intrinsics.j(url, "url");
        HttpUrl url2 = getAddress().getUrl();
        return url.getPort() == url2.getPort() && Intrinsics.e(url.getHost(), url2.getHost());
    }

    public final f h() throws IOException {
        Mv.s sVar = this.nextRouteToTry;
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

    public final f i(Mv.s route, List<Mv.s> routes) throws IOException {
        Intrinsics.j(route, "route");
        if (route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getSslSocketFactory() == null) {
            if (!route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().b().contains(okhttp3.f.f154656k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String host = route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl().getHost();
            if (!okhttp3.internal.platform.c.INSTANCE.e().j(host)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + host + " not permitted by network security policy");
            }
        } else if (route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().f().contains(Mv.r.f20504g)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new f(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.connectionUser, this, route, routes, 0, route.c() ? g(route) : null, -1, false);
    }

    @Override // Rv.v
    public boolean isCanceled() {
        return this.connectionUser.isCanceled();
    }

    public final t l(f planToReplace, List<Mv.s> routes) throws IOException {
        p pVarB = this.connectionPool.b(this.connectionUser.i(), getAddress(), this.connectionUser, routes, planToReplace != null && planToReplace.getIsReady());
        if (pVarB == null) {
            return null;
        }
        if (planToReplace != null) {
            this.nextRouteToTry = planToReplace.getRoute();
            planToReplace.k();
        }
        this.connectionUser.f(pVarB);
        this.connectionUser.c(pVarB);
        return new t(pVarB);
    }

    @Override // Rv.v
    public boolean c(p failedConnection) {
        w wVar;
        Mv.s sVarN;
        if (!d().isEmpty() || this.nextRouteToTry != null) {
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

    @Override // Rv.v
    public v.b e() throws IOException {
        t tVarK = k();
        if (tVarK != null) {
            return tVarK;
        }
        t tVarM = m(this, null, null, 3, null);
        if (tVarM != null) {
            return tVarM;
        }
        if (!d().isEmpty()) {
            return d().removeFirst();
        }
        f fVarH = h();
        t tVarL = l(fVarH, fVarH.t());
        if (tVarL != null) {
            return tVarL;
        }
        return fVarH;
    }
}
