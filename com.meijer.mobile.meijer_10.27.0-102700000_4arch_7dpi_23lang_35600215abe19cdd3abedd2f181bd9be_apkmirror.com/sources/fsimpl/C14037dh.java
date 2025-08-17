package fsimpl;

/* renamed from: fsimpl.dh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14037dh extends gm {
    public static int a(gh ghVar) {
        return ghVar.d();
    }

    public static int a(gh ghVar, int i10, int i11, int i12) {
        ghVar.f(3);
        c(ghVar, i12);
        b(ghVar, i11);
        a(ghVar, i10);
        return a(ghVar);
    }

    public static int a(gh ghVar, float[] fArr) {
        ghVar.a(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            ghVar.b(fArr[length]);
        }
        return ghVar.b();
    }

    public static void a(gh ghVar, int i10) {
        ghVar.b(0, i10, 0);
    }

    public static void b(gh ghVar, int i10) {
        ghVar.c(1, i10, 0);
    }

    public static void c(gh ghVar, int i10) {
        ghVar.c(2, i10, 0);
    }
}
