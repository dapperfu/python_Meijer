package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j0 implements CameraApi2Info {

    /* renamed from: a, reason: collision with root package name */
    public final String f124917a;

    /* renamed from: b, reason: collision with root package name */
    public final M f124918b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124919c;

    /* renamed from: d, reason: collision with root package name */
    public final Rational f124920d;

    public j0(String id2, CameraCharacteristics cameraCharacteristics) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(cameraCharacteristics, "cameraCharacteristics");
        this.f124917a = id2;
        M m10 = new M(cameraCharacteristics);
        this.f124918b = m10;
        this.f124919c = m10.getLensFacing();
        this.f124920d = m10.getControlAeCompensationStep();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final CameraCharacteristicsWrapper getCharacteristics() {
        return this.f124918b;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final Rational getCompensationStep() {
        return this.f124920d;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final int getFacing() {
        return this.f124919c;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final int getFocusCalibration() {
        Integer focusCalibration = this.f124918b.getFocusCalibration();
        if (focusCalibration != null && focusCalibration.intValue() == 0) {
            return 0;
        }
        if (focusCalibration != null && focusCalibration.intValue() == 1) {
            return 2;
        }
        return (focusCalibration != null && focusCalibration.intValue() == 2) ? 3 : 0;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final String getId() {
        return this.f124917a;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final boolean isTimestampRealtime() {
        M m10 = this.f124918b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
        Intrinsics.i(key, "SENSOR_INFO_TIMESTAMP_SOURCE");
        m10.getClass();
        Intrinsics.j(key, "key");
        Integer num = (Integer) m10.f124851a.get(key);
        return num != null && num.intValue() == 1;
    }
}
