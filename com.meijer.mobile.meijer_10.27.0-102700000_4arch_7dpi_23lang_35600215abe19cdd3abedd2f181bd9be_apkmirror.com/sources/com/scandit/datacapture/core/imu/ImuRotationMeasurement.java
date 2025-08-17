package com.scandit.datacapture.core.imu;

import com.scandit.datacapture.core.internal.sdk.capture.NativeImuDataRotationVectorAndroid;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/imu/ImuRotationMeasurement;", "", "", "value", "", "timestamp", "<init>", "([FJ)V", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeImuDataRotationVectorAndroid;", "toNativeRotationMeasurement", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeImuDataRotationVectorAndroid;", "a", "[F", "getValue", "()[F", "b", "J", "getTimestamp", "()J", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ImuRotationMeasurement {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long timestamp;

    public ImuRotationMeasurement(float[] value, long j10) {
        Intrinsics.j(value, "value");
        this.value = value;
        this.timestamp = j10;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float[] getValue() {
        return this.value;
    }

    public final NativeImuDataRotationVectorAndroid toNativeRotationMeasurement() {
        float[] fArr = this.value;
        return new NativeImuDataRotationVectorAndroid(fArr[0], fArr[1], fArr[2], fArr[3], this.timestamp);
    }
}
