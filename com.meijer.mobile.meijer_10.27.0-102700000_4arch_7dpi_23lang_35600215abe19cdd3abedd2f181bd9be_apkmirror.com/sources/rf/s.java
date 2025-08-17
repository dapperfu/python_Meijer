package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class s extends AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b {

    /* renamed from: a, reason: collision with root package name */
    private final long f158553a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158554b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158555c;

    /* renamed from: d, reason: collision with root package name */
    private final long f158556d;

    /* renamed from: e, reason: collision with root package name */
    private final int f158557e;

    static final class b extends AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a {

        /* renamed from: a, reason: collision with root package name */
        private long f158558a;

        /* renamed from: b, reason: collision with root package name */
        private String f158559b;

        /* renamed from: c, reason: collision with root package name */
        private String f158560c;

        /* renamed from: d, reason: collision with root package name */
        private long f158561d;

        /* renamed from: e, reason: collision with root package name */
        private int f158562e;

        /* renamed from: f, reason: collision with root package name */
        private byte f158563f;

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a
        public AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b a() {
            String str;
            if (this.f158563f == 7 && (str = this.f158559b) != null) {
                return new s(this.f158558a, str, this.f158560c, this.f158561d, this.f158562e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f158563f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f158559b == null) {
                sb2.append(" symbol");
            }
            if ((this.f158563f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f158563f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a
        public AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a b(String str) {
            this.f158560c = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a
        public AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a c(int i10) {
            this.f158562e = i10;
            this.f158563f = (byte) (this.f158563f | 4);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a
        public AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a d(long j10) {
            this.f158561d = j10;
            this.f158563f = (byte) (this.f158563f | 2);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a
        public AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a e(long j10) {
            this.f158558a = j10;
            this.f158563f = (byte) (this.f158563f | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a
        public AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b.AbstractC2459a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f158559b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b) {
            AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b abstractC2458b = (AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b) obj;
            if (this.f158553a == abstractC2458b.e() && this.f158554b.equals(abstractC2458b.f()) && ((str = this.f158555c) != null ? str.equals(abstractC2458b.b()) : abstractC2458b.b() == null) && this.f158556d == abstractC2458b.d() && this.f158557e == abstractC2458b.c()) {
                return true;
            }
        }
        return false;
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f158553a = j10;
        this.f158554b = str;
        this.f158555c = str2;
        this.f158556d = j11;
        this.f158557e = i10;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b
    public String b() {
        return this.f158555c;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b
    public int c() {
        return this.f158557e;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b
    public long d() {
        return this.f158556d;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b
    public long e() {
        return this.f158553a;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b
    public String f() {
        return this.f158554b;
    }

    public int hashCode() {
        long j10 = this.f158553a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f158554b.hashCode()) * 1000003;
        String str = this.f158555c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f158556d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f158557e;
    }

    public String toString() {
        return "Frame{pc=" + this.f158553a + ", symbol=" + this.f158554b + ", file=" + this.f158555c + ", offset=" + this.f158556d + ", importance=" + this.f158557e + "}";
    }
}
