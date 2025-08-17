package Ve;

import Ne.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public final class m implements Te.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0342b f37517d = b.EnumC0342b.f21529a;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f37518e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f37519a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f37520b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f37521c;

    class a extends ThreadLocal<Cipher> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f37506b.a("AES/ECB/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }

        a() {
        }
    }

    static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return ((i10 - 1) / 16) + 1;
    }

    private static void e(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    private static Cipher d() throws GeneralSecurityException {
        if (f37517d.a()) {
            return f37518e.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // Te.a
    public byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherD = d();
        cipherD.init(1, this.f37519a);
        int iB = b(bArr.length);
        byte[] bArrD = iB * 16 == bArr.length ? f.d(bArr, (iB - 1) * 16, this.f37520b, 0, 16) : f.e(Se.f.a(Arrays.copyOfRange(bArr, (iB - 1) * 16, bArr.length)), this.f37521c);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i11 = 0; i11 < iB - 1; i11++) {
            e(bArr2, bArr, i11 * 16, bArr3);
            if (cipherD.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        e(bArr2, bArrD, 0, bArr3);
        if (cipherD.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i10 ? bArr2 : Arrays.copyOf(bArr2, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }

    public m(byte[] bArr) throws GeneralSecurityException {
        r.a(bArr.length);
        this.f37519a = new SecretKeySpec(bArr, "AES");
        c();
    }

    private void c() throws GeneralSecurityException {
        Cipher cipherD = d();
        cipherD.init(1, this.f37519a);
        byte[] bArrB = Se.f.b(cipherD.doFinal(new byte[16]));
        this.f37520b = bArrB;
        this.f37521c = Se.f.b(bArrB);
    }
}
