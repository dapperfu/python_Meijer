package fsimpl;

/* loaded from: classes15.dex */
public final class cS extends gm {
    public static int a(gh ghVar) {
        return ghVar.d();
    }

    public static int a(gh ghVar, byte b10, int i10) {
        ghVar.f(2);
        a(ghVar, i10);
        a(ghVar, b10);
        return a(ghVar);
    }

    public static int a(gh ghVar, int[] iArr) {
        ghVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ghVar.d(iArr[length]);
        }
        return ghVar.b();
    }

    public static void a(gh ghVar, byte b10) {
        ghVar.a(0, b10, 0);
    }

    public static void a(gh ghVar, int i10) {
        ghVar.c(1, i10, 0);
    }
}
