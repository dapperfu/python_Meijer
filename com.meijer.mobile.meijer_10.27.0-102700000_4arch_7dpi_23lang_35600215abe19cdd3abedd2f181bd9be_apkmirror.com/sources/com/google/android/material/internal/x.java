package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import p2.G;

/* loaded from: classes4.dex */
public class x {

    class a implements G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f87275a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f87276b;

        a(c cVar, d dVar) {
            this.f87275a = cVar;
            this.f87276b = dVar;
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            return this.f87275a.a(view, jVar, new d(this.f87276b));
        }
    }

    public interface c {
        androidx.core.view.j a(View view, androidx.core.view.j jVar, d dVar);
    }

    public static ViewGroup f(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static PorterDuff.Mode l(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.j0(view);
        }
    }

    public static void b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void c(View view, c cVar) {
        ViewCompat.A0(view, new a(cVar, new d(ViewCompat.E(view), view.getPaddingTop(), ViewCompat.D(view), view.getPaddingBottom())));
        o(view);
    }

    public static v i(View view) {
        if (view == null) {
            return null;
        }
        return new u(view);
    }

    public static void m(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            n(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void q(View view, boolean z10) {
        androidx.core.view.k kVarK;
        if (!z10 || (kVarK = ViewCompat.K(view)) == null) {
            h(view).showSoftInput(view, 1);
        } else {
            kVarK.d(j.n.d());
        }
    }

    public static float d(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer e(View view) {
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    public static v g(View view) {
        return i(f(view));
    }

    private static InputMethodManager h(View view) {
        return (InputMethodManager) Z1.b.j(view.getContext(), InputMethodManager.class);
    }

    public static float j(View view) {
        float fU = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fU += ViewCompat.u((View) parent);
        }
        return fU;
    }

    public static boolean k(View view) {
        if (ViewCompat.z(view) == 1) {
            return true;
        }
        return false;
    }

    public static void n(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void o(View view) {
        if (ViewCompat.R(view)) {
            ViewCompat.j0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void p(final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.w
            @Override // java.lang.Runnable
            public final void run() {
                x.q(view, z10);
            }
        });
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f87277a;

        /* renamed from: b, reason: collision with root package name */
        public int f87278b;

        /* renamed from: c, reason: collision with root package name */
        public int f87279c;

        /* renamed from: d, reason: collision with root package name */
        public int f87280d;

        public d(int i10, int i11, int i12, int i13) {
            this.f87277a = i10;
            this.f87278b = i11;
            this.f87279c = i12;
            this.f87280d = i13;
        }

        public d(d dVar) {
            this.f87277a = dVar.f87277a;
            this.f87278b = dVar.f87278b;
            this.f87279c = dVar.f87279c;
            this.f87280d = dVar.f87280d;
        }
    }
}
