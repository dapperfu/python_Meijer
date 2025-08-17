package fsimpl;

/* loaded from: classes14.dex */
public final class cW extends gm {
    public static int a(gh ghVar) {
        return ghVar.d();
    }

    public static int a(gh ghVar, int i10) {
        ghVar.f(1);
        b(ghVar, i10);
        return a(ghVar);
    }

    public static int a(gh ghVar, int[] iArr) {
        ghVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ghVar.d(iArr[length]);
        }
        return ghVar.b();
    }

    public static void b(gh ghVar, int i10) {
        ghVar.c(0, i10, 0);
    }
}
