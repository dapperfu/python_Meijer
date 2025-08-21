package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.graphics.PointF;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f123344a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeFindItem f123345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123346c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.e(this.f123344a, y0Var.f123344a) && Intrinsics.e(this.f123345b, y0Var.f123345b) && Intrinsics.e(this.f123346c, y0Var.f123346c);
    }

    public final int hashCode() {
        int iHashCode = this.f123344a.hashCode() * 31;
        BarcodeFindItem barcodeFindItem = this.f123345b;
        return this.f123346c.hashCode() + ((iHashCode + (barcodeFindItem == null ? 0 : barcodeFindItem.hashCode())) * 31);
    }

    public final String toString() {
        return "DotInfo(position=" + this.f123344a + ", barcodeFindItem=" + this.f123345b + ", barcodeData=" + this.f123346c + ')';
    }

    public y0(PointF position, BarcodeFindItem barcodeFindItem, String barcodeData) {
        Intrinsics.j(position, "position");
        Intrinsics.j(barcodeData, "barcodeData");
        this.f123344a = position;
        this.f123345b = barcodeFindItem;
        this.f123346c = barcodeData;
    }
}
