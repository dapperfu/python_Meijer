package sc;

import java.util.List;
import sc.AbstractC17058u;

/* renamed from: sc.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17048k extends AbstractC17058u {

    /* renamed from: a, reason: collision with root package name */
    private final long f160223a;

    /* renamed from: b, reason: collision with root package name */
    private final long f160224b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC17052o f160225c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f160226d;

    /* renamed from: e, reason: collision with root package name */
    private final String f160227e;

    /* renamed from: f, reason: collision with root package name */
    private final List<AbstractC17057t> f160228f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC17061x f160229g;

    /* renamed from: sc.k$b */
    static final class b extends AbstractC17058u.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f160230a;

        /* renamed from: b, reason: collision with root package name */
        private Long f160231b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC17052o f160232c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f160233d;

        /* renamed from: e, reason: collision with root package name */
        private String f160234e;

        /* renamed from: f, reason: collision with root package name */
        private List<AbstractC17057t> f160235f;

        /* renamed from: g, reason: collision with root package name */
        private EnumC17061x f160236g;

        @Override // sc.AbstractC17058u.a
        public AbstractC17058u a() {
            String str = "";
            if (this.f160230a == null) {
                str = " requestTimeMs";
            }
            if (this.f160231b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C17048k(this.f160230a.longValue(), this.f160231b.longValue(), this.f160232c, this.f160233d, this.f160234e, this.f160235f, this.f160236g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // sc.AbstractC17058u.a
        public AbstractC17058u.a b(AbstractC17052o abstractC17052o) {
            this.f160232c = abstractC17052o;
            return this;
        }

        @Override // sc.AbstractC17058u.a
        public AbstractC17058u.a c(List<AbstractC17057t> list) {
            this.f160235f = list;
            return this;
        }

        @Override // sc.AbstractC17058u.a
        AbstractC17058u.a d(Integer num) {
            this.f160233d = num;
            return this;
        }

        @Override // sc.AbstractC17058u.a
        AbstractC17058u.a e(String str) {
            this.f160234e = str;
            return this;
        }

        @Override // sc.AbstractC17058u.a
        public AbstractC17058u.a f(EnumC17061x enumC17061x) {
            this.f160236g = enumC17061x;
            return this;
        }

        b() {
        }

        @Override // sc.AbstractC17058u.a
        public AbstractC17058u.a g(long j10) {
            this.f160230a = Long.valueOf(j10);
            return this;
        }

        @Override // sc.AbstractC17058u.a
        public AbstractC17058u.a h(long j10) {
            this.f160231b = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        AbstractC17052o abstractC17052o;
        Integer num;
        String str;
        List<AbstractC17057t> list;
        EnumC17061x enumC17061x;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17058u) {
            AbstractC17058u abstractC17058u = (AbstractC17058u) obj;
            if (this.f160223a == abstractC17058u.g() && this.f160224b == abstractC17058u.h() && ((abstractC17052o = this.f160225c) != null ? abstractC17052o.equals(abstractC17058u.b()) : abstractC17058u.b() == null) && ((num = this.f160226d) != null ? num.equals(abstractC17058u.d()) : abstractC17058u.d() == null) && ((str = this.f160227e) != null ? str.equals(abstractC17058u.e()) : abstractC17058u.e() == null) && ((list = this.f160228f) != null ? list.equals(abstractC17058u.c()) : abstractC17058u.c() == null) && ((enumC17061x = this.f160229g) != null ? enumC17061x.equals(abstractC17058u.f()) : abstractC17058u.f() == null)) {
                return true;
            }
        }
        return false;
    }

    private C17048k(long j10, long j11, AbstractC17052o abstractC17052o, Integer num, String str, List<AbstractC17057t> list, EnumC17061x enumC17061x) {
        this.f160223a = j10;
        this.f160224b = j11;
        this.f160225c = abstractC17052o;
        this.f160226d = num;
        this.f160227e = str;
        this.f160228f = list;
        this.f160229g = enumC17061x;
    }

    @Override // sc.AbstractC17058u
    public AbstractC17052o b() {
        return this.f160225c;
    }

    @Override // sc.AbstractC17058u
    public List<AbstractC17057t> c() {
        return this.f160228f;
    }

    @Override // sc.AbstractC17058u
    public Integer d() {
        return this.f160226d;
    }

    @Override // sc.AbstractC17058u
    public String e() {
        return this.f160227e;
    }

    @Override // sc.AbstractC17058u
    public EnumC17061x f() {
        return this.f160229g;
    }

    @Override // sc.AbstractC17058u
    public long g() {
        return this.f160223a;
    }

    @Override // sc.AbstractC17058u
    public long h() {
        return this.f160224b;
    }

    public int hashCode() {
        long j10 = this.f160223a;
        long j11 = this.f160224b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        AbstractC17052o abstractC17052o = this.f160225c;
        int iHashCode = (i10 ^ (abstractC17052o == null ? 0 : abstractC17052o.hashCode())) * 1000003;
        Integer num = this.f160226d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f160227e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC17057t> list = this.f160228f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC17061x enumC17061x = this.f160229g;
        return iHashCode4 ^ (enumC17061x != null ? enumC17061x.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f160223a + ", requestUptimeMs=" + this.f160224b + ", clientInfo=" + this.f160225c + ", logSource=" + this.f160226d + ", logSourceName=" + this.f160227e + ", logEvents=" + this.f160228f + ", qosTier=" + this.f160229g + "}";
    }
}
