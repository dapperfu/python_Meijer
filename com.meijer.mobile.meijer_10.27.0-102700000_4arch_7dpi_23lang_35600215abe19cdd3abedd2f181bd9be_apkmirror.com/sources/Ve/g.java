package Ve;

import Ie.InterfaceC3727a;
import Je.A;
import Ke.F;
import com.google.crypto.tink.internal.M;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class g implements InterfaceC3727a {

    /* renamed from: a, reason: collision with root package name */
    private final F f37500a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f37501b;

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f37500a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    private byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrA = p.a(12);
        byteBufferAllocate.put(bArrA);
        this.f37500a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    public static InterfaceC3727a c(A a10) throws GeneralSecurityException {
        return new g(a10.f().d(Ie.i.a()), a10.b().d());
    }

    @Override // Ie.InterfaceC3727a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f37501b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (M.e(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, this.f37501b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    private g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f37500a = new F(bArr);
        this.f37501b = bArr2;
    }

    @Override // Ie.InterfaceC3727a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrE = e(bArr, bArr2);
        byte[] bArr3 = this.f37501b;
        if (bArr3.length == 0) {
            return bArrE;
        }
        return f.a(bArr3, bArrE);
    }
}
