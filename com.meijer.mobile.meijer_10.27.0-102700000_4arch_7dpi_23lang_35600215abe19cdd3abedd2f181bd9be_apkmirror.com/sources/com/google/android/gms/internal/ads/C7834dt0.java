package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: com.google.android.gms.internal.ads.dt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7834dt0 implements InterfaceC9418sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f73494a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f73495b;

    public static InterfaceC9418sk0 a(El0 el0) throws GeneralSecurityException {
        return new C7834dt0(el0.d().d(Bk0.a()), el0.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9418sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f73495b;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = C8997on0.a(bArr, this.f73495b.length, 12);
        SecretKey secretKey = this.f73494a;
        Cipher cipherB = C8997on0.b();
        cipherB.init(2, secretKey, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        return cipherB.doFinal(bArr, this.f73495b.length + 12, (r1 - r7) - 12);
    }

    private C7834dt0(byte[] bArr, Et0 et0) throws GeneralSecurityException {
        if (C7931eo0.a(2)) {
            this.f73494a = C8997on0.c(bArr);
            this.f73495b = et0.c();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
