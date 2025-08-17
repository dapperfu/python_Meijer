package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Yl0 extends AbstractC7499al0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f71608a;

    /* renamed from: b, reason: collision with root package name */
    private final Wl0 f71609b;

    /* synthetic */ Yl0(int i10, Wl0 wl0, Xl0 xl0) {
        this.f71608a = i10;
        this.f71609b = wl0;
    }

    public static Vl0 c() {
        return new Vl0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f71609b != Wl0.f71158d;
    }

    public final int b() {
        return this.f71608a;
    }

    public final Wl0 d() {
        return this.f71609b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Yl0)) {
            return false;
        }
        Yl0 yl0 = (Yl0) obj;
        return yl0.f71608a == this.f71608a && yl0.f71609b == this.f71609b;
    }

    public final int hashCode() {
        return Objects.hash(Yl0.class, Integer.valueOf(this.f71608a), this.f71609b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f71609b) + ", " + this.f71608a + "-byte key)";
    }
}
