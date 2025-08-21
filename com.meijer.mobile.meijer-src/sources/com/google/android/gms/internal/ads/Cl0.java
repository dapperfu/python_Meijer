package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Cl0 {

    /* renamed from: a, reason: collision with root package name */
    private Nl0 f66659a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f66660b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f66661c = null;

    /* synthetic */ Cl0(Dl0 dl0) {
    }

    public final Cl0 a(Integer num) {
        this.f66661c = num;
        return this;
    }

    public final Cl0 b(Ft0 ft0) {
        this.f66660b = ft0;
        return this;
    }

    public final Cl0 c(Nl0 nl0) {
        this.f66659a = nl0;
        return this;
    }

    public final El0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0B;
        Nl0 nl0 = this.f66659a;
        if (nl0 == null || (ft0 = this.f66660b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nl0.b() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (nl0.a() && this.f66661c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f66659a.a() && this.f66661c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f66659a.d() == Ll0.f69262d) {
            et0B = Yo0.f72453a;
        } else if (this.f66659a.d() == Ll0.f69261c) {
            et0B = Yo0.a(this.f66661c.intValue());
        } else {
            if (this.f66659a.d() != Ll0.f69260b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f66659a.d())));
            }
            et0B = Yo0.b(this.f66661c.intValue());
        }
        return new El0(this.f66659a, this.f66660b, et0B, this.f66661c, null);
    }
}
