package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Nl0 extends AbstractC7499al0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f68940a;

    /* renamed from: b, reason: collision with root package name */
    private final int f68941b = 12;

    /* renamed from: c, reason: collision with root package name */
    private final int f68942c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final Ll0 f68943d;

    /* synthetic */ Nl0(int i10, int i11, int i12, Ll0 ll0, Ml0 ml0) {
        this.f68940a = i10;
        this.f68943d = ll0;
    }

    public static Kl0 c() {
        return new Kl0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f68943d != Ll0.f68422d;
    }

    public final int b() {
        return this.f68940a;
    }

    public final Ll0 d() {
        return this.f68943d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Nl0)) {
            return false;
        }
        Nl0 nl0 = (Nl0) obj;
        return nl0.f68940a == this.f68940a && nl0.f68943d == this.f68943d;
    }

    public final int hashCode() {
        return Objects.hash(Nl0.class, Integer.valueOf(this.f68940a), 12, 16, this.f68943d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f68943d) + ", 12-byte IV, 16-byte tag, and " + this.f68940a + "-byte key)";
    }
}
