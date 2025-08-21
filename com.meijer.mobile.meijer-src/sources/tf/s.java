package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class s extends AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b {

    /* renamed from: a, reason: collision with root package name */
    private final long f162999a;

    /* renamed from: b, reason: collision with root package name */
    private final String f163000b;

    /* renamed from: c, reason: collision with root package name */
    private final String f163001c;

    /* renamed from: d, reason: collision with root package name */
    private final long f163002d;

    /* renamed from: e, reason: collision with root package name */
    private final int f163003e;

    static final class b extends AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a {

        /* renamed from: a, reason: collision with root package name */
        private long f163004a;

        /* renamed from: b, reason: collision with root package name */
        private String f163005b;

        /* renamed from: c, reason: collision with root package name */
        private String f163006c;

        /* renamed from: d, reason: collision with root package name */
        private long f163007d;

        /* renamed from: e, reason: collision with root package name */
        private int f163008e;

        /* renamed from: f, reason: collision with root package name */
        private byte f163009f;

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a
        public AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b a() {
            String str;
            if (this.f163009f == 7 && (str = this.f163005b) != null) {
                return new s(this.f163004a, str, this.f163006c, this.f163007d, this.f163008e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f163009f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f163005b == null) {
                sb2.append(" symbol");
            }
            if ((this.f163009f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f163009f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a
        public AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a b(String str) {
            this.f163006c = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a
        public AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a c(int i10) {
            this.f163008e = i10;
            this.f163009f = (byte) (this.f163009f | 4);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a
        public AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a d(long j10) {
            this.f163007d = j10;
            this.f163009f = (byte) (this.f163009f | 2);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a
        public AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a e(long j10) {
            this.f163004a = j10;
            this.f163009f = (byte) (this.f163009f | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a
        public AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b.AbstractC2565a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f163005b = str;
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
        if (obj instanceof AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b) {
            AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b abstractC2564b = (AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b) obj;
            if (this.f162999a == abstractC2564b.e() && this.f163000b.equals(abstractC2564b.f()) && ((str = this.f163001c) != null ? str.equals(abstractC2564b.b()) : abstractC2564b.b() == null) && this.f163002d == abstractC2564b.d() && this.f163003e == abstractC2564b.c()) {
                return true;
            }
        }
        return false;
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f162999a = j10;
        this.f163000b = str;
        this.f163001c = str2;
        this.f163002d = j11;
        this.f163003e = i10;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b
    public String b() {
        return this.f163001c;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b
    public int c() {
        return this.f163003e;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b
    public long d() {
        return this.f163002d;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b
    public long e() {
        return this.f162999a;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b
    public String f() {
        return this.f163000b;
    }

    public int hashCode() {
        long j10 = this.f162999a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f163000b.hashCode()) * 1000003;
        String str = this.f163001c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f163002d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f163003e;
    }

    public String toString() {
        return "Frame{pc=" + this.f162999a + ", symbol=" + this.f163000b + ", file=" + this.f163001c + ", offset=" + this.f163002d + ", importance=" + this.f163003e + "}";
    }
}
