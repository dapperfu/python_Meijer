package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Wa {
    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[length] = Byte.MIN_VALUE;
        return bArrCopyOf;
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            byte b11 = (byte) ((b10 + b10) & 254);
            bArr2[i10] = b11;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((bArr[i10 + 1] >> 7) & 1) | b11);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
