package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Ha extends Sa {

    /* renamed from: a, reason: collision with root package name */
    private final int f83485a;

    /* renamed from: b, reason: collision with root package name */
    private final Ga f83486b;

    private Ha(int i10, Ga ga2) {
        this.f83485a = i10;
        this.f83486b = ga2;
    }

    public final boolean c() {
        return this.f83486b != Ga.f83467e;
    }

    public static Ha b(int i10, Ga ga2) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            return new Ha(i10, ga2);
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
    }

    public final int a() {
        Ga ga2 = this.f83486b;
        if (ga2 == Ga.f83467e) {
            return this.f83485a;
        }
        if (ga2 == Ga.f83464b || ga2 == Ga.f83465c || ga2 == Ga.f83466d) {
            return this.f83485a + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ha)) {
            return false;
        }
        Ha ha2 = (Ha) obj;
        return ha2.a() == a() && ha2.f83486b == this.f83486b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f83485a), this.f83486b});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + this.f83486b.toString() + ", " + this.f83485a + "-byte tags)";
    }
}
