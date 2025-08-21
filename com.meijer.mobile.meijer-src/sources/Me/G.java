package Me;

import Pe.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes8.dex */
abstract class G {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0429b f19821c = b.EnumC0429b.f25764a;

    /* renamed from: a, reason: collision with root package name */
    private final E f19822a;

    /* renamed from: b, reason: collision with root package name */
    private final E f19823b;

    private static byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining % 16;
        int i11 = (i10 == 0 ? iRemaining : (iRemaining + 16) - i10) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i11);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    abstract E e(byte[] bArr, int i10) throws InvalidKeyException;

    private byte[] c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.f19823b.a(bArr, 0).get(bArr2);
        return bArr2;
    }

    public G(byte[] bArr) throws GeneralSecurityException {
        if (f19821c.a()) {
            this.f19822a = e(bArr, 1);
            this.f19823b = e(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int iPosition = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                K.f(c(bArr), d(bArr2, byteBuffer), bArr3);
                byteBuffer.position(iPosition);
                return this.f19822a.c(bArr, byteBuffer);
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int iPosition = byteBuffer.position();
            this.f19822a.d(byteBuffer, bArr, bArr2);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            byte[] bArrA = K.a(c(bArr), d(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(bArrA);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
