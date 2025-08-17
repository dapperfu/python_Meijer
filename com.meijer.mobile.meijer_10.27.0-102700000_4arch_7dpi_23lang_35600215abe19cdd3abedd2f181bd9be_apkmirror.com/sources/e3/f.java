package e3;

import Ce.L;
import a3.C5570j;
import a3.t;
import a3.z;
import com.medallia.digital.mobilesdk.l3;
import d3.C13466a;
import d3.C13474i;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f128084a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f128085b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f128086c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f128087d = new int[10];

    private static void E(e3.h hVar, int i10, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i11 = 1; i11 < i10; i11++) {
            boolean zE = hVar.e();
            int i12 = 0;
            while (i12 < iArr[i11]) {
                if ((i12 <= 0 || !zE) ? i12 == 0 : hVar.e()) {
                    for (int i13 = 0; i13 < iArr2[i11]; i13++) {
                        if (zArr[i11][i13]) {
                            hVar.i();
                        }
                    }
                    hVar.i();
                    hVar.i();
                }
                i12++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void F(e3.h hVar, boolean z10, int i10) {
        ?? r92;
        ?? r12;
        boolean zE;
        boolean zE2;
        if (z10) {
            boolean zE3 = hVar.e();
            boolean zE4 = hVar.e();
            if (zE3 || zE4) {
                zE = hVar.e();
                if (zE) {
                    hVar.m(19);
                }
                hVar.m(8);
                if (zE) {
                    hVar.m(4);
                }
                hVar.m(15);
                r12 = zE4;
                r92 = zE3;
            } else {
                zE = false;
                r12 = zE4;
                r92 = zE3;
            }
        } else {
            r92 = 0;
            r12 = 0;
            zE = false;
        }
        for (int i11 = 0; i11 <= i10; i11++) {
            boolean zE5 = hVar.e();
            if (!zE5) {
                zE5 = hVar.e();
            }
            if (zE5) {
                hVar.i();
                zE2 = false;
            } else {
                zE2 = hVar.e();
            }
            int i12 = !zE2 ? hVar.i() : 0;
            int i13 = r92 + r12;
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 <= i12; i15++) {
                    hVar.i();
                    hVar.i();
                    if (zE) {
                        hVar.i();
                        hVar.i();
                    }
                    hVar.l();
                }
            }
        }
    }

    private static void G(e3.h hVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (hVar.e()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        hVar.h();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        hVar.h();
                    }
                } else {
                    hVar.i();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static int b(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String d(e3.h hVar) {
        hVar.m(4);
        int iF = hVar.f(3);
        hVar.l();
        c cVarQ = q(hVar, true, iF, null);
        return C13474i.f(cVarQ.f128093a, cVarQ.f128094b, cVarQ.f128095c, cVarQ.f128096d, cVarQ.f128097e, cVarQ.f128098f);
    }

    private static L<Integer> f(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        L.a aVarP = L.p();
        int i10 = 0;
        while (i10 < bArr.length) {
            int iE = e(bArr, i10, bArr.length, zArr);
            if (iE != bArr.length) {
                aVarP.a(Integer.valueOf(iE));
            }
            i10 = iE + 3;
        }
        return aVarP.k();
    }

    public static String h(List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                L<Integer> lF = f(bArr);
                for (int i11 = 0; i11 < lF.size(); i11++) {
                    if (lF.get(i11).intValue() + 3 < length) {
                        e3.h hVar = new e3.h(bArr, lF.get(i11).intValue() + 3, length);
                        b bVarP = p(hVar);
                        if (bVarP.f128090a == 33 && bVarP.f128091b == 0) {
                            return d(hVar);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static i w(e3.h hVar) {
        hVar.m(3);
        int i10 = hVar.e() ? 1 : 2;
        int iJ = C5570j.j(hVar.f(8));
        int iK = C5570j.k(hVar.f(8));
        hVar.m(8);
        return new i(iJ, i10, iK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k z(e3.h hVar, b bVar) {
        int[] iArr;
        int i10;
        int i11;
        int[] iArr2;
        j jVarX;
        int i12;
        int i13;
        int i14;
        int[] iArr3;
        L l10;
        int i15;
        boolean[][] zArr;
        int[] iArr4;
        int i16;
        int i17;
        hVar.m(4);
        boolean zE = hVar.e();
        boolean zE2 = hVar.e();
        int iF = hVar.f(6);
        int i18 = iF + 1;
        int iF2 = hVar.f(3);
        hVar.m(17);
        c cVarQ = q(hVar, true, iF2, null);
        boolean z10 = false;
        for (int i19 = hVar.e() ? 0 : iF2; i19 <= iF2; i19++) {
            hVar.i();
            hVar.i();
            hVar.i();
        }
        int iF3 = hVar.f(6);
        int i20 = hVar.i() + 1;
        d dVar = new d(L.y(cVarQ), new int[1]);
        Object[] objArr = i18 >= 2 && i20 >= 2;
        Object[] objArr2 = zE && zE2;
        int i21 = iF3 + 1;
        Object[] objArr3 = i21 >= i18;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, i20, i21);
        int i22 = 1;
        int[] iArr6 = new int[i20];
        int[] iArr7 = new int[i20];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i23 = 1; i23 < i20; i23++) {
            int i24 = 0;
            for (int i25 = 0; i25 <= iF3; i25++) {
                if (hVar.e()) {
                    iArr5[i23][i24] = i25;
                    iArr7[i23] = i25;
                    i24++;
                }
                iArr6[i23] = i24;
            }
        }
        if (hVar.e()) {
            hVar.m(64);
            if (hVar.e()) {
                hVar.i();
            }
            int i26 = hVar.i();
            int i27 = 0;
            while (i27 < i26) {
                hVar.i();
                if (i27 == 0 || hVar.e()) {
                    z10 = true;
                }
                F(hVar, z10, iF2);
                i27++;
                z10 = false;
            }
        }
        if (!hVar.e()) {
            return new k(bVar, null, dVar, null, null);
        }
        hVar.b();
        c cVarQ2 = q(hVar, false, iF2, cVarQ);
        boolean zE3 = hVar.e();
        int i28 = 6;
        boolean[] zArr2 = new boolean[16];
        int i29 = 0;
        for (int i30 = 0; i30 < 16; i30++) {
            boolean zE4 = hVar.e();
            zArr2[i30] = zE4;
            if (zE4) {
                i29++;
            }
        }
        if (i29 == 0 || !zArr2[1]) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr8 = new int[i29];
        for (int i31 = 0; i31 < i29 - (zE3 ? 1 : 0); i31++) {
            iArr8[i31] = hVar.f(3);
        }
        int[] iArr9 = new int[i29 + 1];
        if (zE3) {
            int i32 = 1;
            while (i32 < i29) {
                int[] iArr10 = iArr9;
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr10[i32] = iArr10[i32] + iArr8[i33] + 1;
                }
                i32++;
                iArr9 = iArr10;
            }
            iArr = iArr9;
            iArr[i29] = 6;
        } else {
            iArr = iArr9;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i18, i29);
        int[] iArr12 = new int[i18];
        iArr12[0] = 0;
        boolean zE5 = hVar.e();
        int i34 = 1;
        while (i34 < i18) {
            if (zE5) {
                i17 = i34;
                iArr12[i17] = hVar.f(i28);
            } else {
                i17 = i34;
                iArr12[i17] = i17;
            }
            if (zE3) {
                for (int i35 = 0; i35 < i29; i35++) {
                    iArr11[i17][i35] = (iArr12[i17] & ((1 << iArr[r33]) - 1)) >> iArr[i35];
                }
            } else {
                int i36 = 0;
                while (i36 < i29) {
                    int i37 = i36;
                    iArr11[i17][i37] = hVar.f(iArr8[i36] + 1);
                    i36 = i37 + 1;
                }
            }
            i34 = i17 + 1;
            i28 = 6;
        }
        int[] iArr13 = new int[i21];
        int i38 = 1;
        int i39 = 0;
        while (i39 < i18) {
            iArr13[iArr12[i39]] = -1;
            int[] iArr14 = iArr13;
            int i40 = 0;
            int i41 = 0;
            while (i40 < 16) {
                if (zArr2[i40]) {
                    if (i40 == i22) {
                        iArr14[iArr12[i39]] = iArr11[i39][i41];
                    }
                    i41++;
                }
                i40++;
                i22 = 1;
            }
            if (i39 > 0) {
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        i38++;
                        break;
                    }
                    int i43 = i42;
                    if (iArr14[iArr12[i39]] == iArr14[iArr12[i42]]) {
                        break;
                    }
                    i42 = i43 + 1;
                }
            }
            i39++;
            iArr13 = iArr14;
            i22 = 1;
        }
        int[] iArr15 = iArr13;
        int iF4 = hVar.f(4);
        if (i38 < 2 || iF4 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr16 = new int[i38];
        for (int i44 = 0; i44 < i38; i44++) {
            iArr16[i44] = hVar.f(iF4);
        }
        int[] iArr17 = new int[i21];
        int i45 = 0;
        while (i45 < i18) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr12[i45], iF3)] = i45;
            i45++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        L.a aVarP = L.p();
        int i46 = 0;
        while (i46 <= iF3) {
            int i47 = i38;
            int[] iArr20 = iArr7;
            int iMin = Math.min(iArr15[i46], i47 - 1);
            aVarP.a(new a(iArr19[i46], iMin >= 0 ? iArr16[iMin] : -1));
            i46++;
            i38 = i47;
            iArr7 = iArr20;
            iArr16 = iArr16;
        }
        int[] iArr21 = iArr7;
        L lK = aVarP.k();
        if (((a) lK.get(0)).f128089b == -1) {
            return new k(bVar, null, dVar, null, null);
        }
        int i48 = 1;
        while (true) {
            if (i48 > iF3) {
                i10 = -1;
                i11 = -1;
                break;
            }
            i10 = -1;
            if (((a) lK.get(i48)).f128089b != -1) {
                i11 = i48;
                break;
            }
            i48++;
        }
        if (i11 == i10) {
            return new k(bVar, null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        int i49 = 1;
        while (i49 < i18) {
            boolean[][] zArr5 = zArr4;
            for (int i50 = 0; i50 < i49; i50++) {
                boolean[] zArr6 = zArr3[i49];
                boolean[] zArr7 = zArr5[i49];
                boolean zE6 = hVar.e();
                zArr7[i50] = zE6;
                zArr6[i50] = zE6;
            }
            i49++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i51 = 1; i51 < i18; i51++) {
            int i52 = 0;
            while (i52 < iF) {
                int[] iArr22 = iArr12;
                int i53 = 0;
                while (true) {
                    if (i53 < i51) {
                        boolean[] zArr9 = zArr8[i51];
                        if (zArr9[i53] && zArr8[i53][i52]) {
                            zArr9[i52] = true;
                            break;
                        }
                        i53++;
                    }
                }
                i52++;
                iArr12 = iArr22;
            }
        }
        int[] iArr23 = iArr12;
        int[] iArr24 = new int[i21];
        for (int i54 = 0; i54 < i18; i54++) {
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr3[i54][i56] ? 1 : 0;
            }
            iArr24[iArr23[i54]] = i55;
        }
        int i57 = 0;
        for (int i58 = 0; i58 < i18; i58++) {
            if (iArr24[iArr23[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new k(bVar, null, dVar, null, null);
        }
        int[] iArr25 = new int[i18];
        int[] iArr26 = new int[i20];
        if (hVar.e()) {
            iArr2 = iArr24;
            int i59 = 0;
            while (i59 < i18) {
                int i60 = i59;
                iArr25[i60] = hVar.f(3);
                i59 = i60 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i18, iF2);
        }
        int i61 = 0;
        while (i61 < i20) {
            int i62 = i61;
            boolean[][] zArr10 = zArr3;
            int[] iArr27 = iArr25;
            int iMax = 0;
            for (int i63 = 0; i63 < iArr6[i62]; i63++) {
                iMax = Math.max(iMax, iArr27[((a) lK.get(iArr5[i62][i63])).f128088a]);
            }
            iArr26[i62] = iMax + 1;
            i61 = i62 + 1;
            iArr25 = iArr27;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (hVar.e()) {
            int i64 = 0;
            while (i64 < iF) {
                int i65 = i64 + 1;
                int i66 = i65;
                while (i66 < i18) {
                    if (zArr11[i66][i64]) {
                        i16 = i64;
                        hVar.m(3);
                    } else {
                        i16 = i64;
                    }
                    i66++;
                    i64 = i16;
                }
                i64 = i65;
            }
        }
        hVar.l();
        int i67 = hVar.i() + 1;
        L.a aVarP2 = L.p();
        aVarP2.a(cVarQ);
        if (i67 > 1) {
            aVarP2.a(cVarQ2);
            for (int i68 = 2; i68 < i67; i68++) {
                cVarQ2 = q(hVar, hVar.e(), iF2, cVarQ2);
                aVarP2.a(cVarQ2);
            }
        }
        L lK2 = aVarP2.k();
        int i69 = hVar.i() + i20;
        if (i69 > i20) {
            return new k(bVar, null, dVar, null, null);
        }
        int iF5 = hVar.f(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, i69, i21);
        int[] iArr28 = new int[i69];
        int i70 = 0;
        int[] iArr29 = new int[i69];
        int i71 = 0;
        while (i71 < i20) {
            iArr28[i71] = i70;
            iArr29[i71] = iArr21[i71];
            if (iF5 == 0) {
                i15 = i71;
                zArr = zArr12;
                l10 = lK2;
                iArr4 = iArr28;
                Arrays.fill(zArr12[i15], i70, iArr6[i15], true);
                iArr4[i15] = iArr6[i15];
            } else {
                l10 = lK2;
                i15 = i71;
                zArr = zArr12;
                iArr4 = iArr28;
                if (iF5 == 1) {
                    int i72 = iArr21[i15];
                    for (int i73 = 0; i73 < iArr6[i15]; i73++) {
                        zArr[i15][i73] = iArr5[i15][i73] == i72;
                    }
                    iArr4[i15] = 1;
                } else {
                    i70 = 0;
                    zArr[0][0] = true;
                    iArr4[0] = 1;
                    i71 = i15 + 1;
                    zArr12 = zArr;
                    iArr28 = iArr4;
                    lK2 = l10;
                }
            }
            i70 = 0;
            i71 = i15 + 1;
            zArr12 = zArr;
            iArr28 = iArr4;
            lK2 = l10;
        }
        L l11 = lK2;
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i21];
        int i74 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i21;
        iArr32[i70] = i69;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i75 = 1;
        int i76 = 0;
        while (i75 < i69) {
            if (iF5 == i74) {
                for (int i77 = 0; i77 < iArr6[i75]; i77++) {
                    zArr13[i75][i77] = hVar.e();
                    int i78 = iArr30[i75];
                    boolean z11 = zArr13[i75][i77];
                    iArr30[i75] = i78 + (z11 ? 1 : 0);
                    if (z11) {
                        iArr29[i75] = iArr5[i75][i77];
                    }
                }
            }
            if (i76 == 0) {
                i12 = 0;
                if (iArr5[i75][0] == 0 && zArr13[i75][0]) {
                    for (int i79 = 1; i79 < iArr6[i75]; i79++) {
                        if (iArr5[i75][i79] == i11 && zArr13[i75][i11]) {
                            i76 = i75;
                        }
                    }
                }
            } else {
                i12 = 0;
            }
            int i80 = i12;
            while (i80 < iArr6[i75]) {
                if (i67 > 1) {
                    zArr14[i75][i80] = zArr13[i75][i80];
                    i14 = i11;
                    iArr3 = iArr31;
                    i13 = i67;
                    int iD = Fe.a.d(i67, RoundingMode.CEILING);
                    if (!zArr14[i75][i80]) {
                        int i81 = ((a) lK.get(iArr5[i75][i80])).f128088a;
                        int i82 = i12;
                        while (true) {
                            if (i82 >= i80) {
                                break;
                            }
                            int i83 = i81;
                            if (zArr8[i83][((a) lK.get(iArr5[i75][i82])).f128088a]) {
                                zArr14[i75][i80] = true;
                                break;
                            }
                            i82++;
                            i81 = i83;
                        }
                    }
                    if (zArr14[i75][i80]) {
                        if (i76 <= 0 || i75 != i76) {
                            hVar.m(iD);
                        } else {
                            iArr3[i80] = hVar.f(iD);
                        }
                    }
                } else {
                    i13 = i67;
                    i14 = i11;
                    iArr3 = iArr31;
                }
                i80++;
                i11 = i14;
                iArr31 = iArr3;
                i67 = i13;
            }
            int i84 = i67;
            int i85 = i11;
            int[] iArr33 = iArr31;
            if (iArr30[i75] == 1 && iArr2[iArr29[i75]] > 0) {
                hVar.l();
            }
            i75++;
            i11 = i85;
            iArr31 = iArr33;
            i67 = i84;
            i74 = 2;
        }
        int[] iArr34 = iArr31;
        if (i76 == 0) {
            return new k(bVar, null, dVar, null, null);
        }
        C2019f c2019fS = s(hVar, i18);
        hVar.m(2);
        for (int i86 = 1; i86 < i18; i86++) {
            if (iArr2[iArr23[i86]] == 0) {
                hVar.l();
            }
        }
        E(hVar, i69, iArr26, iArr6, zArr14);
        K(hVar, i18, zArr11);
        if (hVar.e()) {
            hVar.b();
            jVarX = x(hVar, i18, i20, iArr26);
        } else {
            jVarX = null;
        }
        return new k(bVar, lK, new d(l11, iArr34), c2019fS, jVarX);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f128088a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128089b;

        public a(int i10, int i11) {
            this.f128088a = i10;
            this.f128089b = i11;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f128090a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128091b;

        /* renamed from: c, reason: collision with root package name */
        public final int f128092c;

        public b(int i10, int i11, int i12) {
            this.f128090a = i10;
            this.f128091b = i11;
            this.f128092c = i12;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f128093a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f128094b;

        /* renamed from: c, reason: collision with root package name */
        public final int f128095c;

        /* renamed from: d, reason: collision with root package name */
        public final int f128096d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f128097e;

        /* renamed from: f, reason: collision with root package name */
        public final int f128098f;

        public c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
            this.f128093a = i10;
            this.f128094b = z10;
            this.f128095c = i11;
            this.f128096d = i12;
            this.f128097e = iArr;
            this.f128098f = i13;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final L<c> f128099a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f128100b;

        public d(List<c> list, int[] iArr) {
            this.f128099a = L.s(list);
            this.f128100b = iArr;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f128101a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128102b;

        /* renamed from: c, reason: collision with root package name */
        public final int f128103c;

        /* renamed from: d, reason: collision with root package name */
        public final int f128104d;

        /* renamed from: e, reason: collision with root package name */
        public final int f128105e;

        public e(int i10, int i11, int i12, int i13, int i14) {
            this.f128101a = i10;
            this.f128102b = i11;
            this.f128103c = i12;
            this.f128104d = i13;
            this.f128105e = i14;
        }
    }

    /* renamed from: e3.f$f, reason: collision with other inner class name */
    public static final class C2019f {

        /* renamed from: a, reason: collision with root package name */
        public final L<e> f128106a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f128107b;

        public C2019f(List<e> list, int[] iArr) {
            this.f128106a = L.s(list);
            this.f128107b = iArr;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f128108a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128109b;

        /* renamed from: c, reason: collision with root package name */
        public final int f128110c;

        /* renamed from: d, reason: collision with root package name */
        public final int f128111d;

        /* renamed from: e, reason: collision with root package name */
        public final int f128112e;

        /* renamed from: f, reason: collision with root package name */
        public final int f128113f;

        /* renamed from: g, reason: collision with root package name */
        public final int f128114g;

        /* renamed from: h, reason: collision with root package name */
        public final int f128115h;

        /* renamed from: i, reason: collision with root package name */
        public final int f128116i;

        public g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f128108a = i10;
            this.f128109b = i11;
            this.f128110c = i12;
            this.f128111d = i13;
            this.f128112e = i14;
            this.f128113f = i15;
            this.f128114g = i16;
            this.f128115h = i17;
            this.f128116i = i18;
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final b f128117a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128118b;

        /* renamed from: c, reason: collision with root package name */
        public final c f128119c;

        /* renamed from: d, reason: collision with root package name */
        public final int f128120d;

        /* renamed from: e, reason: collision with root package name */
        public final int f128121e;

        /* renamed from: f, reason: collision with root package name */
        public final int f128122f;

        /* renamed from: g, reason: collision with root package name */
        public final int f128123g;

        /* renamed from: h, reason: collision with root package name */
        public final int f128124h;

        /* renamed from: i, reason: collision with root package name */
        public final int f128125i;

        /* renamed from: j, reason: collision with root package name */
        public final float f128126j;

        /* renamed from: k, reason: collision with root package name */
        public final int f128127k;

        /* renamed from: l, reason: collision with root package name */
        public final int f128128l;

        /* renamed from: m, reason: collision with root package name */
        public final int f128129m;

        /* renamed from: n, reason: collision with root package name */
        public final int f128130n;

        public h(b bVar, int i10, c cVar, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, int i19, int i20) {
            this.f128117a = bVar;
            this.f128118b = i10;
            this.f128119c = cVar;
            this.f128120d = i11;
            this.f128121e = i12;
            this.f128122f = i13;
            this.f128123g = i14;
            this.f128124h = i15;
            this.f128125i = i16;
            this.f128126j = f10;
            this.f128127k = i17;
            this.f128128l = i18;
            this.f128129m = i19;
            this.f128130n = i20;
        }
    }

    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final int f128131a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128132b;

        /* renamed from: c, reason: collision with root package name */
        public final int f128133c;

        public i(int i10, int i11, int i12) {
            this.f128131a = i10;
            this.f128132b = i11;
            this.f128133c = i12;
        }
    }

    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final L<i> f128134a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f128135b;

        public j(List<i> list, int[] iArr) {
            this.f128134a = L.s(list);
            this.f128135b = iArr;
        }
    }

    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final b f128136a;

        /* renamed from: b, reason: collision with root package name */
        public final L<a> f128137b;

        /* renamed from: c, reason: collision with root package name */
        public final d f128138c;

        /* renamed from: d, reason: collision with root package name */
        public final C2019f f128139d;

        /* renamed from: e, reason: collision with root package name */
        public final j f128140e;

        public k(b bVar, List<a> list, d dVar, C2019f c2019f, j jVar) {
            L<a> lX;
            this.f128136a = bVar;
            if (list != null) {
                lX = L.s(list);
            } else {
                lX = L.x();
            }
            this.f128137b = lX;
            this.f128138c = dVar;
            this.f128139d = c2019f;
            this.f128140e = jVar;
        }
    }

    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public final int f128141a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128142b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f128143c;

        public l(int i10, int i11, boolean z10) {
            this.f128141a = i10;
            this.f128142b = i11;
            this.f128143c = z10;
        }
    }

    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public final int f128144a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128145b;

        /* renamed from: c, reason: collision with root package name */
        public final int f128146c;

        /* renamed from: d, reason: collision with root package name */
        public final int f128147d;

        /* renamed from: e, reason: collision with root package name */
        public final int f128148e;

        /* renamed from: f, reason: collision with root package name */
        public final int f128149f;

        /* renamed from: g, reason: collision with root package name */
        public final int f128150g;

        /* renamed from: h, reason: collision with root package name */
        public final float f128151h;

        /* renamed from: i, reason: collision with root package name */
        public final int f128152i;

        /* renamed from: j, reason: collision with root package name */
        public final int f128153j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f128154k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f128155l;

        /* renamed from: m, reason: collision with root package name */
        public final int f128156m;

        /* renamed from: n, reason: collision with root package name */
        public final int f128157n;

        /* renamed from: o, reason: collision with root package name */
        public final int f128158o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f128159p;

        /* renamed from: q, reason: collision with root package name */
        public final int f128160q;

        /* renamed from: r, reason: collision with root package name */
        public final int f128161r;

        /* renamed from: s, reason: collision with root package name */
        public final int f128162s;

        /* renamed from: t, reason: collision with root package name */
        public final int f128163t;

        public m(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, boolean z10, boolean z11, int i19, int i20, int i21, boolean z12, int i22, int i23, int i24, int i25) {
            this.f128144a = i10;
            this.f128145b = i11;
            this.f128146c = i12;
            this.f128147d = i13;
            this.f128148e = i14;
            this.f128149f = i15;
            this.f128150g = i16;
            this.f128151h = f10;
            this.f128152i = i17;
            this.f128153j = i18;
            this.f128154k = z10;
            this.f128155l = z11;
            this.f128156m = i19;
            this.f128157n = i20;
            this.f128158o = i21;
            this.f128159p = z12;
            this.f128160q = i22;
            this.f128161r = i23;
            this.f128162s = i24;
            this.f128163t = i25;
        }
    }

    public static l A(byte[] bArr, int i10, int i11) {
        return B(bArr, i10 + 1, i11);
    }

    public static l B(byte[] bArr, int i10, int i11) {
        e3.h hVar = new e3.h(bArr, i10, i11);
        int i12 = hVar.i();
        int i13 = hVar.i();
        hVar.l();
        return new l(i12, i13, hVar.e());
    }

    public static m C(byte[] bArr, int i10, int i11) {
        return D(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e3.f.m D(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.f.D(byte[], int, int):e3.f$m");
    }

    private static void J(e3.h hVar, int i10) {
        int iH = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iH != 0) {
                iH = ((hVar.h() + i11) + 256) % 256;
            }
            if (iH != 0) {
                i11 = iH;
            }
        }
    }

    public static int L(byte[] bArr, int i10) {
        int i11;
        synchronized (f128086c) {
            int iG = 0;
            int i12 = 0;
            while (iG < i10) {
                try {
                    iG = g(bArr, iG, i10);
                    if (iG < i10) {
                        int[] iArr = f128087d;
                        if (iArr.length <= i12) {
                            f128087d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f128087d[i12] = iG;
                        iG += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f128087d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        C13466a.g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            c(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            c(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            c(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    c(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    private static int g(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int i(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int j(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean k(byte[] bArr, int i10, int i11, t tVar) {
        if (Objects.equals(tVar.f43949o, "video/avc")) {
            return l(bArr[i10]);
        }
        if (Objects.equals(tVar.f43949o, "video/hevc")) {
            return m(bArr, i10, i11, tVar);
        }
        return true;
    }

    public static boolean l(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        int i10 = b10 & 31;
        return (i10 == 1 || i10 == 9 || i10 == 14) ? false : true;
    }

    private static boolean m(byte[] bArr, int i10, int i11, t tVar) {
        b bVarP = p(new e3.h(bArr, i10, i11 + i10));
        int i12 = bVarP.f128090a;
        if (i12 == 35) {
            return false;
        }
        return (i12 <= 14 && i12 % 2 == 0 && bVarP.f128092c == tVar.f43923D - 1) ? false : true;
    }

    public static boolean n(t tVar, byte b10) {
        return ((Objects.equals(tVar.f43949o, "video/avc") || z.b(tVar.f43945k, "video/avc")) && (b10 & 31) == 6) || ((Objects.equals(tVar.f43949o, "video/hevc") || z.b(tVar.f43945k, "video/hevc")) && ((b10 & 126) >> 1) == 39);
    }

    public static int o(t tVar) {
        if (Objects.equals(tVar.f43949o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(tVar.f43949o, "video/hevc") || z.b(tVar.f43945k, "video/hevc")) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static e3.f.c q(e3.h r19, boolean r20, int r21, e3.f.c r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.f(r5)
            boolean r8 = r0.e()
            r9 = 5
            int r9 = r0.f(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.e()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.f(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f128093a
            boolean r8 = r2.f128094b
            int r9 = r2.f128095c
            int r11 = r2.f128096d
            int[] r4 = r2.f128097e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.f(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.e()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.e()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.m(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.m(r6)
        L7b:
            e3.f$c r12 = new e3.f$c
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.f.q(e3.h, boolean, int, e3.f$c):e3.f$c");
    }

    private static e r(e3.h hVar) {
        int i10;
        int i11;
        int iF;
        int iF2 = hVar.f(16);
        int iF3 = hVar.f(16);
        if (hVar.e()) {
            int iF4 = hVar.f(2);
            if (iF4 == 3) {
                hVar.l();
            }
            int iF5 = hVar.f(4);
            iF = hVar.f(4);
            i11 = iF5;
            i10 = iF4;
        } else {
            i10 = 0;
            i11 = 0;
            iF = 0;
        }
        if (hVar.e()) {
            int i12 = hVar.i();
            int i13 = hVar.i();
            int i14 = hVar.i();
            int i15 = hVar.i();
            iF2 = b(iF2, i10, i12, i13);
            iF3 = a(iF3, i10, i14, i15);
        }
        return new e(i10, i11, iF, iF2, iF3);
    }

    public static g t(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        do {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b10 != 0 && i11 > i12) {
            e3.h hVar = new e3.h(bArr, i12, i11 + 1);
            while (hVar.c(16)) {
                int iF = hVar.f(8);
                int i13 = 0;
                while (iF == 255) {
                    i13 += l3.f92484c;
                    iF = hVar.f(8);
                }
                int i14 = i13 + iF;
                int iF2 = hVar.f(8);
                int i15 = 0;
                while (iF2 == 255) {
                    i15 += l3.f92484c;
                    iF2 = hVar.f(8);
                }
                int i16 = i15 + iF2;
                if (i16 == 0 || !hVar.c(i16)) {
                    break;
                }
                if (i14 == 176) {
                    int i17 = hVar.i();
                    boolean zE = hVar.e();
                    int i18 = zE ? hVar.i() : 0;
                    int i19 = hVar.i();
                    int i20 = -1;
                    int i21 = -1;
                    int iF3 = -1;
                    int iF4 = -1;
                    int i22 = -1;
                    int iF5 = -1;
                    for (int i23 = 0; i23 <= i19; i23++) {
                        i20 = hVar.i();
                        i21 = hVar.i();
                        iF3 = hVar.f(6);
                        if (iF3 == 63) {
                            return null;
                        }
                        iF4 = hVar.f(iF3 == 0 ? Math.max(0, i17 - 30) : Math.max(0, (iF3 + i17) - 31));
                        if (zE) {
                            int iF6 = hVar.f(6);
                            if (iF6 == 63) {
                                return null;
                            }
                            i22 = iF6;
                            iF5 = hVar.f(iF6 == 0 ? Math.max(0, i18 - 30) : Math.max(0, (iF6 + i18) - 31));
                        }
                        if (hVar.e()) {
                            hVar.m(10);
                        }
                    }
                    return new g(i17, i18, i19 + 1, i20, i21, iF3, iF4, i22, iF5);
                }
            }
        }
        return null;
    }

    public static h u(byte[] bArr, int i10, int i11, k kVar) {
        return v(bArr, i10 + 2, i11, p(new e3.h(bArr, i10, i11)), kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e3.f.h v(byte[] r17, int r18, int r19, e3.f.b r20, e3.f.k r21) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.f.v(byte[], int, int, e3.f$b, e3.f$k):e3.f$h");
    }

    public static k y(byte[] bArr, int i10, int i11) {
        e3.h hVar = new e3.h(bArr, i10, i11);
        return z(hVar, p(hVar));
    }

    private static void H(e3.h hVar) {
        int i10;
        int i11;
        int i12 = hVar.i();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < i12; i15++) {
            if (i15 != 0 && hVar.e()) {
                int i16 = i13 + i14;
                int i17 = (1 - ((hVar.e() ? 1 : 0) * 2)) * (hVar.i() + 1);
                int i18 = i16 + 1;
                boolean[] zArr = new boolean[i18];
                for (int i19 = 0; i19 <= i16; i19++) {
                    if (!hVar.e()) {
                        zArr[i19] = hVar.e();
                    } else {
                        zArr[i19] = true;
                    }
                }
                int[] iArr2 = new int[i18];
                int[] iArr3 = new int[i18];
                int i20 = 0;
                for (int i21 = i14 - 1; i21 >= 0; i21--) {
                    int i22 = iArrCopyOf[i21] + i17;
                    if (i22 < 0 && zArr[i13 + i21]) {
                        iArr2[i20] = i22;
                        i20++;
                    }
                }
                if (i17 < 0 && zArr[i16]) {
                    iArr2[i20] = i17;
                    i20++;
                }
                for (int i23 = 0; i23 < i13; i23++) {
                    int i24 = iArr[i23] + i17;
                    if (i24 < 0 && zArr[i23]) {
                        iArr2[i20] = i24;
                        i20++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, i20);
                int i25 = 0;
                for (int i26 = i13 - 1; i26 >= 0; i26--) {
                    int i27 = iArr[i26] + i17;
                    if (i27 > 0 && zArr[i26]) {
                        iArr3[i25] = i27;
                        i25++;
                    }
                }
                if (i17 > 0 && zArr[i16]) {
                    iArr3[i25] = i17;
                    i25++;
                }
                for (int i28 = 0; i28 < i14; i28++) {
                    int i29 = iArrCopyOf[i28] + i17;
                    if (i29 > 0 && zArr[i13 + i28]) {
                        iArr3[i25] = i29;
                        i25++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i25);
                iArr = iArrCopyOf2;
                i13 = i20;
                i14 = i25;
            } else {
                int i30 = hVar.i();
                int i31 = hVar.i();
                int[] iArr4 = new int[i30];
                for (int i32 = 0; i32 < i30; i32++) {
                    if (i32 > 0) {
                        i11 = iArr4[i32 - 1];
                    } else {
                        i11 = 0;
                    }
                    iArr4[i32] = i11 - (hVar.i() + 1);
                    hVar.l();
                }
                int[] iArr5 = new int[i31];
                for (int i33 = 0; i33 < i31; i33++) {
                    if (i33 > 0) {
                        i10 = iArr5[i33 - 1];
                    } else {
                        i10 = 0;
                    }
                    iArr5[i33] = i10 + hVar.i() + 1;
                    hVar.l();
                }
                i13 = i30;
                iArr = iArr4;
                i14 = i31;
                iArrCopyOf = iArr5;
            }
        }
    }

    private static void I(e3.h hVar) {
        int i10 = hVar.i() + 1;
        hVar.m(8);
        for (int i11 = 0; i11 < i10; i11++) {
            hVar.i();
            hVar.i();
            hVar.l();
        }
        hVar.m(20);
    }

    private static void K(e3.h hVar, int i10, boolean[][] zArr) {
        int i11 = hVar.i() + 2;
        if (hVar.e()) {
            hVar.m(i11);
        } else {
            for (int i12 = 1; i12 < i10; i12++) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (zArr[i12][i13]) {
                        hVar.m(i11);
                    }
                }
            }
        }
        int i14 = hVar.i();
        for (int i15 = 1; i15 <= i14; i15++) {
            hVar.m(8);
        }
    }

    private static b p(e3.h hVar) {
        hVar.l();
        return new b(hVar.f(6), hVar.f(6), hVar.f(3) - 1);
    }

    private static C2019f s(e3.h hVar, int i10) {
        int i11 = hVar.i();
        int i12 = i11 + 1;
        L.a aVarQ = L.q(i12);
        int[] iArr = new int[i10];
        for (int i13 = 0; i13 < i12; i13++) {
            aVarQ.a(r(hVar));
        }
        int i14 = 1;
        if (i12 > 1 && hVar.e()) {
            int iD = Fe.a.d(i12, RoundingMode.CEILING);
            while (i14 < i10) {
                iArr[i14] = hVar.f(iD);
                i14++;
            }
        } else {
            while (i14 < i10) {
                iArr[i14] = Math.min(i14, i11);
                i14++;
            }
        }
        return new C2019f(aVarQ.k(), iArr);
    }

    private static j x(e3.h hVar, int i10, int i11, int[] iArr) {
        boolean zE;
        boolean zE2;
        boolean zE3;
        int iF;
        if (!hVar.e()) {
            zE = hVar.e();
        } else {
            zE = true;
        }
        if (zE) {
            hVar.l();
        }
        boolean zE4 = hVar.e();
        boolean zE5 = hVar.e();
        if (zE4 || zE5) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < iArr[i12]; i13++) {
                    if (zE4) {
                        zE2 = hVar.e();
                    } else {
                        zE2 = false;
                    }
                    if (zE5) {
                        zE3 = hVar.e();
                    } else {
                        zE3 = false;
                    }
                    if (zE2) {
                        hVar.m(32);
                    }
                    if (zE3) {
                        hVar.m(18);
                    }
                }
            }
        }
        boolean zE6 = hVar.e();
        if (zE6) {
            iF = hVar.f(4) + 1;
        } else {
            iF = i10;
        }
        L.a aVarQ = L.q(iF);
        int[] iArr2 = new int[i10];
        for (int i14 = 0; i14 < iF; i14++) {
            aVarQ.a(w(hVar));
        }
        if (zE6 && iF > 1) {
            for (int i15 = 0; i15 < i10; i15++) {
                iArr2[i15] = hVar.f(4);
            }
        }
        return new j(aVarQ.k(), iArr2);
    }
}
