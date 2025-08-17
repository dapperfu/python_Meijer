package x3;

import x3.J;

/* renamed from: x3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C18003h implements J {

    /* renamed from: a, reason: collision with root package name */
    private final long f169197a;

    /* renamed from: b, reason: collision with root package name */
    private final long f169198b;

    /* renamed from: c, reason: collision with root package name */
    private final int f169199c;

    /* renamed from: d, reason: collision with root package name */
    private final long f169200d;

    /* renamed from: e, reason: collision with root package name */
    private final int f169201e;

    /* renamed from: f, reason: collision with root package name */
    private final long f169202f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f169203g;

    private long a(long j10) {
        int i10 = this.f169199c;
        long jMin = (((j10 * this.f169201e) / 8000000) / i10) * i10;
        long j11 = this.f169200d;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - i10);
        }
        return this.f169198b + Math.max(jMin, 0L);
    }

    private static long c(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    public long b(long j10) {
        return c(j10, this.f169198b, this.f169201e);
    }

    @Override // x3.J
    public J.a d(long j10) {
        if (this.f169200d == -1 && !this.f169203g) {
            return new J.a(new K(0L, this.f169198b));
        }
        long jA = a(j10);
        long jB = b(jA);
        K k10 = new K(jB, jA);
        if (this.f169200d != -1 && jB < j10) {
            int i10 = this.f169199c;
            if (i10 + jA < this.f169197a) {
                long j11 = jA + i10;
                return new J.a(k10, new K(b(j11), j11));
            }
        }
        return new J.a(k10);
    }

    @Override // x3.J
    public boolean g() {
        return this.f169200d != -1 || this.f169203g;
    }

    @Override // x3.J
    public long l() {
        return this.f169202f;
    }

    public C18003h(long j10, long j11, int i10, int i11, boolean z10) {
        this.f169197a = j10;
        this.f169198b = j11;
        this.f169199c = i11 == -1 ? 1 : i11;
        this.f169201e = i10;
        this.f169203g = z10;
        if (j10 == -1) {
            this.f169200d = -1L;
            this.f169202f = -9223372036854775807L;
        } else {
            this.f169200d = j10 - j11;
            this.f169202f = c(j10, j11, i10);
        }
    }
}
