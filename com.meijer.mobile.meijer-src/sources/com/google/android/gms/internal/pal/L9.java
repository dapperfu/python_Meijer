package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class L9 implements InterfaceC11126z9 {

    /* renamed from: a, reason: collision with root package name */
    private final C11030t9 f83593a;

    L9(C11030t9 c11030t9) {
        this.f83593a = c11030t9;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11126z9
    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.f83593a.c(), I9.f83505f)) {
            return I9.f83501b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11126z9
    public final A9 a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArrB = Ze.b();
        byte[] bArrA = Ze.a(bArrB, bArr);
        byte[] bArrC = Ze.c(bArrB);
        byte[] bArrC2 = C11035te.c(bArrC, bArr);
        byte[] bArrD = I9.d(I9.f83501b);
        C11030t9 c11030t9 = this.f83593a;
        return new A9(c11030t9.b(null, bArrA, "eae_prk", bArrC2, "shared_secret", bArrD, c11030t9.a()), bArrC);
    }
}
