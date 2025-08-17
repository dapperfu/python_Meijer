package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.Er, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6705Er extends AbstractC6958Md0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f66531a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f66532b;

    /* renamed from: c, reason: collision with root package name */
    private final Display f66533c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f66534d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f66535e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f66536f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f66537g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC6671Dr f66538h;

    final void b(InterfaceC6671Dr interfaceC6671Dr) {
        this.f66538h = interfaceC6671Dr;
    }

    C6705Er(Context context) {
        super("OrientationMonitor", "ads");
        this.f66531a = (SensorManager) context.getSystemService("sensor");
        this.f66533c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f66534d = new float[9];
        this.f66535e = new float[9];
        this.f66532b = new Object();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6958Md0
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f66532b) {
            try {
                if (this.f66536f == null) {
                    this.f66536f = new float[9];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f66534d, fArr);
        int rotation = this.f66533c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f66534d, 2, 129, this.f66535e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f66534d, 129, 130, this.f66535e);
        } else if (rotation != 3) {
            System.arraycopy(this.f66534d, 0, this.f66535e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f66534d, 130, 1, this.f66535e);
        }
        float[] fArr2 = this.f66535e;
        float f10 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f10;
        float f11 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f11;
        float f12 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f12;
        synchronized (this.f66532b) {
            System.arraycopy(this.f66535e, 0, this.f66536f, 0, 9);
        }
        InterfaceC6671Dr interfaceC6671Dr = this.f66538h;
        if (interfaceC6671Dr != null) {
            interfaceC6671Dr.zza();
        }
    }

    final void c() {
        if (this.f66537g != null) {
            return;
        }
        Sensor defaultSensor = this.f66531a.getDefaultSensor(11);
        if (defaultSensor == null) {
            Qc.p.d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        HandlerC6857Jd0 handlerC6857Jd0 = new HandlerC6857Jd0(handlerThread.getLooper());
        this.f66537g = handlerC6857Jd0;
        if (this.f66531a.registerListener(this, defaultSensor, 0, handlerC6857Jd0)) {
            return;
        }
        Qc.p.d("SensorManager.registerListener failed.");
        d();
    }

    final void d() {
        if (this.f66537g == null) {
            return;
        }
        this.f66531a.unregisterListener(this);
        this.f66537g.post(new RunnableC6637Cr(this));
        this.f66537g = null;
    }

    final boolean e(float[] fArr) {
        synchronized (this.f66532b) {
            try {
                float[] fArr2 = this.f66536f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
