package hf;

import gf.C14359f;

/* renamed from: hf.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C14517c {
    static int a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    static void b(boolean z10) {
        C14359f.l(z10, "no calls to next() since the last call to remove()");
    }
}
