package H4;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.fullstory.FS;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
class F {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f12089a = true;

    /* renamed from: b, reason: collision with root package name */
    private static Field f12090b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f12091c;

    public void a(View view) {
    }

    public void c(View view) {
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void d(View view, int i10, int i11, int i12, int i13) {
        throw null;
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f12089a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f12089a = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void e(View view, float f10) {
        if (f12089a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f12089a = false;
            }
        }
        view.setAlpha(f10);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f12091c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f12090b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                FS.log_i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f12091c = true;
        }
        Field field = f12090b;
        if (field != null) {
            try {
                f12090b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    F() {
    }
}
