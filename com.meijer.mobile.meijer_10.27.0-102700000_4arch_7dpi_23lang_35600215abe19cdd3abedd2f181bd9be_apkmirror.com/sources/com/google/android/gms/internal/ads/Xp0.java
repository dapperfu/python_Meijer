package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Xp0 {

    /* renamed from: a, reason: collision with root package name */
    private C8468jq0 f71411a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f71412b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f71413c = null;

    /* synthetic */ Xp0(Yp0 yp0) {
    }

    public final Xp0 a(Integer num) {
        this.f71413c = num;
        return this;
    }

    public final Xp0 b(Ft0 ft0) {
        this.f71412b = ft0;
        return this;
    }

    public final Xp0 c(C8468jq0 c8468jq0) {
        this.f71411a = c8468jq0;
        return this;
    }

    public final Zp0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0A;
        C8468jq0 c8468jq0 = this.f71411a;
        if (c8468jq0 == null || (ft0 = this.f71412b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c8468jq0.c() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c8468jq0.a() && this.f71413c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f71411a.a() && this.f71413c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f71411a.g() == C8256hq0.f74792e) {
            et0A = Yo0.f71613a;
        } else if (this.f71411a.g() == C8256hq0.f74791d || this.f71411a.g() == C8256hq0.f74790c) {
            et0A = Yo0.a(this.f71413c.intValue());
        } else {
            if (this.f71411a.g() != C8256hq0.f74789b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f71411a.g())));
            }
            et0A = Yo0.b(this.f71413c.intValue());
        }
        return new Zp0(this.f71411a, this.f71412b, et0A, this.f71413c, null);
    }
}
