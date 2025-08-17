package ff;

import ef.C13655f;

/* renamed from: ff.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C13887c {
    static int a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    static void b(boolean z10) {
        C13655f.l(z10, "no calls to next() since the last call to remove()");
    }
}
