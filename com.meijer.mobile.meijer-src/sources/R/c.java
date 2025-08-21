package R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final R.a f31500a;

    /* renamed from: b, reason: collision with root package name */
    private final d f31501b;

    /* renamed from: c, reason: collision with root package name */
    private final b f31502c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31503d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private R.a f31504a;

        /* renamed from: b, reason: collision with root package name */
        private d f31505b;

        /* renamed from: c, reason: collision with root package name */
        private b f31506c;

        /* renamed from: d, reason: collision with root package name */
        private int f31507d;

        public a() {
            this.f31504a = R.a.f31496c;
            this.f31505b = null;
            this.f31506c = null;
            this.f31507d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f31504a, this.f31505b, this.f31506c, this.f31507d);
        }

        public a c(int i10) {
            this.f31507d = i10;
            return this;
        }

        public a d(R.a aVar) {
            this.f31504a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f31506c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f31505b = dVar;
            return this;
        }

        private a(c cVar) {
            this.f31504a = R.a.f31496c;
            this.f31505b = null;
            this.f31506c = null;
            this.f31507d = 0;
            this.f31504a = cVar.b();
            this.f31505b = cVar.d();
            this.f31506c = cVar.c();
            this.f31507d = cVar.a();
        }
    }

    public int a() {
        return this.f31503d;
    }

    public R.a b() {
        return this.f31500a;
    }

    public b c() {
        return this.f31502c;
    }

    public d d() {
        return this.f31501b;
    }

    c(R.a aVar, d dVar, b bVar, int i10) {
        this.f31500a = aVar;
        this.f31501b = dVar;
        this.f31502c = bVar;
        this.f31503d = i10;
    }
}
