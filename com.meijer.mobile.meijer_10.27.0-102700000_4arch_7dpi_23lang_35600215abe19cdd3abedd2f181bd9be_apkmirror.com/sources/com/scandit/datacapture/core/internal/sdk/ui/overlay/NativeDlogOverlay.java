package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeDlogOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeDlogOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125767a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        private native void native_setGlobFilter(long j10, String str);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDlogOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDlogOverlay
        public void setGlobFilter(String str) {
            native_setGlobFilter(this.nativeRef, str);
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

    public static native NativeDlogOverlay create(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract void setGlobFilter(String str);
}
