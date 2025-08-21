package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class Zs0 implements InterfaceC9989wt0 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f73116d = new Ys0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f73117a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73118b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73119c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9989wt0
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f73118b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int i11 = this.f73118b;
        int i12 = length - i11;
        byte[] bArr3 = new byte[i12];
        Cipher cipher = (Cipher) f73116d.get();
        byte[] bArr4 = new byte[this.f73119c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.f73118b);
        cipher.init(2, this.f73117a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i11, i12, bArr3, 0) == i12) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }

    public Zs0(byte[] bArr, int i10) throws GeneralSecurityException {
        if (C8056eo0.a(2)) {
            Ct0.a(bArr.length);
            this.f73117a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f73116d.get()).getBlockSize();
            this.f73119c = blockSize;
            if (i10 <= blockSize) {
                this.f73118b = i10;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }
}
