package x3;

import a3.t;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.nio.ByteBuffer;

/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18063b {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f170219a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f170220b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f170221c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f170222d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f170223e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f170224f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpResponseStatus.ERROR_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: x3.b$b, reason: collision with other inner class name */
    public static final class C2731b {

        /* renamed from: a, reason: collision with root package name */
        public final String f170225a;

        /* renamed from: b, reason: collision with root package name */
        public final int f170226b;

        /* renamed from: c, reason: collision with root package name */
        public final int f170227c;

        /* renamed from: d, reason: collision with root package name */
        public final int f170228d;

        /* renamed from: e, reason: collision with root package name */
        public final int f170229e;

        /* renamed from: f, reason: collision with root package name */
        public final int f170230f;

        /* renamed from: g, reason: collision with root package name */
        public final int f170231g;

        private C2731b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f170225a = str;
            this.f170226b = i10;
            this.f170228d = i11;
            this.f170227c = i12;
            this.f170229e = i13;
            this.f170230f = i14;
            this.f170231g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f170220b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f170224f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f170223e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static a3.t d(d3.D d10, String str, String str2, a3.o oVar) {
        d3.C c10 = new d3.C();
        c10.m(d10);
        int i10 = f170220b[c10.h(2)];
        c10.r(8);
        int i11 = f170222d[c10.h(3)];
        if (c10.h(1) != 0) {
            i11++;
        }
        int i12 = f170223e[c10.h(5)] * 1000;
        c10.c();
        d10.W(c10.d());
        return new t.b().f0(str).u0("audio/ac3").R(i11).v0(i10).Y(oVar).j0(str2).Q(i12).p0(i12).N();
    }

    public static C2731b f(d3.C c10) {
        int iC;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iE = c10.e();
        c10.r(40);
        boolean z10 = c10.h(5) > 10;
        c10.p(iE);
        int i19 = -1;
        if (z10) {
            c10.r(16);
            int iH = c10.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            c10.r(3);
            iC = (c10.h(11) + 1) * 2;
            int iH2 = c10.h(2);
            if (iH2 == 3) {
                i10 = f170221c[c10.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = c10.h(2);
                int i20 = f170219a[iH3];
                i14 = iH3;
                i10 = f170220b[iH2];
                i15 = i20;
            }
            i12 = i15 * 256;
            int iA = a(iC, i10, i15);
            int iH4 = c10.h(3);
            boolean zG = c10.g();
            i11 = f170222d[iH4] + (zG ? 1 : 0);
            c10.r(10);
            if (c10.g()) {
                c10.r(8);
            }
            if (iH4 == 0) {
                c10.r(5);
                if (c10.g()) {
                    c10.r(8);
                }
            }
            if (i19 == 1 && c10.g()) {
                c10.r(16);
            }
            if (c10.g()) {
                if (iH4 > 2) {
                    c10.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    c10.r(6);
                }
                if ((iH4 & 4) != 0) {
                    c10.r(i17);
                }
                if (zG && c10.g()) {
                    c10.r(5);
                }
                if (i19 == 0) {
                    if (c10.g()) {
                        i18 = 6;
                        c10.r(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && c10.g()) {
                        c10.r(i18);
                    }
                    if (c10.g()) {
                        c10.r(i18);
                    }
                    int iH5 = c10.h(2);
                    if (iH5 == 1) {
                        c10.r(5);
                    } else if (iH5 == 2) {
                        c10.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = c10.h(5);
                        if (c10.g()) {
                            c10.r(5);
                            if (c10.g()) {
                                c10.r(4);
                            }
                            if (c10.g()) {
                                c10.r(4);
                            }
                            if (c10.g()) {
                                c10.r(4);
                            }
                            if (c10.g()) {
                                c10.r(4);
                            }
                            if (c10.g()) {
                                c10.r(4);
                            }
                            if (c10.g()) {
                                c10.r(4);
                            }
                            if (c10.g()) {
                                c10.r(4);
                            }
                            if (c10.g()) {
                                if (c10.g()) {
                                    c10.r(4);
                                }
                                if (c10.g()) {
                                    c10.r(4);
                                }
                            }
                        }
                        if (c10.g()) {
                            c10.r(5);
                            if (c10.g()) {
                                c10.r(7);
                                if (c10.g()) {
                                    c10.r(8);
                                }
                            }
                        }
                        c10.r((iH6 + 2) * 8);
                        c10.c();
                    }
                    if (iH4 < 2) {
                        if (c10.g()) {
                            c10.r(14);
                        }
                        if (iH4 == 0 && c10.g()) {
                            c10.r(14);
                        }
                    }
                    if (c10.g()) {
                        if (i14 == 0) {
                            c10.r(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (c10.g()) {
                                    c10.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c10.g()) {
                c10.r(5);
                if (iH4 == 2) {
                    c10.r(4);
                }
                if (iH4 >= 6) {
                    c10.r(2);
                }
                if (c10.g()) {
                    c10.r(8);
                }
                if (iH4 == 0 && c10.g()) {
                    c10.r(8);
                }
                if (iH2 < 3) {
                    c10.q();
                }
            }
            if (i19 == 0 && i14 != 3) {
                c10.q();
            }
            if (i19 == 2 && (i14 == 3 || c10.g())) {
                i16 = 6;
                c10.r(6);
            } else {
                i16 = 6;
            }
            str = (c10.g() && c10.h(i16) == 1 && c10.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = iA;
        } else {
            c10.r(32);
            int iH7 = c10.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = c10.h(6);
            int i22 = f170223e[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            c10.r(8);
            int iH9 = c10.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                c10.r(2);
            }
            if ((iH9 & 4) != 0) {
                c10.r(2);
            }
            if (iH9 == 2) {
                c10.r(2);
            }
            int[] iArr = f170220b;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f170222d[iH9] + (c10.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new C2731b(str, i19, i11, i10, iC, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a3.t h(d3.D r7, java.lang.String r8, java.lang.String r9, a3.o r10) {
        /*
            d3.C r0 = new d3.C
            r0.<init>()
            r0.m(r7)
            r1 = 13
            int r1 = r0.h(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.r(r2)
            r3 = 2
            int r3 = r0.h(r3)
            int[] r4 = x3.C18063b.f170220b
            r3 = r4[r3]
            r4 = 10
            r0.r(r4)
            int[] r4 = x3.C18063b.f170222d
            int r5 = r0.h(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.h(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.r(r2)
            r2 = 4
            int r2 = r0.h(r2)
            r0.r(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.r(r2)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.r(r5)
        L4f:
            int r2 = r0.b()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.r(r6)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.c()
            int r0 = r0.d()
            r7.W(r0)
            a3.t$b r7 = new a3.t$b
            r7.<init>()
            a3.t$b r7 = r7.f0(r8)
            a3.t$b r7 = r7.u0(r2)
            a3.t$b r7 = r7.R(r4)
            a3.t$b r7 = r7.v0(r3)
            a3.t$b r7 = r7.Y(r10)
            a3.t$b r7 = r7.j0(r9)
            a3.t$b r7 = r7.p0(r1)
            a3.t r7 = r7.N()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C18063b.h(d3.D, java.lang.String, java.lang.String, a3.o):a3.t");
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((d3.P.O(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static int e(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return f170219a[i10] * 256;
        }
        return 1536;
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        boolean z10;
        int i11;
        if ((byteBuffer.get(byteBuffer.position() + i10 + 7) & 255) == 187) {
            z10 = true;
        } else {
            z10 = false;
        }
        int iPosition = byteBuffer.position() + i10;
        if (z10) {
            i11 = 9;
        } else {
            i11 = 8;
        }
        return 40 << ((byteBuffer.get(iPosition + i11) >> 4) & 7);
    }
}
