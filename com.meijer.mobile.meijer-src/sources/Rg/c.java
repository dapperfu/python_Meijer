package Rg;

import com.google.zxing.NotFoundException;

/* loaded from: classes8.dex */
public final class c extends r {

    /* renamed from: a, reason: collision with root package name */
    static final int[][] f32565a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[FALL_THROUGH, PHI: r20 r21
      0x00c2: PHI (r20v14 boolean) = 
      (r20v5 boolean)
      (r20v5 boolean)
      (r20v5 boolean)
      (r20v5 boolean)
      (r20v15 boolean)
      (r20v15 boolean)
      (r20v15 boolean)
      (r20v15 boolean)
     binds: [B:77:0x012a, B:85:0x0140, B:89:0x014c, B:88:0x0148, B:43:0x00bf, B:51:0x00d6, B:55:0x00e2, B:54:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r21v10 int) = (r21v1 int), (r21v6 int), (r21v6 int), (r21v6 int), (r21v1 int), (r21v12 int), (r21v12 int), (r21v12 int) binds: [B:77:0x012a, B:85:0x0140, B:89:0x014c, B:88:0x0148, B:43:0x00bf, B:51:0x00d6, B:55:0x00e2, B:54:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4 A[PHI: r20
      0x00f4: PHI (r20v11 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:96:0x015d, B:60:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8 A[PHI: r20
      0x00f8: PHI (r20v10 boolean) = (r20v5 boolean), (r20v5 boolean), (r20v15 boolean), (r20v15 boolean) binds: [B:95:0x015b, B:96:0x015d, B:59:0x00f0, B:60:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff A[PHI: r20
      0x00ff: PHI (r20v9 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:77:0x012a, B:43:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105 A[PHI: r20
      0x0105: PHI (r20v8 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:77:0x012a, B:43:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109 A[PHI: r20
      0x0109: PHI (r20v7 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:76:0x0128, B:42:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Rg.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.zxing.m c(int r28, Ig.a r29, java.util.Map<com.google.zxing.d, ?> r30) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rg.c.c(int, Ig.a, java.util.Map):com.google.zxing.m");
    }

    private static int h(Ig.a aVar, int[] iArr, int i10) throws NotFoundException {
        r.f(aVar, i10, iArr);
        float f10 = 0.25f;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[][] iArr2 = f32565a;
            if (i12 >= iArr2.length) {
                break;
            }
            float fE = r.e(iArr, iArr2[i12], 0.7f);
            if (fE < f10) {
                i11 = i12;
                f10 = fE;
            }
            i12++;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw NotFoundException.a();
    }

    private static int[] i(Ig.a aVar) throws NotFoundException {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        int[] iArr = new int[6];
        boolean z10 = false;
        int i10 = 0;
        int i11 = iJ;
        while (iJ < iL) {
            if (aVar.g(iJ) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == 5) {
                    int i12 = -1;
                    float f10 = 0.25f;
                    for (int i13 = 103; i13 <= 105; i13++) {
                        float fE = r.e(iArr, f32565a[i13], 0.7f);
                        if (fE < f10) {
                            i12 = i13;
                            f10 = fE;
                        }
                    }
                    if (i12 >= 0 && aVar.n(Math.max(0, i11 - ((iJ - i11) / 2)), i11, false)) {
                        return new int[]{i11, iJ, i12};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i14 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i14);
                    iArr[i14] = 0;
                    iArr[i10] = 0;
                    i10--;
                } else {
                    i10++;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            iJ++;
        }
        throw NotFoundException.a();
    }
}
