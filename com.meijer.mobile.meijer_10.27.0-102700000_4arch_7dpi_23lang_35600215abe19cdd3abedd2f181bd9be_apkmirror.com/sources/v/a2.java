package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.view.AbstractC5985A;
import androidx.view.C5988D;
import java.util.concurrent.Executor;
import u.C17169a;
import v.C17418u;

/* loaded from: classes.dex */
final class a2 {

    /* renamed from: a, reason: collision with root package name */
    private final C17418u f163958a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f163959b;

    /* renamed from: c, reason: collision with root package name */
    private final b2 f163960c;

    /* renamed from: d, reason: collision with root package name */
    private final C5988D<C.s0> f163961d;

    /* renamed from: e, reason: collision with root package name */
    final b f163962e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f163963f = false;

    /* renamed from: g, reason: collision with root package name */
    private C17418u.c f163964g = new a();

    class a implements C17418u.c {
        a() {
        }

        @Override // v.C17418u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a2.this.f163962e.a(totalCaptureResult);
            return false;
        }
    }

    interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        void c();

        float d();

        void e(C17169a.C2558a c2558a);
    }

    static boolean e(w.B b10) {
        return Build.VERSION.SDK_INT >= 30 && c(b10) != null;
    }

    void a(C17169a.C2558a c2558a) {
        this.f163962e.e(c2558a);
    }

    AbstractC5985A<C.s0> d() {
        return this.f163961d;
    }

    void f(boolean z10) {
        C.s0 s0VarE;
        if (this.f163963f == z10) {
            return;
        }
        this.f163963f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f163960c) {
            this.f163960c.f(1.0f);
            s0VarE = J.e.e(this.f163960c);
        }
        g(s0VarE);
        this.f163962e.c();
        this.f163958a.Z();
    }

    a2(C17418u c17418u, w.B b10, Executor executor) throws IllegalArgumentException {
        this.f163958a = c17418u;
        this.f163959b = executor;
        b bVarB = b(b10);
        this.f163962e = bVarB;
        b2 b2Var = new b2(bVarB.d(), bVarB.b());
        this.f163960c = b2Var;
        b2Var.f(1.0f);
        this.f163961d = new C5988D<>(J.e.e(b2Var));
        c17418u.t(this.f163964g);
    }

    private static b b(w.B b10) {
        if (e(b10)) {
            return new C17365c(b10);
        }
        return new C17382h1(b10);
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
            this.f163961d.o(s0Var);
        } else {
            this.f163961d.m(s0Var);
        }
    }
}
