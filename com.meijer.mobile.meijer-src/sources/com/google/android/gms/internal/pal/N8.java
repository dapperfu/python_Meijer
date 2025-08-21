package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
abstract class N8 {

    /* renamed from: a, reason: collision with root package name */
    int[] f83635a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83636b;

    abstract int a();

    abstract int[] b(int[] iArr, int i10);

    public N8(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f83635a = J8.d(bArr);
            this.f83636b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    final ByteBuffer c(byte[] bArr, int i10) {
        int[] iArrB = b(J8.d(bArr), i10);
        int[] iArr = (int[]) iArrB.clone();
        J8.c(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrB[i11] = iArrB[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
            if (bArr.length == a()) {
                int iRemaining = byteBufferWrap.remaining();
                int i10 = iRemaining / 64;
                int i11 = i10 + 1;
                for (int i12 = 0; i12 < i11; i12++) {
                    ByteBuffer byteBufferC = c(bArr, this.f83636b + i12);
                    if (i12 == i10) {
                        C11035te.a(byteBuffer, byteBufferWrap, byteBufferC, iRemaining % 64);
                    } else {
                        C11035te.a(byteBuffer, byteBufferWrap, byteBufferC, 64);
                    }
                }
                return;
            }
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
