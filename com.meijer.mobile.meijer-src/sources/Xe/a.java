package Xe;

import Pe.b;
import com.google.android.gms.common.api.a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0429b f42171d = b.EnumC0429b.f25765b;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f42172e = new C0899a();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f42173a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42174b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42175c;

    /* renamed from: Xe.a$a, reason: collision with other inner class name */
    class C0899a extends ThreadLocal<Cipher> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return i.f42218b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }

        C0899a() {
        }
    }

    @Override // Xe.l
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f42174b;
        if (length > a.e.API_PRIORITY_OTHER - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (a.e.API_PRIORITY_OTHER - this.f42174b));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrA = p.a(i10);
        System.arraycopy(bArrA, 0, bArr2, 0, this.f42174b);
        c(bArr, 0, bArr.length, bArr2, this.f42174b, bArrA, true);
        return bArr2;
    }

    @Override // Xe.l
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f42174b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f42174b;
        byte[] bArr3 = new byte[length2 - i11];
        c(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }

    private void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = f42172e.get();
        byte[] bArr4 = new byte[this.f42175c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f42174b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z10) {
            cipher.init(1, this.f42173a, ivParameterSpec);
        } else {
            cipher.init(2, this.f42173a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    public a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (f42171d.a()) {
            r.a(bArr.length);
            this.f42173a = new SecretKeySpec(bArr, "AES");
            int blockSize = f42172e.get().getBlockSize();
            this.f42175c = blockSize;
            if (i10 >= 12 && i10 <= blockSize) {
                this.f42174b = i10;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }
}
