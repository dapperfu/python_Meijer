package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class DE0 implements YE0, XE0 {

    /* renamed from: a, reason: collision with root package name */
    public final YE0 f67033a;

    /* renamed from: b, reason: collision with root package name */
    private XE0 f67034b;

    /* renamed from: c, reason: collision with root package name */
    private CE0[] f67035c = new CE0[0];

    /* renamed from: d, reason: collision with root package name */
    private long f67036d = 0;

    /* renamed from: e, reason: collision with root package name */
    long f67037e;

    public DE0(YE0 ye0, boolean z10, long j10, long j11) {
        this.f67033a = ye0;
        this.f67037e = j11;
    }

    public final void e(long j10, long j11) {
        this.f67037e = j11;
    }

    final boolean h() {
        return this.f67036d != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.XE0
    public final void a(YE0 ye0) {
        XE0 xe0 = this.f67034b;
        xe0.getClass();
        xe0.a(this);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
        this.f67033a.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean c(C7994eA0 c7994eA0) {
        return this.f67033a.c(c7994eA0);
    }

    @Override // com.google.android.gms.internal.ads.TF0
    public final /* bridge */ /* synthetic */ void d(VF0 vf0) {
        XE0 xe0 = this.f67034b;
        xe0.getClass();
        xe0.d(this);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long g(long j10, LA0 la0) {
        if (j10 == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(la0.f69145a, j10));
        long j11 = la0.f69146b;
        long j12 = this.f67037e;
        long jMax2 = Math.max(0L, Math.min(j11, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10));
        if (jMax != la0.f69145a || jMax2 != la0.f69146b) {
            la0 = new LA0(jMax, jMax2);
        }
        return this.f67033a.g(j10, la0);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void k(long j10, boolean z10) {
        this.f67033a.k(j10, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    @Override // com.google.android.gms.internal.ads.YE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n(com.google.android.gms.internal.ads.PG0[] r14, boolean[] r15, com.google.android.gms.internal.ads.SF0[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r16
            int r1 = r0.length
            com.google.android.gms.internal.ads.CE0[] r2 = new com.google.android.gms.internal.ads.CE0[r1]
            r13.f67035c = r2
            com.google.android.gms.internal.ads.SF0[] r6 = new com.google.android.gms.internal.ads.SF0[r1]
            r1 = 0
            r2 = r1
        Lb:
            int r3 = r0.length
            r10 = 0
            if (r2 >= r3) goto L20
            com.google.android.gms.internal.ads.CE0[] r3 = r13.f67035c
            r4 = r0[r2]
            com.google.android.gms.internal.ads.CE0 r4 = (com.google.android.gms.internal.ads.CE0) r4
            r3[r2] = r4
            if (r4 == 0) goto L1b
            com.google.android.gms.internal.ads.SF0 r10 = r4.f66583a
        L1b:
            r6[r2] = r10
            int r2 = r2 + 1
            goto Lb
        L20:
            com.google.android.gms.internal.ads.YE0 r3 = r13.f67033a
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            long r14 = r3.n(r4, r5, r6, r7, r8)
            boolean r2 = r13.h()
            r3 = 0
            if (r2 == 0) goto L3a
            int r2 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r2 != 0) goto L3a
            r7 = r3
            goto L3c
        L3a:
            r7 = r18
        L3c:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13.f67036d = r11
            int r2 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            r5 = 1
            if (r2 == 0) goto L5a
            int r2 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r2 < 0) goto L59
            long r2 = r13.f67037e
            r7 = -9223372036854775808
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L5a
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L59
            goto L5a
        L59:
            r5 = r1
        L5a:
            com.google.android.gms.internal.ads.C8211gC.f(r5)
        L5d:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            r2 = r6[r1]
            if (r2 != 0) goto L69
            com.google.android.gms.internal.ads.CE0[] r2 = r13.f67035c
            r2[r1] = r10
            goto L7a
        L69:
            com.google.android.gms.internal.ads.CE0[] r3 = r13.f67035c
            r4 = r3[r1]
            if (r4 == 0) goto L73
            com.google.android.gms.internal.ads.SF0 r4 = r4.f66583a
            if (r4 == r2) goto L7a
        L73:
            com.google.android.gms.internal.ads.CE0 r4 = new com.google.android.gms.internal.ads.CE0
            r4.<init>(r13, r2)
            r3[r1] = r4
        L7a:
            com.google.android.gms.internal.ads.CE0[] r2 = r13.f67035c
            r2 = r2[r1]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5d
        L83:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DE0.n(com.google.android.gms.internal.ads.PG0[], boolean[], com.google.android.gms.internal.ads.SF0[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void o(XE0 xe0, long j10) {
        this.f67034b = xe0;
        this.f67033a.o(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        long jZzb = this.f67033a.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j10 = this.f67037e;
            if (j10 == Long.MIN_VALUE || jZzb < j10) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        long jZzc = this.f67033a.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j10 = this.f67037e;
            if (j10 == Long.MIN_VALUE || jZzc < j10) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final C7900dG0 zzh() {
        return this.f67033a.zzh();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void zzk() throws IOException {
        this.f67033a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        return this.f67033a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long zzd() {
        boolean z10;
        if (h()) {
            long j10 = this.f67036d;
            this.f67036d = -9223372036854775807L;
            long jZzd = zzd();
            if (jZzd != -9223372036854775807L) {
                return jZzd;
            }
            return j10;
        }
        long jZzd2 = this.f67033a.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = false;
        if (jZzd2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.f(z10);
        long j11 = this.f67037e;
        if (j11 == Long.MIN_VALUE || jZzd2 <= j11) {
            z11 = true;
        }
        C8211gC.f(z11);
        return jZzd2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.YE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f67036d = r0
            com.google.android.gms.internal.ads.CE0[] r0 = r7.f67035c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.c()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.google.android.gms.internal.ads.YE0 r0 = r7.f67033a
            long r0 = r0.f(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L35
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L36
            long r3 = r7.f67037e
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L35
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L36
        L35:
            r2 = r9
        L36:
            com.google.android.gms.internal.ads.C8211gC.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.DE0.f(long):long");
    }
}
