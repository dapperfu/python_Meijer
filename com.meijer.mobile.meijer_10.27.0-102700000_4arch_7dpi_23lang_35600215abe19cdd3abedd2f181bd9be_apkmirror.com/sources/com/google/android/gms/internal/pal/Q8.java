package com.google.android.gms.internal.pal;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Q8 extends N8 {
    @Override // com.google.android.gms.internal.pal.N8
    final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.pal.N8
    final int[] b(int[] iArr, int i10) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        J8.b(iArr3, this.f82795a);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        J8.c(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        J8.b(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    public Q8(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }
}
