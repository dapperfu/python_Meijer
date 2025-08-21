package v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.k;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import u.C17296a;
import v.C17557u;

/* renamed from: v.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C17530k1 {

    /* renamed from: a, reason: collision with root package name */
    private final C17557u f165116a;

    /* renamed from: b, reason: collision with root package name */
    private final C17533l1 f165117b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f165118c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f165119d = false;

    /* renamed from: e, reason: collision with root package name */
    private c.a<Integer> f165120e;

    /* renamed from: f, reason: collision with root package name */
    private C17557u.c f165121f;

    private void a() {
        c.a<Integer> aVar = this.f165120e;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.f165120e = null;
        }
        C17557u.c cVar = this.f165121f;
        if (cVar != null) {
            this.f165116a.Q(cVar);
            this.f165121f = null;
        }
    }

    void b(boolean z10) {
        if (z10 == this.f165119d) {
            return;
        }
        this.f165119d = z10;
        if (z10) {
            return;
        }
        this.f165117b.b(0);
        a();
    }

    void c(C17296a.C2582a c2582a) {
        c2582a.g(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f165117b.a()), k.c.REQUIRED);
    }

    C17530k1(C17557u c17557u, w.B b10, Executor executor) {
        this.f165116a = c17557u;
        this.f165117b = new C17533l1(b10, 0);
        this.f165118c = executor;
    }
}
