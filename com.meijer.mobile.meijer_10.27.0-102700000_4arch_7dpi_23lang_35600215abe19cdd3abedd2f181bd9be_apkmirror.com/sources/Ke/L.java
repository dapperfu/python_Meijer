package Ke;

import Ie.InterfaceC3727a;
import Je.l0;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class L implements InterfaceC3727a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f16468a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16469b;

    /* renamed from: c, reason: collision with root package name */
    private final Te.a f16470c;

    private byte[] d(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.f16470c.a(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.f16470c.a(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // Ie.InterfaceC3727a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = Ve.p.a(this.f16469b + 12);
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, this.f16469b);
        int i10 = this.f16469b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, i10, i10 + 12);
        byte[] bArrB = new C(d(bArrCopyOf)).b(bArrCopyOfRange, bArr, this.f16468a.length + this.f16469b + bArrCopyOfRange.length, bArr2);
        byte[] bArr3 = this.f16468a;
        System.arraycopy(bArr3, 0, bArrB, 0, bArr3.length);
        System.arraycopy(bArrA, 0, bArrB, this.f16468a.length, bArrA.length);
        return bArrB;
    }

    @Override // Ie.InterfaceC3727a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f16468a;
        if (length < bArr3.length + this.f16469b + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.crypto.tink.internal.M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.f16468a.length + this.f16469b;
        int i10 = length2 + 12;
        return new C(d(Arrays.copyOfRange(bArr, this.f16468a.length, length2))).a(Arrays.copyOfRange(bArr, length2, i10), bArr, i10, bArr2);
    }

    private L(byte[] bArr, We.a aVar, int i10) throws GeneralSecurityException {
        this.f16470c = new Ve.m(bArr);
        this.f16468a = aVar.d();
        this.f16469b = i10;
    }

    public static InterfaceC3727a c(l0 l0Var) throws GeneralSecurityException {
        if (l0Var.a().c() >= 8 && l0Var.a().c() <= 12) {
            return new L(l0Var.f().d(Ie.i.a()), l0Var.b(), l0Var.a().c());
        }
        throw new GeneralSecurityException("invalid salt size");
    }
}
