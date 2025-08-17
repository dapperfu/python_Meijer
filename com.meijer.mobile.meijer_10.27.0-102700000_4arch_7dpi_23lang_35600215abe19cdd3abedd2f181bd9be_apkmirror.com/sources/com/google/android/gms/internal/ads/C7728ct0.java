package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.ct0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7728ct0 implements InterfaceC9418sk0 {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f73269f = new C7515at0();

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal f73270g = new C7622bt0();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f73271a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f73272b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f73273c;

    /* renamed from: d, reason: collision with root package name */
    private final SecretKeySpec f73274d;

    /* renamed from: e, reason: collision with root package name */
    private final int f73275e;

    public static InterfaceC9418sk0 a(C9634ul0 c9634ul0) throws GeneralSecurityException {
        if (C7931eo0.a(1)) {
            return new C7728ct0(c9634ul0.d().d(Bk0.a()), c9634ul0.b().b(), c9634ul0.c().c());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static void b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((b10 + b10) ^ ((bArr[i11] & 255) >>> 7)) & com.medallia.digital.mobilesdk.l3.f92484c);
            i10 = i11;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    private final byte[] d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            b(bArr2, this.f73271a);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                bArr4[i14] = (byte) (bArr[(i11 + i13) + i14] ^ bArr4[i14]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i13 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13 + i11, i11 + i12);
        if (bArrCopyOfRange.length == 16) {
            b(bArrCopyOfRange, this.f73271a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f73272b, 16);
            int i15 = 0;
            while (true) {
                length = bArrCopyOfRange.length;
                if (i15 >= length) {
                    break;
                }
                bArrCopyOf[i15] = (byte) (bArrCopyOf[i15] ^ bArrCopyOfRange[i15]);
                i15++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrCopyOfRange = bArrCopyOf;
        }
        b(bArr4, bArrCopyOfRange);
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9418sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f73273c;
        int length = bArr.length;
        int length2 = ((length - bArr3.length) - this.f73275e) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f73269f.get();
        cipher.init(1, this.f73274d);
        byte[] bArrD = d(cipher, 0, bArr, this.f73273c.length, this.f73275e);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrD3 = d(cipher, 2, bArr, this.f73273c.length + this.f73275e, length2);
        int i10 = length - 16;
        byte b10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            b10 = (byte) (b10 | (((bArr[i10 + i11] ^ bArrD2[i11]) ^ bArrD[i11]) ^ bArrD3[i11]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f73270g.get();
        cipher2.init(1, this.f73274d, new IvParameterSpec(bArrD));
        return cipher2.doFinal(bArr, this.f73273c.length + this.f73275e, length2);
    }

    private C7728ct0(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (C7931eo0.a(1)) {
            if (i10 != 12 && i10 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f73275e = i10;
            Ct0.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f73274d = secretKeySpec;
            Cipher cipher = (Cipher) f73269f.get();
            cipher.init(1, secretKeySpec);
            byte[] bArrC = c(cipher.doFinal(new byte[16]));
            this.f73271a = bArrC;
            this.f73272b = c(bArrC);
            this.f73273c = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }
}
