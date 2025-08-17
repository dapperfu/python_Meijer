package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7869eA0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f73777a;

    /* renamed from: b, reason: collision with root package name */
    public final float f73778b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73779c;

    /* synthetic */ C7869eA0(C7656cA0 c7656cA0, C7763dA0 c7763dA0) {
        this.f73777a = c7656cA0.f73137a;
        this.f73778b = c7656cA0.f73138b;
        this.f73779c = c7656cA0.f73139c;
    }

    public final C7656cA0 a() {
        return new C7656cA0(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7869eA0)) {
            return false;
        }
        C7869eA0 c7869eA0 = (C7869eA0) obj;
        return this.f73777a == c7869eA0.f73777a && this.f73778b == c7869eA0.f73778b && this.f73779c == c7869eA0.f73779c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f73777a), Float.valueOf(this.f73778b), Long.valueOf(this.f73779c)});
    }
}
