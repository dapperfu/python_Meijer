package z4;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

@Deprecated
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f172366a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyGenParameterSpec f172367b;

    @Deprecated
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String f172368a;

        /* renamed from: b, reason: collision with root package name */
        KeyGenParameterSpec f172369b;

        /* renamed from: c, reason: collision with root package name */
        b f172370c;

        /* renamed from: d, reason: collision with root package name */
        boolean f172371d;

        /* renamed from: e, reason: collision with root package name */
        int f172372e;

        /* renamed from: f, reason: collision with root package name */
        boolean f172373f;

        /* renamed from: g, reason: collision with root package name */
        final Context f172374g;

        /* renamed from: z4.c$a$a, reason: collision with other inner class name */
        static class C2780a {

            /* renamed from: z4.c$a$a$a, reason: collision with other inner class name */
            static class C2781a {
                static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* renamed from: z4.c$a$a$b */
            static class b {
                static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            static c a(a aVar) throws GeneralSecurityException, IOException {
                b bVar = aVar.f172370c;
                if (bVar == null && aVar.f172369b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (bVar == b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f172368a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (aVar.f172371d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            b.a(keySize, aVar.f172372e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(aVar.f172372e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && aVar.f172373f && aVar.f172374g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C2781a.a(keySize);
                    }
                    aVar.f172369b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f172369b;
                if (keyGenParameterSpec != null) {
                    return new c(e.c(keyGenParameterSpec), aVar.f172369b);
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
            this.f172374g = context.getApplicationContext();
            this.f172368a = str;
        }

        public a b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f172370c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.f172368a.equals(C2780a.b(keyGenParameterSpec))) {
                this.f172369b = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f172368a + " vs " + C2780a.b(keyGenParameterSpec));
        }

        public c a() throws GeneralSecurityException, IOException {
            return C2780a.a(this);
        }
    }

    @Deprecated
    public enum b {
        AES256_GCM
    }

    String a() {
        return this.f172366a;
    }

    public boolean b() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f172366a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f172366a + ", isKeyStoreBacked=" + b() + "}";
    }

    c(String str, Object obj) {
        this.f172366a = str;
        this.f172367b = (KeyGenParameterSpec) obj;
    }
}
