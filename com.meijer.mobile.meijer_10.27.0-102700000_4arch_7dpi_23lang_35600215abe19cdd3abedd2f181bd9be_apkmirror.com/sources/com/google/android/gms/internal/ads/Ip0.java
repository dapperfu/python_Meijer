package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Ip0 {

    /* renamed from: a, reason: collision with root package name */
    private Sp0 f67687a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f67688b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f67689c = null;

    /* synthetic */ Ip0(Jp0 jp0) {
    }

    public final Ip0 a(Ft0 ft0) throws GeneralSecurityException {
        this.f67688b = ft0;
        return this;
    }

    public final Ip0 b(Integer num) {
        this.f67689c = num;
        return this;
    }

    public final Ip0 c(Sp0 sp0) {
        this.f67687a = sp0;
        return this;
    }

    public final Kp0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0A;
        Sp0 sp0 = this.f67687a;
        if (sp0 == null || (ft0 = this.f67688b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (sp0.c() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (sp0.a() && this.f67689c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f67687a.a() && this.f67689c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f67687a.f() == Qp0.f69662e) {
            et0A = Yo0.f71613a;
        } else if (this.f67687a.f() == Qp0.f69661d || this.f67687a.f() == Qp0.f69660c) {
            et0A = Yo0.a(this.f67689c.intValue());
        } else {
            if (this.f67687a.f() != Qp0.f69659b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f67687a.f())));
            }
            et0A = Yo0.b(this.f67689c.intValue());
        }
        return new Kp0(this.f67687a, this.f67688b, et0A, this.f67689c, null);
    }
}
