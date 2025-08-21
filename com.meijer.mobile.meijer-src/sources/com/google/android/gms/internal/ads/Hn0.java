package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
public final class Hn0 extends In0 {
    @Override // com.google.android.gms.internal.ads.In0
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.In0
    public final int[] b(int[] iArr, int i10) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        Gn0.b(iArr2, this.f68520a);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    public Hn0(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }
}
