package Rf;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    private static final a f32501p = new C0737a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f32502a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32503b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32504c;

    /* renamed from: d, reason: collision with root package name */
    private final c f32505d;

    /* renamed from: e, reason: collision with root package name */
    private final d f32506e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32507f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32508g;

    /* renamed from: h, reason: collision with root package name */
    private final int f32509h;

    /* renamed from: i, reason: collision with root package name */
    private final int f32510i;

    /* renamed from: j, reason: collision with root package name */
    private final String f32511j;

    /* renamed from: k, reason: collision with root package name */
    private final long f32512k;

    /* renamed from: l, reason: collision with root package name */
    private final b f32513l;

    /* renamed from: m, reason: collision with root package name */
    private final String f32514m;

    /* renamed from: n, reason: collision with root package name */
    private final long f32515n;

    /* renamed from: o, reason: collision with root package name */
    private final String f32516o;

    /* renamed from: Rf.a$a, reason: collision with other inner class name */
    public static final class C0737a {

        /* renamed from: a, reason: collision with root package name */
        private long f32517a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f32518b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f32519c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f32520d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f32521e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f32522f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f32523g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f32524h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f32525i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f32526j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f32527k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f32528l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f32529m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f32530n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f32531o = "";

        public a a() {
            return new a(this.f32517a, this.f32518b, this.f32519c, this.f32520d, this.f32521e, this.f32522f, this.f32523g, this.f32524h, this.f32525i, this.f32526j, this.f32527k, this.f32528l, this.f32529m, this.f32530n, this.f32531o);
        }

        public C0737a b(String str) {
            this.f32529m = str;
            return this;
        }

        public C0737a c(String str) {
            this.f32523g = str;
            return this;
        }

        public C0737a d(String str) {
            this.f32531o = str;
            return this;
        }

        public C0737a e(b bVar) {
            this.f32528l = bVar;
            return this;
        }

        public C0737a f(String str) {
            this.f32519c = str;
            return this;
        }

        public C0737a g(String str) {
            this.f32518b = str;
            return this;
        }

        public C0737a h(c cVar) {
            this.f32520d = cVar;
            return this;
        }

        public C0737a i(String str) {
            this.f32522f = str;
            return this;
        }

        public C0737a j(int i10) {
            this.f32524h = i10;
            return this;
        }

        public C0737a k(long j10) {
            this.f32517a = j10;
            return this;
        }

        public C0737a l(d dVar) {
            this.f32521e = dVar;
            return this;
        }

        public C0737a m(String str) {
            this.f32526j = str;
            return this;
        }

        public C0737a n(int i10) {
            this.f32525i = i10;
            return this;
        }

        C0737a() {
        }
    }

    public enum b implements Gf.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f32536a;

        @Override // Gf.c
        public int g() {
            return this.f32536a;
        }

        b(int i10) {
            this.f32536a = i10;
        }
    }

    public enum c implements Gf.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f32542a;

        @Override // Gf.c
        public int g() {
            return this.f32542a;
        }

        c(int i10) {
            this.f32542a = i10;
        }
    }

    public enum d implements Gf.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f32548a;

        @Override // Gf.c
        public int g() {
            return this.f32548a;
        }

        d(int i10) {
            this.f32548a = i10;
        }
    }

    public static C0737a p() {
        return new C0737a();
    }

    @Gf.d(tag = 13)
    public String a() {
        return this.f32514m;
    }

    @Gf.d(tag = 11)
    public long b() {
        return this.f32512k;
    }

    @Gf.d(tag = 14)
    public long c() {
        return this.f32515n;
    }

    @Gf.d(tag = 7)
    public String d() {
        return this.f32508g;
    }

    @Gf.d(tag = 15)
    public String e() {
        return this.f32516o;
    }

    @Gf.d(tag = 12)
    public b f() {
        return this.f32513l;
    }

    @Gf.d(tag = 3)
    public String g() {
        return this.f32504c;
    }

    @Gf.d(tag = 2)
    public String h() {
        return this.f32503b;
    }

    @Gf.d(tag = 4)
    public c i() {
        return this.f32505d;
    }

    @Gf.d(tag = 6)
    public String j() {
        return this.f32507f;
    }

    @Gf.d(tag = 8)
    public int k() {
        return this.f32509h;
    }

    @Gf.d(tag = 1)
    public long l() {
        return this.f32502a;
    }

    @Gf.d(tag = 5)
    public d m() {
        return this.f32506e;
    }

    @Gf.d(tag = 10)
    public String n() {
        return this.f32511j;
    }

    @Gf.d(tag = 9)
    public int o() {
        return this.f32510i;
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f32502a = j10;
        this.f32503b = str;
        this.f32504c = str2;
        this.f32505d = cVar;
        this.f32506e = dVar;
        this.f32507f = str3;
        this.f32508g = str4;
        this.f32509h = i10;
        this.f32510i = i11;
        this.f32511j = str5;
        this.f32512k = j11;
        this.f32513l = bVar;
        this.f32514m = str6;
        this.f32515n = j12;
        this.f32516o = str7;
    }
}
