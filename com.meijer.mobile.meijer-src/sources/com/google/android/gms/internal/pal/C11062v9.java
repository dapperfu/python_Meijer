package com.google.android.gms.internal.pal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.v9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11062v9 {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f84985g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11046u9 f84986a;

    /* renamed from: b, reason: collision with root package name */
    private final BigInteger f84987b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f84988c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f84989d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f84990e;

    /* renamed from: f, reason: collision with root package name */
    private BigInteger f84991f = BigInteger.ZERO;

    private C11062v9(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, InterfaceC11046u9 interfaceC11046u9) {
        this.f84990e = bArr;
        this.f84988c = bArr2;
        this.f84989d = bArr3;
        this.f84987b = bigInteger;
        this.f84986a = interfaceC11046u9;
    }

    private final synchronized byte[] d() throws GeneralSecurityException {
        byte[] bArrD;
        try {
            byte[] bArr = this.f84989d;
            byte[] byteArray = this.f84991f.toByteArray();
            int length = byteArray.length;
            if (length != 12) {
                if (length > 13) {
                    throw new GeneralSecurityException("integer too large");
                }
                if (length != 13) {
                    byte[] bArr2 = new byte[12];
                    System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                    byteArray = bArr2;
                } else {
                    if (byteArray[0] != 0) {
                        throw new GeneralSecurityException("integer too large");
                    }
                    byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                }
            }
            bArrD = C11035te.d(bArr, byteArray);
            if (this.f84991f.compareTo(this.f84987b) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            this.f84991f = this.f84991f.add(BigInteger.ONE);
        } catch (Throwable th2) {
            throw th2;
        }
        return bArrD;
    }

    final byte[] a() {
        return this.f84990e;
    }

    static C11062v9 c(byte[] bArr, byte[] bArr2, InterfaceC11126z9 interfaceC11126z9, C11030t9 c11030t9, InterfaceC11046u9 interfaceC11046u9, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrB = I9.b(interfaceC11126z9.zzb(), c11030t9.c(), interfaceC11046u9.zzb());
        byte[] bArr4 = I9.f83511l;
        byte[] bArr5 = f84985g;
        byte[] bArrC = C11035te.c(I9.f83500a, c11030t9.e(bArr4, bArr5, "psk_id_hash", bArrB), c11030t9.e(bArr4, bArr3, "info_hash", bArrB));
        byte[] bArrE = c11030t9.e(bArr2, bArr5, "secret", bArrB);
        byte[] bArrD = c11030t9.d(bArrE, bArrC, "key", bArrB, interfaceC11046u9.zza());
        byte[] bArrD2 = c11030t9.d(bArrE, bArrC, "base_nonce", bArrB, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new C11062v9(bArr, bArrD, bArrD2, bigInteger.shiftLeft(96).subtract(bigInteger), interfaceC11046u9);
    }

    final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f84986a.a(this.f84988c, d(), bArr, bArr2);
    }
}
