package Me;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes8.dex */
public class D extends E {
    @Override // Me.E
    public int[] b(int[] iArr, int i10) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        B.e(iArr2, this.f19819a);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // Me.E
    public int e() {
        return 12;
    }

    public D(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // Me.E
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.c(bArr, byteBuffer);
    }

    @Override // Me.E
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.d(byteBuffer, bArr, bArr2);
    }
}
