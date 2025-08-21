package com.scandit.datacapture.barcode.spark.internal.module.ui;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScanOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124863a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        private native void native_enableSingleScanMode(long j10, boolean z10);

        private native NativeBrush native_getBrushForRecognizedBarcodes(long j10);

        private native boolean native_getShouldDrawViewFinder(long j10);

        private native boolean native_getShouldShowScanAreaGuides(long j10);

        private native NativeSparkScanOverlayStyle native_getStyle(long j10);

        private native void native_hideMiniPreview(long j10);

        private native void native_onErrorFeedbackEmitted(long j10, boolean z10);

        private native void native_setBrushForErrorBarcodes(long j10, NativeBrush nativeBrush);

        private native void native_setBrushForLocalizedOnlyBarcodes(long j10, NativeBrush nativeBrush);

        private native void native_setBrushForRecognizedBarcodes(long j10, NativeBrush nativeBrush);

        private native void native_setShouldDrawViewFinder(long j10, boolean z10);

        private native void native_setShouldShowScanAreaGuides(long j10, boolean z10);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public void enableSingleScanMode(boolean z10) {
            native_enableSingleScanMode(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public NativeBrush getBrushForRecognizedBarcodes() {
            return native_getBrushForRecognizedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public boolean getShouldDrawViewFinder() {
            return native_getShouldDrawViewFinder(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public boolean getShouldShowScanAreaGuides() {
            return native_getShouldShowScanAreaGuides(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public NativeSparkScanOverlayStyle getStyle() {
            return native_getStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public void hideMiniPreview() {
            native_hideMiniPreview(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public void onErrorFeedbackEmitted(boolean z10) {
            native_onErrorFeedbackEmitted(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public void setBrushForErrorBarcodes(NativeBrush nativeBrush) {
            native_setBrushForErrorBarcodes(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public void setBrushForLocalizedOnlyBarcodes(NativeBrush nativeBrush) {
            native_setBrushForLocalizedOnlyBarcodes(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public void setBrushForRecognizedBarcodes(NativeBrush nativeBrush) {
            native_setBrushForRecognizedBarcodes(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
        public void setShouldDrawViewFinder(boolean z10) {
            native_setShouldDrawViewFinder(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay
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

    public static native NativeSparkScanOverlay create(NativeSparkScan nativeSparkScan, NativeSparkScanOverlayStyle nativeSparkScanOverlayStyle);

    public static native NativeSparkScanOverlay createWithDefaultStyle(NativeSparkScan nativeSparkScan);

    public static native NativeBrush defaultBrushForLocalizedOnlyBarcodes();

    public static native NativeBrush defaultBrushForRecognizedBarcodes();

    public static native NativeBrush getDefaultBrushForStyle(NativeSparkScanOverlayStyle nativeSparkScanOverlayStyle);

    public static native NativeBrush getDefaultErrorBrushForStyle(NativeSparkScanOverlayStyle nativeSparkScanOverlayStyle);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract void enableSingleScanMode(boolean z10);

    public abstract NativeBrush getBrushForRecognizedBarcodes();

    public abstract boolean getShouldDrawViewFinder();

    public abstract boolean getShouldShowScanAreaGuides();

    public abstract NativeSparkScanOverlayStyle getStyle();

    public abstract void hideMiniPreview();

    public abstract void onErrorFeedbackEmitted(boolean z10);

    public abstract void setBrushForErrorBarcodes(NativeBrush nativeBrush);

    public abstract void setBrushForLocalizedOnlyBarcodes(NativeBrush nativeBrush);

    public abstract void setBrushForRecognizedBarcodes(NativeBrush nativeBrush);

    public abstract void setShouldDrawViewFinder(boolean z10);

    public abstract void setShouldShowScanAreaGuides(boolean z10);
}
