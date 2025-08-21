package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8327hG0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f75545a;

    /* renamed from: b, reason: collision with root package name */
    public final long f75546b;

    public C8327hG0(long j10, long j11) {
        this.f75545a = j10;
        this.f75546b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8327hG0)) {
            return false;
        }
        C8327hG0 c8327hG0 = (C8327hG0) obj;
        return this.f75545a == c8327hG0.f75545a && this.f75546b == c8327hG0.f75546b;
    }

    public final int hashCode() {
        return (((int) this.f75545a) * 31) + ((int) this.f75546b);
    }
}
