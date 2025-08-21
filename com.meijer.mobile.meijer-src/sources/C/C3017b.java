package C;

import C.AbstractC3031p;

/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3017b extends AbstractC3031p {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3031p.b f3810a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3031p.a f3811b;

    public boolean equals(Object obj) {
        AbstractC3031p.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3031p) {
            AbstractC3031p abstractC3031p = (AbstractC3031p) obj;
            if (this.f3810a.equals(abstractC3031p.d()) && ((aVar = this.f3811b) != null ? aVar.equals(abstractC3031p.c()) : abstractC3031p.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // C.AbstractC3031p
    public AbstractC3031p.a c() {
        return this.f3811b;
    }

    @Override // C.AbstractC3031p
    public AbstractC3031p.b d() {
        return this.f3810a;
    }

    public int hashCode() {
        int iHashCode = (this.f3810a.hashCode() ^ 1000003) * 1000003;
        AbstractC3031p.a aVar = this.f3811b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f3810a + ", error=" + this.f3811b + "}";
    }

    C3017b(AbstractC3031p.b bVar, AbstractC3031p.a aVar) {
        if (bVar != null) {
            this.f3810a = bVar;
            this.f3811b = aVar;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
