package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.fl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8157fl0 {

    /* renamed from: a, reason: collision with root package name */
    private C9438rl0 f75000a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f75001b = null;

    /* renamed from: c, reason: collision with root package name */
    private Ft0 f75002c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f75003d = null;

    /* synthetic */ C8157fl0(C8371hl0 c8371hl0) {
    }

    public final C8157fl0 a(Ft0 ft0) {
        this.f75001b = ft0;
        return this;
    }

    public final C8157fl0 b(Ft0 ft0) {
        this.f75002c = ft0;
        return this;
    }

    public final C8157fl0 c(Integer num) {
        this.f75003d = num;
        return this;
    }

    public final C8157fl0 d(C9438rl0 c9438rl0) {
        this.f75000a = c9438rl0;
        return this;
    }

    public final C8477il0 e() throws GeneralSecurityException {
        Et0 et0B;
        C9438rl0 c9438rl0 = this.f75000a;
        if (c9438rl0 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        Ft0 ft0 = this.f75001b;
        if (ft0 == null || this.f75002c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (c9438rl0.b() != ft0.a()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (c9438rl0.c() != this.f75002c.a()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.f75000a.a() && this.f75003d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f75000a.a() && this.f75003d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f75000a.h() == C9225pl0.f78478d) {
            et0B = Yo0.f72453a;
        } else if (this.f75000a.h() == C9225pl0.f78477c) {
            et0B = Yo0.a(this.f75003d.intValue());
        } else {
            if (this.f75000a.h() != C9225pl0.f78476b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f75000a.h())));
            }
            et0B = Yo0.b(this.f75003d.intValue());
        }
        return new C8477il0(this.f75000a, this.f75001b, this.f75002c, et0B, this.f75003d, null);
    }
}
