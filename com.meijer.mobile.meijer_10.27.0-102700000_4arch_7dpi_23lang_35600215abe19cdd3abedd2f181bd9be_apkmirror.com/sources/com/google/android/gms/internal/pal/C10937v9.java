package com.google.android.gms.internal.pal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.v9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10937v9 {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f84145g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10921u9 f84146a;

    /* renamed from: b, reason: collision with root package name */
    private final BigInteger f84147b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f84148c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f84149d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f84150e;

    /* renamed from: f, reason: collision with root package name */
    private BigInteger f84151f = BigInteger.ZERO;

    private C10937v9(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, InterfaceC10921u9 interfaceC10921u9) {
        this.f84150e = bArr;
        this.f84148c = bArr2;
        this.f84149d = bArr3;
        this.f84147b = bigInteger;
        this.f84146a = interfaceC10921u9;
    }

    private final synchronized byte[] d() throws GeneralSecurityException {
        byte[] bArrD;
        try {
            byte[] bArr = this.f84149d;
            byte[] byteArray = this.f84151f.toByteArray();
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
            bArrD = C10910te.d(bArr, byteArray);
            if (this.f84151f.compareTo(this.f84147b) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            this.f84151f = this.f84151f.add(BigInteger.ONE);
        } catch (Throwable th2) {
            throw th2;
        }
        return bArrD;
    }

    final byte[] a() {
        return this.f84150e;
    }

    static C10937v9 c(byte[] bArr, byte[] bArr2, InterfaceC11001z9 interfaceC11001z9, C10905t9 c10905t9, InterfaceC10921u9 interfaceC10921u9, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArrB = I9.b(interfaceC11001z9.zzb(), c10905t9.c(), interfaceC10921u9.zzb());
        byte[] bArr4 = I9.f82671l;
        byte[] bArr5 = f84145g;
        byte[] bArrC = C10910te.c(I9.f82660a, c10905t9.e(bArr4, bArr5, "psk_id_hash", bArrB), c10905t9.e(bArr4, bArr3, "info_hash", bArrB));
        byte[] bArrE = c10905t9.e(bArr2, bArr5, "secret", bArrB);
        byte[] bArrD = c10905t9.d(bArrE, bArrC, "key", bArrB, interfaceC10921u9.zza());
        byte[] bArrD2 = c10905t9.d(bArrE, bArrC, "base_nonce", bArrB, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new C10937v9(bArr, bArrD, bArrD2, bigInteger.shiftLeft(96).subtract(bigInteger), interfaceC10921u9);
    }

    final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f84146a.a(this.f84148c, d(), bArr, bArr2);
    }
}
