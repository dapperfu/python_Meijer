package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10723aa extends AbstractC11028t7 {

    /* renamed from: a, reason: collision with root package name */
    private final C10984qa f83891a;

    @Override // com.google.android.gms.internal.pal.AbstractC11028t7
    public final L7 a() {
        throw new UnsupportedOperationException("Cannot get parameters on LegacyProtoKey");
    }

    public C10723aa(C10984qa c10984qa, C10721a8 c10721a8) throws GeneralSecurityException {
        int i10 = Z9.f83869a[c10984qa.a().ordinal()];
        this.f83891a = c10984qa;
    }
}
