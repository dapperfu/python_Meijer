package x3;

import x3.J;

/* renamed from: x3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C18069h implements J {

    /* renamed from: a, reason: collision with root package name */
    private final long f170285a;

    /* renamed from: b, reason: collision with root package name */
    private final long f170286b;

    /* renamed from: c, reason: collision with root package name */
    private final int f170287c;

    /* renamed from: d, reason: collision with root package name */
    private final long f170288d;

    /* renamed from: e, reason: collision with root package name */
    private final int f170289e;

    /* renamed from: f, reason: collision with root package name */
    private final long f170290f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f170291g;

    private long a(long j10) {
        int i10 = this.f170287c;
        long jMin = (((j10 * this.f170289e) / 8000000) / i10) * i10;
        long j11 = this.f170288d;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - i10);
        }
        return this.f170286b + Math.max(jMin, 0L);
    }

    private static long c(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    public long b(long j10) {
        return c(j10, this.f170286b, this.f170289e);
    }

    @Override // x3.J
    public J.a d(long j10) {
        if (this.f170288d == -1 && !this.f170291g) {
            return new J.a(new K(0L, this.f170286b));
        }
        long jA = a(j10);
        long jB = b(jA);
        K k10 = new K(jB, jA);
        if (this.f170288d != -1 && jB < j10) {
            int i10 = this.f170287c;
            if (i10 + jA < this.f170285a) {
                long j11 = jA + i10;
                return new J.a(k10, new K(b(j11), j11));
            }
        }
        return new J.a(k10);
    }

    @Override // x3.J
    public boolean g() {
        return this.f170288d != -1 || this.f170291g;
    }

    @Override // x3.J
    public long l() {
        return this.f170290f;
    }

    public C18069h(long j10, long j11, int i10, int i11, boolean z10) {
        this.f170285a = j10;
        this.f170286b = j11;
        this.f170287c = i11 == -1 ? 1 : i11;
        this.f170289e = i10;
        this.f170291g = z10;
        if (j10 == -1) {
            this.f170288d = -1L;
            this.f170290f = -9223372036854775807L;
        } else {
            this.f170288d = j10 - j11;
            this.f170290f = c(j10, j11, i10);
        }
    }
}
