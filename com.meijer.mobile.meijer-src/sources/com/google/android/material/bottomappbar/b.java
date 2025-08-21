package com.google.android.material.bottomappbar;

import te.C17232f;
import te.C17241o;

/* loaded from: classes4.dex */
public class b extends C17232f implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private float f87210a;

    /* renamed from: b, reason: collision with root package name */
    private float f87211b;

    /* renamed from: c, reason: collision with root package name */
    private float f87212c;

    /* renamed from: d, reason: collision with root package name */
    private float f87213d;

    /* renamed from: e, reason: collision with root package name */
    private float f87214e;

    /* renamed from: f, reason: collision with root package name */
    private float f87215f;

    void i(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f87213d = f10;
    }

    @Override // te.C17232f
    public void b(float f10, float f11, float f12, C17241o c17241o) {
        float f13;
        float f14;
        float f15 = this.f87212c;
        if (f15 == 0.0f) {
            c17241o.m(f10, 0.0f);
            return;
        }
        float f16 = ((this.f87211b * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f87210a;
        float f18 = f11 + this.f87214e;
        float f19 = (this.f87213d * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            c17241o.m(f10, 0.0f);
            return;
        }
        float f20 = this.f87215f;
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
        c17241o.m(f24, 0.0f);
        float f27 = f24 - f17;
        float f28 = f24 + f17;
        float f29 = f17 * 2.0f;
        c17241o.a(f27, 0.0f, f28, f29, 270.0f, degrees);
        if (z10) {
            c17241o.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f87211b;
            float f31 = f21 * 2.0f;
            float f32 = f30 + f31;
            float f33 = f18 - f16;
            c17241o.a(f33, -(f21 + f30), f32 + f33, f30 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f18 + f16;
            float f35 = this.f87211b;
            c17241o.m(f34 - ((f35 / 2.0f) + f21), f35 + f21);
            float f36 = this.f87211b;
            c17241o.a(f34 - (f31 + f36), -(f21 + f36), f34, f36 + f21, 90.0f, f26 - 90.0f);
        }
        c17241o.a(f25 - f17, 0.0f, f25 + f17, f29, 270.0f - degrees, degrees);
        c17241o.m(f10, 0.0f);
    }

    float c() {
        return this.f87213d;
    }

    public float d() {
        return this.f87215f;
    }

    float e() {
        return this.f87211b;
    }

    float f() {
        return this.f87210a;
    }

    public float g() {
        return this.f87212c;
    }

    public void j(float f10) {
        this.f87215f = f10;
    }

    void k(float f10) {
        this.f87211b = f10;
    }

    void l(float f10) {
        this.f87210a = f10;
    }

    public void m(float f10) {
        this.f87212c = f10;
    }

    void n(float f10) {
        this.f87214e = f10;
    }
}
