package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class L8 {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f82750c = new K8();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f82751a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f82752b;

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z10 = this.f82752b;
        byte[] bArr4 = new byte[z10 ? length + 28 : length + 16];
        if (z10) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        Xe.a();
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        ThreadLocal threadLocal = f82750c;
        ((Cipher) threadLocal.get()).init(1, this.f82751a, gCMParameterSpec);
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, true != this.f82752b ? 0 : 12);
        if (iDoFinal == length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }

    public L8(byte[] bArr, boolean z10) throws GeneralSecurityException {
        if (W8.a(2)) {
            Ye.a(bArr.length);
            this.f82751a = new SecretKeySpec(bArr, "AES");
            this.f82752b = z10;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
