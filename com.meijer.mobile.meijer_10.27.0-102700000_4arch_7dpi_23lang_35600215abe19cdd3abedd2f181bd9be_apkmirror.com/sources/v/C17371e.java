package v;

import v.I1;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17371e extends I1.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f164017a;

    /* renamed from: b, reason: collision with root package name */
    private final int f164018b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f164019c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f164020d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I1.b) {
            I1.b bVar = (I1.b) obj;
            if (this.f164017a == bVar.a() && this.f164018b == bVar.b() && this.f164019c == bVar.c() && this.f164020d == bVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // v.I1.b
    int a() {
        return this.f164017a;
    }

    @Override // v.I1.b
    int b() {
        return this.f164018b;
    }

    @Override // v.I1.b
    boolean c() {
        return this.f164019c;
    }

    @Override // v.I1.b
    boolean d() {
        return this.f164020d;
    }

    public int hashCode() {
        return ((((((this.f164017a ^ 1000003) * 1000003) ^ this.f164018b) * 1000003) ^ (this.f164019c ? 1231 : 1237)) * 1000003) ^ (this.f164020d ? 1231 : 1237);
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f164017a + ", requiredMaxBitDepth=" + this.f164018b + ", previewStabilizationOn=" + this.f164019c + ", ultraHdrOn=" + this.f164020d + "}";
    }

    C17371e(int i10, int i11, boolean z10, boolean z11) {
        this.f164017a = i10;
        this.f164018b = i11;
        this.f164019c = z10;
        this.f164020d = z11;
    }
}
