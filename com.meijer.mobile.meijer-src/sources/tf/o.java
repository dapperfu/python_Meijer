package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class o extends AbstractC17251F.e.d.a.b.AbstractC2556a {

    /* renamed from: a, reason: collision with root package name */
    private final long f162965a;

    /* renamed from: b, reason: collision with root package name */
    private final long f162966b;

    /* renamed from: c, reason: collision with root package name */
    private final String f162967c;

    /* renamed from: d, reason: collision with root package name */
    private final String f162968d;

    static final class b extends AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a {

        /* renamed from: a, reason: collision with root package name */
        private long f162969a;

        /* renamed from: b, reason: collision with root package name */
        private long f162970b;

        /* renamed from: c, reason: collision with root package name */
        private String f162971c;

        /* renamed from: d, reason: collision with root package name */
        private String f162972d;

        /* renamed from: e, reason: collision with root package name */
        private byte f162973e;

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a
        public AbstractC17251F.e.d.a.b.AbstractC2556a a() {
            String str;
            if (this.f162973e == 3 && (str = this.f162971c) != null) {
                return new o(this.f162969a, this.f162970b, str, this.f162972d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f162973e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f162973e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f162971c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a
        public AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a b(long j10) {
            this.f162969a = j10;
            this.f162973e = (byte) (this.f162973e | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a
        public AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f162971c = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a
        public AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a d(long j10) {
            this.f162970b = j10;
            this.f162973e = (byte) (this.f162973e | 2);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a
        public AbstractC17251F.e.d.a.b.AbstractC2556a.AbstractC2557a e(String str) {
            this.f162972d = str;
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
        if (obj instanceof AbstractC17251F.e.d.a.b.AbstractC2556a) {
            AbstractC17251F.e.d.a.b.AbstractC2556a abstractC2556a = (AbstractC17251F.e.d.a.b.AbstractC2556a) obj;
            if (this.f162965a == abstractC2556a.b() && this.f162966b == abstractC2556a.d() && this.f162967c.equals(abstractC2556a.c()) && ((str = this.f162968d) != null ? str.equals(abstractC2556a.e()) : abstractC2556a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    private o(long j10, long j11, String str, String str2) {
        this.f162965a = j10;
        this.f162966b = j11;
        this.f162967c = str;
        this.f162968d = str2;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2556a
    public long b() {
        return this.f162965a;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2556a
    public String c() {
        return this.f162967c;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2556a
    public long d() {
        return this.f162966b;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2556a
    public String e() {
        return this.f162968d;
    }

    public int hashCode() {
        long j10 = this.f162965a;
        long j11 = this.f162966b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f162967c.hashCode()) * 1000003;
        String str = this.f162968d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f162965a + ", size=" + this.f162966b + ", name=" + this.f162967c + ", uuid=" + this.f162968d + "}";
    }
}
