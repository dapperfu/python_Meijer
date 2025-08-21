package wc;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f167098c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f167099a;

    /* renamed from: b, reason: collision with root package name */
    private final long f167100b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f167101a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f167102b = 0;

        public e a() {
            return new e(this.f167101a, this.f167102b);
        }

        public a b(long j10) {
            this.f167101a = j10;
            return this;
        }

        public a c(long j10) {
            this.f167102b = j10;
            return this;
        }

        a() {
        }
    }

    public static a c() {
        return new a();
    }

    @Gf.d(tag = 1)
    public long a() {
        return this.f167099a;
    }

    @Gf.d(tag = 2)
    public long b() {
        return this.f167100b;
    }

    e(long j10, long j11) {
        this.f167099a = j10;
        this.f167100b = j11;
    }
}
