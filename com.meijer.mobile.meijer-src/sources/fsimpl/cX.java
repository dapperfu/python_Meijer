package fsimpl;

/* loaded from: classes15.dex */
public final class cX extends gm {
    public static int a(gh ghVar) {
        return ghVar.d();
    }

    public static int a(gh ghVar, int i10, int i11) {
        ghVar.f(2);
        b(ghVar, i11);
        a(ghVar, i10);
        return a(ghVar);
    }

    public static int a(gh ghVar, int[] iArr) {
        ghVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ghVar.d(iArr[length]);
        }
        return ghVar.b();
    }

    public static void a(gh ghVar, int i10) {
        ghVar.c(0, i10, 0);
    }

    public static int b(gh ghVar, int[] iArr) {
        ghVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ghVar.d(iArr[length]);
        }
        return ghVar.b();
    }

    public static void b(gh ghVar, int i10) {
        ghVar.c(1, i10, 0);
    }
}
