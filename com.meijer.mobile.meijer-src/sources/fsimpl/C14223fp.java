package fsimpl;

import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.KeyGenerator;

/* renamed from: fsimpl.fp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14223fp extends AbstractC14222fo {
    private C14223fp(Key key) {
        super(key);
    }

    static void a(KeyStore keyStore) {
        keyStore.deleteEntry("fullstory-modern");
    }

    static boolean b(KeyStore keyStore) {
        return keyStore.containsAlias("fullstory-modern");
    }

    static AbstractC14222fo c(KeyStore keyStore) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (!b(keyStore)) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("fullstory-modern", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
        }
        return new C14223fp(keyStore.getKey("fullstory-modern", null));
    }
}
