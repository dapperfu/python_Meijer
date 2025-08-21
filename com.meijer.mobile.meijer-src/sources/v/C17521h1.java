package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.k;
import androidx.concurrent.futures.c;
import u.C17296a;
import v.a2;

/* renamed from: v.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17521h1 implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final w.B f165088a;

    /* renamed from: c, reason: collision with root package name */
    private c.a<Void> f165090c;

    /* renamed from: b, reason: collision with root package name */
    private Rect f165089b = null;

    /* renamed from: d, reason: collision with root package name */
    private Rect f165091d = null;

    @Override // v.a2.b
    public void c() {
        this.f165091d = null;
        this.f165089b = null;
        c.a<Void> aVar = this.f165090c;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
            this.f165090c = null;
        }
    }

    @Override // v.a2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f165090c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f165091d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f165090c.c(null);
            this.f165090c = null;
            this.f165091d = null;
        }
    }

    @Override // v.a2.b
    public float b() {
        return 1.0f;
    }

    @Override // v.a2.b
    public float d() {
        Float f10 = (Float) this.f165088a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < b() ? b() : f10.floatValue();
    }

    @Override // v.a2.b
    public void e(C17296a.C2582a c2582a) {
        Rect rect = this.f165089b;
        if (rect != null) {
            c2582a.g(CaptureRequest.SCALER_CROP_REGION, rect, k.c.REQUIRED);
        }
    }

    C17521h1(w.B b10) {
        this.f165088a = b10;
    }
}
