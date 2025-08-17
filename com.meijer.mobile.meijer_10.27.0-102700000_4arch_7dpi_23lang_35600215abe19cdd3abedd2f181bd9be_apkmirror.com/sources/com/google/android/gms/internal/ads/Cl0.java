package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Cl0 {

    /* renamed from: a, reason: collision with root package name */
    private Nl0 f65819a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f65820b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f65821c = null;

    /* synthetic */ Cl0(Dl0 dl0) {
    }

    public final Cl0 a(Integer num) {
        this.f65821c = num;
        return this;
    }

    public final Cl0 b(Ft0 ft0) {
        this.f65820b = ft0;
        return this;
    }

    public final Cl0 c(Nl0 nl0) {
        this.f65819a = nl0;
        return this;
    }

    public final El0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0B;
        Nl0 nl0 = this.f65819a;
        if (nl0 == null || (ft0 = this.f65820b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nl0.b() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (nl0.a() && this.f65821c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f65819a.a() && this.f65821c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f65819a.d() == Ll0.f68422d) {
            et0B = Yo0.f71613a;
        } else if (this.f65819a.d() == Ll0.f68421c) {
            et0B = Yo0.a(this.f65821c.intValue());
        } else {
            if (this.f65819a.d() != Ll0.f68420b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f65819a.d())));
            }
            et0B = Yo0.b(this.f65821c.intValue());
        }
        return new El0(this.f65819a, this.f65820b, et0B, this.f65821c, null);
    }
}
