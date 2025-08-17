package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hG0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8202hG0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f74705a;

    /* renamed from: b, reason: collision with root package name */
    public final long f74706b;

    public C8202hG0(long j10, long j11) {
        this.f74705a = j10;
        this.f74706b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8202hG0)) {
            return false;
        }
        C8202hG0 c8202hG0 = (C8202hG0) obj;
        return this.f74705a == c8202hG0.f74705a && this.f74706b == c8202hG0.f74706b;
    }

    public final int hashCode() {
        return (((int) this.f74705a) * 31) + ((int) this.f74706b);
    }
}
