package w;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.C;

/* loaded from: classes.dex */
class K implements C.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraDevice f165164a;

    /* renamed from: b, reason: collision with root package name */
    final Object f165165b;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f165166a;

        a(Handler handler) {
            this.f165166a = handler;
        }
    }

    static List<Surface> d(List<x.k> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<x.k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        return arrayList;
    }

    K(CameraDevice cameraDevice, Object obj) {
        this.f165164a = (CameraDevice) o2.i.g(cameraDevice);
        this.f165165b = obj;
    }

    private static void b(CameraDevice cameraDevice, List<x.k> list) {
        String id2 = cameraDevice.getId();
        Iterator<x.k> it = list.iterator();
        while (it.hasNext()) {
            String strC = it.next().c();
            if (strC != null && !strC.isEmpty()) {
                C.P.l("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + strC + ". Ignoring.");
            }
        }
    }

    static void c(CameraDevice cameraDevice, x.q qVar) {
        o2.i.g(cameraDevice);
        o2.i.g(qVar);
        o2.i.g(qVar.e());
        List<x.k> listC = qVar.c();
        if (listC != null) {
            if (qVar.a() != null) {
                b(cameraDevice, listC);
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }
}
