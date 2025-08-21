package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.fullstory.FS;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class Y {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f47170a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f47171b;

    /* renamed from: c, reason: collision with root package name */
    static final boolean f47172c;

    static class a {
        static void a(View view, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f47172c = Build.VERSION.SDK_INT >= 27;
    }

    public static void a(View view, Rect rect, Rect rect2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(view, rect, rect2);
            return;
        }
        if (!f47170a) {
            f47170a = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f47171b = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f47171b.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                FS.log_d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        Method method = f47171b;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e10) {
                FS.log_d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void c(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException e10) {
            FS.log_d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (NoSuchMethodException unused) {
            FS.log_d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            FS.log_d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
    }

    public static boolean b(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
