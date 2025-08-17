package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9185qa0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f77796a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f77797b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f77798c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f77799d = new int[10];

    public static String g(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                C7598bh0 c7598bh0 = new C7598bh0();
                int i11 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i11 >= length2) {
                        break;
                    }
                    int iA = a(bArr, i11, length2, zArr);
                    if (iA != length2) {
                        c7598bh0.g(Integer.valueOf(iA));
                    }
                    i11 = iA + 3;
                }
                AbstractC7917eh0 abstractC7917eh0J = c7598bh0.j();
                for (int i12 = 0; i12 < abstractC7917eh0J.size(); i12++) {
                    if (((Integer) abstractC7917eh0J.get(i12)).intValue() + 3 < length) {
                        C7122Ra0 c7122Ra0 = new C7122Ra0(bArr, ((Integer) abstractC7917eh0J.get(i12)).intValue() + 3, length);
                        C8071g40 c8071g40L = l(c7122Ra0);
                        if (c8071g40L.f74233a == 33 && c8071g40L.f74234b == 0) {
                            c7122Ra0.f(4);
                            int iA2 = c7122Ra0.a(3);
                            c7122Ra0.e();
                            H40 h40M = m(c7122Ra0, true, iA2, null);
                            return C8302iD.d(h40M.f67347a, h40M.f67348b, h40M.f67349c, h40M.f67350d, h40M.f67351e, h40M.f67352f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void h(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean i(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        int i10 = b10 & 31;
        return (i10 == 1 || i10 == 9 || i10 == 14) ? false : true;
    }

    private static int j(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static int k(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        C8086gC.f(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            h(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            h(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            h(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    h(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static int b(byte[] bArr, int i10) {
        int i11;
        synchronized (f77798c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f77799d;
                    int length = iArr.length;
                    if (length <= i13) {
                        f77799d = Arrays.copyOf(iArr, length + length);
                    }
                    f77799d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = f77799d[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i19 + 2;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.C8610l70 c(byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.O80 r35) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9185qa0.c(byte[], int, int, com.google.android.gms.internal.ads.O80):com.google.android.gms.internal.ads.l70");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.O80 d(byte[] r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9185qa0.d(byte[], int, int):com.google.android.gms.internal.ads.O80");
    }

    public static C9042p90 e(byte[] bArr, int i10, int i11) {
        C7122Ra0 c7122Ra0 = new C7122Ra0(bArr, 4, i11);
        int iC = c7122Ra0.c();
        int iC2 = c7122Ra0.c();
        c7122Ra0.e();
        return new C9042p90(iC, iC2, c7122Ra0.h());
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c A[PHI: r2
      0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f A[PHI: r2
      0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.Q90 f(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9185qa0.f(byte[], int, int):com.google.android.gms.internal.ads.Q90");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.H40 m(com.google.android.gms.internal.ads.C7122Ra0 r18, boolean r19, int r20, com.google.android.gms.internal.ads.H40 r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.a(r2)
            boolean r7 = r0.h()
            r8 = 5
            int r8 = r0.a(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.h()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.a(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.f67347a
            boolean r7 = r2.f67348b
            int r8 = r2.f67349c
            int r10 = r2.f67350d
            int[] r4 = r2.f67351e
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.a(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.h()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.h()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.f(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.f(r5)
        L79:
            com.google.android.gms.internal.ads.H40 r11 = new com.google.android.gms.internal.ads.H40
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9185qa0.m(com.google.android.gms.internal.ads.Ra0, boolean, int, com.google.android.gms.internal.ads.H40):com.google.android.gms.internal.ads.H40");
    }

    private static C8071g40 l(C7122Ra0 c7122Ra0) {
        c7122Ra0.e();
        return new C8071g40(c7122Ra0.a(6), c7122Ra0.a(6), c7122Ra0.a(3) - 1);
    }

    private static void n(C7122Ra0 c7122Ra0) {
        int iC = c7122Ra0.c() + 1;
        c7122Ra0.f(8);
        for (int i10 = 0; i10 < iC; i10++) {
            c7122Ra0.c();
            c7122Ra0.c();
            c7122Ra0.e();
        }
        c7122Ra0.f(20);
    }
}
