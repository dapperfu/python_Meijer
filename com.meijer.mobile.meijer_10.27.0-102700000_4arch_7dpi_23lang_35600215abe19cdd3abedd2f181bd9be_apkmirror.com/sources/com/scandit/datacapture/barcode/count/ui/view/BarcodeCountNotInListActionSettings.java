package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b$\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\"\u0010+\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\"\u0010/\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\"\u00103\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016¨\u00064"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountNotInListActionSettings;", "", "<init>", "()V", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountNotInListActionSettings;", "toNative$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountNotInListActionSettings;", "toNative", "", "a", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "", "b", "Ljava/lang/String;", "getAcceptButtonText", "()Ljava/lang/String;", "setAcceptButtonText", "(Ljava/lang/String;)V", "acceptButtonText", "c", "getAcceptButtonContentDescription", "setAcceptButtonContentDescription", "acceptButtonContentDescription", "d", "getRejectButtonText", "setRejectButtonText", "rejectButtonText", "e", "getRejectButtonContentDescription", "setRejectButtonContentDescription", "rejectButtonContentDescription", "f", "getCancelButtonText", "setCancelButtonText", "cancelButtonText", "g", "getCancelButtonContentDescription", "setCancelButtonContentDescription", "cancelButtonContentDescription", "h", "getBarcodeAcceptedHint", "setBarcodeAcceptedHint", "barcodeAcceptedHint", "i", "getBarcodeRejectedHint", "setBarcodeRejectedHint", "barcodeRejectedHint", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountNotInListActionSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String acceptButtonText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String acceptButtonContentDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String rejectButtonText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String rejectButtonContentDescription;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String cancelButtonText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String cancelButtonContentDescription;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String barcodeAcceptedHint;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String barcodeRejectedHint;

    public final String getAcceptButtonContentDescription() {
        return this.acceptButtonContentDescription;
    }

    public final String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    public final String getBarcodeAcceptedHint() {
        return this.barcodeAcceptedHint;
    }

    public final String getBarcodeRejectedHint() {
        return this.barcodeRejectedHint;
    }

    public final String getCancelButtonContentDescription() {
        return this.cancelButtonContentDescription;
    }

    public final String getCancelButtonText() {
        return this.cancelButtonText;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getRejectButtonContentDescription() {
        return this.rejectButtonContentDescription;
    }

    public final String getRejectButtonText() {
        return this.rejectButtonText;
    }

    public final void setAcceptButtonContentDescription(String str) {
        Intrinsics.j(str, "<set-?>");
        this.acceptButtonContentDescription = str;
    }

    public final void setAcceptButtonText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.acceptButtonText = str;
    }

    public final void setBarcodeAcceptedHint(String str) {
        Intrinsics.j(str, "<set-?>");
        this.barcodeAcceptedHint = str;
    }

    public final void setBarcodeRejectedHint(String str) {
        Intrinsics.j(str, "<set-?>");
        this.barcodeRejectedHint = str;
    }

    public final void setCancelButtonContentDescription(String str) {
        Intrinsics.j(str, "<set-?>");
        this.cancelButtonContentDescription = str;
    }

    public final void setCancelButtonText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.cancelButtonText = str;
    }

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public final void setRejectButtonContentDescription(String str) {
        Intrinsics.j(str, "<set-?>");
        this.rejectButtonContentDescription = str;
    }

    public final void setRejectButtonText(String str) {
        Intrinsics.j(str, "<set-?>");
        this.rejectButtonText = str;
    }

    public BarcodeCountNotInListActionSettings() {
        NativeBarcodeCountNotInListActionSettings nativeBarcodeCountNotInListActionSettingsCreate = NativeBarcodeCountNotInListActionSettings.create();
        this.enabled = nativeBarcodeCountNotInListActionSettingsCreate.isEnabled();
        String acceptButtonText = nativeBarcodeCountNotInListActionSettingsCreate.getAcceptButtonText();
        Intrinsics.i(acceptButtonText, "getAcceptButtonText(...)");
        this.acceptButtonText = acceptButtonText;
        String acceptButtonAccessibilityLabel = nativeBarcodeCountNotInListActionSettingsCreate.getAcceptButtonAccessibilityLabel();
        Intrinsics.i(acceptButtonAccessibilityLabel, "getAcceptButtonAccessibilityLabel(...)");
        this.acceptButtonContentDescription = acceptButtonAccessibilityLabel;
        String rejectButtonText = nativeBarcodeCountNotInListActionSettingsCreate.getRejectButtonText();
        Intrinsics.i(rejectButtonText, "getRejectButtonText(...)");
        this.rejectButtonText = rejectButtonText;
        String rejectButtonAccessibilityLabel = nativeBarcodeCountNotInListActionSettingsCreate.getRejectButtonAccessibilityLabel();
        Intrinsics.i(rejectButtonAccessibilityLabel, "getRejectButtonAccessibilityLabel(...)");
        this.rejectButtonContentDescription = rejectButtonAccessibilityLabel;
        String cancelButtonText = nativeBarcodeCountNotInListActionSettingsCreate.getCancelButtonText();
        Intrinsics.i(cancelButtonText, "getCancelButtonText(...)");
        this.cancelButtonText = cancelButtonText;
        String cancelButtonAccessibilityLabel = nativeBarcodeCountNotInListActionSettingsCreate.getCancelButtonAccessibilityLabel();
        Intrinsics.i(cancelButtonAccessibilityLabel, "getCancelButtonAccessibilityLabel(...)");
        this.cancelButtonContentDescription = cancelButtonAccessibilityLabel;
        String acceptedHintText = nativeBarcodeCountNotInListActionSettingsCreate.getAcceptedHintText();
        Intrinsics.i(acceptedHintText, "getAcceptedHintText(...)");
        this.barcodeAcceptedHint = acceptedHintText;
        String rejectedHintText = nativeBarcodeCountNotInListActionSettingsCreate.getRejectedHintText();
        Intrinsics.i(rejectedHintText, "getRejectedHintText(...)");
        this.barcodeRejectedHint = rejectedHintText;
    }

    public final NativeBarcodeCountNotInListActionSettings toNative$scandit_barcode_capture() {
        NativeBarcodeCountNotInListActionSettings nativeBarcodeCountNotInListActionSettingsCreate = NativeBarcodeCountNotInListActionSettings.create();
        nativeBarcodeCountNotInListActionSettingsCreate.setEnabled(this.enabled);
        nativeBarcodeCountNotInListActionSettingsCreate.setAcceptButtonText(this.acceptButtonText);
        nativeBarcodeCountNotInListActionSettingsCreate.setRejectButtonText(this.rejectButtonText);
        nativeBarcodeCountNotInListActionSettingsCreate.setCancelButtonText(this.cancelButtonText);
        nativeBarcodeCountNotInListActionSettingsCreate.setAcceptedHintText(this.barcodeAcceptedHint);
        nativeBarcodeCountNotInListActionSettingsCreate.setRejectedHintText(this.barcodeRejectedHint);
        Intrinsics.i(nativeBarcodeCountNotInListActionSettingsCreate, "also(...)");
        return nativeBarcodeCountNotInListActionSettingsCreate;
    }
}
