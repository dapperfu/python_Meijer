package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceListener;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class A implements CameraManager {

    /* renamed from: a, reason: collision with root package name */
    public FrameSourceListener f122407a;

    /* renamed from: b, reason: collision with root package name */
    public final Camera f122408b;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager
    public final void a(com.scandit.datacapture.barcode.pick.ui.l action) {
        com.scandit.datacapture.barcode.internal.module.pick.a aVar;
        Camera camera;
        Intrinsics.j(action, "action");
        FrameSourceListener frameSourceListener = this.f122407a;
        if (frameSourceListener != null && (camera = this.f122408b) != null) {
            camera.removeListener(frameSourceListener);
        }
        Camera camera2 = this.f122408b;
        if (camera2 != null) {
            z block = new z(action, this);
            Intrinsics.j(camera2, "<this>");
            Intrinsics.j(block, "block");
            aVar = new com.scandit.datacapture.barcode.internal.module.pick.a(block);
            camera2.addListener(aVar);
        } else {
            aVar = null;
        }
        this.f122407a = aVar;
    }

    public A(CameraPosition cameraPosition, CameraSettings cameraSettings) {
        Intrinsics.j(cameraPosition, "cameraPosition");
        Intrinsics.j(cameraSettings, "cameraSettings");
        this.f122408b = Camera.INSTANCE.getCamera(cameraPosition, cameraSettings);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager
    public final void a(Function0 onDone) {
        Intrinsics.j(onDone, "onDone");
        Camera camera = this.f122408b;
        if (camera != null) {
            camera._switchToDesiredTorchState(TorchState.OFF, onDone);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.CameraManager
    public final void a(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        FrameSource frameSource = dataCaptureContext.get_frameSource();
        if (frameSource != null) {
            FrameSourceState desiredState = frameSource.getDesiredState();
            FrameSourceState frameSourceState = FrameSourceState.OFF;
            if (desiredState != frameSourceState) {
                FrameSource.DefaultImpls.switchToDesiredState$default(frameSource, frameSourceState, null, 2, null);
            }
        }
        DataCaptureContext.setFrameSource$default(dataCaptureContext, this.f122408b, null, 2, null);
    }
}
