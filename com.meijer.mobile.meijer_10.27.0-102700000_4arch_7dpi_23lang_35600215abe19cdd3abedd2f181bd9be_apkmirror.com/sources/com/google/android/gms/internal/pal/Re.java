package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class Re implements InterfaceC10732ib {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f82858a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f82859b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f82860c;

    private static Cipher b() throws GeneralSecurityException {
        if (W8.a(1)) {
            return (Cipher) Ee.f82584e.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10732ib
    public final byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherB = b();
        cipherB.init(1, this.f82858a);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(length / 16.0d));
        byte[] bArrE = iMax * 16 == length ? C10910te.e(bArr, (iMax - 1) * 16, this.f82859b, 0, 16) : C10910te.d(Wa.a(Arrays.copyOfRange(bArr, (iMax - 1) * 16, length)), this.f82860c);
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipherB.doFinal(C10910te.e(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipherB.doFinal(C10910te.d(bArrE, bArrDoFinal)), i10);
    }

    public Re(byte[] bArr) throws GeneralSecurityException {
        Ye.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f82858a = secretKeySpec;
        Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrB = Wa.b(cipherB.doFinal(new byte[16]));
        this.f82859b = bArrB;
        this.f82860c = Wa.b(bArrB);
    }
}
