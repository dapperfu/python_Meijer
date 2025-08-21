package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Yl0 extends AbstractC7624al0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f72448a;

    /* renamed from: b, reason: collision with root package name */
    private final Wl0 f72449b;

    /* synthetic */ Yl0(int i10, Wl0 wl0, Xl0 xl0) {
        this.f72448a = i10;
        this.f72449b = wl0;
    }

    public static Vl0 c() {
        return new Vl0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f72449b != Wl0.f71998d;
    }

    public final int b() {
        return this.f72448a;
    }

    public final Wl0 d() {
        return this.f72449b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Yl0)) {
            return false;
        }
        Yl0 yl0 = (Yl0) obj;
        return yl0.f72448a == this.f72448a && yl0.f72449b == this.f72449b;
    }

    public final int hashCode() {
        return Objects.hash(Yl0.class, Integer.valueOf(this.f72448a), this.f72449b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f72449b) + ", " + this.f72448a + "-byte key)";
    }
}
