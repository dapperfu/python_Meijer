package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Nl0 extends AbstractC7624al0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f69780a;

    /* renamed from: b, reason: collision with root package name */
    private final int f69781b = 12;

    /* renamed from: c, reason: collision with root package name */
    private final int f69782c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final Ll0 f69783d;

    /* synthetic */ Nl0(int i10, int i11, int i12, Ll0 ll0, Ml0 ml0) {
        this.f69780a = i10;
        this.f69783d = ll0;
    }

    public static Kl0 c() {
        return new Kl0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f69783d != Ll0.f69262d;
    }

    public final int b() {
        return this.f69780a;
    }

    public final Ll0 d() {
        return this.f69783d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Nl0)) {
            return false;
        }
        Nl0 nl0 = (Nl0) obj;
        return nl0.f69780a == this.f69780a && nl0.f69783d == this.f69783d;
    }

    public final int hashCode() {
        return Objects.hash(Nl0.class, Integer.valueOf(this.f69780a), 12, 16, this.f69783d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.f69783d) + ", 12-byte IV, 16-byte tag, and " + this.f69780a + "-byte key)";
    }
}
