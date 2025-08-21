package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.imu.ImuDataCollector;
import com.scandit.datacapture.core.imu.ImuMeasurement;
import com.scandit.datacapture.core.imu.ImuRotationMeasurement;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c implements ImuDataCollector.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f125013a;

    public c(DataCaptureContext owner) {
        Intrinsics.j(owner, "owner");
        this.f125013a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.imu.ImuDataCollector.Listener
    public final void onMeasurement(ImuMeasurement measurement) {
        NativeDataCaptureContext f125005a;
        Intrinsics.j(measurement, "measurement");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125013a.get();
        if (dataCaptureContext == null || (f125005a = dataCaptureContext.getF125005a()) == null) {
            return;
        }
        f125005a.addInertialMeasurementAsyncAndroid(measurement.toNativeMeasurement(), measurement.getType());
    }

    @Override // com.scandit.datacapture.core.imu.ImuDataCollector.Listener
    public final void onRotationMeasurement(ImuRotationMeasurement measurement) {
        NativeDataCaptureContext f125005a;
        Intrinsics.j(measurement, "measurement");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f125013a.get();
        if (dataCaptureContext == null || (f125005a = dataCaptureContext.getF125005a()) == null) {
            return;
        }
        f125005a.addRotationVectorAsyncAndroid(measurement.toNativeRotationMeasurement());
    }
}
