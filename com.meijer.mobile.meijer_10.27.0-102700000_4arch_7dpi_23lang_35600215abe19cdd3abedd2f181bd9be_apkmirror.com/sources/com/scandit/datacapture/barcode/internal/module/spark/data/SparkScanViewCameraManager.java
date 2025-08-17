package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.internal.module.spark.ui.c0;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView$sparkScanCameraStartListener$1;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes11.dex */
public interface SparkScanViewCameraManager {
    Camera a();

    void a(com.scandit.datacapture.barcode.internal.module.spark.ui.S s10);

    void a(c0 c0Var);

    void a(SparkScanView$sparkScanCameraStartListener$1 sparkScanView$sparkScanCameraStartListener$1);

    void a(Callback callback);

    void a(TorchState torchState, Function0 function0);

    void a(Function0 function0);

    void b();

    void b(Callback callback);

    boolean isTorchAvailable();

    void release();

    void setBatterySavingMode(BatterySavingMode batterySavingMode);
}
