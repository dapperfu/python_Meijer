package Nb;

import android.util.Base64;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static SecureRandom f20769b = new SecureRandom();

    /* renamed from: a, reason: collision with root package name */
    private SecretKeySpec f20770a;

    public i(String str) throws Exception {
        this(str, new byte[8]);
    }

    public static byte[] b(String str) {
        return Base64.decode(str, 2);
    }

    public static String e(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    private i(String str, byte[] bArr) throws Exception {
        this.f20770a = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 3, 128)).getEncoded(), "AES");
    }

    public byte[] a() {
        byte[] bArr = new byte[16];
        f20769b.nextBytes(bArr);
        return bArr;
    }

    public final byte[] d(byte[] bArr) throws Exception {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        int length = bArr.length - 16;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 16, bArr3, 0, length);
        Cipher cipher = Cipher.getInstance("AES/CFB/PKCS5Padding");
        cipher.init(2, this.f20770a, ivParameterSpec);
        return cipher.doFinal(bArr3);
    }

    public final byte[] c(byte[] bArr) throws Exception {
        byte[] bArrA = a();
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrA);
        Cipher cipher = Cipher.getInstance("AES/CFB/PKCS5Padding");
        cipher.init(1, this.f20770a, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        byte[] bArr2 = new byte[bArrA.length + bArrDoFinal.length];
        System.arraycopy(bArrA, 0, bArr2, 0, bArrA.length);
        System.arraycopy(bArrDoFinal, 0, bArr2, bArrA.length, bArrDoFinal.length);
        return bArr2;
    }
}
