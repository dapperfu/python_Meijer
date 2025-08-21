package pe;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.view.C5756b;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final d f156351a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16420b f156352b;

    /* renamed from: c, reason: collision with root package name */
    private final View f156353c;

    private static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private OnBackInvokedCallback f156354a;

        private b() {
        }

        @Override // pe.c.d
        public void b(InterfaceC16420b interfaceC16420b, View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f156354a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(interfaceC16420b);
                this.f156354a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        boolean d() {
            return this.f156354a != null;
        }

        @Override // pe.c.d
        public void a(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f156354a);
                this.f156354a = null;
            }
        }

        OnBackInvokedCallback c(final InterfaceC16420b interfaceC16420b) {
            Objects.requireNonNull(interfaceC16420b);
            return new OnBackInvokedCallback() { // from class: pe.e
                public final void onBackInvoked() {
                    interfaceC16420b.d();
                }
            };
        }
    }

    /* renamed from: pe.c$c, reason: collision with other inner class name */
    private static class C2422c extends b {

        /* renamed from: pe.c$c$a */
        class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16420b f156355a;

            a(InterfaceC16420b interfaceC16420b) {
                this.f156355a = interfaceC16420b;
            }

            public void onBackCancelled() {
                if (C2422c.this.d()) {
                    this.f156355a.a();
                }
            }

            public void onBackInvoked() {
                this.f156355a.d();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C2422c.this.d()) {
                    this.f156355a.c(new C5756b(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C2422c.this.d()) {
                    this.f156355a.b(new C5756b(backEvent));
                }
            }
        }

        private C2422c() {
            super();
        }

        @Override // pe.c.b
        OnBackInvokedCallback c(InterfaceC16420b interfaceC16420b) {
            return new a(interfaceC16420b);
        }
    }

    private interface d {
        void a(View view);

        void b(InterfaceC16420b interfaceC16420b, View view, boolean z10);
    }

    public <T extends View & InterfaceC16420b> c(T t10) {
        this(t10, t10);
    }

    public void c() {
        d(false);
    }

    public void e() {
        d(true);
    }

    public c(InterfaceC16420b interfaceC16420b, View view) {
        this.f156351a = a();
        this.f156352b = interfaceC16420b;
        this.f156353c = view;
    }

    private static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C2422c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    private void d(boolean z10) {
        d dVar = this.f156351a;
        if (dVar != null) {
            dVar.b(this.f156352b, this.f156353c, z10);
        }
    }

    public boolean b() {
        return this.f156351a != null;
    }

    public void f() {
        d dVar = this.f156351a;
        if (dVar != null) {
            dVar.a(this.f156353c);
        }
    }
}
