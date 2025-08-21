package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Rational;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraCharacteristicsWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j0 implements CameraApi2Info {

    /* renamed from: a, reason: collision with root package name */
    public final String f125869a;

    /* renamed from: b, reason: collision with root package name */
    public final M f125870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125871c;

    /* renamed from: d, reason: collision with root package name */
    public final Rational f125872d;

    public j0(String id2, CameraCharacteristics cameraCharacteristics) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(cameraCharacteristics, "cameraCharacteristics");
        this.f125869a = id2;
        M m10 = new M(cameraCharacteristics);
        this.f125870b = m10;
        this.f125871c = m10.getLensFacing();
        this.f125872d = m10.getControlAeCompensationStep();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final CameraCharacteristicsWrapper getCharacteristics() {
        return this.f125870b;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final Rational getCompensationStep() {
        return this.f125872d;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final int getFacing() {
        return this.f125871c;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final int getFocusCalibration() {
        Integer focusCalibration = this.f125870b.getFocusCalibration();
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
        return this.f125869a;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info
    public final boolean isTimestampRealtime() {
        M m10 = this.f125870b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
        Intrinsics.i(key, "SENSOR_INFO_TIMESTAMP_SOURCE");
        m10.getClass();
        Intrinsics.j(key, "key");
        Integer num = (Integer) m10.f125803a.get(key);
        return num != null && num.intValue() == 1;
    }
}
