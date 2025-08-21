package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
final class Cp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f66677a;

    /* renamed from: b, reason: collision with root package name */
    private final Et0 f66678b;

    /* synthetic */ Cp0(Class cls, Et0 et0, Ep0 ep0) {
        this.f66677a = cls;
        this.f66678b = et0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cp0)) {
            return false;
        }
        Cp0 cp0 = (Cp0) obj;
        return cp0.f66677a.equals(this.f66677a) && cp0.f66678b.equals(this.f66678b);
    }

    public final int hashCode() {
        return Objects.hash(this.f66677a, this.f66678b);
    }

    public final String toString() {
        Et0 et0 = this.f66678b;
        return this.f66677a.getSimpleName() + ", object identifier: " + String.valueOf(et0);
    }
}
