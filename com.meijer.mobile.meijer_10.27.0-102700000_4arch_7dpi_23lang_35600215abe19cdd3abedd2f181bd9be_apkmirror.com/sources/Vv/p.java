package Vv;

import Wv.d;
import Yv.b;
import Yv.n;
import Yv.y;
import com.google.android.libraries.places.api.model.PlaceTypes;
import hw.h;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.InterfaceC15329f;
import kw.InterfaceC15330g;
import kw.K;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001ZBc\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001cH\u0016¢\u0006\u0004\b*\u0010\u001eJ\u000f\u0010+\u001a\u00020\u001cH\u0000¢\u0006\u0004\b+\u0010\u001eJ\u000f\u0010,\u001a\u00020\u001cH\u0000¢\u0006\u0004\b,\u0010\u001eJ\r\u0010-\u001a\u00020\u001c¢\u0006\u0004\b-\u0010\u001eJ'\u00101\u001a\u00020!2\u0006\u0010/\u001a\u00020.2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001fH\u0000¢\u0006\u0004\b1\u00102J\u001f\u00108\u001a\u0002072\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001cH\u0016¢\u0006\u0004\bA\u0010\u001eJ\u000f\u0010B\u001a\u00020\u000bH\u0016¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020!2\u0006\u0010D\u001a\u00020!¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010O\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u0011\u0010Q\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bQ\u0010RJ'\u0010V\u001a\u00020\u001c2\u0006\u00104\u001a\u0002032\u0006\u0010S\u001a\u00020\t2\u0006\u0010U\u001a\u00020TH\u0000¢\u0006\u0004\bV\u0010WJ!\u0010Z\u001a\u00020\u001c2\u0006\u0010Y\u001a\u00020X2\b\u0010I\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bO\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010d\u001a\u0004\be\u0010fR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010g\u001a\u0004\bh\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010iR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010jR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bo\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\"\u0010}\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010y\u001a\u0004\bs\u0010z\"\u0004\b{\u0010|R\u0016\u0010~\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010yR%\u0010\u0082\u0001\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b1\u0010r\u001a\u0004\bv\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0083\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010rR\u0018\u0010\u0085\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010rR&\u0010\u0087\u0001\u001a\u00020\u00162\u0007\u0010\u0086\u0001\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b8\u0010r\u001a\u0004\bk\u0010\u007fR(\u0010\u008c\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020X0\u0089\u00010\u0088\u00018\u0006¢\u0006\u000e\n\u0005\b=\u0010\u008a\u0001\u001a\u0005\bm\u0010\u008b\u0001R(\u0010\u0092\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b+\u0010\u008e\u0001\u001a\u0005\bq\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010\u0093\u0001\u001a\u00020!8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010z¨\u0006\u0094\u0001"}, d2 = {"LVv/p;", "LYv/n$c;", "LQv/f;", "LWv/d$a;", "", "LUv/d;", "taskRunner", "LVv/q;", "connectionPool", "LQv/s;", PlaceTypes.ROUTE, "Ljava/net/Socket;", "rawSocket", "socket", "Lokhttp3/i;", "handshake", "LQv/r;", "protocol", "Lkw/g;", "source", "Lkw/f;", "sink", "", "pingIntervalMillis", "LVv/g;", "connectionListener", "<init>", "(LUv/d;LVv/q;LQv/s;Ljava/net/Socket;Ljava/net/Socket;Lokhttp3/i;LQv/r;Lkw/g;Lkw/f;ILVv/g;)V", "", "C", "()V", "", "candidates", "", "x", "(Ljava/util/List;)Z", "Lokhttp3/HttpUrl;", "url", "D", "(Lokhttp3/HttpUrl;)Z", "g", "(Lokhttp3/HttpUrl;Lokhttp3/i;)Z", "d", "v", "p", "B", "Lokhttp3/a;", PlaceTypes.ADDRESS, "routes", "q", "(Lokhttp3/a;Ljava/util/List;)Z", "Lokhttp3/OkHttpClient;", "client", "LWv/g;", "chain", "LWv/d;", "t", "(Lokhttp3/OkHttpClient;LWv/g;)LWv/d;", "LVv/i;", "exchange", "Lhw/h$d;", "u", "(LVv/i;)Lhw/h$d;", "w", "()LQv/s;", "cancel", "A", "()Ljava/net/Socket;", "doExtensiveChecks", "r", "(Z)Z", "LYv/u;", "stream", "e", "(LYv/u;)V", "LYv/n;", "connection", "LYv/y;", "settings", "c", "(LYv/n;LYv/y;)V", "o", "()Lokhttp3/i;", "failedRoute", "Ljava/io/IOException;", "failure", "h", "(Lokhttp3/OkHttpClient;LQv/s;Ljava/io/IOException;)V", "LVv/o;", "call", "a", "(LVv/o;Ljava/io/IOException;)V", "b", "()LQv/r;", "", "toString", "()Ljava/lang/String;", "LUv/d;", "getTaskRunner", "()LUv/d;", "LVv/q;", "getConnectionPool", "()LVv/q;", "LQv/s;", "f", "Ljava/net/Socket;", "Lokhttp3/i;", "i", "LQv/r;", "j", "Lkw/g;", "k", "Lkw/f;", "l", "I", "m", "LVv/g;", "()LVv/g;", "n", "LYv/n;", "http2Connection", "Z", "()Z", "z", "(Z)V", "noNewExchanges", "noCoalescedConnections", "()I", "setRouteFailureCount$okhttp", "(I)V", "routeFailureCount", "successCount", "s", "refusedStreamCount", "value", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "y", "(J)V", "idleAtNs", "isMultiplexed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class p extends n.c implements Qv.f, d.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Uv.d taskRunner;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q connectionPool;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Qv.s route;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Socket rawSocket;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Socket socket;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.i handshake;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Qv.r protocol;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15330g source;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15329f sink;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int pingIntervalMillis;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final g connectionListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Yv.n http2Connection;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean noNewExchanges;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean noCoalescedConnections;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int routeFailureCount;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int successCount;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int refusedStreamCount;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int allocationLimit;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final List<Reference<o>> calls;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long idleAtNs;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Vv/p$b", "Lhw/h$d;", "", "close", "()V", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends h.d {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f38166d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i iVar, InterfaceC15330g interfaceC15330g, InterfaceC15329f interfaceC15329f) {
            super(true, interfaceC15330g, interfaceC15329f);
            this.f38166d = iVar;
        }

        @Override // hw.h.d
        public void a() {
            this.f38166d.d();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f38166d.b(-1L, true, true, null);
        }
    }

    @Override // Wv.d.a
    public void d() {
        synchronized (this) {
            this.noNewExchanges = true;
            Unit unit = Unit.f142422a;
        }
        this.connectionListener.h(this);
    }

    public final void p() {
        synchronized (this) {
            this.successCount++;
        }
    }

    public final void v() {
        synchronized (this) {
            this.noCoalescedConnections = true;
            Unit unit = Unit.f142422a;
        }
    }

    public p(Uv.d taskRunner, q connectionPool, Qv.s route, Socket rawSocket, Socket socket, okhttp3.i iVar, Qv.r protocol, InterfaceC15330g source, InterfaceC15329f sink, int i10, g connectionListener) {
        Intrinsics.j(taskRunner, "taskRunner");
        Intrinsics.j(connectionPool, "connectionPool");
        Intrinsics.j(route, "route");
        Intrinsics.j(rawSocket, "rawSocket");
        Intrinsics.j(socket, "socket");
        Intrinsics.j(protocol, "protocol");
        Intrinsics.j(source, "source");
        Intrinsics.j(sink, "sink");
        Intrinsics.j(connectionListener, "connectionListener");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.route = route;
        this.rawSocket = rawSocket;
        this.socket = socket;
        this.handshake = iVar;
        this.protocol = protocol;
        this.source = source;
        this.sink = sink;
        this.pingIntervalMillis = i10;
        this.connectionListener = connectionListener;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final void C() throws IOException {
        this.socket.setSoTimeout(0);
        Object obj = this.connectionListener;
        Yv.b bVar = obj instanceof Yv.b ? (Yv.b) obj : null;
        if (bVar == null) {
            bVar = b.a.f41830a;
        }
        Yv.n nVarA = new n.a(true, this.taskRunner).s(this.socket, getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl().getHost(), this.source, this.sink).m(this).n(this.pingIntervalMillis).b(bVar).a();
        this.http2Connection = nVarA;
        this.allocationLimit = Yv.n.INSTANCE.a().d();
        Yv.n.i1(nVarA, false, 1, null);
    }

    private final boolean D(HttpUrl url) {
        okhttp3.i iVar;
        if (!Rv.k.f33047b || Thread.holdsLock(this)) {
            HttpUrl url2 = getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl();
            if (url.getPort() != url2.getPort()) {
                return false;
            }
            if (Intrinsics.e(url.getHost(), url2.getHost())) {
                return true;
            }
            return (this.noCoalescedConnections || (iVar = this.handshake) == null || !g(url, iVar)) ? false : true;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final boolean x(List<Qv.s> candidates) {
        List<Qv.s> list = candidates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Qv.s sVar : list) {
            Proxy.Type type = sVar.getProxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && getRoute().getProxy().type() == type2 && Intrinsics.e(getRoute().getSocketAddress(), sVar.getSocketAddress())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A, reason: from getter */
    public Socket getSocket() {
        return this.socket;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // Wv.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(Vv.o r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.j(r4, r0)
            monitor-enter(r3)
            boolean r0 = r5 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto L41
            r0 = r5
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0     // Catch: java.lang.Throwable -> L26
            Yv.a r0 = r0.errorCode     // Catch: java.lang.Throwable -> L26
            Yv.a r2 = Yv.a.f41820j     // Catch: java.lang.Throwable -> L26
            if (r0 != r2) goto L28
            int r4 = r3.refusedStreamCount     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.refusedStreamCount = r4     // Catch: java.lang.Throwable -> L26
            if (r4 <= r1) goto L4c
            boolean r4 = r3.noNewExchanges     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.routeFailureCount = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L26:
            r4 = move-exception
            goto L75
        L28:
            okhttp3.internal.http2.StreamResetException r5 = (okhttp3.internal.http2.StreamResetException) r5     // Catch: java.lang.Throwable -> L26
            Yv.a r5 = r5.errorCode     // Catch: java.lang.Throwable -> L26
            Yv.a r0 = Yv.a.f41821k     // Catch: java.lang.Throwable -> L26
            if (r5 != r0) goto L36
            boolean r4 = r4.getCanceled()     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L4c
        L36:
            boolean r4 = r3.noNewExchanges     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.routeFailureCount = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L41:
            boolean r0 = r3.s()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4e
            boolean r0 = r5 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r4 = 0
            goto L6a
        L4e:
            boolean r0 = r3.noNewExchanges     // Catch: java.lang.Throwable -> L26
            r0 = r0 ^ r1
            r3.noNewExchanges = r1     // Catch: java.lang.Throwable -> L26
            int r2 = r3.successCount     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L69
            if (r5 == 0) goto L64
            okhttp3.OkHttpClient r4 = r4.getClient()     // Catch: java.lang.Throwable -> L26
            Qv.s r2 = r3.getRoute()     // Catch: java.lang.Throwable -> L26
            r3.h(r4, r2, r5)     // Catch: java.lang.Throwable -> L26
        L64:
            int r4 = r3.routeFailureCount     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.routeFailureCount = r4     // Catch: java.lang.Throwable -> L26
        L69:
            r4 = r0
        L6a:
            kotlin.Unit r5 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            if (r4 == 0) goto L74
            Vv.g r4 = r3.connectionListener
            r4.h(r3)
        L74:
            return
        L75:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Vv.p.a(Vv.o, java.io.IOException):void");
    }

    @Override // Qv.f
    /* renamed from: b, reason: from getter */
    public Qv.r getProtocol() {
        return this.protocol;
    }

    @Override // Yv.n.c
    public void c(Yv.n connection, y settings) {
        Intrinsics.j(connection, "connection");
        Intrinsics.j(settings, "settings");
        synchronized (this) {
            try {
                int i10 = this.allocationLimit;
                int iD = settings.d();
                this.allocationLimit = iD;
                if (iD < i10) {
                    this.connectionPool.m(getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String());
                } else if (iD > i10) {
                    this.connectionPool.k();
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Wv.d.a
    public void cancel() throws IOException {
        Rv.k.h(this.rawSocket);
    }

    @Override // Yv.n.c
    public void e(Yv.u stream) throws IOException {
        Intrinsics.j(stream, "stream");
        stream.e(Yv.a.f41820j, null);
    }

    @Override // Wv.d.a
    /* renamed from: f, reason: from getter */
    public Qv.s getRoute() {
        return this.route;
    }

    public final void h(OkHttpClient client, Qv.s failedRoute, IOException failure) {
        Intrinsics.j(client, "client");
        Intrinsics.j(failedRoute, "failedRoute");
        Intrinsics.j(failure, "failure");
        if (failedRoute.getProxy().type() != Proxy.Type.DIRECT) {
            okhttp3.a aVar = failedRoute.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String();
            aVar.getProxySelector().connectFailed(aVar.getUrl().y(), failedRoute.getProxy().address(), failure);
        }
        client.getRouteDatabase().b(failedRoute);
    }

    /* renamed from: i, reason: from getter */
    public final int getAllocationLimit() {
        return this.allocationLimit;
    }

    public final List<Reference<o>> j() {
        return this.calls;
    }

    /* renamed from: k, reason: from getter */
    public final g getConnectionListener() {
        return this.connectionListener;
    }

    /* renamed from: l, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    /* renamed from: n, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    /* renamed from: o, reason: from getter */
    public okhttp3.i getHandshake() {
        return this.handshake;
    }

    public final boolean q(okhttp3.a address, List<Qv.s> routes) {
        Intrinsics.j(address, "address");
        if (Rv.k.f33047b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().d(address)) {
            return false;
        }
        if (Intrinsics.e(address.getUrl().getHost(), w().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl().getHost())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !x(routes) || address.getHostnameVerifier() != fw.d.f132420a || !D(address.getUrl())) {
            return false;
        }
        try {
            Qv.d certificatePinner = address.getCertificatePinner();
            Intrinsics.g(certificatePinner);
            String host = address.getUrl().getHost();
            okhttp3.i handshake = getHandshake();
            Intrinsics.g(handshake);
            certificatePinner.b(host, handshake.e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean r(boolean doExtensiveChecks) {
        long j10;
        if (Rv.k.f33047b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        if (this.rawSocket.isClosed() || this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        Yv.n nVar = this.http2Connection;
        if (nVar != null) {
            return nVar.J0(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.idleAtNs;
        }
        if (j10 < 10000000000L || !doExtensiveChecks) {
            return true;
        }
        return Rv.k.m(this.socket, this.source);
    }

    public final boolean s() {
        return this.http2Connection != null;
    }

    public final Wv.d t(OkHttpClient client, Wv.g chain) throws SocketException {
        Intrinsics.j(client, "client");
        Intrinsics.j(chain, "chain");
        Socket socket = this.socket;
        InterfaceC15330g interfaceC15330g = this.source;
        InterfaceC15329f interfaceC15329f = this.sink;
        Yv.n nVar = this.http2Connection;
        if (nVar != null) {
            return new Yv.s(client, this, chain, nVar);
        }
        socket.setSoTimeout(chain.k());
        K f148081a = interfaceC15330g.getF148081a();
        long jH = chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f148081a.g(jH, timeUnit);
        interfaceC15329f.getF148079a().g(chain.getWriteTimeoutMillis(), timeUnit);
        return new Xv.b(client, this, interfaceC15330g, interfaceC15329f);
    }

    public String toString() {
        Object cipherSuite;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl().getHost());
        sb2.append(':');
        sb2.append(getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl().getPort());
        sb2.append(", proxy=");
        sb2.append(getRoute().getProxy());
        sb2.append(" hostAddress=");
        sb2.append(getRoute().getSocketAddress());
        sb2.append(" cipherSuite=");
        okhttp3.i iVar = this.handshake;
        if (iVar == null || (cipherSuite = iVar.getCipherSuite()) == null) {
            cipherSuite = "none";
        }
        sb2.append(cipherSuite);
        sb2.append(" protocol=");
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    public final h.d u(i exchange) throws SocketException {
        Intrinsics.j(exchange, "exchange");
        this.socket.setSoTimeout(0);
        d();
        return new b(exchange, this.source, this.sink);
    }

    public final void y(long j10) {
        this.idleAtNs = j10;
    }

    public final void z(boolean z10) {
        this.noNewExchanges = z10;
    }

    private final boolean g(HttpUrl url, okhttp3.i handshake) {
        List<Certificate> listE = handshake.e();
        if (!listE.isEmpty()) {
            fw.d dVar = fw.d.f132420a;
            String host = url.getHost();
            Certificate certificate = listE.get(0);
            Intrinsics.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    public final void B() throws IOException {
        this.idleAtNs = System.nanoTime();
        Qv.r rVar = this.protocol;
        if (rVar != Qv.r.f31481f && rVar != Qv.r.f31482g) {
            return;
        }
        C();
    }

    public Qv.s w() {
        return getRoute();
    }
}
