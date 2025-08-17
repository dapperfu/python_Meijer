package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9118pu0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f77656a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77657b;

    C9118pu0(Object obj, int i10) {
        this.f77656a = obj;
        this.f77657b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9118pu0)) {
            return false;
        }
        C9118pu0 c9118pu0 = (C9118pu0) obj;
        return this.f77656a == c9118pu0.f77656a && this.f77657b == c9118pu0.f77657b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f77656a) * 65535) + this.f77657b;
    }
}
