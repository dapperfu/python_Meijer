package uc;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f162889c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f162890a;

    /* renamed from: b, reason: collision with root package name */
    private final long f162891b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f162892a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f162893b = 0;

        public e a() {
            return new e(this.f162892a, this.f162893b);
        }

        public a b(long j10) {
            this.f162892a = j10;
            return this;
        }

        public a c(long j10) {
            this.f162893b = j10;
            return this;
        }

        a() {
        }
    }

    public static a c() {
        return new a();
    }

    @Ef.d(tag = 1)
    public long a() {
        return this.f162890a;
    }

    @Ef.d(tag = 2)
    public long b() {
        return this.f162891b;
    }

    e(long j10, long j11) {
        this.f162890a = j10;
        this.f162891b = j11;
    }
}
