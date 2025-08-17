package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8787mp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f76905a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f76906b;

    /* synthetic */ C8787mp0(Class cls, Class cls2, C9001op0 c9001op0) {
        this.f76905a = cls;
        this.f76906b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8787mp0)) {
            return false;
        }
        C8787mp0 c8787mp0 = (C8787mp0) obj;
        return c8787mp0.f76905a.equals(this.f76905a) && c8787mp0.f76906b.equals(this.f76906b);
    }

    public final int hashCode() {
        return Objects.hash(this.f76905a, this.f76906b);
    }

    public final String toString() {
        Class cls = this.f76906b;
        return this.f76905a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
