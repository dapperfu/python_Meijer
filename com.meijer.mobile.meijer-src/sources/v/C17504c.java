package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.k;
import androidx.concurrent.futures.c;
import u.C17296a;
import v.a2;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17504c implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final w.B f165006a;

    /* renamed from: b, reason: collision with root package name */
    private final Range<Float> f165007b;

    /* renamed from: d, reason: collision with root package name */
    private c.a<Void> f165009d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f165011f;

    /* renamed from: c, reason: collision with root package name */
    private float f165008c = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f165010e = 1.0f;

    @Override // v.a2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f165009d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f165010e == f10.floatValue()) {
                this.f165009d.c(null);
                this.f165009d = null;
            }
        }
    }

    @Override // v.a2.b
    public float b() {
        return ((Float) this.f165007b.getLower()).floatValue();
    }

    @Override // v.a2.b
    public void c() {
        this.f165008c = 1.0f;
        c.a<Void> aVar = this.f165009d;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
            this.f165009d = null;
        }
    }

    @Override // v.a2.b
    public float d() {
        return ((Float) this.f165007b.getUpper()).floatValue();
    }

    C17504c(w.B b10) {
        this.f165011f = false;
        this.f165006a = b10;
        this.f165007b = (Range) b10.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f165011f = b10.d();
    }

    @Override // v.a2.b
    public void e(C17296a.C2582a c2582a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f165008c);
        k.c cVar = k.c.REQUIRED;
        c2582a.g(key, fValueOf, cVar);
        if (this.f165011f) {
            x.b.a(c2582a, cVar);
        }
    }
}
