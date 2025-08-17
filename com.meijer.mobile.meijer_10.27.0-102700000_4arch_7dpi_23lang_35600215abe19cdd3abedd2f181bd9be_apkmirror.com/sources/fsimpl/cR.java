package fsimpl;

/* loaded from: classes14.dex */
public final class cR extends gm {
    public static int a(gh ghVar) {
        return ghVar.d();
    }

    public static int a(gh ghVar, int i10, int i11, boolean z10, int i12) {
        ghVar.f(4);
        c(ghVar, i12);
        b(ghVar, i11);
        a(ghVar, i10);
        a(ghVar, z10);
        return a(ghVar);
    }

    public static void a(gh ghVar, int i10) {
        ghVar.c(0, i10, 0);
    }

    public static void a(gh ghVar, boolean z10) {
        ghVar.a(2, z10, false);
    }

    public static void b(gh ghVar, int i10) {
        ghVar.c(1, i10, 0);
    }

    public static void c(gh ghVar, int i10) {
        ghVar.c(3, i10, 0);
    }
}
