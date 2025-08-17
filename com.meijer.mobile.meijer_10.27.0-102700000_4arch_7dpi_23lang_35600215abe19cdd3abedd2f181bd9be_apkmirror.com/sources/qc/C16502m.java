package qc;

import qc.AbstractC16512w;

/* renamed from: qc.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16502m extends AbstractC16512w {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16512w.c f157123a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16512w.b f157124b;

    /* renamed from: qc.m$b */
    static final class b extends AbstractC16512w.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC16512w.c f157125a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC16512w.b f157126b;

        @Override // qc.AbstractC16512w.a
        public AbstractC16512w a() {
            return new C16502m(this.f157125a, this.f157126b);
        }

        @Override // qc.AbstractC16512w.a
        public AbstractC16512w.a b(AbstractC16512w.b bVar) {
            this.f157126b = bVar;
            return this;
        }

        @Override // qc.AbstractC16512w.a
        public AbstractC16512w.a c(AbstractC16512w.c cVar) {
            this.f157125a = cVar;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16512w) {
            AbstractC16512w abstractC16512w = (AbstractC16512w) obj;
            AbstractC16512w.c cVar = this.f157123a;
            if (cVar != null ? cVar.equals(abstractC16512w.c()) : abstractC16512w.c() == null) {
                AbstractC16512w.b bVar = this.f157124b;
                if (bVar != null ? bVar.equals(abstractC16512w.b()) : abstractC16512w.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private C16502m(AbstractC16512w.c cVar, AbstractC16512w.b bVar) {
        this.f157123a = cVar;
        this.f157124b = bVar;
    }

    @Override // qc.AbstractC16512w
    public AbstractC16512w.b b() {
        return this.f157124b;
    }

    @Override // qc.AbstractC16512w
    public AbstractC16512w.c c() {
        return this.f157123a;
    }

    public int hashCode() {
        AbstractC16512w.c cVar = this.f157123a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC16512w.b bVar = this.f157124b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f157123a + ", mobileSubtype=" + this.f157124b + "}";
    }
}
