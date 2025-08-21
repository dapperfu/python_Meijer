package com.google.android.material.carousel;

import h2.C14442a;

/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f87445a;

    /* renamed from: b, reason: collision with root package name */
    float f87446b;

    /* renamed from: c, reason: collision with root package name */
    int f87447c;

    /* renamed from: d, reason: collision with root package name */
    int f87448d;

    /* renamed from: e, reason: collision with root package name */
    float f87449e;

    /* renamed from: f, reason: collision with root package name */
    float f87450f;

    /* renamed from: g, reason: collision with root package name */
    final int f87451g;

    /* renamed from: h, reason: collision with root package name */
    final float f87452h;

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
                    if (aVar == null || aVar2.f87452h < aVar.f87452h) {
                        if (aVar2.f87452h == 0.0f) {
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
        return (this.f87450f * this.f87451g) + (this.f87449e * this.f87448d) + (this.f87446b * this.f87447c);
    }

    private boolean g() {
        int i10 = this.f87451g;
        if (i10 <= 0 || this.f87447c <= 0 || this.f87448d <= 0) {
            return i10 <= 0 || this.f87447c <= 0 || this.f87450f > this.f87446b;
        }
        float f10 = this.f87450f;
        float f11 = this.f87449e;
        return f10 > f11 && f11 > this.f87446b;
    }

    int e() {
        return this.f87447c + this.f87448d + this.f87451g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f87445a + ", smallCount=" + this.f87447c + ", smallSize=" + this.f87446b + ", mediumCount=" + this.f87448d + ", mediumSize=" + this.f87449e + ", largeCount=" + this.f87451g + ", largeSize=" + this.f87450f + ", cost=" + this.f87452h + "]";
    }

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f87445a = i10;
        this.f87446b = C14442a.a(f10, f11, f12);
        this.f87447c = i11;
        this.f87449e = f13;
        this.f87448d = i12;
        this.f87450f = f14;
        this.f87451g = i13;
        d(f15, f11, f12, f14);
        this.f87452h = b(f14);
    }

    private float b(float f10) {
        if (!g()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f10 - this.f87450f) * this.f87445a;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14;
        float f15 = f10 - f();
        int i10 = this.f87447c;
        if (i10 > 0 && f15 > 0.0f) {
            float f16 = this.f87446b;
            this.f87446b = f16 + Math.min(f15 / i10, f12 - f16);
        } else if (i10 > 0 && f15 < 0.0f) {
            float f17 = this.f87446b;
            this.f87446b = f17 + Math.max(f15 / i10, f11 - f17);
        }
        int i11 = this.f87447c;
        if (i11 > 0) {
            f14 = this.f87446b;
        } else {
            f14 = 0.0f;
        }
        this.f87446b = f14;
        float fA = a(f10, i11, f14, this.f87448d, this.f87451g);
        this.f87450f = fA;
        float f18 = (this.f87446b + fA) / 2.0f;
        this.f87449e = f18;
        int i12 = this.f87448d;
        if (i12 > 0 && fA != f13) {
            float f19 = (f13 - fA) * this.f87451g;
            float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
            if (f19 > 0.0f) {
                this.f87449e -= fMin / this.f87448d;
                this.f87450f += fMin / this.f87451g;
            } else {
                this.f87449e += fMin / this.f87448d;
                this.f87450f -= fMin / this.f87451g;
            }
        }
    }
}
