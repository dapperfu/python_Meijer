package P;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Q.f f24417a;

    /* renamed from: b, reason: collision with root package name */
    private final Q.f f24418b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f24417a.equals(dVar.a()) && this.f24418b.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // P.d
    public Q.f a() {
        return this.f24417a;
    }

    @Override // P.d
    public Q.f b() {
        return this.f24418b;
    }

    public int hashCode() {
        return ((this.f24417a.hashCode() ^ 1000003) * 1000003) ^ this.f24418b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f24417a + ", secondaryOutConfig=" + this.f24418b + "}";
    }

    a(Q.f fVar, Q.f fVar2) {
        if (fVar != null) {
            this.f24417a = fVar;
            if (fVar2 != null) {
                this.f24418b = fVar2;
                return;
            }
            throw new NullPointerException("Null secondaryOutConfig");
        }
        throw new NullPointerException("Null primaryOutConfig");
    }
}
