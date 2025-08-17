package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final c f53923a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final View f53924a;

        @Override // androidx.core.view.e.c
        void a() {
            View view = this.f53924a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f53924a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.e.c
        void b() {
            final View viewFindViewById = this.f53924a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f53924a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.d
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }

        a(View view) {
            this.f53924a = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private View f53925b;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsetsController f53926c;

        b(View view) {
            super(view);
            this.f53925b = view;
        }

        @Override // androidx.core.view.e.a, androidx.core.view.e.c
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f53926c;
            if (windowInsetsController == null) {
                View view2 = this.f53925b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.f
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f53925b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f53925b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.e.a, androidx.core.view.e.c
        void b() {
            View view = this.f53925b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f53926c;
            if (windowInsetsController == null) {
                View view2 = this.f53925b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f53926c = windowInsetsController;
        }
    }

    public e(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f53923a = new b(view);
        } else {
            this.f53923a = new a(view);
        }
    }

    private static class c {
        void a() {
            throw null;
        }

        void b() {
            throw null;
        }

        c() {
        }
    }

    public void a() {
        this.f53923a.a();
    }

    public void b() {
        this.f53923a.b();
    }

    @Deprecated
    e(WindowInsetsController windowInsetsController) {
        this.f53923a = new b(windowInsetsController);
    }
}
