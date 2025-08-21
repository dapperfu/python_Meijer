package wc;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f167079c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f167080a;

    /* renamed from: b, reason: collision with root package name */
    private final b f167081b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f167082a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f167083b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f167082a, this.f167083b);
        }

        public a b(long j10) {
            this.f167082a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f167083b = bVar;
            return this;
        }

        a() {
        }
    }

    public enum b implements Gf.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        private final int f167092a;

        @Override // Gf.c
        public int g() {
            return this.f167092a;
        }

        b(int i10) {
            this.f167092a = i10;
        }
    }

    public static a c() {
        return new a();
    }

    @Gf.d(tag = 1)
    public long a() {
        return this.f167080a;
    }

    @Gf.d(tag = 3)
    public b b() {
        return this.f167081b;
    }

    c(long j10, b bVar) {
        this.f167080a = j10;
        this.f167081b = bVar;
    }
}
