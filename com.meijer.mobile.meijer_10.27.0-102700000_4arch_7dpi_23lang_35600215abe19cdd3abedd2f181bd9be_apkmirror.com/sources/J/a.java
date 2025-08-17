package J;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final float f14450a;

    /* renamed from: b, reason: collision with root package name */
    private final float f14451b;

    /* renamed from: c, reason: collision with root package name */
    private final float f14452c;

    /* renamed from: d, reason: collision with root package name */
    private final float f14453d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (Float.floatToIntBits(this.f14450a) == Float.floatToIntBits(eVar.d()) && Float.floatToIntBits(this.f14451b) == Float.floatToIntBits(eVar.a()) && Float.floatToIntBits(this.f14452c) == Float.floatToIntBits(eVar.c()) && Float.floatToIntBits(this.f14453d) == Float.floatToIntBits(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // J.e, C.s0
    public float a() {
        return this.f14451b;
    }

    @Override // J.e, C.s0
    public float b() {
        return this.f14453d;
    }

    @Override // J.e, C.s0
    public float c() {
        return this.f14452c;
    }

    @Override // J.e, C.s0
    public float d() {
        return this.f14450a;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f14450a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f14451b)) * 1000003) ^ Float.floatToIntBits(this.f14452c)) * 1000003) ^ Float.floatToIntBits(this.f14453d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f14450a + ", maxZoomRatio=" + this.f14451b + ", minZoomRatio=" + this.f14452c + ", linearZoom=" + this.f14453d + "}";
    }

    a(float f10, float f11, float f12, float f13) {
        this.f14450a = f10;
        this.f14451b = f11;
        this.f14452c = f12;
        this.f14453d = f13;
    }
}
