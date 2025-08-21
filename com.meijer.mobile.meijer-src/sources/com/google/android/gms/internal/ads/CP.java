package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes6.dex */
public final class CP extends AbstractC7083Md0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f66614a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f66615b;

    /* renamed from: c, reason: collision with root package name */
    private Sensor f66616c;

    /* renamed from: d, reason: collision with root package name */
    private long f66617d;

    /* renamed from: e, reason: collision with root package name */
    private int f66618e;

    /* renamed from: f, reason: collision with root package name */
    private BP f66619f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f66620g;

    public final void b() {
        synchronized (this) {
            try {
                if (this.f66620g) {
                    SensorManager sensorManager = this.f66615b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f66616c);
                        Rc.p0.k("Stopped listening for shake gestures.");
                    }
                    this.f66620g = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) Oc.A.c().a(C8784lf.f76987S8)).booleanValue()) {
                    if (this.f66615b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f66614a.getSystemService("sensor");
                        this.f66615b = sensorManager2;
                        if (sensorManager2 == null) {
                            Sc.p.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f66616c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f66620g && (sensorManager = this.f66615b) != null && (sensor = this.f66616c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f66617d = Nc.v.c().a() - ((Integer) Oc.A.c().a(C8784lf.f77015U8)).intValue();
                        this.f66620g = true;
                        Rc.p0.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(BP bp2) {
        this.f66619f = bp2;
    }

    CP(Context context) {
        super("ShakeDetector", "ads");
        this.f66614a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7083Md0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76987S8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12))) >= ((Float) Oc.A.c().a(C8784lf.f77001T8)).floatValue()) {
                long jA = Nc.v.c().a();
                if (this.f66617d + ((Integer) Oc.A.c().a(C8784lf.f77015U8)).intValue() <= jA) {
                    if (this.f66617d + ((Integer) Oc.A.c().a(C8784lf.f77029V8)).intValue() < jA) {
                        this.f66618e = 0;
                    }
                    Rc.p0.k("Shake detected.");
                    this.f66617d = jA;
                    int i10 = this.f66618e + 1;
                    this.f66618e = i10;
                    BP bp2 = this.f66619f;
                    if (bp2 != null) {
                        if (i10 == ((Integer) Oc.A.c().a(C8784lf.f77043W8)).intValue()) {
                            ZO zo2 = (ZO) bp2;
                            zo2.i(new WO(zo2), YO.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
