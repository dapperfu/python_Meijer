package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class Zs0 implements InterfaceC9864wt0 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f72276d = new Ys0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f72277a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72278b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72279c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9864wt0
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f72278b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int i11 = this.f72278b;
        int i12 = length - i11;
        byte[] bArr3 = new byte[i12];
        Cipher cipher = (Cipher) f72276d.get();
        byte[] bArr4 = new byte[this.f72279c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.f72278b);
        cipher.init(2, this.f72277a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i11, i12, bArr3, 0) == i12) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }

    public Zs0(byte[] bArr, int i10) throws GeneralSecurityException {
        if (C7931eo0.a(2)) {
            Ct0.a(bArr.length);
            this.f72277a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f72276d.get()).getBlockSize();
            this.f72279c = blockSize;
            if (i10 <= blockSize) {
                this.f72278b = i10;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }
}
