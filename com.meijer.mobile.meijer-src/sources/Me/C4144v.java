package Me;

import Ke.InterfaceC3886a;
import Pe.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: Me.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4144v implements InterfaceC3886a {

    /* renamed from: c, reason: collision with root package name */
    private static final b.EnumC0429b f19871c = b.EnumC0429b.f25764a;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f19872d = Xe.k.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f19873e = Xe.k.a("070000004041424344454647");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f19874f = Xe.k.a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f19875g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f19876a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f19877b;

    /* renamed from: Me.v$a */
    class a extends ThreadLocal<Cipher> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                Cipher cipherA = Xe.i.f42218b.a("ChaCha20-Poly1305");
                if (C4144v.g(cipherA)) {
                    return cipherA;
                }
                return null;
            } catch (GeneralSecurityException unused) {
                return null;
            }
        }

        a() {
        }
    }

    public static InterfaceC3886a d(Le.A a10) throws GeneralSecurityException {
        return new C4144v(a10.f().d(Ke.i.a()), a10.b().d());
    }

    static Cipher e() {
        return f19875g.get();
    }

    public static boolean f() {
        return f19875g.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f19873e);
            byte[] bArr = f19872d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f19874f;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = Xe.p.a(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrA);
        Cipher cipher = f19875g.get();
        cipher.init(1, this.f19876a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.f19877b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f19877b.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f19877b.length + 12) == outputSize) {
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
        byte[] bArr3 = this.f19877b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.crypto.tink.internal.M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f19877b.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = f19875g.get();
        cipher.init(2, this.f19876a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr5 = this.f19877b;
        return cipher.doFinal(bArr, bArr5.length + 12, (bArr.length - bArr5.length) - 12);
    }

    private C4144v(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (f19871c.a()) {
            if (f()) {
                if (bArr.length == 32) {
                    this.f19876a = new SecretKeySpec(bArr, "ChaCha20");
                    this.f19877b = bArr2;
                    return;
                }
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }
}
