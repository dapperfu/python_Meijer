package Fd;

/* renamed from: Fd.ba, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3314ba extends AbstractC3338da {

    /* renamed from: a, reason: collision with root package name */
    private final float f10041a;

    /* renamed from: b, reason: collision with root package name */
    private final float f10042b;

    /* renamed from: c, reason: collision with root package name */
    private final float f10043c;

    /* renamed from: d, reason: collision with root package name */
    private final float f10044d;

    @Override // Fd.AbstractC3338da
    final float a() {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3338da) {
            AbstractC3338da abstractC3338da = (AbstractC3338da) obj;
            if (Float.floatToIntBits(this.f10041a) == Float.floatToIntBits(abstractC3338da.c()) && Float.floatToIntBits(this.f10042b) == Float.floatToIntBits(abstractC3338da.e()) && Float.floatToIntBits(this.f10043c) == Float.floatToIntBits(abstractC3338da.b()) && Float.floatToIntBits(this.f10044d) == Float.floatToIntBits(abstractC3338da.d())) {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                abstractC3338da.a();
                if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Fd.AbstractC3338da
    final float b() {
        return this.f10043c;
    }

    @Override // Fd.AbstractC3338da
    final float c() {
        return this.f10041a;
    }

    @Override // Fd.AbstractC3338da
    final float d() {
        return this.f10044d;
    }

    @Override // Fd.AbstractC3338da
    final float e() {
        return this.f10042b;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f10041a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f10042b)) * 1000003) ^ Float.floatToIntBits(this.f10043c)) * 1000003) ^ Float.floatToIntBits(this.f10044d)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.f10041a + ", yMin=" + this.f10042b + ", xMax=" + this.f10043c + ", yMax=" + this.f10044d + ", confidenceScore=0.0}";
    }

    C3314ba(float f10, float f11, float f12, float f13, float f14) {
        this.f10041a = f10;
        this.f10042b = f11;
        this.f10043c = f12;
        this.f10044d = f13;
    }
}
