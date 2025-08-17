package b9;

import I9.e;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lb9/b;", "", "Ljava/security/PublicKey;", "publicKey", "<init>", "(Ljava/security/PublicKey;)V", "", "password", "", "salt", "", "iterationCount", "Ljavax/crypto/spec/SecretKeySpec;", "d", "(Ljava/lang/String;[BI)Ljavax/crypto/spec/SecretKeySpec;", "messageBytes", "signatureBytes", "", "e", "([BLjava/lang/String;)Z", "value", "secret", "", "b", "(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/Map;", "encrypted", "iv", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/security/PublicKey;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: b9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6213b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PublicKey publicKey;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lb9/b$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "", "b", "()I", "c", "REMOTE_CONFIG_CRYPTO_ALGORITHM", "Ljava/lang/String;", "CRYPTO_ALGORITHM_BELOW_26", "CRYPTO_ALGORITHM_ABOVE_26", "ITERATION_COUNT", "I", "OLD_ITERATION_COUNT", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: b9.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a() {
            return G9.a.f11285a.a() ? "AES/GCM/NoPadding" : "AES_256/GCM/NoPadding";
        }

        public final int b() {
            return G9.a.f11285a.a() ? 16 : 12;
        }

        public final int c() {
            return G9.a.f11285a.a() ? 128 : 256;
        }
    }

    public C6213b(PublicKey publicKey) {
        Intrinsics.j(publicKey, "publicKey");
        this.publicKey = publicKey;
    }

    public static /* synthetic */ Map c(C6213b c6213b, String str, String str2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encrypt");
        }
        if ((i11 & 4) != 0) {
            i10 = 131072;
        }
        return c6213b.b(str, str2, i10);
    }

    private SecretKeySpec d(String password, byte[] salt, int iterationCount) throws NoSuchAlgorithmException {
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        char[] charArray = password.toCharArray();
        Intrinsics.i(charArray, "toCharArray(...)");
        return new SecretKeySpec(secretKeyFactory.generateSecret(new PBEKeySpec(charArray, salt, iterationCount, INSTANCE.c())).getEncoded(), "AES");
    }

    public String a(String encrypted, String secret, String salt, String iv2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDoFinal;
        Intrinsics.j(encrypted, "encrypted");
        Intrinsics.j(secret, "secret");
        Intrinsics.j(salt, "salt");
        Intrinsics.j(iv2, "iv");
        Cipher cipher = Cipher.getInstance(INSTANCE.a());
        Charset charset = Charsets.UTF_8;
        byte[] bytes = iv2.getBytes(charset);
        Intrinsics.i(bytes, "getBytes(...)");
        byte[] bArrDecode = Base64.decode(bytes, 0);
        byte[] bytes2 = salt.getBytes(charset);
        Intrinsics.i(bytes2, "getBytes(...)");
        byte[] bArrDecode2 = Base64.decode(bytes2, 0);
        try {
            Intrinsics.g(bArrDecode2);
            cipher.init(2, d(secret, bArrDecode2, 131072), new IvParameterSpec(bArrDecode));
            byte[] bytes3 = encrypted.getBytes(charset);
            Intrinsics.i(bytes3, "getBytes(...)");
            bArrDoFinal = cipher.doFinal(Base64.decode(bytes3, 0));
        } catch (Exception unused) {
            Intrinsics.g(bArrDecode2);
            cipher.init(2, d(secret, bArrDecode2, 65536), new IvParameterSpec(bArrDecode));
            byte[] bytes4 = encrypted.getBytes(Charsets.UTF_8);
            Intrinsics.i(bytes4, "getBytes(...)");
            bArrDoFinal = cipher.doFinal(Base64.decode(bytes4, 0));
        }
        if (bArrDoFinal != null) {
            return new String(bArrDoFinal, Charsets.UTF_8);
        }
        return null;
    }

    public Map<String, String> b(String value, String secret, int iterationCount) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.j(value, "value");
        Intrinsics.j(secret, "secret");
        Companion companion = INSTANCE;
        Cipher cipher = Cipher.getInstance(companion.a());
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[companion.b()];
        secureRandom.nextBytes(bArr);
        byte[] bArr2 = new byte[16];
        secureRandom.nextBytes(bArr2);
        cipher.init(1, d(secret, bArr2, 131072), new IvParameterSpec(bArr));
        byte[] bytes = value.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        return MapsKt.o(TuplesKt.a("encryptedValue", Base64.encodeToString(cipher.doFinal(bytes), 0)), TuplesKt.a("salt", Base64.encodeToString(bArr2, 0)), TuplesKt.a("iv", Base64.encodeToString(bArr, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean e(byte[] messageBytes, String signatureBytes) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Intrinsics.j(messageBytes, "messageBytes");
        Intrinsics.j(signatureBytes, "signatureBytes");
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initVerify(this.publicKey);
            signature.update(messageBytes);
            return signature.verify(Base64.decode(signatureBytes, 0));
        } catch (Exception e10) {
            e.INSTANCE.c(new J9.b(e10, null, 2, 0 == true ? 1 : 0));
            return false;
        }
    }
}
