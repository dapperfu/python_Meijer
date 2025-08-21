package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7994eA0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f74617a;

    /* renamed from: b, reason: collision with root package name */
    public final float f74618b;

    /* renamed from: c, reason: collision with root package name */
    public final long f74619c;

    /* synthetic */ C7994eA0(C7781cA0 c7781cA0, C7888dA0 c7888dA0) {
        this.f74617a = c7781cA0.f73977a;
        this.f74618b = c7781cA0.f73978b;
        this.f74619c = c7781cA0.f73979c;
    }

    public final C7781cA0 a() {
        return new C7781cA0(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7994eA0)) {
            return false;
        }
        C7994eA0 c7994eA0 = (C7994eA0) obj;
        return this.f74617a == c7994eA0.f74617a && this.f74618b == c7994eA0.f74618b && this.f74619c == c7994eA0.f74619c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f74617a), Float.valueOf(this.f74618b), Long.valueOf(this.f74619c)});
    }
}
