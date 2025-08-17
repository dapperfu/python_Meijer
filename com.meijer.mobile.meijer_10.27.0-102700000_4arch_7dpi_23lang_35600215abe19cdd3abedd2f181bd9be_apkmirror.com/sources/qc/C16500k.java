package qc;

import java.util.List;
import qc.AbstractC16510u;

/* renamed from: qc.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16500k extends AbstractC16510u {

    /* renamed from: a, reason: collision with root package name */
    private final long f157108a;

    /* renamed from: b, reason: collision with root package name */
    private final long f157109b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16504o f157110c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f157111d;

    /* renamed from: e, reason: collision with root package name */
    private final String f157112e;

    /* renamed from: f, reason: collision with root package name */
    private final List<AbstractC16509t> f157113f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC16513x f157114g;

    /* renamed from: qc.k$b */
    static final class b extends AbstractC16510u.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f157115a;

        /* renamed from: b, reason: collision with root package name */
        private Long f157116b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC16504o f157117c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f157118d;

        /* renamed from: e, reason: collision with root package name */
        private String f157119e;

        /* renamed from: f, reason: collision with root package name */
        private List<AbstractC16509t> f157120f;

        /* renamed from: g, reason: collision with root package name */
        private EnumC16513x f157121g;

        @Override // qc.AbstractC16510u.a
        public AbstractC16510u a() {
            String str = "";
            if (this.f157115a == null) {
                str = " requestTimeMs";
            }
            if (this.f157116b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C16500k(this.f157115a.longValue(), this.f157116b.longValue(), this.f157117c, this.f157118d, this.f157119e, this.f157120f, this.f157121g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // qc.AbstractC16510u.a
        public AbstractC16510u.a b(AbstractC16504o abstractC16504o) {
            this.f157117c = abstractC16504o;
            return this;
        }

        @Override // qc.AbstractC16510u.a
        public AbstractC16510u.a c(List<AbstractC16509t> list) {
            this.f157120f = list;
            return this;
        }

        @Override // qc.AbstractC16510u.a
        AbstractC16510u.a d(Integer num) {
            this.f157118d = num;
            return this;
        }

        @Override // qc.AbstractC16510u.a
        AbstractC16510u.a e(String str) {
            this.f157119e = str;
            return this;
        }

        @Override // qc.AbstractC16510u.a
        public AbstractC16510u.a f(EnumC16513x enumC16513x) {
            this.f157121g = enumC16513x;
            return this;
        }

        b() {
        }

        @Override // qc.AbstractC16510u.a
        public AbstractC16510u.a g(long j10) {
            this.f157115a = Long.valueOf(j10);
            return this;
        }

        @Override // qc.AbstractC16510u.a
        public AbstractC16510u.a h(long j10) {
            this.f157116b = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        AbstractC16504o abstractC16504o;
        Integer num;
        String str;
        List<AbstractC16509t> list;
        EnumC16513x enumC16513x;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16510u) {
            AbstractC16510u abstractC16510u = (AbstractC16510u) obj;
            if (this.f157108a == abstractC16510u.g() && this.f157109b == abstractC16510u.h() && ((abstractC16504o = this.f157110c) != null ? abstractC16504o.equals(abstractC16510u.b()) : abstractC16510u.b() == null) && ((num = this.f157111d) != null ? num.equals(abstractC16510u.d()) : abstractC16510u.d() == null) && ((str = this.f157112e) != null ? str.equals(abstractC16510u.e()) : abstractC16510u.e() == null) && ((list = this.f157113f) != null ? list.equals(abstractC16510u.c()) : abstractC16510u.c() == null) && ((enumC16513x = this.f157114g) != null ? enumC16513x.equals(abstractC16510u.f()) : abstractC16510u.f() == null)) {
                return true;
            }
        }
        return false;
    }

    private C16500k(long j10, long j11, AbstractC16504o abstractC16504o, Integer num, String str, List<AbstractC16509t> list, EnumC16513x enumC16513x) {
        this.f157108a = j10;
        this.f157109b = j11;
        this.f157110c = abstractC16504o;
        this.f157111d = num;
        this.f157112e = str;
        this.f157113f = list;
        this.f157114g = enumC16513x;
    }

    @Override // qc.AbstractC16510u
    public AbstractC16504o b() {
        return this.f157110c;
    }

    @Override // qc.AbstractC16510u
    public List<AbstractC16509t> c() {
        return this.f157113f;
    }

    @Override // qc.AbstractC16510u
    public Integer d() {
        return this.f157111d;
    }

    @Override // qc.AbstractC16510u
    public String e() {
        return this.f157112e;
    }

    @Override // qc.AbstractC16510u
    public EnumC16513x f() {
        return this.f157114g;
    }

    @Override // qc.AbstractC16510u
    public long g() {
        return this.f157108a;
    }

    @Override // qc.AbstractC16510u
    public long h() {
        return this.f157109b;
    }

    public int hashCode() {
        long j10 = this.f157108a;
        long j11 = this.f157109b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        AbstractC16504o abstractC16504o = this.f157110c;
        int iHashCode = (i10 ^ (abstractC16504o == null ? 0 : abstractC16504o.hashCode())) * 1000003;
        Integer num = this.f157111d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f157112e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC16509t> list = this.f157113f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC16513x enumC16513x = this.f157114g;
        return iHashCode4 ^ (enumC16513x != null ? enumC16513x.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f157108a + ", requestUptimeMs=" + this.f157109b + ", clientInfo=" + this.f157110c + ", logSource=" + this.f157111d + ", logSourceName=" + this.f157112e + ", logEvents=" + this.f157113f + ", qosTier=" + this.f157114g + "}";
    }
}
