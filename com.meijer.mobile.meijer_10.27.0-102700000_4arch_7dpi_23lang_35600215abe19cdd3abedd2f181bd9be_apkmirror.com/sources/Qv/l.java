package Qv;

import Vv.o;
import com.google.android.gms.common.api.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0018\u00010\tR\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\tR\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\tR\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!R*\u0010\"\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010!\"\u0004\b%\u0010&R*\u0010'\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b(\u0010!\"\u0004\b)\u0010&R$\u00100\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00106\u001a\f\u0012\b\u0012\u00060\tR\u00020\n048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u001e\u00107\u001a\f\u0012\b\u0012\u00060\tR\u00020\n048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\n048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b1\u00109¨\u0006:"}, d2 = {"LQv/l;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "executorService", "(Ljava/util/concurrent/ExecutorService;)V", "", "host", "LVv/o$a;", "LVv/o;", "e", "(Ljava/lang/String;)LVv/o$a;", "", "i", "()Z", "T", "Ljava/util/Deque;", "calls", "call", "", "f", "(Ljava/util/Deque;Ljava/lang/Object;)V", "b", "(LVv/o$a;)V", "a", "c", "(LVv/o;)Z", "g", "h", "(LVv/o;)V", "", "j", "()I", "maxRequests", "I", "getMaxRequests", "k", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "l", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "d", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxRequests;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxRequestsPerHost;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Runnable idleCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ExecutorService executorServiceOrNull;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<o.a> readyAsyncCalls;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<o.a> runningAsyncCalls;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<Vv.o> runningSyncCalls;

    public l() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final <T> void f(Deque<T> calls, T call) {
        Runnable runnable;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            Unit unit = Unit.f142422a;
        }
        if (i() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final synchronized void a() {
        try {
            Iterator<o.a> it = this.readyAsyncCalls.iterator();
            Intrinsics.i(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().getF38142c().cancel();
            }
            Iterator<o.a> it2 = this.runningAsyncCalls.iterator();
            Intrinsics.i(it2, "iterator(...)");
            while (it2.hasNext()) {
                it2.next().getF38142c().cancel();
            }
            Iterator<Vv.o> it3 = this.runningSyncCalls.iterator();
            Intrinsics.i(it3, "iterator(...)");
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean c(Vv.o call) {
        Intrinsics.j(call, "call");
        return this.runningSyncCalls.add(call);
    }

    @JvmName
    public final synchronized ExecutorService d() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Rv.k.p(Rv.k.f33048c + " Dispatcher", false));
            }
            executorService = this.executorServiceOrNull;
            Intrinsics.g(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final synchronized int j() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final void k(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.maxRequests = i10;
            Unit unit = Unit.f142422a;
        }
        i();
    }

    public final void l(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i10;
            Unit unit = Unit.f142422a;
        }
        i();
    }

    private final o.a e(String host) {
        Iterator<o.a> it = this.runningAsyncCalls.iterator();
        Intrinsics.i(it, "iterator(...)");
        while (it.hasNext()) {
            o.a next = it.next();
            if (Intrinsics.e(next.g(), host)) {
                return next;
            }
        }
        Iterator<o.a> it2 = this.readyAsyncCalls.iterator();
        Intrinsics.i(it2, "iterator(...)");
        while (it2.hasNext()) {
            o.a next2 = it2.next();
            if (Intrinsics.e(next2.g(), host)) {
                return next2;
            }
        }
        return null;
    }

    public final void b(o.a call) {
        o.a aVarE;
        Intrinsics.j(call, "call");
        synchronized (this) {
            try {
                this.readyAsyncCalls.add(call);
                if (!call.getF38142c().getForWebSocket() && (aVarE = e(call.g())) != null) {
                    call.h(aVarE);
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i();
    }

    public final void g(o.a call) {
        Intrinsics.j(call, "call");
        call.getCallsPerHost().decrementAndGet();
        f(this.runningAsyncCalls, call);
    }

    public final void h(Vv.o call) {
        Intrinsics.j(call, "call");
        f(this.runningSyncCalls, call);
    }

    private final boolean i() {
        int i10;
        boolean z10;
        Rv.k.e(this);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<o.a> it = this.readyAsyncCalls.iterator();
                Intrinsics.i(it, "iterator(...)");
                while (it.hasNext()) {
                    o.a next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        Intrinsics.g(next);
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                i10 = 0;
                if (j() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (d().isShutdown()) {
            int size = arrayList.size();
            while (i10 < size) {
                o.a aVar = (o.a) arrayList.get(i10);
                aVar.getCallsPerHost().decrementAndGet();
                synchronized (this) {
                    this.runningAsyncCalls.remove(aVar);
                }
                o.a.c(aVar, null, 1, null);
                i10++;
            }
            Runnable runnable = this.idleCallback;
            if (runnable != null) {
                runnable.run();
                return z10;
            }
        } else {
            int size2 = arrayList.size();
            while (i10 < size2) {
                ((o.a) arrayList.get(i10)).a(d());
                i10++;
            }
        }
        return z10;
    }

    public l(ExecutorService executorService) {
        this();
        this.executorServiceOrNull = executorService;
    }
}
