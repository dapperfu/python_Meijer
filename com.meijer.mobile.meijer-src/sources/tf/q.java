package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class q extends AbstractC17251F.e.d.a.b.AbstractC2560d {

    /* renamed from: a, reason: collision with root package name */
    private final String f162985a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162986b;

    /* renamed from: c, reason: collision with root package name */
    private final long f162987c;

    static final class b extends AbstractC17251F.e.d.a.b.AbstractC2560d.AbstractC2561a {

        /* renamed from: a, reason: collision with root package name */
        private String f162988a;

        /* renamed from: b, reason: collision with root package name */
        private String f162989b;

        /* renamed from: c, reason: collision with root package name */
        private long f162990c;

        /* renamed from: d, reason: collision with root package name */
        private byte f162991d;

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2560d.AbstractC2561a
        public AbstractC17251F.e.d.a.b.AbstractC2560d a() {
            String str;
            String str2;
            if (this.f162991d == 1 && (str = this.f162988a) != null && (str2 = this.f162989b) != null) {
                return new q(str, str2, this.f162990c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162988a == null) {
                sb2.append(" name");
            }
            if (this.f162989b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f162991d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2560d.AbstractC2561a
        public AbstractC17251F.e.d.a.b.AbstractC2560d.AbstractC2561a b(long j10) {
            this.f162990c = j10;
            this.f162991d = (byte) (this.f162991d | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2560d.AbstractC2561a
        public AbstractC17251F.e.d.a.b.AbstractC2560d.AbstractC2561a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f162989b = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2560d.AbstractC2561a
        public AbstractC17251F.e.d.a.b.AbstractC2560d.AbstractC2561a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f162988a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.a.b.AbstractC2560d) {
            AbstractC17251F.e.d.a.b.AbstractC2560d abstractC2560d = (AbstractC17251F.e.d.a.b.AbstractC2560d) obj;
            if (this.f162985a.equals(abstractC2560d.d()) && this.f162986b.equals(abstractC2560d.c()) && this.f162987c == abstractC2560d.b()) {
                return true;
            }
        }
        return false;
    }

    private q(String str, String str2, long j10) {
        this.f162985a = str;
        this.f162986b = str2;
        this.f162987c = j10;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2560d
    public long b() {
        return this.f162987c;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2560d
    public String c() {
        return this.f162986b;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2560d
    public String d() {
        return this.f162985a;
    }

    public int hashCode() {
        int iHashCode = (((this.f162985a.hashCode() ^ 1000003) * 1000003) ^ this.f162986b.hashCode()) * 1000003;
        long j10 = this.f162987c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f162985a + ", code=" + this.f162986b + ", address=" + this.f162987c + "}";
    }
}
