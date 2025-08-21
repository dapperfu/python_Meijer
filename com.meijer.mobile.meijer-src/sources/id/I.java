package id;

/* loaded from: classes4.dex */
final class I {
    static int a(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }
}
