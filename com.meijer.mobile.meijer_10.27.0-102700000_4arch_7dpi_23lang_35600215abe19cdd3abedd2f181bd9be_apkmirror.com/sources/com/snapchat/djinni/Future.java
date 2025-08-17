package com.snapchat.djinni;

import com.snapchat.djinni.SharedState;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public class Future<T> implements java.util.concurrent.Future<T> {
    private AtomicReference<SharedState<T>> _sharedState;

    @FunctionalInterface
    public interface FutureHandler<U> {
        void handleResult(Future<U> future) throws Throwable;
    }

    @FunctionalInterface
    public interface FutureHandlerWithReturn<U, R> {
        R handleResult(Future<U> future) throws Throwable;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        T t10;
        SharedState<T> andSet = this._sharedState.getAndSet(null);
        synchronized (andSet) {
            while (!andSet.isReady()) {
                try {
                    andSet.wait(timeUnit.toMillis(j10));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (andSet.exception != null) {
                throw new ExecutionException(andSet.exception.getMessage(), andSet.exception);
            }
            t10 = andSet.value;
        }
        return t10;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    public Future<Void> then(final FutureHandler<T> futureHandler) {
        final Promise promise = new Promise();
        Future<Void> future = promise.getFuture();
        SharedState.Continuation<T> continuation = new SharedState.Continuation() { // from class: com.snapchat.djinni.b
            @Override // com.snapchat.djinni.SharedState.Continuation
            public final void handleResult(SharedState sharedState) {
                Future.a(futureHandler, promise, sharedState);
            }
        };
        SharedState<T> sharedState = null;
        SharedState<T> andSet = this._sharedState.getAndSet(null);
        synchronized (andSet) {
            if (andSet.isReady()) {
                sharedState = andSet;
            } else {
                andSet.handler = continuation;
            }
        }
        if (sharedState != null) {
            continuation.handleResult(sharedState);
        }
        return future;
    }

    public static /* synthetic */ void a(FutureHandler futureHandler, Promise promise, SharedState sharedState) {
        try {
            futureHandler.handleResult(new Future(sharedState));
            promise.setValue(null);
        } catch (Throwable th2) {
            promise.setException(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(Promise promise, FutureHandlerWithReturn futureHandlerWithReturn, SharedState sharedState) {
        try {
            promise.setValue(futureHandlerWithReturn.handleResult(new Future(sharedState)));
        } catch (Throwable th2) {
            promise.setException(th2);
        }
    }

    public boolean isReady() {
        boolean zIsReady;
        SharedState<T> sharedState = this._sharedState.get();
        synchronized (sharedState) {
            zIsReady = sharedState.isReady();
        }
        return zIsReady;
    }

    Future(SharedState<T> sharedState) {
        this._sharedState = new AtomicReference<>(sharedState);
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return isReady();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        try {
            return get(0L, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return null;
        }
    }

    public <R> Future<R> then(final FutureHandlerWithReturn<T, R> futureHandlerWithReturn) {
        final Promise promise = new Promise();
        Future<R> future = promise.getFuture();
        SharedState.Continuation<T> continuation = new SharedState.Continuation() { // from class: com.snapchat.djinni.a
            @Override // com.snapchat.djinni.SharedState.Continuation
            public final void handleResult(SharedState sharedState) {
                Future.b(promise, futureHandlerWithReturn, sharedState);
            }
        };
        SharedState<T> sharedState = null;
        SharedState<T> andSet = this._sharedState.getAndSet(null);
        synchronized (andSet) {
            if (andSet.isReady()) {
                sharedState = andSet;
            } else {
                andSet.handler = continuation;
            }
        }
        if (sharedState != null) {
            continuation.handleResult(sharedState);
        }
        return future;
    }
}
