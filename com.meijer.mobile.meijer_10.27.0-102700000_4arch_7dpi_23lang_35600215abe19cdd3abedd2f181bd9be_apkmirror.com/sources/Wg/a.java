package Wg;

import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f38657a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f38658b = {6, 2, 7, 3};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f38659c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f38660d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f38661e = {0, 180, 270, 90};

    private static void b(o[] oVarArr, o[] oVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            oVarArr[iArr[i10]] = oVarArr2[i10];
        }
    }

    private static int[] e(Gg.b bVar, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.f(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (bVar.f(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else {
                    if (h(iArr2, iArr) < 0.42f) {
                        return new int[]{i15, i10};
                    }
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || h(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    private static o[] f(Gg.b bVar, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        boolean z10;
        int[] iArrE;
        o[] oVarArr = new o[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i16 = i12;
        while (true) {
            if (i16 >= i10) {
                i15 = i16;
                z10 = false;
                break;
            }
            int[] iArrE2 = e(bVar, i13, i16, i11, iArr2, iArr3);
            if (iArrE2 != null) {
                int[] iArr4 = iArrE2;
                while (true) {
                    i15 = i16;
                    if (i15 <= 0 || (iArrE = e(bVar, i13, i15 - 1, i11, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = iArrE;
                }
                float f10 = i15;
                oVarArr[0] = new o(iArr4[0], f10);
                oVarArr[1] = new o(iArr4[1], f10);
                z10 = true;
            } else {
                i16 += 5;
                iArr2 = iArr;
            }
        }
        int i17 = i15 + 1;
        if (z10) {
            int[] iArr5 = {(int) oVarArr[0].c(), (int) oVarArr[1].c()};
            int i18 = i17;
            int i19 = 0;
            while (i18 < i10) {
                int[] iArrE3 = e(bVar, iArr5[0], i18, i11, iArr, iArr3);
                if (iArrE3 != null && Math.abs(iArr5[0] - iArrE3[0]) < 5 && Math.abs(iArr5[1] - iArrE3[1]) < 5) {
                    iArr5 = iArrE3;
                    i19 = 0;
                } else {
                    if (i19 > 25) {
                        break;
                    }
                    i19++;
                }
                i18++;
            }
            i17 = i18 - (i19 + 1);
            float f11 = i17;
            oVarArr[2] = new o(iArr5[0], f11);
            oVarArr[3] = new o(iArr5[1], f11);
        }
        if (i17 - i15 < i14) {
            Arrays.fill(oVarArr, (Object) null);
        }
        return oVarArr;
    }

    private static float h(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i10;
        float f11 = f10 / i11;
        float f12 = 0.8f * f11;
        float f13 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f14 = iArr2[i13] * f11;
            float f15 = iArr[i13];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }

    private static Gg.b a(Gg.b bVar, int i10) {
        if (i10 % 360 == 0) {
            return bVar;
        }
        Gg.b bVarClone = bVar.clone();
        bVarClone.n(i10);
        return bVarClone;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r3.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r4 = (com.google.zxing.o[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r7 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r4 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.d());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.google.zxing.o[]> d(boolean r8, Gg.b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            int r5 = r9.j()
            if (r2 >= r5) goto L7a
            com.google.zxing.o[] r3 = g(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L50
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L50
            if (r4 != 0) goto L20
            goto L7a
        L20:
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            com.google.zxing.o[] r4 = (com.google.zxing.o[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3e
            float r2 = (float) r2
            float r7 = r7.d()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3e:
            r4 = r4[r5]
            if (r4 == 0) goto L24
            float r4 = r4.d()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L24
        L4c:
            int r2 = r2 + 5
            r3 = r1
            goto L8
        L50:
            r0.add(r3)
            if (r8 != 0) goto L56
            goto L7a
        L56:
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L69
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.d()
        L66:
            int r2 = (int) r2
            r3 = r4
            goto L78
        L69:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.c()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.d()
            goto L66
        L78:
            r4 = r6
            goto L9
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.a.d(boolean, Gg.b):java.util.List");
    }

    public static b c(c cVar, Map<d, ?> map, boolean z10) throws NotFoundException {
        Gg.b bVarA = cVar.a();
        for (int i10 : f38661e) {
            Gg.b bVarA2 = a(bVarA, i10);
            List<o[]> listD = d(z10, bVarA2);
            if (!listD.isEmpty()) {
                return new b(bVarA2, listD, i10);
            }
        }
        return new b(bVarA, new ArrayList(), 0);
    }

    private static o[] g(Gg.b bVar, int i10, int i11) {
        int iJ = bVar.j();
        int iM = bVar.m();
        o[] oVarArr = new o[8];
        int iMax = 10;
        int i12 = i10;
        int i13 = i11;
        b(oVarArr, f(bVar, iJ, iM, i12, i13, 10, f38659c), f38657a);
        o oVar = oVarArr[4];
        if (oVar != null) {
            int iC = (int) oVar.c();
            int iD = (int) oVarArr[4].d();
            if (oVarArr[5] != null) {
                iMax = (int) Math.max((((int) r8.d()) - iD) * 0.5f, 10.0f);
            }
            i12 = iD;
            i13 = iC;
        }
        b(oVarArr, f(bVar, iJ, iM, i12, i13, iMax, f38660d), f38658b);
        return oVarArr;
    }
}
