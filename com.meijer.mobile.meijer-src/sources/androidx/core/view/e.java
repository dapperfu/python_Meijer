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
    private final c f54147a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final View f54148a;

        @Override // androidx.core.view.e.c
        void a() {
            View view = this.f54148a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f54148a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.e.c
        void b() {
            final View viewFindViewById = this.f54148a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f54148a.getRootView().findViewById(R.id.content);
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
            this.f54148a = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        private View f54149b;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsetsController f54150c;

        b(View view) {
            super(view);
            this.f54149b = view;
        }

        @Override // androidx.core.view.e.a, androidx.core.view.e.c
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f54150c;
            if (windowInsetsController == null) {
                View view2 = this.f54149b;
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
            if (!atomicBoolean.get() && (view = this.f54149b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f54149b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.e.a, androidx.core.view.e.c
        void b() {
            View view = this.f54149b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f54150c;
            if (windowInsetsController == null) {
                View view2 = this.f54149b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f54150c = windowInsetsController;
        }
    }

    public e(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f54147a = new b(view);
        } else {
            this.f54147a = new a(view);
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
        this.f54147a.a();
    }

    public void b() {
        this.f54147a.b();
    }

    @Deprecated
    e(WindowInsetsController windowInsetsController) {
        this.f54147a = new b(windowInsetsController);
    }
}
