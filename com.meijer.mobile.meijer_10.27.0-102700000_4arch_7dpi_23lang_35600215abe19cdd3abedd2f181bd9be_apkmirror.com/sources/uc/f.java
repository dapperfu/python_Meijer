package uc;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f162894c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f162895a;

    /* renamed from: b, reason: collision with root package name */
    private final long f162896b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f162897a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f162898b = 0;

        public f a() {
            return new f(this.f162897a, this.f162898b);
        }

        public a b(long j10) {
            this.f162898b = j10;
            return this;
        }

        public a c(long j10) {
            this.f162897a = j10;
            return this;
        }

        a() {
        }
    }

    public static a c() {
        return new a();
    }

    @Ef.d(tag = 2)
    public long a() {
        return this.f162896b;
    }

    @Ef.d(tag = 1)
    public long b() {
        return this.f162895a;
    }

    f(long j10, long j11) {
        this.f162895a = j10;
        this.f162896b = j11;
    }
}
