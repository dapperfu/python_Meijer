package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes6.dex */
public final class Qn0 implements InterfaceC9543sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f70485a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70486b;

    /* renamed from: c, reason: collision with root package name */
    private final Lq0 f70487c;

    public static InterfaceC9543sk0 a(Pm0 pm0) throws GeneralSecurityException {
        return new Qn0(pm0.d().d(Bk0.a()), pm0.c(), pm0.b().b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f70485a;
        int i10 = this.f70486b;
        int length = bArr.length;
        if (length < bArr3.length + i10 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.f70485a;
        int i11 = this.f70486b;
        int length2 = bArr4.length;
        int i12 = i11 + length2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i12);
        byte[] bArr5 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr6 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 4, length3);
        byte[] bArr7 = new byte[32];
        System.arraycopy(this.f70487c.a(bArr5, 16), 0, bArr7, 0, 16);
        System.arraycopy(this.f70487c.a(bArr6, 16), 0, bArr7, 16, 16);
        if (!C8056eo0.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyC = C9122on0.c(bArr7);
        int i13 = i12 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i12, i13);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i12 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = C9122on0.a(bArrCopyOfRange2, 0, 12);
        Cipher cipherB = C9122on0.b();
        cipherB.init(2, secretKeyC, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        return cipherB.doFinal(bArr, i13, length - i13);
    }

    private Qn0(byte[] bArr, Et0 et0, int i10) throws GeneralSecurityException {
        this.f70487c = new C10203yt0(bArr);
        this.f70485a = et0.c();
        this.f70486b = i10;
    }
}
