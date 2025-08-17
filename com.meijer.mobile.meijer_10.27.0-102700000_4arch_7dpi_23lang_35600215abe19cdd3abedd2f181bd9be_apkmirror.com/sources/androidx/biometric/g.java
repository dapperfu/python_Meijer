package androidx.biometric;

import android.os.CancellationSignal;
import com.fullstory.FS;
import j2.C14836d;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final c f47128a = new a();

    /* renamed from: b, reason: collision with root package name */
    private CancellationSignal f47129b;

    /* renamed from: c, reason: collision with root package name */
    private C14836d f47130c;

    class a implements c {
        a() {
        }

        @Override // androidx.biometric.g.c
        public C14836d a() {
            return new C14836d();
        }

        @Override // androidx.biometric.g.c
        public CancellationSignal b() {
            return b.b();
        }
    }

    private static class b {
        static CancellationSignal b() {
            return new CancellationSignal();
        }

        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }
    }

    interface c {
        C14836d a();

        CancellationSignal b();
    }

    void a() {
        CancellationSignal cancellationSignal = this.f47129b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e10) {
                FS.log_e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
            }
            this.f47129b = null;
        }
        C14836d c14836d = this.f47130c;
        if (c14836d != null) {
            try {
                c14836d.a();
            } catch (NullPointerException e11) {
                FS.log_e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
            }
            this.f47130c = null;
        }
    }

    CancellationSignal b() {
        if (this.f47129b == null) {
            this.f47129b = this.f47128a.b();
        }
        return this.f47129b;
    }

    C14836d c() {
        if (this.f47130c == null) {
            this.f47130c = this.f47128a.a();
        }
        return this.f47130c;
    }

    g() {
    }
}
