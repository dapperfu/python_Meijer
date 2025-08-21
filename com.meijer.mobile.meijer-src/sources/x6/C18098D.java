package x6;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Observable;

/* renamed from: x6.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18098D extends Observable implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    SensorManager f170401a;

    /* renamed from: b, reason: collision with root package name */
    Sensor f170402b;

    /* renamed from: c, reason: collision with root package name */
    Sensor f170403c;

    /* renamed from: d, reason: collision with root package name */
    HandlerThread f170404d;

    /* renamed from: e, reason: collision with root package name */
    long f170405e = 0;

    /* renamed from: f, reason: collision with root package name */
    boolean f170406f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f170407g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f170408h = false;

    /* renamed from: i, reason: collision with root package name */
    boolean f170409i = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f170410j = false;

    /* renamed from: k, reason: collision with root package name */
    private float f170411k = -1.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f170412l = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f170413m = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f170414n = -1.0f;

    /* renamed from: o, reason: collision with root package name */
    private float f170415o = -1.0f;

    /* renamed from: p, reason: collision with root package name */
    private float f170416p = -1.0f;

    /* renamed from: q, reason: collision with root package name */
    private float f170417q = -1.0f;

    /* renamed from: r, reason: collision with root package name */
    private float f170418r = -1.0f;

    /* renamed from: s, reason: collision with root package name */
    private float f170419s = -1.0f;

    /* renamed from: t, reason: collision with root package name */
    float f170420t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    private final float[] f170421u = {0.0f, 0.0f, 0.0f};

    /* renamed from: v, reason: collision with root package name */
    int f170422v = 0;

    /* renamed from: w, reason: collision with root package name */
    boolean f170423w = true;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void a() throws Exception {
        if (this.f170407g) {
            this.f170401a.unregisterListener(this, this.f170403c);
            this.f170407g = false;
        }
        if (this.f170406f) {
            this.f170401a.unregisterListener(this, this.f170402b);
            this.f170406f = false;
        }
        this.f170410j = false;
        HandlerThread handlerThread = this.f170404d;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f170404d.quitSafely();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10 = 1;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.f170410j) {
                try {
                    if (sensorEvent.accuracy == 0) {
                        r.d("MotionListener", "Unreliable motion sensors data...", new Throwable[0]);
                        this.f170410j = true;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Throwable[] thArr = new Throwable[i10];
                    thArr[0] = e;
                    r.d("MotionListener", "Exception in processing motion event", thArr);
                    C18095A.a(e);
                }
            }
            int type = sensorEvent.sensor.getType();
            if (type == 4) {
                if (this.f170407g) {
                    float[] fArr = sensorEvent.values;
                    this.f170417q = fArr[0];
                    this.f170418r = fArr[1];
                    this.f170419s = fArr[2];
                    this.f170408h = true;
                }
            } else if (type == 1 && this.f170406f) {
                float[] fArr2 = sensorEvent.values;
                this.f170411k = fArr2[0];
                this.f170412l = fArr2[1];
                this.f170413m = fArr2[2];
                float fNanoTime = System.nanoTime();
                int i11 = this.f170422v + 1;
                this.f170422v = i11;
                float f10 = 1.0f / (i11 / ((fNanoTime - this.f170420t) / 1.0E9f));
                if (Float.isNaN(f10) || Float.isInfinite(f10)) {
                    f10 = 0.0f;
                }
                float f11 = 0.18f / (f10 + 0.18f);
                float[] fArr3 = this.f170421u;
                float f12 = 1.0f - f11;
                fArr3[0] = (fArr3[0] * f11) + (fArr2[0] * f12);
                fArr3[1] = (fArr3[1] * f11) + (fArr2[1] * f12);
                fArr3[2] = (f11 * fArr3[2]) + (f12 * fArr2[2]);
                float[] fArr4 = {0.0f, 0.0f, 0.0f};
                float f13 = fArr2[0] - fArr3[0];
                fArr4[0] = f13;
                fArr4[1] = fArr2[1] - fArr3[1];
                fArr4[2] = fArr2[2] - fArr3[2];
                if (Float.isNaN(f13) || Float.isInfinite(fArr4[0])) {
                    fArr4[0] = 0.0f;
                }
                if (Float.isNaN(fArr4[1]) || Float.isInfinite(fArr4[1])) {
                    fArr4[1] = 0.0f;
                }
                if (Float.isNaN(fArr4[2]) || Float.isInfinite(fArr4[2])) {
                    fArr4[2] = 0.0f;
                }
                float f14 = fArr4[0];
                float f15 = fArr4[1];
                float f16 = fArr4[2];
                this.f170411k *= -1.0f;
                this.f170412l *= -1.0f;
                this.f170413m *= -1.0f;
                this.f170414n = f14 * (-1.0f);
                this.f170415o = f15 * (-1.0f);
                this.f170416p = f16 * (-1.0f);
                this.f170409i = true;
            }
            if (this.f170408h && this.f170409i) {
                long j10 = this.f170405e;
                if (jUptimeMillis - j10 < 100) {
                    if (C18127w.f170600d != 1) {
                        return;
                    }
                }
                long j11 = jUptimeMillis - j10;
                this.f170405e = jUptimeMillis;
                boolean z10 = C18127w.f170600d != 0;
                C18127w.f170600d = 0;
                setChanged();
                try {
                    notifyObservers(new C18100F(this.f170411k, this.f170412l, this.f170413m, this.f170414n, this.f170415o, this.f170416p, this.f170417q, this.f170418r, this.f170419s, this.f170405e, z10 ? 2 : 1, this.f170423w, j11));
                    this.f170408h = !this.f170407g;
                    this.f170409i = !this.f170406f;
                    this.f170423w = false;
                } catch (Exception e11) {
                    e = e11;
                    i10 = 1;
                    Throwable[] thArr2 = new Throwable[i10];
                    thArr2[0] = e;
                    r.d("MotionListener", "Exception in processing motion event", thArr2);
                    C18095A.a(e);
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public C18098D(Application application) {
        try {
            this.f170401a = (SensorManager) application.getSystemService("sensor");
        } catch (Exception e10) {
            r.e("MotionListener", "Exception on getting sensor service", e10);
            C18095A.a(e10);
        }
    }
}
