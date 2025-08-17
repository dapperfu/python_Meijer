package fsimpl;

/* renamed from: fsimpl.dw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14051dw extends gm {
    public static int a(gh ghVar, float[] fArr) {
        ghVar.a(4, fArr.length, 4);
        for (int length = fArr.length - 1; length >= 0; length--) {
            ghVar.b(fArr[length]);
        }
        return ghVar.b();
    }

    public static int a(gh ghVar, int[] iArr) {
        ghVar.a(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            ghVar.c(iArr[length]);
        }
        return ghVar.b();
    }

    public static void a(gh ghVar) {
        ghVar.f(7);
    }

    public static void a(gh ghVar, byte b10) {
        ghVar.a(0, b10, 0);
    }

    public static void a(gh ghVar, float f10) {
        ghVar.a(3, f10, 0.0d);
    }

    public static void a(gh ghVar, int i10) {
        ghVar.d(1, i10, 0);
    }

    public static int b(gh ghVar) {
        return ghVar.d();
    }

    public static void b(gh ghVar, byte b10) {
        ghVar.a(6, b10, 0);
    }

    public static void b(gh ghVar, int i10) {
        ghVar.d(2, i10, 0);
    }

    public static void c(gh ghVar, int i10) {
        ghVar.c(4, i10, 0);
    }

    public static void d(gh ghVar, int i10) {
        ghVar.a(4, i10, 4);
    }

    public static void e(gh ghVar, int i10) {
        ghVar.c(5, i10, 0);
    }
}
