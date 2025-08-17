package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.sl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9420sl0 {

    /* renamed from: a, reason: collision with root package name */
    private Bl0 f78295a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f78296b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f78297c = null;

    /* synthetic */ C9420sl0(C9527tl0 c9527tl0) {
    }

    public final C9420sl0 a(Integer num) {
        this.f78297c = num;
        return this;
    }

    public final C9420sl0 b(Ft0 ft0) {
        this.f78296b = ft0;
        return this;
    }

    public final C9420sl0 c(Bl0 bl0) {
        this.f78295a = bl0;
        return this;
    }

    public final C9634ul0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0B;
        Bl0 bl0 = this.f78295a;
        if (bl0 == null || (ft0 = this.f78296b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (bl0.c() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (bl0.a() && this.f78297c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f78295a.a() && this.f78297c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f78295a.e() == C10169zl0.f80469d) {
            et0B = Yo0.f71613a;
        } else if (this.f78295a.e() == C10169zl0.f80468c) {
            et0B = Yo0.a(this.f78297c.intValue());
        } else {
            if (this.f78295a.e() != C10169zl0.f80467b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f78295a.e())));
            }
            et0B = Yo0.b(this.f78297c.intValue());
        }
        return new C9634ul0(this.f78295a, this.f78296b, et0B, this.f78297c, null);
    }
}
