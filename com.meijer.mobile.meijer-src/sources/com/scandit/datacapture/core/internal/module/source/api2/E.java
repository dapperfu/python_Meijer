package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class E {
    public static final CaptureRequest.Builder a(CameraDevice cameraDevice, Surface surface, Surface surface2) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
        Intrinsics.i(builderCreateCaptureRequest, "createCaptureRequest(...)");
        builderCreateCaptureRequest.addTarget(surface);
        builderCreateCaptureRequest.addTarget(surface2);
        return builderCreateCaptureRequest;
    }
}
