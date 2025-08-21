package com.scandit.datacapture.core.internal.sdk.common.async;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeWrappedPromise {

    @DjinniGenerated
    public static final class CppProxy extends NativeWrappedPromise {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126357a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native boolean native_hasValue(long j10);

        private native void native_setDone(long j10);

        private native void native_setError(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise
        public boolean hasValue() {
            return native_hasValue(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise
        public void setDone() {
            native_setDone(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise
        public void setError() {
            native_setError(this.nativeRef);
        }

        private CppProxy(long j10) {
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }

    public abstract boolean hasValue();

    public abstract void setDone();

    public abstract void setError();
}
