package Vv;

import Vv.o;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001G\u0018\u0000 -2\u00020\u0001:\u00028+BQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010#J?\u0010+\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u000e2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\u0006\u0010*\u001a\u00020\u001b¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\r¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0014¢\u0006\u0004\b7\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010:R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\b<\u0010=R,\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010>R\u001a\u0010B\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00190J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010K¨\u0006M"}, d2 = {"LVv/q;", "", "LUv/d;", "taskRunner", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "LVv/g;", "connectionListener", "Lkotlin/Function3;", "Lokhttp3/a;", "LVv/h;", "LVv/j;", "exchangeFinderFactory", "<init>", "(LUv/d;IJLjava/util/concurrent/TimeUnit;LVv/g;Lkotlin/jvm/functions/Function3;)V", "LVv/q$a;", "", "l", "(LVv/q$a;)V", "", "addressStates", "LVv/p;", "connection", "", "g", "(Ljava/util/Map;LVv/p;)Z", "now", "i", "(LVv/p;J)I", "state", "h", "(LVv/q$a;)J", "doExtensiveHealthChecks", PlaceTypes.ADDRESS, "connectionUser", "", "LQv/s;", "routes", "requireMultiplexed", "b", "(ZLokhttp3/a;LVv/h;Ljava/util/List;Z)LVv/p;", "j", "(LVv/p;)V", "d", "(LVv/p;)Z", "e", "()V", "c", "(J)J", "m", "(Lokhttp3/a;)V", "k", "a", "LUv/d;", "I", "LVv/g;", "f", "()LVv/g;", "Lkotlin/jvm/functions/Function3;", "J", "getKeepAliveDurationNs$okhttp", "()J", "keepAliveDurationNs", "Ljava/util/Map;", "LUv/c;", "LUv/c;", "cleanupQueue", "Vv/q$c", "LVv/q$c;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class q {

    /* renamed from: k, reason: collision with root package name */
    private static AtomicReferenceFieldUpdater<q, Map<?, ?>> f38168k = AtomicReferenceFieldUpdater.newUpdater(q.class, Map.class, "f");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uv.d taskRunner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxIdleConnections;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g connectionListener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function3<q, okhttp3.a, h, j> exchangeFinderFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long keepAliveDurationNs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile Map<okhttp3.a, a> addressStates;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Uv.c cleanupQueue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c cleanupTask;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedQueue<p> connections;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LVv/q$a;", "", "LUv/c;", "a", "LUv/c;", "c", "()LUv/c;", "queue", "", "b", "I", "()I", "d", "(I)V", "concurrentCallCapacity", "LVv/a;", "policy", "LVv/a;", "()LVv/a;", "setPolicy", "(LVv/a;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Uv.c queue;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int concurrentCallCapacity;

        public final Vv.a b() {
            return null;
        }

        /* renamed from: a, reason: from getter */
        public final int getConcurrentCallCapacity() {
            return this.concurrentCallCapacity;
        }

        /* renamed from: c, reason: from getter */
        public final Uv.c getQueue() {
            return this.queue;
        }

        public final void d(int i10) {
            this.concurrentCallCapacity = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Vv/q$c", "LUv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends Uv.a {
        c(String str) {
            super(str, false, 2, null);
        }

        @Override // Uv.a
        public long f() {
            return q.this.c(System.nanoTime());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Vv/q$d", "LUv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends Uv.a {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f38182f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a aVar, String str) {
            super(str, false, 2, null);
            this.f38182f = aVar;
        }

        @Override // Uv.a
        public long f() {
            return q.this.h(this.f38182f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(Uv.d taskRunner, int i10, long j10, TimeUnit timeUnit, g connectionListener, Function3<? super q, ? super okhttp3.a, ? super h, ? extends j> exchangeFinderFactory) {
        Intrinsics.j(taskRunner, "taskRunner");
        Intrinsics.j(timeUnit, "timeUnit");
        Intrinsics.j(connectionListener, "connectionListener");
        Intrinsics.j(exchangeFinderFactory, "exchangeFinderFactory");
        this.taskRunner = taskRunner;
        this.maxIdleConnections = i10;
        this.connectionListener = connectionListener;
        this.exchangeFinderFactory = exchangeFinderFactory;
        this.keepAliveDurationNs = timeUnit.toNanos(j10);
        this.addressStates = MapsKt.k();
        this.cleanupQueue = taskRunner.k();
        this.cleanupTask = new c(Rv.k.f33048c + " ConnectionPool connection closer");
        this.connections = new ConcurrentLinkedQueue<>();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int i(p connection, long now) {
        if (Rv.k.f33047b && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        List<Reference<o>> listJ = connection.j();
        int i10 = 0;
        while (i10 < listJ.size()) {
            Reference<o> reference = listJ.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Intrinsics.h(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                okhttp3.internal.platform.c.INSTANCE.e().m("A connection to " + connection.w().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl() + " was leaked. Did you forget to close a response body?", ((o.b) reference).getCallStackTrace());
                listJ.remove(i10);
                if (listJ.isEmpty()) {
                    connection.y(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return listJ.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:14:0x0032, B:17:0x0039), top: B:38:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Vv.p b(boolean r6, okhttp3.a r7, Vv.h r8, java.util.List<Qv.s> r9, boolean r10) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.j(r7, r0)
            java.lang.String r0 = "connectionUser"
            kotlin.jvm.internal.Intrinsics.j(r8, r0)
            java.util.concurrent.ConcurrentLinkedQueue<Vv.p> r0 = r5.connections
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            Vv.p r1 = (Vv.p) r1
            kotlin.jvm.internal.Intrinsics.g(r1)
            monitor-enter(r1)
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L32
            boolean r4 = r1.s()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L32
            goto L3d
        L30:
            r6 = move-exception
            goto L6a
        L32:
            boolean r4 = r1.q(r7, r9)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L39
            goto L3d
        L39:
            r8.c(r1)     // Catch: java.lang.Throwable -> L30
            r3 = r2
        L3d:
            monitor-exit(r1)
            if (r3 == 0) goto L15
            boolean r3 = r1.r(r6)
            if (r3 == 0) goto L47
            return r1
        L47:
            monitor-enter(r1)
            boolean r3 = r1.getNoNewExchanges()     // Catch: java.lang.Throwable -> L67
            r1.z(r2)     // Catch: java.lang.Throwable -> L67
            java.net.Socket r2 = r8.t()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r1)
            if (r2 == 0) goto L5f
            Rv.k.h(r2)
            Vv.g r2 = r5.connectionListener
            r2.f(r1)
            goto L15
        L5f:
            if (r3 != 0) goto L15
            Vv.g r2 = r5.connectionListener
            r2.h(r1)
            goto L15
        L67:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L6a:
            monitor-exit(r1)
            throw r6
        L6c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Vv.q.b(boolean, okhttp3.a, Vv.h, java.util.List, boolean):Vv.p");
    }

    public final long c(long now) throws IOException {
        int i10;
        Map<okhttp3.a, a> map = this.addressStates;
        Iterator<a> it = map.values().iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            it.next().d(0);
        }
        Iterator<p> it2 = this.connections.iterator();
        Intrinsics.i(it2, "iterator(...)");
        while (it2.hasNext()) {
            p next = it2.next();
            a aVar = map.get(next.getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String());
            if (aVar != null) {
                Intrinsics.g(next);
                synchronized (next) {
                    aVar.d(aVar.getConcurrentCallCapacity() + next.getAllocationLimit());
                    Unit unit = Unit.f142422a;
                }
            }
        }
        long j10 = (now - this.keepAliveDurationNs) + 1;
        Iterator<p> it3 = this.connections.iterator();
        Intrinsics.i(it3, "iterator(...)");
        p pVar = null;
        p pVar2 = null;
        p pVar3 = null;
        long j11 = Long.MAX_VALUE;
        int i11 = 0;
        while (it3.hasNext()) {
            p next2 = it3.next();
            Intrinsics.g(next2);
            synchronized (next2) {
                if (i(next2, now) > 0) {
                    i11++;
                } else {
                    long idleAtNs = next2.getIdleAtNs();
                    if (idleAtNs < j10) {
                        pVar2 = next2;
                        j10 = idleAtNs;
                    }
                    if (g(map, next2)) {
                        i10++;
                        if (idleAtNs < j11) {
                            pVar3 = next2;
                            j11 = idleAtNs;
                        }
                    }
                }
                Unit unit2 = Unit.f142422a;
            }
        }
        if (pVar2 != null) {
            pVar = pVar2;
        } else if (i10 > this.maxIdleConnections) {
            j10 = j11;
            pVar = pVar3;
        } else {
            j10 = -1;
        }
        if (pVar == null) {
            if (pVar3 != null) {
                return (j11 + this.keepAliveDurationNs) - now;
            }
            if (i11 > 0) {
                return this.keepAliveDurationNs;
            }
            return -1L;
        }
        synchronized (pVar) {
            if (!pVar.j().isEmpty()) {
                return 0L;
            }
            if (pVar.getIdleAtNs() != j10) {
                return 0L;
            }
            pVar.z(true);
            this.connections.remove(pVar);
            a aVar2 = map.get(pVar.getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String());
            if (aVar2 != null) {
                l(aVar2);
            }
            Rv.k.h(pVar.getSocket());
            this.connectionListener.f(pVar);
            if (this.connections.isEmpty()) {
                this.cleanupQueue.a();
            }
            return 0L;
        }
    }

    public final boolean d(p connection) {
        Intrinsics.j(connection, "connection");
        if (Rv.k.f33047b && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            k();
            return false;
        }
        connection.z(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.a();
        }
        m(connection.getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String());
        return true;
    }

    public final void e() throws IOException {
        Socket socket;
        Iterator<p> it = this.connections.iterator();
        Intrinsics.i(it, "iterator(...)");
        while (it.hasNext()) {
            p next = it.next();
            Intrinsics.g(next);
            synchronized (next) {
                if (next.j().isEmpty()) {
                    it.remove();
                    next.z(true);
                    socket = next.getSocket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Rv.k.h(socket);
                this.connectionListener.f(next);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.a();
        }
        Iterator<a> it2 = this.addressStates.values().iterator();
        while (it2.hasNext()) {
            l(it2.next());
        }
    }

    /* renamed from: f, reason: from getter */
    public final g getConnectionListener() {
        return this.connectionListener;
    }

    public final void j(p connection) {
        Intrinsics.j(connection, "connection");
        if (!Rv.k.f33047b || Thread.holdsLock(connection)) {
            this.connections.add(connection);
            k();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final void k() {
        Uv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    public final void m(okhttp3.a address) {
        Intrinsics.j(address, "address");
        a aVar = this.addressStates.get(address);
        if (aVar != null) {
            l(aVar);
        }
    }

    private final boolean g(Map<okhttp3.a, a> addressStates, p connection) {
        a aVar = addressStates.get(connection.getRoute().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String());
        if (aVar == null) {
            return true;
        }
        aVar.getConcurrentCallCapacity();
        connection.getAllocationLimit();
        aVar.b();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long h(a state) {
        state.b();
        throw null;
    }

    private final void l(a aVar) {
        Uv.c.m(aVar.getQueue(), new d(aVar, Rv.k.f33048c + " ConnectionPool connection opener"), 0L, 2, null);
    }
}
