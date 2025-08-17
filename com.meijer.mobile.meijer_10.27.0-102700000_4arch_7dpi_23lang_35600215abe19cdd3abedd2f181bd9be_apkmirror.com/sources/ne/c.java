package ne;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.view.C5614b;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final d f151220a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15792b f151221b;

    /* renamed from: c, reason: collision with root package name */
    private final View f151222c;

    private static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private OnBackInvokedCallback f151223a;

        private b() {
        }

        @Override // ne.c.d
        public void b(InterfaceC15792b interfaceC15792b, View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f151223a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(interfaceC15792b);
                this.f151223a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        boolean d() {
            return this.f151223a != null;
        }

        @Override // ne.c.d
        public void a(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f151223a);
                this.f151223a = null;
            }
        }

        OnBackInvokedCallback c(final InterfaceC15792b interfaceC15792b) {
            Objects.requireNonNull(interfaceC15792b);
            return new OnBackInvokedCallback() { // from class: ne.e
                public final void onBackInvoked() {
                    interfaceC15792b.d();
                }
            };
        }
    }

    /* renamed from: ne.c$c, reason: collision with other inner class name */
    private static class C2341c extends b {

        /* renamed from: ne.c$c$a */
        class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC15792b f151224a;

            a(InterfaceC15792b interfaceC15792b) {
                this.f151224a = interfaceC15792b;
            }

            public void onBackCancelled() {
                if (C2341c.this.d()) {
                    this.f151224a.a();
                }
            }

            public void onBackInvoked() {
                this.f151224a.d();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C2341c.this.d()) {
                    this.f151224a.c(new C5614b(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C2341c.this.d()) {
                    this.f151224a.b(new C5614b(backEvent));
                }
            }
        }

        private C2341c() {
            super();
        }

        @Override // ne.c.b
        OnBackInvokedCallback c(InterfaceC15792b interfaceC15792b) {
            return new a(interfaceC15792b);
        }
    }

    private interface d {
        void a(View view);

        void b(InterfaceC15792b interfaceC15792b, View view, boolean z10);
    }

    public <T extends View & InterfaceC15792b> c(T t10) {
        this(t10, t10);
    }

    public void c() {
        d(false);
    }

    public void e() {
        d(true);
    }

    public c(InterfaceC15792b interfaceC15792b, View view) {
        this.f151220a = a();
        this.f151221b = interfaceC15792b;
        this.f151222c = view;
    }

    private static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C2341c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    private void d(boolean z10) {
        d dVar = this.f151220a;
        if (dVar != null) {
            dVar.b(this.f151221b, this.f151222c, z10);
        }
    }

    public boolean b() {
        return this.f151220a != null;
    }

    public void f() {
        d dVar = this.f151220a;
        if (dVar != null) {
            dVar.a(this.f151222c);
        }
    }
}
