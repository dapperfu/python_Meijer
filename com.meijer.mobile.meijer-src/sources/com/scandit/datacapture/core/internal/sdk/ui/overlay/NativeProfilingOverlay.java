package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeProfilingOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeProfilingOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126720a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeProfilingOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
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

    public static native NativeProfilingOverlay create(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();
}
