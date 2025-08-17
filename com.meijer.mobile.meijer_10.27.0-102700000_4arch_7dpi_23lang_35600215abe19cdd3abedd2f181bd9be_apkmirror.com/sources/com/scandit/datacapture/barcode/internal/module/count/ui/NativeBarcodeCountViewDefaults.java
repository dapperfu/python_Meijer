package com.scandit.datacapture.barcode.internal.module.count.ui;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeCountViewDefaults {
    public static native String clearHighlightsButtonContentDescription();

    public static native String clearHighlightsButtonText();

    public static native String exitButtonContentDescription();

    public static native String exitButtonText();

    public static native String floatingShutterButtonContentDescription();

    public static native String listButtonContentDescription();

    public static native String nextButtonContentDescription();

    public static native String nextButtonText();

    public static native String redoScanButtonContentDescription();

    public static native String redoScanButtonText();

    public static native String restartButtonContentDescription();

    public static native String restartButtonText();

    public static native boolean shouldDisableModeOnExitButtonTapped();

    public static native boolean shouldShowClearHighlightsButton();

    public static native boolean shouldShowExitButton();

    public static native boolean shouldShowFloatingShutterButton();

    public static native boolean shouldShowHints();

    public static native boolean shouldShowListButton();

    public static native boolean shouldShowListProgressBar();

    public static native boolean shouldShowScanAreaGuides();

    public static native boolean shouldShowShutterButton();

    public static native boolean shouldShowSingleScanButton();

    public static native boolean shouldShowStatusIconsOnScan();

    public static native boolean shouldShowStatusModeButton();

    public static native boolean shouldShowToolbar();

    public static native boolean shouldShowTorchControl();

    public static native boolean shouldShowUserGuidanceView();

    public static native String shutterButtonContentDescription();

    public static native String singleScanButtonContentDescription();

    public static native String statusModeButtonContentDescription();

    public static native NativeBarcodeCountBasicOverlayStyle style();

    public static native String textForBarcodesNotInListDetectedHint();

    public static native String textForItemAcceptedHint();

    public static native String textForItemRejectedHint();

    public static native String textForMappingFlowScanBarcodesGuidance();

    public static native String textForMappingFlowStepBackGuidance();

    public static native String textForMoveCloserAndRescanHint();

    public static native String textForMoveFurtherAndRescanHint();

    public static native String textForRescanYellowCodesToGroupHint();

    public static native String textForScanningHint();

    public static native String textForScreenCleanedUpHint();

    public static native String textForSwipeToGroupHint();

    public static native String textForTapShutterToScanHint();

    public static native String textForTapToUncountDetectedHint();

    public static native String textForUnrecognizedBarcodesDetectedHint();

    public static native Anchor torchControlPosition();

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountViewDefaults {
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private CppProxy(long j10) {
            new AtomicBoolean(false);
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }
}
