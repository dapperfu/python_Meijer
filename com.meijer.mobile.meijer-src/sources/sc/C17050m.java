package sc;

import sc.AbstractC17060w;

/* renamed from: sc.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17050m extends AbstractC17060w {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC17060w.c f160238a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC17060w.b f160239b;

    /* renamed from: sc.m$b */
    static final class b extends AbstractC17060w.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC17060w.c f160240a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC17060w.b f160241b;

        @Override // sc.AbstractC17060w.a
        public AbstractC17060w a() {
            return new C17050m(this.f160240a, this.f160241b);
        }

        @Override // sc.AbstractC17060w.a
        public AbstractC17060w.a b(AbstractC17060w.b bVar) {
            this.f160241b = bVar;
            return this;
        }

        @Override // sc.AbstractC17060w.a
        public AbstractC17060w.a c(AbstractC17060w.c cVar) {
            this.f160240a = cVar;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17060w) {
            AbstractC17060w abstractC17060w = (AbstractC17060w) obj;
            AbstractC17060w.c cVar = this.f160238a;
            if (cVar != null ? cVar.equals(abstractC17060w.c()) : abstractC17060w.c() == null) {
                AbstractC17060w.b bVar = this.f160239b;
                if (bVar != null ? bVar.equals(abstractC17060w.b()) : abstractC17060w.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private C17050m(AbstractC17060w.c cVar, AbstractC17060w.b bVar) {
        this.f160238a = cVar;
        this.f160239b = bVar;
    }

    @Override // sc.AbstractC17060w
    public AbstractC17060w.b b() {
        return this.f160239b;
    }

    @Override // sc.AbstractC17060w
    public AbstractC17060w.c c() {
        return this.f160238a;
    }

    public int hashCode() {
        AbstractC17060w.c cVar = this.f160238a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC17060w.b bVar = this.f160239b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f160238a + ", mobileSubtype=" + this.f160239b + "}";
    }
}
