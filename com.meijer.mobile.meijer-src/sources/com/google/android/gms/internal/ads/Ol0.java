package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Ol0 {

    /* renamed from: a, reason: collision with root package name */
    private Yl0 f70006a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f70007b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f70008c = null;

    /* synthetic */ Ol0(Pl0 pl0) {
    }

    public final Ol0 a(Integer num) {
        this.f70008c = num;
        return this;
    }

    public final Ol0 b(Ft0 ft0) {
        this.f70007b = ft0;
        return this;
    }

    public final Ol0 c(Yl0 yl0) {
        this.f70006a = yl0;
        return this;
    }

    public final Ql0 d() throws GeneralSecurityException {
        Ft0 ft0;
        Et0 et0B;
        Yl0 yl0 = this.f70006a;
        if (yl0 == null || (ft0 = this.f70007b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (yl0.b() != ft0.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (yl0.a() && this.f70008c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f70006a.a() && this.f70008c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f70006a.d() == Wl0.f71998d) {
            et0B = Yo0.f72453a;
        } else if (this.f70006a.d() == Wl0.f71997c) {
            et0B = Yo0.a(this.f70008c.intValue());
        } else {
            if (this.f70006a.d() != Wl0.f71996b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f70006a.d())));
            }
            et0B = Yo0.b(this.f70008c.intValue());
        }
        return new Ql0(this.f70006a, this.f70007b, et0B, this.f70008c, null);
    }
}
