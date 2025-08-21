package com.scandit.datacapture.barcode.selection.internal.module.ui.overlay;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayStyle;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeSelectionBasicOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeSelectionBasicOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124796a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        private native void native_clearSelectedBarcodeBrushes(long j10);

        private native NativeBrush native_getAimedBrush(long j10);

        private native NativeColor native_getFreezeOverlayColor(long j10);

        private native NativeBrush native_getSelectedBrush(long j10);

        private native NativeBrush native_getSelectingBrush(long j10);

        private native boolean native_getShouldShowScanAreaGuides(long j10);

        private native boolean native_getShowHints(long j10);

        private native BarcodeSelectionBasicOverlayStyle native_getStyle(long j10);

        private native NativeBrush native_getTrackedBrush(long j10);

        private native void native_onErrorFeedbackEmitted(long j10);

        private native void native_setAimedBarcodeBrushProvider(long j10, NativeBarcodeSelectionBrushProvider nativeBarcodeSelectionBrushProvider);

        private native void native_setAimedBrush(long j10, NativeBrush nativeBrush);

        private native void native_setBrushForErrorBarcodes(long j10, NativeBrush nativeBrush);

        private native void native_setEnableAccuracyContinuousMode(long j10, boolean z10);

        private native void native_setFreezeOverlayColor(long j10, NativeColor nativeColor);

        private native void native_setProfilingOverlay(long j10, NativeProfilingOverlay nativeProfilingOverlay);

        private native void native_setSelectedBrush(long j10, NativeBrush nativeBrush);

        private native void native_setSelectingBrush(long j10, NativeBrush nativeBrush);

        private native void native_setShouldShowScanAreaGuides(long j10, boolean z10);

        private native void native_setShowHints(long j10, boolean z10);

        private native void native_setTextForAimToSelectAutoHint(long j10, String str);

        private native void native_setTextForDoubleTapToUnfreezeHint(long j10, String str);

        private native void native_setTextForSelectOrDoubleTapToFreezeHint(long j10, String str);

        private native void native_setTextForTapAnywhereToSelectHint(long j10, String str);

        private native void native_setTextForTapToSelectHint(long j10, String str);

        private native void native_setTrackedBarcodeBrushProvider(long j10, NativeBarcodeSelectionBrushProvider nativeBarcodeSelectionBrushProvider);

        private native void native_setTrackedBrush(long j10, NativeBrush nativeBrush);

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void clearSelectedBarcodeBrushes() {
            native_clearSelectedBarcodeBrushes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public NativeBrush getAimedBrush() {
            return native_getAimedBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public NativeColor getFreezeOverlayColor() {
            return native_getFreezeOverlayColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public NativeBrush getSelectedBrush() {
            return native_getSelectedBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public NativeBrush getSelectingBrush() {
            return native_getSelectingBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public boolean getShouldShowScanAreaGuides() {
            return native_getShouldShowScanAreaGuides(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public boolean getShowHints() {
            return native_getShowHints(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public BarcodeSelectionBasicOverlayStyle getStyle() {
            return native_getStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public NativeBrush getTrackedBrush() {
            return native_getTrackedBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void onErrorFeedbackEmitted() {
            native_onErrorFeedbackEmitted(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setAimedBarcodeBrushProvider(NativeBarcodeSelectionBrushProvider nativeBarcodeSelectionBrushProvider) {
            native_setAimedBarcodeBrushProvider(this.nativeRef, nativeBarcodeSelectionBrushProvider);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setAimedBrush(NativeBrush nativeBrush) {
            native_setAimedBrush(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setBrushForErrorBarcodes(NativeBrush nativeBrush) {
            native_setBrushForErrorBarcodes(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setEnableAccuracyContinuousMode(boolean z10) {
            native_setEnableAccuracyContinuousMode(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setFreezeOverlayColor(NativeColor nativeColor) {
            native_setFreezeOverlayColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setProfilingOverlay(NativeProfilingOverlay nativeProfilingOverlay) {
            native_setProfilingOverlay(this.nativeRef, nativeProfilingOverlay);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setSelectedBrush(NativeBrush nativeBrush) {
            native_setSelectedBrush(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setSelectingBrush(NativeBrush nativeBrush) {
            native_setSelectingBrush(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setShouldShowScanAreaGuides(boolean z10) {
            native_setShouldShowScanAreaGuides(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setShowHints(boolean z10) {
            native_setShowHints(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setTextForAimToSelectAutoHint(String str) {
            native_setTextForAimToSelectAutoHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setTextForDoubleTapToUnfreezeHint(String str) {
            native_setTextForDoubleTapToUnfreezeHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setTextForSelectOrDoubleTapToFreezeHint(String str) {
            native_setTextForSelectOrDoubleTapToFreezeHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setTextForTapAnywhereToSelectHint(String str) {
            native_setTextForTapAnywhereToSelectHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setTextForTapToSelectHint(String str) {
            native_setTextForTapToSelectHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setTrackedBarcodeBrushProvider(NativeBarcodeSelectionBrushProvider nativeBarcodeSelectionBrushProvider) {
            native_setTrackedBarcodeBrushProvider(this.nativeRef, nativeBarcodeSelectionBrushProvider);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay
        public void setTrackedBrush(NativeBrush nativeBrush) {
            native_setTrackedBrush(this.nativeRef, nativeBrush);
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

    public static native NativeBarcodeSelectionBasicOverlay create(NativeBarcodeSelection nativeBarcodeSelection, NativeViewfinder nativeViewfinder, BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle);

    public static native NativeBarcodeSelectionBasicOverlay createWithDefaultStyle(NativeBarcodeSelection nativeBarcodeSelection, NativeViewfinder nativeViewfinder);

    public static native NativeBrush defaultAimedBrush();

    public static native NativeBrush defaultSelectedBrush();

    public static native NativeBrush defaultSelectingBrush();

    public static native NativeBrush defaultTrackedBrush();

    public static native NativeBrush getDefaultAimedBrushForStyle(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle);

    public static native NativeBrush getDefaultSelectedBrushForStyle(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle);

    public static native NativeBrush getDefaultSelectingBrushForStyle(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle);

    public static native NativeBrush getDefaultTrackedBrushForStyle(BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyle);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract void clearSelectedBarcodeBrushes();

    public abstract NativeBrush getAimedBrush();

    public abstract NativeColor getFreezeOverlayColor();

    public abstract NativeBrush getSelectedBrush();

    public abstract NativeBrush getSelectingBrush();

    public abstract boolean getShouldShowScanAreaGuides();

    public abstract boolean getShowHints();

    public abstract BarcodeSelectionBasicOverlayStyle getStyle();

    public abstract NativeBrush getTrackedBrush();

    public abstract void onErrorFeedbackEmitted();

    public abstract void setAimedBarcodeBrushProvider(NativeBarcodeSelectionBrushProvider nativeBarcodeSelectionBrushProvider);

    public abstract void setAimedBrush(NativeBrush nativeBrush);

    public abstract void setBrushForErrorBarcodes(NativeBrush nativeBrush);

    public abstract void setEnableAccuracyContinuousMode(boolean z10);

    public abstract void setFreezeOverlayColor(NativeColor nativeColor);

    public abstract void setProfilingOverlay(NativeProfilingOverlay nativeProfilingOverlay);

    public abstract void setSelectedBrush(NativeBrush nativeBrush);

    public abstract void setSelectingBrush(NativeBrush nativeBrush);

    public abstract void setShouldShowScanAreaGuides(boolean z10);

    public abstract void setShowHints(boolean z10);

    public abstract void setTextForAimToSelectAutoHint(String str);

    public abstract void setTextForDoubleTapToUnfreezeHint(String str);

    public abstract void setTextForSelectOrDoubleTapToFreezeHint(String str);

    public abstract void setTextForTapAnywhereToSelectHint(String str);

    public abstract void setTextForTapToSelectHint(String str);

    public abstract void setTrackedBarcodeBrushProvider(NativeBarcodeSelectionBrushProvider nativeBarcodeSelectionBrushProvider);

    public abstract void setTrackedBrush(NativeBrush nativeBrush);
}
