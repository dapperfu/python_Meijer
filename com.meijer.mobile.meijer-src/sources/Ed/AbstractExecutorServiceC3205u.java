package Ed;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: Ed.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractExecutorServiceC3205u extends c0 implements ExecutorService {
    protected abstract ExecutorService b();

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) throws InterruptedException {
        return b().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) throws ExecutionException, InterruptedException {
        return b().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return b().submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return b().invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return b().invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return b().submit(runnable, obj);
    }

    protected AbstractExecutorServiceC3205u() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return b().awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return b().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return b().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return b().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return b().submit(callable);
    }
}
