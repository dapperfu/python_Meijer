package F;

/* renamed from: F.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3607d extends f0 {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f9939a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f9940b;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f9941c;

    /* renamed from: d, reason: collision with root package name */
    private final e0 f9942d;

    public boolean equals(Object obj) {
        e0 e0Var;
        e0 e0Var2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f9939a.equals(f0Var.e()) && this.f9940b.equals(f0Var.c()) && ((e0Var = this.f9941c) != null ? e0Var.equals(f0Var.b()) : f0Var.b() == null) && ((e0Var2 = this.f9942d) != null ? e0Var2.equals(f0Var.d()) : f0Var.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // F.f0
    public e0 b() {
        return this.f9941c;
    }

    @Override // F.f0
    public e0 c() {
        return this.f9940b;
    }

    @Override // F.f0
    public e0 d() {
        return this.f9942d;
    }

    @Override // F.f0
    public e0 e() {
        return this.f9939a;
    }

    public int hashCode() {
        int iHashCode = (((this.f9939a.hashCode() ^ 1000003) * 1000003) ^ this.f9940b.hashCode()) * 1000003;
        e0 e0Var = this.f9941c;
        int iHashCode2 = (iHashCode ^ (e0Var == null ? 0 : e0Var.hashCode())) * 1000003;
        e0 e0Var2 = this.f9942d;
        return iHashCode2 ^ (e0Var2 != null ? e0Var2.hashCode() : 0);
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f9939a + ", imageCaptureOutputSurface=" + this.f9940b + ", imageAnalysisOutputSurface=" + this.f9941c + ", postviewOutputSurface=" + this.f9942d + "}";
    }

    C3607d(e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4) {
        if (e0Var != null) {
            this.f9939a = e0Var;
            if (e0Var2 != null) {
                this.f9940b = e0Var2;
                this.f9941c = e0Var3;
                this.f9942d = e0Var4;
                return;
            }
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        throw new NullPointerException("Null previewOutputSurface");
    }
}
