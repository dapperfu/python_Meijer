package Gg;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

/* loaded from: classes8.dex */
public final class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private hh.h f12531a;

    /* renamed from: b, reason: collision with root package name */
    private hh.i f12532b;

    /* renamed from: c, reason: collision with root package name */
    private Sensor f12533c;

    /* renamed from: d, reason: collision with root package name */
    private Context f12534d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f12535e = new Handler();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    private void b(final boolean z10) {
        this.f12535e.post(new Runnable() { // from class: Gg.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f12529a.f12531a.t(z10);
            }
        });
    }

    public void c() {
        if (this.f12532b.d()) {
            SensorManager sensorManager = (SensorManager) this.f12534d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f12533c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void d() {
        if (this.f12533c != null) {
            ((SensorManager) this.f12534d.getSystemService("sensor")).unregisterListener(this);
            this.f12533c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f12531a != null) {
            if (f10 <= 45.0f) {
                b(true);
            } else if (f10 >= 450.0f) {
                b(false);
            }
        }
    }

    public b(Context context, hh.h hVar, hh.i iVar) {
        this.f12534d = context;
        this.f12531a = hVar;
        this.f12532b = iVar;
    }
}
