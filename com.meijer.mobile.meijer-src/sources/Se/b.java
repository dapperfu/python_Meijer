package Se;

import Ke.InterfaceC3886a;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes8.dex */
public final class b {
    private static boolean f() {
        return true;
    }

    private static final class a implements InterfaceC3886a {

        /* renamed from: a, reason: collision with root package name */
        private final SecretKey f34560a;

        @Override // Ke.InterfaceC3886a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 2147483619) {
                throw new GeneralSecurityException("plaintext too long");
            }
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f34560a);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            byte[] iv2 = cipher.getIV();
            if (iv2.length != 12) {
                throw new GeneralSecurityException("IV has unexpected length");
            }
            System.arraycopy(iv2, 0, bArr3, 0, 12);
            return bArr3;
        }

        @Override // Ke.InterfaceC3886a
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length < 28) {
                throw new BadPaddingException("ciphertext too short");
            }
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.f34560a, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }

        public a(String str, KeyStore keyStore) throws GeneralSecurityException {
            SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
            this.f34560a = secretKey;
            if (secretKey != null) {
                return;
            }
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
        }
    }

    public static void a(String str) throws GeneralSecurityException {
        b(new KeyGenParameterSpec.Builder(str, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
    }

    public static void b(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpec);
        keyGenerator.generateKey();
    }

    public static InterfaceC3886a c(String str) throws GeneralSecurityException {
        return new a(str, d());
    }

    private static KeyStore d() throws GeneralSecurityException, IOException {
        if (f()) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        throw new IllegalStateException("Need Android Keystore on Android M or newer");
    }

    public static boolean e(String str) throws GeneralSecurityException {
        return d().containsAlias(str);
    }
}
