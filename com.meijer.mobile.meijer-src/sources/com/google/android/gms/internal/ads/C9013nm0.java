package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.nm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9013nm0 extends Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9227pm0 f77977a;

    /* renamed from: b, reason: collision with root package name */
    private final Et0 f77978b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f77979c;

    private C9013nm0(C9227pm0 c9227pm0, Et0 et0, Integer num) {
        this.f77977a = c9227pm0;
        this.f77978b = et0;
        this.f77979c = num;
    }

    public final C9227pm0 b() {
        return this.f77977a;
    }

    public final Et0 c() {
        return this.f77978b;
    }

    public final Integer d() {
        return this.f77979c;
    }

    public static C9013nm0 a(C9227pm0 c9227pm0, Integer num) throws GeneralSecurityException {
        Et0 et0B;
        if (c9227pm0.b() == C9120om0.f78265b) {
            if (num != null) {
                et0B = Et0.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (c9227pm0.b() == C9120om0.f78266c) {
            if (num == null) {
                et0B = Et0.b(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(c9227pm0.b().toString()));
        }
        return new C9013nm0(c9227pm0, et0B, num);
    }
}
