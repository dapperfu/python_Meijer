package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.pal.ne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10940ne implements InterfaceC10901l7 {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f84084e = new C10908le();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f84085f = new C10924me();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f84086a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f84087b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f84088c;

    /* renamed from: d, reason: collision with root package name */
    private final int f84089d;

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((b10 + b10) ^ ((bArr[i11] & 255) >>> 7)) & com.medallia.digital.mobilesdk.l3.f93323c);
            i10 = i11;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    private final byte[] b(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrC;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(c(bArr2, this.f84086a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i13 = 0;
        int i14 = 0;
        while (i12 - i14 > 16) {
            for (int i15 = 0; i15 < 16; i15++) {
                bArrDoFinal[i15] = (byte) (bArrDoFinal[i15] ^ bArr[(i11 + i14) + i15]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i14 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i14 + i11, i11 + i12);
        if (bArrCopyOfRange.length == 16) {
            bArrC = c(bArrCopyOfRange, this.f84086a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f84087b, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i13 >= length) {
                    break;
                }
                bArrCopyOf[i13] = (byte) (bArrCopyOf[i13] ^ bArrCopyOfRange[i13]);
                i13++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrC = bArrCopyOf;
        }
        return cipher.doFinal(c(bArrDoFinal, bArrC));
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10901l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f84089d;
        if (length > 2147483631 - i10) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i10 + length + 16];
        byte[] bArrA = We.a(i10);
        System.arraycopy(bArrA, 0, bArr3, 0, this.f84089d);
        Cipher cipher = (Cipher) f84084e.get();
        cipher.init(1, this.f84088c);
        byte[] bArrB = b(cipher, 0, bArrA, 0, bArrA.length);
        byte[] bArrB2 = b(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = (Cipher) f84085f.get();
        cipher2.init(1, this.f84088c, new IvParameterSpec(bArrB));
        cipher2.doFinal(bArr, 0, length, bArr3, this.f84089d);
        byte[] bArrB3 = b(cipher, 2, bArr3, this.f84089d, length);
        int i11 = length + this.f84089d;
        for (int i12 = 0; i12 < 16; i12++) {
            bArr3[i11 + i12] = (byte) ((bArrB2[i12] ^ bArrB[i12]) ^ bArrB3[i12]);
        }
        return bArr3;
    }

    public C10940ne(byte[] bArr, int i10) throws GeneralSecurityException {
        if (W8.a(1)) {
            if (i10 != 12 && i10 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f84089d = i10;
            Ye.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f84088c = secretKeySpec;
            Cipher cipher = (Cipher) f84084e.get();
            cipher.init(1, secretKeySpec);
            byte[] bArrA = a(cipher.doFinal(new byte[16]));
            this.f84086a = bArrA;
            this.f84087b = a(bArrA);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }
}
