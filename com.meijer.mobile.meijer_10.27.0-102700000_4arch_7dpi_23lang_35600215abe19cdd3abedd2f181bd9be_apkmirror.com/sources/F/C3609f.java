package F;

import F.v0;

/* renamed from: F.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3609f extends v0 {

    /* renamed from: a, reason: collision with root package name */
    private final v0.b f9944a;

    /* renamed from: b, reason: collision with root package name */
    private final v0.a f9945b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9946c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (this.f9944a.equals(v0Var.d()) && this.f9945b.equals(v0Var.c()) && this.f9946c == v0Var.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // F.v0
    public v0.a c() {
        return this.f9945b;
    }

    @Override // F.v0
    public v0.b d() {
        return this.f9944a;
    }

    @Override // F.v0
    public long f() {
        return this.f9946c;
    }

    public int hashCode() {
        int iHashCode = (((this.f9944a.hashCode() ^ 1000003) * 1000003) ^ this.f9945b.hashCode()) * 1000003;
        long j10 = this.f9946c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f9944a + ", configSize=" + this.f9945b + ", streamUseCase=" + this.f9946c + "}";
    }

    C3609f(v0.b bVar, v0.a aVar, long j10) {
        if (bVar != null) {
            this.f9944a = bVar;
            if (aVar != null) {
                this.f9945b = aVar;
                this.f9946c = j10;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }
}
