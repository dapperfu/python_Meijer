package Me;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes8.dex */
abstract class E {

    /* renamed from: a, reason: collision with root package name */
    int[] f19819a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19820b;

    private void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferA = a(bArr, this.f19820b + i12);
            if (i12 == i10) {
                Xe.f.c(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                Xe.f.c(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    abstract int[] b(int[] iArr, int i10);

    abstract int e();

    public E(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f19819a = B.h(bArr);
            this.f19820b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    ByteBuffer a(byte[] bArr, int i10) {
        int[] iArrB = b(B.h(bArr), i10);
        int[] iArr = (int[]) iArrB.clone();
        B.f(iArr);
        for (int i11 = 0; i11 < iArrB.length; i11++) {
            iArrB[i11] = iArrB[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
