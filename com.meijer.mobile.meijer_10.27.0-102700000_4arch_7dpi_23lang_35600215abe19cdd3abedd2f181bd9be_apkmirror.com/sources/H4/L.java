package H4;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* loaded from: classes4.dex */
class L extends J {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f12095g = true;

    static class a {
        static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    @Override // H4.F
    @SuppressLint({"NewApi"})
    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f12095g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f12095g = false;
            }
        }
    }

    L() {
    }
}
