package v;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class N0 {

    private static final class a extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        private final List<CameraDevice.StateCallback> f164862a = new ArrayList();

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f164862a.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f164862a.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            Iterator<CameraDevice.StateCallback> it = this.f164862a.iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, i10);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Iterator<CameraDevice.StateCallback> it = this.f164862a.iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }

        a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof b)) {
                    this.f164862a.add(stateCallback);
                }
            }
        }
    }

    static final class b extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }

        b() {
        }
    }

    public static CameraDevice.StateCallback b() {
        return new b();
    }

    public static CameraDevice.StateCallback a(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new a(list);
    }
}
