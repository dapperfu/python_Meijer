package Eg;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

/* loaded from: classes7.dex */
public final class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private gh.h f8979a;

    /* renamed from: b, reason: collision with root package name */
    private gh.i f8980b;

    /* renamed from: c, reason: collision with root package name */
    private Sensor f8981c;

    /* renamed from: d, reason: collision with root package name */
    private Context f8982d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f8983e = new Handler();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    private void b(final boolean z10) {
        this.f8983e.post(new Runnable() { // from class: Eg.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f8977a.f8979a.t(z10);
            }
        });
    }

    public void c() {
        if (this.f8980b.d()) {
            SensorManager sensorManager = (SensorManager) this.f8982d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f8981c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void d() {
        if (this.f8981c != null) {
            ((SensorManager) this.f8982d.getSystemService("sensor")).unregisterListener(this);
            this.f8981c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f8979a != null) {
            if (f10 <= 45.0f) {
                b(true);
            } else if (f10 >= 450.0f) {
                b(false);
            }
        }
    }

    public b(Context context, gh.h hVar, gh.i iVar) {
        this.f8982d = context;
        this.f8979a = hVar;
        this.f8980b = iVar;
    }
}
