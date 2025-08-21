package com.google.android.gms.internal.pal;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Ze {
    public static byte[] c(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return a(bArr, bArr2);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i10 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        int i11 = bArrCopyOf[31] & Byte.MAX_VALUE;
        bArrCopyOf[31] = (byte) i11;
        bArrCopyOf[31] = (byte) (i11 | 64);
        byte[][] bArr3 = C11067ve.f84994a;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 32);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & Byte.MAX_VALUE);
        for (int i12 = 0; i12 < 7; i12++) {
            byte[][] bArr4 = C11067ve.f84994a;
            if (C11035te.b(bArr4[i12], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(Pe.a(bArr4[i12])));
            }
        }
        long[] jArrK = Oe.k(bArrCopyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i13 = 10;
        System.arraycopy(jArrK, 0, jArr2, 0, 10);
        for (int i14 = 32; i10 < i14; i14 = 32) {
            int i15 = bArrCopyOf[31 - i10] & 255;
            int i16 = 0;
            while (i16 < 8) {
                int i17 = (i15 >> (7 - i16)) & 1;
                C11067ve.a(jArr4, jArr2, i17);
                C11067ve.a(jArr5, jArr3, i17);
                byte[] bArr5 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr4, 10);
                int i18 = i15;
                long[] jArr10 = new long[19];
                int i19 = i10;
                long[] jArr11 = new long[19];
                int i20 = i16;
                long[] jArr12 = new long[19];
                long[] jArr13 = jArr;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                Oe.i(jArr4, jArr4, jArr5);
                Oe.h(jArr5, jArrCopyOf, jArr5);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                Oe.i(jArr2, jArr2, jArr3);
                Oe.h(jArr3, jArrCopyOf2, jArr3);
                Oe.b(jArr14, jArr2, jArr5);
                Oe.b(jArr15, jArr4, jArr3);
                Oe.e(jArr14);
                Oe.d(jArr14);
                Oe.e(jArr15);
                Oe.d(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, jArrCopyOf2, 0, 10);
                Oe.i(jArr14, jArr14, jArr15);
                Oe.h(jArr15, jArrCopyOf2, jArr15);
                Oe.g(jArr18, jArr14);
                Oe.g(jArr17, jArr15);
                Oe.b(jArr15, jArr17, jArrK);
                Oe.e(jArr15);
                Oe.d(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                Oe.g(jArr11, jArr4);
                Oe.g(jArr12, jArr5);
                Oe.b(jArr8, jArr11, jArr12);
                Oe.e(jArr8);
                Oe.d(jArr8);
                Oe.h(jArr12, jArr11, jArr12);
                Arrays.fill(jArr10, 10, 18, 0L);
                Oe.f(jArr10, jArr12, 121665L);
                Oe.d(jArr10);
                Oe.i(jArr10, jArr10, jArr11);
                Oe.b(jArr16, jArr12, jArr10);
                Oe.e(jArr16);
                Oe.d(jArr16);
                C11067ve.a(jArr8, jArr6, i17);
                C11067ve.a(jArr16, jArr7, i17);
                i16 = i20 + 1;
                long[] jArr20 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr20;
                long[] jArr21 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr21;
                long[] jArr22 = jArr5;
                jArr5 = jArr16;
                jArr9 = jArr22;
                jArr2 = jArr6;
                i15 = i18;
                bArrCopyOf = bArr5;
                i10 = i19;
                jArr = jArr13;
                jArr6 = jArr19;
            }
            i10++;
            i13 = 10;
        }
        int i21 = i13;
        long[] jArr23 = jArr;
        long[] jArr24 = new long[i21];
        long[] jArr25 = new long[i21];
        long[] jArr26 = new long[i21];
        long[] jArr27 = new long[i21];
        long[] jArr28 = new long[i21];
        long[] jArr29 = new long[i21];
        long[] jArr30 = new long[i21];
        long[] jArr31 = new long[i21];
        long[] jArr32 = new long[i21];
        long[] jArr33 = new long[i21];
        long[] jArr34 = jArr2;
        long[] jArr35 = new long[i21];
        Oe.g(jArr25, jArr5);
        Oe.g(jArr35, jArr25);
        Oe.g(jArr33, jArr35);
        Oe.a(jArr26, jArr33, jArr5);
        Oe.a(jArr27, jArr26, jArr25);
        Oe.g(jArr33, jArr27);
        Oe.a(jArr28, jArr33, jArr26);
        Oe.g(jArr33, jArr28);
        Oe.g(jArr35, jArr33);
        Oe.g(jArr33, jArr35);
        Oe.g(jArr35, jArr33);
        Oe.g(jArr33, jArr35);
        Oe.a(jArr29, jArr33, jArr28);
        Oe.g(jArr33, jArr29);
        Oe.g(jArr35, jArr33);
        for (int i22 = 2; i22 < 10; i22 += 2) {
            Oe.g(jArr33, jArr35);
            Oe.g(jArr35, jArr33);
        }
        Oe.a(jArr30, jArr35, jArr29);
        Oe.g(jArr33, jArr30);
        Oe.g(jArr35, jArr33);
        for (int i23 = 2; i23 < 20; i23 += 2) {
            Oe.g(jArr33, jArr35);
            Oe.g(jArr35, jArr33);
        }
        Oe.a(jArr33, jArr35, jArr30);
        Oe.g(jArr35, jArr33);
        Oe.g(jArr33, jArr35);
        for (int i24 = 2; i24 < 10; i24 += 2) {
            Oe.g(jArr35, jArr33);
            Oe.g(jArr33, jArr35);
        }
        Oe.a(jArr31, jArr33, jArr29);
        Oe.g(jArr33, jArr31);
        Oe.g(jArr35, jArr33);
        for (int i25 = 2; i25 < 50; i25 += 2) {
            Oe.g(jArr33, jArr35);
            Oe.g(jArr35, jArr33);
        }
        Oe.a(jArr32, jArr35, jArr31);
        Oe.g(jArr35, jArr32);
        Oe.g(jArr33, jArr35);
        for (int i26 = 2; i26 < 100; i26 += 2) {
            Oe.g(jArr35, jArr33);
            Oe.g(jArr33, jArr35);
        }
        Oe.a(jArr35, jArr33, jArr32);
        Oe.g(jArr33, jArr35);
        Oe.g(jArr35, jArr33);
        for (int i27 = 2; i27 < 50; i27 += 2) {
            Oe.g(jArr33, jArr35);
            Oe.g(jArr35, jArr33);
        }
        Oe.a(jArr33, jArr35, jArr31);
        Oe.g(jArr35, jArr33);
        Oe.g(jArr33, jArr35);
        Oe.g(jArr35, jArr33);
        Oe.g(jArr33, jArr35);
        Oe.g(jArr35, jArr33);
        Oe.a(jArr24, jArr35, jArr27);
        Oe.a(jArr23, jArr4, jArr24);
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[11];
        long[] jArr39 = new long[11];
        long[] jArr40 = new long[11];
        Oe.a(jArr36, jArrK, jArr23);
        Oe.i(jArr37, jArrK, jArr23);
        long[] jArr41 = new long[10];
        jArr41[0] = 486662;
        Oe.i(jArr39, jArr37, jArr41);
        Oe.a(jArr39, jArr39, jArr3);
        Oe.i(jArr39, jArr39, jArr34);
        Oe.a(jArr39, jArr39, jArr36);
        Oe.a(jArr39, jArr39, jArr34);
        Oe.f(jArr38, jArr39, 4L);
        Oe.d(jArr38);
        Oe.a(jArr39, jArr36, jArr3);
        Oe.h(jArr39, jArr39, jArr3);
        Oe.a(jArr40, jArr37, jArr34);
        Oe.i(jArr39, jArr39, jArr40);
        Oe.g(jArr39, jArr39);
        if (C11035te.b(Oe.j(jArr38), Oe.j(jArr39))) {
            return Oe.j(jArr23);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(Pe.a(bArr2)));
    }

    public static byte[] b() {
        byte[] bArrA = We.a(32);
        bArrA[0] = (byte) (bArrA[0] | 7);
        int i10 = bArrA[31] & 63;
        bArrA[31] = (byte) i10;
        bArrA[31] = (byte) (i10 | 128);
        return bArrA;
    }
}
