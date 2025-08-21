package Xe;

import Ke.InterfaceC3886a;
import Le.C4041q;
import Me.C4134k;
import Pe.b;
import com.google.crypto.tink.internal.M;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes8.dex */
public final class c implements InterfaceC3886a {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0429b f42184c = b.EnumC0429b.f25765b;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f42185a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f42186b;

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = p.a(12);
        AlgorithmParameterSpec algorithmParameterSpecA = C4134k.a(bArrA);
        Cipher cipherD = C4134k.d();
        cipherD.init(1, this.f42185a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        int outputSize = cipherD.getOutputSize(bArr.length);
        byte[] bArr3 = this.f42186b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f42186b.length, 12);
        if (cipherD.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f42186b.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // Ke.InterfaceC3886a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f42186b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecB = C4134k.b(bArr, this.f42186b.length, 12);
        Cipher cipherD = C4134k.d();
        cipherD.init(2, this.f42185a, algorithmParameterSpecB);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        byte[] bArr4 = this.f42186b;
        return cipherD.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }

    private c(byte[] bArr, Ye.a aVar) throws GeneralSecurityException {
        if (f42184c.a()) {
            this.f42185a = C4134k.c(bArr);
            this.f42186b = aVar.d();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static InterfaceC3886a c(C4041q c4041q) throws GeneralSecurityException {
        if (c4041q.a().c() == 12) {
            if (c4041q.a().e() == 16) {
                return new c(c4041q.f().d(Ke.i.a()), c4041q.b());
            }
            throw new GeneralSecurityException("Expected tag Size 16, got " + c4041q.a().e());
        }
        throw new GeneralSecurityException("Expected IV Size 12, got " + c4041q.a().c());
    }
}
