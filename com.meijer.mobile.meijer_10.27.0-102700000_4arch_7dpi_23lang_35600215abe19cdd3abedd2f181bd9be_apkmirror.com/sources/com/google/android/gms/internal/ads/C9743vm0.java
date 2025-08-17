package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.vm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9743vm0 extends Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Am0 f79126a;

    /* renamed from: b, reason: collision with root package name */
    private final Et0 f79127b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f79128c;

    private C9743vm0(Am0 am0, Et0 et0, Integer num) {
        this.f79126a = am0;
        this.f79127b = et0;
        this.f79128c = num;
    }

    public final Am0 b() {
        return this.f79126a;
    }

    public final Et0 c() {
        return this.f79127b;
    }

    public final Integer d() {
        return this.f79128c;
    }

    public static C9743vm0 a(Am0 am0, Integer num) throws GeneralSecurityException {
        Et0 et0B;
        if (am0.c() == C10064ym0.f80272c) {
            if (num == null) {
                et0B = Yo0.f71613a;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (am0.c() == C10064ym0.f80271b) {
            if (num != null) {
                et0B = Yo0.b(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(am0.c())));
        }
        return new C9743vm0(am0, et0B, num);
    }
}
