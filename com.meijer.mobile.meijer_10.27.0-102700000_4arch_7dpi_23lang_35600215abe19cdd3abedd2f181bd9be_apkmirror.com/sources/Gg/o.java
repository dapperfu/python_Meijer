package Gg;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final float f11449a;

    /* renamed from: b, reason: collision with root package name */
    private final float f11450b;

    /* renamed from: c, reason: collision with root package name */
    private final float f11451c;

    /* renamed from: d, reason: collision with root package name */
    private final float f11452d;

    /* renamed from: e, reason: collision with root package name */
    private final float f11453e;

    /* renamed from: f, reason: collision with root package name */
    private final float f11454f;

    /* renamed from: g, reason: collision with root package name */
    private final float f11455g;

    /* renamed from: h, reason: collision with root package name */
    private final float f11456h;

    /* renamed from: i, reason: collision with root package name */
    private final float f11457i;

    public static o d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new o(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new o((f12 - f10) + (f25 * f12), (f16 - f10) + (f26 * f16), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    o a() {
        float f10 = this.f11453e;
        float f11 = this.f11457i;
        float f12 = this.f11454f;
        float f13 = this.f11456h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f11455g;
        float f16 = this.f11452d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f11451c;
        float f20 = this.f11450b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f11449a;
        return new o(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    o e(o oVar) {
        float f10 = this.f11449a;
        float f11 = oVar.f11449a;
        float f12 = this.f11452d;
        float f13 = oVar.f11450b;
        float f14 = this.f11455g;
        float f15 = oVar.f11451c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = oVar.f11452d;
        float f18 = oVar.f11453e;
        float f19 = oVar.f11454f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = oVar.f11455g;
        float f22 = oVar.f11456h;
        float f23 = oVar.f11457i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f11450b;
        float f26 = this.f11453e;
        float f27 = (f25 * f11) + (f26 * f13);
        float f28 = this.f11456h;
        float f29 = f27 + (f28 * f15);
        float f30 = (f25 * f17) + (f26 * f18) + (f28 * f19);
        float f31 = (f25 * f21) + (f26 * f22) + (f28 * f23);
        float f32 = this.f11451c;
        float f33 = f11 * f32;
        float f34 = this.f11454f;
        float f35 = f33 + (f13 * f34);
        float f36 = this.f11457i;
        return new o(f16, f20, f24, f29, f30, f31, f35 + (f15 * f36), (f32 * f17) + (f18 * f34) + (f19 * f36), (f32 * f21) + (f34 * f22) + (f36 * f23));
    }

    public void f(float[] fArr) {
        float f10 = this.f11449a;
        float f11 = this.f11450b;
        float f12 = this.f11451c;
        float f13 = this.f11452d;
        float f14 = this.f11453e;
        float f15 = this.f11454f;
        float f16 = this.f11455g;
        float f17 = this.f11456h;
        float f18 = this.f11457i;
        int length = fArr.length - 1;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }

    private o(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f11449a = f10;
        this.f11450b = f13;
        this.f11451c = f16;
        this.f11452d = f11;
        this.f11453e = f14;
        this.f11454f = f17;
        this.f11455g = f12;
        this.f11456h = f15;
        this.f11457i = f18;
    }

    public static o b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return d(f18, f19, f20, f21, f22, f23, f24, f25).e(c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static o c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return d(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }
}
