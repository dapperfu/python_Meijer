package jf;

/* loaded from: classes8.dex */
final class b {
    static int a(String str, int i10) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " (" + i10 + ") must be > 0");
    }

    static void b(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
