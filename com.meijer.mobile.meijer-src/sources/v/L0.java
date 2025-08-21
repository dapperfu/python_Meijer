package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.C17742c;

/* loaded from: classes.dex */
class L0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: b, reason: collision with root package name */
    a f164775b = null;

    /* renamed from: a, reason: collision with root package name */
    final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f164774a = new HashMap();

    interface a {
        void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z10);
    }

    private List<CameraCaptureSession.CaptureCallback> b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f164774a.get(captureRequest);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    void a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.f164774a.get(captureRequest);
        if (list2 == null) {
            this.f164774a.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f164774a.put(captureRequest, arrayList);
    }

    public void c(a aVar) {
        this.f164775b = aVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.f164774a.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceAborted(cameraCaptureSession, i10);
            }
        }
        a aVar = this.f164775b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i10, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.f164774a.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
            }
        }
        a aVar = this.f164775b;
        if (aVar != null) {
            aVar.a(cameraCaptureSession, i10, false);
        }
    }

    L0() {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            C17742c.a(it.next(), cameraCaptureSession, captureRequest, surface, j10);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
        Iterator<CameraCaptureSession.CaptureCallback> it = b(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }
    }
}
