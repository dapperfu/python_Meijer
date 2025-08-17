package fsimpl;

/* renamed from: fsimpl.dk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14040dk extends gm {
    public static int a(gh ghVar) {
        return ghVar.d();
    }

    public static int a(gh ghVar, int i10, int i11, int i12) {
        ghVar.f(3);
        e(ghVar, i12);
        c(ghVar, i11);
        a(ghVar, i10);
        return a(ghVar);
    }

    public static int a(gh ghVar, byte[] bArr) {
        return ghVar.a(bArr);
    }

    public static int a(gh ghVar, float[] fArr) {
        ghVar.a(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            ghVar.b(fArr[length]);
        }
        return ghVar.b();
    }

    public static void a(gh ghVar, int i10) {
        ghVar.c(0, i10, 0);
    }

    public static void b(gh ghVar, int i10) {
        ghVar.a(1, i10, 1);
    }

    public static void c(gh ghVar, int i10) {
        ghVar.c(1, i10, 0);
    }

    public static void d(gh ghVar, int i10) {
        ghVar.a(4, i10, 4);
    }

    public static void e(gh ghVar, int i10) {
        ghVar.c(2, i10, 0);
    }

    public static void f(gh ghVar, int i10) {
        ghVar.a(4, i10, 4);
    }
}
