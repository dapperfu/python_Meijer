package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.google.android.gms.internal.ads.Md0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6958Md0 implements SensorEventListener {
    public abstract void a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    protected AbstractC6958Md0(String str, String str2) {
        C6925Ld0.a();
        C6891Kd0.a();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        a(sensorEvent);
    }
}
