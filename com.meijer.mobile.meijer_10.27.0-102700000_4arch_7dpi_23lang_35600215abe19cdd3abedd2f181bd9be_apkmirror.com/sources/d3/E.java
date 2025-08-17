package d3;

/* loaded from: classes.dex */
public final class E {
    public static int a(int i10, int i11) {
        for (int i12 = 1; i12 <= 2; i12++) {
            int i13 = (i10 + i12) % 3;
            if (b(i13, i11)) {
                return i13;
            }
        }
        return i10;
    }

    public static boolean b(int i10, int i11) {
        if (i10 != 0) {
            return i10 != 1 ? i10 == 2 && (i11 & 2) != 0 : (i11 & 1) != 0;
        }
        return true;
    }
}
