package I4;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes4.dex */
class H extends F {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f14156d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f14157e = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // I4.F
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f14156d) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f14156d = false;
            }
        }
    }

    @Override // I4.F
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f14157e) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f14157e = false;
            }
        }
    }

    H() {
    }
}
