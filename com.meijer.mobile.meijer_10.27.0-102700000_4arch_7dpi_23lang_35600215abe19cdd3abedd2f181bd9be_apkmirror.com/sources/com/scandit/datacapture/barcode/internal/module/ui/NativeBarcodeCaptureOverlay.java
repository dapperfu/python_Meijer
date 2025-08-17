package com.scandit.datacapture.barcode.internal.module.ui;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.ui.overlay.NativeBarcodeCaptureOverlayStyle;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeCaptureOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCaptureOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123289a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        private native NativeBrush native_getBrushForRecognizedBarcodes(long j10);

        private native boolean native_getShouldShowScanAreaGuides(long j10);

        private native NativeBarcodeCaptureOverlayStyle native_getStyle(long j10);

        private native NativeViewfinder native_getViewfinder(long j10);

        private native void native_setBrushForLocalizedOnlyBarcodes(long j10, NativeBrush nativeBrush);

        private native void native_setBrushForRecognizedBarcodes(long j10, NativeBrush nativeBrush);

        private native void native_setShouldDrawLocalizedOnlyBarcodes(long j10, boolean z10);

        private native void native_setShouldShowScanAreaGuides(long j10, boolean z10);

        private native void native_setViewfinder(long j10, NativeViewfinder nativeViewfinder);

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public NativeBrush getBrushForRecognizedBarcodes() {
            return native_getBrushForRecognizedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public boolean getShouldShowScanAreaGuides() {
            return native_getShouldShowScanAreaGuides(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public NativeBarcodeCaptureOverlayStyle getStyle() {
            return native_getStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public NativeViewfinder getViewfinder() {
            return native_getViewfinder(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public void setBrushForLocalizedOnlyBarcodes(NativeBrush nativeBrush) {
            native_setBrushForLocalizedOnlyBarcodes(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public void setBrushForRecognizedBarcodes(NativeBrush nativeBrush) {
            native_setBrushForRecognizedBarcodes(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public void setShouldDrawLocalizedOnlyBarcodes(boolean z10) {
            native_setShouldDrawLocalizedOnlyBarcodes(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public void setShouldShowScanAreaGuides(boolean z10) {
            native_setShouldShowScanAreaGuides(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay
        public void setViewfinder(NativeViewfinder nativeViewfinder) {
            native_setViewfinder(this.nativeRef, nativeViewfinder);
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

    public static native NativeBarcodeCaptureOverlay create(NativeBarcodeCapture nativeBarcodeCapture, NativeBarcodeCaptureOverlayStyle nativeBarcodeCaptureOverlayStyle);

    public static native NativeBarcodeCaptureOverlay createWithDefaultStyle(NativeBarcodeCapture nativeBarcodeCapture);

    public static native NativeBrush defaultBrushForLocalizedOnlyBarcodes();

    public static native NativeBrush defaultBrushForRecognizedBarcodes();

    public static native NativeBrush getDefaultBrushForStyle(NativeBarcodeCaptureOverlayStyle nativeBarcodeCaptureOverlayStyle);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract NativeBrush getBrushForRecognizedBarcodes();

    public abstract boolean getShouldShowScanAreaGuides();

    public abstract NativeBarcodeCaptureOverlayStyle getStyle();

    public abstract NativeViewfinder getViewfinder();

    public abstract void setBrushForLocalizedOnlyBarcodes(NativeBrush nativeBrush);

    public abstract void setBrushForRecognizedBarcodes(NativeBrush nativeBrush);

    public abstract void setShouldDrawLocalizedOnlyBarcodes(boolean z10);

    public abstract void setShouldShowScanAreaGuides(boolean z10);

    public abstract void setViewfinder(NativeViewfinder nativeViewfinder);
}
