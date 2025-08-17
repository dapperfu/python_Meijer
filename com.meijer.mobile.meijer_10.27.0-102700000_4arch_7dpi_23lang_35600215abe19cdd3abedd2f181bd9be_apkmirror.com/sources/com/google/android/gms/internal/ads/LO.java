package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes6.dex */
public final class LO extends AbstractC6958Md0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f68352a;

    /* renamed from: b, reason: collision with root package name */
    private final Sensor f68353b;

    /* renamed from: c, reason: collision with root package name */
    private float f68354c;

    /* renamed from: d, reason: collision with root package name */
    private Float f68355d;

    /* renamed from: e, reason: collision with root package name */
    private long f68356e;

    /* renamed from: f, reason: collision with root package name */
    private int f68357f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f68358g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f68359h;

    /* renamed from: i, reason: collision with root package name */
    private KO f68360i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f68361j;

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f68361j && (sensorManager = this.f68352a) != null && (sensor = this.f68353b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f68361j = false;
                    Pc.p0.k("Stopped listening for flick gestures.");
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
                if (((Boolean) Mc.A.c().a(C8659lf.f76217X8)).booleanValue()) {
                    if (!this.f68361j && (sensorManager = this.f68352a) != null && (sensor = this.f68353b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f68361j = true;
                        Pc.p0.k("Listening for flick gestures.");
                    }
                    if (this.f68352a == null || this.f68353b == null) {
                        Qc.p.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(KO ko2) {
        this.f68360i = ko2;
    }

    LO(Context context) {
        super("FlickDetector", "ads");
        this.f68354c = 0.0f;
        this.f68355d = Float.valueOf(0.0f);
        this.f68356e = Lc.v.c().a();
        this.f68357f = 0;
        this.f68358g = false;
        this.f68359h = false;
        this.f68360i = null;
        this.f68361j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f68352a = sensorManager;
        if (sensorManager != null) {
            this.f68353b = sensorManager.getDefaultSensor(4);
        } else {
            this.f68353b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6958Md0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76217X8)).booleanValue()) {
            long jA = Lc.v.c().a();
            if (this.f68356e + ((Integer) Mc.A.c().a(C8659lf.f76245Z8)).intValue() < jA) {
                this.f68357f = 0;
                this.f68356e = jA;
                this.f68358g = false;
                this.f68359h = false;
                this.f68354c = this.f68355d.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f68355d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f68355d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f10 = this.f68354c;
            AbstractC7593bf abstractC7593bf = C8659lf.f76231Y8;
            if (fFloatValue > f10 + ((Float) Mc.A.c().a(abstractC7593bf)).floatValue()) {
                this.f68354c = this.f68355d.floatValue();
                this.f68359h = true;
            } else if (this.f68355d.floatValue() < this.f68354c - ((Float) Mc.A.c().a(abstractC7593bf)).floatValue()) {
                this.f68354c = this.f68355d.floatValue();
                this.f68358g = true;
            }
            if (this.f68355d.isInfinite()) {
                this.f68355d = Float.valueOf(0.0f);
                this.f68354c = 0.0f;
            }
            if (this.f68358g && this.f68359h) {
                Pc.p0.k("Flick detected.");
                this.f68356e = jA;
                int i10 = this.f68357f + 1;
                this.f68357f = i10;
                this.f68358g = false;
                this.f68359h = false;
                KO ko2 = this.f68360i;
                if (ko2 != null) {
                    if (i10 == ((Integer) Mc.A.c().a(C8659lf.f76259a9)).intValue()) {
                        ZO zo2 = (ZO) ko2;
                        zo2.i(new XO(zo2), YO.GESTURE);
                    }
                }
            }
        }
    }
}
