package com.scandit.datacapture.barcode.batch.internal.module.ui.overlay;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeTrackingBasicOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeTrackingBasicOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f120484a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        private native void native_clearTrackedBarcodeBrushes(long j10);

        private native boolean native_getBoolProperty(long j10, String str);

        private native NativeBrush native_getDefaultBrush(long j10);

        private native NativeBarcodeTrackingBasicOverlayListener native_getListener(long j10);

        private native boolean native_getShouldShowScanAreaGuides(long j10);

        private native NativeBarcodeTrackingBasicOverlayStyle native_getStyle(long j10);

        private native void native_setBoolProperty(long j10, String str, boolean z10);

        private native void native_setDefaultBrush(long j10, NativeBrush nativeBrush);

        private native void native_setListener(long j10, NativeBarcodeTrackingBasicOverlayListener nativeBarcodeTrackingBasicOverlayListener);

        private native void native_setProfilingOverlay(long j10, NativeProfilingOverlay nativeProfilingOverlay);

        private native void native_setShouldShowScanAreaGuides(long j10, boolean z10);

        private native void native_setTrackedBarcodeBrush(long j10, NativeTrackedBarcode nativeTrackedBarcode, NativeBrush nativeBrush);

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public void clearTrackedBarcodeBrushes() {
            native_clearTrackedBarcodeBrushes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public boolean getBoolProperty(String str) {
            return native_getBoolProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public NativeBrush getDefaultBrush() {
            return native_getDefaultBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public NativeBarcodeTrackingBasicOverlayListener getListener() {
            return native_getListener(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public boolean getShouldShowScanAreaGuides() {
            return native_getShouldShowScanAreaGuides(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public NativeBarcodeTrackingBasicOverlayStyle getStyle() {
            return native_getStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public void setBoolProperty(String str, boolean z10) {
            native_setBoolProperty(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public void setDefaultBrush(NativeBrush nativeBrush) {
            native_setDefaultBrush(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public void setListener(NativeBarcodeTrackingBasicOverlayListener nativeBarcodeTrackingBasicOverlayListener) {
            native_setListener(this.nativeRef, nativeBarcodeTrackingBasicOverlayListener);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public void setProfilingOverlay(NativeProfilingOverlay nativeProfilingOverlay) {
            native_setProfilingOverlay(this.nativeRef, nativeProfilingOverlay);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public void setShouldShowScanAreaGuides(boolean z10) {
            native_setShouldShowScanAreaGuides(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay
        public void setTrackedBarcodeBrush(NativeTrackedBarcode nativeTrackedBarcode, NativeBrush nativeBrush) {
            native_setTrackedBarcodeBrush(this.nativeRef, nativeTrackedBarcode, nativeBrush);
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

    public static native NativeBarcodeTrackingBasicOverlay create(NativeBarcodeTracking nativeBarcodeTracking, NativeBarcodeTrackingBasicOverlayStyle nativeBarcodeTrackingBasicOverlayStyle);

    public static native NativeBarcodeTrackingBasicOverlay createWithDefaultStyle(NativeBarcodeTracking nativeBarcodeTracking);

    public static native NativeBrush defaultBrush();

    public static native NativeBrush getDefaultBrushForStyle(NativeBarcodeTrackingBasicOverlayStyle nativeBarcodeTrackingBasicOverlayStyle);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract void clearTrackedBarcodeBrushes();

    public abstract boolean getBoolProperty(String str);

    public abstract NativeBrush getDefaultBrush();

    public abstract NativeBarcodeTrackingBasicOverlayListener getListener();

    public abstract boolean getShouldShowScanAreaGuides();

    public abstract NativeBarcodeTrackingBasicOverlayStyle getStyle();

    public abstract void setBoolProperty(String str, boolean z10);

    public abstract void setDefaultBrush(NativeBrush nativeBrush);

    public abstract void setListener(NativeBarcodeTrackingBasicOverlayListener nativeBarcodeTrackingBasicOverlayListener);

    public abstract void setProfilingOverlay(NativeProfilingOverlay nativeProfilingOverlay);

    public abstract void setShouldShowScanAreaGuides(boolean z10);

    public abstract void setTrackedBarcodeBrush(NativeTrackedBarcode nativeTrackedBarcode, NativeBrush nativeBrush);
}
