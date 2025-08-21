package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: com.google.android.gms.internal.ads.dt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7959dt0 implements InterfaceC9543sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f74334a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f74335b;

    public static InterfaceC9543sk0 a(El0 el0) throws GeneralSecurityException {
        return new C7959dt0(el0.d().d(Bk0.a()), el0.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f74335b;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = C9122on0.a(bArr, this.f74335b.length, 12);
        SecretKey secretKey = this.f74334a;
        Cipher cipherB = C9122on0.b();
        cipherB.init(2, secretKey, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        return cipherB.doFinal(bArr, this.f74335b.length + 12, (r1 - r7) - 12);
    }

    private C7959dt0(byte[] bArr, Et0 et0) throws GeneralSecurityException {
        if (C8056eo0.a(2)) {
            this.f74334a = C9122on0.c(bArr);
            this.f74335b = et0.c();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
