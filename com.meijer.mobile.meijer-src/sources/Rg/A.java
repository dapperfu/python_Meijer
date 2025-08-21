package Rg;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* loaded from: classes8.dex */
public final class A extends y {

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f32552j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k, reason: collision with root package name */
    static final int[][] f32553k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i, reason: collision with root package name */
    private final int[] f32554i = new int[4];

    public static String s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    private static void t(StringBuilder sb2, int i10) throws NotFoundException {
        for (int i11 = 0; i11 <= 1; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (i10 == f32553k[i11][i12]) {
                    sb2.insert(0, (char) (i11 + 48));
                    sb2.append((char) (i12 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.a();
    }

    @Override // Rg.y
    protected int[] k(Ig.a aVar, int i10) throws NotFoundException {
        return y.n(aVar, i10, true, f32552j);
    }

    @Override // Rg.y
    protected int l(Ig.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f32554i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < iL; i12++) {
            int iJ = y.j(aVar, iArr2, i10, y.f32628h);
            sb2.append((char) ((iJ % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (iJ >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        t(sb2, i11);
        return i10;
    }

    @Override // Rg.y
    com.google.zxing.a q() {
        return com.google.zxing.a.UPC_E;
    }

    @Override // Rg.y
    protected boolean h(String str) throws FormatException {
        return super.h(s(str));
    }
}
