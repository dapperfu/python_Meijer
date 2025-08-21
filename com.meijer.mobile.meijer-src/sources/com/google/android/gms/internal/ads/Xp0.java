package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Xp0 {

    /* renamed from: a, reason: collision with root package name */
    private C8593jq0 f72251a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f72252b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f72253c = null;

    /* synthetic */ Xp0(Yp0 yp0) {
    }

    public final Xp0 a(Integer num) {
        this.f72253c = num;
        return this;
    }

    public final Xp0 b(Ft0 ft0) {
        this.f72252b = ft0;
        return this;
    }

    public final Xp0 c(C8593jq0 c8593jq0) {
        this.f72251a = c8593jq0;
        return this;
    }

    public final Zp0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0A;
        C8593jq0 c8593jq0 = this.f72251a;
        if (c8593jq0 == null || (ft0 = this.f72252b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c8593jq0.c() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c8593jq0.a() && this.f72253c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f72251a.a() && this.f72253c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f72251a.g() == C8381hq0.f75632e) {
            et0A = Yo0.f72453a;
        } else if (this.f72251a.g() == C8381hq0.f75631d || this.f72251a.g() == C8381hq0.f75630c) {
            et0A = Yo0.a(this.f72253c.intValue());
        } else {
            if (this.f72251a.g() != C8381hq0.f75629b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f72251a.g())));
            }
            et0A = Yo0.b(this.f72253c.intValue());
        }
        return new Zp0(this.f72251a, this.f72252b, et0A, this.f72253c, null);
    }
}
