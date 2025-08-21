package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.sl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9545sl0 {

    /* renamed from: a, reason: collision with root package name */
    private Bl0 f79135a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f79136b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f79137c = null;

    /* synthetic */ C9545sl0(C9652tl0 c9652tl0) {
    }

    public final C9545sl0 a(Integer num) {
        this.f79137c = num;
        return this;
    }

    public final C9545sl0 b(Ft0 ft0) {
        this.f79136b = ft0;
        return this;
    }

    public final C9545sl0 c(Bl0 bl0) {
        this.f79135a = bl0;
        return this;
    }

    public final C9759ul0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0B;
        Bl0 bl0 = this.f79135a;
        if (bl0 == null || (ft0 = this.f79136b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (bl0.c() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (bl0.a() && this.f79137c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f79135a.a() && this.f79137c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f79135a.e() == C10294zl0.f81309d) {
            et0B = Yo0.f72453a;
        } else if (this.f79135a.e() == C10294zl0.f81308c) {
            et0B = Yo0.a(this.f79137c.intValue());
        } else {
            if (this.f79135a.e() != C10294zl0.f81307b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f79135a.e())));
            }
            et0B = Yo0.b(this.f79137c.intValue());
        }
        return new C9759ul0(this.f79135a, this.f79136b, et0B, this.f79137c, null);
    }
}
