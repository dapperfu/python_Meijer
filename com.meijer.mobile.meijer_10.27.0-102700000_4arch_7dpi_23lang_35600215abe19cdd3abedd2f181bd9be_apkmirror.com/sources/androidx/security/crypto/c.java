package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f58687a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyGenParameterSpec f58688b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String f58689a;

        /* renamed from: b, reason: collision with root package name */
        KeyGenParameterSpec f58690b;

        /* renamed from: c, reason: collision with root package name */
        b f58691c;

        /* renamed from: d, reason: collision with root package name */
        boolean f58692d;

        /* renamed from: e, reason: collision with root package name */
        int f58693e;

        /* renamed from: f, reason: collision with root package name */
        boolean f58694f;

        /* renamed from: g, reason: collision with root package name */
        final Context f58695g;

        /* renamed from: androidx.security.crypto.c$a$a, reason: collision with other inner class name */
        static class C1150a {

            /* renamed from: androidx.security.crypto.c$a$a$a, reason: collision with other inner class name */
            static class C1151a {
                static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* renamed from: androidx.security.crypto.c$a$a$b */
            static class b {
                static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            static c a(a aVar) throws GeneralSecurityException, IOException {
                b bVar = aVar.f58691c;
                if (bVar == null && aVar.f58690b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (bVar == b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f58689a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (aVar.f58692d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            b.a(keySize, aVar.f58693e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(aVar.f58693e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && aVar.f58694f && aVar.f58695g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C1151a.a(keySize);
                    }
                    aVar.f58690b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f58690b;
                if (keyGenParameterSpec != null) {
                    return new c(e.c(keyGenParameterSpec), aVar.f58690b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public a(Context context, String str) {
            this.f58695g = context.getApplicationContext();
            this.f58689a = str;
        }

        public a b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f58691c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.f58689a.equals(C1150a.b(keyGenParameterSpec))) {
                this.f58690b = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f58689a + " vs " + C1150a.b(keyGenParameterSpec));
        }

        public c a() throws GeneralSecurityException, IOException {
            return C1150a.a(this);
        }
    }

    public enum b {
        AES256_GCM
    }

    String a() {
        return this.f58687a;
    }

    public boolean b() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f58687a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f58687a + ", isKeyStoreBacked=" + b() + "}";
    }

    c(String str, Object obj) {
        this.f58687a = str;
        this.f58688b = (KeyGenParameterSpec) obj;
    }
}
