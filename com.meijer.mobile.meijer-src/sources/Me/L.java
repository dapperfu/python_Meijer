package Me;

import Ke.InterfaceC3886a;
import Le.l0;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class L implements InterfaceC3886a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f19827a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19828b;

    /* renamed from: c, reason: collision with root package name */
    private final Ve.a f19829c;

    private byte[] d(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.f19829c.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.f19829c.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = Xe.p.a(this.f19828b + 12);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, this.f19828b);
        int i10 = this.f19828b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i10, i10 + 12);
        byte[] bArrB = new C(d(bArrCopyOf)).b(bArrCopyOfRange, bArr, this.f19827a.length + this.f19828b + bArrCopyOfRange.length, bArr2);
        byte[] bArr3 = this.f19827a;
        System.arraycopy(bArr3, 0, bArrB, 0, bArr3.length);
        System.arraycopy(bArrA, 0, bArrB, this.f19827a.length, bArrA.length);
        return bArrB;
    }

    @Override // Ke.InterfaceC3886a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f19827a;
        if (length < bArr3.length + this.f19828b + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.crypto.tink.internal.M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.f19827a.length + this.f19828b;
        int i10 = length2 + 12;
        return new C(d(Arrays.copyOfRange(bArr, this.f19827a.length, length2))).a(Arrays.copyOfRange(bArr, length2, i10), bArr, i10, bArr2);
    }

    private L(byte[] bArr, Ye.a aVar, int i10) throws GeneralSecurityException {
        this.f19829c = new Xe.m(bArr);
        this.f19827a = aVar.d();
        this.f19828b = i10;
    }

    public static InterfaceC3886a c(l0 l0Var) throws GeneralSecurityException {
        if (l0Var.a().c() >= 8 && l0Var.a().c() <= 12) {
            return new L(l0Var.f().d(Ke.i.a()), l0Var.b(), l0Var.a().c());
        }
        throw new GeneralSecurityException("invalid salt size");
    }
}
