package qc;

import qc.AbstractC16505p;

/* renamed from: qc.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16495f extends AbstractC16505p {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16508s f157078a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16505p.b f157079b;

    /* renamed from: qc.f$b */
    static final class b extends AbstractC16505p.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC16508s f157080a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC16505p.b f157081b;

        @Override // qc.AbstractC16505p.a
        public AbstractC16505p a() {
            return new C16495f(this.f157080a, this.f157081b);
        }

        @Override // qc.AbstractC16505p.a
        public AbstractC16505p.a b(AbstractC16508s abstractC16508s) {
            this.f157080a = abstractC16508s;
            return this;
        }

        @Override // qc.AbstractC16505p.a
        public AbstractC16505p.a c(AbstractC16505p.b bVar) {
            this.f157081b = bVar;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16505p) {
            AbstractC16505p abstractC16505p = (AbstractC16505p) obj;
            AbstractC16508s abstractC16508s = this.f157078a;
            if (abstractC16508s != null ? abstractC16508s.equals(abstractC16505p.b()) : abstractC16505p.b() == null) {
                AbstractC16505p.b bVar = this.f157079b;
                if (bVar != null ? bVar.equals(abstractC16505p.c()) : abstractC16505p.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private C16495f(AbstractC16508s abstractC16508s, AbstractC16505p.b bVar) {
        this.f157078a = abstractC16508s;
        this.f157079b = bVar;
    }

    @Override // qc.AbstractC16505p
    public AbstractC16508s b() {
        return this.f157078a;
    }

    @Override // qc.AbstractC16505p
    public AbstractC16505p.b c() {
        return this.f157079b;
    }

    public int hashCode() {
        AbstractC16508s abstractC16508s = this.f157078a;
        int iHashCode = ((abstractC16508s == null ? 0 : abstractC16508s.hashCode()) ^ 1000003) * 1000003;
        AbstractC16505p.b bVar = this.f157079b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f157078a + ", productIdOrigin=" + this.f157079b + "}";
    }
}
