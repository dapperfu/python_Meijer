package F;

import F.v0;

/* renamed from: F.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3271f extends v0 {

    /* renamed from: a, reason: collision with root package name */
    private final v0.b f8711a;

    /* renamed from: b, reason: collision with root package name */
    private final v0.a f8712b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8713c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (this.f8711a.equals(v0Var.d()) && this.f8712b.equals(v0Var.c()) && this.f8713c == v0Var.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // F.v0
    public v0.a c() {
        return this.f8712b;
    }

    @Override // F.v0
    public v0.b d() {
        return this.f8711a;
    }

    @Override // F.v0
    public long f() {
        return this.f8713c;
    }

    public int hashCode() {
        int iHashCode = (((this.f8711a.hashCode() ^ 1000003) * 1000003) ^ this.f8712b.hashCode()) * 1000003;
        long j10 = this.f8713c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f8711a + ", configSize=" + this.f8712b + ", streamUseCase=" + this.f8713c + "}";
    }

    C3271f(v0.b bVar, v0.a aVar, long j10) {
        if (bVar != null) {
            this.f8711a = bVar;
            if (aVar != null) {
                this.f8712b = aVar;
                this.f8713c = j10;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }
}
