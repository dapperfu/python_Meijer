package com.scandit.datacapture.barcode.batch.internal.module.ui.overlay;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeatureAvailability;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeTrackingAdvancedOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeTrackingAdvancedOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121435a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        private native boolean native_getShouldShowScanAreaGuides(long j10);

        private native NativeFeatureAvailability native_requireArFeatureAvailabilityFromContext(long j10);

        private native void native_setShouldShowScanAreaGuides(long j10, boolean z10);

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay
        public boolean getShouldShowScanAreaGuides() {
            return native_getShouldShowScanAreaGuides(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay
        public NativeFeatureAvailability requireArFeatureAvailabilityFromContext() {
            return native_requireArFeatureAvailabilityFromContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay
        public void setShouldShowScanAreaGuides(boolean z10) {
            native_setShouldShowScanAreaGuides(this.nativeRef, z10);
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

    public static native NativeBarcodeTrackingAdvancedOverlay create(NativeBarcodeTracking nativeBarcodeTracking);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract boolean getShouldShowScanAreaGuides();

    public abstract NativeFeatureAvailability requireArFeatureAvailabilityFromContext();

    public abstract void setShouldShowScanAreaGuides(boolean z10);
}
