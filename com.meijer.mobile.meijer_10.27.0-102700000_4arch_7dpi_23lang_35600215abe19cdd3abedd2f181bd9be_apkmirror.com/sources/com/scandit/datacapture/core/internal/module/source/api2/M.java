package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SizeF;
import android.view.SurfaceHolder;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class M implements CameraCharacteristicsWrapper {

    /* renamed from: b, reason: collision with root package name */
    public static final Size[] f124850b = {new Size(1920, 1080), new Size(1280, 720)};

    /* renamed from: a, reason: collision with root package name */
    public final CameraCharacteristics f124851a;

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final Size[] getAvailableHighResYuvResolutions() {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            Intrinsics.i(key, "SCALER_STREAM_CONFIGURATION_MAP");
            Intrinsics.j(key, "key");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f124851a.get(key);
            objB = Result.b(streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(35) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Size[] sizeArr = (Size[]) (Result.g(objB) ? null : objB);
        return sizeArr == null ? new Size[0] : sizeArr;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public List getAvailablePreviewResolution() {
        Object objB;
        Size[] outputSizes;
        try {
            Result.Companion companion = Result.INSTANCE;
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            Intrinsics.i(key, "SCALER_STREAM_CONFIGURATION_MAP");
            Intrinsics.j(key, "key");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f124851a.get(key);
            objB = Result.b((streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceHolder.class)) == null) ? null : ArraysKt.X0(outputSizes, new L()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        List list = (List) (Result.g(objB) ? null : objB);
        return list == null ? ArraysKt.i1(f124850b) : list;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public Size[] getAvailableYuvResolutions() {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            Intrinsics.i(key, "SCALER_STREAM_CONFIGURATION_MAP");
            Intrinsics.j(key, "key");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f124851a.get(key);
            objB = Result.b(streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(35) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Size[] sizeArr = (Size[]) (Result.g(objB) ? null : objB);
        return sizeArr == null ? f124850b : sizeArr;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final Range getSensorSensitivityRange() {
        Range range = (Range) this.f124851a.get(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        return range == null ? new Range(0, 0) : range;
    }

    public M(CameraCharacteristics cameraCharacteristics) {
        Intrinsics.j(cameraCharacteristics, "cameraCharacteristics");
        this.f124851a = cameraCharacteristics;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final Object get(CameraCharacteristics.Key key) {
        Intrinsics.j(key, "key");
        return this.f124851a.get(key);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final Range[] getAutoExposureAvailableFrameRateRanges() {
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
        Intrinsics.i(key, "CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES");
        Intrinsics.j(key, "key");
        Range[] rangeArr = (Range[]) this.f124851a.get(key);
        return rangeArr == null ? new Range[0] : rangeArr;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final List getAvailableCaptureRequestKeys() {
        List<CaptureRequest.Key<?>> availableCaptureRequestKeys = this.f124851a.getAvailableCaptureRequestKeys();
        Intrinsics.i(availableCaptureRequestKeys, "getAvailableCaptureRequestKeys(...)");
        return availableCaptureRequestKeys;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final Range getAvailableExposureTimeRange() {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE;
        Intrinsics.i(key, "SENSOR_INFO_EXPOSURE_TIME_RANGE");
        Intrinsics.j(key, "key");
        Range range = (Range) this.f124851a.get(key);
        return range == null ? new Range(0L, 0L) : range;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final long getAvailableMaxFrameDuration() {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_MAX_FRAME_DURATION;
        Intrinsics.i(key, "SENSOR_INFO_MAX_FRAME_DURATION");
        Intrinsics.j(key, "key");
        Long l10 = (Long) this.f124851a.get(key);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final Set getAvailablePhysicalCameraIds() {
        if (Build.VERSION.SDK_INT < 28) {
            return SetsKt.e();
        }
        Set physicalCameraIds = this.f124851a.getPhysicalCameraIds();
        Intrinsics.g(physicalCameraIds);
        return physicalCameraIds;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final double getCalculatedFieldOfView() {
        float[] fArr = (float[]) this.f124851a.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        if (fArr == null) {
            return 0.0d;
        }
        for (float f10 : fArr) {
            if (((SizeF) this.f124851a.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)) != null) {
                return Math.atan(r4.getWidth() / (2 * f10));
            }
        }
        return 0.0d;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final Rational getControlAeCompensationStep() {
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
        Intrinsics.i(key, "CONTROL_AE_COMPENSATION_STEP");
        Intrinsics.j(key, "key");
        Rational rational = (Rational) this.f124851a.get(key);
        if (rational != null) {
            return rational;
        }
        throw new IllegalArgumentException("Exposure compensation step should be non-null on all devices.");
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final Integer getFocusCalibration() {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_FOCUS_DISTANCE_CALIBRATION;
        Intrinsics.i(key, "LENS_INFO_FOCUS_DISTANCE_CALIBRATION");
        Intrinsics.j(key, "key");
        return (Integer) this.f124851a.get(key);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final int getLensFacing() {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        Intrinsics.i(key, "LENS_FACING");
        Intrinsics.j(key, "key");
        Integer num = (Integer) this.f124851a.get(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final long getOutputMinFrameDuration(Size size) {
        Intrinsics.j(size, "size");
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        Intrinsics.i(key, "SCALER_STREAM_CONFIGURATION_MAP");
        Intrinsics.j(key, "key");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f124851a.get(key);
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(35, size);
        }
        return 0L;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper
    public final Integer getSupportedHardwareLevel() {
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Intrinsics.i(key, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Intrinsics.j(key, "key");
        return (Integer) this.f124851a.get(key);
    }
}
