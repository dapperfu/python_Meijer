package com.google.android.gms.internal.ads;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f69222a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f69223b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f69224c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f69225d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f69226e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f69227f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpResponseStatus.ERROR_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f69228g = 0;

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return f((b10 & 192) >> 6, b10 & 63);
        }
        int i10 = bArr[2] & 7;
        int i11 = ((bArr[3] & 255) | (i10 << 8)) + 1;
        return i11 + i11;
    }

    private static int f(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = f69223b[i10];
        if (i13 == 44100) {
            int i14 = f69227f[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = f69226e[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }

    public static C c(GQ gq2, String str, String str2, TE0 te0) {
        C7999fQ c7999fQ = new C7999fQ();
        c7999fQ.j(gq2);
        int i10 = f69223b[c7999fQ.d(2)];
        c7999fQ.n(8);
        int i11 = f69225d[c7999fQ.d(3)];
        if (c7999fQ.d(1) != 0) {
            i11++;
        }
        int i12 = f69226e[c7999fQ.d(5)] * 1000;
        c7999fQ.f();
        gq2.l(c7999fQ.b());
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.m(str);
        c9592uH0.B("audio/ac3");
        c9592uH0.r0(i11);
        c9592uH0.C(i10);
        c9592uH0.f(te0);
        c9592uH0.q(str2);
        c9592uH0.q0(i12);
        c9592uH0.v(i12);
        return c9592uH0.H();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.C d(com.google.android.gms.internal.ads.GQ r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.TE0 r10) {
        /*
            com.google.android.gms.internal.ads.fQ r0 = new com.google.android.gms.internal.ads.fQ
            r0.<init>()
            r0.j(r7)
            r1 = 13
            int r1 = r0.d(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.n(r2)
            r3 = 2
            int r3 = r0.d(r3)
            int[] r4 = com.google.android.gms.internal.ads.P.f69223b
            r3 = r4[r3]
            r4 = 10
            r0.n(r4)
            int[] r4 = com.google.android.gms.internal.ads.P.f69225d
            int r5 = r0.d(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.d(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.n(r2)
            r2 = 4
            int r2 = r0.d(r2)
            r0.n(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.n(r2)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.n(r5)
        L4f:
            int r2 = r0.a()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.n(r6)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.f()
            int r0 = r0.b()
            r7.l(r0)
            com.google.android.gms.internal.ads.uH0 r7 = new com.google.android.gms.internal.ads.uH0
            r7.<init>()
            r7.m(r8)
            r7.B(r2)
            r7.r0(r4)
            r7.C(r3)
            r7.f(r10)
            r7.q(r9)
            r7.v(r1)
            com.google.android.gms.internal.ads.C r7 = r7.H()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P.d(com.google.android.gms.internal.ads.GQ, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.TE0):com.google.android.gms.internal.ads.C");
    }

    public static N e(C7999fQ c7999fQ) {
        int iF;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iC = c7999fQ.c();
        c7999fQ.n(40);
        int iD = c7999fQ.d(5);
        c7999fQ.l(iC);
        int i18 = -1;
        if (iD > 10) {
            c7999fQ.n(16);
            int iD2 = c7999fQ.d(2);
            if (iD2 == 0) {
                i18 = 0;
            } else if (iD2 == 1) {
                i18 = 1;
            } else if (iD2 == 2) {
                i18 = 2;
            }
            c7999fQ.n(3);
            int iD3 = c7999fQ.d(11) + 1;
            int iD4 = c7999fQ.d(2);
            if (iD4 == 3) {
                i10 = f69224c[c7999fQ.d(2)];
                i15 = 6;
                i14 = 3;
            } else {
                int iD5 = c7999fQ.d(2);
                int i19 = f69222a[iD5];
                i14 = iD5;
                i10 = f69223b[iD4];
                i15 = i19;
            }
            iF = iD3 + iD3;
            int i20 = (iF * i10) / (i15 * 32);
            int iD6 = c7999fQ.d(3);
            boolean zP = c7999fQ.p();
            i11 = f69225d[iD6] + (zP ? 1 : 0);
            c7999fQ.n(10);
            if (c7999fQ.p()) {
                c7999fQ.n(8);
            }
            if (iD6 == 0) {
                c7999fQ.n(5);
                if (c7999fQ.p()) {
                    c7999fQ.n(8);
                }
                i16 = 0;
                iD6 = 0;
            } else {
                i16 = iD6;
            }
            if (i18 == 1) {
                if (c7999fQ.p()) {
                    c7999fQ.n(16);
                }
                i17 = 1;
            } else {
                i17 = i18;
            }
            if (c7999fQ.p()) {
                if (i16 > 2) {
                    c7999fQ.n(2);
                }
                if ((i16 & 1) != 0 && i16 > 2) {
                    c7999fQ.n(6);
                }
                if ((i16 & 4) != 0) {
                    c7999fQ.n(6);
                }
                if (zP && c7999fQ.p()) {
                    c7999fQ.n(5);
                }
                if (i17 == 0) {
                    if (c7999fQ.p()) {
                        c7999fQ.n(6);
                    }
                    if (i16 == 0 && c7999fQ.p()) {
                        c7999fQ.n(6);
                    }
                    if (c7999fQ.p()) {
                        c7999fQ.n(6);
                    }
                    int iD7 = c7999fQ.d(2);
                    if (iD7 == 1) {
                        c7999fQ.n(5);
                    } else if (iD7 == 2) {
                        c7999fQ.n(12);
                    } else if (iD7 == 3) {
                        int iD8 = c7999fQ.d(5);
                        if (c7999fQ.p()) {
                            c7999fQ.n(5);
                            if (c7999fQ.p()) {
                                c7999fQ.n(4);
                            }
                            if (c7999fQ.p()) {
                                c7999fQ.n(4);
                            }
                            if (c7999fQ.p()) {
                                c7999fQ.n(4);
                            }
                            if (c7999fQ.p()) {
                                c7999fQ.n(4);
                            }
                            if (c7999fQ.p()) {
                                c7999fQ.n(4);
                            }
                            if (c7999fQ.p()) {
                                c7999fQ.n(4);
                            }
                            if (c7999fQ.p()) {
                                c7999fQ.n(4);
                            }
                            if (c7999fQ.p()) {
                                if (c7999fQ.p()) {
                                    c7999fQ.n(4);
                                }
                                if (c7999fQ.p()) {
                                    c7999fQ.n(4);
                                }
                            }
                        }
                        if (c7999fQ.p()) {
                            c7999fQ.n(5);
                            if (c7999fQ.p()) {
                                c7999fQ.n(7);
                                if (c7999fQ.p()) {
                                    c7999fQ.n(8);
                                }
                            }
                        }
                        c7999fQ.n((iD8 + 2) * 8);
                        c7999fQ.f();
                    }
                    if (i16 < 2) {
                        if (c7999fQ.p()) {
                            c7999fQ.n(14);
                        }
                        if (iD6 == 0 && c7999fQ.p()) {
                            c7999fQ.n(14);
                        }
                    }
                    if (!c7999fQ.p()) {
                        i17 = 0;
                    } else if (i14 == 0) {
                        c7999fQ.n(5);
                        i17 = 0;
                        i14 = 0;
                    } else {
                        for (int i21 = 0; i21 < i15; i21++) {
                            if (c7999fQ.p()) {
                                c7999fQ.n(5);
                            }
                        }
                        i17 = 0;
                    }
                }
            }
            if (c7999fQ.p()) {
                c7999fQ.n(5);
                if (i16 == 2) {
                    c7999fQ.n(4);
                    i16 = 2;
                }
                if (i16 >= 6) {
                    c7999fQ.n(2);
                }
                if (c7999fQ.p()) {
                    c7999fQ.n(8);
                }
                if (i16 == 0 && c7999fQ.p()) {
                    c7999fQ.n(8);
                }
                if (iD4 < 3) {
                    c7999fQ.m();
                }
            }
            if (i17 == 0 && i14 != 3) {
                c7999fQ.m();
            }
            if (i17 == 2 && (i14 == 3 || c7999fQ.p())) {
                c7999fQ.n(6);
            }
            i12 = i15 * 256;
            str = (c7999fQ.p() && c7999fQ.d(6) == 1 && c7999fQ.d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i20;
        } else {
            c7999fQ.n(32);
            int iD9 = c7999fQ.d(2);
            String str2 = iD9 == 3 ? null : "audio/ac3";
            int iD10 = c7999fQ.d(6);
            int i22 = f69226e[iD10 / 2] * 1000;
            iF = f(iD9, iD10);
            c7999fQ.n(8);
            int iD11 = c7999fQ.d(3);
            if ((iD11 & 1) != 0 && iD11 != 1) {
                c7999fQ.n(2);
            }
            if ((iD11 & 4) != 0) {
                c7999fQ.n(2);
            }
            if (iD11 == 2) {
                c7999fQ.n(2);
            }
            i10 = iD9 < 3 ? f69223b[iD9] : -1;
            i11 = f69225d[iD11] + (c7999fQ.p() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new N(str, i18, i11, i10, iF, i12, i13, null);
    }

    public static int a(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return f69222a[i10] * 256;
        }
        return 1536;
    }
}
