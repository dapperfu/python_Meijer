package fsimpl;

/* loaded from: classes14.dex */
public final class cE extends gm {
    public static int a(gh ghVar, byte[] bArr) {
        return ghVar.a(bArr);
    }

    public static int a(gh ghVar, int[] iArr) {
        ghVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ghVar.d(iArr[length]);
        }
        return ghVar.b();
    }

    public static void a(gh ghVar) {
        ghVar.f(10);
    }

    public static void a(gh ghVar, byte b10) {
        ghVar.a(9, b10, 0);
    }

    public static void a(gh ghVar, int i10) {
        ghVar.c(0, i10, 0);
    }

    public static int b(gh ghVar) {
        return ghVar.d();
    }

    public static void b(gh ghVar, int i10) {
        ghVar.c(1, i10, 0);
    }

    public static void c(gh ghVar, int i10) {
        ghVar.c(2, i10, 0);
    }

    public static void d(gh ghVar, int i10) {
        ghVar.c(3, i10, 0);
    }

    public static void e(gh ghVar, int i10) {
        ghVar.c(4, i10, 0);
    }

    public static void f(gh ghVar, int i10) {
        ghVar.c(5, i10, 0);
    }

    public static void g(gh ghVar, int i10) {
        ghVar.c(6, i10, 0);
    }

    public static void h(gh ghVar, int i10) {
        ghVar.c(7, i10, 0);
    }

    public static void i(gh ghVar, int i10) {
        ghVar.c(8, i10, 0);
    }
}
