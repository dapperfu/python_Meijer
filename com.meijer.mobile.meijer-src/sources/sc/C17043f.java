package sc;

import sc.AbstractC17053p;

/* renamed from: sc.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17043f extends AbstractC17053p {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC17056s f160193a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC17053p.b f160194b;

    /* renamed from: sc.f$b */
    static final class b extends AbstractC17053p.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC17056s f160195a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC17053p.b f160196b;

        @Override // sc.AbstractC17053p.a
        public AbstractC17053p a() {
            return new C17043f(this.f160195a, this.f160196b);
        }

        @Override // sc.AbstractC17053p.a
        public AbstractC17053p.a b(AbstractC17056s abstractC17056s) {
            this.f160195a = abstractC17056s;
            return this;
        }

        @Override // sc.AbstractC17053p.a
        public AbstractC17053p.a c(AbstractC17053p.b bVar) {
            this.f160196b = bVar;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17053p) {
            AbstractC17053p abstractC17053p = (AbstractC17053p) obj;
            AbstractC17056s abstractC17056s = this.f160193a;
            if (abstractC17056s != null ? abstractC17056s.equals(abstractC17053p.b()) : abstractC17053p.b() == null) {
                AbstractC17053p.b bVar = this.f160194b;
                if (bVar != null ? bVar.equals(abstractC17053p.c()) : abstractC17053p.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private C17043f(AbstractC17056s abstractC17056s, AbstractC17053p.b bVar) {
        this.f160193a = abstractC17056s;
        this.f160194b = bVar;
    }

    @Override // sc.AbstractC17053p
    public AbstractC17056s b() {
        return this.f160193a;
    }

    @Override // sc.AbstractC17053p
    public AbstractC17053p.b c() {
        return this.f160194b;
    }

    public int hashCode() {
        AbstractC17056s abstractC17056s = this.f160193a;
        int iHashCode = ((abstractC17056s == null ? 0 : abstractC17056s.hashCode()) ^ 1000003) * 1000003;
        AbstractC17053p.b bVar = this.f160194b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f160193a + ", productIdOrigin=" + this.f160194b + "}";
    }
}
