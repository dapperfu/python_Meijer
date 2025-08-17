package R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final R.a f31498a;

    /* renamed from: b, reason: collision with root package name */
    private final d f31499b;

    /* renamed from: c, reason: collision with root package name */
    private final b f31500c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31501d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private R.a f31502a;

        /* renamed from: b, reason: collision with root package name */
        private d f31503b;

        /* renamed from: c, reason: collision with root package name */
        private b f31504c;

        /* renamed from: d, reason: collision with root package name */
        private int f31505d;

        public a() {
            this.f31502a = R.a.f31494c;
            this.f31503b = null;
            this.f31504c = null;
            this.f31505d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f31502a, this.f31503b, this.f31504c, this.f31505d);
        }

        public a c(int i10) {
            this.f31505d = i10;
            return this;
        }

        public a d(R.a aVar) {
            this.f31502a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f31504c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f31503b = dVar;
            return this;
        }

        private a(c cVar) {
            this.f31502a = R.a.f31494c;
            this.f31503b = null;
            this.f31504c = null;
            this.f31505d = 0;
            this.f31502a = cVar.b();
            this.f31503b = cVar.d();
            this.f31504c = cVar.c();
            this.f31505d = cVar.a();
        }
    }

    public int a() {
        return this.f31501d;
    }

    public R.a b() {
        return this.f31498a;
    }

    public b c() {
        return this.f31500c;
    }

    public d d() {
        return this.f31499b;
    }

    c(R.a aVar, d dVar, b bVar, int i10) {
        this.f31498a = aVar;
        this.f31499b = dVar;
        this.f31500c = bVar;
        this.f31501d = i10;
    }
}
