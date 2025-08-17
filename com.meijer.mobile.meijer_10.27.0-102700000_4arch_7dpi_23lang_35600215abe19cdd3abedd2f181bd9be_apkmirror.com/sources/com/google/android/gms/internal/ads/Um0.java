package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Um0 extends AbstractC7499al0 {

    /* renamed from: a, reason: collision with root package name */
    private final Tm0 f70697a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70698b;

    private Um0(Tm0 tm0, int i10) {
        this.f70697a = tm0;
        this.f70698b = i10;
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f70697a != Tm0.f70459c;
    }

    public final int b() {
        return this.f70698b;
    }

    public final Tm0 c() {
        return this.f70697a;
    }

    public static Um0 d(Tm0 tm0, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new Um0(tm0, i10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Um0)) {
            return false;
        }
        Um0 um0 = (Um0) obj;
        return um0.f70697a == this.f70697a && um0.f70698b == this.f70698b;
    }

    public final int hashCode() {
        return Objects.hash(Um0.class, this.f70697a, Integer.valueOf(this.f70698b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f70697a.toString() + "salt_size_bytes: " + this.f70698b + ")";
    }
}
