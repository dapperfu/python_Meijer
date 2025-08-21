package tf;

import java.util.List;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class n extends AbstractC17251F.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC17251F.e.d.a.b.AbstractC2562e> f162955a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC17251F.e.d.a.b.c f162956b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC17251F.a f162957c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC17251F.e.d.a.b.AbstractC2560d f162958d;

    /* renamed from: e, reason: collision with root package name */
    private final List<AbstractC17251F.e.d.a.b.AbstractC2556a> f162959e;

    static final class b extends AbstractC17251F.e.d.a.b.AbstractC2558b {

        /* renamed from: a, reason: collision with root package name */
        private List<AbstractC17251F.e.d.a.b.AbstractC2562e> f162960a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC17251F.e.d.a.b.c f162961b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC17251F.a f162962c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC17251F.e.d.a.b.AbstractC2560d f162963d;

        /* renamed from: e, reason: collision with root package name */
        private List<AbstractC17251F.e.d.a.b.AbstractC2556a> f162964e;

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2558b
        public AbstractC17251F.e.d.a.b a() {
            List<AbstractC17251F.e.d.a.b.AbstractC2556a> list;
            AbstractC17251F.e.d.a.b.AbstractC2560d abstractC2560d = this.f162963d;
            if (abstractC2560d != null && (list = this.f162964e) != null) {
                return new n(this.f162960a, this.f162961b, this.f162962c, abstractC2560d, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162963d == null) {
                sb2.append(" signal");
            }
            if (this.f162964e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2558b
        public AbstractC17251F.e.d.a.b.AbstractC2558b b(AbstractC17251F.a aVar) {
            this.f162962c = aVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2558b
        public AbstractC17251F.e.d.a.b.AbstractC2558b c(List<AbstractC17251F.e.d.a.b.AbstractC2556a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f162964e = list;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2558b
        public AbstractC17251F.e.d.a.b.AbstractC2558b d(AbstractC17251F.e.d.a.b.c cVar) {
            this.f162961b = cVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2558b
        public AbstractC17251F.e.d.a.b.AbstractC2558b e(AbstractC17251F.e.d.a.b.AbstractC2560d abstractC2560d) {
            if (abstractC2560d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f162963d = abstractC2560d;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2558b
        public AbstractC17251F.e.d.a.b.AbstractC2558b f(List<AbstractC17251F.e.d.a.b.AbstractC2562e> list) {
            this.f162960a = list;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.a.b) {
            AbstractC17251F.e.d.a.b bVar = (AbstractC17251F.e.d.a.b) obj;
            List<AbstractC17251F.e.d.a.b.AbstractC2562e> list = this.f162955a;
            if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
                AbstractC17251F.e.d.a.b.c cVar = this.f162956b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    AbstractC17251F.a aVar = this.f162957c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f162958d.equals(bVar.e()) && this.f162959e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private n(List<AbstractC17251F.e.d.a.b.AbstractC2562e> list, AbstractC17251F.e.d.a.b.c cVar, AbstractC17251F.a aVar, AbstractC17251F.e.d.a.b.AbstractC2560d abstractC2560d, List<AbstractC17251F.e.d.a.b.AbstractC2556a> list2) {
        this.f162955a = list;
        this.f162956b = cVar;
        this.f162957c = aVar;
        this.f162958d = abstractC2560d;
        this.f162959e = list2;
    }

    @Override // tf.AbstractC17251F.e.d.a.b
    public AbstractC17251F.a b() {
        return this.f162957c;
    }

    @Override // tf.AbstractC17251F.e.d.a.b
    public List<AbstractC17251F.e.d.a.b.AbstractC2556a> c() {
        return this.f162959e;
    }

    @Override // tf.AbstractC17251F.e.d.a.b
    public AbstractC17251F.e.d.a.b.c d() {
        return this.f162956b;
    }

    @Override // tf.AbstractC17251F.e.d.a.b
    public AbstractC17251F.e.d.a.b.AbstractC2560d e() {
        return this.f162958d;
    }

    @Override // tf.AbstractC17251F.e.d.a.b
    public List<AbstractC17251F.e.d.a.b.AbstractC2562e> f() {
        return this.f162955a;
    }

    public int hashCode() {
        List<AbstractC17251F.e.d.a.b.AbstractC2562e> list = this.f162955a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC17251F.e.d.a.b.c cVar = this.f162956b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        AbstractC17251F.a aVar = this.f162957c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f162958d.hashCode()) * 1000003) ^ this.f162959e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f162955a + ", exception=" + this.f162956b + ", appExitInfo=" + this.f162957c + ", signal=" + this.f162958d + ", binaries=" + this.f162959e + "}";
    }
}
