package I4;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes4.dex */
class J extends H {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f14158f = true;

    static class a {
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    @Override // I4.F
    @SuppressLint({"NewApi"})
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f14158f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f14158f = false;
            }
        }
    }

    J() {
    }
}
