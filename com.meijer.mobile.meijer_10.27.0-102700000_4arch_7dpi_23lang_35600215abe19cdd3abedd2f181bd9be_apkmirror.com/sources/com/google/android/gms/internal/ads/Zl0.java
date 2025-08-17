package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Zl0 extends Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7927em0 f72240a;

    /* renamed from: b, reason: collision with root package name */
    private final Ft0 f72241b;

    /* renamed from: c, reason: collision with root package name */
    private final Et0 f72242c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f72243d;

    private Zl0(C7927em0 c7927em0, Ft0 ft0, Et0 et0, Integer num) {
        this.f72240a = c7927em0;
        this.f72241b = ft0;
        this.f72242c = et0;
        this.f72243d = num;
    }

    public final C7927em0 b() {
        return this.f72240a;
    }

    public final Et0 c() {
        return this.f72242c;
    }

    public final Ft0 d() {
        return this.f72241b;
    }

    public final Integer e() {
        return this.f72243d;
    }

    public static Zl0 a(C7821dm0 c7821dm0, Ft0 ft0, Integer num) throws GeneralSecurityException {
        Et0 et0B;
        C7821dm0 c7821dm02 = C7821dm0.f73477d;
        if (c7821dm0 != c7821dm02 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c7821dm0.toString() + " the value of idRequirement must be non-null");
        }
        if (c7821dm0 == c7821dm02 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ft0.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ft0.a());
        }
        C7927em0 c7927em0C = C7927em0.c(c7821dm0);
        if (c7927em0C.b() == c7821dm02) {
            et0B = Yo0.f71613a;
        } else if (c7927em0C.b() == C7821dm0.f73476c) {
            et0B = Yo0.a(num.intValue());
        } else {
            if (c7927em0C.b() != C7821dm0.f73475b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c7927em0C.b().toString()));
            }
            et0B = Yo0.b(num.intValue());
        }
        return new Zl0(c7927em0C, ft0, et0B, num);
    }
}
