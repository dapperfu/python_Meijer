package Rg;

import java.util.Collection;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class o extends s {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f32606b = {1, 1, 1, 1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f32607c = {3, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f32608d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // Rg.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.ITF);
    }

    @Override // Rg.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                s.c(str);
                boolean[] zArr = new boolean[(length * 9) + 9];
                int iB = s.b(zArr, 0, f32606b, true);
                for (int i10 = 0; i10 < length; i10 += 2) {
                    int iDigit = Character.digit(str.charAt(i10), 10);
                    int iDigit2 = Character.digit(str.charAt(i10 + 1), 10);
                    int[] iArr = new int[10];
                    for (int i11 = 0; i11 < 5; i11++) {
                        int i12 = i11 * 2;
                        int[][] iArr2 = f32608d;
                        iArr[i12] = iArr2[iDigit][i11];
                        iArr[i12 + 1] = iArr2[iDigit2][i11];
                    }
                    iB += s.b(zArr, iB, iArr, true);
                }
                s.b(zArr, iB, f32607c, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
