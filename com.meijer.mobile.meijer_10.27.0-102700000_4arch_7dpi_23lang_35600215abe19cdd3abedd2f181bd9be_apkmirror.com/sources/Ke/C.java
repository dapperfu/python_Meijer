package Ke;

import Ne.b;
import com.google.android.gms.common.api.a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes7.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0342b f16458b = b.EnumC0342b.f21530b;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f16459a;

    public byte[] a(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i10 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = C3969k.a(bArr);
        Cipher cipherD = C3969k.d();
        cipherD.init(2, this.f16459a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            cipherD.updateAAD(bArr3);
        }
        return cipherD.doFinal(bArr2, i10, bArr2.length - i10);
    }

    public byte[] b(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = C3969k.a(bArr);
        Cipher cipherD = C3969k.d();
        cipherD.init(1, this.f16459a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            cipherD.updateAAD(bArr3);
        }
        int outputSize = cipherD.getOutputSize(bArr2.length);
        if (outputSize > a.e.API_PRIORITY_OTHER - i10) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i10 + outputSize];
        if (cipherD.doFinal(bArr2, 0, bArr2.length, bArr4, i10) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public C(byte[] bArr) throws GeneralSecurityException {
        if (f16458b.a()) {
            this.f16459a = C3969k.c(bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
