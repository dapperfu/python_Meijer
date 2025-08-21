package Me;

import Pe.b;
import com.google.android.gms.common.api.a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes8.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0429b f19817b = b.EnumC0429b.f25765b;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f19818a;

    public byte[] a(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i10 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = C4134k.a(bArr);
        Cipher cipherD = C4134k.d();
        cipherD.init(2, this.f19818a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            cipherD.updateAAD(bArr3);
        }
        return cipherD.doFinal(bArr2, i10, bArr2.length - i10);
    }

    public byte[] b(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = C4134k.a(bArr);
        Cipher cipherD = C4134k.d();
        cipherD.init(1, this.f19818a, algorithmParameterSpecA);
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
        if (f19817b.a()) {
            this.f19818a = C4134k.c(bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
