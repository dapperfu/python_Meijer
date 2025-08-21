package tf;

import java.util.List;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class p extends AbstractC17251F.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f162974a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162975b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> f162976c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC17251F.e.d.a.b.c f162977d;

    /* renamed from: e, reason: collision with root package name */
    private final int f162978e;

    static final class b extends AbstractC17251F.e.d.a.b.c.AbstractC2559a {

        /* renamed from: a, reason: collision with root package name */
        private String f162979a;

        /* renamed from: b, reason: collision with root package name */
        private String f162980b;

        /* renamed from: c, reason: collision with root package name */
        private List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> f162981c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC17251F.e.d.a.b.c f162982d;

        /* renamed from: e, reason: collision with root package name */
        private int f162983e;

        /* renamed from: f, reason: collision with root package name */
        private byte f162984f;

        @Override // tf.AbstractC17251F.e.d.a.b.c.AbstractC2559a
        public AbstractC17251F.e.d.a.b.c a() {
            String str;
            List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> list;
            if (this.f162984f == 1 && (str = this.f162979a) != null && (list = this.f162981c) != null) {
                return new p(str, this.f162980b, list, this.f162982d, this.f162983e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162979a == null) {
                sb2.append(" type");
            }
            if (this.f162981c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f162984f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.a.b.c.AbstractC2559a
        public AbstractC17251F.e.d.a.b.c.AbstractC2559a b(AbstractC17251F.e.d.a.b.c cVar) {
            this.f162982d = cVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.c.AbstractC2559a
        public AbstractC17251F.e.d.a.b.c.AbstractC2559a c(List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f162981c = list;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.c.AbstractC2559a
        public AbstractC17251F.e.d.a.b.c.AbstractC2559a d(int i10) {
            this.f162983e = i10;
            this.f162984f = (byte) (this.f162984f | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.c.AbstractC2559a
        public AbstractC17251F.e.d.a.b.c.AbstractC2559a e(String str) {
            this.f162980b = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.c.AbstractC2559a
        public AbstractC17251F.e.d.a.b.c.AbstractC2559a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f162979a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC17251F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.a.b.c) {
            AbstractC17251F.e.d.a.b.c cVar2 = (AbstractC17251F.e.d.a.b.c) obj;
            if (this.f162974a.equals(cVar2.f()) && ((str = this.f162975b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f162976c.equals(cVar2.c()) && ((cVar = this.f162977d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f162978e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    private p(String str, String str2, List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> list, AbstractC17251F.e.d.a.b.c cVar, int i10) {
        this.f162974a = str;
        this.f162975b = str2;
        this.f162976c = list;
        this.f162977d = cVar;
        this.f162978e = i10;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.c
    public AbstractC17251F.e.d.a.b.c b() {
        return this.f162977d;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.c
    public List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> c() {
        return this.f162976c;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.c
    public int d() {
        return this.f162978e;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.c
    public String e() {
        return this.f162975b;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.c
    public String f() {
        return this.f162974a;
    }

    public int hashCode() {
        int iHashCode = (this.f162974a.hashCode() ^ 1000003) * 1000003;
        String str = this.f162975b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f162976c.hashCode()) * 1000003;
        AbstractC17251F.e.d.a.b.c cVar = this.f162977d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f162978e;
    }

    public String toString() {
        return "Exception{type=" + this.f162974a + ", reason=" + this.f162975b + ", frames=" + this.f162976c + ", causedBy=" + this.f162977d + ", overflowCount=" + this.f162978e + "}";
    }
}
