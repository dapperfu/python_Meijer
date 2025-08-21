package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.view.AbstractC6127A;
import androidx.view.C6130D;
import java.util.concurrent.Executor;
import u.C17296a;
import v.C17557u;

/* loaded from: classes.dex */
final class a2 {

    /* renamed from: a, reason: collision with root package name */
    private final C17557u f164992a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f164993b;

    /* renamed from: c, reason: collision with root package name */
    private final b2 f164994c;

    /* renamed from: d, reason: collision with root package name */
    private final C6130D<C.s0> f164995d;

    /* renamed from: e, reason: collision with root package name */
    final b f164996e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f164997f = false;

    /* renamed from: g, reason: collision with root package name */
    private C17557u.c f164998g = new a();

    class a implements C17557u.c {
        a() {
        }

        @Override // v.C17557u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a2.this.f164996e.a(totalCaptureResult);
            return false;
        }
    }

    interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        void c();

        float d();

        void e(C17296a.C2582a c2582a);
    }

    static boolean e(w.B b10) {
        return Build.VERSION.SDK_INT >= 30 && c(b10) != null;
    }

    void a(C17296a.C2582a c2582a) {
        this.f164996e.e(c2582a);
    }

    AbstractC6127A<C.s0> d() {
        return this.f164995d;
    }

    void f(boolean z10) {
        C.s0 s0VarE;
        if (this.f164997f == z10) {
            return;
        }
        this.f164997f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f164994c) {
            this.f164994c.f(1.0f);
            s0VarE = J.e.e(this.f164994c);
        }
        g(s0VarE);
        this.f164996e.c();
        this.f164992a.Z();
    }

    a2(C17557u c17557u, w.B b10, Executor executor) throws IllegalArgumentException {
        this.f164992a = c17557u;
        this.f164993b = executor;
        b bVarB = b(b10);
        this.f164996e = bVarB;
        b2 b2Var = new b2(bVarB.d(), bVarB.b());
        this.f164994c = b2Var;
        b2Var.f(1.0f);
        this.f164995d = new C6130D<>(J.e.e(b2Var));
        c17557u.t(this.f164998g);
    }

    private static b b(w.B b10) {
        if (e(b10)) {
            return new C17504c(b10);
        }
        return new C17521h1(b10);
    }

    private static Range<Float> c(w.B b10) {
        try {
            return (Range) b10.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e10) {
            C.P.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    private void g(C.s0 s0Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f164995d.o(s0Var);
        } else {
            this.f164995d.m(s0Var);
        }
    }
}
