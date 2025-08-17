package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
final class Cp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f65837a;

    /* renamed from: b, reason: collision with root package name */
    private final Et0 f65838b;

    /* synthetic */ Cp0(Class cls, Et0 et0, Ep0 ep0) {
        this.f65837a = cls;
        this.f65838b = et0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cp0)) {
            return false;
        }
        Cp0 cp0 = (Cp0) obj;
        return cp0.f65837a.equals(this.f65837a) && cp0.f65838b.equals(this.f65838b);
    }

    public final int hashCode() {
        return Objects.hash(this.f65837a, this.f65838b);
    }

    public final String toString() {
        Et0 et0 = this.f65838b;
        return this.f65837a.getSimpleName() + ", object identifier: " + String.valueOf(et0);
    }
}
