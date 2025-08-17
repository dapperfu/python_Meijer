package com.scandit.datacapture.core.imu;

import com.scandit.datacapture.core.internal.sdk.capture.NativeInertialMeasurementAndroid;
import com.scandit.datacapture.core.internal.sdk.capture.NativeInertialMeasurementType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/core/imu/ImuMeasurement;", "", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeInertialMeasurementType;", "type", "", "value", "", "timestamp", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeInertialMeasurementType;[FJ)V", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeInertialMeasurementAndroid;", "toNativeMeasurement", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeInertialMeasurementAndroid;", "a", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeInertialMeasurementType;", "getType", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeInertialMeasurementType;", "b", "[F", "getValue", "()[F", "c", "J", "getTimestamp", "()J", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ImuMeasurement {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeInertialMeasurementType type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float[] value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timestamp;

    public ImuMeasurement(NativeInertialMeasurementType type, float[] value, long j10) {
        Intrinsics.j(type, "type");
        Intrinsics.j(value, "value");
        this.type = type;
        this.value = value;
        this.timestamp = j10;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final NativeInertialMeasurementType getType() {
        return this.type;
    }

    public final float[] getValue() {
        return this.value;
    }

    public final NativeInertialMeasurementAndroid toNativeMeasurement() {
        float[] fArr = this.value;
        return new NativeInertialMeasurementAndroid(fArr[0], fArr[1], fArr[2], this.timestamp);
    }
}
