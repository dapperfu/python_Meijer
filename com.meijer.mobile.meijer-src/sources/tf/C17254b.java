package tf;

import tf.AbstractC17251F;

/* renamed from: tf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17254b extends AbstractC17251F {

    /* renamed from: b, reason: collision with root package name */
    private final String f162806b;

    /* renamed from: c, reason: collision with root package name */
    private final String f162807c;

    /* renamed from: d, reason: collision with root package name */
    private final int f162808d;

    /* renamed from: e, reason: collision with root package name */
    private final String f162809e;

    /* renamed from: f, reason: collision with root package name */
    private final String f162810f;

    /* renamed from: g, reason: collision with root package name */
    private final String f162811g;

    /* renamed from: h, reason: collision with root package name */
    private final String f162812h;

    /* renamed from: i, reason: collision with root package name */
    private final String f162813i;

    /* renamed from: j, reason: collision with root package name */
    private final String f162814j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC17251F.e f162815k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC17251F.d f162816l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC17251F.a f162817m;

    /* renamed from: tf.b$b, reason: collision with other inner class name */
    static final class C2571b extends AbstractC17251F.b {

        /* renamed from: a, reason: collision with root package name */
        private String f162818a;

        /* renamed from: b, reason: collision with root package name */
        private String f162819b;

        /* renamed from: c, reason: collision with root package name */
        private int f162820c;

        /* renamed from: d, reason: collision with root package name */
        private String f162821d;

        /* renamed from: e, reason: collision with root package name */
        private String f162822e;

        /* renamed from: f, reason: collision with root package name */
        private String f162823f;

        /* renamed from: g, reason: collision with root package name */
        private String f162824g;

        /* renamed from: h, reason: collision with root package name */
        private String f162825h;

        /* renamed from: i, reason: collision with root package name */
        private String f162826i;

        /* renamed from: j, reason: collision with root package name */
        private AbstractC17251F.e f162827j;

        /* renamed from: k, reason: collision with root package name */
        private AbstractC17251F.d f162828k;

        /* renamed from: l, reason: collision with root package name */
        private AbstractC17251F.a f162829l;

        /* renamed from: m, reason: collision with root package name */
        private byte f162830m;

        C2571b() {
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F a() {
            if (this.f162830m == 1 && this.f162818a != null && this.f162819b != null && this.f162821d != null && this.f162825h != null && this.f162826i != null) {
                return new C17254b(this.f162818a, this.f162819b, this.f162820c, this.f162821d, this.f162822e, this.f162823f, this.f162824g, this.f162825h, this.f162826i, this.f162827j, this.f162828k, this.f162829l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162818a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f162819b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f162830m) == 0) {
                sb2.append(" platform");
            }
            if (this.f162821d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f162825h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f162826i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b b(AbstractC17251F.a aVar) {
            this.f162829l = aVar;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b c(String str) {
            this.f162824g = str;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f162825h = str;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f162826i = str;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b f(String str) {
            this.f162823f = str;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b g(String str) {
            this.f162822e = str;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f162819b = str;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f162821d = str;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b j(AbstractC17251F.d dVar) {
            this.f162828k = dVar;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b k(int i10) {
            this.f162820c = i10;
            this.f162830m = (byte) (this.f162830m | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f162818a = str;
            return this;
        }

        @Override // tf.AbstractC17251F.b
        public AbstractC17251F.b m(AbstractC17251F.e eVar) {
            this.f162827j = eVar;
            return this;
        }

        private C2571b(AbstractC17251F abstractC17251F) {
            this.f162818a = abstractC17251F.m();
            this.f162819b = abstractC17251F.i();
            this.f162820c = abstractC17251F.l();
            this.f162821d = abstractC17251F.j();
            this.f162822e = abstractC17251F.h();
            this.f162823f = abstractC17251F.g();
            this.f162824g = abstractC17251F.d();
            this.f162825h = abstractC17251F.e();
            this.f162826i = abstractC17251F.f();
            this.f162827j = abstractC17251F.n();
            this.f162828k = abstractC17251F.k();
            this.f162829l = abstractC17251F.c();
            this.f162830m = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        AbstractC17251F.e eVar;
        AbstractC17251F.d dVar;
        AbstractC17251F.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F) {
            AbstractC17251F abstractC17251F = (AbstractC17251F) obj;
            if (this.f162806b.equals(abstractC17251F.m()) && this.f162807c.equals(abstractC17251F.i()) && this.f162808d == abstractC17251F.l() && this.f162809e.equals(abstractC17251F.j()) && ((str = this.f162810f) != null ? str.equals(abstractC17251F.h()) : abstractC17251F.h() == null) && ((str2 = this.f162811g) != null ? str2.equals(abstractC17251F.g()) : abstractC17251F.g() == null) && ((str3 = this.f162812h) != null ? str3.equals(abstractC17251F.d()) : abstractC17251F.d() == null) && this.f162813i.equals(abstractC17251F.e()) && this.f162814j.equals(abstractC17251F.f()) && ((eVar = this.f162815k) != null ? eVar.equals(abstractC17251F.n()) : abstractC17251F.n() == null) && ((dVar = this.f162816l) != null ? dVar.equals(abstractC17251F.k()) : abstractC17251F.k() == null) && ((aVar = this.f162817m) != null ? aVar.equals(abstractC17251F.c()) : abstractC17251F.c() == null)) {
                return true;
            }
        }
        return false;
    }

    private C17254b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, AbstractC17251F.e eVar, AbstractC17251F.d dVar, AbstractC17251F.a aVar) {
        this.f162806b = str;
        this.f162807c = str2;
        this.f162808d = i10;
        this.f162809e = str3;
        this.f162810f = str4;
        this.f162811g = str5;
        this.f162812h = str6;
        this.f162813i = str7;
        this.f162814j = str8;
        this.f162815k = eVar;
        this.f162816l = dVar;
        this.f162817m = aVar;
    }

    @Override // tf.AbstractC17251F
    public AbstractC17251F.a c() {
        return this.f162817m;
    }

    @Override // tf.AbstractC17251F
    public String d() {
        return this.f162812h;
    }

    @Override // tf.AbstractC17251F
    public String e() {
        return this.f162813i;
    }

    @Override // tf.AbstractC17251F
    public String f() {
        return this.f162814j;
    }

    @Override // tf.AbstractC17251F
    public String g() {
        return this.f162811g;
    }

    @Override // tf.AbstractC17251F
    public String h() {
        return this.f162810f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f162806b.hashCode() ^ 1000003) * 1000003) ^ this.f162807c.hashCode()) * 1000003) ^ this.f162808d) * 1000003) ^ this.f162809e.hashCode()) * 1000003;
        String str = this.f162810f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f162811g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f162812h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f162813i.hashCode()) * 1000003) ^ this.f162814j.hashCode()) * 1000003;
        AbstractC17251F.e eVar = this.f162815k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC17251F.d dVar = this.f162816l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        AbstractC17251F.a aVar = this.f162817m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // tf.AbstractC17251F
    public String i() {
        return this.f162807c;
    }

    @Override // tf.AbstractC17251F
    public String j() {
        return this.f162809e;
    }

    @Override // tf.AbstractC17251F
    public AbstractC17251F.d k() {
        return this.f162816l;
    }

    @Override // tf.AbstractC17251F
    public int l() {
        return this.f162808d;
    }

    @Override // tf.AbstractC17251F
    public String m() {
        return this.f162806b;
    }

    @Override // tf.AbstractC17251F
    public AbstractC17251F.e n() {
        return this.f162815k;
    }

    @Override // tf.AbstractC17251F
    protected AbstractC17251F.b o() {
        return new C2571b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f162806b + ", gmpAppId=" + this.f162807c + ", platform=" + this.f162808d + ", installationUuid=" + this.f162809e + ", firebaseInstallationId=" + this.f162810f + ", firebaseAuthenticationToken=" + this.f162811g + ", appQualitySessionId=" + this.f162812h + ", buildVersion=" + this.f162813i + ", displayVersion=" + this.f162814j + ", session=" + this.f162815k + ", ndkPayload=" + this.f162816l + ", appExitInfo=" + this.f162817m + "}";
    }
}
