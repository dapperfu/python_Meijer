package rf;

import java.util.List;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class p extends AbstractC16777F.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f158528a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158529b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> f158530c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16777F.e.d.a.b.c f158531d;

    /* renamed from: e, reason: collision with root package name */
    private final int f158532e;

    static final class b extends AbstractC16777F.e.d.a.b.c.AbstractC2453a {

        /* renamed from: a, reason: collision with root package name */
        private String f158533a;

        /* renamed from: b, reason: collision with root package name */
        private String f158534b;

        /* renamed from: c, reason: collision with root package name */
        private List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> f158535c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC16777F.e.d.a.b.c f158536d;

        /* renamed from: e, reason: collision with root package name */
        private int f158537e;

        /* renamed from: f, reason: collision with root package name */
        private byte f158538f;

        @Override // rf.AbstractC16777F.e.d.a.b.c.AbstractC2453a
        public AbstractC16777F.e.d.a.b.c a() {
            String str;
            List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> list;
            if (this.f158538f == 1 && (str = this.f158533a) != null && (list = this.f158535c) != null) {
                return new p(str, this.f158534b, list, this.f158536d, this.f158537e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158533a == null) {
                sb2.append(" type");
            }
            if (this.f158535c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f158538f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.a.b.c.AbstractC2453a
        public AbstractC16777F.e.d.a.b.c.AbstractC2453a b(AbstractC16777F.e.d.a.b.c cVar) {
            this.f158536d = cVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.c.AbstractC2453a
        public AbstractC16777F.e.d.a.b.c.AbstractC2453a c(List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f158535c = list;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.c.AbstractC2453a
        public AbstractC16777F.e.d.a.b.c.AbstractC2453a d(int i10) {
            this.f158537e = i10;
            this.f158538f = (byte) (this.f158538f | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.c.AbstractC2453a
        public AbstractC16777F.e.d.a.b.c.AbstractC2453a e(String str) {
            this.f158534b = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.c.AbstractC2453a
        public AbstractC16777F.e.d.a.b.c.AbstractC2453a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f158533a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC16777F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.a.b.c) {
            AbstractC16777F.e.d.a.b.c cVar2 = (AbstractC16777F.e.d.a.b.c) obj;
            if (this.f158528a.equals(cVar2.f()) && ((str = this.f158529b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f158530c.equals(cVar2.c()) && ((cVar = this.f158531d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f158532e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    private p(String str, String str2, List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> list, AbstractC16777F.e.d.a.b.c cVar, int i10) {
        this.f158528a = str;
        this.f158529b = str2;
        this.f158530c = list;
        this.f158531d = cVar;
        this.f158532e = i10;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.c
    public AbstractC16777F.e.d.a.b.c b() {
        return this.f158531d;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.c
    public List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> c() {
        return this.f158530c;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.c
    public int d() {
        return this.f158532e;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.c
    public String e() {
        return this.f158529b;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.c
    public String f() {
        return this.f158528a;
    }

    public int hashCode() {
        int iHashCode = (this.f158528a.hashCode() ^ 1000003) * 1000003;
        String str = this.f158529b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f158530c.hashCode()) * 1000003;
        AbstractC16777F.e.d.a.b.c cVar = this.f158531d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f158532e;
    }

    public String toString() {
        return "Exception{type=" + this.f158528a + ", reason=" + this.f158529b + ", frames=" + this.f158530c + ", causedBy=" + this.f158531d + ", overflowCount=" + this.f158532e + "}";
    }
}
