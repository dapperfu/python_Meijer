package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9243pu0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f78496a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78497b;

    C9243pu0(Object obj, int i10) {
        this.f78496a = obj;
        this.f78497b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9243pu0)) {
            return false;
        }
        C9243pu0 c9243pu0 = (C9243pu0) obj;
        return this.f78496a == c9243pu0.f78496a && this.f78497b == c9243pu0.f78497b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f78496a) * 65535) + this.f78497b;
    }
}
