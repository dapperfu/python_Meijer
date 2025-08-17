package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.core.internal.module.source.NativeCameraInfo;
import com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements BarcodeFindCameraManager {

    /* renamed from: b, reason: collision with root package name */
    public final CameraSettings f122124b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f122125c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f122126d;

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final void a(float f10) {
        this.f122124b.setZoomFactor(f10);
        Camera camera = (Camera) this.f122126d.getValue();
        if (camera != null) {
            Camera.applySettings$default(camera, this.f122124b, null, 2, null);
        }
    }

    public c(CameraSettings cameraSettings, com.scandit.datacapture.barcode.find.ui.c onResolutionChange) {
        Intrinsics.j(cameraSettings, "cameraSettings");
        Intrinsics.j(onResolutionChange, "onResolutionChange");
        this.f122124b = cameraSettings;
        this.f122125c = onResolutionChange;
        this.f122126d = LazyKt.b(new b(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final void b() {
        Camera camera = (Camera) this.f122126d.getValue();
        if (camera == null) {
            return;
        }
        FrameSourceState currentState = camera.getCurrentState();
        FrameSourceState frameSourceState = FrameSourceState.OFF;
        if (currentState != frameSourceState) {
            camera.switchToDesiredState(frameSourceState);
            camera.getF125871a().flushPendingTasks();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final Float c() {
        NativeAndroidCamera f125871a;
        NativeCameraInfo cameraInfo;
        NativeFloatRange availableZoomRange;
        Camera camera = (Camera) this.f122126d.getValue();
        if (camera == null || (f125871a = camera.getF125871a()) == null || (cameraInfo = f125871a.getCameraInfo()) == null || (availableZoomRange = cameraInfo.getAvailableZoomRange()) == null) {
            return null;
        }
        float min = availableZoomRange.getMin();
        Float fValueOf = Float.valueOf(min);
        if (min < 1.0f) {
            return fValueOf;
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final float d() {
        return this.f122124b.getZoomFactor();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final void e() {
        Camera camera = (Camera) this.f122126d.getValue();
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.ON);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager
    public final Camera a() {
        return (Camera) this.f122126d.getValue();
    }
}
