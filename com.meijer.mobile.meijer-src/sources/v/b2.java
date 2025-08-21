package v;

/* loaded from: classes.dex */
class b2 implements C.s0 {

    /* renamed from: a, reason: collision with root package name */
    private float f165002a;

    /* renamed from: b, reason: collision with root package name */
    private final float f165003b;

    /* renamed from: c, reason: collision with root package name */
    private final float f165004c;

    /* renamed from: d, reason: collision with root package name */
    private float f165005d;

    private float e(float f10) {
        float f11 = this.f165003b;
        float f12 = this.f165004c;
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
        return this.f165003b;
    }

    @Override // C.s0
    public float b() {
        return this.f165005d;
    }

    @Override // C.s0
    public float c() {
        return this.f165004c;
    }

    @Override // C.s0
    public float d() {
        return this.f165002a;
    }

    void f(float f10) throws IllegalArgumentException {
        if (f10 <= this.f165003b && f10 >= this.f165004c) {
            this.f165002a = f10;
            this.f165005d = e(f10);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f165004c + " , " + this.f165003b + "]");
    }

    b2(float f10, float f11) {
        this.f165003b = f10;
        this.f165004c = f11;
    }
}
