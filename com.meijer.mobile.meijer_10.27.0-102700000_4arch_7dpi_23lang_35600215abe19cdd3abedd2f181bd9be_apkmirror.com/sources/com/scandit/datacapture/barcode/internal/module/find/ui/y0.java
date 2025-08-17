package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.graphics.PointF;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f122392a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeFindItem f122393b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122394c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.e(this.f122392a, y0Var.f122392a) && Intrinsics.e(this.f122393b, y0Var.f122393b) && Intrinsics.e(this.f122394c, y0Var.f122394c);
    }

    public final int hashCode() {
        int iHashCode = this.f122392a.hashCode() * 31;
        BarcodeFindItem barcodeFindItem = this.f122393b;
        return this.f122394c.hashCode() + ((iHashCode + (barcodeFindItem == null ? 0 : barcodeFindItem.hashCode())) * 31);
    }

    public final String toString() {
        return "DotInfo(position=" + this.f122392a + ", barcodeFindItem=" + this.f122393b + ", barcodeData=" + this.f122394c + ')';
    }

    public y0(PointF position, BarcodeFindItem barcodeFindItem, String barcodeData) {
        Intrinsics.j(position, "position");
        Intrinsics.j(barcodeData, "barcodeData");
        this.f122392a = position;
        this.f122393b = barcodeFindItem;
        this.f122394c = barcodeData;
    }
}
