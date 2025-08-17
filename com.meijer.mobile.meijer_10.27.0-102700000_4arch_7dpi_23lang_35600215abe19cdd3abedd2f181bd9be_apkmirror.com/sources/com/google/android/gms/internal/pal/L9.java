package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class L9 implements InterfaceC11001z9 {

    /* renamed from: a, reason: collision with root package name */
    private final C10905t9 f82753a;

    L9(C10905t9 c10905t9) {
        this.f82753a = c10905t9;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11001z9
    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.f82753a.c(), I9.f82665f)) {
            return I9.f82661b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11001z9
    public final A9 a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrB = Ze.b();
        byte[] bArrA = Ze.a(bArrB, bArr);
        byte[] bArrC = Ze.c(bArrB);
        byte[] bArrC2 = C10910te.c(bArrC, bArr);
        byte[] bArrD = I9.d(I9.f82661b);
        C10905t9 c10905t9 = this.f82753a;
        return new A9(c10905t9.b(null, bArrA, "eae_prk", bArrC2, "shared_secret", bArrD, c10905t9.a()), bArrC);
    }
}
