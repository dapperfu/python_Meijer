package w6;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Observable;

/* renamed from: w6.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17777D extends Observable implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    SensorManager f165756a;

    /* renamed from: b, reason: collision with root package name */
    Sensor f165757b;

    /* renamed from: c, reason: collision with root package name */
    Sensor f165758c;

    /* renamed from: d, reason: collision with root package name */
    HandlerThread f165759d;

    /* renamed from: e, reason: collision with root package name */
    long f165760e = 0;

    /* renamed from: f, reason: collision with root package name */
    boolean f165761f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f165762g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f165763h = false;

    /* renamed from: i, reason: collision with root package name */
    boolean f165764i = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f165765j = false;

    /* renamed from: k, reason: collision with root package name */
    private float f165766k = -1.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f165767l = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f165768m = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f165769n = -1.0f;

    /* renamed from: o, reason: collision with root package name */
    private float f165770o = -1.0f;

    /* renamed from: p, reason: collision with root package name */
    private float f165771p = -1.0f;

    /* renamed from: q, reason: collision with root package name */
    private float f165772q = -1.0f;

    /* renamed from: r, reason: collision with root package name */
    private float f165773r = -1.0f;

    /* renamed from: s, reason: collision with root package name */
    private float f165774s = -1.0f;

    /* renamed from: t, reason: collision with root package name */
    float f165775t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    private final float[] f165776u = {0.0f, 0.0f, 0.0f};

    /* renamed from: v, reason: collision with root package name */
    int f165777v = 0;

    /* renamed from: w, reason: collision with root package name */
    boolean f165778w = true;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void a() throws Exception {
        if (this.f165762g) {
            this.f165756a.unregisterListener(this, this.f165758c);
            this.f165762g = false;
        }
        if (this.f165761f) {
            this.f165756a.unregisterListener(this, this.f165757b);
            this.f165761f = false;
        }
        this.f165765j = false;
        HandlerThread handlerThread = this.f165759d;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f165759d.quitSafely();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10 = 1;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (!this.f165765j) {
                try {
                    if (sensorEvent.accuracy == 0) {
                        r.d("MotionListener", "Unreliable motion sensors data...", new Throwable[0]);
                        this.f165765j = true;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Throwable[] thArr = new Throwable[i10];
                    thArr[0] = e;
                    r.d("MotionListener", "Exception in processing motion event", thArr);
                    C17774A.a(e);
                }
            }
            int type = sensorEvent.sensor.getType();
            if (type == 4) {
                if (this.f165762g) {
                    float[] fArr = sensorEvent.values;
                    this.f165772q = fArr[0];
                    this.f165773r = fArr[1];
                    this.f165774s = fArr[2];
                    this.f165763h = true;
                }
            } else if (type == 1 && this.f165761f) {
                float[] fArr2 = sensorEvent.values;
                this.f165766k = fArr2[0];
                this.f165767l = fArr2[1];
                this.f165768m = fArr2[2];
                float fNanoTime = System.nanoTime();
                int i11 = this.f165777v + 1;
                this.f165777v = i11;
                float f10 = 1.0f / (i11 / ((fNanoTime - this.f165775t) / 1.0E9f));
                if (Float.isNaN(f10) || Float.isInfinite(f10)) {
                    f10 = 0.0f;
                }
                float f11 = 0.18f / (f10 + 0.18f);
                float[] fArr3 = this.f165776u;
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
                this.f165766k *= -1.0f;
                this.f165767l *= -1.0f;
                this.f165768m *= -1.0f;
                this.f165769n = f14 * (-1.0f);
                this.f165770o = f15 * (-1.0f);
                this.f165771p = f16 * (-1.0f);
                this.f165764i = true;
            }
            if (this.f165763h && this.f165764i) {
                long j10 = this.f165760e;
                if (jUptimeMillis - j10 < 100) {
                    if (C17800w.f165955d != 1) {
                        return;
                    }
                }
                long j11 = jUptimeMillis - j10;
                this.f165760e = jUptimeMillis;
                boolean z10 = C17800w.f165955d != 0;
                C17800w.f165955d = 0;
                setChanged();
                try {
                    notifyObservers(new F(this.f165766k, this.f165767l, this.f165768m, this.f165769n, this.f165770o, this.f165771p, this.f165772q, this.f165773r, this.f165774s, this.f165760e, z10 ? 2 : 1, this.f165778w, j11));
                    this.f165763h = !this.f165762g;
                    this.f165764i = !this.f165761f;
                    this.f165778w = false;
                } catch (Exception e11) {
                    e = e11;
                    i10 = 1;
                    Throwable[] thArr2 = new Throwable[i10];
                    thArr2[0] = e;
                    r.d("MotionListener", "Exception in processing motion event", thArr2);
                    C17774A.a(e);
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public C17777D(Application application) {
        try {
            this.f165756a = (SensorManager) application.getSystemService("sensor");
        } catch (Exception e10) {
            r.e("MotionListener", "Exception on getting sensor service", e10);
            C17774A.a(e10);
        }
    }
}
