package wc;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f167103c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f167104a;

    /* renamed from: b, reason: collision with root package name */
    private final long f167105b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f167106a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f167107b = 0;

        public f a() {
            return new f(this.f167106a, this.f167107b);
        }

        public a b(long j10) {
            this.f167107b = j10;
            return this;
        }

        public a c(long j10) {
            this.f167106a = j10;
            return this;
        }

        a() {
        }
    }

    public static a c() {
        return new a();
    }

    @Gf.d(tag = 2)
    public long a() {
        return this.f167105b;
    }

    @Gf.d(tag = 1)
    public long b() {
        return this.f167104a;
    }

    f(long j10, long j11) {
        this.f167104a = j10;
        this.f167105b = j11;
    }
}
