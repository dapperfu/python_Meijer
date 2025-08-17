package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class U8 implements InterfaceC10776l7 {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f82910b = new T8();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f82911a;

    @Override // com.google.android.gms.internal.pal.InterfaceC10776l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrA = We.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        int length2 = bArrA.length;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            ivParameterSpec = new GCMParameterSpec(128, bArrA, 0, length2);
        } catch (ClassNotFoundException unused) {
            if (!Xe.a()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArrA, 0, length2);
        }
        ThreadLocal threadLocal = f82910b;
        ((Cipher) threadLocal.get()).init(1, this.f82911a, ivParameterSpec);
        int iDoFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
        if (iDoFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }

    public U8(byte[] bArr) throws GeneralSecurityException {
        Ye.a(bArr.length);
        this.f82911a = new SecretKeySpec(bArr, "AES");
    }
}
