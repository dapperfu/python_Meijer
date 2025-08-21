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
final class C6830Er extends AbstractC7083Md0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f67371a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f67372b;

    /* renamed from: c, reason: collision with root package name */
    private final Display f67373c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f67374d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f67375e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f67376f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f67377g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC6796Dr f67378h;

    final void b(InterfaceC6796Dr interfaceC6796Dr) {
        this.f67378h = interfaceC6796Dr;
    }

    C6830Er(Context context) {
        super("OrientationMonitor", "ads");
        this.f67371a = (SensorManager) context.getSystemService("sensor");
        this.f67373c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f67374d = new float[9];
        this.f67375e = new float[9];
        this.f67372b = new Object();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7083Md0
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f67372b) {
            try {
                if (this.f67376f == null) {
                    this.f67376f = new float[9];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f67374d, fArr);
        int rotation = this.f67373c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f67374d, 2, 129, this.f67375e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f67374d, 129, 130, this.f67375e);
        } else if (rotation != 3) {
            System.arraycopy(this.f67374d, 0, this.f67375e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f67374d, 130, 1, this.f67375e);
        }
        float[] fArr2 = this.f67375e;
        float f10 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f10;
        float f11 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f11;
        float f12 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f12;
        synchronized (this.f67372b) {
            System.arraycopy(this.f67375e, 0, this.f67376f, 0, 9);
        }
        InterfaceC6796Dr interfaceC6796Dr = this.f67378h;
        if (interfaceC6796Dr != null) {
            interfaceC6796Dr.zza();
        }
    }

    final void c() {
        if (this.f67377g != null) {
            return;
        }
        Sensor defaultSensor = this.f67371a.getDefaultSensor(11);
        if (defaultSensor == null) {
            Sc.p.d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        HandlerC6982Jd0 handlerC6982Jd0 = new HandlerC6982Jd0(handlerThread.getLooper());
        this.f67377g = handlerC6982Jd0;
        if (this.f67371a.registerListener(this, defaultSensor, 0, handlerC6982Jd0)) {
            return;
        }
        Sc.p.d("SensorManager.registerListener failed.");
        d();
    }

    final void d() {
        if (this.f67377g == null) {
            return;
        }
        this.f67371a.unregisterListener(this);
        this.f67377g.post(new RunnableC6762Cr(this));
        this.f67377g = null;
    }

    final boolean e(float[] fArr) {
        synchronized (this.f67372b) {
            try {
                float[] fArr2 = this.f67376f;
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
