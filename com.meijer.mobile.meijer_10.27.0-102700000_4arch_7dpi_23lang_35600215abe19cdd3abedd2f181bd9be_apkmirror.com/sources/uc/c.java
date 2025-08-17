package uc;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f162870c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f162871a;

    /* renamed from: b, reason: collision with root package name */
    private final b f162872b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f162873a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f162874b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f162873a, this.f162874b);
        }

        public a b(long j10) {
            this.f162873a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f162874b = bVar;
            return this;
        }

        a() {
        }
    }

    public enum b implements Ef.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        private final int f162883a;

        @Override // Ef.c
        public int g() {
            return this.f162883a;
        }

        b(int i10) {
            this.f162883a = i10;
        }
    }

    public static a c() {
        return new a();
    }

    @Ef.d(tag = 1)
    public long a() {
        return this.f162871a;
    }

    @Ef.d(tag = 3)
    public b b() {
        return this.f162872b;
    }

    c(long j10, b bVar) {
        this.f162871a = j10;
        this.f162872b = bVar;
    }
}
