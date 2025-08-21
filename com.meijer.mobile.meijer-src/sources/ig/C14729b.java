package ig;

import ig.AbstractC14731d;

/* renamed from: ig.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C14729b extends AbstractC14731d {

    /* renamed from: b, reason: collision with root package name */
    private final String f137575b;

    /* renamed from: c, reason: collision with root package name */
    private final String f137576c;

    /* renamed from: d, reason: collision with root package name */
    private final String f137577d;

    /* renamed from: e, reason: collision with root package name */
    private final String f137578e;

    /* renamed from: f, reason: collision with root package name */
    private final long f137579f;

    /* renamed from: ig.b$b, reason: collision with other inner class name */
    static final class C2169b extends AbstractC14731d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f137580a;

        /* renamed from: b, reason: collision with root package name */
        private String f137581b;

        /* renamed from: c, reason: collision with root package name */
        private String f137582c;

        /* renamed from: d, reason: collision with root package name */
        private String f137583d;

        /* renamed from: e, reason: collision with root package name */
        private long f137584e;

        /* renamed from: f, reason: collision with root package name */
        private byte f137585f;

        @Override // ig.AbstractC14731d.a
        public AbstractC14731d a() {
            if (this.f137585f == 1 && this.f137580a != null && this.f137581b != null && this.f137582c != null && this.f137583d != null) {
                return new C14729b(this.f137580a, this.f137581b, this.f137582c, this.f137583d, this.f137584e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f137580a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f137581b == null) {
                sb2.append(" variantId");
            }
            if (this.f137582c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f137583d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f137585f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ig.AbstractC14731d.a
        public AbstractC14731d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f137582c = str;
            return this;
        }

        @Override // ig.AbstractC14731d.a
        public AbstractC14731d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f137583d = str;
            return this;
        }

        @Override // ig.AbstractC14731d.a
        public AbstractC14731d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f137580a = str;
            return this;
        }

        @Override // ig.AbstractC14731d.a
        public AbstractC14731d.a e(long j10) {
            this.f137584e = j10;
            this.f137585f = (byte) (this.f137585f | 1);
            return this;
        }

        @Override // ig.AbstractC14731d.a
        public AbstractC14731d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f137581b = str;
            return this;
        }

        C2169b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC14731d) {
            AbstractC14731d abstractC14731d = (AbstractC14731d) obj;
            if (this.f137575b.equals(abstractC14731d.d()) && this.f137576c.equals(abstractC14731d.f()) && this.f137577d.equals(abstractC14731d.b()) && this.f137578e.equals(abstractC14731d.c()) && this.f137579f == abstractC14731d.e()) {
                return true;
            }
        }
        return false;
    }

    private C14729b(String str, String str2, String str3, String str4, long j10) {
        this.f137575b = str;
        this.f137576c = str2;
        this.f137577d = str3;
        this.f137578e = str4;
        this.f137579f = j10;
    }

    @Override // ig.AbstractC14731d
    public String b() {
        return this.f137577d;
    }

    @Override // ig.AbstractC14731d
    public String c() {
        return this.f137578e;
    }

    @Override // ig.AbstractC14731d
    public String d() {
        return this.f137575b;
    }

    @Override // ig.AbstractC14731d
    public long e() {
        return this.f137579f;
    }

    @Override // ig.AbstractC14731d
    public String f() {
        return this.f137576c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f137575b.hashCode() ^ 1000003) * 1000003) ^ this.f137576c.hashCode()) * 1000003) ^ this.f137577d.hashCode()) * 1000003) ^ this.f137578e.hashCode()) * 1000003;
        long j10 = this.f137579f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f137575b + ", variantId=" + this.f137576c + ", parameterKey=" + this.f137577d + ", parameterValue=" + this.f137578e + ", templateVersion=" + this.f137579f + "}";
    }
}
