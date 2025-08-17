package x3;

import d3.C13466a;

/* renamed from: x3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18001f {
    private static int c(d3.D d10) {
        int i10 = 0;
        while (d10.a() != 0) {
            int iH = d10.H();
            i10 += iH;
            if (iH != 255) {
                return i10;
            }
        }
        return -1;
    }

    public static void a(long j10, d3.D d10, O[] oArr) {
        int iQ;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (d10.a() > 1) {
                int iC = c(d10);
                int iC2 = c(d10);
                int iF = d10.f() + iC2;
                if (iC2 != -1 && iC2 <= d10.a()) {
                    if (iC == 4 && iC2 >= 8) {
                        int iH = d10.H();
                        int iP = d10.P();
                        if (iP == 49) {
                            iQ = d10.q();
                        } else {
                            iQ = 0;
                        }
                        int iH2 = d10.H();
                        if (iP == 47) {
                            d10.X(1);
                        }
                        if (iH == 181 && ((iP == 49 || iP == 47) && iH2 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (iP == 49) {
                            if (iQ != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            b(j10, d10, oArr);
                        }
                    }
                } else {
                    d3.r.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    iF = d10.g();
                }
                d10.W(iF);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, d3.D d10, O[] oArr) {
        boolean z10;
        int iH = d10.H();
        if ((iH & 64) != 0) {
            d10.X(1);
            int i10 = (iH & 31) * 3;
            int iF = d10.f();
            for (O o10 : oArr) {
                d10.W(iF);
                o10.d(d10, i10);
                if (j10 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C13466a.g(z10);
                o10.c(j10, 1, i10, 0, null);
            }
        }
    }
}
