package Ve;

import Ie.InterfaceC3727a;
import Je.q0;
import Ke.I;
import com.google.crypto.tink.internal.M;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class s implements InterfaceC3727a {

    /* renamed from: a, reason: collision with root package name */
    private final I f37535a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f37536b;

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f37535a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    private byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrA = p.a(24);
        byteBufferAllocate.put(bArrA);
        this.f37535a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    public static InterfaceC3727a c(q0 q0Var) throws GeneralSecurityException {
        return new s(q0Var.f().d(Ie.i.a()), q0Var.b().d());
    }

    @Override // Ie.InterfaceC3727a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f37536b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (M.e(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, this.f37536b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    private s(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f37535a = new I(bArr);
        this.f37536b = bArr2;
    }

    @Override // Ie.InterfaceC3727a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrE = e(bArr, bArr2);
        byte[] bArr3 = this.f37536b;
        if (bArr3.length == 0) {
            return bArrE;
        }
        return f.a(bArr3, bArrE);
    }
}
