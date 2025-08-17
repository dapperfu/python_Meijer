package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class q extends AbstractC16777F.e.d.a.b.AbstractC2454d {

    /* renamed from: a, reason: collision with root package name */
    private final String f158539a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158540b;

    /* renamed from: c, reason: collision with root package name */
    private final long f158541c;

    static final class b extends AbstractC16777F.e.d.a.b.AbstractC2454d.AbstractC2455a {

        /* renamed from: a, reason: collision with root package name */
        private String f158542a;

        /* renamed from: b, reason: collision with root package name */
        private String f158543b;

        /* renamed from: c, reason: collision with root package name */
        private long f158544c;

        /* renamed from: d, reason: collision with root package name */
        private byte f158545d;

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2454d.AbstractC2455a
        public AbstractC16777F.e.d.a.b.AbstractC2454d a() {
            String str;
            String str2;
            if (this.f158545d == 1 && (str = this.f158542a) != null && (str2 = this.f158543b) != null) {
                return new q(str, str2, this.f158544c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158542a == null) {
                sb2.append(" name");
            }
            if (this.f158543b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f158545d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2454d.AbstractC2455a
        public AbstractC16777F.e.d.a.b.AbstractC2454d.AbstractC2455a b(long j10) {
            this.f158544c = j10;
            this.f158545d = (byte) (this.f158545d | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2454d.AbstractC2455a
        public AbstractC16777F.e.d.a.b.AbstractC2454d.AbstractC2455a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f158543b = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2454d.AbstractC2455a
        public AbstractC16777F.e.d.a.b.AbstractC2454d.AbstractC2455a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f158542a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.a.b.AbstractC2454d) {
            AbstractC16777F.e.d.a.b.AbstractC2454d abstractC2454d = (AbstractC16777F.e.d.a.b.AbstractC2454d) obj;
            if (this.f158539a.equals(abstractC2454d.d()) && this.f158540b.equals(abstractC2454d.c()) && this.f158541c == abstractC2454d.b()) {
                return true;
            }
        }
        return false;
    }

    private q(String str, String str2, long j10) {
        this.f158539a = str;
        this.f158540b = str2;
        this.f158541c = j10;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2454d
    public long b() {
        return this.f158541c;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2454d
    public String c() {
        return this.f158540b;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2454d
    public String d() {
        return this.f158539a;
    }

    public int hashCode() {
        int iHashCode = (((this.f158539a.hashCode() ^ 1000003) * 1000003) ^ this.f158540b.hashCode()) * 1000003;
        long j10 = this.f158541c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f158539a + ", code=" + this.f158540b + ", address=" + this.f158541c + "}";
    }
}
