package qc;

import qc.AbstractC16504o;

/* renamed from: qc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16494e extends AbstractC16504o {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16504o.b f157074a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16490a f157075b;

    /* renamed from: qc.e$b */
    static final class b extends AbstractC16504o.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC16504o.b f157076a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC16490a f157077b;

        @Override // qc.AbstractC16504o.a
        public AbstractC16504o a() {
            return new C16494e(this.f157076a, this.f157077b);
        }

        @Override // qc.AbstractC16504o.a
        public AbstractC16504o.a b(AbstractC16490a abstractC16490a) {
            this.f157077b = abstractC16490a;
            return this;
        }

        @Override // qc.AbstractC16504o.a
        public AbstractC16504o.a c(AbstractC16504o.b bVar) {
            this.f157076a = bVar;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16504o) {
            AbstractC16504o abstractC16504o = (AbstractC16504o) obj;
            AbstractC16504o.b bVar = this.f157074a;
            if (bVar != null ? bVar.equals(abstractC16504o.c()) : abstractC16504o.c() == null) {
                AbstractC16490a abstractC16490a = this.f157075b;
                if (abstractC16490a != null ? abstractC16490a.equals(abstractC16504o.b()) : abstractC16504o.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    private C16494e(AbstractC16504o.b bVar, AbstractC16490a abstractC16490a) {
        this.f157074a = bVar;
        this.f157075b = abstractC16490a;
    }

    @Override // qc.AbstractC16504o
    public AbstractC16490a b() {
        return this.f157075b;
    }

    @Override // qc.AbstractC16504o
    public AbstractC16504o.b c() {
        return this.f157074a;
    }

    public int hashCode() {
        AbstractC16504o.b bVar = this.f157074a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC16490a abstractC16490a = this.f157075b;
        return iHashCode ^ (abstractC16490a != null ? abstractC16490a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f157074a + ", androidClientInfo=" + this.f157075b + "}";
    }
}
