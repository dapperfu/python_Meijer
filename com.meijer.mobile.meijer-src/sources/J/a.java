package J;

/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final float f15297a;

    /* renamed from: b, reason: collision with root package name */
    private final float f15298b;

    /* renamed from: c, reason: collision with root package name */
    private final float f15299c;

    /* renamed from: d, reason: collision with root package name */
    private final float f15300d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (Float.floatToIntBits(this.f15297a) == Float.floatToIntBits(eVar.d()) && Float.floatToIntBits(this.f15298b) == Float.floatToIntBits(eVar.a()) && Float.floatToIntBits(this.f15299c) == Float.floatToIntBits(eVar.c()) && Float.floatToIntBits(this.f15300d) == Float.floatToIntBits(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // J.e, C.s0
    public float a() {
        return this.f15298b;
    }

    @Override // J.e, C.s0
    public float b() {
        return this.f15300d;
    }

    @Override // J.e, C.s0
    public float c() {
        return this.f15299c;
    }

    @Override // J.e, C.s0
    public float d() {
        return this.f15297a;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f15297a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f15298b)) * 1000003) ^ Float.floatToIntBits(this.f15299c)) * 1000003) ^ Float.floatToIntBits(this.f15300d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f15297a + ", maxZoomRatio=" + this.f15298b + ", minZoomRatio=" + this.f15299c + ", linearZoom=" + this.f15300d + "}";
    }

    a(float f10, float f11, float f12, float f13) {
        this.f15297a = f10;
        this.f15298b = f11;
        this.f15299c = f12;
        this.f15300d = f13;
    }
}
