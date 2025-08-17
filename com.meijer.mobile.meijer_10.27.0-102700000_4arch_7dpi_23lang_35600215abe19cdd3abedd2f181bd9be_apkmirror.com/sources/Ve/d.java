package Ve;

import Ie.InterfaceC3732f;
import Ne.b;
import com.google.crypto.tink.internal.M;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public final class d implements InterfaceC3732f {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0342b f37475d = b.EnumC0342b.f21529a;

    /* renamed from: e, reason: collision with root package name */
    private static final Collection<Integer> f37476e = Arrays.asList(64);

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f37477f = new byte[16];

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f37478g = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f37479h = new a();

    /* renamed from: a, reason: collision with root package name */
    private final m f37480a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f37481b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f37482c;

    class a extends ThreadLocal<Cipher> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f37506b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }

        a() {
        }
    }

    private byte[] d(byte[]... bArr) throws GeneralSecurityException {
        if (bArr.length == 0) {
            return this.f37480a.a(f37478g, 16);
        }
        byte[] bArrA = this.f37480a.a(f37477f, 16);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = f.e(Se.f.b(bArrA), this.f37480a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f37480a.a(bArr3.length >= 16 ? f.f(bArr3, bArrA) : f.e(Se.f.a(bArr3), Se.f.b(bArrA)), 16);
    }

    @Override // Ie.InterfaceC3732f
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631 - this.f37482c.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = f37479h.get();
        byte[] bArrD = d(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrD.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f37481b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArr4 = this.f37482c;
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + bArrD.length + bArr.length);
        System.arraycopy(bArrD, 0, bArrCopyOf, this.f37482c.length, bArrD.length);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f37482c.length + bArrD.length) == bArr.length) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // Ie.InterfaceC3732f
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f37482c;
        if (length < bArr3.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = f37479h.get();
        byte[] bArr4 = this.f37482c;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) bArrCopyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
        bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f37481b, "AES"), new IvParameterSpec(bArr5));
        int length2 = this.f37482c.length + 16;
        int length3 = bArr.length - length2;
        byte[] bArrDoFinal = cipher.doFinal(bArr, length2, length3);
        if (length3 == 0 && bArrDoFinal == null && q.a()) {
            bArrDoFinal = new byte[0];
        }
        if (f.b(bArrCopyOfRange, d(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public static InterfaceC3732f c(Oe.a aVar) throws GeneralSecurityException {
        return new d(aVar.f().d(Ie.i.a()), aVar.b());
    }

    private d(byte[] bArr, We.a aVar) throws GeneralSecurityException {
        if (f37475d.a()) {
            if (f37476e.contains(Integer.valueOf(bArr.length))) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
                this.f37481b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
                this.f37480a = new m(bArrCopyOfRange);
                this.f37482c = aVar.d();
                return;
            }
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }
}
