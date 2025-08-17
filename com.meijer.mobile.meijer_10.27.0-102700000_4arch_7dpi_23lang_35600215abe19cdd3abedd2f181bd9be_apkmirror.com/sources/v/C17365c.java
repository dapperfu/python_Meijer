package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.k;
import androidx.concurrent.futures.c;
import u.C17169a;
import v.a2;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17365c implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final w.B f163972a;

    /* renamed from: b, reason: collision with root package name */
    private final Range<Float> f163973b;

    /* renamed from: d, reason: collision with root package name */
    private c.a<Void> f163975d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f163977f;

    /* renamed from: c, reason: collision with root package name */
    private float f163974c = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f163976e = 1.0f;

    @Override // v.a2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f163975d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f163976e == f10.floatValue()) {
                this.f163975d.c(null);
                this.f163975d = null;
            }
        }
    }

    @Override // v.a2.b
    public float b() {
        return ((Float) this.f163973b.getLower()).floatValue();
    }

    @Override // v.a2.b
    public void c() {
        this.f163974c = 1.0f;
        c.a<Void> aVar = this.f163975d;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
            this.f163975d = null;
        }
    }

    @Override // v.a2.b
    public float d() {
        return ((Float) this.f163973b.getUpper()).floatValue();
    }

    C17365c(w.B b10) {
        this.f163977f = false;
        this.f163972a = b10;
        this.f163973b = (Range) b10.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f163977f = b10.d();
    }

    @Override // v.a2.b
    public void e(C17169a.C2558a c2558a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f163974c);
        k.c cVar = k.c.REQUIRED;
        c2558a.g(key, fValueOf, cVar);
        if (this.f163977f) {
            x.b.a(c2558a, cVar);
        }
    }
}
