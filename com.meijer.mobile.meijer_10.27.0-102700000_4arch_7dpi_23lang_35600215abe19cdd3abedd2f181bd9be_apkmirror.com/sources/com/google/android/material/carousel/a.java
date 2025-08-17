package com.google.android.material.carousel;

import h2.C14329a;

/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f86605a;

    /* renamed from: b, reason: collision with root package name */
    float f86606b;

    /* renamed from: c, reason: collision with root package name */
    int f86607c;

    /* renamed from: d, reason: collision with root package name */
    int f86608d;

    /* renamed from: e, reason: collision with root package name */
    float f86609e;

    /* renamed from: f, reason: collision with root package name */
    float f86610f;

    /* renamed from: g, reason: collision with root package name */
    final int f86611g;

    /* renamed from: h, reason: collision with root package name */
    final float f86612h;

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f86612h < aVar.f86612h) {
                        if (aVar2.f86612h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    private float f() {
        return (this.f86610f * this.f86611g) + (this.f86609e * this.f86608d) + (this.f86606b * this.f86607c);
    }

    private boolean g() {
        int i10 = this.f86611g;
        if (i10 <= 0 || this.f86607c <= 0 || this.f86608d <= 0) {
            return i10 <= 0 || this.f86607c <= 0 || this.f86610f > this.f86606b;
        }
        float f10 = this.f86610f;
        float f11 = this.f86609e;
        return f10 > f11 && f11 > this.f86606b;
    }

    int e() {
        return this.f86607c + this.f86608d + this.f86611g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f86605a + ", smallCount=" + this.f86607c + ", smallSize=" + this.f86606b + ", mediumCount=" + this.f86608d + ", mediumSize=" + this.f86609e + ", largeCount=" + this.f86611g + ", largeSize=" + this.f86610f + ", cost=" + this.f86612h + "]";
    }

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f86605a = i10;
        this.f86606b = C14329a.a(f10, f11, f12);
        this.f86607c = i11;
        this.f86609e = f13;
        this.f86608d = i12;
        this.f86610f = f14;
        this.f86611g = i13;
        d(f15, f11, f12, f14);
        this.f86612h = b(f14);
    }

    private float b(float f10) {
        if (!g()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f10 - this.f86610f) * this.f86605a;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14;
        float f15 = f10 - f();
        int i10 = this.f86607c;
        if (i10 > 0 && f15 > 0.0f) {
            float f16 = this.f86606b;
            this.f86606b = f16 + Math.min(f15 / i10, f12 - f16);
        } else if (i10 > 0 && f15 < 0.0f) {
            float f17 = this.f86606b;
            this.f86606b = f17 + Math.max(f15 / i10, f11 - f17);
        }
        int i11 = this.f86607c;
        if (i11 > 0) {
            f14 = this.f86606b;
        } else {
            f14 = 0.0f;
        }
        this.f86606b = f14;
        float fA = a(f10, i11, f14, this.f86608d, this.f86611g);
        this.f86610f = fA;
        float f18 = (this.f86606b + fA) / 2.0f;
        this.f86609e = f18;
        int i12 = this.f86608d;
        if (i12 > 0 && fA != f13) {
            float f19 = (f13 - fA) * this.f86611g;
            float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
            if (f19 > 0.0f) {
                this.f86609e -= fMin / this.f86608d;
                this.f86610f += fMin / this.f86611g;
            } else {
                this.f86609e += fMin / this.f86608d;
                this.f86610f -= fMin / this.f86611g;
            }
        }
    }
}
