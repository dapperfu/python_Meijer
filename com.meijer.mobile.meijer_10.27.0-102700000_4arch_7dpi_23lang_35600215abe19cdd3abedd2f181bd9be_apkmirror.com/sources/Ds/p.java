package Ds;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes11.dex */
public class p {
    public static void e(View view) {
        f(view, 2);
    }

    public static void d(Window window) {
        if (window == null || window.getDecorView() == null) {
            return;
        }
        c(window.getDecorView());
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static void c(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(final View view, final int i10) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager.isActive(view)) {
            inputMethodManager.showSoftInput(view, 0);
        } else if (view.isFocused() && i10 > 0) {
            view.post(new Runnable() { // from class: Ds.o
                @Override // java.lang.Runnable
                public final void run() {
                    p.f(view, i10 - 1);
                }
            });
        }
    }
}
