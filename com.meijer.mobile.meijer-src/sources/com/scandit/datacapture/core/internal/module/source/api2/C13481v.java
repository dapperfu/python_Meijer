package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.scandit.datacapture.core.internal.module.source.DirectByteBufferCache;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameterKey;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13481v {

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.source.J f125952a;

    /* renamed from: b, reason: collision with root package name */
    public final C13479t f125953b = new C13479t(this);

    /* renamed from: c, reason: collision with root package name */
    public final DirectByteBufferCache f125954c = new DirectByteBufferCache();

    public C13481v(int i10) {
        this.f125952a = new com.scandit.datacapture.core.internal.module.source.J(i10);
    }

    public static final void a(C13481v c13481v, NativeCameraCaptureParameters nativeCameraCaptureParameters, F f10, CameraApi2Info cameraApi2Info) {
        Float fValueOf;
        com.scandit.datacapture.core.internal.module.source.L l10;
        Float f11;
        c13481v.getClass();
        if (f10 != null) {
            G g10 = (G) f10;
            if (((Long) g10.f125798a.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
                fValueOf = Float.valueOf((float) (r7.longValue() * 1.0E-9d));
            } else {
                fValueOf = null;
            }
            if (fValueOf != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.EXPOSURE_TIME, fValueOf.floatValue());
            }
            Float f12 = (Float) g10.f125798a.get(CaptureResult.LENS_APERTURE);
            if (f12 != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.F_NUMBER, f12.floatValue());
            }
            TotalCaptureResult totalCaptureResult = g10.f125798a;
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            boolean z10 = true;
            if (num == null) {
                l10 = com.scandit.datacapture.core.internal.module.source.L.f125740a;
            } else {
                int iIntValue = num.intValue();
                if (iIntValue != 0) {
                    if (iIntValue != 3) {
                        if (iIntValue != 4) {
                            if (iIntValue != 5) {
                                l10 = com.scandit.datacapture.core.internal.module.source.L.f125740a;
                            } else {
                                l10 = com.scandit.datacapture.core.internal.module.source.L.f125743d;
                            }
                        } else {
                            l10 = com.scandit.datacapture.core.internal.module.source.L.f125742c;
                        }
                    } else {
                        l10 = com.scandit.datacapture.core.internal.module.source.L.f125741b;
                    }
                } else {
                    Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.CONTROL_AF_MODE);
                    Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.LENS_STATE);
                    Float f13 = (Float) totalCaptureResult.get(CaptureResult.LENS_FOCUS_DISTANCE);
                    Float f14 = (Float) totalCaptureResult.getRequest().get(CaptureRequest.LENS_FOCUS_DISTANCE);
                    if (num2 != null && num3 != null && f13 != null && f14 != null) {
                        if (num2.intValue() != 0) {
                            l10 = com.scandit.datacapture.core.internal.module.source.L.f125740a;
                        } else if (num3.intValue() == 1) {
                            l10 = com.scandit.datacapture.core.internal.module.source.L.f125741b;
                        } else if (Math.abs(f14.floatValue() - f13.floatValue()) < 0.05f) {
                            l10 = com.scandit.datacapture.core.internal.module.source.L.f125744e;
                        } else {
                            l10 = com.scandit.datacapture.core.internal.module.source.L.f125745f;
                        }
                    } else {
                        l10 = com.scandit.datacapture.core.internal.module.source.L.f125745f;
                    }
                }
            }
            if (l10 == com.scandit.datacapture.core.internal.module.source.L.f125744e) {
                f11 = (Float) g10.f125798a.getRequest().get(CaptureRequest.LENS_FOCUS_DISTANCE);
            } else {
                f11 = (Float) g10.f125798a.get(CaptureResult.LENS_FOCUS_DISTANCE);
            }
            if (f11 != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.LENS_FOCUSING_DISTANCE, f11.floatValue());
            }
            float[] fArrC = g10.c();
            if (fArrC != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.FOCAL_LENGTH_IN_PIXELS_X, fArrC[0]);
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.FOCAL_LENGTH_IN_PIXELS_Y, fArrC[1]);
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.PRINCIPAL_POINT_IN_PIXELS_X, fArrC[2]);
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.PRINCIPAL_POINT_IN_PIXELS_Y, fArrC[3]);
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.AXIS_SKEW, fArrC[4]);
            }
            if (((Integer) g10.f125798a.get(CaptureResult.SENSOR_SENSITIVITY)) != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.ISO, r7.intValue());
            }
            Integer num4 = (Integer) g10.f125798a.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
            if (num4 != null) {
                nativeCameraCaptureParameters.insertFloat(NativeCameraCaptureParameterKey.EXPOSURE_BIAS_VALUE, cameraApi2Info.getCompensationStep().floatValue() * num4.intValue());
            }
            Integer num5 = (Integer) g10.f125798a.get(CaptureResult.FLASH_STATE);
            if (num5 != null) {
                int iIntValue2 = num5.intValue();
                if (iIntValue2 != 4 && iIntValue2 != 3) {
                    z10 = false;
                }
                nativeCameraCaptureParameters.insertBool(NativeCameraCaptureParameterKey.FLASH_ENABLED, z10);
            }
        }
    }
}
