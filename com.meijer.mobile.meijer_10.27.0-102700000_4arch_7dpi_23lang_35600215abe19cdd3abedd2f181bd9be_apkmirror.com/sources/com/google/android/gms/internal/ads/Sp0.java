package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Sp0 extends AbstractC8789mq0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f70168a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70169b;

    /* renamed from: c, reason: collision with root package name */
    private final Qp0 f70170c;

    /* synthetic */ Sp0(int i10, int i11, Qp0 qp0, Rp0 rp0) {
        this.f70168a = i10;
        this.f70169b = i11;
        this.f70170c = qp0;
    }

    public static Pp0 e() {
        return new Pp0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f70170c != Qp0.f69662e;
    }

    public final int b() {
        return this.f70169b;
    }

    public final int c() {
        return this.f70168a;
    }

    public final Qp0 f() {
        return this.f70170c;
    }

    public final int d() {
        Qp0 qp0 = this.f70170c;
        if (qp0 == Qp0.f69662e) {
            return this.f70169b;
        }
        if (qp0 == Qp0.f69659b || qp0 == Qp0.f69660c || qp0 == Qp0.f69661d) {
            return this.f70169b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Sp0)) {
            return false;
        }
        Sp0 sp0 = (Sp0) obj;
        return sp0.f70168a == this.f70168a && sp0.d() == d() && sp0.f70170c == this.f70170c;
    }

    public final int hashCode() {
        return Objects.hash(Sp0.class, Integer.valueOf(this.f70168a), Integer.valueOf(this.f70169b), this.f70170c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f70170c) + ", " + this.f70169b + "-byte tags, and " + this.f70168a + "-byte key)";
    }
}
