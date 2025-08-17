package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class Coordinate2d {

    /* renamed from: x, reason: collision with root package name */
    final int f120629x;

    /* renamed from: y, reason: collision with root package name */
    final int f120630y;

    public int getX() {
        return this.f120629x;
    }

    public int getY() {
        return this.f120630y;
    }

    public String toString() {
        return "Coordinate2d{x=" + this.f120629x + ",y=" + this.f120630y + "}";
    }

    public Coordinate2d(int i10, int i11) {
        this.f120629x = i10;
        this.f120630y = i11;
    }
}
