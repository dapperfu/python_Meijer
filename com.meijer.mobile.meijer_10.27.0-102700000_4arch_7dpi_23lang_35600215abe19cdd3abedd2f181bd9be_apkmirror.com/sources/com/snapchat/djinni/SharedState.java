package com.snapchat.djinni;

/* loaded from: classes11.dex */
class SharedState<T> {
    public Throwable exception;
    public Continuation<T> handler;
    public boolean ready = false;
    public T value;

    public interface Continuation<U> {
        void handleResult(SharedState<U> sharedState);
    }

    public boolean isReady() {
        return this.ready || this.exception != null;
    }

    SharedState() {
    }
}
