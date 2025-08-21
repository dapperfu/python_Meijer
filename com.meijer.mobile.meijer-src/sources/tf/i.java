package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class i extends AbstractC17251F.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f162893a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162894b;

    /* renamed from: c, reason: collision with root package name */
    private final String f162895c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC17251F.e.a.b f162896d;

    /* renamed from: e, reason: collision with root package name */
    private final String f162897e;

    /* renamed from: f, reason: collision with root package name */
    private final String f162898f;

    /* renamed from: g, reason: collision with root package name */
    private final String f162899g;

    static final class b extends AbstractC17251F.e.a.AbstractC2554a {

        /* renamed from: a, reason: collision with root package name */
        private String f162900a;

        /* renamed from: b, reason: collision with root package name */
        private String f162901b;

        /* renamed from: c, reason: collision with root package name */
        private String f162902c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC17251F.e.a.b f162903d;

        /* renamed from: e, reason: collision with root package name */
        private String f162904e;

        /* renamed from: f, reason: collision with root package name */
        private String f162905f;

        /* renamed from: g, reason: collision with root package name */
        private String f162906g;

        @Override // tf.AbstractC17251F.e.a.AbstractC2554a
        public AbstractC17251F.e.a a() {
            String str;
            String str2 = this.f162900a;
            if (str2 != null && (str = this.f162901b) != null) {
                return new i(str2, str, this.f162902c, this.f162903d, this.f162904e, this.f162905f, this.f162906g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162900a == null) {
                sb2.append(" identifier");
            }
            if (this.f162901b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.a.AbstractC2554a
        public AbstractC17251F.e.a.AbstractC2554a b(String str) {
            this.f162905f = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.a.AbstractC2554a
        public AbstractC17251F.e.a.AbstractC2554a c(String str) {
            this.f162906g = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.a.AbstractC2554a
        public AbstractC17251F.e.a.AbstractC2554a d(String str) {
            this.f162902c = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.a.AbstractC2554a
        public AbstractC17251F.e.a.AbstractC2554a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f162900a = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.a.AbstractC2554a
        public AbstractC17251F.e.a.AbstractC2554a f(String str) {
            this.f162904e = str;
            return this;
        }

        @Override // tf.AbstractC17251F.e.a.AbstractC2554a
        public AbstractC17251F.e.a.AbstractC2554a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f162901b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC17251F.e.a.b bVar;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.a) {
            AbstractC17251F.e.a aVar = (AbstractC17251F.e.a) obj;
            if (this.f162893a.equals(aVar.e()) && this.f162894b.equals(aVar.h()) && ((str = this.f162895c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f162896d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f162897e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f162898f) != null ? str3.equals(aVar.b()) : aVar.b() == null) && ((str4 = this.f162899g) != null ? str4.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    private i(String str, String str2, String str3, AbstractC17251F.e.a.b bVar, String str4, String str5, String str6) {
        this.f162893a = str;
        this.f162894b = str2;
        this.f162895c = str3;
        this.f162896d = bVar;
        this.f162897e = str4;
        this.f162898f = str5;
        this.f162899g = str6;
    }

    @Override // tf.AbstractC17251F.e.a
    public String b() {
        return this.f162898f;
    }

    @Override // tf.AbstractC17251F.e.a
    public String c() {
        return this.f162899g;
    }

    @Override // tf.AbstractC17251F.e.a
    public String d() {
        return this.f162895c;
    }

    @Override // tf.AbstractC17251F.e.a
    public String e() {
        return this.f162893a;
    }

    @Override // tf.AbstractC17251F.e.a
    public String f() {
        return this.f162897e;
    }

    @Override // tf.AbstractC17251F.e.a
    public AbstractC17251F.e.a.b g() {
        return this.f162896d;
    }

    @Override // tf.AbstractC17251F.e.a
    public String h() {
        return this.f162894b;
    }

    public int hashCode() {
        int iHashCode = (((this.f162893a.hashCode() ^ 1000003) * 1000003) ^ this.f162894b.hashCode()) * 1000003;
        String str = this.f162895c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AbstractC17251F.e.a.b bVar = this.f162896d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f162897e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f162898f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f162899g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f162893a + ", version=" + this.f162894b + ", displayVersion=" + this.f162895c + ", organization=" + this.f162896d + ", installationUuid=" + this.f162897e + ", developmentPlatform=" + this.f162898f + ", developmentPlatformVersion=" + this.f162899g + "}";
    }
}
