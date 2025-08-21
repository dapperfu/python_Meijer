package x6;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Observable;

/* renamed from: x6.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18103I extends Observable implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    SensorManager f170460a;

    /* renamed from: b, reason: collision with root package name */
    Sensor f170461b;

    /* renamed from: c, reason: collision with root package name */
    Sensor f170462c;

    /* renamed from: d, reason: collision with root package name */
    Sensor f170463d;

    /* renamed from: e, reason: collision with root package name */
    HandlerThread f170464e;

    /* renamed from: f, reason: collision with root package name */
    boolean f170465f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f170466g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f170467h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f170468i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f170469j = false;

    /* renamed from: k, reason: collision with root package name */
    boolean f170470k = false;

    /* renamed from: l, reason: collision with root package name */
    long f170471l = 0;

    /* renamed from: m, reason: collision with root package name */
    private float[] f170472m = new float[3];

    /* renamed from: n, reason: collision with root package name */
    private float[] f170473n = new float[3];

    /* renamed from: o, reason: collision with root package name */
    boolean f170474o = true;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void a() throws Exception {
        if (this.f170466g) {
            this.f170460a.unregisterListener(this, this.f170462c);
            this.f170466g = false;
        }
        if (this.f170467h) {
            this.f170460a.unregisterListener(this, this.f170463d);
            this.f170467h = false;
        }
        if (this.f170465f) {
            this.f170460a.unregisterListener(this, this.f170461b);
            this.f170465f = false;
        }
        this.f170470k = false;
        HandlerThread handlerThread = this.f170464e;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f170464e.quitSafely();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.f170470k && sensorEvent.accuracy == 0) {
                r.d("OrientationListener", "Unreliable orientation sensor data...", new Throwable[0]);
                this.f170470k = true;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 9 || type == 1) {
                this.f170472m = (float[]) sensorEvent.values.clone();
                this.f170468i = true;
            } else if (type == 2) {
                this.f170473n = (float[]) sensorEvent.values.clone();
                this.f170469j = true;
            }
            if (this.f170468i && this.f170469j) {
                long j10 = this.f170471l;
                if (jUptimeMillis - j10 >= 100 || C18127w.f170601e == 1) {
                    long j11 = jUptimeMillis - j10;
                    this.f170471l = jUptimeMillis;
                    boolean z10 = C18127w.f170601e != 0;
                    C18127w.f170601e = 0;
                    setChanged();
                    notifyObservers(new C18102H(this.f170472m, this.f170473n, this.f170471l, z10 ? 2 : 1, this.f170474o, j11));
                    this.f170468i = false;
                    this.f170469j = false;
                    this.f170474o = false;
                }
            }
        } catch (Exception e10) {
            r.d("OrientationListener", "Exception in processing orientation event", e10);
            C18095A.a(e10);
        }
    }

    C18103I(Application application) {
        try {
            this.f170460a = (SensorManager) application.getSystemService("sensor");
        } catch (NullPointerException e10) {
            r.e("OrientationListener", "Exception on getting sensor service", e10);
            C18095A.a(e10);
        }
    }
}
