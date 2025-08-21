package Xe;

import Ke.InterfaceC3886a;
import Le.q0;
import Me.I;
import com.google.crypto.tink.internal.M;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class s implements InterfaceC3886a {

    /* renamed from: a, reason: collision with root package name */
    private final I f42247a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f42248b;

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f42247a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    private byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrA = p.a(24);
        byteBufferAllocate.put(bArrA);
        this.f42247a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    public static InterfaceC3886a c(q0 q0Var) throws GeneralSecurityException {
        return new s(q0Var.f().d(Ke.i.a()), q0Var.b().d());
    }

    @Override // Ke.InterfaceC3886a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f42248b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (M.e(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, this.f42248b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    private s(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f42247a = new I(bArr);
        this.f42248b = bArr2;
    }

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrE = e(bArr, bArr2);
        byte[] bArr3 = this.f42248b;
        if (bArr3.length == 0) {
            return bArrE;
        }
        return f.a(bArr3, bArrE);
    }
}
