package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Um0 extends AbstractC7624al0 {

    /* renamed from: a, reason: collision with root package name */
    private final Tm0 f71537a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71538b;

    private Um0(Tm0 tm0, int i10) {
        this.f71537a = tm0;
        this.f71538b = i10;
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f71537a != Tm0.f71299c;
    }

    public final int b() {
        return this.f71538b;
    }

    public final Tm0 c() {
        return this.f71537a;
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
        return um0.f71537a == this.f71537a && um0.f71538b == this.f71538b;
    }

    public final int hashCode() {
        return Objects.hash(Um0.class, this.f71537a, Integer.valueOf(this.f71538b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f71537a.toString() + "salt_size_bytes: " + this.f71538b + ")";
    }
}
