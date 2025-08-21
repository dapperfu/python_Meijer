package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Vm0 extends Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7735bn0 f71758a;

    /* renamed from: b, reason: collision with root package name */
    private final Ft0 f71759b;

    /* renamed from: c, reason: collision with root package name */
    private final Et0 f71760c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f71761d;

    private Vm0(C7735bn0 c7735bn0, Ft0 ft0, Et0 et0, Integer num) {
        this.f71758a = c7735bn0;
        this.f71759b = ft0;
        this.f71760c = et0;
        this.f71761d = num;
    }

    public final C7735bn0 b() {
        return this.f71758a;
    }

    public final Et0 c() {
        return this.f71760c;
    }

    public final Ft0 d() {
        return this.f71759b;
    }

    public final Integer e() {
        return this.f71761d;
    }

    public static Vm0 a(C7628an0 c7628an0, Ft0 ft0, Integer num) throws GeneralSecurityException {
        Et0 et0B;
        C7628an0 c7628an02 = C7628an0.f73334d;
        if (c7628an0 != c7628an02 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c7628an0.toString() + " the value of idRequirement must be non-null");
        }
        if (c7628an0 == c7628an02 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ft0.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ft0.a());
        }
        C7735bn0 c7735bn0C = C7735bn0.c(c7628an0);
        if (c7735bn0C.b() == c7628an02) {
            et0B = Yo0.f72453a;
        } else if (c7735bn0C.b() == C7628an0.f73333c) {
            et0B = Yo0.a(num.intValue());
        } else {
            if (c7735bn0C.b() != C7628an0.f73332b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c7735bn0C.b().toString()));
            }
            et0B = Yo0.b(num.intValue());
        }
        return new Vm0(c7735bn0C, ft0, et0B, num);
    }
}
