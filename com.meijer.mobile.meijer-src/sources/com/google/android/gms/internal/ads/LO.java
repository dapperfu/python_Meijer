package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes6.dex */
public final class LO extends AbstractC7083Md0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f69192a;

    /* renamed from: b, reason: collision with root package name */
    private final Sensor f69193b;

    /* renamed from: c, reason: collision with root package name */
    private float f69194c;

    /* renamed from: d, reason: collision with root package name */
    private Float f69195d;

    /* renamed from: e, reason: collision with root package name */
    private long f69196e;

    /* renamed from: f, reason: collision with root package name */
    private int f69197f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f69198g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f69199h;

    /* renamed from: i, reason: collision with root package name */
    private KO f69200i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f69201j;

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f69201j && (sensorManager = this.f69192a) != null && (sensor = this.f69193b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f69201j = false;
                    Rc.p0.k("Stopped listening for flick gestures.");
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
                if (((Boolean) Oc.A.c().a(C8784lf.f77057X8)).booleanValue()) {
                    if (!this.f69201j && (sensorManager = this.f69192a) != null && (sensor = this.f69193b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f69201j = true;
                        Rc.p0.k("Listening for flick gestures.");
                    }
                    if (this.f69192a == null || this.f69193b == null) {
                        Sc.p.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(KO ko2) {
        this.f69200i = ko2;
    }

    LO(Context context) {
        super("FlickDetector", "ads");
        this.f69194c = 0.0f;
        this.f69195d = Float.valueOf(0.0f);
        this.f69196e = Nc.v.c().a();
        this.f69197f = 0;
        this.f69198g = false;
        this.f69199h = false;
        this.f69200i = null;
        this.f69201j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f69192a = sensorManager;
        if (sensorManager != null) {
            this.f69193b = sensorManager.getDefaultSensor(4);
        } else {
            this.f69193b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7083Md0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77057X8)).booleanValue()) {
            long jA = Nc.v.c().a();
            if (this.f69196e + ((Integer) Oc.A.c().a(C8784lf.f77085Z8)).intValue() < jA) {
                this.f69197f = 0;
                this.f69196e = jA;
                this.f69198g = false;
                this.f69199h = false;
                this.f69194c = this.f69195d.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f69195d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f69195d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f10 = this.f69194c;
            AbstractC7718bf abstractC7718bf = C8784lf.f77071Y8;
            if (fFloatValue > f10 + ((Float) Oc.A.c().a(abstractC7718bf)).floatValue()) {
                this.f69194c = this.f69195d.floatValue();
                this.f69199h = true;
            } else if (this.f69195d.floatValue() < this.f69194c - ((Float) Oc.A.c().a(abstractC7718bf)).floatValue()) {
                this.f69194c = this.f69195d.floatValue();
                this.f69198g = true;
            }
            if (this.f69195d.isInfinite()) {
                this.f69195d = Float.valueOf(0.0f);
                this.f69194c = 0.0f;
            }
            if (this.f69198g && this.f69199h) {
                Rc.p0.k("Flick detected.");
                this.f69196e = jA;
                int i10 = this.f69197f + 1;
                this.f69197f = i10;
                this.f69198g = false;
                this.f69199h = false;
                KO ko2 = this.f69200i;
                if (ko2 != null) {
                    if (i10 == ((Integer) Oc.A.c().a(C8784lf.f77099a9)).intValue()) {
                        ZO zo2 = (ZO) ko2;
                        zo2.i(new XO(zo2), YO.GESTURE);
                    }
                }
            }
        }
    }
}
