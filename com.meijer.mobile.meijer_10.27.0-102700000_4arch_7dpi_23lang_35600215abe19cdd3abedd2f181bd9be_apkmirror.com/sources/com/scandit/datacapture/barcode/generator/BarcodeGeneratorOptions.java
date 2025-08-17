package com.scandit.datacapture.barcode.generator;

import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\b\u0000\u0018\u00002\u00020\u0001B[\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000e\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012¨\u0006+"}, d2 = {"Lcom/scandit/datacapture/barcode/generator/BarcodeGeneratorOptions;", "", "", "backgroundColor", "foregroundColor", "unitSize", "Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "errorCorrectionLevel", "versionNumber", "minimumErrorCorrectionPercent", "layers", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ILcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "getBackgroundColor$scandit_barcode_capture", "()Ljava/lang/Integer;", "setBackgroundColor$scandit_barcode_capture", "(Ljava/lang/Integer;)V", "b", "getForegroundColor$scandit_barcode_capture", "setForegroundColor$scandit_barcode_capture", "c", "I", "getUnitSize$scandit_barcode_capture", "()I", "setUnitSize$scandit_barcode_capture", "(I)V", "d", "Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "getErrorCorrectionLevel$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;", "setErrorCorrectionLevel$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/generator/QrCodeErrorCorrectionLevel;)V", "e", "getVersionNumber$scandit_barcode_capture", "setVersionNumber$scandit_barcode_capture", "f", "getMinimumErrorCorrectionPercent$scandit_barcode_capture", "setMinimumErrorCorrectionPercent$scandit_barcode_capture", "g", "getLayers$scandit_barcode_capture", "setLayers$scandit_barcode_capture", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeGeneratorOptions {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Integer backgroundColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer foregroundColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int unitSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private QrCodeErrorCorrectionLevel errorCorrectionLevel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer versionNumber;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Integer minimumErrorCorrectionPercent;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Integer layers;

    public BarcodeGeneratorOptions() {
        this(null, null, 0, null, null, null, null, l3.f92485d, null);
    }

    public BarcodeGeneratorOptions(Integer num, Integer num2, int i10, QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel, Integer num3, Integer num4, Integer num5) {
        this.backgroundColor = num;
        this.foregroundColor = num2;
        this.unitSize = i10;
        this.errorCorrectionLevel = qrCodeErrorCorrectionLevel;
        this.versionNumber = num3;
        this.minimumErrorCorrectionPercent = num4;
        this.layers = num5;
    }

    /* renamed from: getBackgroundColor$scandit_barcode_capture, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getErrorCorrectionLevel$scandit_barcode_capture, reason: from getter */
    public final QrCodeErrorCorrectionLevel getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    /* renamed from: getForegroundColor$scandit_barcode_capture, reason: from getter */
    public final Integer getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: getLayers$scandit_barcode_capture, reason: from getter */
    public final Integer getLayers() {
        return this.layers;
    }

    /* renamed from: getMinimumErrorCorrectionPercent$scandit_barcode_capture, reason: from getter */
    public final Integer getMinimumErrorCorrectionPercent() {
        return this.minimumErrorCorrectionPercent;
    }

    /* renamed from: getUnitSize$scandit_barcode_capture, reason: from getter */
    public final int getUnitSize() {
        return this.unitSize;
    }

    /* renamed from: getVersionNumber$scandit_barcode_capture, reason: from getter */
    public final Integer getVersionNumber() {
        return this.versionNumber;
    }

    public final void setBackgroundColor$scandit_barcode_capture(Integer num) {
        this.backgroundColor = num;
    }

    public final void setErrorCorrectionLevel$scandit_barcode_capture(QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel) {
        this.errorCorrectionLevel = qrCodeErrorCorrectionLevel;
    }

    public final void setForegroundColor$scandit_barcode_capture(Integer num) {
        this.foregroundColor = num;
    }

    public final void setLayers$scandit_barcode_capture(Integer num) {
        this.layers = num;
    }

    public final void setMinimumErrorCorrectionPercent$scandit_barcode_capture(Integer num) {
        this.minimumErrorCorrectionPercent = num;
    }

    public final void setUnitSize$scandit_barcode_capture(int i10) {
        this.unitSize = i10;
    }

    public final void setVersionNumber$scandit_barcode_capture(Integer num) {
        this.versionNumber = num;
    }

    public /* synthetic */ BarcodeGeneratorOptions(Integer num, Integer num2, int i10, QrCodeErrorCorrectionLevel qrCodeErrorCorrectionLevel, Integer num3, Integer num4, Integer num5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? 1 : i10, (i11 & 8) != 0 ? null : qrCodeErrorCorrectionLevel, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? 33 : num4, (i11 & 64) != 0 ? 0 : num5);
    }
}
