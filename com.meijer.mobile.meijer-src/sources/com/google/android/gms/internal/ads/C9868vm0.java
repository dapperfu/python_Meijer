package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9868vm0 extends Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Am0 f79966a;

    /* renamed from: b, reason: collision with root package name */
    private final Et0 f79967b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f79968c;

    private C9868vm0(Am0 am0, Et0 et0, Integer num) {
        this.f79966a = am0;
        this.f79967b = et0;
        this.f79968c = num;
    }

    public final Am0 b() {
        return this.f79966a;
    }

    public final Et0 c() {
        return this.f79967b;
    }

    public final Integer d() {
        return this.f79968c;
    }

    public static C9868vm0 a(Am0 am0, Integer num) throws GeneralSecurityException {
        Et0 et0B;
        if (am0.c() == C10189ym0.f81112c) {
            if (num == null) {
                et0B = Yo0.f72453a;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (am0.c() == C10189ym0.f81111b) {
            if (num != null) {
                et0B = Yo0.b(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(am0.c())));
        }
        return new C9868vm0(am0, et0B, num);
    }
}
