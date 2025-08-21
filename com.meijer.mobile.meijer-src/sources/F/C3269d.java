package F;

/* renamed from: F.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3269d extends f0 {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f8706a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f8707b;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f8708c;

    /* renamed from: d, reason: collision with root package name */
    private final e0 f8709d;

    public boolean equals(Object obj) {
        e0 e0Var;
        e0 e0Var2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f8706a.equals(f0Var.e()) && this.f8707b.equals(f0Var.c()) && ((e0Var = this.f8708c) != null ? e0Var.equals(f0Var.b()) : f0Var.b() == null) && ((e0Var2 = this.f8709d) != null ? e0Var2.equals(f0Var.d()) : f0Var.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // F.f0
    public e0 b() {
        return this.f8708c;
    }

    @Override // F.f0
    public e0 c() {
        return this.f8707b;
    }

    @Override // F.f0
    public e0 d() {
        return this.f8709d;
    }

    @Override // F.f0
    public e0 e() {
        return this.f8706a;
    }

    public int hashCode() {
        int iHashCode = (((this.f8706a.hashCode() ^ 1000003) * 1000003) ^ this.f8707b.hashCode()) * 1000003;
        e0 e0Var = this.f8708c;
        int iHashCode2 = (iHashCode ^ (e0Var == null ? 0 : e0Var.hashCode())) * 1000003;
        e0 e0Var2 = this.f8709d;
        return iHashCode2 ^ (e0Var2 != null ? e0Var2.hashCode() : 0);
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f8706a + ", imageCaptureOutputSurface=" + this.f8707b + ", imageAnalysisOutputSurface=" + this.f8708c + ", postviewOutputSurface=" + this.f8709d + "}";
    }

    C3269d(e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4) {
        if (e0Var != null) {
            this.f8706a = e0Var;
            if (e0Var2 != null) {
                this.f8707b = e0Var2;
                this.f8708c = e0Var3;
                this.f8709d = e0Var4;
                return;
            }
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        throw new NullPointerException("Null previewOutputSurface");
    }
}
