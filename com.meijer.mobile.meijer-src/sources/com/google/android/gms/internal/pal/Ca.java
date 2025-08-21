package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Ca extends Ra {

    /* renamed from: a, reason: collision with root package name */
    private final Ha f83351a;

    /* renamed from: b, reason: collision with root package name */
    private final C10762cf f83352b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f83353c;

    private Ca(Ha ha2, C10762cf c10762cf, Integer num) {
        this.f83351a = ha2;
        this.f83352b = c10762cf;
        this.f83353c = num;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC11028t7
    public final /* synthetic */ L7 a() {
        return this.f83351a;
    }

    public static Ca b(Ha ha2, C10762cf c10762cf, Integer num) throws GeneralSecurityException {
        if (c10762cf.a() == 32) {
            if (ha2.c() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (!ha2.c() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
            }
            return new Ca(ha2, c10762cf, num);
        }
        throw new GeneralSecurityException("Invalid key size");
    }
}
