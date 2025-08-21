package com.scandit.djinni;

import com.scandit.djinni.Future;
import java.util.concurrent.ExecutionException;

/* loaded from: classes12.dex */
public class NativeFutureHandler<T> implements Future.FutureHandler<T> {
    private final long mNativeFunc;
    private final long mNativePromise;

    private static native void nativeHandleResult(long j10, long j11, Object obj, Throwable th2);

    @Override // com.scandit.djinni.Future.FutureHandler
    public void handleResult(Future<T> future) throws ExecutionException, InterruptedException {
        Throwable th2;
        T t10;
        try {
            t10 = future.get();
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            t10 = null;
        }
        nativeHandleResult(this.mNativeFunc, this.mNativePromise, t10, th2);
    }

    public NativeFutureHandler(long j10, long j11) {
        this.mNativeFunc = j10;
        this.mNativePromise = j11;
    }
}
