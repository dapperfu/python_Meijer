package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class J3 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f68596a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static U0 a(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        return c(interfaceC9361r0, true, false);
    }

    public static U0 b(InterfaceC9361r0 interfaceC9361r0, boolean z10) throws IOException {
        return c(interfaceC9361r0, false, z10);
    }

    private static U0 c(InterfaceC9361r0 interfaceC9361r0, boolean z10, boolean z11) throws IOException {
        U0 u02;
        long j10;
        GQ gq2;
        int i10;
        int i11;
        int[] iArr;
        long jZzd = interfaceC9361r0.zzd();
        long j11 = -1;
        long j12 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j12 = jZzd;
        }
        GQ gq3 = new GQ(64);
        int i12 = (int) j12;
        int i13 = 0;
        int i14 = 0;
        boolean z12 = false;
        while (i14 < i12) {
            gq3.i(8);
            boolean z13 = true;
            if (!interfaceC9361r0.c(gq3.n(), i13, 8, true)) {
                break;
            }
            long jK = gq3.K();
            int iW = gq3.w();
            if (jK == 1) {
                j10 = j11;
                interfaceC9361r0.g(gq3.n(), 8, 8);
                i10 = 16;
                gq3.k(16);
                jK = gq3.J();
                gq2 = gq3;
            } else {
                j10 = j11;
                if (jK == 0) {
                    long jZzd2 = interfaceC9361r0.zzd();
                    if (jZzd2 != j10) {
                        jK = (jZzd2 - interfaceC9361r0.zze()) + 8;
                    }
                }
                gq2 = gq3;
                i10 = 8;
            }
            long j13 = jK;
            u02 = null;
            long j14 = i10;
            if (j13 < j14) {
                return new C8086f3(iW, j13, i10);
            }
            i14 += i10;
            if (iW == 1836019574) {
                i12 += (int) j13;
                if (jZzd != -1 && i12 > jZzd) {
                    i12 = (int) jZzd;
                }
                gq3 = gq2;
                j11 = j10;
                i13 = 0;
            } else {
                if (iW == 1836019558 || iW == 1836475768) {
                    i13 = 1;
                    break;
                }
                z12 |= !(iW != 1835295092);
                long j15 = jZzd;
                if ((i14 + j13) - j14 >= i12) {
                    i13 = 0;
                    break;
                }
                int i15 = (int) (j13 - j14);
                i14 += i15;
                if (iW != 1718909296) {
                    i11 = 0;
                    if (i15 != 0) {
                        interfaceC9361r0.zzg(i15);
                    }
                } else {
                    if (i15 < 8) {
                        return new C8086f3(1718909296, i15, 8);
                    }
                    gq2.i(i15);
                    i11 = 0;
                    interfaceC9361r0.g(gq2.n(), 0, i15);
                    int iW2 = gq2.w();
                    boolean zD = d(iW2, z11) | z12;
                    gq2.m(4);
                    int iR = gq2.r() / 4;
                    if (!zD && iR > 0) {
                        iArr = new int[iR];
                        int i16 = 0;
                        while (true) {
                            if (i16 >= iR) {
                                z13 = zD;
                                break;
                            }
                            int iW3 = gq2.w();
                            iArr[i16] = iW3;
                            if (d(iW3, z11)) {
                                break;
                            }
                            i16++;
                        }
                    } else {
                        z13 = zD;
                        iArr = null;
                    }
                    if (!z13) {
                        return new O3(iW2, iArr);
                    }
                    z12 = z13;
                }
                i13 = i11;
                gq3 = gq2;
                j11 = j10;
                jZzd = j15;
            }
        }
        u02 = null;
        return !z12 ? E3.f67174a : z10 != i13 ? i13 != 0 ? C10223z3.f81184a : C10223z3.f81185b : u02;
    }

    private static boolean d(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579) {
            if (z10) {
                return true;
            }
            i10 = 1751476579;
        }
        int[] iArr = f68596a;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }
}
