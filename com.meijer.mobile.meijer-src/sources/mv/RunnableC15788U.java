package mv;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.AbstractC15814m0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010\u001a\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0005R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\rR\u0014\u00100\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\rR\u0014\u00102\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\n¨\u00063"}, d2 = {"Lmv/U;", "Lmv/m0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "", "n2", "Ljava/lang/Thread;", "c2", "()Ljava/lang/Thread;", "", "l2", "()Z", "b2", "task", "A1", "(Ljava/lang/Runnable;)V", "", "now", "Lmv/m0$c;", "delayedTask", "n1", "(JLmv/m0$c;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lmv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lmv/h0;", "run", "", "toString", "()Ljava/lang/String;", "j", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "g2", "isShutDown", "j2", "isShutdownRequested", "k1", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.U, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC15788U extends AbstractC15814m0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i, reason: collision with root package name */
    public static final RunnableC15788U f151695i;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final long KEEP_ALIVE_NANOS;

    private final synchronized void b2() {
        if (j2()) {
            debugStatus = 3;
            R1();
            Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread c2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f151695i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final synchronized boolean l2() {
        if (j2()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.h(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    @Override // mv.AbstractC15814m0, mv.AbstractC15812l0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    static {
        Long l10;
        RunnableC15788U runnableC15788U = new RunnableC15788U();
        f151695i = runnableC15788U;
        AbstractC15812l0.c1(runnableC15788U, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l10.longValue());
    }

    private final boolean g2() {
        return debugStatus == 4;
    }

    private final boolean j2() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final void n2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // mv.AbstractC15816n0
    /* renamed from: k1 */
    protected Thread getThread() {
        Thread thread = _thread;
        return thread == null ? c2() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zP1;
        a1.f151702a.d(this);
        C15793c.a();
        try {
            if (!l2()) {
                if (zP1) {
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
                    C15793c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        b2();
                        C15793c.a();
                        if (P1()) {
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
                    if (j2()) {
                        _thread = null;
                        b2();
                        C15793c.a();
                        if (P1()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    C15793c.a();
                    LockSupport.parkNanos(this, jF1);
                }
            }
        } finally {
            _thread = null;
            b2();
            C15793c.a();
            if (!P1()) {
                getThread();
            }
        }
    }

    @Override // mv.AbstractC15779K
    /* renamed from: toString */
    public String getName() {
        return "DefaultExecutor";
    }

    private RunnableC15788U() {
    }

    @Override // mv.AbstractC15814m0
    public void A1(Runnable task) {
        if (g2()) {
            n2();
        }
        super.A1(task);
    }

    @Override // mv.AbstractC15816n0
    protected void n1(long now, AbstractC15814m0.c delayedTask) {
        n2();
    }

    @Override // mv.AbstractC15814m0, mv.Y
    public InterfaceC15804h0 w(long timeMillis, Runnable block, CoroutineContext context) {
        return W1(timeMillis, block);
    }
}
