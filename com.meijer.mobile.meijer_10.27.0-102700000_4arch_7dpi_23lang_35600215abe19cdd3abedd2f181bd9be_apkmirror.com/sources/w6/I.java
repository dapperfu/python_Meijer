package w6;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Observable;

/* loaded from: classes4.dex */
final class I extends Observable implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    SensorManager f165815a;

    /* renamed from: b, reason: collision with root package name */
    Sensor f165816b;

    /* renamed from: c, reason: collision with root package name */
    Sensor f165817c;

    /* renamed from: d, reason: collision with root package name */
    Sensor f165818d;

    /* renamed from: e, reason: collision with root package name */
    HandlerThread f165819e;

    /* renamed from: f, reason: collision with root package name */
    boolean f165820f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f165821g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f165822h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f165823i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f165824j = false;

    /* renamed from: k, reason: collision with root package name */
    boolean f165825k = false;

    /* renamed from: l, reason: collision with root package name */
    long f165826l = 0;

    /* renamed from: m, reason: collision with root package name */
    private float[] f165827m = new float[3];

    /* renamed from: n, reason: collision with root package name */
    private float[] f165828n = new float[3];

    /* renamed from: o, reason: collision with root package name */
    boolean f165829o = true;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void a() throws Exception {
        if (this.f165821g) {
            this.f165815a.unregisterListener(this, this.f165817c);
            this.f165821g = false;
        }
        if (this.f165822h) {
            this.f165815a.unregisterListener(this, this.f165818d);
            this.f165822h = false;
        }
        if (this.f165820f) {
            this.f165815a.unregisterListener(this, this.f165816b);
            this.f165820f = false;
        }
        this.f165825k = false;
        HandlerThread handlerThread = this.f165819e;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f165819e.quitSafely();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.f165825k && sensorEvent.accuracy == 0) {
                r.d("OrientationListener", "Unreliable orientation sensor data...", new Throwable[0]);
                this.f165825k = true;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 9 || type == 1) {
                this.f165827m = (float[]) sensorEvent.values.clone();
                this.f165823i = true;
            } else if (type == 2) {
                this.f165828n = (float[]) sensorEvent.values.clone();
                this.f165824j = true;
            }
            if (this.f165823i && this.f165824j) {
                long j10 = this.f165826l;
                if (jUptimeMillis - j10 >= 100 || C17800w.f165956e == 1) {
                    long j11 = jUptimeMillis - j10;
                    this.f165826l = jUptimeMillis;
                    boolean z10 = C17800w.f165956e != 0;
                    C17800w.f165956e = 0;
                    setChanged();
                    notifyObservers(new H(this.f165827m, this.f165828n, this.f165826l, z10 ? 2 : 1, this.f165829o, j11));
                    this.f165823i = false;
                    this.f165824j = false;
                    this.f165829o = false;
                }
            }
        } catch (Exception e10) {
            r.d("OrientationListener", "Exception in processing orientation event", e10);
            C17774A.a(e10);
        }
    }

    I(Application application) {
        try {
            this.f165815a = (SensorManager) application.getSystemService("sensor");
        } catch (NullPointerException e10) {
            r.e("OrientationListener", "Exception on getting sensor service", e10);
            C17774A.a(e10);
        }
    }
}
