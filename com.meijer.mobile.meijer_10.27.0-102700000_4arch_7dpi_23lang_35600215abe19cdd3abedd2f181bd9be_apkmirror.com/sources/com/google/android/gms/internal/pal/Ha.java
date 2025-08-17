package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Ha extends Sa {

    /* renamed from: a, reason: collision with root package name */
    private final int f82645a;

    /* renamed from: b, reason: collision with root package name */
    private final Ga f82646b;

    private Ha(int i10, Ga ga2) {
        this.f82645a = i10;
        this.f82646b = ga2;
    }

    public final boolean c() {
        return this.f82646b != Ga.f82627e;
    }

    public static Ha b(int i10, Ga ga2) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            return new Ha(i10, ga2);
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
    }

    public final int a() {
        Ga ga2 = this.f82646b;
        if (ga2 == Ga.f82627e) {
            return this.f82645a;
        }
        if (ga2 == Ga.f82624b || ga2 == Ga.f82625c || ga2 == Ga.f82626d) {
            return this.f82645a + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ha)) {
            return false;
        }
        Ha ha2 = (Ha) obj;
        return ha2.a() == a() && ha2.f82646b == this.f82646b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82645a), this.f82646b});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + this.f82646b.toString() + ", " + this.f82645a + "-byte tags)";
    }
}
