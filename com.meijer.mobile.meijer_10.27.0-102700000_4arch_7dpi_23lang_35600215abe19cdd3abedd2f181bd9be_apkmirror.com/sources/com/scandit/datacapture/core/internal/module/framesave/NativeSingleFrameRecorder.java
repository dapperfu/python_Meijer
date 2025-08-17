package com.scandit.datacapture.core.internal.module.framesave;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeSingleFrameRecorder {

    @DjinniGenerated
    public static final class CppProxy extends NativeSingleFrameRecorder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124617a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_saveAsync(long j10, NativeFrameData nativeFrameData, NativeDataCaptureContext nativeDataCaptureContext);

        private native void native_saveAsyncWithPrefix(long j10, String str, NativeFrameData nativeFrameData, NativeDataCaptureContext nativeDataCaptureContext);

        private native void native_waitUntilSavesAreCompleted(long j10);

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeSingleFrameRecorder
        public void saveAsync(NativeFrameData nativeFrameData, NativeDataCaptureContext nativeDataCaptureContext) {
            native_saveAsync(this.nativeRef, nativeFrameData, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeSingleFrameRecorder
        public void saveAsyncWithPrefix(String str, NativeFrameData nativeFrameData, NativeDataCaptureContext nativeDataCaptureContext) {
            native_saveAsyncWithPrefix(this.nativeRef, str, nativeFrameData, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeSingleFrameRecorder
        public void waitUntilSavesAreCompleted() {
            native_waitUntilSavesAreCompleted(this.nativeRef);
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

    public static native NativeSingleFrameRecorder create(String str);

    public abstract void saveAsync(NativeFrameData nativeFrameData, NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void saveAsyncWithPrefix(String str, NativeFrameData nativeFrameData, NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void waitUntilSavesAreCompleted();
}
