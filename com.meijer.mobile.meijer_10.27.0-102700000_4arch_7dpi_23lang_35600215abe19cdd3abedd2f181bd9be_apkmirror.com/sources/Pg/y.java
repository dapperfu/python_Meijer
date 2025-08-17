package Pg;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class y extends r {

    /* renamed from: d, reason: collision with root package name */
    static final int[] f25410d = {1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f25411e = {1, 1, 1, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f25412f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g, reason: collision with root package name */
    static final int[][] f25413g;

    /* renamed from: h, reason: collision with root package name */
    static final int[][] f25414h;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f25415a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final x f25416b = new x();

    /* renamed from: c, reason: collision with root package name */
    private final m f25417c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f25413g = iArr;
        int[][] iArr2 = new int[20][];
        f25414h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f25413g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f25414h[i10] = iArr4;
        }
    }

    static int[] n(Gg.a aVar, int i10, boolean z10, int[] iArr) throws NotFoundException {
        return o(aVar, i10, z10, iArr, new int[iArr.length]);
    }

    int[] k(Gg.a aVar, int i10) throws NotFoundException {
        return n(aVar, i10, false, f25410d);
    }

    protected abstract int l(Gg.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException;

    public com.google.zxing.m m(int i10, Gg.a aVar, int[] iArr, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strC;
        com.google.zxing.p pVar = map == null ? null : (com.google.zxing.p) map.get(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK);
        if (pVar != null) {
            pVar.a(new com.google.zxing.o((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f25415a;
        sb2.setLength(0);
        int iL = l(aVar, iArr, sb2);
        if (pVar != null) {
            pVar.a(new com.google.zxing.o(iL, i10));
        }
        int[] iArrK = k(aVar, iL);
        if (pVar != null) {
            pVar.a(new com.google.zxing.o((iArrK[0] + iArrK[1]) / 2.0f, i10));
        }
        int i11 = iArrK[1];
        int i12 = (i11 - iArrK[0]) + i11;
        if (i12 >= aVar.l() || !aVar.n(i11, i12, false)) {
            throw NotFoundException.a();
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw FormatException.a();
        }
        if (!h(string)) {
            throw ChecksumException.a();
        }
        com.google.zxing.a aVarQ = q();
        float f10 = i10;
        com.google.zxing.m mVar = new com.google.zxing.m(string, null, new com.google.zxing.o[]{new com.google.zxing.o((iArr[1] + iArr[0]) / 2.0f, f10), new com.google.zxing.o((iArrK[1] + iArrK[0]) / 2.0f, f10)}, aVarQ);
        try {
            com.google.zxing.m mVarA = this.f25416b.a(i10, aVar, iArrK[1]);
            mVar.h(com.google.zxing.n.UPC_EAN_EXTENSION, mVarA.f());
            mVar.g(mVarA.d());
            mVar.a(mVarA.e());
            length = mVarA.f().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(com.google.zxing.d.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            for (int i13 : iArr2) {
                if (length != i13) {
                }
            }
            throw NotFoundException.a();
        }
        if ((aVarQ == com.google.zxing.a.EAN_13 || aVarQ == com.google.zxing.a.UPC_A) && (strC = this.f25417c.c(string)) != null) {
            mVar.h(com.google.zxing.n.POSSIBLE_COUNTRY, strC);
        }
        mVar.h(com.google.zxing.n.SYMBOLOGY_IDENTIFIER, "]E" + (aVarQ == com.google.zxing.a.EAN_8 ? 4 : 0));
        return mVar;
    }

    abstract com.google.zxing.a q();

    static int[] p(Gg.a aVar) throws NotFoundException {
        int[] iArr = new int[f25410d.length];
        int[] iArrO = null;
        boolean zN = false;
        int i10 = 0;
        while (!zN) {
            int[] iArr2 = f25410d;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrO = o(aVar, i10, false, iArr2, iArr);
            int i11 = iArrO[0];
            int i12 = iArrO[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                zN = aVar.n(i13, i11, false);
            }
            i10 = i12;
        }
        return iArrO;
    }

    protected y() {
    }

    static boolean i(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        if (r(charSequence.subSequence(0, i10)) != Character.digit(charSequence.charAt(i10), 10)) {
            return false;
        }
        return true;
    }

    static int j(Gg.a aVar, int[] iArr, int i10, int[][] iArr2) throws NotFoundException {
        r.f(aVar, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float fE = r.e(iArr, iArr2[i12], 0.7f);
            if (fE < f10) {
                i11 = i12;
                f10 = fE;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw NotFoundException.a();
    }

    private static int[] o(Gg.a aVar, int i10, boolean z10, int[] iArr, int[] iArr2) throws NotFoundException {
        int iJ;
        int iL = aVar.l();
        if (z10) {
            iJ = aVar.k(i10);
        } else {
            iJ = aVar.j(i10);
        }
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = iJ;
        while (iJ < iL) {
            if (aVar.g(iJ) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 == length - 1) {
                    if (r.e(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, iJ};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            iJ++;
        }
        throw NotFoundException.a();
    }

    static int r(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int iCharAt = charSequence.charAt(i11) - '0';
            if (iCharAt >= 0 && iCharAt <= 9) {
                i10 += iCharAt;
            } else {
                throw FormatException.a();
            }
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int iCharAt2 = charSequence.charAt(i13) - '0';
            if (iCharAt2 >= 0 && iCharAt2 <= 9) {
                i12 += iCharAt2;
            } else {
                throw FormatException.a();
            }
        }
        return (1000 - i12) % 10;
    }

    @Override // Pg.r
    public com.google.zxing.m c(int i10, Gg.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return m(i10, aVar, p(aVar), map);
    }

    boolean h(String str) throws FormatException {
        return i(str);
    }
}
