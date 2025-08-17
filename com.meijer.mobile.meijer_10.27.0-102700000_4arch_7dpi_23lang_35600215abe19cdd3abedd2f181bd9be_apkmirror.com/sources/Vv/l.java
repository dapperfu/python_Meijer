package Vv;

import Vv.v;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\"\u0010'\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\b0\b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&¨\u0006("}, d2 = {"LVv/l;", "LVv/j;", "LVv/v;", "routePlanner", "LUv/d;", "taskRunner", "<init>", "(LVv/v;LUv/d;)V", "LVv/v$a;", "g", "()LVv/v$a;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "e", "(JLjava/util/concurrent/TimeUnit;)LVv/v$a;", "", "f", "()V", "LVv/p;", "a", "()LVv/p;", "LVv/v;", "b", "()LVv/v;", "LUv/d;", "c", "J", "connectDelayNanos", "d", "nextTcpConnectAtNanos", "Ljava/util/concurrent/CopyOnWriteArrayList;", "LVv/v$b;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "tcpConnectsInFlight", "Ljava/util/concurrent/BlockingQueue;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/BlockingQueue;", "connectResults", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v routePlanner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Uv.d taskRunner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long connectDelayNanos;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long nextTcpConnectAtNanos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<v.b> tcpConnectsInFlight;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final BlockingQueue<v.ConnectResult> connectResults;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Vv/l$a", "LUv/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends Uv.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ v.b f38119e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ l f38120f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, v.b bVar, l lVar) {
            super(str, false, 2, null);
            this.f38119e = bVar;
            this.f38120f = lVar;
        }

        @Override // Uv.a
        public long f() throws InterruptedException {
            v.ConnectResult connectResult;
            try {
                connectResult = this.f38119e.h();
            } catch (Throwable th2) {
                connectResult = new v.ConnectResult(this.f38119e, null, th2, 2, null);
            }
            if (!this.f38120f.tcpConnectsInFlight.contains(this.f38119e)) {
                return -1L;
            }
            this.f38120f.connectResults.put(connectResult);
            return -1L;
        }
    }

    @Override // Vv.j
    public p a() throws IOException {
        v.ConnectResult connectResultG;
        long j10;
        IOException iOException = null;
        while (true) {
            try {
                if (this.tcpConnectsInFlight.isEmpty() && !v.e(getRoutePlanner(), null, 1, null)) {
                    f();
                    Intrinsics.g(iOException);
                    throw iOException;
                }
                if (getRoutePlanner().isCanceled()) {
                    throw new IOException("Canceled");
                }
                long jB = this.taskRunner.getBackend().b();
                long j11 = this.nextTcpConnectAtNanos - jB;
                if (this.tcpConnectsInFlight.isEmpty() || j11 <= 0) {
                    connectResultG = g();
                    j10 = this.connectDelayNanos;
                    this.nextTcpConnectAtNanos = jB + j10;
                } else {
                    j10 = j11;
                    connectResultG = null;
                }
                if (connectResultG != null || (connectResultG = e(j10, TimeUnit.NANOSECONDS)) != null) {
                    if (connectResultG.f()) {
                        f();
                        if (!connectResultG.getPlan().getIsReady()) {
                            connectResultG = connectResultG.getPlan().e();
                        }
                        if (connectResultG.f()) {
                            return connectResultG.getPlan().getConnection();
                        }
                    }
                    Throwable thE = connectResultG.e();
                    if (thE != null) {
                        if (!(thE instanceof IOException)) {
                            throw thE;
                        }
                        if (iOException == null) {
                            iOException = (IOException) thE;
                        } else {
                            ExceptionsKt.a(iOException, thE);
                        }
                    }
                    v.b bVarC = connectResultG.c();
                    if (bVarC != null) {
                        getRoutePlanner().c().addFirst(bVarC);
                    }
                }
            } finally {
                f();
            }
        }
    }

    public l(v routePlanner, Uv.d taskRunner) {
        Intrinsics.j(routePlanner, "routePlanner");
        Intrinsics.j(taskRunner, "taskRunner");
        this.routePlanner = routePlanner;
        this.taskRunner = taskRunner;
        this.connectDelayNanos = TimeUnit.MILLISECONDS.toNanos(250L);
        this.nextTcpConnectAtNanos = Long.MIN_VALUE;
        this.tcpConnectsInFlight = new CopyOnWriteArrayList<>();
        this.connectResults = taskRunner.getBackend().c(new LinkedBlockingDeque());
    }

    private final v.ConnectResult e(long timeout, TimeUnit unit) {
        v.ConnectResult connectResultPoll;
        if (this.tcpConnectsInFlight.isEmpty() || (connectResultPoll = this.connectResults.poll(timeout, unit)) == null) {
            return null;
        }
        this.tcpConnectsInFlight.remove(connectResultPoll.getPlan());
        return connectResultPoll;
    }

    private final void f() {
        Iterator<v.b> it = this.tcpConnectsInFlight.iterator();
        Intrinsics.i(it, "iterator(...)");
        while (it.hasNext()) {
            v.b next = it.next();
            next.cancel();
            v.b bVarG = next.g();
            if (bVarG != null) {
                getRoutePlanner().c().addLast(bVarG);
            }
        }
        this.tcpConnectsInFlight.clear();
    }

    @Override // Vv.j
    /* renamed from: b, reason: from getter */
    public v getRoutePlanner() {
        return this.routePlanner;
    }

    private final v.ConnectResult g() throws IOException {
        v.b kVar;
        if (v.e(getRoutePlanner(), null, 1, null)) {
            try {
                kVar = getRoutePlanner().d();
            } catch (Throwable th2) {
                kVar = new k(th2);
            }
            if (kVar.getIsReady()) {
                return new v.ConnectResult(kVar, null, null, 6, null);
            }
            if (kVar instanceof k) {
                return ((k) kVar).getResult();
            }
            this.tcpConnectsInFlight.add(kVar);
            Uv.c.m(this.taskRunner.k(), new a(Rv.k.f33048c + " connect " + getRoutePlanner().getAddress().getUrl().v(), kVar, this), 0L, 2, null);
        }
        return null;
    }
}
