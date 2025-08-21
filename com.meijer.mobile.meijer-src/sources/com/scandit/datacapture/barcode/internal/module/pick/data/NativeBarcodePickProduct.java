package com.scandit.datacapture.barcode.internal.module.pick.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeBarcodePickProduct {
    final String identifier;
    final int quantity;

    public String getIdentifier() {
        return this.identifier;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return "NativeBarcodePickProduct{identifier=" + this.identifier + ",quantity=" + this.quantity + "}";
    }

    public NativeBarcodePickProduct(String str, int i10) {
        this.identifier = str;
        this.quantity = i10;
    }
}
