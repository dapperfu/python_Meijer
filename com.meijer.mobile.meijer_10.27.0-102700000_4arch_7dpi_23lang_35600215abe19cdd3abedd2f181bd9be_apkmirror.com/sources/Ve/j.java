package Ve;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes7.dex */
public interface j<T> {

    public static class a implements j<Cipher> {
        @Override // Ve.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Cipher a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    public static class b implements j<KeyAgreement> {
        @Override // Ve.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyAgreement a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    public static class c implements j<KeyFactory> {
        @Override // Ve.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyFactory a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    public static class d implements j<KeyPairGenerator> {
        @Override // Ve.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyPairGenerator a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    public static class e implements j<Mac> {
        @Override // Ve.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Mac a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    public static class f implements j<MessageDigest> {
        @Override // Ve.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageDigest a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    public static class g implements j<Signature> {
        @Override // Ve.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Signature a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    T a(String str, Provider provider) throws GeneralSecurityException;
}
