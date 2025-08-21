package Hg;

import android.hardware.Camera;
import com.fullstory.FS;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13538a = "Hg.a";

    public static int a(int i10) {
        boolean z10;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            FS.log_w(f13538a, "No cameras!");
            return -1;
        }
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 0;
            while (i10 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i10++;
            }
        }
        if (i10 < numberOfCameras) {
            return i10;
        }
        if (z10) {
            return -1;
        }
        return 0;
    }

    public static Camera b(int i10) {
        int iA = a(i10);
        if (iA == -1) {
            return null;
        }
        return Camera.open(iA);
    }
}
