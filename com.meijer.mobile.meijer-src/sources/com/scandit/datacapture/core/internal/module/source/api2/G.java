package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.RggbChannelVector;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class G implements F {

    /* renamed from: a, reason: collision with root package name */
    public final TotalCaptureResult f125798a;

    public G(TotalCaptureResult totalCaptureResult) {
        Intrinsics.j(totalCaptureResult, "totalCaptureResult");
        this.f125798a = totalCaptureResult;
    }

    public final Integer a() {
        return (Integer) this.f125798a.get(CaptureResult.CONTROL_AF_MODE);
    }

    public final RggbChannelVector b() {
        return (RggbChannelVector) this.f125798a.get(CaptureResult.COLOR_CORRECTION_GAINS);
    }

    public final float[] c() {
        return (float[]) this.f125798a.get(CaptureResult.LENS_INTRINSIC_CALIBRATION);
    }

    public final Float d() {
        return (Float) this.f125798a.get(CaptureResult.LENS_FOCUS_DISTANCE);
    }

    public final Long e() {
        return (Long) this.f125798a.get(CaptureResult.SENSOR_EXPOSURE_TIME);
    }

    public final Integer f() {
        return (Integer) this.f125798a.get(CaptureResult.SENSOR_SENSITIVITY);
    }
}
