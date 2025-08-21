package com.scandit.datacapture.core.internal.module.source.camera.behavior;

import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.TorchListener;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes12.dex */
public interface CameraBehaviorDelegate {
    void a(CameraSettings cameraSettings, Runnable runnable);

    void a(TorchListener torchListener);

    void a(TorchState torchState, Function0 function0);

    void a(String str);

    TorchState b();

    void b(TorchListener torchListener);

    void c(TorchListener torchListener);

    void d(TorchListener torchListener);
}
