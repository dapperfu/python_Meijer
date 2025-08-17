package androidx.core.view;

import Z.n0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final g f54000a;

    private static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f54001a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.view.e f54002b;

        private void g(int i10) {
            if (i10 == 1) {
                h(4);
                i(1024);
            } else if (i10 == 2) {
                h(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f54002b.b();
            }
        }

        @Override // androidx.core.view.k.g
        void d(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    g(i11);
                }
            }
        }

        protected void e(int i10) {
            View decorView = this.f54001a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f54001a.addFlags(i10);
        }

        protected void h(int i10) {
            View decorView = this.f54001a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void i(int i10) {
            this.f54001a.clearFlags(i10);
        }

        a(Window window, androidx.core.view.e eVar) {
            this.f54001a = window;
            this.f54002b = eVar;
        }
    }

    private static class b extends a {
        @Override // androidx.core.view.k.g
        public boolean a() {
            return (this.f54001a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.k.g
        public void c(boolean z10) {
            if (!z10) {
                h(8192);
                return;
            }
            i(67108864);
            f(Integer.MIN_VALUE);
            e(8192);
        }

        b(Window window, androidx.core.view.e eVar) {
            super(window, eVar);
        }
    }

    private static class c extends b {
        @Override // androidx.core.view.k.g
        public void b(boolean z10) {
            if (!z10) {
                h(16);
                return;
            }
            i(134217728);
            f(Integer.MIN_VALUE);
            e(16);
        }

        c(Window window, androidx.core.view.e eVar) {
            super(window, eVar);
        }
    }

    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        final k f54003a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f54004b;

        /* renamed from: c, reason: collision with root package name */
        final androidx.core.view.e f54005c;

        /* renamed from: d, reason: collision with root package name */
        private final n0<Object, WindowInsetsController.OnControllableInsetsChangedListener> f54006d;

        /* renamed from: e, reason: collision with root package name */
        protected Window f54007e;

        d(Window window, k kVar, androidx.core.view.e eVar) {
            this(window.getInsetsController(), kVar, eVar);
            this.f54007e = window;
        }

        @Override // androidx.core.view.k.g
        public boolean a() {
            this.f54004b.setSystemBarsAppearance(0, 0);
            return (this.f54004b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.k.g
        public void b(boolean z10) {
            if (z10) {
                if (this.f54007e != null) {
                    e(16);
                }
                this.f54004b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f54007e != null) {
                    f(16);
                }
                this.f54004b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.k.g
        public void c(boolean z10) {
            if (z10) {
                if (this.f54007e != null) {
                    e(8192);
                }
                this.f54004b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f54007e != null) {
                    f(8192);
                }
                this.f54004b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.k.g
        void d(int i10) {
            if ((i10 & 8) != 0) {
                this.f54005c.b();
            }
            this.f54004b.show(i10 & (-9));
        }

        protected void e(int i10) {
            View decorView = this.f54007e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            View decorView = this.f54007e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, k kVar, androidx.core.view.e eVar) {
            this.f54006d = new n0<>();
            this.f54004b = windowInsetsController;
            this.f54003a = kVar;
            this.f54005c = eVar;
        }
    }

    private static class e extends d {
        e(Window window, k kVar, androidx.core.view.e eVar) {
            super(window, kVar, eVar);
        }

        e(WindowInsetsController windowInsetsController, k kVar, androidx.core.view.e eVar) {
            super(windowInsetsController, kVar, eVar);
        }
    }

    private static class f extends e {
        f(Window window, k kVar, androidx.core.view.e eVar) {
            super(window, kVar, eVar);
        }

        f(WindowInsetsController windowInsetsController, k kVar, androidx.core.view.e eVar) {
            super(windowInsetsController, kVar, eVar);
        }

        @Override // androidx.core.view.k.d, androidx.core.view.k.g
        public boolean a() {
            return (this.f54004b.getSystemBarsAppearance() & 8) != 0;
        }
    }

    @Deprecated
    private k(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f54000a = new f(windowInsetsController, this, new androidx.core.view.e(windowInsetsController));
        } else {
            this.f54000a = new d(windowInsetsController, this, new androidx.core.view.e(windowInsetsController));
        }
    }

    private static class g {
        public boolean a() {
            throw null;
        }

        public void b(boolean z10) {
        }

        public void c(boolean z10) {
            throw null;
        }

        void d(int i10) {
            throw null;
        }

        g() {
        }
    }

    @Deprecated
    public static k e(WindowInsetsController windowInsetsController) {
        return new k(windowInsetsController);
    }

    public boolean a() {
        return this.f54000a.a();
    }

    public void b(boolean z10) {
        this.f54000a.b(z10);
    }

    public void c(boolean z10) {
        this.f54000a.c(z10);
    }

    public void d(int i10) {
        this.f54000a.d(i10);
    }

    public k(Window window, View view) {
        androidx.core.view.e eVar = new androidx.core.view.e(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f54000a = new f(window, this, eVar);
            return;
        }
        if (i10 >= 30) {
            this.f54000a = new d(window, this, eVar);
        } else if (i10 >= 26) {
            this.f54000a = new c(window, eVar);
        } else {
            this.f54000a = new b(window, eVar);
        }
    }
}
