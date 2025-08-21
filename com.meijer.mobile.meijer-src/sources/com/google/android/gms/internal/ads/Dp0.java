package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
final class Dp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f67124a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f67125b;

    /* synthetic */ Dp0(Class cls, Class cls2, Ep0 ep0) {
        this.f67124a = cls;
        this.f67125b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Dp0)) {
            return false;
        }
        Dp0 dp0 = (Dp0) obj;
        return dp0.f67124a.equals(this.f67124a) && dp0.f67125b.equals(this.f67125b);
    }

    public final int hashCode() {
        return Objects.hash(this.f67124a, this.f67125b);
    }

    public final String toString() {
        Class cls = this.f67125b;
        return this.f67124a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
