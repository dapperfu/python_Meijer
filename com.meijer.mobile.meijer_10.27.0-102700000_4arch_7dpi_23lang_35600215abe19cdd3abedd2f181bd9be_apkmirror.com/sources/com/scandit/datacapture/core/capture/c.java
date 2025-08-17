package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.imu.ImuDataCollector;
import com.scandit.datacapture.core.imu.ImuMeasurement;
import com.scandit.datacapture.core.imu.ImuRotationMeasurement;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements ImuDataCollector.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124061a;

    public c(DataCaptureContext owner) {
        Intrinsics.j(owner, "owner");
        this.f124061a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.imu.ImuDataCollector.Listener
    public final void onMeasurement(ImuMeasurement measurement) {
        NativeDataCaptureContext f124053a;
        Intrinsics.j(measurement, "measurement");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f124061a.get();
        if (dataCaptureContext == null || (f124053a = dataCaptureContext.getF124053a()) == null) {
            return;
        }
        f124053a.addInertialMeasurementAsyncAndroid(measurement.toNativeMeasurement(), measurement.getType());
    }

    @Override // com.scandit.datacapture.core.imu.ImuDataCollector.Listener
    public final void onRotationMeasurement(ImuRotationMeasurement measurement) {
        NativeDataCaptureContext f124053a;
        Intrinsics.j(measurement, "measurement");
        DataCaptureContext dataCaptureContext = (DataCaptureContext) this.f124061a.get();
        if (dataCaptureContext == null || (f124053a = dataCaptureContext.getF124053a()) == null) {
            return;
        }
        f124053a.addRotationVectorAsyncAndroid(measurement.toNativeRotationMeasurement());
    }
}
