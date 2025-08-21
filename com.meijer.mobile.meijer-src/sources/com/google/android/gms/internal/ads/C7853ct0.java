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
public final class C7853ct0 implements InterfaceC9543sk0 {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f74109f = new C7640at0();

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal f74110g = new C7747bt0();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f74111a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f74112b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f74113c;

    /* renamed from: d, reason: collision with root package name */
    private final SecretKeySpec f74114d;

    /* renamed from: e, reason: collision with root package name */
    private final int f74115e;

    public static InterfaceC9543sk0 a(C9759ul0 c9759ul0) throws GeneralSecurityException {
        if (C8056eo0.a(1)) {
            return new C7853ct0(c9759ul0.d().d(Bk0.a()), c9759ul0.b().b(), c9759ul0.c().c());
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
            bArr2[i10] = (byte) (((b10 + b10) ^ ((bArr[i11] & 255) >>> 7)) & com.medallia.digital.mobilesdk.l3.f93323c);
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
            b(bArr2, this.f74111a);
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
            b(bArrCopyOfRange, this.f74111a);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f74112b, 16);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f74113c;
        int length = bArr.length;
        int length2 = ((length - bArr3.length) - this.f74115e) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!Hp0.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) f74109f.get();
        cipher.init(1, this.f74114d);
        byte[] bArrD = d(cipher, 0, bArr, this.f74113c.length, this.f74115e);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrD3 = d(cipher, 2, bArr, this.f74113c.length + this.f74115e, length2);
        int i10 = length - 16;
        byte b10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            b10 = (byte) (b10 | (((bArr[i10 + i11] ^ bArrD2[i11]) ^ bArrD[i11]) ^ bArrD3[i11]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f74110g.get();
        cipher2.init(1, this.f74114d, new IvParameterSpec(bArrD));
        return cipher2.doFinal(bArr, this.f74113c.length + this.f74115e, length2);
    }

    private C7853ct0(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (C8056eo0.a(1)) {
            if (i10 != 12 && i10 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f74115e = i10;
            Ct0.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f74114d = secretKeySpec;
            Cipher cipher = (Cipher) f74109f.get();
            cipher.init(1, secretKeySpec);
            byte[] bArrC = c(cipher.doFinal(new byte[16]));
            this.f74111a = bArrC;
            this.f74112b = c(bArrC);
            this.f74113c = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }
}
