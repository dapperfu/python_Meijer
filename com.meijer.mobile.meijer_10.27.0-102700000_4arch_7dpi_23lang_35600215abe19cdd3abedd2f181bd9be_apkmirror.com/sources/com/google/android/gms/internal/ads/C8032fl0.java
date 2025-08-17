package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.fl0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8032fl0 {

    /* renamed from: a, reason: collision with root package name */
    private C9313rl0 f74160a = null;

    /* renamed from: b, reason: collision with root package name */
    private Ft0 f74161b = null;

    /* renamed from: c, reason: collision with root package name */
    private Ft0 f74162c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f74163d = null;

    /* synthetic */ C8032fl0(C8246hl0 c8246hl0) {
    }

    public final C8032fl0 a(Ft0 ft0) {
        this.f74161b = ft0;
        return this;
    }

    public final C8032fl0 b(Ft0 ft0) {
        this.f74162c = ft0;
        return this;
    }

    public final C8032fl0 c(Integer num) {
        this.f74163d = num;
        return this;
    }

    public final C8032fl0 d(C9313rl0 c9313rl0) {
        this.f74160a = c9313rl0;
        return this;
    }

    public final C8352il0 e() throws GeneralSecurityException {
        Et0 et0B;
        C9313rl0 c9313rl0 = this.f74160a;
        if (c9313rl0 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        Ft0 ft0 = this.f74161b;
        if (ft0 == null || this.f74162c == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (c9313rl0.b() != ft0.a()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (c9313rl0.c() != this.f74162c.a()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.f74160a.a() && this.f74163d == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.f74160a.a() && this.f74163d != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.f74160a.h() == C9100pl0.f77638d) {
            et0B = Yo0.f71613a;
        } else if (this.f74160a.h() == C9100pl0.f77637c) {
            et0B = Yo0.a(this.f74163d.intValue());
        } else {
            if (this.f74160a.h() != C9100pl0.f77636b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f74160a.h())));
            }
            et0B = Yo0.b(this.f74163d.intValue());
        }
        return new C8352il0(this.f74160a, this.f74161b, this.f74162c, et0B, this.f74163d, null);
    }
}
