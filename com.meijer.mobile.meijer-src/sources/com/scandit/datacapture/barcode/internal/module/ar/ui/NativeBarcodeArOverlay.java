package com.scandit.datacapture.barcode.internal.module.ar.ui;

import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeArOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeArOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122027a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArOverlay
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

    public static native NativeBarcodeArOverlay create();

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();
}
