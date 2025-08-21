package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Sp0 extends AbstractC8914mq0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f71008a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71009b;

    /* renamed from: c, reason: collision with root package name */
    private final Qp0 f71010c;

    /* synthetic */ Sp0(int i10, int i11, Qp0 qp0, Rp0 rp0) {
        this.f71008a = i10;
        this.f71009b = i11;
        this.f71010c = qp0;
    }

    public static Pp0 e() {
        return new Pp0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f71010c != Qp0.f70502e;
    }

    public final int b() {
        return this.f71009b;
    }

    public final int c() {
        return this.f71008a;
    }

    public final Qp0 f() {
        return this.f71010c;
    }

    public final int d() {
        Qp0 qp0 = this.f71010c;
        if (qp0 == Qp0.f70502e) {
            return this.f71009b;
        }
        if (qp0 == Qp0.f70499b || qp0 == Qp0.f70500c || qp0 == Qp0.f70501d) {
            return this.f71009b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Sp0)) {
            return false;
        }
        Sp0 sp0 = (Sp0) obj;
        return sp0.f71008a == this.f71008a && sp0.d() == d() && sp0.f71010c == this.f71010c;
    }

    public final int hashCode() {
        return Objects.hash(Sp0.class, Integer.valueOf(this.f71008a), Integer.valueOf(this.f71009b), this.f71010c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.f71010c) + ", " + this.f71009b + "-byte tags, and " + this.f71008a + "-byte key)";
    }
}
