package Pf;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    private static final a f25287p = new C0445a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f25288a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25289b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25290c;

    /* renamed from: d, reason: collision with root package name */
    private final c f25291d;

    /* renamed from: e, reason: collision with root package name */
    private final d f25292e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25293f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25294g;

    /* renamed from: h, reason: collision with root package name */
    private final int f25295h;

    /* renamed from: i, reason: collision with root package name */
    private final int f25296i;

    /* renamed from: j, reason: collision with root package name */
    private final String f25297j;

    /* renamed from: k, reason: collision with root package name */
    private final long f25298k;

    /* renamed from: l, reason: collision with root package name */
    private final b f25299l;

    /* renamed from: m, reason: collision with root package name */
    private final String f25300m;

    /* renamed from: n, reason: collision with root package name */
    private final long f25301n;

    /* renamed from: o, reason: collision with root package name */
    private final String f25302o;

    /* renamed from: Pf.a$a, reason: collision with other inner class name */
    public static final class C0445a {

        /* renamed from: a, reason: collision with root package name */
        private long f25303a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f25304b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f25305c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f25306d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f25307e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f25308f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f25309g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f25310h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f25311i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f25312j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f25313k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f25314l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f25315m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f25316n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f25317o = "";

        public a a() {
            return new a(this.f25303a, this.f25304b, this.f25305c, this.f25306d, this.f25307e, this.f25308f, this.f25309g, this.f25310h, this.f25311i, this.f25312j, this.f25313k, this.f25314l, this.f25315m, this.f25316n, this.f25317o);
        }

        public C0445a b(String str) {
            this.f25315m = str;
            return this;
        }

        public C0445a c(String str) {
            this.f25309g = str;
            return this;
        }

        public C0445a d(String str) {
            this.f25317o = str;
            return this;
        }

        public C0445a e(b bVar) {
            this.f25314l = bVar;
            return this;
        }

        public C0445a f(String str) {
            this.f25305c = str;
            return this;
        }

        public C0445a g(String str) {
            this.f25304b = str;
            return this;
        }

        public C0445a h(c cVar) {
            this.f25306d = cVar;
            return this;
        }

        public C0445a i(String str) {
            this.f25308f = str;
            return this;
        }

        public C0445a j(int i10) {
            this.f25310h = i10;
            return this;
        }

        public C0445a k(long j10) {
            this.f25303a = j10;
            return this;
        }

        public C0445a l(d dVar) {
            this.f25307e = dVar;
            return this;
        }

        public C0445a m(String str) {
            this.f25312j = str;
            return this;
        }

        public C0445a n(int i10) {
            this.f25311i = i10;
            return this;
        }

        C0445a() {
        }
    }

    public enum b implements Ef.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f25322a;

        @Override // Ef.c
        public int g() {
            return this.f25322a;
        }

        b(int i10) {
            this.f25322a = i10;
        }
    }

    public enum c implements Ef.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f25328a;

        @Override // Ef.c
        public int g() {
            return this.f25328a;
        }

        c(int i10) {
            this.f25328a = i10;
        }
    }

    public enum d implements Ef.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f25334a;

        @Override // Ef.c
        public int g() {
            return this.f25334a;
        }

        d(int i10) {
            this.f25334a = i10;
        }
    }

    public static C0445a p() {
        return new C0445a();
    }

    @Ef.d(tag = 13)
    public String a() {
        return this.f25300m;
    }

    @Ef.d(tag = 11)
    public long b() {
        return this.f25298k;
    }

    @Ef.d(tag = 14)
    public long c() {
        return this.f25301n;
    }

    @Ef.d(tag = 7)
    public String d() {
        return this.f25294g;
    }

    @Ef.d(tag = 15)
    public String e() {
        return this.f25302o;
    }

    @Ef.d(tag = 12)
    public b f() {
        return this.f25299l;
    }

    @Ef.d(tag = 3)
    public String g() {
        return this.f25290c;
    }

    @Ef.d(tag = 2)
    public String h() {
        return this.f25289b;
    }

    @Ef.d(tag = 4)
    public c i() {
        return this.f25291d;
    }

    @Ef.d(tag = 6)
    public String j() {
        return this.f25293f;
    }

    @Ef.d(tag = 8)
    public int k() {
        return this.f25295h;
    }

    @Ef.d(tag = 1)
    public long l() {
        return this.f25288a;
    }

    @Ef.d(tag = 5)
    public d m() {
        return this.f25292e;
    }

    @Ef.d(tag = 10)
    public String n() {
        return this.f25297j;
    }

    @Ef.d(tag = 9)
    public int o() {
        return this.f25296i;
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f25288a = j10;
        this.f25289b = str;
        this.f25290c = str2;
        this.f25291d = cVar;
        this.f25292e = dVar;
        this.f25293f = str3;
        this.f25294g = str4;
        this.f25295h = i10;
        this.f25296i = i11;
        this.f25297j = str5;
        this.f25298k = j11;
        this.f25299l = bVar;
        this.f25300m = str6;
        this.f25301n = j12;
        this.f25302o = str7;
    }
}
