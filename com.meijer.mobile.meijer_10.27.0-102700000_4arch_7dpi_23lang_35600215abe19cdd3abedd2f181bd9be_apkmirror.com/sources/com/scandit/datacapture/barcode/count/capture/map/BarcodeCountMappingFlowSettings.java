package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\n¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeCountMappingFlowSettings;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "getScanBarcodesGuidanceText", "()Ljava/lang/String;", "setScanBarcodesGuidanceText", "(Ljava/lang/String;)V", "scanBarcodesGuidanceText", "b", "getNextButtonText", "setNextButtonText", "nextButtonText", "c", "getStepBackGuidanceText", "setStepBackGuidanceText", "stepBackGuidanceText", "d", "getRedoScanButtonText", "setRedoScanButtonText", "redoScanButtonText", "e", "getRestartButtonText", "setRestartButtonText", "restartButtonText", "f", "getFinishButtonText", "setFinishButtonText", "finishButtonText", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountMappingFlowSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String scanBarcodesGuidanceText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String nextButtonText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String stepBackGuidanceText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String redoScanButtonText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String restartButtonText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String finishButtonText;

    public final String getFinishButtonText() {
        return this.finishButtonText;
    }

    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    public final String getRedoScanButtonText() {
        return this.redoScanButtonText;
    }

    public final String getRestartButtonText() {
        return this.restartButtonText;
    }

    public final String getScanBarcodesGuidanceText() {
        return this.scanBarcodesGuidanceText;
    }

    public final String getStepBackGuidanceText() {
        return this.stepBackGuidanceText;
    }

    public final void setFinishButtonText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.finishButtonText = str;
    }

    public final void setNextButtonText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.nextButtonText = str;
    }

    public final void setRedoScanButtonText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.redoScanButtonText = str;
    }

    public final void setRestartButtonText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.restartButtonText = str;
    }

    public final void setScanBarcodesGuidanceText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.scanBarcodesGuidanceText = str;
    }

    public final void setStepBackGuidanceText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.stepBackGuidanceText = str;
    }

    public BarcodeCountMappingFlowSettings() {
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.scanBarcodesGuidanceText = barcodeCountViewDefaults.getTextForMappingFlowScanBarcodesGuidance();
        this.nextButtonText = barcodeCountViewDefaults.getNextButtonText();
        this.stepBackGuidanceText = barcodeCountViewDefaults.getTextForMappingFlowStepBackGuidance();
        this.redoScanButtonText = barcodeCountViewDefaults.getRedoScanButtonText();
        this.restartButtonText = barcodeCountViewDefaults.getRestartButtonText();
        this.finishButtonText = barcodeCountViewDefaults.getExitButtonText();
    }
}
