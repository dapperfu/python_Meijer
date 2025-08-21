package v;

import v.I1;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17510e extends I1.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f165051a;

    /* renamed from: b, reason: collision with root package name */
    private final int f165052b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f165053c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f165054d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I1.b) {
            I1.b bVar = (I1.b) obj;
            if (this.f165051a == bVar.a() && this.f165052b == bVar.b() && this.f165053c == bVar.c() && this.f165054d == bVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // v.I1.b
    int a() {
        return this.f165051a;
    }

    @Override // v.I1.b
    int b() {
        return this.f165052b;
    }

    @Override // v.I1.b
    boolean c() {
        return this.f165053c;
    }

    @Override // v.I1.b
    boolean d() {
        return this.f165054d;
    }

    public int hashCode() {
        return ((((((this.f165051a ^ 1000003) * 1000003) ^ this.f165052b) * 1000003) ^ (this.f165053c ? 1231 : 1237)) * 1000003) ^ (this.f165054d ? 1231 : 1237);
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f165051a + ", requiredMaxBitDepth=" + this.f165052b + ", previewStabilizationOn=" + this.f165053c + ", ultraHdrOn=" + this.f165054d + "}";
    }

    C17510e(int i10, int i11, boolean z10, boolean z11) {
        this.f165051a = i10;
        this.f165052b = i11;
        this.f165053c = z10;
        this.f165054d = z11;
    }
}
