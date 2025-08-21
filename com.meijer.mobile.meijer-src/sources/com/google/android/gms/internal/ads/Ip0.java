package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Ip0 {

    /* renamed from: a, reason: collision with root package name */
    private Sp0 f68527a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f68528b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f68529c = null;

    /* synthetic */ Ip0(Jp0 jp0) {
    }

    public final Ip0 a(Ft0 ft0) throws GeneralSecurityException {
        this.f68528b = ft0;
        return this;
    }

    public final Ip0 b(Integer num) {
        this.f68529c = num;
        return this;
    }

    public final Ip0 c(Sp0 sp0) {
        this.f68527a = sp0;
        return this;
    }

    public final Kp0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0A;
        Sp0 sp0 = this.f68527a;
        if (sp0 == null || (ft0 = this.f68528b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (sp0.c() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (sp0.a() && this.f68529c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f68527a.a() && this.f68529c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f68527a.f() == Qp0.f70502e) {
            et0A = Yo0.f72453a;
        } else if (this.f68527a.f() == Qp0.f70501d || this.f68527a.f() == Qp0.f70500c) {
            et0A = Yo0.a(this.f68529c.intValue());
        } else {
            if (this.f68527a.f() != Qp0.f70499b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f68527a.f())));
            }
            et0A = Yo0.b(this.f68529c.intValue());
        }
        return new Kp0(this.f68527a, this.f68528b, et0A, this.f68529c, null);
    }
}
