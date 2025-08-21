package sc;

import sc.AbstractC17052o;

/* renamed from: sc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17042e extends AbstractC17052o {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC17052o.b f160189a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC17038a f160190b;

    /* renamed from: sc.e$b */
    static final class b extends AbstractC17052o.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC17052o.b f160191a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC17038a f160192b;

        @Override // sc.AbstractC17052o.a
        public AbstractC17052o a() {
            return new C17042e(this.f160191a, this.f160192b);
        }

        @Override // sc.AbstractC17052o.a
        public AbstractC17052o.a b(AbstractC17038a abstractC17038a) {
            this.f160192b = abstractC17038a;
            return this;
        }

        @Override // sc.AbstractC17052o.a
        public AbstractC17052o.a c(AbstractC17052o.b bVar) {
            this.f160191a = bVar;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17052o) {
            AbstractC17052o abstractC17052o = (AbstractC17052o) obj;
            AbstractC17052o.b bVar = this.f160189a;
            if (bVar != null ? bVar.equals(abstractC17052o.c()) : abstractC17052o.c() == null) {
                AbstractC17038a abstractC17038a = this.f160190b;
                if (abstractC17038a != null ? abstractC17038a.equals(abstractC17052o.b()) : abstractC17052o.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private C17042e(AbstractC17052o.b bVar, AbstractC17038a abstractC17038a) {
        this.f160189a = bVar;
        this.f160190b = abstractC17038a;
    }

    @Override // sc.AbstractC17052o
    public AbstractC17038a b() {
        return this.f160190b;
    }

    @Override // sc.AbstractC17052o
    public AbstractC17052o.b c() {
        return this.f160189a;
    }

    public int hashCode() {
        AbstractC17052o.b bVar = this.f160189a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC17038a abstractC17038a = this.f160190b;
        return iHashCode ^ (abstractC17038a != null ? abstractC17038a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f160189a + ", androidClientInfo=" + this.f160190b + "}";
    }
}
