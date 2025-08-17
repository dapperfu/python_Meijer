package v;

/* loaded from: classes.dex */
class b2 implements C.s0 {

    /* renamed from: a, reason: collision with root package name */
    private float f163968a;

    /* renamed from: b, reason: collision with root package name */
    private final float f163969b;

    /* renamed from: c, reason: collision with root package name */
    private final float f163970c;

    /* renamed from: d, reason: collision with root package name */
    private float f163971d;

    private float e(float f10) {
        float f11 = this.f163969b;
        float f12 = this.f163970c;
        if (f11 == f12) {
            return 0.0f;
        }
        if (f10 == f11) {
            return 1.0f;
        }
        if (f10 == f12) {
            return 0.0f;
        }
        float f13 = 1.0f / f12;
        return ((1.0f / f10) - f13) / ((1.0f / f11) - f13);
    }

    @Override // C.s0
    public float a() {
        return this.f163969b;
    }

    @Override // C.s0
    public float b() {
        return this.f163971d;
    }

    @Override // C.s0
    public float c() {
        return this.f163970c;
    }

    @Override // C.s0
    public float d() {
        return this.f163968a;
    }

    void f(float f10) throws IllegalArgumentException {
        if (f10 <= this.f163969b && f10 >= this.f163970c) {
            this.f163968a = f10;
            this.f163971d = e(f10);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f163970c + " , " + this.f163969b + "]");
    }

    b2(float f10, float f11) {
        this.f163969b = f10;
        this.f163970c = f11;
    }
}
