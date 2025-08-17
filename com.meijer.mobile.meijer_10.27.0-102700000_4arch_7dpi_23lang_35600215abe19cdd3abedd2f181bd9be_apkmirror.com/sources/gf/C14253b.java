package gf;

/* renamed from: gf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14253b {
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
