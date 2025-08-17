package v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.k;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import u.C17169a;
import v.C17418u;

/* renamed from: v.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17391k1 {

    /* renamed from: a, reason: collision with root package name */
    private final C17418u f164082a;

    /* renamed from: b, reason: collision with root package name */
    private final C17394l1 f164083b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f164084c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f164085d = false;

    /* renamed from: e, reason: collision with root package name */
    private c.a<Integer> f164086e;

    /* renamed from: f, reason: collision with root package name */
    private C17418u.c f164087f;

    private void a() {
        c.a<Integer> aVar = this.f164086e;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.f164086e = null;
        }
        C17418u.c cVar = this.f164087f;
        if (cVar != null) {
            this.f164082a.Q(cVar);
            this.f164087f = null;
        }
    }

    void b(boolean z10) {
        if (z10 == this.f164085d) {
            return;
        }
        this.f164085d = z10;
        if (z10) {
            return;
        }
        this.f164083b.b(0);
        a();
    }

    void c(C17169a.C2558a c2558a) {
        c2558a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f164083b.a()), k.c.REQUIRED);
    }

    C17391k1(C17418u c17418u, w.B b10, Executor executor) {
        this.f164082a = c17418u;
        this.f164083b = new C17394l1(b10, 0);
        this.f164084c = executor;
    }
}
