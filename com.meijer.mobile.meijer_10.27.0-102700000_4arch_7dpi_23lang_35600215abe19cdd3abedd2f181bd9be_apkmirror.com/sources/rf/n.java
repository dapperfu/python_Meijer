package rf;

import java.util.List;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class n extends AbstractC16777F.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC16777F.e.d.a.b.AbstractC2456e> f158509a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16777F.e.d.a.b.c f158510b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16777F.a f158511c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16777F.e.d.a.b.AbstractC2454d f158512d;

    /* renamed from: e, reason: collision with root package name */
    private final List<AbstractC16777F.e.d.a.b.AbstractC2450a> f158513e;

    static final class b extends AbstractC16777F.e.d.a.b.AbstractC2452b {

        /* renamed from: a, reason: collision with root package name */
        private List<AbstractC16777F.e.d.a.b.AbstractC2456e> f158514a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC16777F.e.d.a.b.c f158515b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC16777F.a f158516c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC16777F.e.d.a.b.AbstractC2454d f158517d;

        /* renamed from: e, reason: collision with root package name */
        private List<AbstractC16777F.e.d.a.b.AbstractC2450a> f158518e;

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2452b
        public AbstractC16777F.e.d.a.b a() {
            List<AbstractC16777F.e.d.a.b.AbstractC2450a> list;
            AbstractC16777F.e.d.a.b.AbstractC2454d abstractC2454d = this.f158517d;
            if (abstractC2454d != null && (list = this.f158518e) != null) {
                return new n(this.f158514a, this.f158515b, this.f158516c, abstractC2454d, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158517d == null) {
                sb2.append(" signal");
            }
            if (this.f158518e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2452b
        public AbstractC16777F.e.d.a.b.AbstractC2452b b(AbstractC16777F.a aVar) {
            this.f158516c = aVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2452b
        public AbstractC16777F.e.d.a.b.AbstractC2452b c(List<AbstractC16777F.e.d.a.b.AbstractC2450a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f158518e = list;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2452b
        public AbstractC16777F.e.d.a.b.AbstractC2452b d(AbstractC16777F.e.d.a.b.c cVar) {
            this.f158515b = cVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2452b
        public AbstractC16777F.e.d.a.b.AbstractC2452b e(AbstractC16777F.e.d.a.b.AbstractC2454d abstractC2454d) {
            if (abstractC2454d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f158517d = abstractC2454d;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2452b
        public AbstractC16777F.e.d.a.b.AbstractC2452b f(List<AbstractC16777F.e.d.a.b.AbstractC2456e> list) {
            this.f158514a = list;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.a.b) {
            AbstractC16777F.e.d.a.b bVar = (AbstractC16777F.e.d.a.b) obj;
            List<AbstractC16777F.e.d.a.b.AbstractC2456e> list = this.f158509a;
            if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
                AbstractC16777F.e.d.a.b.c cVar = this.f158510b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    AbstractC16777F.a aVar = this.f158511c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f158512d.equals(bVar.e()) && this.f158513e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private n(List<AbstractC16777F.e.d.a.b.AbstractC2456e> list, AbstractC16777F.e.d.a.b.c cVar, AbstractC16777F.a aVar, AbstractC16777F.e.d.a.b.AbstractC2454d abstractC2454d, List<AbstractC16777F.e.d.a.b.AbstractC2450a> list2) {
        this.f158509a = list;
        this.f158510b = cVar;
        this.f158511c = aVar;
        this.f158512d = abstractC2454d;
        this.f158513e = list2;
    }

    @Override // rf.AbstractC16777F.e.d.a.b
    public AbstractC16777F.a b() {
        return this.f158511c;
    }

    @Override // rf.AbstractC16777F.e.d.a.b
    public List<AbstractC16777F.e.d.a.b.AbstractC2450a> c() {
        return this.f158513e;
    }

    @Override // rf.AbstractC16777F.e.d.a.b
    public AbstractC16777F.e.d.a.b.c d() {
        return this.f158510b;
    }

    @Override // rf.AbstractC16777F.e.d.a.b
    public AbstractC16777F.e.d.a.b.AbstractC2454d e() {
        return this.f158512d;
    }

    @Override // rf.AbstractC16777F.e.d.a.b
    public List<AbstractC16777F.e.d.a.b.AbstractC2456e> f() {
        return this.f158509a;
    }

    public int hashCode() {
        List<AbstractC16777F.e.d.a.b.AbstractC2456e> list = this.f158509a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC16777F.e.d.a.b.c cVar = this.f158510b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        AbstractC16777F.a aVar = this.f158511c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f158512d.hashCode()) * 1000003) ^ this.f158513e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f158509a + ", exception=" + this.f158510b + ", appExitInfo=" + this.f158511c + ", signal=" + this.f158512d + ", binaries=" + this.f158513e + "}";
    }
}
