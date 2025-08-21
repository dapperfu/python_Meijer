package d9;

import K9.e;
import L9.k;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0017"}, d2 = {"Ld9/c;", "", "<init>", "()V", "Ljavax/crypto/SecretKey;", "d", "()Ljavax/crypto/SecretKey;", "a", "", "value", "f", "(Ljava/lang/String;)Ljava/lang/String;", "methodName", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V", "c", "b", "Ljavax/crypto/SecretKey;", "secretKey", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: d9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13645c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SecretKey secretKey = d();

    private final SecretKey a() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("emarsys_sdk_key_shared_pref_key_v3", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        Intrinsics.i(keyGenParameterSpecBuild, "build(...)");
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        Intrinsics.i(secretKeyGenerateKey, "generateKey(...)");
        return secretKeyGenerateKey;
    }

    private final SecretKey d() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("emarsys_sdk_key_shared_pref_key_v3")) {
            return a();
        }
        Key key = keyStore.getKey("emarsys_sdk_key_shared_pref_key_v3", null);
        Intrinsics.h(key, "null cannot be cast to non-null type javax.crypto.SecretKey");
        return (SecretKey) key;
    }

    private final void e(String value, String methodName, Exception exception) {
        e.Companion.b(e.INSTANCE, new k(C13645c.class, methodName, MapsKt.o(TuplesKt.a("reason", "Failed to decrypt value: " + value), TuplesKt.a("exception", exception.getMessage())), null, 8, null), false, 2, null);
    }

    private final String f(String value) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.secretKey);
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        return Base64.encodeToString(cipher.getIV(), 0) + Base64.encodeToString(bArrDoFinal, 0);
    }

    public final String b(String value) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.j(value, "value");
        try {
            String strSubstring = value.substring(0, 16);
            Intrinsics.i(strSubstring, "substring(...)");
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            String strSubstring2 = value.substring(16);
            Intrinsics.i(strSubstring2, "substring(...)");
            byte[] bArrDecode2 = Base64.decode(strSubstring2, 0);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.secretKey, new GCMParameterSpec(128, bArrDecode));
            byte[] bArrDoFinal = cipher.doFinal(bArrDecode2);
            Intrinsics.g(bArrDoFinal);
            return new String(bArrDoFinal, Charsets.UTF_8);
        } catch (IllegalArgumentException e10) {
            e(value, "decrypt", e10);
            String message = e10.getMessage();
            if (message == null || !StringsKt.d0(message, "bad base-64", false, 2, null)) {
                value = null;
            }
            return value;
        } catch (GeneralSecurityException e11) {
            e(value, "decrypt", e11);
            this.secretKey = a();
            return null;
        } catch (Exception e12) {
            e(value, "decrypt", e12);
            return null;
        }
    }

    public final String c(String value) {
        Intrinsics.j(value, "value");
        try {
            return f(value);
        } catch (GeneralSecurityException e10) {
            e(value, "encrypt", e10);
            this.secretKey = a();
            try {
                return f(value);
            } catch (Exception e11) {
                e(value, "encrypt", e11);
                return value;
            }
        }
    }
}
