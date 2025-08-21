package com.scandit.datacapture.core.internal.sdk.source.api2;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J$\u0010\f\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH¦\u0002¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H&¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H&J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012H&¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0017H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003H&J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012H&¢\u0006\u0002\u0010\u001aJ\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0014H&J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0019H&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\u000f\u0010(\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0002\u0010#R\u001c\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006)"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/source/api2/CameraCharacteristicsWrapper;", "", "availableCaptureRequestKeys", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "getAvailableCaptureRequestKeys", "()Ljava/util/List;", "availablePhysicalCameraIds", "", "", "getAvailablePhysicalCameraIds", "()Ljava/util/Set;", "get", "T", "key", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "getAutoExposureAvailableFrameRateRanges", "", "Landroid/util/Range;", "", "()[Landroid/util/Range;", "getAvailableExposureTimeRange", "", "getAvailableHighResYuvResolutions", "Landroid/util/Size;", "()[Landroid/util/Size;", "getAvailableMaxFrameDuration", "getAvailablePreviewResolution", "getAvailableYuvResolutions", "getCalculatedFieldOfView", "", "getControlAeCompensationStep", "Landroid/util/Rational;", "getFocusCalibration", "()Ljava/lang/Integer;", "getLensFacing", "getOutputMinFrameDuration", "size", "getSensorSensitivityRange", "getSupportedHardwareLevel", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CameraCharacteristicsWrapper {
    <T> T get(CameraCharacteristics.Key<T> key);

    Range<Integer>[] getAutoExposureAvailableFrameRateRanges();

    List<CaptureRequest.Key<?>> getAvailableCaptureRequestKeys();

    Range<Long> getAvailableExposureTimeRange();

    Size[] getAvailableHighResYuvResolutions();

    long getAvailableMaxFrameDuration();

    Set<String> getAvailablePhysicalCameraIds();

    List<Size> getAvailablePreviewResolution();

    Size[] getAvailableYuvResolutions();

    double getCalculatedFieldOfView();

    Rational getControlAeCompensationStep();

    Integer getFocusCalibration();

    int getLensFacing();

    long getOutputMinFrameDuration(Size size);

    Range<Integer> getSensorSensitivityRange();

    Integer getSupportedHardwareLevel();
}
