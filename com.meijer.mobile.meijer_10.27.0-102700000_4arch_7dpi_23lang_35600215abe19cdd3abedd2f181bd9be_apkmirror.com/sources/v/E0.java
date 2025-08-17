package v;

import B.j;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.C18346z;

/* loaded from: classes.dex */
class E0 {
    public static CaptureRequest e(androidx.camera.core.impl.i iVar, CameraDevice cameraDevice, Map<DeferrableSurface, Surface> map, boolean z10, C18346z c18346z) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> listG = g(iVar.i(), map);
        if (listG.isEmpty()) {
            return null;
        }
        F.r rVarD = iVar.d();
        if (iVar.k() == 5 && rVarD != null && (rVarD.e() instanceof TotalCaptureResult)) {
            C.P.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) rVarD.e());
        } else {
            C.P.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (iVar.k() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z10 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(iVar.k());
            }
        }
        c(builderCreateCaptureRequest, iVar.k(), c18346z);
        a(iVar, builderCreateCaptureRequest);
        d(iVar, builderCreateCaptureRequest);
        androidx.camera.core.impl.k kVarG = iVar.g();
        k.a<Integer> aVar = androidx.camera.core.impl.i.f47400i;
        if (kVarG.c(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) iVar.g().a(aVar));
        }
        androidx.camera.core.impl.k kVarG2 = iVar.g();
        k.a<Integer> aVar2 = androidx.camera.core.impl.i.f47401j;
        if (kVarG2.c(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) iVar.g().a(aVar2)).byteValue()));
        }
        b(builderCreateCaptureRequest, iVar.g());
        Iterator<Surface> it = listG.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget(it.next());
        }
        builderCreateCaptureRequest.setTag(iVar.j());
        return builderCreateCaptureRequest.build();
    }

    static class a {
        static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    public static CaptureRequest f(androidx.camera.core.impl.i iVar, CameraDevice cameraDevice, C18346z c18346z) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        C.P.a("Camera2CaptureRequestBuilder", "template type = " + iVar.k());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(iVar.k());
        c(builderCreateCaptureRequest, iVar.k(), c18346z);
        b(builderCreateCaptureRequest, iVar.g());
        return builderCreateCaptureRequest.build();
    }

    private static List<Surface> g(List<DeferrableSurface> list, Map<DeferrableSurface, Surface> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            Surface surface = map.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    private static void a(androidx.camera.core.impl.i iVar, CaptureRequest.Builder builder) {
        if (!iVar.e().equals(androidx.camera.core.impl.x.f47497a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, iVar.e());
        }
    }

    private static void b(CaptureRequest.Builder builder, androidx.camera.core.impl.k kVar) {
        B.j jVarD = j.a.e(kVar).d();
        for (k.a<?> aVar : jVarD.f()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, jVarD.a(aVar));
            } catch (IllegalArgumentException unused) {
                C.P.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    private static void c(CaptureRequest.Builder builder, int i10, C18346z c18346z) {
        for (Map.Entry<CaptureRequest.Key<?>, Object> entry : c18346z.a(i10).entrySet()) {
            builder.set(entry.getKey(), entry.getValue());
        }
    }

    static void d(androidx.camera.core.impl.i iVar, CaptureRequest.Builder builder) {
        if (iVar.h() != 1 && iVar.l() != 1) {
            if (iVar.h() == 2) {
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
                return;
            } else {
                if (iVar.l() == 2) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    return;
                }
                return;
            }
        }
        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
    }
}
