package H4;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
class B {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f12085a = true;

    static class a {
        static void a(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    @SuppressLint({"NewApi"})
    private static void a(ViewGroup viewGroup, boolean z10) {
        if (f12085a) {
            try {
                a.a(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f12085a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(viewGroup, z10);
        } else {
            a(viewGroup, z10);
        }
    }
}
