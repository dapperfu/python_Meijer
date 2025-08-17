package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.TonemapCurve;
import com.scandit.datacapture.core.internal.module.source.NativeTonemapCurve;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class B0 {

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f124831b = {0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f124832c = {0.0f, 0.0f, 0.0667f, 0.292f, 0.1333f, 0.4002f, 0.2f, 0.4812f, 0.2667f, 0.5484f, 0.3333f, 0.6069f, 0.4f, 0.6594f, 0.4667f, 0.7072f, 0.5333f, 0.7515f, 0.6f, 0.7928f, 0.6667f, 0.8317f, 0.7333f, 0.8685f, 0.8f, 0.9035f, 0.8667f, 0.937f, 0.9333f, 0.9691f, 1.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f124833d = {0.0f, 0.0f, 0.0667f, 0.292f, 0.1333f, 0.4002f, 0.2f, 0.4812f, 0.2667f, 0.5484f, 0.3333f, 0.6069f, 0.4f, 0.6594f, 0.4667f, 0.7072f, 0.5333f, 0.7515f, 0.6f, 0.7928f, 0.6667f, 0.8317f, 0.7333f, 0.8685f, 0.8f, 0.9035f, 0.8667f, 0.937f, 0.9333f, 0.9691f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public NativeTonemapCurve f124834a = NativeTonemapCurve.NONE;

    public final void a(m0 requestSettings, NativeTonemapCurve toneMappingCurve) {
        Intrinsics.j(requestSettings, "requestSettings");
        Intrinsics.j(toneMappingCurve, "toneMappingCurve");
        if (this.f124834a != toneMappingCurve) {
            this.f124834a = toneMappingCurve;
            if (toneMappingCurve == NativeTonemapCurve.NONE) {
                try {
                    CaptureRequest.Key TONEMAP_MODE = CaptureRequest.TONEMAP_MODE;
                    Intrinsics.i(TONEMAP_MODE, "TONEMAP_MODE");
                    requestSettings.a(TONEMAP_MODE, (Object) 1);
                    return;
                } catch (Exception e10) {
                    com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
                    throw e10;
                }
            }
            int i10 = A0.f124829a[toneMappingCurve.ordinal()];
            float[] fArr = i10 != 1 ? i10 != 2 ? i10 != 3 ? null : f124833d : f124832c : f124831b;
            TonemapCurve tonemapCurve = fArr != null ? new TonemapCurve(fArr, fArr, fArr) : null;
            if (tonemapCurve != null) {
                try {
                    CaptureRequest.Key TONEMAP_MODE2 = CaptureRequest.TONEMAP_MODE;
                    Intrinsics.i(TONEMAP_MODE2, "TONEMAP_MODE");
                    requestSettings.a(TONEMAP_MODE2, (Object) 0);
                    CaptureRequest.Key TONEMAP_CURVE = CaptureRequest.TONEMAP_CURVE;
                    Intrinsics.i(TONEMAP_CURVE, "TONEMAP_CURVE");
                    requestSettings.a(TONEMAP_CURVE, tonemapCurve);
                } catch (Exception e11) {
                    com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e11);
                    throw e11;
                }
            }
        }
    }
}
