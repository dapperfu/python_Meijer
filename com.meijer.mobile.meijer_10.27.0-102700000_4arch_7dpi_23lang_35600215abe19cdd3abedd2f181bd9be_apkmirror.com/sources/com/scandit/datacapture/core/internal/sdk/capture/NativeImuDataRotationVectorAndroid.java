package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeImuDataRotationVectorAndroid {
    final long timestampNanos;

    /* renamed from: w, reason: collision with root package name */
    final float f125392w;

    /* renamed from: x, reason: collision with root package name */
    final float f125393x;

    /* renamed from: y, reason: collision with root package name */
    final float f125394y;

    /* renamed from: z, reason: collision with root package name */
    final float f125395z;

    public long getTimestampNanos() {
        return this.timestampNanos;
    }

    public float getW() {
        return this.f125392w;
    }

    public float getX() {
        return this.f125393x;
    }

    public float getY() {
        return this.f125394y;
    }

    public float getZ() {
        return this.f125395z;
    }

    public String toString() {
        return "NativeImuDataRotationVectorAndroid{w=" + this.f125392w + ",x=" + this.f125393x + ",y=" + this.f125394y + ",z=" + this.f125395z + ",timestampNanos=" + this.timestampNanos + "}";
    }

    public NativeImuDataRotationVectorAndroid(float f10, float f11, float f12, float f13, long j10) {
        this.f125392w = f10;
        this.f125393x = f11;
        this.f125394y = f12;
        this.f125395z = f13;
        this.timestampNanos = j10;
    }
}
