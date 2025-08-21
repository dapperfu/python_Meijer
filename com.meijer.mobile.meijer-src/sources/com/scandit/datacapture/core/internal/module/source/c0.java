package com.scandit.datacapture.core.internal.module.source;

import android.hardware.Camera;
import com.scandit.datacapture.core.logger.CameraInfoProviderEvent;
import com.scandit.datacapture.core.logger.SdcLogger;
import java.util.ArrayList;
import kotlin.ExceptionsKt;

/* loaded from: classes12.dex */
public final class c0 implements InterfaceC13504u {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f125971a = new c0();

    public final ArrayList a() {
        int numberOfCameras = Camera.getNumberOfCameras();
        ArrayList arrayList = new ArrayList();
        if (numberOfCameras == 0) {
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(1, 0, "No exception thrown, 0 cameras available", null, 8, null));
        }
        for (int i10 = 0; i10 < numberOfCameras; i10++) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                arrayList.add(new b0(String.valueOf(i10), cameraInfo));
            } catch (RuntimeException e10) {
                e10.printStackTrace();
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(1, numberOfCameras, ExceptionsKt.b(e10), "Failed on camera index " + i10 + ';'));
            }
        }
        return arrayList;
    }
}
