package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Vm0 extends Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7610bn0 f70918a;

    /* renamed from: b, reason: collision with root package name */
    private final Ft0 f70919b;

    /* renamed from: c, reason: collision with root package name */
    private final Et0 f70920c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f70921d;

    private Vm0(C7610bn0 c7610bn0, Ft0 ft0, Et0 et0, Integer num) {
        this.f70918a = c7610bn0;
        this.f70919b = ft0;
        this.f70920c = et0;
        this.f70921d = num;
    }

    public final C7610bn0 b() {
        return this.f70918a;
    }

    public final Et0 c() {
        return this.f70920c;
    }

    public final Ft0 d() {
        return this.f70919b;
    }

    public final Integer e() {
        return this.f70921d;
    }

    public static Vm0 a(C7503an0 c7503an0, Ft0 ft0, Integer num) throws GeneralSecurityException {
        Et0 et0B;
        C7503an0 c7503an02 = C7503an0.f72494d;
        if (c7503an0 != c7503an02 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c7503an0.toString() + " the value of idRequirement must be non-null");
        }
        if (c7503an0 == c7503an02 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ft0.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + ft0.a());
        }
        C7610bn0 c7610bn0C = C7610bn0.c(c7503an0);
        if (c7610bn0C.b() == c7503an02) {
            et0B = Yo0.f71613a;
        } else if (c7610bn0C.b() == C7503an0.f72493c) {
            et0B = Yo0.a(num.intValue());
        } else {
            if (c7610bn0C.b() != C7503an0.f72492b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c7610bn0C.b().toString()));
            }
            et0B = Yo0.b(num.intValue());
        }
        return new Vm0(c7610bn0C, ft0, et0B, num);
    }
}
