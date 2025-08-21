package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class An0 implements InterfaceC9543sk0 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f66008c = C9882vt0.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f66009d = C9882vt0.a("070000004041424344454647");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f66010e = C9882vt0.a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f66011f = new C10298zn0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f66012a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f66013b;

    public static InterfaceC9543sk0 a(Zl0 zl0) throws GeneralSecurityException {
        return new An0(zl0.d().d(Bk0.a()), zl0.c().c());
    }

    static Cipher b() {
        return (Cipher) f66011f.get();
    }

    public static boolean d() {
        return f66011f.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f66009d);
            byte[] bArr = f66008c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f66010e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f66013b;
        if (bArr.length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f66013b.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f66011f.get();
        cipher.init(2, this.f66012a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, this.f66013b.length + 12, (r1 - r7) - 12);
    }

    private An0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (C8056eo0.a(1)) {
            if (d()) {
                if (bArr.length == 32) {
                    this.f66012a = new SecretKeySpec(bArr, "ChaCha20");
                    this.f66013b = bArr2;
                    return;
                }
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }
}
