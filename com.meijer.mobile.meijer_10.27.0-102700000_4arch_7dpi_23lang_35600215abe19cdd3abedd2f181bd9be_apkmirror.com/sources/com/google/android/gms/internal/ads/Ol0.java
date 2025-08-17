package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Ol0 {

    /* renamed from: a, reason: collision with root package name */
    private Yl0 f69166a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f69167b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f69168c = null;

    /* synthetic */ Ol0(Pl0 pl0) {
    }

    public final Ol0 a(Integer num) {
        this.f69168c = num;
        return this;
    }

    public final Ol0 b(Ft0 ft0) {
        this.f69167b = ft0;
        return this;
    }

    public final Ol0 c(Yl0 yl0) {
        this.f69166a = yl0;
        return this;
    }

    public final Ql0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0B;
        Yl0 yl0 = this.f69166a;
        if (yl0 == null || (ft0 = this.f69167b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (yl0.b() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (yl0.a() && this.f69168c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f69166a.a() && this.f69168c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f69166a.d() == Wl0.f71158d) {
            et0B = Yo0.f71613a;
        } else if (this.f69166a.d() == Wl0.f71157c) {
            et0B = Yo0.a(this.f69168c.intValue());
        } else {
            if (this.f69166a.d() != Wl0.f71156b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f69166a.d())));
            }
            et0B = Yo0.b(this.f69168c.intValue());
        }
        return new Ql0(this.f69166a, this.f69167b, et0B, this.f69168c, null);
    }
}
