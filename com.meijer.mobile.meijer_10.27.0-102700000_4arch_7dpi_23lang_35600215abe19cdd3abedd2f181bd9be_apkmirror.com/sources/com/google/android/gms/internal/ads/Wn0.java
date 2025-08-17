package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class Wn0 implements InterfaceC9418sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f71161a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f71162b;

    public static InterfaceC9418sk0 a(Vm0 vm0) throws GeneralSecurityException {
        return new Wn0(vm0.d().d(Bk0.a()), vm0.c().c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9418sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f71162b;
        if (bArr.length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.f71162b.length, bArr4, 0, 24);
        int[] iArrD = Gn0.d(Gn0.e(this.f71161a), Gn0.e(bArr4));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrD.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrD);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Cipher cipherB = An0.b();
        cipherB.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherB.updateAAD(bArr2);
        }
        return cipherB.doFinal(bArr, this.f71162b.length + 24, (r1 - r10) - 24);
    }

    private Wn0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (C7931eo0.a(1)) {
            if (b()) {
                if (bArr.length == 32) {
                    this.f71161a = bArr;
                    this.f71162b = bArr2;
                    return;
                }
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static boolean b() {
        if (An0.b() != null) {
            return true;
        }
        return false;
    }
}
