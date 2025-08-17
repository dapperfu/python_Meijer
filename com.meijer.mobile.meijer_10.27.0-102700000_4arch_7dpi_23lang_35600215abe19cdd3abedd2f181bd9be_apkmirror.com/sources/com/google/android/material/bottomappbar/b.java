package com.google.android.material.bottomappbar;

import re.C16758f;
import re.C16767o;

/* loaded from: classes4.dex */
public class b extends C16758f implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private float f86370a;

    /* renamed from: b, reason: collision with root package name */
    private float f86371b;

    /* renamed from: c, reason: collision with root package name */
    private float f86372c;

    /* renamed from: d, reason: collision with root package name */
    private float f86373d;

    /* renamed from: e, reason: collision with root package name */
    private float f86374e;

    /* renamed from: f, reason: collision with root package name */
    private float f86375f;

    void i(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f86373d = f10;
    }

    @Override // re.C16758f
    public void b(float f10, float f11, float f12, C16767o c16767o) {
        float f13;
        float f14;
        float f15 = this.f86372c;
        if (f15 == 0.0f) {
            c16767o.m(f10, 0.0f);
            return;
        }
        float f16 = ((this.f86371b * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f86370a;
        float f18 = f11 + this.f86374e;
        float f19 = (this.f86373d * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            c16767o.m(f10, 0.0f);
            return;
        }
        float f20 = this.f86375f;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        c16767o.m(f24, 0.0f);
        float f27 = f24 - f17;
        float f28 = f24 + f17;
        float f29 = f17 * 2.0f;
        c16767o.a(f27, 0.0f, f28, f29, 270.0f, degrees);
        if (z10) {
            c16767o.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f86371b;
            float f31 = f21 * 2.0f;
            float f32 = f30 + f31;
            float f33 = f18 - f16;
            c16767o.a(f33, -(f21 + f30), f32 + f33, f30 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f18 + f16;
            float f35 = this.f86371b;
            c16767o.m(f34 - ((f35 / 2.0f) + f21), f35 + f21);
            float f36 = this.f86371b;
            c16767o.a(f34 - (f31 + f36), -(f21 + f36), f34, f36 + f21, 90.0f, f26 - 90.0f);
        }
        c16767o.a(f25 - f17, 0.0f, f25 + f17, f29, 270.0f - degrees, degrees);
        c16767o.m(f10, 0.0f);
    }

    float c() {
        return this.f86373d;
    }

    public float d() {
        return this.f86375f;
    }

    float e() {
        return this.f86371b;
    }

    float f() {
        return this.f86370a;
    }

    public float g() {
        return this.f86372c;
    }

    public void j(float f10) {
        this.f86375f = f10;
    }

    void k(float f10) {
        this.f86371b = f10;
    }

    void l(float f10) {
        this.f86370a = f10;
    }

    public void m(float f10) {
        this.f86372c = f10;
    }

    void n(float f10) {
        this.f86374e = f10;
    }
}
