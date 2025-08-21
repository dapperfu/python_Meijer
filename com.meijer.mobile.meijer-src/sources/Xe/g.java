package Xe;

import Ke.InterfaceC3886a;
import Le.A;
import Me.F;
import com.google.crypto.tink.internal.M;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class g implements InterfaceC3886a {

    /* renamed from: a, reason: collision with root package name */
    private final F f42212a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f42213b;

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f42212a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    private byte[] e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrA = p.a(12);
        byteBufferAllocate.put(bArrA);
        this.f42212a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    public static InterfaceC3886a c(A a10) throws GeneralSecurityException {
        return new g(a10.f().d(Ke.i.a()), a10.b().d());
    }

    @Override // Ke.InterfaceC3886a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f42213b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (M.e(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, this.f42213b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    private g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f42212a = new F(bArr);
        this.f42213b = bArr2;
    }

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrE = e(bArr, bArr2);
        byte[] bArr3 = this.f42213b;
        if (bArr3.length == 0) {
            return bArrE;
        }
        return f.a(bArr3, bArrE);
    }
}
