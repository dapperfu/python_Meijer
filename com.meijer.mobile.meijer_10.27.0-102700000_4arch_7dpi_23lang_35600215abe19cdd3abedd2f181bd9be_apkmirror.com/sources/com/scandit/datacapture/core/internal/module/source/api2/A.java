package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class A {
    public static final ImageReader a(i0 i0Var) {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i0Var.f124911a, i0Var.f124912b, 35, 2);
        Intrinsics.i(imageReaderNewInstance, "newInstance(...)");
        return imageReaderNewInstance;
    }

    public final CaptureRequest a(CameraDevice cameraDevice, Surface surface) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
        builderCreateCaptureRequest.addTarget(surface);
        builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
        Intrinsics.i(captureRequestBuild, "build(...)");
        return captureRequestBuild;
    }
}
