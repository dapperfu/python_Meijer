package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class o extends AbstractC16777F.e.d.a.b.AbstractC2450a {

    /* renamed from: a, reason: collision with root package name */
    private final long f158519a;

    /* renamed from: b, reason: collision with root package name */
    private final long f158520b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158521c;

    /* renamed from: d, reason: collision with root package name */
    private final String f158522d;

    static final class b extends AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a {

        /* renamed from: a, reason: collision with root package name */
        private long f158523a;

        /* renamed from: b, reason: collision with root package name */
        private long f158524b;

        /* renamed from: c, reason: collision with root package name */
        private String f158525c;

        /* renamed from: d, reason: collision with root package name */
        private String f158526d;

        /* renamed from: e, reason: collision with root package name */
        private byte f158527e;

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a
        public AbstractC16777F.e.d.a.b.AbstractC2450a a() {
            String str;
            if (this.f158527e == 3 && (str = this.f158525c) != null) {
                return new o(this.f158523a, this.f158524b, str, this.f158526d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f158527e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f158527e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f158525c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a
        public AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a b(long j10) {
            this.f158523a = j10;
            this.f158527e = (byte) (this.f158527e | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a
        public AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f158525c = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a
        public AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a d(long j10) {
            this.f158524b = j10;
            this.f158527e = (byte) (this.f158527e | 2);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a
        public AbstractC16777F.e.d.a.b.AbstractC2450a.AbstractC2451a e(String str) {
            this.f158526d = str;
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
        if (obj instanceof AbstractC16777F.e.d.a.b.AbstractC2450a) {
            AbstractC16777F.e.d.a.b.AbstractC2450a abstractC2450a = (AbstractC16777F.e.d.a.b.AbstractC2450a) obj;
            if (this.f158519a == abstractC2450a.b() && this.f158520b == abstractC2450a.d() && this.f158521c.equals(abstractC2450a.c()) && ((str = this.f158522d) != null ? str.equals(abstractC2450a.e()) : abstractC2450a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    private o(long j10, long j11, String str, String str2) {
        this.f158519a = j10;
        this.f158520b = j11;
        this.f158521c = str;
        this.f158522d = str2;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2450a
    public long b() {
        return this.f158519a;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2450a
    public String c() {
        return this.f158521c;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2450a
    public long d() {
        return this.f158520b;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2450a
    public String e() {
        return this.f158522d;
    }

    public int hashCode() {
        long j10 = this.f158519a;
        long j11 = this.f158520b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f158521c.hashCode()) * 1000003;
        String str = this.f158522d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f158519a + ", size=" + this.f158520b + ", name=" + this.f158521c + ", uuid=" + this.f158522d + "}";
    }
}
