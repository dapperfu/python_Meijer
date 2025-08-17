package Ve;

import Ne.b;
import com.google.android.gms.common.api.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0342b f37459d = b.EnumC0342b.f21530b;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f37460e = new C0809a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f37461a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37462b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37463c;

    /* renamed from: Ve.a$a, reason: collision with other inner class name */
    class C0809a extends ThreadLocal<Cipher> {
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

        C0809a() {
        }
    }

    @Override // Ve.l
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f37462b;
        if (length > a.e.API_PRIORITY_OTHER - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (a.e.API_PRIORITY_OTHER - this.f37462b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrA = p.a(i10);
        System.arraycopy(bArrA, 0, bArr2, 0, this.f37462b);
        c(bArr, 0, bArr.length, bArr2, this.f37462b, bArrA, true);
        return bArr2;
    }

    @Override // Ve.l
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f37462b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f37462b;
        byte[] bArr3 = new byte[length2 - i11];
        c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }

    private void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = f37460e.get();
        byte[] bArr4 = new byte[this.f37463c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f37462b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f37461a, ivParameterSpec);
        } else {
            cipher.init(2, this.f37461a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    public a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (f37459d.a()) {
            r.a(bArr.length);
            this.f37461a = new SecretKeySpec(bArr, "AES");
            int blockSize = f37460e.get().getBlockSize();
            this.f37463c = blockSize;
            if (i10 >= 12 && i10 <= blockSize) {
                this.f37462b = i10;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }
}
