package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeFeedback {

    @DjinniGenerated
    public static final class CppProxy extends NativeFeedback {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125391a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_emit(long j10);

        private native void native_onFreeResources(long j10);

        private native void native_onLoadResources(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
        public void emit() {
            native_emit(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
        public void onFreeResources() {
            native_onFreeResources(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
        public void onLoadResources() {
            native_onLoadResources(this.nativeRef);
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

    public abstract void emit();

    public abstract void onFreeResources();

    public abstract void onLoadResources();
}
