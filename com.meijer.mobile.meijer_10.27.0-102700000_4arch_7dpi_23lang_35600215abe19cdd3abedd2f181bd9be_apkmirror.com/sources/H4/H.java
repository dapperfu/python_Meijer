package H4;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes4.dex */
class H extends F {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f12092d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f12093e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // H4.F
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f12092d) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f12092d = false;
            }
        }
    }

    @Override // H4.F
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f12093e) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f12093e = false;
            }
        }
    }

    H() {
    }
}
