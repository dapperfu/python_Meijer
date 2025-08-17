package rf;

import java.util.List;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class m extends AbstractC16777F.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16777F.e.d.a.b f158494a;

    /* renamed from: b, reason: collision with root package name */
    private final List<AbstractC16777F.c> f158495b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC16777F.c> f158496c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f158497d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC16777F.e.d.a.c f158498e;

    /* renamed from: f, reason: collision with root package name */
    private final List<AbstractC16777F.e.d.a.c> f158499f;

    /* renamed from: g, reason: collision with root package name */
    private final int f158500g;

    static final class b extends AbstractC16777F.e.d.a.AbstractC2449a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC16777F.e.d.a.b f158501a;

        /* renamed from: b, reason: collision with root package name */
        private List<AbstractC16777F.c> f158502b;

        /* renamed from: c, reason: collision with root package name */
        private List<AbstractC16777F.c> f158503c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f158504d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC16777F.e.d.a.c f158505e;

        /* renamed from: f, reason: collision with root package name */
        private List<AbstractC16777F.e.d.a.c> f158506f;

        /* renamed from: g, reason: collision with root package name */
        private int f158507g;

        /* renamed from: h, reason: collision with root package name */
        private byte f158508h;

        b() {
        }

        @Override // rf.AbstractC16777F.e.d.a.AbstractC2449a
        public AbstractC16777F.e.d.a a() {
            AbstractC16777F.e.d.a.b bVar;
            if (this.f158508h == 1 && (bVar = this.f158501a) != null) {
                return new m(bVar, this.f158502b, this.f158503c, this.f158504d, this.f158505e, this.f158506f, this.f158507g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158501a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f158508h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.a.AbstractC2449a
        public AbstractC16777F.e.d.a.AbstractC2449a b(List<AbstractC16777F.e.d.a.c> list) {
            this.f158506f = list;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.AbstractC2449a
        public AbstractC16777F.e.d.a.AbstractC2449a c(Boolean bool) {
            this.f158504d = bool;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.AbstractC2449a
        public AbstractC16777F.e.d.a.AbstractC2449a d(AbstractC16777F.e.d.a.c cVar) {
            this.f158505e = cVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.AbstractC2449a
        public AbstractC16777F.e.d.a.AbstractC2449a e(List<AbstractC16777F.c> list) {
            this.f158502b = list;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.AbstractC2449a
        public AbstractC16777F.e.d.a.AbstractC2449a f(AbstractC16777F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f158501a = bVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.AbstractC2449a
        public AbstractC16777F.e.d.a.AbstractC2449a g(List<AbstractC16777F.c> list) {
            this.f158503c = list;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.AbstractC2449a
        public AbstractC16777F.e.d.a.AbstractC2449a h(int i10) {
            this.f158507g = i10;
            this.f158508h = (byte) (this.f158508h | 1);
            return this;
        }

        private b(AbstractC16777F.e.d.a aVar) {
            this.f158501a = aVar.f();
            this.f158502b = aVar.e();
            this.f158503c = aVar.g();
            this.f158504d = aVar.c();
            this.f158505e = aVar.d();
            this.f158506f = aVar.b();
            this.f158507g = aVar.h();
            this.f158508h = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        List<AbstractC16777F.c> list;
        List<AbstractC16777F.c> list2;
        Boolean bool;
        AbstractC16777F.e.d.a.c cVar;
        List<AbstractC16777F.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.a) {
            AbstractC16777F.e.d.a aVar = (AbstractC16777F.e.d.a) obj;
            if (this.f158494a.equals(aVar.f()) && ((list = this.f158495b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f158496c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f158497d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f158498e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f158499f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f158500g == aVar.h()) {
                return true;
            }
        }
        return false;
    }

    private m(AbstractC16777F.e.d.a.b bVar, List<AbstractC16777F.c> list, List<AbstractC16777F.c> list2, Boolean bool, AbstractC16777F.e.d.a.c cVar, List<AbstractC16777F.e.d.a.c> list3, int i10) {
        this.f158494a = bVar;
        this.f158495b = list;
        this.f158496c = list2;
        this.f158497d = bool;
        this.f158498e = cVar;
        this.f158499f = list3;
        this.f158500g = i10;
    }

    @Override // rf.AbstractC16777F.e.d.a
    public List<AbstractC16777F.e.d.a.c> b() {
        return this.f158499f;
    }

    @Override // rf.AbstractC16777F.e.d.a
    public Boolean c() {
        return this.f158497d;
    }

    @Override // rf.AbstractC16777F.e.d.a
    public AbstractC16777F.e.d.a.c d() {
        return this.f158498e;
    }

    @Override // rf.AbstractC16777F.e.d.a
    public List<AbstractC16777F.c> e() {
        return this.f158495b;
    }

    @Override // rf.AbstractC16777F.e.d.a
    public AbstractC16777F.e.d.a.b f() {
        return this.f158494a;
    }

    @Override // rf.AbstractC16777F.e.d.a
    public List<AbstractC16777F.c> g() {
        return this.f158496c;
    }

    @Override // rf.AbstractC16777F.e.d.a
    public int h() {
        return this.f158500g;
    }

    public int hashCode() {
        int iHashCode = (this.f158494a.hashCode() ^ 1000003) * 1000003;
        List<AbstractC16777F.c> list = this.f158495b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<AbstractC16777F.c> list2 = this.f158496c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f158497d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC16777F.e.d.a.c cVar = this.f158498e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC16777F.e.d.a.c> list3 = this.f158499f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f158500g;
    }

    @Override // rf.AbstractC16777F.e.d.a
    public AbstractC16777F.e.d.a.AbstractC2449a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f158494a + ", customAttributes=" + this.f158495b + ", internalKeys=" + this.f158496c + ", background=" + this.f158497d + ", currentProcessDetails=" + this.f158498e + ", appProcessDetails=" + this.f158499f + ", uiOrientation=" + this.f158500g + "}";
    }
}
