package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.m2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8831m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C8617k2 f77541a = new Object() { // from class: com.google.android.gms.internal.ads.k2
    };

    private static int b(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static int d(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    private static AbstractC8042eh0 f(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC8042eh0.u("");
        }
        C7723bh0 c7723bh0 = new C7723bh0();
        int iC = c(bArr, i11, i10);
        while (i11 < iC) {
            c7723bh0.g(new String(bArr, i11, iC - i11, i(i10)));
            i11 = b(i10) + iC;
            iC = c(bArr, i11, i10);
        }
        AbstractC8042eh0 abstractC8042eh0J = c7723bh0.j();
        return abstractC8042eh0J.isEmpty() ? AbstractC8042eh0.u("") : abstractC8042eh0J;
    }

    private static String g(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    private static String h(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static Charset i(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a5 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a5, B:167:0x02e5, B:169:0x02fb, B:164:0x02c7, B:166:0x02df, B:185:0x0329, B:192:0x036c, B:195:0x03a1, B:198:0x03b2, B:199:0x03ba, B:201:0x03c0, B:203:0x03c7, B:204:0x03cb, B:212:0x03ec, B:216:0x0417, B:218:0x0422, B:219:0x0458, B:220:0x0465, B:222:0x046b, B:224:0x0472, B:225:0x0476, B:229:0x048c, B:237:0x049f, B:239:0x04c9, B:240:0x04d8, B:241:0x04e3), top: B:254:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c7 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a5, B:167:0x02e5, B:169:0x02fb, B:164:0x02c7, B:166:0x02df, B:185:0x0329, B:192:0x036c, B:195:0x03a1, B:198:0x03b2, B:199:0x03ba, B:201:0x03c0, B:203:0x03c7, B:204:0x03cb, B:212:0x03ec, B:216:0x0417, B:218:0x0422, B:219:0x0458, B:220:0x0465, B:222:0x046b, B:224:0x0472, B:225:0x0476, B:229:0x048c, B:237:0x049f, B:239:0x04c9, B:240:0x04d8, B:241:0x04e3), top: B:254:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0503  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.AbstractC8938n2 l(int r33, com.google.android.gms.internal.ads.GQ r34, boolean r35, int r36, com.google.android.gms.internal.ads.C8617k2 r37) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8831m2.l(int, com.google.android.gms.internal.ads.GQ, boolean, int, com.google.android.gms.internal.ads.k2):com.google.android.gms.internal.ads.n2");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.C8776lb a(byte[] r11, int r12, com.google.android.gms.internal.ads.C8617k2 r13, com.google.android.gms.internal.ads.N1 r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8831m2.a(byte[], int, com.google.android.gms.internal.ads.k2, com.google.android.gms.internal.ads.N1):com.google.android.gms.internal.ads.lb");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean j(com.google.android.gms.internal.ads.GQ r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.t()
        L8:
            int r3 = r1.r()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.w()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.K()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.G()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lab
        L25:
            int r7 = r1.E()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.E()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L22
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            goto La7
        L3b:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r24 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
        L48:
            r4 = r6
            goto La7
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L72
            goto L73
        L72:
            r4 = r6
        L73:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8d
        L7b:
            if (r0 != r3) goto L8b
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8d
        L89:
            r4 = r6
            goto L8d
        L8b:
            r3 = r6
            r4 = r3
        L8d:
            if (r4 == 0) goto L91
            int r3 = r3 + 4
        L91:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L97
            goto L48
        L97:
            int r3 = r1.r()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La1
            goto L48
        La1:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L22
            r1.m(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        La7:
            r1.l(r2)
            return r4
        Lab:
            r1.l(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8831m2.j(com.google.android.gms.internal.ads.GQ, int, int, boolean):boolean");
    }

    private static byte[] k(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? OV.f69936f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static int c(byte[] bArr, int i10, int i11) {
        int iD = d(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iD;
        }
        while (true) {
            int length = bArr.length;
            if (iD < length - 1) {
                int i12 = iD + 1;
                if ((iD - i10) % 2 == 0 && bArr[i12] == 0) {
                    return iD;
                }
                iD = d(bArr, i12);
            } else {
                return length;
            }
        }
    }

    private static int e(GQ gq2, int i10) {
        byte[] bArrN = gq2.n();
        int iT = gq2.t();
        int i11 = iT;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < iT + i10) {
                if ((bArrN[i11] & 255) == 255 && bArrN[i12] == 0) {
                    System.arraycopy(bArrN, i11 + 2, bArrN, i12, (i10 - (i11 - iT)) - 2);
                    i10--;
                }
                i11 = i12;
            } else {
                return i10;
            }
        }
    }
}
