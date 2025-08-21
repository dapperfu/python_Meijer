package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeInertialMeasurementAndroid {
    final long timestampNanos;

    /* renamed from: x, reason: collision with root package name */
    final float f126348x;

    /* renamed from: y, reason: collision with root package name */
    final float f126349y;

    /* renamed from: z, reason: collision with root package name */
    final float f126350z;

    public long getTimestampNanos() {
        return this.timestampNanos;
    }

    public float getX() {
        return this.f126348x;
    }

    public float getY() {
        return this.f126349y;
    }

    public float getZ() {
        return this.f126350z;
    }

    public String toString() {
        return "NativeInertialMeasurementAndroid{x=" + this.f126348x + ",y=" + this.f126349y + ",z=" + this.f126350z + ",timestampNanos=" + this.timestampNanos + "}";
    }

    public NativeInertialMeasurementAndroid(float f10, float f11, float f12, long j10) {
        this.f126348x = f10;
        this.f126349y = f11;
        this.f126350z = f12;
        this.timestampNanos = j10;
    }
}
