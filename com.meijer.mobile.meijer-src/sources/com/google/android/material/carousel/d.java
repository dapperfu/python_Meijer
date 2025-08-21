package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private float f87456a;

    /* renamed from: b, reason: collision with root package name */
    private float f87457b;

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    boolean f() {
        return true;
    }

    abstract f g(b bVar, View view);

    abstract boolean h(b bVar, int i10);

    public float c() {
        return this.f87457b;
    }

    public float d() {
        return this.f87456a;
    }

    void e(Context context) {
        float fH = this.f87456a;
        if (fH <= 0.0f) {
            fH = e.h(context);
        }
        this.f87456a = fH;
        float fG = this.f87457b;
        if (fG <= 0.0f) {
            fG = e.g(context);
        }
        this.f87457b = fG;
    }
}
