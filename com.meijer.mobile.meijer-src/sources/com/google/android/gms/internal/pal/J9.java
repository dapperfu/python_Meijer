package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes6.dex */
final class J9 implements InterfaceC11126z9 {

    /* renamed from: a, reason: collision with root package name */
    private final C11030t9 f83529a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83530b;

    private J9(C11030t9 c11030t9, int i10) {
        this.f83529a = c11030t9;
        this.f83530b = i10;
    }

    static J9 b(int i10) throws GeneralSecurityException {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? new J9(new C11030t9("HmacSha512"), 3) : new J9(new C11030t9("HmacSha384"), 2) : new J9(new C11030t9("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11126z9
    public final A9 a(byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        KeyPair keyPairC = Ce.c(Ce.k(this.f83530b));
        byte[] bArrG = Ce.g((ECPrivateKey) keyPairC.getPrivate(), Ce.j(Ce.k(this.f83530b), 1, bArr));
        int i10 = this.f83530b;
        byte[] bArrL = Ce.l(Ce.k(i10).getCurve(), 1, ((ECPublicKey) keyPairC.getPublic()).getW());
        byte[] bArrC = C11035te.c(bArrL, bArr);
        byte[] bArrD = I9.d(zzb());
        C11030t9 c11030t9 = this.f83529a;
        return new A9(c11030t9.b(null, bArrG, "eae_prk", bArrC, "shared_secret", bArrD, c11030t9.a()), bArrL);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11126z9
    public final byte[] zzb() throws GeneralSecurityException {
        int i10 = this.f83530b - 1;
        return i10 != 0 ? i10 != 1 ? I9.f83504e : I9.f83503d : I9.f83502c;
    }
}
