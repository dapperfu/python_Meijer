package Me;

import Ke.InterfaceC3886a;
import Le.q0;
import Pe.b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public final class S implements InterfaceC3886a {

    /* renamed from: c, reason: collision with root package name */
    private static final b.EnumC0429b f19836c = b.EnumC0429b.f25764a;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f19837a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f19838b;

    public static InterfaceC3886a c(q0 q0Var) throws GeneralSecurityException {
        return new S(q0Var.f().d(Ke.i.a()), q0Var.b().d());
    }

    static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = Xe.p.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(B.a(this.f19837a, bArrA), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArrA));
        Cipher cipherE = C4144v.e();
        cipherE.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherE.updateAAD(bArr2);
        }
        int outputSize = cipherE.getOutputSize(bArr.length);
        byte[] bArr3 = this.f19838b;
        if (outputSize > 2147483623 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 24 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f19838b.length, 24);
        if (cipherE.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f19838b.length + 24) == outputSize) {
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
        byte[] bArr3 = this.f19838b;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.crypto.tink.internal.M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.f19838b.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(B.a(this.f19837a, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(d(bArr4));
        Cipher cipherE = C4144v.e();
        cipherE.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherE.updateAAD(bArr2);
        }
        byte[] bArr5 = this.f19838b;
        return cipherE.doFinal(bArr, bArr5.length + 24, (bArr.length - bArr5.length) - 24);
    }

    private S(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (f19836c.a()) {
            if (e()) {
                if (bArr.length == 32) {
                    this.f19837a = bArr;
                    this.f19838b = bArr2;
                    return;
                }
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static boolean e() {
        if (C4144v.e() != null) {
            return true;
        }
        return false;
    }
}
