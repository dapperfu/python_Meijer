package gb;

import android.util.Base64;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: gb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14343a {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f134120c = {-111, 100, 52, 39, -119, -108, 120, 83};

    /* renamed from: d, reason: collision with root package name */
    private static String f134121d = "AES/CBC/PKCS5Padding";

    /* renamed from: a, reason: collision with root package name */
    private SecureRandom f134122a = new SecureRandom();

    /* renamed from: b, reason: collision with root package name */
    private SecretKeySpec f134123b;

    public final String a(String str) throws Exception {
        byte[] bytes = str.getBytes("UTF8");
        byte[] bArr = new byte[16];
        this.f134122a.nextBytes(bArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        Cipher cipher = Cipher.getInstance(f134121d);
        cipher.init(1, this.f134123b, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        byte[] bArr2 = new byte[bArrDoFinal.length + 16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        System.arraycopy(bArrDoFinal, 0, bArr2, 16, bArrDoFinal.length);
        return Base64.encodeToString(bArr2, 2);
    }

    public C14343a(String str) throws Exception {
        this.f134123b = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), f134120c, 10000, 128)).getEncoded(), "AES");
    }
}
