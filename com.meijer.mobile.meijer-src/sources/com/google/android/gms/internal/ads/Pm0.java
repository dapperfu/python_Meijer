package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Pm0 extends Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Um0 f70254a;

    /* renamed from: b, reason: collision with root package name */
    private final Ft0 f70255b;

    /* renamed from: c, reason: collision with root package name */
    private final Et0 f70256c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f70257d;

    private Pm0(Um0 um0, Ft0 ft0, Et0 et0, Integer num) {
        this.f70254a = um0;
        this.f70255b = ft0;
        this.f70256c = et0;
        this.f70257d = num;
    }

    public final Um0 b() {
        return this.f70254a;
    }

    public final Et0 c() {
        return this.f70256c;
    }

    public final Ft0 d() {
        return this.f70255b;
    }

    public final Integer e() {
        return this.f70257d;
    }

    public static Pm0 a(Um0 um0, Ft0 ft0, Integer num) throws GeneralSecurityException {
        Et0 et0B;
        Tm0 tm0C = um0.c();
        Tm0 tm0 = Tm0.f71299c;
        if (tm0C != tm0 && num == null) {
            throw new GeneralSecurityException("For given Variant " + um0.c().toString() + " the value of idRequirement must be non-null");
        }
        if (um0.c() == tm0 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ft0.a() == 32) {
            if (um0.c() == tm0) {
                et0B = Yo0.f72453a;
            } else if (um0.c() == Tm0.f71298b) {
                et0B = Yo0.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(um0.c().toString()));
            }
            return new Pm0(um0, ft0, et0B, num);
        }
        throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + ft0.a());
    }
}
