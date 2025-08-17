package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import com.fullstory.FS;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeCameraDelegateSettings;
import com.scandit.datacapture.core.internal.module.source.NativeEdgeEnhancement;
import com.scandit.datacapture.core.internal.module.source.NativeMacroAfMode;
import com.scandit.datacapture.core.internal.module.source.NativeNoiseReduction;
import com.scandit.datacapture.core.internal.module.source.NativeTonemapCurve;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.TorchState;
import du.C13578f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final N f124933a;

    /* renamed from: b, reason: collision with root package name */
    public final W f124934b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f124935c;

    /* renamed from: d, reason: collision with root package name */
    public final B0 f124936d;

    /* renamed from: e, reason: collision with root package name */
    public NativeCameraDelegateSettings f124937e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f124938f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124939g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f124940h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f124941i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124942j;

    /* renamed from: k, reason: collision with root package name */
    public int f124943k;

    /* renamed from: l, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.utils.a f124944l;

    public final void a(Boolean bool) {
        this.f124938f = bool;
        CaptureRequest.Key FLASH_MODE = CaptureRequest.FLASH_MODE;
        Intrinsics.i(FLASH_MODE, "FLASH_MODE");
        a(FLASH_MODE, Integer.valueOf(bool.booleanValue() ? 2 : 0));
    }

    public final void b() {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        e0.a(key, "CONTROL_AF_TRIGGER", 0, this, key);
    }

    public m0(O cameraInfo) {
        Z cameraTorchController = new Z(cameraInfo);
        Intrinsics.j(cameraInfo, "cameraInfo");
        Intrinsics.j(cameraTorchController, "cameraTorchController");
        this.f124933a = cameraInfo;
        this.f124934b = cameraTorchController;
        this.f124935c = new f0();
        this.f124936d = new B0();
        this.f124944l = new com.scandit.datacapture.core.internal.module.utils.a();
        CameraSettings cameraSettings = cameraInfo.f124854c;
        Object property = cameraSettings != null ? cameraSettings.getProperty("xcoverInitialLensPosition") : null;
        Integer num = property instanceof Integer ? (Integer) property : null;
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue > 0) {
            a(AbstractC13325a.f124883a, Integer.valueOf(iIntValue));
        }
    }

    public final void c(Rect rect) {
        CaptureRequest.Key CONTROL_AF_REGIONS = CaptureRequest.CONTROL_AF_REGIONS;
        Intrinsics.i(CONTROL_AF_REGIONS, "CONTROL_AF_REGIONS");
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = ((O) this.f124933a).f124855d;
        CameraCharacteristics.Key CONTROL_MAX_REGIONS_AF = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        Intrinsics.i(CONTROL_MAX_REGIONS_AF, "CONTROL_MAX_REGIONS_AF");
        Integer num = (Integer) cameraCharacteristicsWrapper.get(CONTROL_MAX_REGIONS_AF);
        a(CONTROL_AF_REGIONS, a(rect, num != null ? num.intValue() : 0));
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        e0.a(key, "CONTROL_AF_MODE", 1, this, key);
        a(rect);
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_TRIGGER;
        e0.a(key2, "CONTROL_AF_TRIGGER", 1, this, key2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.e(m0Var.f124944l, this.f124944l) && Intrinsics.e(m0Var.f124938f, this.f124938f) && m0Var.f124939g == this.f124939g && m0Var.f124942j == this.f124942j && m0Var.f124940h == this.f124940h && Intrinsics.e(m0Var.f124941i, this.f124941i);
    }

    public final int hashCode() {
        return com.scandit.datacapture.core.internal.module.utils.g.a(com.scandit.datacapture.core.internal.module.utils.g.a(com.scandit.datacapture.core.internal.module.utils.g.a(com.scandit.datacapture.core.internal.module.utils.g.a(com.scandit.datacapture.core.internal.module.utils.g.a(com.scandit.datacapture.core.internal.module.utils.g.a(0, this.f124944l), this.f124938f), Boolean.valueOf(this.f124939g)), Boolean.valueOf(this.f124942j)), Boolean.valueOf(this.f124940h)), this.f124941i);
    }

    public final void b(Rect rect) {
        CaptureRequest.Key CONTROL_AF_REGIONS = CaptureRequest.CONTROL_AF_REGIONS;
        Intrinsics.i(CONTROL_AF_REGIONS, "CONTROL_AF_REGIONS");
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = ((O) this.f124933a).f124855d;
        CameraCharacteristics.Key CONTROL_MAX_REGIONS_AF = CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        Intrinsics.i(CONTROL_MAX_REGIONS_AF, "CONTROL_MAX_REGIONS_AF");
        Integer num = (Integer) cameraCharacteristicsWrapper.get(CONTROL_MAX_REGIONS_AF);
        a(CONTROL_AF_REGIONS, a(rect, num != null ? num.intValue() : 0));
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        e0.a(key, "CONTROL_AF_MODE", 4, this, key);
        a(rect);
        CaptureRequest.Key CONTROL_AF_TRIGGER = CaptureRequest.CONTROL_AF_TRIGGER;
        Intrinsics.i(CONTROL_AF_TRIGGER, "CONTROL_AF_TRIGGER");
        a(CONTROL_AF_TRIGGER, (Object) null);
    }

    public final void a(CaptureRequest.Key key, Object obj) {
        Intrinsics.j(key, "key");
        if (obj == null) {
            this.f124944l.remove(key);
        } else {
            this.f124944l.put(key, obj);
        }
    }

    public final void a(NativeCameraDelegateSettings delegateSettings) {
        int i10;
        float zoomFactor;
        Intrinsics.j(delegateSettings, "delegateSettings");
        this.f124937e = delegateSettings;
        N cameraInfo = this.f124933a;
        float exposureTargetBias = delegateSettings.getExposureTargetBias();
        O o10 = (O) cameraInfo;
        if (o10.f124852a.f()) {
            CameraCharacteristicsWrapper cameraCharacteristicsWrapper = o10.f124855d;
            CameraCharacteristics.Key CONTROL_AE_COMPENSATION_RANGE = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
            Intrinsics.i(CONTROL_AE_COMPENSATION_RANGE, "CONTROL_AE_COMPENSATION_RANGE");
            Range range = (Range) cameraCharacteristicsWrapper.get(CONTROL_AE_COMPENSATION_RANGE);
            if (range != null) {
                CameraCharacteristicsWrapper cameraCharacteristicsWrapper2 = o10.f124855d;
                CameraCharacteristics.Key CONTROL_AE_COMPENSATION_STEP = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
                Intrinsics.i(CONTROL_AE_COMPENSATION_STEP, "CONTROL_AE_COMPENSATION_STEP");
                Rational rational = (Rational) cameraCharacteristicsWrapper2.get(CONTROL_AE_COMPENSATION_STEP);
                if (rational != null) {
                    Integer num = (Integer) range.getLower();
                    Integer num2 = (Integer) range.getUpper();
                    if ((num == null || num.intValue() != 0 || num2 == null || num2.intValue() != 0) && !rational.isZero() && rational.isFinite()) {
                        int iD = MathKt.d(exposureTargetBias / rational.floatValue());
                        Intrinsics.g(num);
                        int iIntValue = num.intValue();
                        Intrinsics.g(num2);
                        int iO = RangesKt.o(iD, iIntValue, num2.intValue());
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
                        e0.a(key, "CONTROL_AE_EXPOSURE_COMPENSATION", iO, this, key);
                    } else {
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
                        e0.a(key2, "CONTROL_AE_EXPOSURE_COMPENSATION", 0, this, key2);
                    }
                } else {
                    throw new IllegalArgumentException("Exposure compensation step should be non-null on all devices.");
                }
            } else {
                throw new IllegalArgumentException("Exposure compensation range should be non-null on all devices.");
            }
        } else {
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            e0.a(key3, "CONTROL_AE_EXPOSURE_COMPENSATION", 0, this, key3);
        }
        NativeEdgeEnhancement edgeEnhancementMode = delegateSettings.getEdgeEnhancementMode();
        Intrinsics.i(edgeEnhancementMode, "getEdgeEnhancementMode(...)");
        int i11 = l0.f124926b[edgeEnhancementMode.ordinal()];
        if (i11 == 1) {
            i10 = 0;
        } else if (i11 == 2) {
            i10 = 1;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 2;
        }
        CaptureRequest.Key key4 = CaptureRequest.EDGE_MODE;
        e0.a(key4, "EDGE_MODE", i10, this, key4);
        f0 f0Var = this.f124935c;
        f0Var.getClass();
        Intrinsics.j(this, "requestSettings");
        CaptureRequest.Key key5 = CaptureRequest.CONTROL_AWB_MODE;
        e0.a(key5, "CONTROL_AWB_MODE", 1, this, key5);
        f0Var.f124899b = false;
        if (delegateSettings.getDisablePostProcessing()) {
            e0.a(key4, "EDGE_MODE", 0, this, key4);
            CaptureRequest.Key key6 = CaptureRequest.NOISE_REDUCTION_MODE;
            e0.a(key6, "NOISE_REDUCTION_MODE", 0, this, key6);
            try {
                this.f124941i = 0;
            } catch (Exception unused) {
            }
        }
        if (delegateSettings.getEnableSensorPixelModeMaximumResolution() && Build.VERSION.SDK_INT >= 31) {
            CaptureRequest.Key key7 = CaptureRequest.SENSOR_PIXEL_MODE;
            e0.a(key7, "SENSOR_PIXEL_MODE", 1, this, key7);
        }
        CameraProfile cameraProfile = o10.f124852a;
        int sharpnessStrength = delegateSettings.getSharpnessStrength();
        if (sharpnessStrength < 0) {
            sharpnessStrength = cameraProfile.a().f124232g;
        }
        if (sharpnessStrength >= 0) {
            try {
                this.f124941i = Integer.valueOf(sharpnessStrength);
            } catch (Exception unused2) {
            }
        }
        NativeNoiseReduction noiseReductionMode = delegateSettings.getNoiseReductionMode();
        Intrinsics.i(noiseReductionMode, "getNoiseReductionMode(...)");
        int i12 = l0.f124927c[noiseReductionMode.ordinal()];
        if (i12 == 1) {
            CaptureRequest.Key key8 = CaptureRequest.NOISE_REDUCTION_MODE;
            e0.a(key8, "NOISE_REDUCTION_MODE", 0, this, key8);
        } else if (i12 == 2) {
            CaptureRequest.Key key9 = CaptureRequest.NOISE_REDUCTION_MODE;
            e0.a(key9, "NOISE_REDUCTION_MODE", 1, this, key9);
        } else if (i12 == 3) {
            CaptureRequest.Key key10 = CaptureRequest.NOISE_REDUCTION_MODE;
            e0.a(key10, "NOISE_REDUCTION_MODE", 2, this, key10);
        }
        int sensorSensitivity = delegateSettings.getSensorSensitivity();
        CaptureRequest.Key SENSOR_SENSITIVITY = CaptureRequest.SENSOR_SENSITIVITY;
        Intrinsics.i(SENSOR_SENSITIVITY, "SENSOR_SENSITIVITY");
        a(SENSOR_SENSITIVITY, sensorSensitivity > 0 ? Integer.valueOf(sensorSensitivity) : null);
        CameraProfile cameraProfile2 = o10.f124852a;
        NativeMacroAfMode macroAutofocusMode = delegateSettings.getMacroAutofocusMode();
        Intrinsics.i(macroAutofocusMode, "getMacroAutofocusMode(...)");
        if (macroAutofocusMode == NativeMacroAfMode.MACRO ? cameraProfile2.d() : false) {
            NativeMacroAfMode macroAutofocusMode2 = delegateSettings.getMacroAutofocusMode();
            Intrinsics.i(macroAutofocusMode2, "getMacroAutofocusMode(...)");
            float f10 = o10.f() - 1.5f;
            int i13 = l0.f124928d[macroAutofocusMode2.ordinal()];
            if (i13 == 1) {
                CaptureRequest.Key key11 = CaptureRequest.CONTROL_AF_MODE;
                e0.a(key11, "CONTROL_AF_MODE", 2, this, key11);
                CaptureRequest.Key key12 = CaptureRequest.CONTROL_AF_TRIGGER;
                e0.a(key12, "CONTROL_AF_TRIGGER", 1, this, key12);
            } else if (i13 != 2) {
                String message = "Macro Autofocus Mode is not supported: " + macroAutofocusMode2;
                Intrinsics.j(message, "message");
                FS.log_e("sdc-core", message);
            } else {
                CaptureRequest.Key key13 = CaptureRequest.CONTROL_AF_MODE;
                e0.a(key13, "CONTROL_AF_MODE", 0, this, key13);
                CaptureRequest.Key LENS_FOCUS_DISTANCE = CaptureRequest.LENS_FOCUS_DISTANCE;
                Intrinsics.i(LENS_FOCUS_DISTANCE, "LENS_FOCUS_DISTANCE");
                a(LENS_FOCUS_DISTANCE, Float.valueOf(f10));
            }
        }
        NativeJsonValue properties = delegateSettings.getProperties();
        if (properties != null) {
            if (properties.contains("multiFrameNoiseReduction")) {
                int boolForKey = properties.getBoolForKey("multiFrameNoiseReduction");
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        a(C13578f.a("org.codeaurora.qcamera3.sessionParameters.enableMFNR", int[].class), new int[]{boolForKey});
                    } catch (Exception unused3) {
                        com.scandit.datacapture.core.internal.module.utils.i.a("could not set ".concat("org.codeaurora.qcamera3.sessionParameters.enableMFNR"));
                    }
                }
            }
            if (properties.contains("contrastLevel")) {
                int intForKey = properties.getIntForKey("contrastLevel");
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        a(C13578f.a("org.codeaurora.qcamera3.contrast.level", int[].class), new int[]{intForKey});
                    } catch (Exception unused4) {
                        com.scandit.datacapture.core.internal.module.utils.i.a("could not set ".concat("org.codeaurora.qcamera3.contrast.level"));
                    }
                }
            }
        }
        Intrinsics.j(delegateSettings, "delegateSettings");
        Intrinsics.j(cameraInfo, "cameraInfo");
        NativeJsonValue properties2 = delegateSettings.getProperties();
        if (properties2 != null ? properties2.getBoolForKeyOrDefault("ultraWideModeEnabled", false) : false) {
            zoomFactor = delegateSettings.getZoomFactor() * ((Number) o10.b().getStart()).floatValue();
        } else {
            zoomFactor = delegateSettings.getZoomFactor();
        }
        float fFloatValue = ((Number) RangesKt.s(Float.valueOf(zoomFactor), o10.b())).floatValue();
        if (Build.VERSION.SDK_INT >= 30) {
            CaptureRequest.Key CONTROL_ZOOM_RATIO = CaptureRequest.CONTROL_ZOOM_RATIO;
            Intrinsics.i(CONTROL_ZOOM_RATIO, "CONTROL_ZOOM_RATIO");
            a(CONTROL_ZOOM_RATIO, Float.valueOf(zoomFactor));
        } else {
            CameraCharacteristicsWrapper cameraCharacteristicsWrapper3 = o10.f124855d;
            CameraCharacteristics.Key SENSOR_INFO_ACTIVE_ARRAY_SIZE = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
            Intrinsics.i(SENSOR_INFO_ACTIVE_ARRAY_SIZE, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
            android.graphics.Rect rect = (android.graphics.Rect) cameraCharacteristicsWrapper3.get(SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect == null) {
                rect = new android.graphics.Rect();
            }
            int iWidth = (int) (rect.width() / fFloatValue);
            int iHeight = (int) (rect.height() / fFloatValue);
            int iWidth2 = (rect.width() - iWidth) / 2;
            int iHeight2 = (rect.height() - iHeight) / 2;
            if (o10.f124852a.a().f124231f && rect.left - iWidth2 < 16 && rect.top - iHeight2 < 16 && rect.width() - iWidth < 32 && rect.height() - iHeight < 32) {
                iWidth = rect.width() - 32;
                iHeight = rect.height() - 32;
                iWidth2 = rect.left + 16;
                iHeight2 = rect.top + 16;
            }
            android.graphics.Rect rect2 = new android.graphics.Rect(iWidth2, iHeight2, iWidth + iWidth2, iHeight + iHeight2);
            CaptureRequest.Key SCALER_CROP_REGION = CaptureRequest.SCALER_CROP_REGION;
            Intrinsics.i(SCALER_CROP_REGION, "SCALER_CROP_REGION");
            a(SCALER_CROP_REGION, rect2);
        }
        TorchState torchState = delegateSettings.getTorchState();
        Intrinsics.i(torchState, "getTorchState(...)");
        int i14 = l0.f124929e[torchState.ordinal()];
        if (i14 == 1) {
            this.f124939g = false;
            a(Boolean.FALSE);
        } else if (i14 == 2) {
            this.f124939g = false;
            a(Boolean.TRUE);
        } else if (i14 == 3) {
            this.f124939g = true;
            if (this.f124938f == null) {
                a(Boolean.FALSE);
            }
        }
        boolean colorCorrection = delegateSettings.getColorCorrection();
        this.f124942j = colorCorrection;
        this.f124935c.a(this, colorCorrection);
        NativeTonemapCurve toneMappingCurve = delegateSettings.getToneMappingCurve();
        Intrinsics.i(toneMappingCurve, "getToneMappingCurve(...)");
        this.f124936d.a(this, toneMappingCurve);
        a(delegateSettings, (O) this.f124933a, this.f124940h);
    }

    public final void a() {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        e0.a(key, "CONTROL_AF_MODE", 1, this, key);
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_TRIGGER;
        e0.a(key2, "CONTROL_AF_TRIGGER", 2, this, key2);
    }

    public final void a(float f10) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        e0.a(key, "CONTROL_AF_MODE", 0, this, key);
        CaptureRequest.Key LENS_FOCUS_DISTANCE = CaptureRequest.LENS_FOCUS_DISTANCE;
        Intrinsics.i(LENS_FOCUS_DISTANCE, "LENS_FOCUS_DISTANCE");
        a(LENS_FOCUS_DISTANCE, Float.valueOf(((O) this.f124933a).e() + ((1.0f - f10) * (((O) this.f124933a).f() - ((O) this.f124933a).e()))));
    }

    public final void a(NativeCameraDelegateSettings nativeCameraDelegateSettings, O o10, boolean z10) {
        CaptureRequest.Key CONTROL_MODE = CaptureRequest.CONTROL_MODE;
        Intrinsics.i(CONTROL_MODE, "CONTROL_MODE");
        a(CONTROL_MODE, (Object) null);
        CaptureRequest.Key CONTROL_AE_MODE = CaptureRequest.CONTROL_AE_MODE;
        Intrinsics.i(CONTROL_AE_MODE, "CONTROL_AE_MODE");
        a(CONTROL_AE_MODE, (Object) null);
        CaptureRequest.Key SENSOR_EXPOSURE_TIME = CaptureRequest.SENSOR_EXPOSURE_TIME;
        Intrinsics.i(SENSOR_EXPOSURE_TIME, "SENSOR_EXPOSURE_TIME");
        a(SENSOR_EXPOSURE_TIME, (Object) null);
        CaptureRequest.Key SENSOR_FRAME_DURATION = CaptureRequest.SENSOR_FRAME_DURATION;
        Intrinsics.i(SENSOR_FRAME_DURATION, "SENSOR_FRAME_DURATION");
        a(SENSOR_FRAME_DURATION, (Object) null);
        CaptureRequest.Key CONTROL_AE_TARGET_FPS_RANGE = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        Intrinsics.i(CONTROL_AE_TARGET_FPS_RANGE, "CONTROL_AE_TARGET_FPS_RANGE");
        a(CONTROL_AE_TARGET_FPS_RANGE, (Object) null);
        if (nativeCameraDelegateSettings.getExposureDuration() <= 0 && nativeCameraDelegateSettings.getFrameDuration() <= 0) {
            if (nativeCameraDelegateSettings.getMinFrameRate() > 0.0f) {
                Range rangeA = com.scandit.datacapture.core.internal.module.source.Q.a(o10.f124852a, nativeCameraDelegateSettings.getMaxFrameRate(), o10.f124855d.getAutoExposureAvailableFrameRateRanges(), z10, NativeCameraApi.CAMERA2, nativeCameraDelegateSettings.getPreferredFrameRateRange());
                if (rangeA != null) {
                    Intrinsics.i(CONTROL_AE_TARGET_FPS_RANGE, "CONTROL_AE_TARGET_FPS_RANGE");
                    a(CONTROL_AE_TARGET_FPS_RANGE, rangeA);
                    return;
                }
                return;
            }
            return;
        }
        long exposureDuration = nativeCameraDelegateSettings.getExposureDuration();
        long frameDuration = nativeCameraDelegateSettings.getFrameDuration();
        e0.a(CONTROL_MODE, "CONTROL_MODE", 1, this, CONTROL_MODE);
        e0.a(CONTROL_AE_MODE, "CONTROL_AE_MODE", 0, this, CONTROL_AE_MODE);
        if (exposureDuration > 0) {
            Intrinsics.i(SENSOR_EXPOSURE_TIME, "SENSOR_EXPOSURE_TIME");
            a(SENSOR_EXPOSURE_TIME, Long.valueOf(exposureDuration));
        }
        if (frameDuration > 0) {
            Intrinsics.i(SENSOR_FRAME_DURATION, "SENSOR_FRAME_DURATION");
            a(SENSOR_FRAME_DURATION, Long.valueOf(frameDuration));
        }
    }

    public final void a(Rect rect) {
        NativeCameraDelegateSettings nativeCameraDelegateSettings = this.f124937e;
        if ((nativeCameraDelegateSettings != null ? nativeCameraDelegateSettings.getExposureDuration() : 0L) <= 0) {
            NativeCameraDelegateSettings nativeCameraDelegateSettings2 = this.f124937e;
            if ((nativeCameraDelegateSettings2 != null ? nativeCameraDelegateSettings2.getFrameDuration() : 0L) <= 0) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                e0.a(key, "CONTROL_AE_MODE", 1, this, key);
                CaptureRequest.Key CONTROL_AE_REGIONS = CaptureRequest.CONTROL_AE_REGIONS;
                Intrinsics.i(CONTROL_AE_REGIONS, "CONTROL_AE_REGIONS");
                CameraCharacteristicsWrapper cameraCharacteristicsWrapper = ((O) this.f124933a).f124855d;
                CameraCharacteristics.Key CONTROL_MAX_REGIONS_AE = CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
                Intrinsics.i(CONTROL_MAX_REGIONS_AE, "CONTROL_MAX_REGIONS_AE");
                Integer num = (Integer) cameraCharacteristicsWrapper.get(CONTROL_MAX_REGIONS_AE);
                a(CONTROL_AE_REGIONS, a(rect, num != null ? num.intValue() : 0));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    public final CaptureRequest a(CaptureRequest.Builder requestBuilder) {
        CaptureRequest.Key next;
        CaptureRequest.Key keyA;
        Intrinsics.j(requestBuilder, "requestBuilder");
        Integer num = this.f124941i;
        if (num != null) {
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= 29) {
                keyA = C13578f.a("org.codeaurora.qcamera3.sharpness.strength", int[].class);
            } else {
                CaptureRequest captureRequestBuild = requestBuilder.build();
                Intrinsics.i(captureRequestBuild, "build(...)");
                List<CaptureRequest.Key<?>> keys = captureRequestBuild.getKeys();
                Intrinsics.i(keys, "getKeys(...)");
                Iterator it = keys.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.e(((CaptureRequest.Key) next).getName(), "org.codeaurora.qcamera3.sharpness.strength")) {
                        break;
                    }
                }
                keyA = next instanceof CaptureRequest.Key ? next : null;
            }
            if (keyA != null) {
                a(keyA, new int[]{iIntValue});
            }
        }
        for (Map.Entry entry : this.f124944l.entrySet()) {
            requestBuilder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
        this.f124943k = this.f124944l.hashCode();
        CaptureRequest captureRequestBuild2 = requestBuilder.build();
        Intrinsics.i(captureRequestBuild2, "build(...)");
        return captureRequestBuild2;
    }

    public final MeteringRectangle[] a(Rect rect, int i10) {
        if (rect == null || i10 == 0) {
            return null;
        }
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = ((O) this.f124933a).f124855d;
        CameraCharacteristics.Key SENSOR_INFO_ACTIVE_ARRAY_SIZE = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        Intrinsics.i(SENSOR_INFO_ACTIVE_ARRAY_SIZE, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        android.graphics.Rect rect2 = (android.graphics.Rect) cameraCharacteristicsWrapper.get(SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect2 == null) {
            rect2 = new android.graphics.Rect();
        }
        NativeCameraDelegateSettings nativeCameraDelegateSettings = this.f124937e;
        if (nativeCameraDelegateSettings != null && nativeCameraDelegateSettings.getZoomAffectsMeteringArea()) {
            CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
            Intrinsics.i(key, "SCALER_CROP_REGION");
            Intrinsics.j(key, "key");
            Object obj = this.f124944l.get(key);
            android.graphics.Rect rect3 = (android.graphics.Rect) (obj != null ? obj : null);
            if (rect3 == null) {
                rect3 = rect2;
            }
            float fWidth = rect3.width() / rect2.width();
            return new MeteringRectangle[]{a(new Rect(new Point(((rect.getOrigin().getX() - 0.5f) * fWidth) + 0.5f, ((rect.getOrigin().getY() - 0.5f) * fWidth) + 0.5f), new Size2(rect.getSize().getWidth() * fWidth, rect.getSize().getHeight() * fWidth)), rect2)};
        }
        return new MeteringRectangle[]{a(rect, rect2)};
    }

    public static MeteringRectangle a(Rect rect, android.graphics.Rect rect2) {
        int i10;
        int i11;
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        float f10 = iWidth;
        float x10 = rect.getOrigin().getX() * f10;
        float f11 = iHeight;
        float y10 = rect.getOrigin().getY() * f11;
        float width = rect.getSize().getWidth() * f10;
        float height = rect.getSize().getHeight() * f11;
        int i12 = (int) x10;
        int i13 = (int) y10;
        int i14 = (int) width;
        int i15 = (int) height;
        if (i12 == 0) {
            i14--;
            i10 = 1;
        } else {
            i10 = i12;
        }
        if (i13 == 0) {
            i15--;
            i11 = 1;
        } else {
            i11 = i13;
        }
        if (i14 + i10 == rect2.width()) {
            i14--;
        }
        int i16 = i14;
        if (i15 + i11 == rect2.height()) {
            i15--;
        }
        return new MeteringRectangle(i10, i11, i16, i15, 1000);
    }
}
