package Ve;

import Ie.InterfaceC3727a;
import Je.C3797q;
import Ke.C3969k;
import Ne.b;
import com.google.crypto.tink.internal.M;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes7.dex */
public final class c implements InterfaceC3727a {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0342b f37472c = b.EnumC0342b.f21530b;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f37473a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f37474b;

    @Override // Ie.InterfaceC3727a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = p.a(12);
        AlgorithmParameterSpec algorithmParameterSpecA = C3969k.a(bArrA);
        Cipher cipherD = C3969k.d();
        cipherD.init(1, this.f37473a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        int outputSize = cipherD.getOutputSize(bArr.length);
        byte[] bArr3 = this.f37474b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f37474b.length, 12);
        if (cipherD.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f37474b.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // Ie.InterfaceC3727a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f37474b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecB = C3969k.b(bArr, this.f37474b.length, 12);
        Cipher cipherD = C3969k.d();
        cipherD.init(2, this.f37473a, algorithmParameterSpecB);
        if (bArr2 != null && bArr2.length != 0) {
            cipherD.updateAAD(bArr2);
        }
        byte[] bArr4 = this.f37474b;
        return cipherD.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }

    private c(byte[] bArr, We.a aVar) throws GeneralSecurityException {
        if (f37472c.a()) {
            this.f37473a = C3969k.c(bArr);
            this.f37474b = aVar.d();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static InterfaceC3727a c(C3797q c3797q) throws GeneralSecurityException {
        if (c3797q.a().c() == 12) {
            if (c3797q.a().e() == 16) {
                return new c(c3797q.f().d(Ie.i.a()), c3797q.b());
            }
            throw new GeneralSecurityException("Expected tag Size 16, got " + c3797q.a().e());
        }
        throw new GeneralSecurityException("Expected IV Size 12, got " + c3797q.a().c());
    }
}
