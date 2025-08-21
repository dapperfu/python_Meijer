package com.scandit.datacapture.core.internal.sdk.common.async;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeWrappedFuture {

    @DjinniGenerated
    public static final class CppProxy extends NativeWrappedFuture {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126356a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_then(long j10, NativeBoolCallable nativeBoolCallable);

        @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture
        public void then(NativeBoolCallable nativeBoolCallable) {
            native_then(this.nativeRef, nativeBoolCallable);
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

    public abstract void then(NativeBoolCallable nativeBoolCallable);
}
