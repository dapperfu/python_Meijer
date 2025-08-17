package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class w extends AbstractC16777F.e.d.AbstractC2462e {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16777F.e.d.AbstractC2462e.b f158588a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158589b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158590c;

    /* renamed from: d, reason: collision with root package name */
    private final long f158591d;

    static final class b extends AbstractC16777F.e.d.AbstractC2462e.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC16777F.e.d.AbstractC2462e.b f158592a;

        /* renamed from: b, reason: collision with root package name */
        private String f158593b;

        /* renamed from: c, reason: collision with root package name */
        private String f158594c;

        /* renamed from: d, reason: collision with root package name */
        private long f158595d;

        /* renamed from: e, reason: collision with root package name */
        private byte f158596e;

        @Override // rf.AbstractC16777F.e.d.AbstractC2462e.a
        public AbstractC16777F.e.d.AbstractC2462e a() {
            AbstractC16777F.e.d.AbstractC2462e.b bVar;
            String str;
            String str2;
            if (this.f158596e == 1 && (bVar = this.f158592a) != null && (str = this.f158593b) != null && (str2 = this.f158594c) != null) {
                return new w(bVar, str, str2, this.f158595d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158592a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f158593b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f158594c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f158596e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.AbstractC2462e.a
        public AbstractC16777F.e.d.AbstractC2462e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f158593b = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.AbstractC2462e.a
        public AbstractC16777F.e.d.AbstractC2462e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f158594c = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.AbstractC2462e.a
        public AbstractC16777F.e.d.AbstractC2462e.a d(AbstractC16777F.e.d.AbstractC2462e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f158592a = bVar;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.AbstractC2462e.a
        public AbstractC16777F.e.d.AbstractC2462e.a e(long j10) {
            this.f158595d = j10;
            this.f158596e = (byte) (this.f158596e | 1);
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.AbstractC2462e) {
            AbstractC16777F.e.d.AbstractC2462e abstractC2462e = (AbstractC16777F.e.d.AbstractC2462e) obj;
            if (this.f158588a.equals(abstractC2462e.d()) && this.f158589b.equals(abstractC2462e.b()) && this.f158590c.equals(abstractC2462e.c()) && this.f158591d == abstractC2462e.e()) {
                return true;
            }
        }
        return false;
    }

    private w(AbstractC16777F.e.d.AbstractC2462e.b bVar, String str, String str2, long j10) {
        this.f158588a = bVar;
        this.f158589b = str;
        this.f158590c = str2;
        this.f158591d = j10;
    }

    @Override // rf.AbstractC16777F.e.d.AbstractC2462e
    public String b() {
        return this.f158589b;
    }

    @Override // rf.AbstractC16777F.e.d.AbstractC2462e
    public String c() {
        return this.f158590c;
    }

    @Override // rf.AbstractC16777F.e.d.AbstractC2462e
    public AbstractC16777F.e.d.AbstractC2462e.b d() {
        return this.f158588a;
    }

    @Override // rf.AbstractC16777F.e.d.AbstractC2462e
    public long e() {
        return this.f158591d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f158588a.hashCode() ^ 1000003) * 1000003) ^ this.f158589b.hashCode()) * 1000003) ^ this.f158590c.hashCode()) * 1000003;
        long j10 = this.f158591d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f158588a + ", parameterKey=" + this.f158589b + ", parameterValue=" + this.f158590c + ", templateVersion=" + this.f158591d + "}";
    }
}
