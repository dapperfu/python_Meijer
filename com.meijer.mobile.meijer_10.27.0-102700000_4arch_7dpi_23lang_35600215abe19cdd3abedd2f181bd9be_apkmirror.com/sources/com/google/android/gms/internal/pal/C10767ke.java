package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.pal.ke, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10767ke implements Qe {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f83214d = new C10751je();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f83215a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83216b;

    /* renamed from: c, reason: collision with root package name */
    private final int f83217c;

    @Override // com.google.android.gms.internal.pal.Qe
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f83216b;
        if (length > a.e.API_PRIORITY_OTHER - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (a.e.API_PRIORITY_OTHER - this.f83216b));
        }
        byte[] bArr2 = new byte[i10 + length];
        byte[] bArrA = We.a(i10);
        System.arraycopy(bArrA, 0, bArr2, 0, this.f83216b);
        int i11 = this.f83216b;
        Cipher cipher = (Cipher) f83214d.get();
        byte[] bArr3 = new byte[this.f83217c];
        System.arraycopy(bArrA, 0, bArr3, 0, this.f83216b);
        cipher.init(1, this.f83215a, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i11) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }

    public C10767ke(byte[] bArr, int i10) throws GeneralSecurityException {
        if (W8.a(2)) {
            Ye.a(bArr.length);
            this.f83215a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f83214d.get()).getBlockSize();
            this.f83217c = blockSize;
            if (i10 >= 12 && i10 <= blockSize) {
                this.f83216b = i10;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }
}
