package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.pal.pe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10972pe implements InterfaceC10949o7 {

    /* renamed from: c, reason: collision with root package name */
    private static final Collection f84120c = Arrays.asList(64);

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f84121d = new byte[16];

    /* renamed from: a, reason: collision with root package name */
    private final Re f84122a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f84123b;

    @Override // com.google.android.gms.internal.pal.InterfaceC10949o7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrD;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) Ee.f83424e.a("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] bArrA = this.f84122a.a(f84121d, 16);
        for (int i10 = 0; i10 <= 0; i10++) {
            byte[] bArr4 = bArr3[i10];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArrA = C11035te.d(Wa.b(bArrA), this.f84122a.a(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = bArrA.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i11 = length - length2;
            bArrD = Arrays.copyOf(bArr5, length);
            for (int i12 = 0; i12 < bArrA.length; i12++) {
                int i13 = i11 + i12;
                bArrD[i13] = (byte) (bArrD[i13] ^ bArrA[i12]);
            }
        } else {
            bArrD = C11035te.d(Wa.a(bArr5), Wa.b(bArrA));
        }
        byte[] bArrA2 = this.f84122a.a(bArrD, 16);
        byte[] bArr6 = (byte[]) bArrA2.clone();
        bArr6[8] = (byte) (bArr6[8] & Byte.MAX_VALUE);
        bArr6[12] = (byte) (bArr6[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f84123b, "AES"), new IvParameterSpec(bArr6));
        return C11035te.c(bArrA2, cipher.doFinal(bArr));
    }

    public C10972pe(byte[] bArr) throws GeneralSecurityException {
        if (W8.a(1)) {
            Collection collection = f84120c;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i10 = length >> 1;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i10);
                this.f84123b = Arrays.copyOfRange(bArr, i10, length);
                this.f84122a = new Re(bArrCopyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }
}
