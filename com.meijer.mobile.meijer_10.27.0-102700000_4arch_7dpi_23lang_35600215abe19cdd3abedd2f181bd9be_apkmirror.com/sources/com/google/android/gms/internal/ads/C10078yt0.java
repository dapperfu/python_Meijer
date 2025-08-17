package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.yt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10078yt0 implements Lq0 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f80300d = new C9971xt0();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f80301a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f80302b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f80303c;

    private static Cipher b() throws GeneralSecurityException {
        if (C7931eo0.a(1)) {
            return (Cipher) f80300d.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.Lq0
    public final byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArrC;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.f80301a;
        Cipher cipherB = b();
        cipherB.init(1, secretKey);
        int length = bArr.length;
        int i11 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i12 = i11 - 1;
        int i13 = i12 * 16;
        if (i11 * 16 == length) {
            bArrC = C7941et0.c(bArr, i13, this.f80302b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = Byte.MIN_VALUE;
            byte[] bArr2 = this.f80303c;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrC = C7941et0.c(bArrCopyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i14 = 0; i14 < i12; i14++) {
            c(bArr3, bArr, i14 * 16, bArr4);
            if (cipherB.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        c(bArr3, bArrC, 0, bArr4);
        if (cipherB.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i10 == 16 ? bArr3 : Arrays.copyOf(bArr3, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }

    public C10078yt0(byte[] bArr) throws GeneralSecurityException {
        Ct0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f80301a = secretKeySpec;
        Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrA = Cq0.a(cipherB.doFinal(new byte[16]));
        this.f80302b = bArrA;
        this.f80303c = Cq0.a(bArrA);
    }
}
