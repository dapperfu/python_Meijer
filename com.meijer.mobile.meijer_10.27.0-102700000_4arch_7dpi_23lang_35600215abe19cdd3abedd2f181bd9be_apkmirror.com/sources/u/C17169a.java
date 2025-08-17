package u;

import B.j;
import C.InterfaceC2980x;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.s;
import androidx.camera.core.impl.t;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17169a extends j {

    /* renamed from: J, reason: collision with root package name */
    public static final k.a<Integer> f162453J = k.a.a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: K, reason: collision with root package name */
    public static final k.a<Long> f162454K = k.a.a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* renamed from: L, reason: collision with root package name */
    public static final k.a<CameraDevice.StateCallback> f162455L = k.a.a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: M, reason: collision with root package name */
    public static final k.a<CameraCaptureSession.StateCallback> f162456M = k.a.a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: N, reason: collision with root package name */
    public static final k.a<CameraCaptureSession.CaptureCallback> f162457N = k.a.a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: O, reason: collision with root package name */
    public static final k.a<Object> f162458O = k.a.a("camera2.captureRequest.tag", Object.class);

    /* renamed from: P, reason: collision with root package name */
    public static final k.a<String> f162459P = k.a.a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: u.a$a, reason: collision with other inner class name */
    public static final class C2558a implements InterfaceC2980x<C17169a> {

        /* renamed from: a, reason: collision with root package name */
        private final s f162460a = s.b0();

        @Override // C.InterfaceC2980x
        public r a() {
            return this.f162460a;
        }

        public C17169a c() {
            return new C17169a(t.a0(this.f162460a));
        }

        public C2558a d(k kVar) {
            e(kVar, k.c.OPTIONAL);
            return this;
        }

        public C2558a e(k kVar, k.c cVar) {
            for (k.a<?> aVar : kVar.f()) {
                this.f162460a.p(aVar, cVar, kVar.a(aVar));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> C2558a f(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f162460a.r(C17169a.Y(key), valuet);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> C2558a g(CaptureRequest.Key<ValueT> key, ValueT valuet, k.c cVar) {
            this.f162460a.p(C17169a.Y(key), cVar, valuet);
            return this;
        }
    }

    public static k.a<Object> Y(CaptureRequest.Key<?> key) {
        return k.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public C17169a(k kVar) {
        super(kVar);
    }

    public j Z() {
        return j.a.e(b()).d();
    }

    public int a0(int i10) {
        return ((Integer) b().h(f162453J, Integer.valueOf(i10))).intValue();
    }

    public CameraDevice.StateCallback b0(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) b().h(f162455L, stateCallback);
    }

    public String c0(String str) {
        return (String) b().h(f162459P, str);
    }

    public CameraCaptureSession.CaptureCallback d0(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) b().h(f162457N, captureCallback);
    }

    public CameraCaptureSession.StateCallback e0(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) b().h(f162456M, stateCallback);
    }

    public long f0(long j10) {
        return ((Long) b().h(f162454K, Long.valueOf(j10))).longValue();
    }
}
