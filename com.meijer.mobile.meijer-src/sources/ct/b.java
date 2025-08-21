package ct;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lct/b;", "", "Landroid/security/keystore/KeyGenParameterSpec;", "encryptionKeySpec", "<init>", "(Landroid/security/keystore/KeyGenParameterSpec;)V", "Ljavax/crypto/Cipher;", "f", "()Ljavax/crypto/Cipher;", "", "string", "e", "(Ljava/lang/String;)Ljava/lang/String;", "encryptedString", "Lkotlin/Result;", "c", "(Ljava/lang/String;)Ljava/lang/Object;", "", "g", "()V", "a", "Landroid/security/keystore/KeyGenParameterSpec;", "b", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Lazy<KeyGenParameterSpec> f127566c = LazyKt.b(new Function0() { // from class: ct.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.d();
        }
    });

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KeyGenParameterSpec encryptionKeySpec;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lct/b$a;", "", "<init>", "()V", "Landroid/security/keystore/KeyGenParameterSpec;", "defaultEncryptionKeySpec$delegate", "Lkotlin/Lazy;", "b", "()Landroid/security/keystore/KeyGenParameterSpec;", "defaultEncryptionKeySpec", "", "ENCRYPTION_KEY_ALIAS", "Ljava/lang/String;", "SEPARATOR", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ct.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final KeyGenParameterSpec b() {
            return (KeyGenParameterSpec) b.f127566c.getValue();
        }
    }

    public b(KeyGenParameterSpec encryptionKeySpec) {
        Intrinsics.j(encryptionKeySpec, "encryptionKeySpec");
        this.encryptionKeySpec = encryptionKeySpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyGenParameterSpec d() {
        return new KeyGenParameterSpec.Builder("com.authfoundation.preferences.datastore.aesKey", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
    }

    private final Cipher f() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        Intrinsics.i(cipher, "getInstance(...)");
        return cipher;
    }

    public final Object c(String encryptedString) {
        Intrinsics.j(encryptedString, "encryptedString");
        try {
            Result.Companion companion = Result.INSTANCE;
            Key keyE = d.f127568a.e(this.encryptionKeySpec);
            List listB1 = StringsKt.b1(encryptedString, new String[]{","}, false, 2, 2, null);
            String str = (String) listB1.get(0);
            String str2 = (String) listB1.get(1);
            byte[] bArrDecode = Base64.decode(str, 2);
            byte[] bArrDecode2 = Base64.decode(str2, 2);
            Cipher cipherF = f();
            cipherF.init(2, keyE, new GCMParameterSpec(128, bArrDecode));
            byte[] bArrDoFinal = cipherF.doFinal(bArrDecode2);
            Intrinsics.i(bArrDoFinal, "doFinal(...)");
            return Result.b(StringsKt.D(bArrDoFinal));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.b(ResultKt.a(th2));
        }
    }

    public final String e(String string) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, InvalidKeyException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Intrinsics.j(string, "string");
        Key keyE = d.f127568a.e(this.encryptionKeySpec);
        Cipher cipherF = f();
        cipherF.init(1, keyE);
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(cipherF.doFinal(bytes), 2);
        return Base64.encodeToString(cipherF.getIV(), 2) + "," + strEncodeToString;
    }

    public final void g() throws KeyStoreException {
        d dVar = d.f127568a;
        String keystoreAlias = this.encryptionKeySpec.getKeystoreAlias();
        Intrinsics.i(keystoreAlias, "getKeystoreAlias(...)");
        dVar.b(keystoreAlias);
    }

    public /* synthetic */ b(KeyGenParameterSpec keyGenParameterSpec, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? INSTANCE.b() : keyGenParameterSpec);
    }
}
