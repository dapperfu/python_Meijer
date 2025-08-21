package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
abstract class In0 {

    /* renamed from: a, reason: collision with root package name */
    int[] f68520a;

    /* renamed from: b, reason: collision with root package name */
    private final int f68521b;

    abstract int a();

    abstract int[] b(int[] iArr, int i10);

    public In0(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f68520a = Gn0.e(bArr);
            this.f68521b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    final ByteBuffer c(byte[] bArr, int i10) {
        int[] iArrB = b(Gn0.e(bArr), i10);
        int[] iArr = (int[]) iArrB.clone();
        Gn0.c(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrB[i11] = iArrB[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] d(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == a()) {
            int iRemaining = byteBuffer.remaining();
            int i10 = iRemaining / 64;
            for (int i11 = 0; i11 < i10 + 1; i11++) {
                ByteBuffer byteBufferC = c(bArr, this.f68521b + i11);
                if (i11 == i10) {
                    C8066et0.a(byteBufferAllocate, byteBuffer, byteBufferC, iRemaining % 64);
                } else {
                    C8066et0.a(byteBufferAllocate, byteBuffer, byteBufferC, 64);
                }
            }
            return byteBufferAllocate.array();
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
    }
}
