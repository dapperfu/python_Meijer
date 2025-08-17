package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class i extends AbstractC16777F.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f158447a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158448b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158449c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16777F.e.a.b f158450d;

    /* renamed from: e, reason: collision with root package name */
    private final String f158451e;

    /* renamed from: f, reason: collision with root package name */
    private final String f158452f;

    /* renamed from: g, reason: collision with root package name */
    private final String f158453g;

    static final class b extends AbstractC16777F.e.a.AbstractC2448a {

        /* renamed from: a, reason: collision with root package name */
        private String f158454a;

        /* renamed from: b, reason: collision with root package name */
        private String f158455b;

        /* renamed from: c, reason: collision with root package name */
        private String f158456c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC16777F.e.a.b f158457d;

        /* renamed from: e, reason: collision with root package name */
        private String f158458e;

        /* renamed from: f, reason: collision with root package name */
        private String f158459f;

        /* renamed from: g, reason: collision with root package name */
        private String f158460g;

        @Override // rf.AbstractC16777F.e.a.AbstractC2448a
        public AbstractC16777F.e.a a() {
            String str;
            String str2 = this.f158454a;
            if (str2 != null && (str = this.f158455b) != null) {
                return new i(str2, str, this.f158456c, this.f158457d, this.f158458e, this.f158459f, this.f158460g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158454a == null) {
                sb2.append(" identifier");
            }
            if (this.f158455b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.a.AbstractC2448a
        public AbstractC16777F.e.a.AbstractC2448a b(String str) {
            this.f158459f = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.a.AbstractC2448a
        public AbstractC16777F.e.a.AbstractC2448a c(String str) {
            this.f158460g = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.a.AbstractC2448a
        public AbstractC16777F.e.a.AbstractC2448a d(String str) {
            this.f158456c = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.a.AbstractC2448a
        public AbstractC16777F.e.a.AbstractC2448a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f158454a = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.a.AbstractC2448a
        public AbstractC16777F.e.a.AbstractC2448a f(String str) {
            this.f158458e = str;
            return this;
        }

        @Override // rf.AbstractC16777F.e.a.AbstractC2448a
        public AbstractC16777F.e.a.AbstractC2448a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f158455b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC16777F.e.a.b bVar;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.a) {
            AbstractC16777F.e.a aVar = (AbstractC16777F.e.a) obj;
            if (this.f158447a.equals(aVar.e()) && this.f158448b.equals(aVar.h()) && ((str = this.f158449c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f158450d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f158451e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f158452f) != null ? str3.equals(aVar.b()) : aVar.b() == null) && ((str4 = this.f158453g) != null ? str4.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    private i(String str, String str2, String str3, AbstractC16777F.e.a.b bVar, String str4, String str5, String str6) {
        this.f158447a = str;
        this.f158448b = str2;
        this.f158449c = str3;
        this.f158450d = bVar;
        this.f158451e = str4;
        this.f158452f = str5;
        this.f158453g = str6;
    }

    @Override // rf.AbstractC16777F.e.a
    public String b() {
        return this.f158452f;
    }

    @Override // rf.AbstractC16777F.e.a
    public String c() {
        return this.f158453g;
    }

    @Override // rf.AbstractC16777F.e.a
    public String d() {
        return this.f158449c;
    }

    @Override // rf.AbstractC16777F.e.a
    public String e() {
        return this.f158447a;
    }

    @Override // rf.AbstractC16777F.e.a
    public String f() {
        return this.f158451e;
    }

    @Override // rf.AbstractC16777F.e.a
    public AbstractC16777F.e.a.b g() {
        return this.f158450d;
    }

    @Override // rf.AbstractC16777F.e.a
    public String h() {
        return this.f158448b;
    }

    public int hashCode() {
        int iHashCode = (((this.f158447a.hashCode() ^ 1000003) * 1000003) ^ this.f158448b.hashCode()) * 1000003;
        String str = this.f158449c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AbstractC16777F.e.a.b bVar = this.f158450d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f158451e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f158452f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f158453g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f158447a + ", version=" + this.f158448b + ", displayVersion=" + this.f158449c + ", organization=" + this.f158450d + ", installationUuid=" + this.f158451e + ", developmentPlatform=" + this.f158452f + ", developmentPlatformVersion=" + this.f158453g + "}";
    }
}
