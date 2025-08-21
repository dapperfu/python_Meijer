package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeProfilingOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountBasicOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountBasicOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121661a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_applyNotInListActionSettings(long j10, NativeBarcodeCountNotInListActionSettings nativeBarcodeCountNotInListActionSettings);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        private native NativeBarcodeClusterLiveEditor native_beginClusterEditing(long j10);

        private native NativeBrush native_brushForAcceptedBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native NativeBrush native_brushForRejectedBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native NativeBrush native_brushForTrackedBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native NativeBrush native_brushForTrackedBarcodeNotInList(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native NativeBrush native_brushForUnscannedTrackedBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_clearHighlightsButtonPressed(long j10);

        private native void native_didAcceptNotInListBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_didCancelNotInListBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_didRejectNotInListBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_didTapAcceptedBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_didTapCluster(long j10, NativeCluster nativeCluster);

        private native void native_didTapFilteredBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_didTapNotInListBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_didTapRejectedBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_didTapScannedBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_didTapUnscannedBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_exitButtonPressed(long j10);

        private native NativeBrush native_getAcceptedBrush(long j10);

        private native NativeBarcodeCountBasicOverlayColorScheme native_getColorScheme(long j10);

        private native NativeBarcodeFilterOverlaySettings native_getFilterSettings(long j10);

        private native NativeBrush native_getNotInListBrush(long j10);

        private native NativeBrush native_getRejectedBrush(long j10);

        private native NativeBrush native_getScannedBrush(long j10);

        private native NativeBarcodeCountBasicOverlayStyle native_getStyle(long j10);

        private native String native_getTextForMoveCloserAndRescanHint(long j10);

        private native String native_getTextForMoveFurtherAndRescanHint(long j10);

        private native String native_getTextForRescanYellowCodesHint(long j10);

        private native String native_getTextForScanningHint(long j10);

        private native String native_getTextForScreenCleanedUpHint(long j10);

        private native String native_getTextForSwipeToGroupHint(long j10);

        private native String native_getTextForTapShutterToScanHint(long j10);

        private native String native_getTextForTapToUncountHint(long j10);

        private native String native_getTextForUnscannedBarcodesDetectedHint(long j10);

        private native String native_getTextForWrongBarcodesDetectedHint(long j10);

        private native NativeBrush native_getUnscannedBrush(long j10);

        private native boolean native_isHintsEnabled(long j10);

        private native void native_listButtonPressed(long j10);

        private native void native_setAcceptedBrush(long j10, NativeBrush nativeBrush);

        private native void native_setColorScheme(long j10, NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme);

        private native void native_setFilterSettings(long j10, NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings);

        private native void native_setGuidanceHandler(long j10, NativeBarcodeCountGuidanceHandler nativeBarcodeCountGuidanceHandler);

        private native void native_setHintsEnabled(long j10, boolean z10);

        private native void native_setListener(long j10, NativeBarcodeCountBasicOverlayListener nativeBarcodeCountBasicOverlayListener);

        private native void native_setNotInListBrush(long j10, NativeBrush nativeBrush);

        private native void native_setProfilingOverlay(long j10, NativeProfilingOverlay nativeProfilingOverlay);

        private native void native_setRejectedBrush(long j10, NativeBrush nativeBrush);

        private native void native_setScannedBrush(long j10, NativeBrush nativeBrush);

        private native void native_setShouldShowScanAreaGuides(long j10, boolean z10);

        private native void native_setShouldShowStatusIconsOnScan(long j10, boolean z10);

        private native void native_setStatusModeEnabled(long j10, boolean z10);

        private native void native_setTextForMoveCloserAndRescanHint(long j10, String str);

        private native void native_setTextForMoveFurtherAndRescanHint(long j10, String str);

        private native void native_setTextForRescanYellowCodesHint(long j10, String str);

        private native void native_setTextForScanningHint(long j10, String str);

        private native void native_setTextForScreenCleanedUpHint(long j10, String str);

        private native void native_setTextForSwipeToGroupHint(long j10, String str);

        private native void native_setTextForTapShutterToScanHint(long j10, String str);

        private native void native_setTextForTapToUncountHint(long j10, String str);

        private native void native_setTextForUnscannedBarcodesDetectedHint(long j10, String str);

        private native void native_setTextForWrongBarcodesDetectedHint(long j10, String str);

        private native void native_setUiListener(long j10, NativeBarcodeCountBasicOverlayUiListener nativeBarcodeCountBasicOverlayUiListener);

        private native void native_setUnscannedBrush(long j10, NativeBrush nativeBrush);

        private native void native_setViewHandler(long j10, NativeBarcodeCountViewHandler nativeBarcodeCountViewHandler);

        private native boolean native_shouldShowScanAreaGuides(long j10);

        private native boolean native_shouldShowStatusIconsOnScan(long j10);

        private native void native_shutterButtonPressed(long j10);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void applyNotInListActionSettings(NativeBarcodeCountNotInListActionSettings nativeBarcodeCountNotInListActionSettings) {
            native_applyNotInListActionSettings(this.nativeRef, nativeBarcodeCountNotInListActionSettings);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBarcodeClusterLiveEditor beginClusterEditing() {
            return native_beginClusterEditing(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush brushForAcceptedBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            return native_brushForAcceptedBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush brushForRejectedBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            return native_brushForRejectedBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush brushForTrackedBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            return native_brushForTrackedBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush brushForTrackedBarcodeNotInList(NativeTrackedBarcode nativeTrackedBarcode) {
            return native_brushForTrackedBarcodeNotInList(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush brushForUnscannedTrackedBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            return native_brushForUnscannedTrackedBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void clearHighlightsButtonPressed() {
            native_clearHighlightsButtonPressed(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didAcceptNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didAcceptNotInListBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didCancelNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didCancelNotInListBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didRejectNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didRejectNotInListBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didTapAcceptedBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didTapAcceptedBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didTapCluster(NativeCluster nativeCluster) {
            native_didTapCluster(this.nativeRef, nativeCluster);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didTapFilteredBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didTapFilteredBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didTapNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didTapNotInListBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didTapRejectedBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didTapRejectedBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didTapScannedBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didTapScannedBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void didTapUnscannedBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didTapUnscannedBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void exitButtonPressed() {
            native_exitButtonPressed(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush getAcceptedBrush() {
            return native_getAcceptedBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBarcodeCountBasicOverlayColorScheme getColorScheme() {
            return native_getColorScheme(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBarcodeFilterOverlaySettings getFilterSettings() {
            return native_getFilterSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush getNotInListBrush() {
            return native_getNotInListBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush getRejectedBrush() {
            return native_getRejectedBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush getScannedBrush() {
            return native_getScannedBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBarcodeCountBasicOverlayStyle getStyle() {
            return native_getStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForMoveCloserAndRescanHint() {
            return native_getTextForMoveCloserAndRescanHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForMoveFurtherAndRescanHint() {
            return native_getTextForMoveFurtherAndRescanHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForRescanYellowCodesHint() {
            return native_getTextForRescanYellowCodesHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForScanningHint() {
            return native_getTextForScanningHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForScreenCleanedUpHint() {
            return native_getTextForScreenCleanedUpHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForSwipeToGroupHint() {
            return native_getTextForSwipeToGroupHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForTapShutterToScanHint() {
            return native_getTextForTapShutterToScanHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForTapToUncountHint() {
            return native_getTextForTapToUncountHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForUnscannedBarcodesDetectedHint() {
            return native_getTextForUnscannedBarcodesDetectedHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public String getTextForWrongBarcodesDetectedHint() {
            return native_getTextForWrongBarcodesDetectedHint(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public NativeBrush getUnscannedBrush() {
            return native_getUnscannedBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public boolean isHintsEnabled() {
            return native_isHintsEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void listButtonPressed() {
            native_listButtonPressed(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setAcceptedBrush(NativeBrush nativeBrush) {
            native_setAcceptedBrush(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setColorScheme(NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme) {
            native_setColorScheme(this.nativeRef, nativeBarcodeCountBasicOverlayColorScheme);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setFilterSettings(NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings) {
            native_setFilterSettings(this.nativeRef, nativeBarcodeFilterOverlaySettings);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setGuidanceHandler(NativeBarcodeCountGuidanceHandler nativeBarcodeCountGuidanceHandler) {
            native_setGuidanceHandler(this.nativeRef, nativeBarcodeCountGuidanceHandler);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setHintsEnabled(boolean z10) {
            native_setHintsEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setListener(NativeBarcodeCountBasicOverlayListener nativeBarcodeCountBasicOverlayListener) {
            native_setListener(this.nativeRef, nativeBarcodeCountBasicOverlayListener);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setNotInListBrush(NativeBrush nativeBrush) {
            native_setNotInListBrush(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setProfilingOverlay(NativeProfilingOverlay nativeProfilingOverlay) {
            native_setProfilingOverlay(this.nativeRef, nativeProfilingOverlay);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setRejectedBrush(NativeBrush nativeBrush) {
            native_setRejectedBrush(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setScannedBrush(NativeBrush nativeBrush) {
            native_setScannedBrush(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setShouldShowScanAreaGuides(boolean z10) {
            native_setShouldShowScanAreaGuides(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setShouldShowStatusIconsOnScan(boolean z10) {
            native_setShouldShowStatusIconsOnScan(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setStatusModeEnabled(boolean z10) {
            native_setStatusModeEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForMoveCloserAndRescanHint(String str) {
            native_setTextForMoveCloserAndRescanHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForMoveFurtherAndRescanHint(String str) {
            native_setTextForMoveFurtherAndRescanHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForRescanYellowCodesHint(String str) {
            native_setTextForRescanYellowCodesHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForScanningHint(String str) {
            native_setTextForScanningHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForScreenCleanedUpHint(String str) {
            native_setTextForScreenCleanedUpHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForSwipeToGroupHint(String str) {
            native_setTextForSwipeToGroupHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForTapShutterToScanHint(String str) {
            native_setTextForTapShutterToScanHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForTapToUncountHint(String str) {
            native_setTextForTapToUncountHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForUnscannedBarcodesDetectedHint(String str) {
            native_setTextForUnscannedBarcodesDetectedHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setTextForWrongBarcodesDetectedHint(String str) {
            native_setTextForWrongBarcodesDetectedHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setUiListener(NativeBarcodeCountBasicOverlayUiListener nativeBarcodeCountBasicOverlayUiListener) {
            native_setUiListener(this.nativeRef, nativeBarcodeCountBasicOverlayUiListener);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setUnscannedBrush(NativeBrush nativeBrush) {
            native_setUnscannedBrush(this.nativeRef, nativeBrush);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void setViewHandler(NativeBarcodeCountViewHandler nativeBarcodeCountViewHandler) {
            native_setViewHandler(this.nativeRef, nativeBarcodeCountViewHandler);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public boolean shouldShowScanAreaGuides() {
            return native_shouldShowScanAreaGuides(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public boolean shouldShowStatusIconsOnScan() {
            return native_shouldShowStatusIconsOnScan(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay
        public void shutterButtonPressed() {
            native_shutterButtonPressed(this.nativeRef);
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

    public static native NativeBarcodeCountBasicOverlay create(NativeBarcodeCount nativeBarcodeCount, NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyle);

    public static native NativeBrush defaultBrushForAcceptedBarcode();

    public static native NativeBrush defaultBrushForRejectedBarcode();

    public static native NativeBrush defaultBrushForTrackedBarcode();

    public static native NativeBrush defaultBrushForTrackedBarcodeNotInList();

    public static native NativeBrush defaultBrushForUnscannedTrackedBarcode();

    public abstract void applyNotInListActionSettings(NativeBarcodeCountNotInListActionSettings nativeBarcodeCountNotInListActionSettings);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract NativeBarcodeClusterLiveEditor beginClusterEditing();

    public abstract NativeBrush brushForAcceptedBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract NativeBrush brushForRejectedBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract NativeBrush brushForTrackedBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract NativeBrush brushForTrackedBarcodeNotInList(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract NativeBrush brushForUnscannedTrackedBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void clearHighlightsButtonPressed();

    public abstract void didAcceptNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void didCancelNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void didRejectNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void didTapAcceptedBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void didTapCluster(NativeCluster nativeCluster);

    public abstract void didTapFilteredBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void didTapNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void didTapRejectedBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void didTapScannedBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void didTapUnscannedBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void exitButtonPressed();

    public abstract NativeBrush getAcceptedBrush();

    public abstract NativeBarcodeCountBasicOverlayColorScheme getColorScheme();

    public abstract NativeBarcodeFilterOverlaySettings getFilterSettings();

    public abstract NativeBrush getNotInListBrush();

    public abstract NativeBrush getRejectedBrush();

    public abstract NativeBrush getScannedBrush();

    public abstract NativeBarcodeCountBasicOverlayStyle getStyle();

    public abstract String getTextForMoveCloserAndRescanHint();

    public abstract String getTextForMoveFurtherAndRescanHint();

    public abstract String getTextForRescanYellowCodesHint();

    public abstract String getTextForScanningHint();

    public abstract String getTextForScreenCleanedUpHint();

    public abstract String getTextForSwipeToGroupHint();

    public abstract String getTextForTapShutterToScanHint();

    public abstract String getTextForTapToUncountHint();

    public abstract String getTextForUnscannedBarcodesDetectedHint();

    public abstract String getTextForWrongBarcodesDetectedHint();

    public abstract NativeBrush getUnscannedBrush();

    public abstract boolean isHintsEnabled();

    public abstract void listButtonPressed();

    public abstract void setAcceptedBrush(NativeBrush nativeBrush);

    public abstract void setColorScheme(NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme);

    public abstract void setFilterSettings(NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings);

    public abstract void setGuidanceHandler(NativeBarcodeCountGuidanceHandler nativeBarcodeCountGuidanceHandler);

    public abstract void setHintsEnabled(boolean z10);

    public abstract void setListener(NativeBarcodeCountBasicOverlayListener nativeBarcodeCountBasicOverlayListener);

    public abstract void setNotInListBrush(NativeBrush nativeBrush);

    public abstract void setProfilingOverlay(NativeProfilingOverlay nativeProfilingOverlay);

    public abstract void setRejectedBrush(NativeBrush nativeBrush);

    public abstract void setScannedBrush(NativeBrush nativeBrush);

    public abstract void setShouldShowScanAreaGuides(boolean z10);

    public abstract void setShouldShowStatusIconsOnScan(boolean z10);

    public abstract void setStatusModeEnabled(boolean z10);

    public abstract void setTextForMoveCloserAndRescanHint(String str);

    public abstract void setTextForMoveFurtherAndRescanHint(String str);

    public abstract void setTextForRescanYellowCodesHint(String str);

    public abstract void setTextForScanningHint(String str);

    public abstract void setTextForScreenCleanedUpHint(String str);

    public abstract void setTextForSwipeToGroupHint(String str);

    public abstract void setTextForTapShutterToScanHint(String str);

    public abstract void setTextForTapToUncountHint(String str);

    public abstract void setTextForUnscannedBarcodesDetectedHint(String str);

    public abstract void setTextForWrongBarcodesDetectedHint(String str);

    public abstract void setUiListener(NativeBarcodeCountBasicOverlayUiListener nativeBarcodeCountBasicOverlayUiListener);

    public abstract void setUnscannedBrush(NativeBrush nativeBrush);

    public abstract void setViewHandler(NativeBarcodeCountViewHandler nativeBarcodeCountViewHandler);

    public abstract boolean shouldShowScanAreaGuides();

    public abstract boolean shouldShowStatusIconsOnScan();

    public abstract void shutterButtonPressed();
}
