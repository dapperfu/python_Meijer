package Me;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes8.dex */
public final class I extends G {
    @Override // Me.G
    E e(byte[] bArr, int i10) throws InvalidKeyException {
        return new H(bArr, i10);
    }

    public I(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // Me.G
    public /* bridge */ /* synthetic */ byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.a(byteBuffer, bArr, bArr2);
    }

    @Override // Me.G
    public /* bridge */ /* synthetic */ void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        super.b(byteBuffer, bArr, bArr2, bArr3);
    }
}
