package ct;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lct/d;", "", "<init>", "()V", "Ljavax/crypto/KeyGenerator;", "c", "()Ljavax/crypto/KeyGenerator;", "Ljava/security/KeyPairGenerator;", "f", "()Ljava/security/KeyPairGenerator;", "", "alias", "", "b", "(Ljava/lang/String;)V", "Landroid/security/keystore/KeyGenParameterSpec;", "keyGenParameterSpec", "Ljava/security/Key;", "e", "(Landroid/security/keystore/KeyGenParameterSpec;)Ljava/security/Key;", "Ljava/security/KeyStore;", "Lkotlin/Lazy;", "d", "()Ljava/security/KeyStore;", "keyStore", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f127568a = new d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy keyStore = LazyKt.b(new Function0() { // from class: ct.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.g();
        }
    });

    private final KeyGenerator c() throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        Intrinsics.i(keyGenerator, "getInstance(...)");
        return keyGenerator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyStore g() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
        keyStore2.load(null);
        return keyStore2;
    }

    public final void b(String alias) throws KeyStoreException {
        Intrinsics.j(alias, "alias");
        d().deleteEntry(alias);
    }

    public final KeyStore d() {
        Object value = keyStore.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (KeyStore) value;
    }

    public final Key e(KeyGenParameterSpec keyGenParameterSpec) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.j(keyGenParameterSpec, "keyGenParameterSpec");
        if (d().containsAlias(keyGenParameterSpec.getKeystoreAlias())) {
            Key key = d().getKey(keyGenParameterSpec.getKeystoreAlias(), null);
            Intrinsics.i(key, "getKey(...)");
            return key;
        }
        KeyGenerator keyGeneratorC = c();
        keyGeneratorC.init(keyGenParameterSpec);
        SecretKey secretKeyGenerateKey = keyGeneratorC.generateKey();
        Intrinsics.i(secretKeyGenerateKey, "generateKey(...)");
        return secretKeyGenerateKey;
    }

    public final KeyPairGenerator f() throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        Intrinsics.i(keyPairGenerator, "getInstance(...)");
        return keyPairGenerator;
    }

    private d() {
    }
}
