package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10598aa extends AbstractC10903t7 {

    /* renamed from: a, reason: collision with root package name */
    private final C10859qa f83051a;

    @Override // com.google.android.gms.internal.pal.AbstractC10903t7
    public final L7 a() {
        throw new UnsupportedOperationException("Cannot get parameters on LegacyProtoKey");
    }

    public C10598aa(C10859qa c10859qa, C10596a8 c10596a8) throws GeneralSecurityException {
        int i10 = Z9.f83029a[c10859qa.a().ordinal()];
        this.f83051a = c10859qa;
    }
}
