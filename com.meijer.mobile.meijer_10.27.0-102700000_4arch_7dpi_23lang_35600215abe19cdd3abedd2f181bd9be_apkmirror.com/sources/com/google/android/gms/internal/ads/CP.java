package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes6.dex */
public final class CP extends AbstractC6958Md0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f65774a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f65775b;

    /* renamed from: c, reason: collision with root package name */
    private Sensor f65776c;

    /* renamed from: d, reason: collision with root package name */
    private long f65777d;

    /* renamed from: e, reason: collision with root package name */
    private int f65778e;

    /* renamed from: f, reason: collision with root package name */
    private BP f65779f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f65780g;

    public final void b() {
        synchronized (this) {
            try {
                if (this.f65780g) {
                    SensorManager sensorManager = this.f65775b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f65776c);
                        Pc.p0.k("Stopped listening for shake gestures.");
                    }
                    this.f65780g = false;
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
                if (((Boolean) Mc.A.c().a(C8659lf.f76147S8)).booleanValue()) {
                    if (this.f65775b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f65774a.getSystemService("sensor");
                        this.f65775b = sensorManager2;
                        if (sensorManager2 == null) {
                            Qc.p.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f65776c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f65780g && (sensorManager = this.f65775b) != null && (sensor = this.f65776c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f65777d = Lc.v.c().a() - ((Integer) Mc.A.c().a(C8659lf.f76175U8)).intValue();
                        this.f65780g = true;
                        Pc.p0.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(BP bp2) {
        this.f65779f = bp2;
    }

    CP(Context context) {
        super("ShakeDetector", "ads");
        this.f65774a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6958Md0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76147S8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12))) >= ((Float) Mc.A.c().a(C8659lf.f76161T8)).floatValue()) {
                long jA = Lc.v.c().a();
                if (this.f65777d + ((Integer) Mc.A.c().a(C8659lf.f76175U8)).intValue() <= jA) {
                    if (this.f65777d + ((Integer) Mc.A.c().a(C8659lf.f76189V8)).intValue() < jA) {
                        this.f65778e = 0;
                    }
                    Pc.p0.k("Shake detected.");
                    this.f65777d = jA;
                    int i10 = this.f65778e + 1;
                    this.f65778e = i10;
                    BP bp2 = this.f65779f;
                    if (bp2 != null) {
                        if (i10 == ((Integer) Mc.A.c().a(C8659lf.f76203W8)).intValue()) {
                            ZO zo2 = (ZO) bp2;
                            zo2.i(new WO(zo2), YO.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
