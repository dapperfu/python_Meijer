package sc;

import java.util.Arrays;
import sc.AbstractC17057t;

/* renamed from: sc.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17047j extends AbstractC17057t {

    /* renamed from: a, reason: collision with root package name */
    private final long f160205a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f160206b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC17053p f160207c;

    /* renamed from: d, reason: collision with root package name */
    private final long f160208d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f160209e;

    /* renamed from: f, reason: collision with root package name */
    private final String f160210f;

    /* renamed from: g, reason: collision with root package name */
    private final long f160211g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC17060w f160212h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC17054q f160213i;

    /* renamed from: sc.j$b */
    static final class b extends AbstractC17057t.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f160214a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f160215b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC17053p f160216c;

        /* renamed from: d, reason: collision with root package name */
        private Long f160217d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f160218e;

        /* renamed from: f, reason: collision with root package name */
        private String f160219f;

        /* renamed from: g, reason: collision with root package name */
        private Long f160220g;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC17060w f160221h;

        /* renamed from: i, reason: collision with root package name */
        private AbstractC17054q f160222i;

        @Override // sc.AbstractC17057t.a
        public AbstractC17057t a() {
            String str = "";
            if (this.f160214a == null) {
                str = " eventTimeMs";
            }
            if (this.f160217d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f160220g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C17047j(this.f160214a.longValue(), this.f160215b, this.f160216c, this.f160217d.longValue(), this.f160218e, this.f160219f, this.f160220g.longValue(), this.f160221h, this.f160222i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // sc.AbstractC17057t.a
        public AbstractC17057t.a b(AbstractC17053p abstractC17053p) {
            this.f160216c = abstractC17053p;
            return this;
        }

        @Override // sc.AbstractC17057t.a
        public AbstractC17057t.a c(Integer num) {
            this.f160215b = num;
            return this;
        }

        @Override // sc.AbstractC17057t.a
        public AbstractC17057t.a f(AbstractC17054q abstractC17054q) {
            this.f160222i = abstractC17054q;
            return this;
        }

        @Override // sc.AbstractC17057t.a
        public AbstractC17057t.a g(AbstractC17060w abstractC17060w) {
            this.f160221h = abstractC17060w;
            return this;
        }

        @Override // sc.AbstractC17057t.a
        AbstractC17057t.a h(byte[] bArr) {
            this.f160218e = bArr;
            return this;
        }

        @Override // sc.AbstractC17057t.a
        AbstractC17057t.a i(String str) {
            this.f160219f = str;
            return this;
        }

        b() {
        }

        @Override // sc.AbstractC17057t.a
        public AbstractC17057t.a d(long j10) {
            this.f160214a = Long.valueOf(j10);
            return this;
        }

        @Override // sc.AbstractC17057t.a
        public AbstractC17057t.a e(long j10) {
            this.f160217d = Long.valueOf(j10);
            return this;
        }

        @Override // sc.AbstractC17057t.a
        public AbstractC17057t.a j(long j10) {
            this.f160220g = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        AbstractC17053p abstractC17053p;
        String str;
        AbstractC17060w abstractC17060w;
        AbstractC17054q abstractC17054q;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17057t) {
            AbstractC17057t abstractC17057t = (AbstractC17057t) obj;
            if (this.f160205a == abstractC17057t.d() && ((num = this.f160206b) != null ? num.equals(abstractC17057t.c()) : abstractC17057t.c() == null) && ((abstractC17053p = this.f160207c) != null ? abstractC17053p.equals(abstractC17057t.b()) : abstractC17057t.b() == null) && this.f160208d == abstractC17057t.e()) {
                if (Arrays.equals(this.f160209e, abstractC17057t instanceof C17047j ? ((C17047j) abstractC17057t).f160209e : abstractC17057t.h()) && ((str = this.f160210f) != null ? str.equals(abstractC17057t.i()) : abstractC17057t.i() == null) && this.f160211g == abstractC17057t.j() && ((abstractC17060w = this.f160212h) != null ? abstractC17060w.equals(abstractC17057t.g()) : abstractC17057t.g() == null) && ((abstractC17054q = this.f160213i) != null ? abstractC17054q.equals(abstractC17057t.f()) : abstractC17057t.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private C17047j(long j10, Integer num, AbstractC17053p abstractC17053p, long j11, byte[] bArr, String str, long j12, AbstractC17060w abstractC17060w, AbstractC17054q abstractC17054q) {
        this.f160205a = j10;
        this.f160206b = num;
        this.f160207c = abstractC17053p;
        this.f160208d = j11;
        this.f160209e = bArr;
        this.f160210f = str;
        this.f160211g = j12;
        this.f160212h = abstractC17060w;
        this.f160213i = abstractC17054q;
    }

    @Override // sc.AbstractC17057t
    public AbstractC17053p b() {
        return this.f160207c;
    }

    @Override // sc.AbstractC17057t
    public Integer c() {
        return this.f160206b;
    }

    @Override // sc.AbstractC17057t
    public long d() {
        return this.f160205a;
    }

    @Override // sc.AbstractC17057t
    public long e() {
        return this.f160208d;
    }

    @Override // sc.AbstractC17057t
    public AbstractC17054q f() {
        return this.f160213i;
    }

    @Override // sc.AbstractC17057t
    public AbstractC17060w g() {
        return this.f160212h;
    }

    @Override // sc.AbstractC17057t
    public byte[] h() {
        return this.f160209e;
    }

    public int hashCode() {
        long j10 = this.f160205a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f160206b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        AbstractC17053p abstractC17053p = this.f160207c;
        int iHashCode2 = abstractC17053p == null ? 0 : abstractC17053p.hashCode();
        long j11 = this.f160208d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f160209e)) * 1000003;
        String str = this.f160210f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f160211g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC17060w abstractC17060w = this.f160212h;
        int iHashCode5 = (i11 ^ (abstractC17060w == null ? 0 : abstractC17060w.hashCode())) * 1000003;
        AbstractC17054q abstractC17054q = this.f160213i;
        return iHashCode5 ^ (abstractC17054q != null ? abstractC17054q.hashCode() : 0);
    }

    @Override // sc.AbstractC17057t
    public String i() {
        return this.f160210f;
    }

    @Override // sc.AbstractC17057t
    public long j() {
        return this.f160211g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f160205a + ", eventCode=" + this.f160206b + ", complianceData=" + this.f160207c + ", eventUptimeMs=" + this.f160208d + ", sourceExtension=" + Arrays.toString(this.f160209e) + ", sourceExtensionJsonProto3=" + this.f160210f + ", timezoneOffsetSeconds=" + this.f160211g + ", networkConnectionInfo=" + this.f160212h + ", experimentIds=" + this.f160213i + "}";
    }
}
