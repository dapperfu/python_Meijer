package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7760c0 {
    private static int c(GQ gq2) {
        int i10 = 0;
        while (gq2.r() != 0) {
            int iC = gq2.C();
            i10 += iC;
            if (iC != 255) {
                return i10;
            }
        }
        return -1;
    }

    public static void b(long j10, GQ gq2, X0[] x0Arr) {
        int iC = gq2.C();
        if ((iC & 64) != 0) {
            int i10 = iC & 31;
            gq2.m(1);
            int iT = gq2.t();
            for (X0 x02 : x0Arr) {
                int i11 = i10 * 3;
                gq2.l(iT);
                x02.c(gq2, i11);
                C8211gC.f(j10 != -9223372036854775807L);
                x02.a(j10, 1, i11, 0, null);
            }
        }
    }

    public static void a(long j10, GQ gq2, X0[] x0Arr) {
        int iW;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (gq2.r() > 1) {
                int iC = c(gq2);
                int iC2 = c(gq2);
                int iT = gq2.t() + iC2;
                if (iC2 != -1 && iC2 <= gq2.r()) {
                    if (iC == 4 && iC2 >= 8) {
                        int iC3 = gq2.C();
                        int iG = gq2.G();
                        if (iG == 49) {
                            iW = gq2.w();
                            iG = 49;
                        } else {
                            iW = 0;
                        }
                        int iC4 = gq2.C();
                        if (iG == 47) {
                            gq2.m(1);
                            iG = 47;
                        }
                        if (iC3 != 181 || ((iG != 49 && iG != 47) || iC4 != 3)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (iG == 49) {
                            if (iW != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            b(j10, gq2, x0Arr);
                        }
                    }
                } else {
                    C10042xL.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    iT = gq2.u();
                }
                gq2.l(iT);
            } else {
                return;
            }
        }
    }
}
