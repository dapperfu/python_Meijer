package gg;

import gg.AbstractC14257d;

/* renamed from: gg.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14255b extends AbstractC14257d {

    /* renamed from: b, reason: collision with root package name */
    private final String f133365b;

    /* renamed from: c, reason: collision with root package name */
    private final String f133366c;

    /* renamed from: d, reason: collision with root package name */
    private final String f133367d;

    /* renamed from: e, reason: collision with root package name */
    private final String f133368e;

    /* renamed from: f, reason: collision with root package name */
    private final long f133369f;

    /* renamed from: gg.b$b, reason: collision with other inner class name */
    static final class C2096b extends AbstractC14257d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f133370a;

        /* renamed from: b, reason: collision with root package name */
        private String f133371b;

        /* renamed from: c, reason: collision with root package name */
        private String f133372c;

        /* renamed from: d, reason: collision with root package name */
        private String f133373d;

        /* renamed from: e, reason: collision with root package name */
        private long f133374e;

        /* renamed from: f, reason: collision with root package name */
        private byte f133375f;

        @Override // gg.AbstractC14257d.a
        public AbstractC14257d a() {
            if (this.f133375f == 1 && this.f133370a != null && this.f133371b != null && this.f133372c != null && this.f133373d != null) {
                return new C14255b(this.f133370a, this.f133371b, this.f133372c, this.f133373d, this.f133374e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f133370a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f133371b == null) {
                sb2.append(" variantId");
            }
            if (this.f133372c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f133373d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f133375f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gg.AbstractC14257d.a
        public AbstractC14257d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f133372c = str;
            return this;
        }

        @Override // gg.AbstractC14257d.a
        public AbstractC14257d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f133373d = str;
            return this;
        }

        @Override // gg.AbstractC14257d.a
        public AbstractC14257d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f133370a = str;
            return this;
        }

        @Override // gg.AbstractC14257d.a
        public AbstractC14257d.a e(long j10) {
            this.f133374e = j10;
            this.f133375f = (byte) (this.f133375f | 1);
            return this;
        }

        @Override // gg.AbstractC14257d.a
        public AbstractC14257d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f133371b = str;
            return this;
        }

        C2096b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC14257d) {
            AbstractC14257d abstractC14257d = (AbstractC14257d) obj;
            if (this.f133365b.equals(abstractC14257d.d()) && this.f133366c.equals(abstractC14257d.f()) && this.f133367d.equals(abstractC14257d.b()) && this.f133368e.equals(abstractC14257d.c()) && this.f133369f == abstractC14257d.e()) {
                return true;
            }
        }
        return false;
    }

    private C14255b(String str, String str2, String str3, String str4, long j10) {
        this.f133365b = str;
        this.f133366c = str2;
        this.f133367d = str3;
        this.f133368e = str4;
        this.f133369f = j10;
    }

    @Override // gg.AbstractC14257d
    public String b() {
        return this.f133367d;
    }

    @Override // gg.AbstractC14257d
    public String c() {
        return this.f133368e;
    }

    @Override // gg.AbstractC14257d
    public String d() {
        return this.f133365b;
    }

    @Override // gg.AbstractC14257d
    public long e() {
        return this.f133369f;
    }

    @Override // gg.AbstractC14257d
    public String f() {
        return this.f133366c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f133365b.hashCode() ^ 1000003) * 1000003) ^ this.f133366c.hashCode()) * 1000003) ^ this.f133367d.hashCode()) * 1000003) ^ this.f133368e.hashCode()) * 1000003;
        long j10 = this.f133369f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f133365b + ", variantId=" + this.f133366c + ", parameterKey=" + this.f133367d + ", parameterValue=" + this.f133368e + ", templateVersion=" + this.f133369f + "}";
    }
}
