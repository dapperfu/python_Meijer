package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
public final class Mn0 extends In0 {
    @Override // com.google.android.gms.internal.ads.In0
    final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.In0
    final int[] b(int[] iArr, int i10) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        Gn0.b(iArr2, Gn0.d(this.f68520a, iArr));
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    public Mn0(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }
}
