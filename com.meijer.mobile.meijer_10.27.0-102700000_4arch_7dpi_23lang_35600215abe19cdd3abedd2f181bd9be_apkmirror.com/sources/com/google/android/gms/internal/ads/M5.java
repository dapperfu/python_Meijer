package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
final class M5 {
    private static void d(C7999fQ c7999fQ) {
        c7999fQ.n(3);
        c7999fQ.n(8);
        boolean zP = c7999fQ.p();
        boolean zP2 = c7999fQ.p();
        if (zP) {
            c7999fQ.n(5);
        }
        if (zP2) {
            c7999fQ.n(6);
        }
    }

    private static void e(C7999fQ c7999fQ) {
        int iD;
        int iD2 = c7999fQ.d(2);
        if (iD2 == 0) {
            c7999fQ.n(6);
            return;
        }
        int iC = c(c7999fQ, 5, 8, 16) + 1;
        if (iD2 == 1) {
            c7999fQ.n(iC * 7);
            return;
        }
        if (iD2 == 2) {
            boolean zP = c7999fQ.p();
            int i10 = true != zP ? 5 : 1;
            int i11 = true == zP ? 7 : 5;
            int i12 = true == zP ? 8 : 6;
            int i13 = 0;
            while (i13 < iC) {
                if (c7999fQ.p()) {
                    c7999fQ.n(7);
                    iD = 0;
                } else {
                    if (c7999fQ.d(2) == 3 && c7999fQ.d(i11) * i10 != 0) {
                        c7999fQ.m();
                    }
                    iD = c7999fQ.d(i12) * i10;
                    if (iD != 0 && iD != 180) {
                        c7999fQ.m();
                    }
                    c7999fQ.m();
                }
                if (iD != 0 && iD != 180 && c7999fQ.p()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    private static boolean f(C7999fQ c7999fQ) {
        c7999fQ.n(3);
        boolean zP = c7999fQ.p();
        if (zP) {
            c7999fQ.n(13);
        }
        return zP;
    }

    public static J5 a(C7999fQ c7999fQ) throws zzbc {
        int iD;
        int i10;
        char c10;
        int i11;
        int i12;
        int iD2;
        char c11;
        int iD3 = c7999fQ.d(8);
        int i13 = 5;
        int iD4 = c7999fQ.d(5);
        if (iD4 != 31) {
            switch (iD4) {
                case 0:
                    iD = 96000;
                    break;
                case 1:
                    iD = 88200;
                    break;
                case 2:
                    iD = 64000;
                    break;
                case 3:
                    iD = 48000;
                    break;
                case 4:
                    iD = 44100;
                    break;
                case 5:
                    iD = 32000;
                    break;
                case 6:
                    iD = 24000;
                    break;
                case 7:
                    iD = 22050;
                    break;
                case 8:
                    iD = 16000;
                    break;
                case 9:
                    iD = 12000;
                    break;
                case 10:
                    iD = 11025;
                    break;
                case 11:
                    iD = 8000;
                    break;
                case 12:
                    iD = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzbc.c("Unsupported sampling rate index " + iD4);
                case 15:
                    iD = 57600;
                    break;
                case 16:
                    iD = 51200;
                    break;
                case 17:
                    iD = 40000;
                    break;
                case 18:
                    iD = 38400;
                    break;
                case 19:
                    iD = 34150;
                    break;
                case 20:
                    iD = 28800;
                    break;
                case 21:
                    iD = 25600;
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    iD = 20000;
                    break;
                case 23:
                    iD = 19200;
                    break;
                case 24:
                    iD = 17075;
                    break;
                case 25:
                    iD = 14400;
                    break;
                case 26:
                    iD = 12800;
                    break;
                case 27:
                    iD = 9600;
                    break;
            }
        } else {
            iD = c7999fQ.d(24);
        }
        int iD5 = c7999fQ.d(3);
        int i14 = 1;
        if (iD5 == 0) {
            i10 = 768;
        } else if (iD5 == 1) {
            i10 = 1024;
        } else if (iD5 == 2 || iD5 == 3) {
            i10 = RecyclerView.m.FLAG_MOVED;
        } else {
            if (iD5 != 4) {
                throw zzbc.c("Unsupported coreSbrFrameLengthIndex " + iD5);
            }
            i10 = RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        if (iD5 == 0 || iD5 == 1) {
            c10 = 0;
        } else if (iD5 == 2) {
            c10 = 2;
        } else if (iD5 == 3) {
            c10 = 3;
        } else {
            if (iD5 != 4) {
                throw zzbc.c("Unsupported coreSbrFrameLengthIndex " + iD5);
            }
            c10 = 1;
        }
        c7999fQ.n(2);
        e(c7999fQ);
        int iD6 = c7999fQ.d(5);
        int i15 = 0;
        int iC = 0;
        while (true) {
            int i16 = 16;
            if (i15 < iD6 + 1) {
                int iD7 = c7999fQ.d(3);
                iC += c(c7999fQ, 5, 8, 16) + 1;
                if ((iD7 == 0 || iD7 == 2) && c7999fQ.p()) {
                    e(c7999fQ);
                }
                i15++;
            } else {
                int iC2 = c(c7999fQ, 4, 8, 16) + 1;
                c7999fQ.m();
                int i17 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i17 >= iC2) {
                        int i18 = iD3;
                        byte[] bArr = null;
                        if (c7999fQ.p()) {
                            int iC3 = c(c7999fQ, 2, 4, 8) + 1;
                            for (int i19 = 0; i19 < iC3; i19++) {
                                int iC4 = c(c7999fQ, 4, 8, 16);
                                int iC5 = c(c7999fQ, 4, 8, 16);
                                if (iC4 == 7) {
                                    int iD8 = c7999fQ.d(4) + 1;
                                    c7999fQ.n(4);
                                    byte[] bArr2 = new byte[iD8];
                                    for (int i20 = 0; i20 < iD8; i20++) {
                                        bArr2[i20] = (byte) c7999fQ.d(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    c7999fQ.n(iC5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iD) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                throw zzbc.c("Unsupported sampling rate " + iD);
                        }
                        return new J5(i18, (int) (iD * d10), (int) (i10 * d10), bArr3, null);
                    }
                    int iD9 = c7999fQ.d(2);
                    if (iD9 == 0) {
                        i11 = iD3;
                        i12 = i14;
                        f(c7999fQ);
                        if (c10 > 0) {
                            d(c7999fQ);
                        }
                    } else if (iD9 == i14) {
                        i12 = i14;
                        if (f(c7999fQ)) {
                            c7999fQ.m();
                        }
                        if (c10 > 0) {
                            d(c7999fQ);
                            iD2 = c7999fQ.d(2);
                            c11 = c10;
                        } else {
                            iD2 = 0;
                            c11 = 0;
                        }
                        if (iD2 > 0) {
                            c7999fQ.n(6);
                            int iD10 = c7999fQ.d(2);
                            c7999fQ.n(4);
                            if (c7999fQ.p()) {
                                c7999fQ.n(i13);
                            }
                            if (iD2 == 2 || iD2 == 3) {
                                c7999fQ.n(6);
                            }
                            if (iD10 == 2) {
                                c7999fQ.m();
                            }
                        }
                        i11 = iD3;
                        int iFloor = ((int) Math.floor(Math.log(iC - 1) / Math.log(2.0d))) + 1;
                        int iD11 = c7999fQ.d(2);
                        if (iD11 > 0 && c7999fQ.p()) {
                            c7999fQ.n(iFloor);
                        }
                        if (c7999fQ.p()) {
                            c7999fQ.n(iFloor);
                        }
                        if (c11 == 0 && iD11 == 0) {
                            c7999fQ.m();
                        }
                    } else if (iD9 != 3) {
                        i11 = iD3;
                        i12 = i14;
                    } else {
                        c(c7999fQ, 4, 8, i16);
                        int iC6 = c(c7999fQ, 4, 8, i16);
                        i12 = i14;
                        if (c7999fQ.p()) {
                            c(c7999fQ, 8, i16, 0);
                        }
                        c7999fQ.m();
                        if (iC6 > 0) {
                            c7999fQ.n(iC6 * 8);
                        }
                        i11 = iD3;
                    }
                    i17++;
                    iD3 = i11;
                    i14 = i12;
                    i13 = 5;
                    i16 = 16;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(com.google.android.gms.internal.ads.C7999fQ r18, com.google.android.gms.internal.ads.I5 r19) throws com.google.android.gms.internal.ads.zzbc {
        /*
            r0 = r18
            r1 = r19
            r0.b()
            r2 = 3
            r3 = 8
            int r2 = c(r0, r2, r3, r3)
            r1.f67546a = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc7
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.C8086gC.d(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.Di0.a(r10, r12)
            r16 = r10
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.Di0.a(r14, r10)
            int r6 = r0.a()
            r10 = -1
            if (r6 >= r2) goto L46
        L44:
            r14 = r10
            goto L6f
        L46:
            long r14 = r0.e(r2)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 != 0) goto L6f
            int r6 = r0.a()
            if (r6 >= r3) goto L55
            goto L44
        L55:
            long r14 = r0.e(r3)
            long r16 = r14 + r16
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 != 0) goto L6d
            int r3 = r0.a()
            if (r3 >= r7) goto L66
            goto L44
        L66:
            long r6 = r0.e(r7)
            long r14 = r16 + r6
            goto L6f
        L6d:
            r14 = r16
        L6f:
            r1.f67547b = r14
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 != 0) goto L76
            return r4
        L76:
            r6 = 16
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 > 0) goto Lb1
            r6 = 0
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto La3
            int r3 = r1.f67546a
            r6 = 0
            if (r3 == r9) goto L9c
            if (r3 == r2) goto L95
            r2 = 17
            if (r3 == r2) goto L8e
            goto La3
        L8e:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.a(r0, r6)
            throw r0
        L95:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.a(r0, r6)
            throw r0
        L9c:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.a(r0, r6)
            throw r0
        La3:
            r2 = 11
            r3 = 24
            int r0 = c(r0, r2, r3, r3)
            r1.f67548c = r0
            if (r0 == r5) goto Lb0
            return r9
        Lb0:
            return r4
        Lb1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.c(r0)
            throw r0
        Lc7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M5.b(com.google.android.gms.internal.ads.fQ, com.google.android.gms.internal.ads.I5):boolean");
    }

    private static int c(C7999fQ c7999fQ, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        Bi0.a(Bi0.a(i13, i14), 1 << i12);
        if (c7999fQ.a() < i10) {
            return -1;
        }
        int iD = c7999fQ.d(i10);
        if (iD == i13) {
            if (c7999fQ.a() < i11) {
                return -1;
            }
            int iD2 = c7999fQ.d(i11);
            int i15 = iD + iD2;
            if (iD2 == i14) {
                if (c7999fQ.a() < i12) {
                    return -1;
                }
                return i15 + c7999fQ.d(i12);
            }
            return i15;
        }
        return iD;
    }
}
