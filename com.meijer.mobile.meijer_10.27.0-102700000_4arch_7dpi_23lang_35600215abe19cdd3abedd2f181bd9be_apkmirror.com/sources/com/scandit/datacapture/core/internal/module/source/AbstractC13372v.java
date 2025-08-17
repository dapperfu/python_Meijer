package com.scandit.datacapture.core.internal.module.source;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13372v {
    public static final int a(InterfaceC13370t info) {
        Intrinsics.j(info, "info");
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i10 = 0; i10 < numberOfCameras; i10++) {
            try {
                Camera.getCameraInfo(i10, cameraInfo);
            } catch (Error e10) {
                e10.printStackTrace();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (cameraInfo.canDisableShutterSound == ((b0) info).f125015b && cameraInfo.orientation == ((b0) info).f125017d && cameraInfo.facing == ((b0) info).f125016c) {
                return i10;
            }
        }
        return -1;
    }
}
