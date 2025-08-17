package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.nm0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8888nm0 extends Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9102pm0 f77137a;

    /* renamed from: b, reason: collision with root package name */
    private final Et0 f77138b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f77139c;

    private C8888nm0(C9102pm0 c9102pm0, Et0 et0, Integer num) {
        this.f77137a = c9102pm0;
        this.f77138b = et0;
        this.f77139c = num;
    }

    public final C9102pm0 b() {
        return this.f77137a;
    }

    public final Et0 c() {
        return this.f77138b;
    }

    public final Integer d() {
        return this.f77139c;
    }

    public static C8888nm0 a(C9102pm0 c9102pm0, Integer num) throws GeneralSecurityException {
        Et0 et0B;
        if (c9102pm0.b() == C8995om0.f77425b) {
            if (num != null) {
                et0B = Et0.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (c9102pm0.b() == C8995om0.f77426c) {
            if (num == null) {
                et0B = Et0.b(new byte[0]);
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(c9102pm0.b().toString()));
        }
        return new C8888nm0(c9102pm0, et0B, num);
    }
}
