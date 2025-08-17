package rf;

import rf.AbstractC16777F;

/* renamed from: rf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16780b extends AbstractC16777F {

    /* renamed from: b, reason: collision with root package name */
    private final String f158360b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158361c;

    /* renamed from: d, reason: collision with root package name */
    private final int f158362d;

    /* renamed from: e, reason: collision with root package name */
    private final String f158363e;

    /* renamed from: f, reason: collision with root package name */
    private final String f158364f;

    /* renamed from: g, reason: collision with root package name */
    private final String f158365g;

    /* renamed from: h, reason: collision with root package name */
    private final String f158366h;

    /* renamed from: i, reason: collision with root package name */
    private final String f158367i;

    /* renamed from: j, reason: collision with root package name */
    private final String f158368j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC16777F.e f158369k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC16777F.d f158370l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC16777F.a f158371m;

    /* renamed from: rf.b$b, reason: collision with other inner class name */
    static final class C2465b extends AbstractC16777F.b {

        /* renamed from: a, reason: collision with root package name */
        private String f158372a;

        /* renamed from: b, reason: collision with root package name */
        private String f158373b;

        /* renamed from: c, reason: collision with root package name */
        private int f158374c;

        /* renamed from: d, reason: collision with root package name */
        private String f158375d;

        /* renamed from: e, reason: collision with root package name */
        private String f158376e;

        /* renamed from: f, reason: collision with root package name */
        private String f158377f;

        /* renamed from: g, reason: collision with root package name */
        private String f158378g;

        /* renamed from: h, reason: collision with root package name */
        private String f158379h;

        /* renamed from: i, reason: collision with root package name */
        private String f158380i;

        /* renamed from: j, reason: collision with root package name */
        private AbstractC16777F.e f158381j;

        /* renamed from: k, reason: collision with root package name */
        private AbstractC16777F.d f158382k;

        /* renamed from: l, reason: collision with root package name */
        private AbstractC16777F.a f158383l;

        /* renamed from: m, reason: collision with root package name */
        private byte f158384m;

        C2465b() {
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F a() {
            if (this.f158384m == 1 && this.f158372a != null && this.f158373b != null && this.f158375d != null && this.f158379h != null && this.f158380i != null) {
                return new C16780b(this.f158372a, this.f158373b, this.f158374c, this.f158375d, this.f158376e, this.f158377f, this.f158378g, this.f158379h, this.f158380i, this.f158381j, this.f158382k, this.f158383l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158372a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f158373b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f158384m) == 0) {
                sb2.append(" platform");
            }
            if (this.f158375d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f158379h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f158380i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b b(AbstractC16777F.a aVar) {
            this.f158383l = aVar;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b c(String str) {
            this.f158378g = str;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f158379h = str;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f158380i = str;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b f(String str) {
            this.f158377f = str;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b g(String str) {
            this.f158376e = str;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f158373b = str;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f158375d = str;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b j(AbstractC16777F.d dVar) {
            this.f158382k = dVar;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b k(int i10) {
            this.f158374c = i10;
            this.f158384m = (byte) (this.f158384m | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f158372a = str;
            return this;
        }

        @Override // rf.AbstractC16777F.b
        public AbstractC16777F.b m(AbstractC16777F.e eVar) {
            this.f158381j = eVar;
            return this;
        }

        private C2465b(AbstractC16777F abstractC16777F) {
            this.f158372a = abstractC16777F.m();
            this.f158373b = abstractC16777F.i();
            this.f158374c = abstractC16777F.l();
            this.f158375d = abstractC16777F.j();
            this.f158376e = abstractC16777F.h();
            this.f158377f = abstractC16777F.g();
            this.f158378g = abstractC16777F.d();
            this.f158379h = abstractC16777F.e();
            this.f158380i = abstractC16777F.f();
            this.f158381j = abstractC16777F.n();
            this.f158382k = abstractC16777F.k();
            this.f158383l = abstractC16777F.c();
            this.f158384m = (byte) 1;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        AbstractC16777F.e eVar;
        AbstractC16777F.d dVar;
        AbstractC16777F.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F) {
            AbstractC16777F abstractC16777F = (AbstractC16777F) obj;
            if (this.f158360b.equals(abstractC16777F.m()) && this.f158361c.equals(abstractC16777F.i()) && this.f158362d == abstractC16777F.l() && this.f158363e.equals(abstractC16777F.j()) && ((str = this.f158364f) != null ? str.equals(abstractC16777F.h()) : abstractC16777F.h() == null) && ((str2 = this.f158365g) != null ? str2.equals(abstractC16777F.g()) : abstractC16777F.g() == null) && ((str3 = this.f158366h) != null ? str3.equals(abstractC16777F.d()) : abstractC16777F.d() == null) && this.f158367i.equals(abstractC16777F.e()) && this.f158368j.equals(abstractC16777F.f()) && ((eVar = this.f158369k) != null ? eVar.equals(abstractC16777F.n()) : abstractC16777F.n() == null) && ((dVar = this.f158370l) != null ? dVar.equals(abstractC16777F.k()) : abstractC16777F.k() == null) && ((aVar = this.f158371m) != null ? aVar.equals(abstractC16777F.c()) : abstractC16777F.c() == null)) {
                return true;
            }
        }
        return false;
    }

    private C16780b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, AbstractC16777F.e eVar, AbstractC16777F.d dVar, AbstractC16777F.a aVar) {
        this.f158360b = str;
        this.f158361c = str2;
        this.f158362d = i10;
        this.f158363e = str3;
        this.f158364f = str4;
        this.f158365g = str5;
        this.f158366h = str6;
        this.f158367i = str7;
        this.f158368j = str8;
        this.f158369k = eVar;
        this.f158370l = dVar;
        this.f158371m = aVar;
    }

    @Override // rf.AbstractC16777F
    public AbstractC16777F.a c() {
        return this.f158371m;
    }

    @Override // rf.AbstractC16777F
    public String d() {
        return this.f158366h;
    }

    @Override // rf.AbstractC16777F
    public String e() {
        return this.f158367i;
    }

    @Override // rf.AbstractC16777F
    public String f() {
        return this.f158368j;
    }

    @Override // rf.AbstractC16777F
    public String g() {
        return this.f158365g;
    }

    @Override // rf.AbstractC16777F
    public String h() {
        return this.f158364f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f158360b.hashCode() ^ 1000003) * 1000003) ^ this.f158361c.hashCode()) * 1000003) ^ this.f158362d) * 1000003) ^ this.f158363e.hashCode()) * 1000003;
        String str = this.f158364f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f158365g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f158366h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f158367i.hashCode()) * 1000003) ^ this.f158368j.hashCode()) * 1000003;
        AbstractC16777F.e eVar = this.f158369k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC16777F.d dVar = this.f158370l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        AbstractC16777F.a aVar = this.f158371m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // rf.AbstractC16777F
    public String i() {
        return this.f158361c;
    }

    @Override // rf.AbstractC16777F
    public String j() {
        return this.f158363e;
    }

    @Override // rf.AbstractC16777F
    public AbstractC16777F.d k() {
        return this.f158370l;
    }

    @Override // rf.AbstractC16777F
    public int l() {
        return this.f158362d;
    }

    @Override // rf.AbstractC16777F
    public String m() {
        return this.f158360b;
    }

    @Override // rf.AbstractC16777F
    public AbstractC16777F.e n() {
        return this.f158369k;
    }

    @Override // rf.AbstractC16777F
    protected AbstractC16777F.b o() {
        return new C2465b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f158360b + ", gmpAppId=" + this.f158361c + ", platform=" + this.f158362d + ", installationUuid=" + this.f158363e + ", firebaseInstallationId=" + this.f158364f + ", firebaseAuthenticationToken=" + this.f158365g + ", appQualitySessionId=" + this.f158366h + ", buildVersion=" + this.f158367i + ", displayVersion=" + this.f158368j + ", session=" + this.f158369k + ", ndkPayload=" + this.f158370l + ", appExitInfo=" + this.f158371m + "}";
    }
}
