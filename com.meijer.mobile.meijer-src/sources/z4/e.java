package z4;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

@Deprecated
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final KeyGenParameterSpec f172377a = a("_androidx_security_master_key_");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f172378b = new Object();

    private static KeyGenParameterSpec a(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }

    private static void b(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        } catch (ProviderException e10) {
            throw new GeneralSecurityException(e10.getMessage(), e10);
        }
    }

    private static boolean d(String str) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    public static String c(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        e(keyGenParameterSpec);
        synchronized (f172378b) {
            try {
                if (!d(keyGenParameterSpec.getKeystoreAlias())) {
                    b(keyGenParameterSpec);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    static void e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() == 256) {
            if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                if (keyGenParameterSpec.getPurposes() == 3) {
                    if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                        }
                        return;
                    } else {
                        throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                    }
                }
                throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
            }
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
    }
}
