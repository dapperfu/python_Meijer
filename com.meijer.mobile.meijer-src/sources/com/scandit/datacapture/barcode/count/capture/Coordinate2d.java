package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class Coordinate2d {

    /* renamed from: x, reason: collision with root package name */
    final int f121581x;

    /* renamed from: y, reason: collision with root package name */
    final int f121582y;

    public int getX() {
        return this.f121581x;
    }

    public int getY() {
        return this.f121582y;
    }

    public String toString() {
        return "Coordinate2d{x=" + this.f121581x + ",y=" + this.f121582y + "}";
    }

    public Coordinate2d(int i10, int i11) {
        this.f121581x = i10;
        this.f121582y = i11;
    }
}
