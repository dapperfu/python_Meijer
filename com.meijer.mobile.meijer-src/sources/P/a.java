package P;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final Q.f f25115a;

    /* renamed from: b, reason: collision with root package name */
    private final Q.f f25116b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f25115a.equals(dVar.a()) && this.f25116b.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // P.d
    public Q.f a() {
        return this.f25115a;
    }

    @Override // P.d
    public Q.f b() {
        return this.f25116b;
    }

    public int hashCode() {
        return ((this.f25115a.hashCode() ^ 1000003) * 1000003) ^ this.f25116b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f25115a + ", secondaryOutConfig=" + this.f25116b + "}";
    }

    a(Q.f fVar, Q.f fVar2) {
        if (fVar != null) {
            this.f25115a = fVar;
            if (fVar2 != null) {
                this.f25116b = fVar2;
                return;
            }
            throw new NullPointerException("Null secondaryOutConfig");
        }
        throw new NullPointerException("Null primaryOutConfig");
    }
}
