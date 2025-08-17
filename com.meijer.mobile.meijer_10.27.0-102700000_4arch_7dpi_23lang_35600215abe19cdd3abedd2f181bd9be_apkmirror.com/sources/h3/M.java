package h3;

import d3.C13466a;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: c, reason: collision with root package name */
    public static final M f134199c;

    /* renamed from: d, reason: collision with root package name */
    public static final M f134200d;

    /* renamed from: e, reason: collision with root package name */
    public static final M f134201e;

    /* renamed from: f, reason: collision with root package name */
    public static final M f134202f;

    /* renamed from: g, reason: collision with root package name */
    public static final M f134203g;

    /* renamed from: a, reason: collision with root package name */
    public final long f134204a;

    /* renamed from: b, reason: collision with root package name */
    public final long f134205b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M.class == obj.getClass()) {
            M m10 = (M) obj;
            if (this.f134204a == m10.f134204a && this.f134205b == m10.f134205b) {
                return true;
            }
        }
        return false;
    }

    static {
        M m10 = new M(0L, 0L);
        f134199c = m10;
        f134200d = new M(Long.MAX_VALUE, Long.MAX_VALUE);
        f134201e = new M(Long.MAX_VALUE, 0L);
        f134202f = new M(0L, Long.MAX_VALUE);
        f134203g = m10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(long r9, long r11, long r13) {
        /*
            r8 = this;
            long r2 = r8.f134204a
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r8.f134205b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return r9
        Lf:
            r4 = -9223372036854775808
            r0 = r9
            long r9 = d3.P.f1(r0, r2, r4)
            long r2 = r8.f134205b
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = d3.P.c(r0, r2, r4)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 > 0) goto L2d
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 > 0) goto L2d
            r4 = r6
            goto L2e
        L2d:
            r4 = r5
        L2e:
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 > 0) goto L37
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L37
            r5 = r6
        L37:
            if (r4 == 0) goto L4c
            if (r5 == 0) goto L4c
            long r9 = r11 - r0
            long r9 = java.lang.Math.abs(r9)
            long r0 = r13 - r0
            long r0 = java.lang.Math.abs(r0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L51
            goto L4e
        L4c:
            if (r4 == 0) goto L4f
        L4e:
            return r11
        L4f:
            if (r5 == 0) goto L52
        L51:
            return r13
        L52:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.M.a(long, long, long):long");
    }

    public int hashCode() {
        return (((int) this.f134204a) * 31) + ((int) this.f134205b);
    }

    public M(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        C13466a.a(j11 >= 0);
        this.f134204a = j10;
        this.f134205b = j11;
    }
}
