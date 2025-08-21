package Me;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes8.dex */
public class H extends E {
    @Override // Me.E
    int[] b(int[] iArr, int i10) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        B.e(iArr2, B.b(this.f19819a, iArr));
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // Me.E
    int e() {
        return 24;
    }

    public H(byte[] bArr, int i10) throws InvalidKeyException {
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
