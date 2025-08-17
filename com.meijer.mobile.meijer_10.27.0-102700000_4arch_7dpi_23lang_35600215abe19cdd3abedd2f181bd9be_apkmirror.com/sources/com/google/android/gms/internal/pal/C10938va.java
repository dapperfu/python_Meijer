package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.va, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10938va {

    /* renamed from: a, reason: collision with root package name */
    private final Class f84152a;

    /* renamed from: b, reason: collision with root package name */
    private final C10620bf f84153b;

    /* synthetic */ C10938va(Class cls, C10620bf c10620bf, C10922ua c10922ua) {
        this.f84152a = cls;
        this.f84153b = c10620bf;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10938va)) {
            return false;
        }
        C10938va c10938va = (C10938va) obj;
        return c10938va.f84152a.equals(this.f84152a) && c10938va.f84153b.equals(this.f84153b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f84152a, this.f84153b});
    }

    public final String toString() {
        return this.f84152a.getSimpleName() + ", object identifier: " + String.valueOf(this.f84153b);
    }
}
