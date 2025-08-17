package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.k;
import androidx.concurrent.futures.c;
import u.C17169a;
import v.a2;

/* renamed from: v.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17382h1 implements a2.b {

    /* renamed from: a, reason: collision with root package name */
    private final w.B f164054a;

    /* renamed from: c, reason: collision with root package name */
    private c.a<Void> f164056c;

    /* renamed from: b, reason: collision with root package name */
    private Rect f164055b = null;

    /* renamed from: d, reason: collision with root package name */
    private Rect f164057d = null;

    @Override // v.a2.b
    public void c() {
        this.f164057d = null;
        this.f164055b = null;
        c.a<Void> aVar = this.f164056c;
        if (aVar != null) {
            aVar.f(new CameraControl$OperationCanceledException("Camera is not active."));
            this.f164056c = null;
        }
    }

    @Override // v.a2.b
    public void a(TotalCaptureResult totalCaptureResult) {
        if (this.f164056c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f164057d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f164056c.c(null);
            this.f164056c = null;
            this.f164057d = null;
        }
    }

    @Override // v.a2.b
    public float b() {
        return 1.0f;
    }

    @Override // v.a2.b
    public float d() {
        Float f10 = (Float) this.f164054a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            return 1.0f;
        }
        return f10.floatValue() < b() ? b() : f10.floatValue();
    }

    @Override // v.a2.b
    public void e(C17169a.C2558a c2558a) {
        Rect rect = this.f164055b;
        if (rect != null) {
            c2558a.g(CaptureRequest.SCALER_CROP_REGION, rect, k.c.REQUIRED);
        }
    }

    C17382h1(w.B b10) {
        this.f164054a = b10;
    }
}
