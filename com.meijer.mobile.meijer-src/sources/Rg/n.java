package Rg;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* loaded from: classes8.dex */
public final class n extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f32601b = {6, 8, 10, 12, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f32602c = {1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f32603d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e, reason: collision with root package name */
    private static final int[][] f32604e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    private int f32605a = -1;

    private static int[] l(Ig.a aVar, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int iL = aVar.l();
        int i11 = i10;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iL) {
            if (aVar.g(i10) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (r.e(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i10};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw NotFoundException.a();
    }

    private static int h(int[] iArr) throws NotFoundException {
        int length = f32604e.length;
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float fE = r.e(iArr, f32604e[i11], 0.5f);
            if (fE < f10) {
                i10 = i11;
                f10 = fE;
            } else if (fE == f10) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw NotFoundException.a();
    }

    private static void j(Ig.a aVar, int i10, int i11, StringBuilder sb2) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            r.f(aVar, i10, iArr);
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                iArr2[i12] = iArr[i13];
                iArr3[i12] = iArr[i13 + 1];
            }
            sb2.append((char) (h(iArr2) + 48));
            sb2.append((char) (h(iArr3) + 48));
            for (int i14 = 0; i14 < 10; i14++) {
                i10 += iArr[i14];
            }
        }
    }

    private void n(Ig.a aVar, int i10) throws NotFoundException {
        int iMin = Math.min(this.f32605a * 10, i10);
        for (int i11 = i10 - 1; iMin > 0 && i11 >= 0 && !aVar.g(i11); i11--) {
            iMin--;
        }
        if (iMin != 0) {
            throw NotFoundException.a();
        }
    }

    private int[] i(Ig.a aVar) throws NotFoundException {
        int[] iArrL;
        aVar.p();
        try {
            int iM = m(aVar);
            try {
                iArrL = l(aVar, iM, f32603d[0]);
            } catch (NotFoundException unused) {
                iArrL = l(aVar, iM, f32603d[1]);
            }
            n(aVar, iArrL[0]);
            int i10 = iArrL[0];
            iArrL[0] = aVar.l() - iArrL[1];
            iArrL[1] = aVar.l() - i10;
            return iArrL;
        } finally {
            aVar.p();
        }
    }

    private int[] k(Ig.a aVar) throws NotFoundException {
        int[] iArrL = l(aVar, m(aVar), f32602c);
        int i10 = iArrL[1];
        int i11 = iArrL[0];
        this.f32605a = (i10 - i11) / 4;
        n(aVar, i11);
        return iArrL;
    }

    private static int m(Ig.a aVar) throws NotFoundException {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        if (iJ != iL) {
            return iJ;
        }
        throw NotFoundException.a();
    }

    @Override // Rg.r
    public com.google.zxing.m c(int i10, Ig.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        int[] iArr;
        boolean z10;
        int[] iArrK = k(aVar);
        int[] iArrI = i(aVar);
        StringBuilder sb2 = new StringBuilder(20);
        j(aVar, iArrK[1], iArrI[0], sb2);
        String string = sb2.toString();
        if (map != null) {
            iArr = (int[]) map.get(com.google.zxing.d.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = f32601b;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 < length2) {
                int i13 = iArr[i11];
                if (length == i13) {
                    z10 = true;
                    break;
                }
                if (i13 > i12) {
                    i12 = i13;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10 && length > i12) {
            z10 = true;
        }
        if (z10) {
            float f10 = i10;
            com.google.zxing.m mVar = new com.google.zxing.m(string, null, new com.google.zxing.o[]{new com.google.zxing.o(iArrK[1], f10), new com.google.zxing.o(iArrI[0], f10)}, com.google.zxing.a.ITF);
            mVar.h(com.google.zxing.n.SYMBOLOGY_IDENTIFIER, "]I0");
            return mVar;
        }
        throw FormatException.a();
    }
}
