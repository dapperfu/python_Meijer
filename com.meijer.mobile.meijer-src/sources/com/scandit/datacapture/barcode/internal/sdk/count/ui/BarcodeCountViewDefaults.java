package com.scandit.datacapture.barcode.internal.sdk.count.ui;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyleExtensionKt;
import com.scandit.datacapture.barcode.internal.module.count.ui.NativeBarcodeCountViewDefaults;
import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\bJ\bÆ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001e\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010!\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\u0017\u0010$\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014R\u0017\u0010'\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014R\u0017\u0010*\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0014R\u0017\u0010-\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b+\u0010\u0012\u001a\u0004\b,\u0010\u0014R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b2\u0010\u0006R\u0011\u00105\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b4\u0010\u0006R\u0011\u00107\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b6\u0010\u0006R\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0011\u0010;\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010\u0006R\u0011\u0010=\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010\u0006R\u0011\u0010?\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b>\u0010\u0006R\u0011\u0010A\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b@\u0010\u0006R\u0011\u0010C\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bB\u0010\u0006R\u0011\u0010E\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bD\u0010\u0006R\u0011\u0010G\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bF\u0010\u0006R\u0011\u0010I\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010\u0006R\u0011\u0010K\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bJ\u0010\u0006R\u0011\u0010M\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u0010\u0006R\u0011\u0010O\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bN\u0010\u0014R\u0011\u0010Q\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bP\u0010\u0014R\u0011\u0010S\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bR\u0010\u0014R\u0011\u0010U\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bT\u0010\u0014R\u0011\u0010W\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bV\u0010\u0014R\u0011\u0010Y\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bX\u0010\u0014R\u0011\u0010[\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0014R\u0011\u0010]\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\\\u0010\u0014R\u0011\u0010_\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b^\u0010\u0014R\u0011\u0010a\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b`\u0010\u0014R\u0011\u0010c\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bb\u0010\u0014R\u0011\u0010e\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bd\u0010\u0014R\u0011\u0010g\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bf\u0010\u0014R\u0011\u0010i\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bh\u0010\u0014R\u0011\u0010k\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bj\u0010\u0014R\u0011\u0010m\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bl\u0010\u0014R\u0011\u0010o\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bn\u0010\u0014R\u0011\u0010q\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bp\u0010\u0014R\u0011\u0010s\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\br\u0010\u0014R\u0011\u0010u\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bt\u0010\u0014R\u0011\u0010w\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bv\u0010\u0006¨\u0006x"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/count/ui/BarcodeCountViewDefaults;", "", "", "a", "Z", "getShouldShowTorchControl", "()Z", "shouldShowTorchControl", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "b", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "getTorchControlPosition", "()Lcom/scandit/datacapture/core/common/geometry/Anchor;", "setTorchControlPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)V", "torchControlPosition", "", "c", "Ljava/lang/String;", "getNextButtonText", "()Ljava/lang/String;", "nextButtonText", "d", "getNextButtonContentDescription", "nextButtonContentDescription", "e", "getRedoScanButtonText", "redoScanButtonText", "f", "getRedoScanButtonContentDescription", "redoScanButtonContentDescription", "g", "getRestartButtonText", "restartButtonText", "h", "getRestartButtonContentDescription", "restartButtonContentDescription", "i", "getTextForMappingFlowStepBackGuidance", "textForMappingFlowStepBackGuidance", "j", "getTextForMappingFlowScanBarcodesGuidance", "textForMappingFlowScanBarcodesGuidance", "k", "getTextForScreenCleanedUpHint", "textForScreenCleanedUpHint", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "getStyle", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewStyle;", "style", "getShouldDisableModeOnExitButtonTapped", "shouldDisableModeOnExitButtonTapped", "getShouldShowClearHighlightsButton", "shouldShowClearHighlightsButton", "getShouldShowExitButton", "shouldShowExitButton", "getShouldShowFloatingShutterButton", "shouldShowFloatingShutterButton", "getShouldShowHints", "shouldShowHints", "getShouldShowListButton", "shouldShowListButton", "getShouldShowScanAreaGuides", "shouldShowScanAreaGuides", "getShouldShowShutterButton", "shouldShowShutterButton", "getShouldShowSingleScanButton", "shouldShowSingleScanButton", "getShouldShowStatusModeButton", "shouldShowStatusModeButton", "getShouldShowToolbar", "shouldShowToolbar", "getShouldShowUserGuidanceView", "shouldShowUserGuidanceView", "getShouldShowListProgressBar", "shouldShowListProgressBar", "getShouldShowStatusIconsOnScan", "shouldShowStatusIconsOnScan", "getClearHighlightsButtonText", "clearHighlightsButtonText", "getClearHighlightsButtonContentDescription", "clearHighlightsButtonContentDescription", "getExitButtonText", "exitButtonText", "getExitButtonContentDescription", "exitButtonContentDescription", "getFloatingShutterButtonContentDescription", "floatingShutterButtonContentDescription", "getListButtonContentDescription", "listButtonContentDescription", "getShutterButtonContentDescription", "shutterButtonContentDescription", "getSingleScanButtonContentDescription", "singleScanButtonContentDescription", "getStatusModeButtonContentDescription", "statusModeButtonContentDescription", "getTextForBarcodesNotInListDetectedHint", "textForBarcodesNotInListDetectedHint", "getTextForTapToUncountHint", "textForTapToUncountHint", "getTextForMoveCloserAndRescanHint", "textForMoveCloserAndRescanHint", "getTextForMoveFurtherAndRescanHint", "textForMoveFurtherAndRescanHint", "getTextForScanningHint", "textForScanningHint", "getTextForTapShutterToScanHint", "textForTapShutterToScanHint", "getTextForUnrecognizedBarcodesDetectedHint", "textForUnrecognizedBarcodesDetectedHint", "getTextForItemAcceptedHint", "textForItemAcceptedHint", "getTextForItemRejectedHint", "textForItemRejectedHint", "getTextForClusteringGestureHint", "textForClusteringGestureHint", "getTextForUnrecognizedBarcodesInClusterHint", "textForUnrecognizedBarcodesInClusterHint", "getTapToUncountEnabled", "tapToUncountEnabled", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCountViewDefaults {
    public static final BarcodeCountViewDefaults INSTANCE = new BarcodeCountViewDefaults();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final boolean shouldShowTorchControl = NativeBarcodeCountViewDefaults.shouldShowTorchControl();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Anchor torchControlPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String nextButtonText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final String nextButtonContentDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final String redoScanButtonText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final String redoScanButtonContentDescription;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final String restartButtonText;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final String restartButtonContentDescription;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final String textForMappingFlowStepBackGuidance;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final String textForMappingFlowScanBarcodesGuidance;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final String textForScreenCleanedUpHint;

    public final boolean getTapToUncountEnabled() {
        return false;
    }

    static {
        Anchor anchor = NativeBarcodeCountViewDefaults.torchControlPosition();
        Intrinsics.i(anchor, "torchControlPosition(...)");
        torchControlPosition = anchor;
        String strNextButtonText = NativeBarcodeCountViewDefaults.nextButtonText();
        Intrinsics.i(strNextButtonText, "nextButtonText(...)");
        nextButtonText = strNextButtonText;
        String strNextButtonContentDescription = NativeBarcodeCountViewDefaults.nextButtonContentDescription();
        Intrinsics.i(strNextButtonContentDescription, "nextButtonContentDescription(...)");
        nextButtonContentDescription = strNextButtonContentDescription;
        String strRedoScanButtonText = NativeBarcodeCountViewDefaults.redoScanButtonText();
        Intrinsics.i(strRedoScanButtonText, "redoScanButtonText(...)");
        redoScanButtonText = strRedoScanButtonText;
        String strRedoScanButtonContentDescription = NativeBarcodeCountViewDefaults.redoScanButtonContentDescription();
        Intrinsics.i(strRedoScanButtonContentDescription, "redoScanButtonContentDescription(...)");
        redoScanButtonContentDescription = strRedoScanButtonContentDescription;
        String strRestartButtonText = NativeBarcodeCountViewDefaults.restartButtonText();
        Intrinsics.i(strRestartButtonText, "restartButtonText(...)");
        restartButtonText = strRestartButtonText;
        String strRestartButtonContentDescription = NativeBarcodeCountViewDefaults.restartButtonContentDescription();
        Intrinsics.i(strRestartButtonContentDescription, "restartButtonContentDescription(...)");
        restartButtonContentDescription = strRestartButtonContentDescription;
        String strTextForMappingFlowStepBackGuidance = NativeBarcodeCountViewDefaults.textForMappingFlowStepBackGuidance();
        Intrinsics.i(strTextForMappingFlowStepBackGuidance, "textForMappingFlowStepBackGuidance(...)");
        textForMappingFlowStepBackGuidance = strTextForMappingFlowStepBackGuidance;
        String strTextForMappingFlowScanBarcodesGuidance = NativeBarcodeCountViewDefaults.textForMappingFlowScanBarcodesGuidance();
        Intrinsics.i(strTextForMappingFlowScanBarcodesGuidance, "textForMappingFlowScanBarcodesGuidance(...)");
        textForMappingFlowScanBarcodesGuidance = strTextForMappingFlowScanBarcodesGuidance;
        String strTextForScreenCleanedUpHint = NativeBarcodeCountViewDefaults.textForScreenCleanedUpHint();
        Intrinsics.i(strTextForScreenCleanedUpHint, "textForScreenCleanedUpHint(...)");
        textForScreenCleanedUpHint = strTextForScreenCleanedUpHint;
    }

    public final String getNextButtonContentDescription() {
        return nextButtonContentDescription;
    }

    public final String getNextButtonText() {
        return nextButtonText;
    }

    public final String getRedoScanButtonContentDescription() {
        return redoScanButtonContentDescription;
    }

    public final String getRedoScanButtonText() {
        return redoScanButtonText;
    }

    public final String getRestartButtonContentDescription() {
        return restartButtonContentDescription;
    }

    public final String getRestartButtonText() {
        return restartButtonText;
    }

    public final boolean getShouldShowTorchControl() {
        return shouldShowTorchControl;
    }

    public final String getTextForMappingFlowScanBarcodesGuidance() {
        return textForMappingFlowScanBarcodesGuidance;
    }

    public final String getTextForMappingFlowStepBackGuidance() {
        return textForMappingFlowStepBackGuidance;
    }

    public final String getTextForScreenCleanedUpHint() {
        return textForScreenCleanedUpHint;
    }

    public final Anchor getTorchControlPosition() {
        return torchControlPosition;
    }

    public final void setTorchControlPosition(Anchor anchor) {
        Intrinsics.j(anchor, "<set-?>");
        torchControlPosition = anchor;
    }

    private BarcodeCountViewDefaults() {
    }

    public final String getClearHighlightsButtonContentDescription() {
        String strClearHighlightsButtonContentDescription = NativeBarcodeCountViewDefaults.clearHighlightsButtonContentDescription();
        Intrinsics.i(strClearHighlightsButtonContentDescription, "clearHighlightsButtonContentDescription(...)");
        return strClearHighlightsButtonContentDescription;
    }

    public final String getClearHighlightsButtonText() {
        String strClearHighlightsButtonText = NativeBarcodeCountViewDefaults.clearHighlightsButtonText();
        Intrinsics.i(strClearHighlightsButtonText, "clearHighlightsButtonText(...)");
        return strClearHighlightsButtonText;
    }

    public final String getExitButtonContentDescription() {
        String strExitButtonContentDescription = NativeBarcodeCountViewDefaults.exitButtonContentDescription();
        Intrinsics.i(strExitButtonContentDescription, "exitButtonContentDescription(...)");
        return strExitButtonContentDescription;
    }

    public final String getExitButtonText() {
        String strExitButtonText = NativeBarcodeCountViewDefaults.exitButtonText();
        Intrinsics.i(strExitButtonText, "exitButtonText(...)");
        return strExitButtonText;
    }

    public final String getFloatingShutterButtonContentDescription() {
        String strFloatingShutterButtonContentDescription = NativeBarcodeCountViewDefaults.floatingShutterButtonContentDescription();
        Intrinsics.i(strFloatingShutterButtonContentDescription, "floatingShutterButtonContentDescription(...)");
        return strFloatingShutterButtonContentDescription;
    }

    public final String getListButtonContentDescription() {
        String strListButtonContentDescription = NativeBarcodeCountViewDefaults.listButtonContentDescription();
        Intrinsics.i(strListButtonContentDescription, "listButtonContentDescription(...)");
        return strListButtonContentDescription;
    }

    public final boolean getShouldDisableModeOnExitButtonTapped() {
        return NativeBarcodeCountViewDefaults.shouldDisableModeOnExitButtonTapped();
    }

    public final boolean getShouldShowClearHighlightsButton() {
        return NativeBarcodeCountViewDefaults.shouldShowClearHighlightsButton();
    }

    public final boolean getShouldShowExitButton() {
        return NativeBarcodeCountViewDefaults.shouldShowExitButton();
    }

    public final boolean getShouldShowFloatingShutterButton() {
        return NativeBarcodeCountViewDefaults.shouldShowFloatingShutterButton();
    }

    public final boolean getShouldShowHints() {
        return NativeBarcodeCountViewDefaults.shouldShowHints();
    }

    public final boolean getShouldShowListButton() {
        return NativeBarcodeCountViewDefaults.shouldShowListButton();
    }

    public final boolean getShouldShowListProgressBar() {
        return NativeBarcodeCountViewDefaults.shouldShowListProgressBar();
    }

    public final boolean getShouldShowScanAreaGuides() {
        return NativeBarcodeCountViewDefaults.shouldShowScanAreaGuides();
    }

    public final boolean getShouldShowShutterButton() {
        return NativeBarcodeCountViewDefaults.shouldShowShutterButton();
    }

    public final boolean getShouldShowSingleScanButton() {
        return NativeBarcodeCountViewDefaults.shouldShowSingleScanButton();
    }

    public final boolean getShouldShowStatusIconsOnScan() {
        return NativeBarcodeCountViewDefaults.shouldShowStatusIconsOnScan();
    }

    public final boolean getShouldShowStatusModeButton() {
        return NativeBarcodeCountViewDefaults.shouldShowStatusModeButton();
    }

    public final boolean getShouldShowToolbar() {
        return NativeBarcodeCountViewDefaults.shouldShowToolbar();
    }

    public final boolean getShouldShowUserGuidanceView() {
        return NativeBarcodeCountViewDefaults.shouldShowUserGuidanceView();
    }

    public final String getShutterButtonContentDescription() {
        String strShutterButtonContentDescription = NativeBarcodeCountViewDefaults.shutterButtonContentDescription();
        Intrinsics.i(strShutterButtonContentDescription, "shutterButtonContentDescription(...)");
        return strShutterButtonContentDescription;
    }

    public final String getSingleScanButtonContentDescription() {
        String strSingleScanButtonContentDescription = NativeBarcodeCountViewDefaults.singleScanButtonContentDescription();
        Intrinsics.i(strSingleScanButtonContentDescription, "singleScanButtonContentDescription(...)");
        return strSingleScanButtonContentDescription;
    }

    public final String getStatusModeButtonContentDescription() {
        String strStatusModeButtonContentDescription = NativeBarcodeCountViewDefaults.statusModeButtonContentDescription();
        Intrinsics.i(strStatusModeButtonContentDescription, "statusModeButtonContentDescription(...)");
        return strStatusModeButtonContentDescription;
    }

    public final BarcodeCountViewStyle getStyle() {
        NativeBarcodeCountBasicOverlayStyle nativeBarcodeCountBasicOverlayStyleStyle = NativeBarcodeCountViewDefaults.style();
        Intrinsics.i(nativeBarcodeCountBasicOverlayStyleStyle, "style(...)");
        return BarcodeCountViewStyleExtensionKt.toViewStyle(nativeBarcodeCountBasicOverlayStyleStyle);
    }

    public final String getTextForBarcodesNotInListDetectedHint() {
        String strTextForBarcodesNotInListDetectedHint = NativeBarcodeCountViewDefaults.textForBarcodesNotInListDetectedHint();
        Intrinsics.i(strTextForBarcodesNotInListDetectedHint, "textForBarcodesNotInListDetectedHint(...)");
        return strTextForBarcodesNotInListDetectedHint;
    }

    public final String getTextForClusteringGestureHint() {
        String strTextForSwipeToGroupHint = NativeBarcodeCountViewDefaults.textForSwipeToGroupHint();
        Intrinsics.i(strTextForSwipeToGroupHint, "textForSwipeToGroupHint(...)");
        return strTextForSwipeToGroupHint;
    }

    public final String getTextForItemAcceptedHint() {
        String strTextForItemAcceptedHint = NativeBarcodeCountViewDefaults.textForItemAcceptedHint();
        Intrinsics.i(strTextForItemAcceptedHint, "textForItemAcceptedHint(...)");
        return strTextForItemAcceptedHint;
    }

    public final String getTextForItemRejectedHint() {
        String strTextForItemRejectedHint = NativeBarcodeCountViewDefaults.textForItemRejectedHint();
        Intrinsics.i(strTextForItemRejectedHint, "textForItemRejectedHint(...)");
        return strTextForItemRejectedHint;
    }

    public final String getTextForMoveCloserAndRescanHint() {
        String strTextForMoveCloserAndRescanHint = NativeBarcodeCountViewDefaults.textForMoveCloserAndRescanHint();
        Intrinsics.i(strTextForMoveCloserAndRescanHint, "textForMoveCloserAndRescanHint(...)");
        return strTextForMoveCloserAndRescanHint;
    }

    public final String getTextForMoveFurtherAndRescanHint() {
        String strTextForMoveFurtherAndRescanHint = NativeBarcodeCountViewDefaults.textForMoveFurtherAndRescanHint();
        Intrinsics.i(strTextForMoveFurtherAndRescanHint, "textForMoveFurtherAndRescanHint(...)");
        return strTextForMoveFurtherAndRescanHint;
    }

    public final String getTextForScanningHint() {
        String strTextForScanningHint = NativeBarcodeCountViewDefaults.textForScanningHint();
        Intrinsics.i(strTextForScanningHint, "textForScanningHint(...)");
        return strTextForScanningHint;
    }

    public final String getTextForTapShutterToScanHint() {
        String strTextForTapShutterToScanHint = NativeBarcodeCountViewDefaults.textForTapShutterToScanHint();
        Intrinsics.i(strTextForTapShutterToScanHint, "textForTapShutterToScanHint(...)");
        return strTextForTapShutterToScanHint;
    }

    public final String getTextForTapToUncountHint() {
        String strTextForTapToUncountDetectedHint = NativeBarcodeCountViewDefaults.textForTapToUncountDetectedHint();
        Intrinsics.i(strTextForTapToUncountDetectedHint, "textForTapToUncountDetectedHint(...)");
        return strTextForTapToUncountDetectedHint;
    }

    public final String getTextForUnrecognizedBarcodesDetectedHint() {
        String strTextForUnrecognizedBarcodesDetectedHint = NativeBarcodeCountViewDefaults.textForUnrecognizedBarcodesDetectedHint();
        Intrinsics.i(strTextForUnrecognizedBarcodesDetectedHint, "textForUnrecognizedBarcodesDetectedHint(...)");
        return strTextForUnrecognizedBarcodesDetectedHint;
    }

    public final String getTextForUnrecognizedBarcodesInClusterHint() {
        String strTextForRescanYellowCodesToGroupHint = NativeBarcodeCountViewDefaults.textForRescanYellowCodesToGroupHint();
        Intrinsics.i(strTextForRescanYellowCodesToGroupHint, "textForRescanYellowCodesToGroupHint(...)");
        return strTextForRescanYellowCodesToGroupHint;
    }
}
