package tf;

import java.util.List;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class m extends AbstractC17251F.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC17251F.e.d.a.b f162940a;

    /* renamed from: b, reason: collision with root package name */
    private final List<AbstractC17251F.c> f162941b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC17251F.c> f162942c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f162943d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC17251F.e.d.a.c f162944e;

    /* renamed from: f, reason: collision with root package name */
    private final List<AbstractC17251F.e.d.a.c> f162945f;

    /* renamed from: g, reason: collision with root package name */
    private final int f162946g;

    static final class b extends AbstractC17251F.e.d.a.AbstractC2555a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC17251F.e.d.a.b f162947a;

        /* renamed from: b, reason: collision with root package name */
        private List<AbstractC17251F.c> f162948b;

        /* renamed from: c, reason: collision with root package name */
        private List<AbstractC17251F.c> f162949c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f162950d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC17251F.e.d.a.c f162951e;

        /* renamed from: f, reason: collision with root package name */
        private List<AbstractC17251F.e.d.a.c> f162952f;

        /* renamed from: g, reason: collision with root package name */
        private int f162953g;

        /* renamed from: h, reason: collision with root package name */
        private byte f162954h;

        b() {
        }

        @Override // tf.AbstractC17251F.e.d.a.AbstractC2555a
        public AbstractC17251F.e.d.a a() {
            AbstractC17251F.e.d.a.b bVar;
            if (this.f162954h == 1 && (bVar = this.f162947a) != null) {
                return new m(bVar, this.f162948b, this.f162949c, this.f162950d, this.f162951e, this.f162952f, this.f162953g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162947a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f162954h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.a.AbstractC2555a
        public AbstractC17251F.e.d.a.AbstractC2555a b(List<AbstractC17251F.e.d.a.c> list) {
            this.f162952f = list;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.AbstractC2555a
        public AbstractC17251F.e.d.a.AbstractC2555a c(Boolean bool) {
            this.f162950d = bool;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.AbstractC2555a
        public AbstractC17251F.e.d.a.AbstractC2555a d(AbstractC17251F.e.d.a.c cVar) {
            this.f162951e = cVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.AbstractC2555a
        public AbstractC17251F.e.d.a.AbstractC2555a e(List<AbstractC17251F.c> list) {
            this.f162948b = list;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.AbstractC2555a
        public AbstractC17251F.e.d.a.AbstractC2555a f(AbstractC17251F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f162947a = bVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.AbstractC2555a
        public AbstractC17251F.e.d.a.AbstractC2555a g(List<AbstractC17251F.c> list) {
            this.f162949c = list;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.AbstractC2555a
        public AbstractC17251F.e.d.a.AbstractC2555a h(int i10) {
            this.f162953g = i10;
            this.f162954h = (byte) (this.f162954h | 1);
            return this;
        }

        private b(AbstractC17251F.e.d.a aVar) {
            this.f162947a = aVar.f();
            this.f162948b = aVar.e();
            this.f162949c = aVar.g();
            this.f162950d = aVar.c();
            this.f162951e = aVar.d();
            this.f162952f = aVar.b();
            this.f162953g = aVar.h();
            this.f162954h = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        List<AbstractC17251F.c> list;
        List<AbstractC17251F.c> list2;
        Boolean bool;
        AbstractC17251F.e.d.a.c cVar;
        List<AbstractC17251F.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.a) {
            AbstractC17251F.e.d.a aVar = (AbstractC17251F.e.d.a) obj;
            if (this.f162940a.equals(aVar.f()) && ((list = this.f162941b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f162942c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f162943d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f162944e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f162945f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f162946g == aVar.h()) {
                return true;
            }
        }
        return false;
    }

    private m(AbstractC17251F.e.d.a.b bVar, List<AbstractC17251F.c> list, List<AbstractC17251F.c> list2, Boolean bool, AbstractC17251F.e.d.a.c cVar, List<AbstractC17251F.e.d.a.c> list3, int i10) {
        this.f162940a = bVar;
        this.f162941b = list;
        this.f162942c = list2;
        this.f162943d = bool;
        this.f162944e = cVar;
        this.f162945f = list3;
        this.f162946g = i10;
    }

    @Override // tf.AbstractC17251F.e.d.a
    public List<AbstractC17251F.e.d.a.c> b() {
        return this.f162945f;
    }

    @Override // tf.AbstractC17251F.e.d.a
    public Boolean c() {
        return this.f162943d;
    }

    @Override // tf.AbstractC17251F.e.d.a
    public AbstractC17251F.e.d.a.c d() {
        return this.f162944e;
    }

    @Override // tf.AbstractC17251F.e.d.a
    public List<AbstractC17251F.c> e() {
        return this.f162941b;
    }

    @Override // tf.AbstractC17251F.e.d.a
    public AbstractC17251F.e.d.a.b f() {
        return this.f162940a;
    }

    @Override // tf.AbstractC17251F.e.d.a
    public List<AbstractC17251F.c> g() {
        return this.f162942c;
    }

    @Override // tf.AbstractC17251F.e.d.a
    public int h() {
        return this.f162946g;
    }

    public int hashCode() {
        int iHashCode = (this.f162940a.hashCode() ^ 1000003) * 1000003;
        List<AbstractC17251F.c> list = this.f162941b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<AbstractC17251F.c> list2 = this.f162942c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f162943d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC17251F.e.d.a.c cVar = this.f162944e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC17251F.e.d.a.c> list3 = this.f162945f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f162946g;
    }

    @Override // tf.AbstractC17251F.e.d.a
    public AbstractC17251F.e.d.a.AbstractC2555a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f162940a + ", customAttributes=" + this.f162941b + ", internalKeys=" + this.f162942c + ", background=" + this.f162943d + ", currentProcessDetails=" + this.f162944e + ", appProcessDetails=" + this.f162945f + ", uiOrientation=" + this.f162946g + "}";
    }
}
