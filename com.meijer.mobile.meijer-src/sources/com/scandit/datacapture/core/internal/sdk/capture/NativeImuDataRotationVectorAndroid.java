package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeImuDataRotationVectorAndroid {
    final long timestampNanos;

    /* renamed from: w, reason: collision with root package name */
    final float f126344w;

    /* renamed from: x, reason: collision with root package name */
    final float f126345x;

    /* renamed from: y, reason: collision with root package name */
    final float f126346y;

    /* renamed from: z, reason: collision with root package name */
    final float f126347z;

    public long getTimestampNanos() {
        return this.timestampNanos;
    }

    public float getW() {
        return this.f126344w;
    }

    public float getX() {
        return this.f126345x;
    }

    public float getY() {
        return this.f126346y;
    }

    public float getZ() {
        return this.f126347z;
    }

    public String toString() {
        return "NativeImuDataRotationVectorAndroid{w=" + this.f126344w + ",x=" + this.f126345x + ",y=" + this.f126346y + ",z=" + this.f126347z + ",timestampNanos=" + this.timestampNanos + "}";
    }

    public NativeImuDataRotationVectorAndroid(float f10, float f11, float f12, float f13, long j10) {
        this.f126344w = f10;
        this.f126345x = f11;
        this.f126346y = f12;
        this.f126347z = f13;
        this.timestampNanos = j10;
    }
}
