package mv;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import rv.C16964a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u00072\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lmv/t0;", "Lmv/s0;", "Lmv/Y;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "timeMillis", "Ljava/util/concurrent/ScheduledFuture;", "X0", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "", "W0", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/RejectedExecutionException;)V", "J0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "Lmv/n;", "continuation", "H0", "(JLmv/n;)V", "Lmv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lmv/h0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ljava/util/concurrent/Executor;", "U0", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.t0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15828t0 extends AbstractC15826s0 implements Y {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    private final void W0(CoroutineContext context, RejectedExecutionException exception) {
        E0.c(context, C15822q0.a("The task was rejected", exception));
    }

    private final ScheduledFuture<?> X0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            W0(coroutineContext, e10);
            return null;
        }
    }

    @Override // mv.AbstractC15826s0
    /* renamed from: U0, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    public boolean equals(Object other) {
        return (other instanceof C15828t0) && ((C15828t0) other).getExecutor() == getExecutor();
    }

    public C15828t0(Executor executor) {
        this.executor = executor;
        C16964a.a(getExecutor());
    }

    @Override // mv.Y
    public void H0(long timeMillis, InterfaceC15815n<? super Unit> continuation) {
        ScheduledExecutorService scheduledExecutorService;
        long j10;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureX0 = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            j10 = timeMillis;
            scheduledFutureX0 = X0(scheduledExecutorService, new T0(this, continuation), continuation.getContext(), j10);
        } else {
            j10 = timeMillis;
        }
        if (scheduledFutureX0 != null) {
            C15823r.c(continuation, new C15811l(scheduledFutureX0));
        } else {
            RunnableC15788U.f151695i.H0(j10, continuation);
        }
    }

    @Override // mv.AbstractC15779K
    public void J0(CoroutineContext context, Runnable block) {
        try {
            Executor executor = getExecutor();
            C15793c.a();
            executor.execute(block);
        } catch (RejectedExecutionException e10) {
            C15793c.a();
            W0(context, e10);
            C15800f0.b().J0(context, block);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor executor = getExecutor();
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // mv.AbstractC15779K
    /* renamed from: toString */
    public String getName() {
        return getExecutor().toString();
    }

    @Override // mv.Y
    public InterfaceC15804h0 w(long timeMillis, Runnable block, CoroutineContext context) {
        ScheduledExecutorService scheduledExecutorService;
        long j10;
        Runnable runnable;
        CoroutineContext coroutineContext;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureX0 = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            j10 = timeMillis;
            runnable = block;
            coroutineContext = context;
            scheduledFutureX0 = X0(scheduledExecutorService, runnable, coroutineContext, j10);
        } else {
            j10 = timeMillis;
            runnable = block;
            coroutineContext = context;
        }
        if (scheduledFutureX0 != null) {
            return new C15802g0(scheduledFutureX0);
        }
        return RunnableC15788U.f151695i.w(j10, runnable, coroutineContext);
    }
}
