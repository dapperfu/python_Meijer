package d3;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private long f127080a;

    /* renamed from: b, reason: collision with root package name */
    private long f127081b;

    /* renamed from: c, reason: collision with root package name */
    private long f127082c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f127083d = new ThreadLocal<>();

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f127080a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) C13466a.e(this.f127083d.get())).longValue();
                }
                this.f127081b = jLongValue - j10;
                notifyAll();
            }
            this.f127082c = j10;
            return j10 + this.f127081b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f127082c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f127082c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = j12 / 8589934592L;
                long j14 = (j13 * 8589934592L) + j10;
                j10 += (j13 + 1) * 8589934592L;
                if (j14 >= j12) {
                    j10 = j14;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long d() {
        long j10;
        j10 = this.f127080a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f127082c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != -9223372036854775807L ? j10 + this.f127081b : d();
    }

    public synchronized long f() {
        return this.f127081b;
    }

    public synchronized boolean g() {
        return this.f127081b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f127080a = j10;
        this.f127081b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f127082c = -9223372036854775807L;
    }

    public J(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return P.V0(j10, 1000000L, 90000L);
    }

    public static long j(long j10) {
        return P.V0(j10, 90000L, 1000000L);
    }
}
