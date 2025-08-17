package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7856e4 extends AbstractC7643c4 {

    /* renamed from: n, reason: collision with root package name */
    private C7750d4 f73756n;

    /* renamed from: o, reason: collision with root package name */
    private int f73757o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f73758p;

    /* renamed from: q, reason: collision with root package name */
    private C7637c1 f73759q;

    /* renamed from: r, reason: collision with root package name */
    private C7424a1 f73760r;

    @Override // com.google.android.gms.internal.ads.AbstractC7643c4
    protected final boolean c(GQ gq2, long j10, Z3 z32) throws IOException {
        C7750d4 c7750d4;
        int i10;
        int iB;
        int i11;
        int[] iArr;
        int i12;
        long jFloor;
        if (this.f73756n != null) {
            z32.f71980a.getClass();
            return false;
        }
        C7637c1 c7637c1 = this.f73759q;
        int i13 = 1;
        if (c7637c1 == null) {
            C7744d1.d(1, gq2, false);
            int iZ = gq2.z();
            int iC = gq2.C();
            int iZ2 = gq2.z();
            int iY = gq2.y();
            int i14 = iY <= 0 ? -1 : iY;
            int iY2 = gq2.y();
            int i15 = iY2 <= 0 ? -1 : iY2;
            int iY3 = gq2.y();
            int i16 = iY3 <= 0 ? -1 : iY3;
            int iC2 = gq2.C();
            this.f73759q = new C7637c1(iZ, iC, iZ2, i14, i15, i16, (int) Math.pow(2.0d, iC2 & 15), (int) Math.pow(2.0d, (iC2 & 240) >> 4), 1 == (gq2.C() & 1), Arrays.copyOf(gq2.n(), gq2.u()));
        } else {
            int i17 = 4;
            C7424a1 c7424a1 = this.f73760r;
            if (c7424a1 == null) {
                this.f73760r = C7744d1.c(gq2, true, true);
            } else {
                byte[] bArr = new byte[gq2.u()];
                System.arraycopy(gq2.n(), 0, bArr, 0, gq2.u());
                int i18 = c7637c1.f73057a;
                int i19 = 5;
                C7744d1.d(5, gq2, false);
                int iC3 = gq2.C() + 1;
                Z0 z02 = new Z0(gq2.n());
                z02.c(gq2.t() * 8);
                int i20 = 0;
                while (true) {
                    int i21 = 2;
                    int i22 = 16;
                    if (i20 >= iC3) {
                        int i23 = i13;
                        int i24 = 6;
                        int iB2 = z02.b(6) + i23;
                        for (int i25 = 0; i25 < iB2; i25++) {
                            if (z02.b(16) != 0) {
                                throw zzbc.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iB3 = z02.b(6) + i23;
                        int i26 = 0;
                        while (true) {
                            int i27 = 3;
                            if (i26 < iB3) {
                                int iB4 = z02.b(i22);
                                if (iB4 == 0) {
                                    int i28 = 8;
                                    z02.c(8);
                                    z02.c(16);
                                    z02.c(16);
                                    z02.c(6);
                                    z02.c(8);
                                    int iB5 = z02.b(4) + 1;
                                    int i29 = 0;
                                    while (i29 < iB5) {
                                        z02.c(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (iB4 != i23) {
                                        throw zzbc.a("floor type greater than 1 not decodable: " + iB4, null);
                                    }
                                    int iB6 = z02.b(5);
                                    int[] iArr2 = new int[iB6];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < iB6; i31++) {
                                        int iB7 = z02.b(4);
                                        iArr2[i31] = iB7;
                                        if (iB7 > i30) {
                                            i30 = iB7;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr3 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        int i34 = 1;
                                        iArr3[i33] = z02.b(i27) + 1;
                                        int iB8 = z02.b(2);
                                        if (iB8 > 0) {
                                            i11 = 8;
                                            z02.c(8);
                                        } else {
                                            i11 = 8;
                                        }
                                        int i35 = i32;
                                        int i36 = 0;
                                        while (true) {
                                            int i37 = i34 << iB8;
                                            iArr = iArr2;
                                            if (i36 < i37) {
                                                z02.c(i11);
                                                i36++;
                                                iArr2 = iArr;
                                                i11 = 8;
                                                i34 = 1;
                                            }
                                        }
                                        i33++;
                                        iArr2 = iArr;
                                        i32 = i35;
                                        i27 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    z02.c(2);
                                    int iB9 = z02.b(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < iB6; i40++) {
                                        i38 += iArr3[iArr4[i40]];
                                        while (i39 < i38) {
                                            z02.c(iB9);
                                            i39++;
                                        }
                                    }
                                }
                                i26++;
                                i24 = 6;
                                i22 = 16;
                                i23 = 1;
                            } else {
                                int i41 = 1;
                                int iB10 = z02.b(i24) + 1;
                                int i42 = 0;
                                while (i42 < iB10) {
                                    if (z02.b(16) > 2) {
                                        throw zzbc.a("residueType greater than 2 is not decodable", null);
                                    }
                                    z02.c(24);
                                    z02.c(24);
                                    z02.c(24);
                                    int iB11 = z02.b(i24) + i41;
                                    int i43 = 8;
                                    z02.c(8);
                                    int[] iArr5 = new int[iB11];
                                    for (int i44 = 0; i44 < iB11; i44++) {
                                        iArr5[i44] = ((z02.d() ? z02.b(5) : 0) * 8) + z02.b(3);
                                    }
                                    int i45 = 0;
                                    while (i45 < iB11) {
                                        int i46 = 0;
                                        while (i46 < i43) {
                                            if ((iArr5[i45] & (1 << i46)) != 0) {
                                                z02.c(i43);
                                            }
                                            i46++;
                                            i43 = 8;
                                        }
                                        i45++;
                                        i43 = 8;
                                    }
                                    i42++;
                                    i24 = 6;
                                    i41 = 1;
                                }
                                int iB12 = z02.b(i24) + 1;
                                for (int i47 = 0; i47 < iB12; i47++) {
                                    int iB13 = z02.b(16);
                                    if (iB13 != 0) {
                                        C9917xL.c("VorbisUtil", "mapping type other than 0 not supported: " + iB13);
                                    } else {
                                        if (z02.d()) {
                                            i10 = 1;
                                            iB = z02.b(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iB = 1;
                                        }
                                        if (z02.d()) {
                                            int iB14 = z02.b(8) + i10;
                                            for (int i48 = 0; i48 < iB14; i48++) {
                                                int i49 = i18 - 1;
                                                z02.c(C7744d1.a(i49));
                                                z02.c(C7744d1.a(i49));
                                            }
                                        }
                                        if (z02.b(2) != 0) {
                                            throw zzbc.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iB > 1) {
                                            for (int i50 = 0; i50 < i18; i50++) {
                                                z02.c(4);
                                            }
                                        }
                                        for (int i51 = 0; i51 < iB; i51++) {
                                            z02.c(8);
                                            z02.c(8);
                                            z02.c(8);
                                        }
                                    }
                                }
                                int iB15 = z02.b(6);
                                int i52 = iB15 + 1;
                                C7531b1[] c7531b1Arr = new C7531b1[i52];
                                for (int i53 = 0; i53 < i52; i53++) {
                                    c7531b1Arr[i53] = new C7531b1(z02.d(), z02.b(16), z02.b(16), z02.b(8));
                                }
                                if (!z02.d()) {
                                    throw zzbc.a("framing bit after modes not set as expected", null);
                                }
                                c7750d4 = new C7750d4(c7637c1, c7424a1, bArr, c7531b1Arr, C7744d1.a(iB15));
                            }
                        }
                    } else {
                        if (z02.b(24) != 5653314) {
                            throw zzbc.a("expected code book to start with [0x56, 0x43, 0x42] at " + z02.a(), null);
                        }
                        int iB16 = z02.b(16);
                        int iB17 = z02.b(24);
                        if (z02.d()) {
                            z02.c(i19);
                            for (int iB18 = 0; iB18 < iB17; iB18 += z02.b(C7744d1.a(iB17 - iB18))) {
                            }
                        } else {
                            boolean zD = z02.d();
                            for (int i54 = 0; i54 < iB17; i54++) {
                                if (!zD) {
                                    z02.c(i19);
                                } else if (z02.d()) {
                                    z02.c(i19);
                                }
                            }
                        }
                        int i55 = i17;
                        int iB19 = z02.b(i55);
                        if (iB19 > 2) {
                            throw zzbc.a("lookup type greater than 2 not decodable: " + iB19, null);
                        }
                        if (iB19 != i13) {
                            if (iB19 != 2) {
                                i12 = i13;
                            }
                            i20++;
                            i13 = i12;
                            i17 = 4;
                            i19 = 5;
                        } else {
                            i21 = iB19;
                        }
                        z02.c(32);
                        z02.c(32);
                        int iB20 = z02.b(i55) + i13;
                        z02.c(i13);
                        if (i21 != i13) {
                            i12 = i13;
                            jFloor = iB16 * iB17;
                        } else if (iB16 != 0) {
                            i12 = i13;
                            jFloor = (long) Math.floor(Math.pow(iB17, 1.0d / iB16));
                        } else {
                            i12 = i13;
                            jFloor = 0;
                        }
                        z02.c((int) (jFloor * iB20));
                        i20++;
                        i13 = i12;
                        i17 = 4;
                        i19 = 5;
                    }
                }
            }
        }
        c7750d4 = null;
        this.f73756n = c7750d4;
        if (c7750d4 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        C7637c1 c7637c12 = c7750d4.f73344a;
        arrayList.add(c7637c12.f73063g);
        arrayList.add(c7750d4.f73346c);
        C8651lb c8651lbB = C7744d1.b(AbstractC7917eh0.s(c7750d4.f73345b.f72331a));
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.B("audio/vorbis");
        c9592uH0.q0(c7637c12.f73060d);
        c9592uH0.v(c7637c12.f73059c);
        c9592uH0.r0(c7637c12.f73057a);
        c9592uH0.C(c7637c12.f73058b);
        c9592uH0.n(arrayList);
        c9592uH0.t(c8651lbB);
        z32.f71980a = c9592uH0.H();
        return true;
    }

    C7856e4() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7643c4
    protected final long a(GQ gq2) {
        int i10;
        int i11 = 0;
        if ((gq2.n()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = gq2.n()[0];
        C7750d4 c7750d4 = this.f73756n;
        C8086gC.b(c7750d4);
        if (!c7750d4.f73347d[(b10 >> 1) & (com.medallia.digital.mobilesdk.l3.f92484c >>> (8 - c7750d4.f73348e))].f72698a) {
            i10 = c7750d4.f73344a.f73061e;
        } else {
            i10 = c7750d4.f73344a.f73062f;
        }
        if (this.f73758p) {
            i11 = (this.f73757o + i10) / 4;
        }
        if (gq2.s() < gq2.u() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(gq2.n(), gq2.u() + 4);
            gq2.j(bArrCopyOf, bArrCopyOf.length);
        } else {
            gq2.k(gq2.u() + 4);
        }
        long j10 = i11;
        byte[] bArrN = gq2.n();
        bArrN[gq2.u() - 4] = (byte) (j10 & 255);
        bArrN[gq2.u() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrN[gq2.u() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrN[gq2.u() - 1] = (byte) ((j10 >>> 24) & 255);
        this.f73758p = true;
        this.f73757o = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7643c4
    protected final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f73756n = null;
            this.f73759q = null;
            this.f73760r = null;
        }
        this.f73757o = 0;
        this.f73758p = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7643c4
    protected final void h(long j10) {
        boolean z10;
        super.h(j10);
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f73758p = z10;
        C7637c1 c7637c1 = this.f73759q;
        if (c7637c1 != null) {
            i10 = c7637c1.f73061e;
        }
        this.f73757o = i10;
    }
}
