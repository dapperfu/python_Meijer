package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class w extends AbstractC17251F.e.d.AbstractC2568e {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC17251F.e.d.AbstractC2568e.b f163034a;

    /* renamed from: b, reason: collision with root package name */
    private final String f163035b;

    /* renamed from: c, reason: collision with root package name */
    private final String f163036c;

    /* renamed from: d, reason: collision with root package name */
    private final long f163037d;

    static final class b extends AbstractC17251F.e.d.AbstractC2568e.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC17251F.e.d.AbstractC2568e.b f163038a;

        /* renamed from: b, reason: collision with root package name */
        private String f163039b;

        /* renamed from: c, reason: collision with root package name */
        private String f163040c;

        /* renamed from: d, reason: collision with root package name */
        private long f163041d;

        /* renamed from: e, reason: collision with root package name */
        private byte f163042e;

        @Override // tf.AbstractC17251F.e.d.AbstractC2568e.a
        public AbstractC17251F.e.d.AbstractC2568e a() {
            AbstractC17251F.e.d.AbstractC2568e.b bVar;
            String str;
            String str2;
            if (this.f163042e == 1 && (bVar = this.f163038a) != null && (str = this.f163039b) != null && (str2 = this.f163040c) != null) {
                return new w(bVar, str, str2, this.f163041d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f163038a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f163039b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f163040c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f163042e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.AbstractC2568e.a
        public AbstractC17251F.e.d.AbstractC2568e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f163039b = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.AbstractC2568e.a
        public AbstractC17251F.e.d.AbstractC2568e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f163040c = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.AbstractC2568e.a
        public AbstractC17251F.e.d.AbstractC2568e.a d(AbstractC17251F.e.d.AbstractC2568e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f163038a = bVar;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.AbstractC2568e.a
        public AbstractC17251F.e.d.AbstractC2568e.a e(long j10) {
            this.f163041d = j10;
            this.f163042e = (byte) (this.f163042e | 1);
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.AbstractC2568e) {
            AbstractC17251F.e.d.AbstractC2568e abstractC2568e = (AbstractC17251F.e.d.AbstractC2568e) obj;
            if (this.f163034a.equals(abstractC2568e.d()) && this.f163035b.equals(abstractC2568e.b()) && this.f163036c.equals(abstractC2568e.c()) && this.f163037d == abstractC2568e.e()) {
                return true;
            }
        }
        return false;
    }

    private w(AbstractC17251F.e.d.AbstractC2568e.b bVar, String str, String str2, long j10) {
        this.f163034a = bVar;
        this.f163035b = str;
        this.f163036c = str2;
        this.f163037d = j10;
    }

    @Override // tf.AbstractC17251F.e.d.AbstractC2568e
    public String b() {
        return this.f163035b;
    }

    @Override // tf.AbstractC17251F.e.d.AbstractC2568e
    public String c() {
        return this.f163036c;
    }

    @Override // tf.AbstractC17251F.e.d.AbstractC2568e
    public AbstractC17251F.e.d.AbstractC2568e.b d() {
        return this.f163034a;
    }

    @Override // tf.AbstractC17251F.e.d.AbstractC2568e
    public long e() {
        return this.f163037d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f163034a.hashCode() ^ 1000003) * 1000003) ^ this.f163035b.hashCode()) * 1000003) ^ this.f163036c.hashCode()) * 1000003;
        long j10 = this.f163037d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f163034a + ", parameterKey=" + this.f163035b + ", parameterValue=" + this.f163036c + ", templateVersion=" + this.f163037d + "}";
    }
}
