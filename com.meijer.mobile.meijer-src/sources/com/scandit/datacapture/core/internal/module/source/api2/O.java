package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes12.dex */
public final class O implements N {

    /* renamed from: a, reason: collision with root package name */
    public final CameraProfile f125804a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraApi2Info f125805b;

    /* renamed from: c, reason: collision with root package name */
    public final CameraSettings f125806c;

    /* renamed from: d, reason: collision with root package name */
    public final CameraCharacteristicsWrapper f125807d;

    public O(CameraProfile cameraProfile, CameraApi2Info cameraApi2Info, CameraSettings cameraSettings) {
        Intrinsics.j(cameraProfile, "cameraProfile");
        Intrinsics.j(cameraApi2Info, "cameraApi2Info");
        this.f125804a = cameraProfile;
        this.f125805b = cameraApi2Info;
        this.f125806c = cameraSettings;
        this.f125807d = cameraApi2Info.getCharacteristics();
    }

    public final int[] a() {
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = this.f125807d;
        CameraCharacteristics.Key CONTROL_AF_AVAILABLE_MODES = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        Intrinsics.i(CONTROL_AF_AVAILABLE_MODES, "CONTROL_AF_AVAILABLE_MODES");
        int[] iArr = (int[]) cameraCharacteristicsWrapper.get(CONTROL_AF_AVAILABLE_MODES);
        return iArr == null ? new int[0] : iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.ranges.ClosedRange b() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L24
            com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper r0 = r3.f125807d
            android.hardware.camera2.CameraCharacteristics$Key r1 = v.C17498a.a()
            java.lang.String r2 = "CONTROL_ZOOM_RATIO_RANGE"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            java.lang.Object r0 = r0.get(r1)
            android.util.Range r0 = (android.util.Range) r0
            if (r0 == 0) goto L24
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r0, r1)
            com.scandit.datacapture.core.internal.module.source.api2.P r1 = new com.scandit.datacapture.core.internal.module.source.api2.P
            r1.<init>(r0)
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 != 0) goto L45
            com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper r0 = r3.f125807d
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM
            java.lang.String r2 = "SCALER_AVAILABLE_MAX_DIGITAL_ZOOM"
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L3f
            float r0 = r0.floatValue()
            goto L40
        L3f:
            r0 = r1
        L40:
            kotlin.ranges.ClosedFloatingPointRange r0 = kotlin.ranges.RangesKt.b(r1, r0)
            return r0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.source.api2.O.b():kotlin.ranges.ClosedRange");
    }

    public final ArrayList c() {
        try {
            Size[] availableYuvResolutions = this.f125807d.getAvailableYuvResolutions();
            if (this.f125804a.c()) {
                availableYuvResolutions = (Size[]) ArraysKt.K(availableYuvResolutions, this.f125807d.getAvailableHighResYuvResolutions());
            }
            ArrayList arrayList = new ArrayList();
            for (Size size : availableYuvResolutions) {
                if (size.getWidth() * size.getHeight() <= this.f125804a.b()) {
                    arrayList.add(size);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    public final int d() {
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = this.f125807d;
        CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
        Intrinsics.i(LENS_FACING, "LENS_FACING");
        Integer num = (Integer) cameraCharacteristicsWrapper.get(LENS_FACING);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final float e() {
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = this.f125807d;
        CameraCharacteristics.Key LENS_INFO_HYPERFOCAL_DISTANCE = CameraCharacteristics.LENS_INFO_HYPERFOCAL_DISTANCE;
        Intrinsics.i(LENS_INFO_HYPERFOCAL_DISTANCE, "LENS_INFO_HYPERFOCAL_DISTANCE");
        Float f10 = (Float) cameraCharacteristicsWrapper.get(LENS_INFO_HYPERFOCAL_DISTANCE);
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    public final float f() {
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = this.f125807d;
        CameraCharacteristics.Key LENS_INFO_MINIMUM_FOCUS_DISTANCE = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        Intrinsics.i(LENS_INFO_MINIMUM_FOCUS_DISTANCE, "LENS_INFO_MINIMUM_FOCUS_DISTANCE");
        Float f10 = (Float) cameraCharacteristicsWrapper.get(LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f10 != null) {
            return f10.floatValue();
        }
        return 0.0f;
    }

    public final List g() throws Exception {
        try {
            return this.f125807d.getAvailablePreviewResolution();
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    public final int h() {
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = this.f125807d;
        CameraCharacteristics.Key SENSOR_ORIENTATION = CameraCharacteristics.SENSOR_ORIENTATION;
        Intrinsics.i(SENSOR_ORIENTATION, "SENSOR_ORIENTATION");
        Integer num = (Integer) cameraCharacteristicsWrapper.get(SENSOR_ORIENTATION);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean i() {
        Sequence<Integer> sequenceS;
        CameraSettings cameraSettings = this.f125806c;
        Integer num = null;
        Object property = cameraSettings != null ? cameraSettings.getProperty("disableManualLensPositionSupportCheck") : null;
        Boolean bool = property instanceof Boolean ? (Boolean) property : null;
        if (bool != null ? bool.booleanValue() : false) {
            return true;
        }
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = this.f125807d;
        CameraCharacteristics.Key INFO_SUPPORTED_HARDWARE_LEVEL = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Intrinsics.i(INFO_SUPPORTED_HARDWARE_LEVEL, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Integer num2 = (Integer) cameraCharacteristicsWrapper.get(INFO_SUPPORTED_HARDWARE_LEVEL);
        if ((num2 != null && num2.intValue() == 1) || (num2 != null && num2.intValue() == 3)) {
            return true;
        }
        if (d() == 1 && this.f125804a.h()) {
            return true;
        }
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper2 = this.f125807d;
        CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        Intrinsics.i(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) cameraCharacteristicsWrapper2.get(REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null && (sequenceS = ArraysKt.S(iArr)) != null) {
            Iterator<Integer> it = sequenceS.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                if (next.intValue() == 1) {
                    num = next;
                    break;
                }
            }
            num = num;
        }
        return num != null;
    }

    public final boolean j() {
        CameraCharacteristicsWrapper cameraCharacteristicsWrapper = this.f125807d;
        CameraCharacteristics.Key FLASH_INFO_AVAILABLE = CameraCharacteristics.FLASH_INFO_AVAILABLE;
        Intrinsics.i(FLASH_INFO_AVAILABLE, "FLASH_INFO_AVAILABLE");
        Boolean bool = (Boolean) cameraCharacteristicsWrapper.get(FLASH_INFO_AVAILABLE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
