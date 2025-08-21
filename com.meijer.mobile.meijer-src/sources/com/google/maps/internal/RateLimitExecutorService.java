package com.google.maps.internal;

import com.google.android.gms.common.api.a;
import com.google.maps.internal.ratelimiter.RateLimiter;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mw.c;
import mw.e;

/* loaded from: classes8.dex */
public class RateLimitExecutorService implements ExecutorService, Runnable {
    private static final int DEFAULT_QUERIES_PER_SECOND = 50;
    private static final c LOG = e.k(RateLimitExecutorService.class.getName());
    final Thread delayThread;
    private final ExecutorService delegate;
    private final BlockingQueue<Runnable> queue;
    private final RateLimiter rateLimiter;

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.delegate.submit(callable);
    }

    private static ThreadFactory threadFactory(final String str, final boolean z10) {
        return new ThreadFactory() { // from class: com.google.maps.internal.RateLimitExecutorService.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z10);
                return thread;
            }
        };
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.queue.add(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegate.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        while (!this.delegate.isShutdown()) {
            try {
                this.rateLimiter.acquire();
                Runnable runnableTake = this.queue.take();
                if (!this.delegate.isShutdown()) {
                    this.delegate.execute(runnableTake);
                }
            } catch (InterruptedException e10) {
                LOG.k("Interrupted", e10);
                return;
            }
        }
    }

    public void setQueriesPerSecond(int i10) {
        this.rateLimiter.setRate(i10);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.delegate.shutdown();
        execute(new Runnable() { // from class: com.google.maps.internal.RateLimitExecutorService.2
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        List<Runnable> listShutdownNow = this.delegate.shutdownNow();
        execute(new Runnable() { // from class: com.google.maps.internal.RateLimitExecutorService.3
            @Override // java.lang.Runnable
            public void run() {
            }
        });
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.delegate.submit(runnable, t10);
    }

    public RateLimitExecutorService() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.delegate = new ThreadPoolExecutor(iAvailableProcessors, a.e.API_PRIORITY_OTHER, 60L, timeUnit, new SynchronousQueue(), threadFactory("Rate Limited Dispatcher", true));
        this.queue = new LinkedBlockingQueue();
        this.rateLimiter = RateLimiter.create(50.0d, 1L, timeUnit);
        setQueriesPerSecond(DEFAULT_QUERIES_PER_SECOND);
        Thread thread = new Thread(this);
        this.delayThread = thread;
        thread.setDaemon(true);
        thread.setName("RateLimitExecutorDelayThread");
        thread.start();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.delegate.submit(runnable);
    }
}
