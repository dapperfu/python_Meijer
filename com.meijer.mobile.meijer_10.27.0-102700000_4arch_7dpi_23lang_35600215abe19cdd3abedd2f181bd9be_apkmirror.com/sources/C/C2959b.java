package C;

import C.AbstractC2973p;

/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2959b extends AbstractC2973p {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2973p.b f3352a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2973p.a f3353b;

    public boolean equals(Object obj) {
        AbstractC2973p.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2973p) {
            AbstractC2973p abstractC2973p = (AbstractC2973p) obj;
            if (this.f3352a.equals(abstractC2973p.d()) && ((aVar = this.f3353b) != null ? aVar.equals(abstractC2973p.c()) : abstractC2973p.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // C.AbstractC2973p
    public AbstractC2973p.a c() {
        return this.f3353b;
    }

    @Override // C.AbstractC2973p
    public AbstractC2973p.b d() {
        return this.f3352a;
    }

    public int hashCode() {
        int iHashCode = (this.f3352a.hashCode() ^ 1000003) * 1000003;
        AbstractC2973p.a aVar = this.f3353b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f3352a + ", error=" + this.f3353b + "}";
    }

    C2959b(AbstractC2973p.b bVar, AbstractC2973p.a aVar) {
        if (bVar != null) {
            this.f3352a = bVar;
            this.f3353b = aVar;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
