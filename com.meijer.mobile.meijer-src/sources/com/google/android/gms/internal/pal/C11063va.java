package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.va, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11063va {

    /* renamed from: a, reason: collision with root package name */
    private final Class f84992a;

    /* renamed from: b, reason: collision with root package name */
    private final C10745bf f84993b;

    /* synthetic */ C11063va(Class cls, C10745bf c10745bf, C11047ua c11047ua) {
        this.f84992a = cls;
        this.f84993b = c10745bf;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11063va)) {
            return false;
        }
        C11063va c11063va = (C11063va) obj;
        return c11063va.f84992a.equals(this.f84992a) && c11063va.f84993b.equals(this.f84993b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f84992a, this.f84993b});
    }

    public final String toString() {
        return this.f84992a.getSimpleName() + ", object identifier: " + String.valueOf(this.f84993b);
    }
}
