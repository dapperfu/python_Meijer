package com.scandit.datacapture.barcode.internal.module.generator;

import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeBarcodeGeneratorOptions {
    final NativeColor backgroundColor;
    final NativeQrCodeErrorCorrectionLevel errorCorrectionLevel;
    final NativeColor foregroundColor;
    final Integer layers;
    final Integer minimumErrorCorrectionPercent;
    final Integer unitSize;
    final Integer versionNumber;

    public NativeColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public NativeQrCodeErrorCorrectionLevel getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    public NativeColor getForegroundColor() {
        return this.foregroundColor;
    }

    public Integer getLayers() {
        return this.layers;
    }

    public Integer getMinimumErrorCorrectionPercent() {
        return this.minimumErrorCorrectionPercent;
    }

    public Integer getUnitSize() {
        return this.unitSize;
    }

    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    public String toString() {
        return "NativeBarcodeGeneratorOptions{backgroundColor=" + this.backgroundColor + ",foregroundColor=" + this.foregroundColor + ",unitSize=" + this.unitSize + ",errorCorrectionLevel=" + this.errorCorrectionLevel + ",versionNumber=" + this.versionNumber + ",minimumErrorCorrectionPercent=" + this.minimumErrorCorrectionPercent + ",layers=" + this.layers + "}";
    }

    public NativeBarcodeGeneratorOptions(NativeColor nativeColor, NativeColor nativeColor2, Integer num, NativeQrCodeErrorCorrectionLevel nativeQrCodeErrorCorrectionLevel, Integer num2, Integer num3, Integer num4) {
        this.backgroundColor = nativeColor;
        this.foregroundColor = nativeColor2;
        this.unitSize = num;
        this.errorCorrectionLevel = nativeQrCodeErrorCorrectionLevel;
        this.versionNumber = num2;
        this.minimumErrorCorrectionPercent = num3;
        this.layers = num4;
    }
}
