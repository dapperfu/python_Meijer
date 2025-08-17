package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
final class Dp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f66284a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f66285b;

    /* synthetic */ Dp0(Class cls, Class cls2, Ep0 ep0) {
        this.f66284a = cls;
        this.f66285b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Dp0)) {
            return false;
        }
        Dp0 dp0 = (Dp0) obj;
        return dp0.f66284a.equals(this.f66284a) && dp0.f66285b.equals(this.f66285b);
    }

    public final int hashCode() {
        return Objects.hash(this.f66284a, this.f66285b);
    }

    public final String toString() {
        Class cls = this.f66285b;
        return this.f66284a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
