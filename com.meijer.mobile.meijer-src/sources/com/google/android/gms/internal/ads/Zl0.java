package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Zl0 extends Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8052em0 f73080a;

    /* renamed from: b, reason: collision with root package name */
    private final Ft0 f73081b;

    /* renamed from: c, reason: collision with root package name */
    private final Et0 f73082c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f73083d;

    private Zl0(C8052em0 c8052em0, Ft0 ft0, Et0 et0, Integer num) {
        this.f73080a = c8052em0;
        this.f73081b = ft0;
        this.f73082c = et0;
        this.f73083d = num;
    }

    public final C8052em0 b() {
        return this.f73080a;
    }

    public final Et0 c() {
        return this.f73082c;
    }

    public final Ft0 d() {
        return this.f73081b;
    }

    public final Integer e() {
        return this.f73083d;
    }

    public static Zl0 a(C7946dm0 c7946dm0, Ft0 ft0, Integer num) throws GeneralSecurityException {
        Et0 et0B;
        C7946dm0 c7946dm02 = C7946dm0.f74317d;
        if (c7946dm0 != c7946dm02 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c7946dm0.toString() + " the value of idRequirement must be non-null");
        }
        if (c7946dm0 == c7946dm02 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ft0.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ft0.a());
        }
        C8052em0 c8052em0C = C8052em0.c(c7946dm0);
        if (c8052em0C.b() == c7946dm02) {
            et0B = Yo0.f72453a;
        } else if (c8052em0C.b() == C7946dm0.f74316c) {
            et0B = Yo0.a(num.intValue());
        } else {
            if (c8052em0C.b() != C7946dm0.f74315b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c8052em0C.b().toString()));
            }
            et0B = Yo0.b(num.intValue());
        }
        return new Zl0(c8052em0C, ft0, et0B, num);
    }
}
