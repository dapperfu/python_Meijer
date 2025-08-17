package com.scandit.datacapture.core.imu;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124201a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        Intrinsics.j(sensor, "sensor");
    }

    public a(ImuDataCollector owner) {
        Intrinsics.j(owner, "owner");
        this.f124201a = new WeakReference(owner);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        Intrinsics.j(event, "event");
        ImuDataCollector imuDataCollector = (ImuDataCollector) this.f124201a.get();
        if (imuDataCollector != null) {
            ImuDataCollector.access$onSensorEvent(imuDataCollector, event);
        }
    }
}
