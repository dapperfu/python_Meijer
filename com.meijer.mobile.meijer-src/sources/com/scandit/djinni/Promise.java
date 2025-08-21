package com.scandit.djinni;

import com.scandit.djinni.SharedState;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public class Promise<T> {
    private AtomicReference<SharedState<T>> _sharedState;
    private final SharedState<T> _sharedStateReadOnly;

    public void setValue(T t10) {
        SharedState.Continuation<T> continuation = null;
        SharedState<T> andSet = this._sharedState.getAndSet(null);
        synchronized (andSet) {
            andSet.value = t10;
            andSet.ready = true;
            SharedState.Continuation<T> continuation2 = andSet.handler;
            if (continuation2 != null) {
                continuation = continuation2;
            } else {
                andSet.notifyAll();
            }
        }
        if (continuation != null) {
            continuation.handleResult(andSet);
        }
    }

    public Future<T> getFuture() {
        return new Future<>(this._sharedStateReadOnly);
    }

    public void setException(Throwable th2) {
        SharedState.Continuation<T> continuation = null;
        SharedState<T> andSet = this._sharedState.getAndSet(null);
        synchronized (andSet) {
            andSet.exception = th2;
            SharedState.Continuation<T> continuation2 = andSet.handler;
            if (continuation2 != null) {
                continuation = continuation2;
            } else {
                andSet.notifyAll();
            }
        }
        if (continuation != null) {
            continuation.handleResult(andSet);
        }
    }

    public Promise() {
        SharedState<T> sharedState = new SharedState<>();
        this._sharedStateReadOnly = sharedState;
        this._sharedState = new AtomicReference<>(sharedState);
    }

    public void setValue() {
        setValue(null);
    }
}
