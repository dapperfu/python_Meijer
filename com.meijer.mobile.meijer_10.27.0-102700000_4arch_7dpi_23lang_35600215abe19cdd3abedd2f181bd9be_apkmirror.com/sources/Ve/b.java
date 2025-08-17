package Ve;

import Ie.InterfaceC3727a;
import Je.C3792l;
import Ne.b;
import com.google.android.gms.common.api.a;
import com.google.crypto.tink.internal.M;
import com.medallia.digital.mobilesdk.l3;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public final class b implements InterfaceC3727a {

    /* renamed from: f, reason: collision with root package name */
    public static final b.EnumC0342b f37464f = b.EnumC0342b.f21529a;

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f37465g = new a();

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f37466h = new C0810b();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f37467a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f37468b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f37469c;

    /* renamed from: d, reason: collision with root package name */
    private final SecretKeySpec f37470d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37471e;

    class a extends ThreadLocal<Cipher> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f37506b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }

        a() {
        }
    }

    /* renamed from: Ve.b$b, reason: collision with other inner class name */
    class C0810b extends ThreadLocal<Cipher> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f37506b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }

        C0810b() {
        }
    }

    private static void g(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    @Override // Ie.InterfaceC3727a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f37469c;
        int length2 = a.e.API_PRIORITY_OTHER - bArr3.length;
        int i10 = this.f37471e;
        if (length > (length2 - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i10 + bArr.length + 16);
        byte[] bArrA = p.a(this.f37471e);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f37469c.length, this.f37471e);
        Cipher cipher = f37465g.get();
        cipher.init(1, this.f37470d);
        byte[] bArrE = e(cipher, 0, bArrA, 0, bArrA.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrE2 = e(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = f37466h.get();
        cipher2.init(1, this.f37470d, new IvParameterSpec(bArrE));
        cipher2.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f37469c.length + this.f37471e);
        byte[] bArrE3 = e(cipher, 2, bArrCopyOf, this.f37469c.length + this.f37471e, bArr.length);
        int length3 = this.f37469c.length + bArr.length + this.f37471e;
        for (int i11 = 0; i11 < 16; i11++) {
            bArrCopyOf[length3 + i11] = (byte) ((bArrE2[i11] ^ bArrE[i11]) ^ bArrE3[i11]);
        }
        return bArrCopyOf;
    }

    @Override // Ie.InterfaceC3727a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f37469c;
        int length2 = ((length - bArr3.length) - this.f37471e) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = f37465g.get();
        cipher.init(1, this.f37470d);
        byte[] bArrE = e(cipher, 0, bArr, this.f37469c.length, this.f37471e);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrE2 = e(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrE3 = e(cipher, 2, bArr, this.f37469c.length + this.f37471e, length2);
        int length3 = bArr.length - 16;
        byte b10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b10 = (byte) (b10 | (((bArr[length3 + i10] ^ bArrE2[i10]) ^ bArrE[i10]) ^ bArrE3[i10]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = f37466h.get();
        cipher2.init(1, this.f37470d, new IvParameterSpec(bArrE));
        return cipher2.doFinal(bArr, this.f37469c.length + this.f37471e, length2);
    }

    public static InterfaceC3727a c(C3792l c3792l) throws GeneralSecurityException {
        if (!f37464f.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (c3792l.a().e() == 16) {
            return new b(c3792l.f().d(Ie.i.a()), c3792l.a().c(), c3792l.b().d());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + c3792l.a().e());
    }

    private static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & l3.f92484c);
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private byte[] e(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            g(bArr2, this.f37467a);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                bArr4[i14] = (byte) (bArr4[i14] ^ bArr[(i11 + i13) + i14]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i13 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        g(bArr4, f(bArr, i13 + i11, i11 + i12));
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }

    private b(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (f37464f.a()) {
            if (i10 != 12 && i10 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f37471e = i10;
            r.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f37470d = secretKeySpec;
            Cipher cipher = f37465g.get();
            cipher.init(1, secretKeySpec);
            byte[] bArrD = d(cipher.doFinal(new byte[16]));
            this.f37467a = bArrD;
            this.f37468b = d(bArrD);
            this.f37469c = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private byte[] f(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        if (bArrCopyOfRange.length == 16) {
            g(bArrCopyOfRange, this.f37467a);
            return bArrCopyOfRange;
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f37468b, 16);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOf[i12] = (byte) (bArrCopyOf[i12] ^ bArrCopyOfRange[i12]);
        }
        bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        return bArrCopyOf;
    }
}
