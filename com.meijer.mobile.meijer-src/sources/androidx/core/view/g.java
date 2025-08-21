package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final WindowInsets f54152a = j.f54193b.A();

    /* renamed from: b, reason: collision with root package name */
    static boolean f54153b = false;

    static class a {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    public static /* synthetic */ WindowInsets a(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        windowInsetsArr[0] = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets) : view.onApplyWindowInsets(windowInsets);
        return f54152a;
    }

    static WindowInsets b(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(Y1.e.f42796M);
        Object tag2 = view.getTag(Y1.e.f42803T);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        final WindowInsets[] windowInsetsArr = new WindowInsets[1];
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: p2.b0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return androidx.core.view.g.a(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(Y1.e.f42795L);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b(viewGroup.getChildAt(i10), windowInsetsArr[0]);
            }
        }
        return windowInsetsArr[0];
    }

    public static boolean c(ViewGroup viewGroup) {
        return a.a(viewGroup);
    }
}
