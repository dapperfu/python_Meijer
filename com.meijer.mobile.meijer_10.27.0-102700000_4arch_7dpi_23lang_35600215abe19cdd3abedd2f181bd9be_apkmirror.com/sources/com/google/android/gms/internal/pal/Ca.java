package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Ca extends Ra {

    /* renamed from: a, reason: collision with root package name */
    private final Ha f82511a;

    /* renamed from: b, reason: collision with root package name */
    private final C10637cf f82512b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f82513c;

    private Ca(Ha ha2, C10637cf c10637cf, Integer num) {
        this.f82511a = ha2;
        this.f82512b = c10637cf;
        this.f82513c = num;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10903t7
    public final /* synthetic */ L7 a() {
        return this.f82511a;
    }

    public static Ca b(Ha ha2, C10637cf c10637cf, Integer num) throws GeneralSecurityException {
        if (c10637cf.a() == 32) {
            if (ha2.c() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (!ha2.c() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
            }
            return new Ca(ha2, c10637cf, num);
        }
        throw new GeneralSecurityException("Invalid key size");
    }
}
