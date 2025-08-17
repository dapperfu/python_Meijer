package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeInertialMeasurementAndroid {
    final long timestampNanos;

    /* renamed from: x, reason: collision with root package name */
    final float f125396x;

    /* renamed from: y, reason: collision with root package name */
    final float f125397y;

    /* renamed from: z, reason: collision with root package name */
    final float f125398z;

    public long getTimestampNanos() {
        return this.timestampNanos;
    }

    public float getX() {
        return this.f125396x;
    }

    public float getY() {
        return this.f125397y;
    }

    public float getZ() {
        return this.f125398z;
    }

    public String toString() {
        return "NativeInertialMeasurementAndroid{x=" + this.f125396x + ",y=" + this.f125397y + ",z=" + this.f125398z + ",timestampNanos=" + this.timestampNanos + "}";
    }

    public NativeInertialMeasurementAndroid(float f10, float f11, float f12, long j10) {
        this.f125396x = f10;
        this.f125397y = f11;
        this.f125398z = f12;
        this.timestampNanos = j10;
    }
}
