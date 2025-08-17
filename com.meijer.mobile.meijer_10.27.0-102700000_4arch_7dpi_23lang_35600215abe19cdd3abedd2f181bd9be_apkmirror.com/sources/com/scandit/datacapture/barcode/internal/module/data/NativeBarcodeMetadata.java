package com.scandit.datacapture.barcode.internal.module.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeBarcodeMetadata {
    final int errorCorrection;
    final int moduleCountX;
    final int moduleCountY;

    public int getErrorCorrection() {
        return this.errorCorrection;
    }

    public int getModuleCountX() {
        return this.moduleCountX;
    }

    public int getModuleCountY() {
        return this.moduleCountY;
    }

    public String toString() {
        return "NativeBarcodeMetadata{errorCorrection=" + this.errorCorrection + ",moduleCountX=" + this.moduleCountX + ",moduleCountY=" + this.moduleCountY + "}";
    }

    public NativeBarcodeMetadata(int i10, int i11, int i12) {
        this.errorCorrection = i10;
        this.moduleCountX = i11;
        this.moduleCountY = i12;
    }
}
