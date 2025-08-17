package u6;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import n6.C15781a;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final PointF f162719a = new PointF();

    static int f(float f10, float f11) {
        return g((int) f10, (int) f11);
    }

    public static float i(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int j(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static boolean d(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    private static int e(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    private static int g(int i10, int i11) {
        return i10 - (i11 * e(i10, i11));
    }

    public static void h(p6.o oVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFB = oVar.b();
        path.moveTo(pointFB.x, pointFB.y);
        f162719a.set(pointFB.x, pointFB.y);
        int i10 = 0;
        while (i10 < oVar.a().size()) {
            C15781a c15781a = oVar.a().get(i10);
            PointF pointFA = c15781a.a();
            PointF pointFB2 = c15781a.b();
            PointF pointFC = c15781a.c();
            PointF pointF = f162719a;
            if (pointFA.equals(pointF) && pointFB2.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFA.x, pointFA.y, pointFB2.x, pointFB2.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (oVar.d()) {
            path3.close();
        }
    }

    public static void k(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2, i6.k kVar) {
        if (eVar.c(kVar.getName(), i10)) {
            list.add(eVar2.a(kVar.getName()).i(kVar));
        }
    }
}
