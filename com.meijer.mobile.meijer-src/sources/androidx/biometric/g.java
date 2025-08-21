package androidx.biometric;

import android.os.CancellationSignal;
import com.fullstory.FS;
import j2.C14924d;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final c f47352a = new a();

    /* renamed from: b, reason: collision with root package name */
    private CancellationSignal f47353b;

    /* renamed from: c, reason: collision with root package name */
    private C14924d f47354c;

    class a implements c {
        a() {
        }

        @Override // androidx.biometric.g.c
        public C14924d a() {
            return new C14924d();
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
        C14924d a();

        CancellationSignal b();
    }

    void a() {
        CancellationSignal cancellationSignal = this.f47353b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e10) {
                FS.log_e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
            }
            this.f47353b = null;
        }
        C14924d c14924d = this.f47354c;
        if (c14924d != null) {
            try {
                c14924d.a();
            } catch (NullPointerException e11) {
                FS.log_e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
            }
            this.f47354c = null;
        }
    }

    CancellationSignal b() {
        if (this.f47353b == null) {
            this.f47353b = this.f47352a.b();
        }
        return this.f47353b;
    }

    C14924d c() {
        if (this.f47354c == null) {
            this.f47354c = this.f47352a.a();
        }
        return this.f47354c;
    }

    g() {
    }
}
