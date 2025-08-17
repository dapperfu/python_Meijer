package rf;

import rf.AbstractC16777F;

/* renamed from: rf.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16782d extends AbstractC16777F.a.AbstractC2446a {

    /* renamed from: a, reason: collision with root package name */
    private final String f158404a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158405b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158406c;

    /* renamed from: rf.d$b */
    static final class b extends AbstractC16777F.a.AbstractC2446a.AbstractC2447a {

        /* renamed from: a, reason: collision with root package name */
        private String f158407a;

        /* renamed from: b, reason: collision with root package name */
        private String f158408b;

        /* renamed from: c, reason: collision with root package name */
        private String f158409c;

        @Override // rf.AbstractC16777F.a.AbstractC2446a.AbstractC2447a
        public AbstractC16777F.a.AbstractC2446a a() {
            String str;
            String str2;
            String str3 = this.f158407a;
            if (str3 != null && (str = this.f158408b) != null && (str2 = this.f158409c) != null) {
                return new C16782d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158407a == null) {
                sb2.append(" arch");
            }
            if (this.f158408b == null) {
                sb2.append(" libraryName");
            }
            if (this.f158409c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.a.AbstractC2446a.AbstractC2447a
        public AbstractC16777F.a.AbstractC2446a.AbstractC2447a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f158407a = str;
            return this;
        }

        @Override // rf.AbstractC16777F.a.AbstractC2446a.AbstractC2447a
        public AbstractC16777F.a.AbstractC2446a.AbstractC2447a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f158409c = str;
            return this;
        }

        @Override // rf.AbstractC16777F.a.AbstractC2446a.AbstractC2447a
        public AbstractC16777F.a.AbstractC2446a.AbstractC2447a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f158408b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.a.AbstractC2446a) {
            AbstractC16777F.a.AbstractC2446a abstractC2446a = (AbstractC16777F.a.AbstractC2446a) obj;
            if (this.f158404a.equals(abstractC2446a.b()) && this.f158405b.equals(abstractC2446a.d()) && this.f158406c.equals(abstractC2446a.c())) {
                return true;
            }
        }
        return false;
    }

    private C16782d(String str, String str2, String str3) {
        this.f158404a = str;
        this.f158405b = str2;
        this.f158406c = str3;
    }

    @Override // rf.AbstractC16777F.a.AbstractC2446a
    public String b() {
        return this.f158404a;
    }

    @Override // rf.AbstractC16777F.a.AbstractC2446a
    public String c() {
        return this.f158406c;
    }

    @Override // rf.AbstractC16777F.a.AbstractC2446a
    public String d() {
        return this.f158405b;
    }

    public int hashCode() {
        return ((((this.f158404a.hashCode() ^ 1000003) * 1000003) ^ this.f158405b.hashCode()) * 1000003) ^ this.f158406c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f158404a + ", libraryName=" + this.f158405b + ", buildId=" + this.f158406c + "}";
    }
}
