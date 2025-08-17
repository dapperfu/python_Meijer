package Ug;

import com.google.zxing.FormatException;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes7.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f36019a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f36020b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    private static final BigInteger[] f36021c;

    private enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    private static int a(int i10, int[] iArr, int i11, Gg.j jVar) throws FormatException {
        int i12;
        int i13;
        boolean z10 = false;
        while (i11 < iArr[0] && !z10) {
            while (true) {
                i12 = iArr[0];
                if (i11 >= i12 || iArr[i11] != 927) {
                    break;
                }
                jVar.f(iArr[i11 + 1]);
                i11 += 2;
            }
            if (i11 >= i12 || iArr[i11] >= 900) {
                z10 = true;
            } else {
                long j10 = 0;
                int i14 = 0;
                while (true) {
                    i13 = i11 + 1;
                    j10 = (j10 * 900) + iArr[i11];
                    i14++;
                    if (i14 >= 5 || i13 >= iArr[0] || iArr[i13] >= 900) {
                        break;
                    }
                    i11 = i13;
                }
                if (i14 != 5 || (i10 != 924 && (i13 >= iArr[0] || iArr[i13] >= 900))) {
                    i13 -= i14;
                    while (i13 < iArr[0] && !z10) {
                        int i15 = i13 + 1;
                        int i16 = iArr[i13];
                        if (i16 < 900) {
                            jVar.a((byte) i16);
                            i13 = i15;
                        } else if (i16 == 927) {
                            i13 += 2;
                            jVar.f(iArr[i15]);
                        } else {
                            z10 = true;
                        }
                    }
                } else {
                    for (int i17 = 0; i17 < 6; i17++) {
                        jVar.a((byte) (j10 >> ((5 - i17) * 8)));
                    }
                }
                i11 = i13;
            }
        }
        return i11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x003a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x003d. Please report as an issue. */
    private static int g(int[] iArr, int i10, Gg.j jVar) throws FormatException {
        int i11 = iArr[0];
        int[] iArr2 = new int[(i11 - i10) * 2];
        int[] iArr3 = new int[(i11 - i10) * 2];
        b bVar = b.ALPHA;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iArr[0] && !z10) {
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i14 < 900) {
                iArr2[i12] = i14 / 30;
                iArr2[i12 + 1] = i14 % 30;
                i12 += 2;
            } else if (i14 == 913) {
                iArr2[i12] = 913;
                i10 += 2;
                iArr3[i12] = iArr[i13];
                i12++;
            } else if (i14 != 927) {
                if (i14 != 928) {
                    switch (i14) {
                        case 900:
                            iArr2[i12] = 900;
                            i12++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i14) {
                            }
                    }
                }
                z10 = true;
            } else {
                b bVarE = e(iArr2, iArr3, i12, jVar, bVar);
                i10 += 2;
                jVar.f(iArr[i13]);
                int i15 = iArr[0];
                if (i10 > i15) {
                    throw FormatException.a();
                }
                bVar = bVarE;
                iArr3 = new int[(i15 - i10) * 2];
                iArr2 = new int[(i15 - i10) * 2];
                i12 = 0;
            }
            i10 = i13;
        }
        e(iArr2, iArr3, i12, jVar, bVar);
        return i10;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36022a;

        static {
            int[] iArr = new int[b.values().length];
            f36022a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36022a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36022a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36022a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36022a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36022a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f36021c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f36021c;
            if (i10 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(bigIntegerValueOf);
            i10++;
        }
    }

    static Gg.e b(int[] iArr, String str) throws FormatException {
        Gg.j jVar = new Gg.j(iArr.length * 2);
        int iG = g(iArr, 1, jVar);
        Tg.c cVar = new Tg.c();
        while (iG < iArr[0]) {
            int i10 = iG + 1;
            int i11 = iArr[iG];
            if (i11 != 913) {
                switch (i11) {
                    case 900:
                        iG = g(iArr, i10, jVar);
                        continue;
                    case 901:
                        break;
                    case 902:
                        iG = f(iArr, i10, jVar);
                        continue;
                    default:
                        switch (i11) {
                            case 922:
                            case 923:
                                throw FormatException.a();
                            case 924:
                                break;
                            case 925:
                                iG += 2;
                                continue;
                            case 926:
                                iG += 3;
                                continue;
                            case 927:
                                iG += 2;
                                jVar.f(iArr[i10]);
                                continue;
                            case 928:
                                iG = d(iArr, i10, cVar);
                                continue;
                            default:
                                iG = g(iArr, iG, jVar);
                                continue;
                        }
                }
                iG = a(i11, iArr, i10, jVar);
            } else {
                iG += 2;
                jVar.b((char) iArr[i10]);
            }
        }
        if (jVar.h() && cVar.a() == null) {
            throw FormatException.a();
        }
        Gg.e eVar = new Gg.e(null, jVar.toString(), null, str);
        eVar.p(cVar);
        return eVar;
    }

    private static String c(int[] iArr, int i10) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigIntegerAdd = bigIntegerAdd.add(f36021c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.a();
    }

    static int d(int[] iArr, int i10, Tg.c cVar) throws FormatException {
        int i11;
        if (i10 + 2 > iArr[0]) {
            throw FormatException.a();
        }
        int[] iArr2 = new int[2];
        int i12 = 0;
        while (i12 < 2) {
            iArr2[i12] = iArr[i10];
            i12++;
            i10++;
        }
        String strC = c(iArr2, 2);
        if (strC.isEmpty()) {
            cVar.k(0);
        } else {
            try {
                cVar.k(Integer.parseInt(strC));
            } catch (NumberFormatException unused) {
                throw FormatException.a();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < iArr[0] && i10 < iArr.length && (i11 = iArr[i10]) != 922 && i11 != 923) {
            sb2.append(String.format("%03d", Integer.valueOf(i11)));
            i10++;
        }
        if (sb2.length() == 0) {
            throw FormatException.a();
        }
        cVar.e(sb2.toString());
        int i13 = iArr[i10] == 923 ? i10 + 1 : -1;
        while (i10 < iArr[0]) {
            int i14 = iArr[i10];
            if (i14 == 922) {
                i10++;
                cVar.h(true);
            } else {
                if (i14 != 923) {
                    throw FormatException.a();
                }
                switch (iArr[i10 + 1]) {
                    case 0:
                        Gg.j jVar = new Gg.j();
                        i10 = g(iArr, i10 + 2, jVar);
                        cVar.f(jVar.toString());
                        break;
                    case 1:
                        Gg.j jVar2 = new Gg.j();
                        i10 = f(iArr, i10 + 2, jVar2);
                        try {
                            cVar.j(Integer.parseInt(jVar2.toString()));
                            break;
                        } catch (NumberFormatException unused2) {
                            throw FormatException.a();
                        }
                    case 2:
                        Gg.j jVar3 = new Gg.j();
                        i10 = f(iArr, i10 + 2, jVar3);
                        try {
                            cVar.m(Long.parseLong(jVar3.toString()));
                            break;
                        } catch (NumberFormatException unused3) {
                            throw FormatException.a();
                        }
                    case 3:
                        Gg.j jVar4 = new Gg.j();
                        i10 = g(iArr, i10 + 2, jVar4);
                        cVar.l(jVar4.toString());
                        break;
                    case 4:
                        Gg.j jVar5 = new Gg.j();
                        i10 = g(iArr, i10 + 2, jVar5);
                        cVar.c(jVar5.toString());
                        break;
                    case 5:
                        Gg.j jVar6 = new Gg.j();
                        i10 = f(iArr, i10 + 2, jVar6);
                        try {
                            cVar.g(Long.parseLong(jVar6.toString()));
                            break;
                        } catch (NumberFormatException unused4) {
                            throw FormatException.a();
                        }
                    case 6:
                        Gg.j jVar7 = new Gg.j();
                        i10 = f(iArr, i10 + 2, jVar7);
                        try {
                            cVar.d(Integer.parseInt(jVar7.toString()));
                            break;
                        } catch (NumberFormatException unused5) {
                            throw FormatException.a();
                        }
                    default:
                        throw FormatException.a();
                }
            }
        }
        if (i13 != -1) {
            int i15 = i10 - i13;
            if (cVar.b()) {
                i15--;
            }
            if (i15 > 0) {
                cVar.i(Arrays.copyOfRange(iArr, i13, i15 + i13));
            }
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[FALL_THROUGH, PHI: r3 r4
      0x0052: PHI (r3v10 Ug.e$b) = 
      (r3v1 Ug.e$b)
      (r3v1 Ug.e$b)
      (r3v2 Ug.e$b)
      (r3v1 Ug.e$b)
      (r3v1 Ug.e$b)
      (r3v3 Ug.e$b)
      (r3v1 Ug.e$b)
      (r3v1 Ug.e$b)
      (r3v5 Ug.e$b)
      (r3v12 Ug.e$b)
     binds: [B:70:0x00dd, B:65:0x00cc, B:67:0x00d0, B:59:0x00b9, B:53:0x00a9, B:56:0x00af, B:46:0x0095, B:40:0x0083, B:42:0x0087, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r4v13 Ug.e$b) = 
      (r4v1 Ug.e$b)
      (r4v1 Ug.e$b)
      (r4v3 Ug.e$b)
      (r4v1 Ug.e$b)
      (r4v1 Ug.e$b)
      (r4v6 Ug.e$b)
      (r4v1 Ug.e$b)
      (r4v1 Ug.e$b)
      (r4v9 Ug.e$b)
      (r4v1 Ug.e$b)
     binds: [B:70:0x00dd, B:65:0x00cc, B:67:0x00d0, B:59:0x00b9, B:53:0x00a9, B:56:0x00af, B:46:0x0095, B:40:0x0083, B:42:0x0087, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static Ug.e.b e(int[] r15, int[] r16, int r17, Gg.j r18, Ug.e.b r19) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.e.e(int[], int[], int, Gg.j, Ug.e$b):Ug.e$b");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0007 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int f(int[] r8, int r9, Gg.j r10) throws com.google.zxing.FormatException {
        /*
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = r8[r1]
            if (r9 >= r4) goto L47
            if (r2 != 0) goto L47
            int r5 = r9 + 1
            r6 = r8[r9]
            r7 = 1
            if (r5 != r4) goto L15
            r2 = r7
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r6 >= r4) goto L1f
            r0[r3] = r6
            int r3 = r3 + 1
        L1d:
            r9 = r5
            goto L32
        L1f:
            if (r6 == r4) goto L31
            r4 = 901(0x385, float:1.263E-42)
            if (r6 == r4) goto L31
            r4 = 927(0x39f, float:1.299E-42)
            if (r6 == r4) goto L31
            r4 = 928(0x3a0, float:1.3E-42)
            if (r6 == r4) goto L31
            switch(r6) {
                case 922: goto L31;
                case 923: goto L31;
                case 924: goto L31;
                default: goto L30;
            }
        L30:
            goto L1d
        L31:
            r2 = r7
        L32:
            int r4 = r3 % 15
            if (r4 == 0) goto L3c
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L3c
            if (r2 == 0) goto L7
        L3c:
            if (r3 <= 0) goto L7
            java.lang.String r3 = c(r0, r3)
            r10.d(r3)
            r3 = r1
            goto L7
        L47:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.e.f(int[], int, Gg.j):int");
    }
}
