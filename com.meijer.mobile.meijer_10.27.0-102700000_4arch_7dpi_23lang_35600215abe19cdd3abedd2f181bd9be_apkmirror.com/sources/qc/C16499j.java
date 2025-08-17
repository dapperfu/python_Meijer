package qc;

import java.util.Arrays;
import qc.AbstractC16509t;

/* renamed from: qc.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16499j extends AbstractC16509t {

    /* renamed from: a, reason: collision with root package name */
    private final long f157090a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f157091b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16505p f157092c;

    /* renamed from: d, reason: collision with root package name */
    private final long f157093d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f157094e;

    /* renamed from: f, reason: collision with root package name */
    private final String f157095f;

    /* renamed from: g, reason: collision with root package name */
    private final long f157096g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC16512w f157097h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC16506q f157098i;

    /* renamed from: qc.j$b */
    static final class b extends AbstractC16509t.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f157099a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f157100b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC16505p f157101c;

        /* renamed from: d, reason: collision with root package name */
        private Long f157102d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f157103e;

        /* renamed from: f, reason: collision with root package name */
        private String f157104f;

        /* renamed from: g, reason: collision with root package name */
        private Long f157105g;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC16512w f157106h;

        /* renamed from: i, reason: collision with root package name */
        private AbstractC16506q f157107i;

        @Override // qc.AbstractC16509t.a
        public AbstractC16509t a() {
            String str = "";
            if (this.f157099a == null) {
                str = " eventTimeMs";
            }
            if (this.f157102d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f157105g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C16499j(this.f157099a.longValue(), this.f157100b, this.f157101c, this.f157102d.longValue(), this.f157103e, this.f157104f, this.f157105g.longValue(), this.f157106h, this.f157107i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // qc.AbstractC16509t.a
        public AbstractC16509t.a b(AbstractC16505p abstractC16505p) {
            this.f157101c = abstractC16505p;
            return this;
        }

        @Override // qc.AbstractC16509t.a
        public AbstractC16509t.a c(Integer num) {
            this.f157100b = num;
            return this;
        }

        @Override // qc.AbstractC16509t.a
        public AbstractC16509t.a f(AbstractC16506q abstractC16506q) {
            this.f157107i = abstractC16506q;
            return this;
        }

        @Override // qc.AbstractC16509t.a
        public AbstractC16509t.a g(AbstractC16512w abstractC16512w) {
            this.f157106h = abstractC16512w;
            return this;
        }

        @Override // qc.AbstractC16509t.a
        AbstractC16509t.a h(byte[] bArr) {
            this.f157103e = bArr;
            return this;
        }

        @Override // qc.AbstractC16509t.a
        AbstractC16509t.a i(String str) {
            this.f157104f = str;
            return this;
        }

        b() {
        }

        @Override // qc.AbstractC16509t.a
        public AbstractC16509t.a d(long j10) {
            this.f157099a = Long.valueOf(j10);
            return this;
        }

        @Override // qc.AbstractC16509t.a
        public AbstractC16509t.a e(long j10) {
            this.f157102d = Long.valueOf(j10);
            return this;
        }

        @Override // qc.AbstractC16509t.a
        public AbstractC16509t.a j(long j10) {
            this.f157105g = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        AbstractC16505p abstractC16505p;
        String str;
        AbstractC16512w abstractC16512w;
        AbstractC16506q abstractC16506q;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16509t) {
            AbstractC16509t abstractC16509t = (AbstractC16509t) obj;
            if (this.f157090a == abstractC16509t.d() && ((num = this.f157091b) != null ? num.equals(abstractC16509t.c()) : abstractC16509t.c() == null) && ((abstractC16505p = this.f157092c) != null ? abstractC16505p.equals(abstractC16509t.b()) : abstractC16509t.b() == null) && this.f157093d == abstractC16509t.e()) {
                if (Arrays.equals(this.f157094e, abstractC16509t instanceof C16499j ? ((C16499j) abstractC16509t).f157094e : abstractC16509t.h()) && ((str = this.f157095f) != null ? str.equals(abstractC16509t.i()) : abstractC16509t.i() == null) && this.f157096g == abstractC16509t.j() && ((abstractC16512w = this.f157097h) != null ? abstractC16512w.equals(abstractC16509t.g()) : abstractC16509t.g() == null) && ((abstractC16506q = this.f157098i) != null ? abstractC16506q.equals(abstractC16509t.f()) : abstractC16509t.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private C16499j(long j10, Integer num, AbstractC16505p abstractC16505p, long j11, byte[] bArr, String str, long j12, AbstractC16512w abstractC16512w, AbstractC16506q abstractC16506q) {
        this.f157090a = j10;
        this.f157091b = num;
        this.f157092c = abstractC16505p;
        this.f157093d = j11;
        this.f157094e = bArr;
        this.f157095f = str;
        this.f157096g = j12;
        this.f157097h = abstractC16512w;
        this.f157098i = abstractC16506q;
    }

    @Override // qc.AbstractC16509t
    public AbstractC16505p b() {
        return this.f157092c;
    }

    @Override // qc.AbstractC16509t
    public Integer c() {
        return this.f157091b;
    }

    @Override // qc.AbstractC16509t
    public long d() {
        return this.f157090a;
    }

    @Override // qc.AbstractC16509t
    public long e() {
        return this.f157093d;
    }

    @Override // qc.AbstractC16509t
    public AbstractC16506q f() {
        return this.f157098i;
    }

    @Override // qc.AbstractC16509t
    public AbstractC16512w g() {
        return this.f157097h;
    }

    @Override // qc.AbstractC16509t
    public byte[] h() {
        return this.f157094e;
    }

    public int hashCode() {
        long j10 = this.f157090a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f157091b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        AbstractC16505p abstractC16505p = this.f157092c;
        int iHashCode2 = abstractC16505p == null ? 0 : abstractC16505p.hashCode();
        long j11 = this.f157093d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f157094e)) * 1000003;
        String str = this.f157095f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f157096g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC16512w abstractC16512w = this.f157097h;
        int iHashCode5 = (i11 ^ (abstractC16512w == null ? 0 : abstractC16512w.hashCode())) * 1000003;
        AbstractC16506q abstractC16506q = this.f157098i;
        return iHashCode5 ^ (abstractC16506q != null ? abstractC16506q.hashCode() : 0);
    }

    @Override // qc.AbstractC16509t
    public String i() {
        return this.f157095f;
    }

    @Override // qc.AbstractC16509t
    public long j() {
        return this.f157096g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f157090a + ", eventCode=" + this.f157091b + ", complianceData=" + this.f157092c + ", eventUptimeMs=" + this.f157093d + ", sourceExtension=" + Arrays.toString(this.f157094e) + ", sourceExtensionJsonProto3=" + this.f157095f + ", timezoneOffsetSeconds=" + this.f157096g + ", networkConnectionInfo=" + this.f157097h + ", experimentIds=" + this.f157098i + "}";
    }
}
