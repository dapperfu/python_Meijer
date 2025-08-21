package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8912mp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f77745a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f77746b;

    /* synthetic */ C8912mp0(Class cls, Class cls2, C9126op0 c9126op0) {
        this.f77745a = cls;
        this.f77746b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8912mp0)) {
            return false;
        }
        C8912mp0 c8912mp0 = (C8912mp0) obj;
        return c8912mp0.f77745a.equals(this.f77745a) && c8912mp0.f77746b.equals(this.f77746b);
    }

    public final int hashCode() {
        return Objects.hash(this.f77745a, this.f77746b);
    }

    public final String toString() {
        Class cls = this.f77746b;
        return this.f77745a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
