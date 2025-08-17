package Dd;

/* renamed from: Dd.ba, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3092ba extends AbstractC3116da {

    /* renamed from: a, reason: collision with root package name */
    private final float f6008a;

    /* renamed from: b, reason: collision with root package name */
    private final float f6009b;

    /* renamed from: c, reason: collision with root package name */
    private final float f6010c;

    /* renamed from: d, reason: collision with root package name */
    private final float f6011d;

    @Override // Dd.AbstractC3116da
    final float a() {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3116da) {
            AbstractC3116da abstractC3116da = (AbstractC3116da) obj;
            if (Float.floatToIntBits(this.f6008a) == Float.floatToIntBits(abstractC3116da.c()) && Float.floatToIntBits(this.f6009b) == Float.floatToIntBits(abstractC3116da.e()) && Float.floatToIntBits(this.f6010c) == Float.floatToIntBits(abstractC3116da.b()) && Float.floatToIntBits(this.f6011d) == Float.floatToIntBits(abstractC3116da.d())) {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                abstractC3116da.a();
                if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Dd.AbstractC3116da
    final float b() {
        return this.f6010c;
    }

    @Override // Dd.AbstractC3116da
    final float c() {
        return this.f6008a;
    }

    @Override // Dd.AbstractC3116da
    final float d() {
        return this.f6011d;
    }

    @Override // Dd.AbstractC3116da
    final float e() {
        return this.f6009b;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f6008a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f6009b)) * 1000003) ^ Float.floatToIntBits(this.f6010c)) * 1000003) ^ Float.floatToIntBits(this.f6011d)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.f6008a + ", yMin=" + this.f6009b + ", xMax=" + this.f6010c + ", yMax=" + this.f6011d + ", confidenceScore=0.0}";
    }

    C3092ba(float f10, float f11, float f12, float f13, float f14) {
        this.f6008a = f10;
        this.f6009b = f11;
        this.f6010c = f12;
        this.f6011d = f13;
    }
}
