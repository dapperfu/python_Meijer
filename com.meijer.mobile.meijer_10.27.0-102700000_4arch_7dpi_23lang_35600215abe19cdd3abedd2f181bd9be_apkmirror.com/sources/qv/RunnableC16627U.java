package qv;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import qv.AbstractC16653m0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u001a\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0005R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\rR\u0014\u00100\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\rR\u0014\u00102\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\n¨\u00063"}, d2 = {"Lqv/U;", "Lqv/m0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "", "p2", "Ljava/lang/Thread;", "d2", "()Ljava/lang/Thread;", "", "n2", "()Z", "c2", "task", "A1", "(Ljava/lang/Runnable;)V", "", "now", "Lqv/m0$c;", "delayedTask", "m1", "(JLqv/m0$c;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lqv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lqv/h0;", "run", "", "toString", "()Ljava/lang/String;", "j", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "h2", "isShutDown", "l2", "isShutdownRequested", "j1", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: qv.U, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC16627U extends AbstractC16653m0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i, reason: collision with root package name */
    public static final RunnableC16627U f157621i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final long KEEP_ALIVE_NANOS;

    private final synchronized void c2() {
        if (l2()) {
            debugStatus = 3;
            T1();
            Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread d2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f157621i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final synchronized boolean n2() {
        if (l2()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    @Override // qv.AbstractC16653m0, qv.AbstractC16651l0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    static {
        Long l10;
        RunnableC16627U runnableC16627U = new RunnableC16627U();
        f157621i = runnableC16627U;
        AbstractC16651l0.c1(runnableC16627U, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l10.longValue());
    }

    private final boolean h2() {
        return debugStatus == 4;
    }

    private final boolean l2() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final void p2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // qv.AbstractC16655n0
    /* renamed from: j1 */
    protected Thread getThread() {
        Thread thread = _thread;
        return thread == null ? d2() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zQ1;
        a1.f157628a.d(this);
        C16632c.a();
        try {
            if (!n2()) {
                if (zQ1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jF1 = f1();
                if (jF1 == Long.MAX_VALUE) {
                    C16632c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        c2();
                        C16632c.a();
                        if (Q1()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    jF1 = RangesKt.l(jF1, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jF1 > 0) {
                    if (l2()) {
                        _thread = null;
                        c2();
                        C16632c.a();
                        if (Q1()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    C16632c.a();
                    LockSupport.parkNanos(this, jF1);
                }
            }
        } finally {
            _thread = null;
            c2();
            C16632c.a();
            if (!Q1()) {
                getThread();
            }
        }
    }

    @Override // qv.AbstractC16618K
    /* renamed from: toString */
    public String getName() {
        return "DefaultExecutor";
    }

    private RunnableC16627U() {
    }

    @Override // qv.AbstractC16653m0
    public void A1(Runnable task) {
        if (h2()) {
            p2();
        }
        super.A1(task);
    }

    @Override // qv.AbstractC16655n0
    protected void m1(long now, AbstractC16653m0.c delayedTask) {
        p2();
    }

    @Override // qv.AbstractC16653m0, qv.Y
    public InterfaceC16643h0 w(long timeMillis, Runnable block, CoroutineContext context) {
        return X1(timeMillis, block);
    }
}
