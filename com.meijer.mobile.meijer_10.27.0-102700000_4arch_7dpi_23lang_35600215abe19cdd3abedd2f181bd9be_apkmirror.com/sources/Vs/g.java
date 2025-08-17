package Vs;

import Vs.b;
import Vs.q;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.biometric.e;
import androidx.recyclerview.widget.RecyclerView;
import com.okta.authfoundation.BiometricDecryptionActivity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001 B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J_\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n21\u0010\u0018\u001a-\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b \u0010!J>\u0010$\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096@¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010)R\u001c\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"LVs/g;", "LVs/q;", "Ljava/security/KeyStore;", "keyStore", "Ljava/security/KeyPairGenerator;", "keyPairGenerator", "<init>", "(Ljava/security/KeyStore;Ljava/security/KeyPairGenerator;)V", "", "encryptedToken", "", "", "encryptionExtras", "LVs/b$c;", "security", "LVs/p;", "g", "([BLjava/util/Map;LVs/b$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "encryptedAesKey", "Lkotlin/coroutines/Continuation;", "", "rsaDecryptFunc", "f", "([BLjava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(LVs/b$c;)V", "token", "LVs/q$b;", "a", "(LVs/p;LVs/b$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/biometric/e$d;", "promptInfo", "c", "([BLjava/util/Map;LVs/b$c;Landroidx/biometric/e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/security/KeyStore;", "e", "()Ljava/security/KeyStore;", "Ljava/security/KeyPairGenerator;", "Ljavax/crypto/KeyGenerator;", "kotlin.jvm.PlatformType", "d", "Ljavax/crypto/KeyGenerator;", "aesKeyGenerator", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class g implements q {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final KeyStore keyStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final KeyPairGenerator keyPairGenerator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final KeyGenerator aesKeyGenerator;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LVs/g$a;", "", "<init>", "()V", "Ljavax/crypto/Cipher;", "b", "()Ljavax/crypto/Cipher;", "c", "", "ENCRYPTED_AES_KEY_MATERIAL", "Ljava/lang/String;", "BASE64_SEPARATOR", "BIO_TOKEN_NO_PROMPT_INFO_ERROR", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Vs.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Cipher b() throws NoSuchPaddingException, NoSuchAlgorithmException {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            Intrinsics.i(cipher, "getInstance(...)");
            return cipher;
        }

        public final Cipher c() throws NoSuchPaddingException, NoSuchAlgorithmException {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            Intrinsics.i(cipher, "getInstance(...)");
            return cipher;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.DefaultTokenEncryptionHandler", f = "TokenEncryptionHandler.kt", l = {249, 262, 273, 274, 279}, m = "decrypt")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f37878a;

        /* renamed from: b, reason: collision with root package name */
        Object f37879b;

        /* renamed from: c, reason: collision with root package name */
        Object f37880c;

        /* renamed from: d, reason: collision with root package name */
        Object f37881d;

        /* renamed from: e, reason: collision with root package name */
        Object f37882e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37883f;

        /* renamed from: h, reason: collision with root package name */
        int f37885h;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37883f = obj;
            this.f37885h |= Integer.MIN_VALUE;
            return g.this.c(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "encryptedAesKey"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.DefaultTokenEncryptionHandler$decrypt$2", f = "TokenEncryptionHandler.kt", l = {266}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<byte[], Continuation<? super byte[]>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f37886a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37887b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b.c f37889d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e.d f37890e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b.c cVar, e.d dVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f37889d = cVar;
            this.f37890e = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = g.this.new c(this.f37889d, this.f37890e, continuation);
            cVar.f37887b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(byte[] bArr, Continuation<? super byte[]> continuation) {
            return ((c) create(bArr, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f37886a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            byte[] bArr = (byte[]) this.f37887b;
            Key key = g.this.getKeyStore().getKey(this.f37889d.getKeyAlias(), null);
            Cipher cipherC = g.INSTANCE.c();
            cipherC.init(2, key);
            BiometricDecryptionActivity.Companion companion = BiometricDecryptionActivity.INSTANCE;
            e.d dVar = this.f37890e;
            this.f37886a = 1;
            Object objB = companion.b(cipherC, bArr, dVar, this);
            if (objB == objF) {
                return objF;
            }
            return objB;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.DefaultTokenEncryptionHandler", f = "TokenEncryptionHandler.kt", l = {HttpResponseStatus.REDIRECTION_SEE_OTHER}, m = "internalDecrypt")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f37891a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37892b;

        /* renamed from: d, reason: collision with root package name */
        int f37894d;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f37892b = obj;
            this.f37894d |= Integer.MIN_VALUE;
            return g.this.f(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "encryptedAesKey"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.credential.DefaultTokenEncryptionHandler$rsaDecrypt$2", f = "TokenEncryptionHandler.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<byte[], Continuation<? super byte[]>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f37895a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37896b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Cipher f37897c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Cipher cipher, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f37897c = cipher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f37897c, continuation);
            eVar.f37896b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(byte[] bArr, Continuation<? super byte[]> continuation) {
            return ((e) create(bArr, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws BadPaddingException, IllegalBlockSizeException {
            IntrinsicsKt.f();
            if (this.f37895a == 0) {
                ResultKt.b(obj);
                byte[] bArrDoFinal = this.f37897c.doFinal((byte[]) this.f37896b);
                Intrinsics.i(bArrDoFinal, "doFinal(...)");
                return bArrDoFinal;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public g(KeyStore keyStore, KeyPairGenerator keyPairGenerator) throws NoSuchAlgorithmException {
        Intrinsics.j(keyStore, "keyStore");
        Intrinsics.j(keyPairGenerator, "keyPairGenerator");
        this.keyStore = keyStore;
        this.keyPairGenerator = keyPairGenerator;
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        this.aesKeyGenerator = keyGenerator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(byte[] r12, java.util.Map<java.lang.String, java.lang.String> r13, kotlin.jvm.functions.Function2<? super byte[], ? super kotlin.coroutines.Continuation<? super byte[]>, ? extends java.lang.Object> r14, kotlin.coroutines.Continuation<? super Vs.p> r15) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r11 = this;
            boolean r0 = r15 instanceof Vs.g.d
            if (r0 == 0) goto L13
            r0 = r15
            Vs.g$d r0 = (Vs.g.d) r0
            int r1 = r0.f37894d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37894d = r1
            goto L18
        L13:
            Vs.g$d r0 = new Vs.g$d
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f37892b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f37894d
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r12 = r0.f37891a
            byte[] r12 = (byte[]) r12
            kotlin.ResultKt.b(r15)
            goto L53
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            kotlin.ResultKt.b(r15)
            java.lang.String r15 = "ENCRYPTED_AES_KEY_MATERIAL"
            java.lang.Object r13 = r13.get(r15)
            java.lang.String r13 = (java.lang.String) r13
            byte[] r13 = android.util.Base64.decode(r13, r4)
            kotlin.jvm.internal.Intrinsics.g(r13)
            r0.f37891a = r12
            r0.f37894d = r3
            java.lang.Object r15 = r14.invoke(r13, r0)
            if (r15 != r1) goto L53
            return r1
        L53:
            byte[] r15 = (byte[]) r15
            java.lang.String r5 = kotlin.text.StringsKt.D(r15)
            java.lang.String r13 = ","
            java.lang.String[] r6 = new java.lang.String[]{r13}
            r9 = 2
            r10 = 0
            r7 = 0
            r8 = 2
            java.util.List r13 = kotlin.text.StringsKt.a1(r5, r6, r7, r8, r9, r10)
            r14 = 0
            java.lang.Object r14 = r13.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            byte[] r14 = android.util.Base64.decode(r14, r4)
            java.lang.Object r13 = r13.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            byte[] r13 = android.util.Base64.decode(r13, r4)
            javax.crypto.spec.SecretKeySpec r15 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r0 = "AES"
            r15.<init>(r14, r0)
            Vs.g$a r14 = Vs.g.INSTANCE
            javax.crypto.Cipher r14 = Vs.g.Companion.a(r14)
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1, r13)
            r14.init(r4, r15, r0)
            byte[] r12 = r14.doFinal(r12)
            kotlin.jvm.internal.Intrinsics.g(r12)
            java.lang.String r12 = kotlin.text.StringsKt.D(r12)
            com.okta.authfoundation.client.j$b r13 = com.okta.authfoundation.client.j.INSTANCE
            Iv.b r13 = r13.b()
            Vs.p$b r14 = Vs.p.INSTANCE
            Dv.b r14 = r14.serializer()
            java.lang.Object r12 = r13.b(r14, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.g.f(byte[], java.util.Map, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object g(byte[] bArr, Map<String, String> map, b.c cVar, Continuation<? super p> continuation) throws NoSuchPaddingException, NoSuchAlgorithmException, UnrecoverableKeyException, InvalidKeyException, KeyStoreException {
        Key key = this.keyStore.getKey(cVar.getKeyAlias(), null);
        Cipher cipherC = INSTANCE.c();
        cipherC.init(2, key);
        return f(bArr, map, new e(cipherC, null), continuation);
    }

    @Override // Vs.q
    public Object a(p pVar, b.c cVar, Continuation<? super q.b> continuation) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        PublicKey publicKey = this.keyStore.getCertificate(cVar.getKeyAlias()).getPublicKey();
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(publicKey.getAlgorithm()).generatePublic(new X509EncodedKeySpec(publicKey.getEncoded()));
        SecretKey secretKeyGenerateKey = this.aesKeyGenerator.generateKey();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strC = com.okta.authfoundation.client.j.INSTANCE.b().c(p.INSTANCE.serializer(), pVar);
        Companion companion = INSTANCE;
        Cipher cipherB = companion.b();
        cipherB.init(1, secretKeyGenerateKey);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strC.getBytes(charset);
        Intrinsics.i(bytes, "getBytes(...)");
        byte[] bArrDoFinal = cipherB.doFinal(bytes);
        Cipher cipherC = companion.c();
        cipherC.init(1, publicKeyGeneratePublic);
        byte[] bytes2 = (Base64.encodeToString(secretKeyGenerateKey.getEncoded(), 2) + "," + Base64.encodeToString(cipherB.getIV(), 2)).getBytes(charset);
        Intrinsics.i(bytes2, "getBytes(...)");
        linkedHashMap.put("ENCRYPTED_AES_KEY_MATERIAL", Base64.encodeToString(cipherC.doFinal(bytes2), 2));
        Intrinsics.g(bArrDoFinal);
        return new q.b(bArrDoFinal, MapsKt.A(linkedHashMap));
    }

    @Override // Vs.q
    public void b(b.c security) throws InvalidAlgorithmParameterException {
        KeyGenParameterSpec keyGenParameterSpecBuild;
        Intrinsics.j(security, "security");
        if (this.keyStore.containsAlias(security.getKeyAlias())) {
            return;
        }
        KeyGenParameterSpec.Builder digests = new KeyGenParameterSpec.Builder(security.getKeyAlias(), 3).setBlockModes("ECB").setEncryptionPaddings("OAEPPadding").setKeySize(RecyclerView.m.FLAG_MOVED).setDigests("SHA-1", "SHA-256", "SHA-512");
        Intrinsics.i(digests, "setDigests(...)");
        if (security instanceof b.c.Default) {
            keyGenParameterSpecBuild = digests.setUserAuthenticationRequired(false).build();
        } else if (security instanceof b.c.BiometricStrong) {
            digests.setUserAuthenticationRequired(true);
            if (Build.VERSION.SDK_INT > 30) {
                digests.setUserAuthenticationParameters(((b.c.BiometricStrong) security).getUserAuthenticationTimeout(), 2);
            } else {
                digests.setUserAuthenticationValidityDurationSeconds(-1);
            }
            keyGenParameterSpecBuild = digests.build();
        } else {
            if (!(security instanceof b.c.BiometricStrongOrDeviceCredential)) {
                throw new NoWhenBranchMatchedException();
            }
            digests.setUserAuthenticationRequired(true);
            if (Build.VERSION.SDK_INT > 30) {
                digests.setUserAuthenticationParameters(((b.c.BiometricStrongOrDeviceCredential) security).getUserAuthenticationTimeout(), 3);
            } else {
                digests.setUserAuthenticationValidityDurationSeconds(((b.c.BiometricStrongOrDeviceCredential) security).getUserAuthenticationTimeout());
            }
            keyGenParameterSpecBuild = digests.build();
        }
        Intrinsics.g(keyGenParameterSpecBuild);
        this.keyPairGenerator.initialize(keyGenParameterSpecBuild);
        this.keyPairGenerator.generateKeyPair();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Vs.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11, Vs.b.c r12, androidx.biometric.e.d r13, kotlin.coroutines.Continuation<? super Vs.p> r14) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException, java.security.InvalidKeyException, java.security.KeyStoreException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Vs.g.c(byte[], java.util.Map, Vs.b$c, androidx.biometric.e$d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: e, reason: from getter */
    public final KeyStore getKeyStore() {
        return this.keyStore;
    }

    public /* synthetic */ g(KeyStore keyStore, KeyPairGenerator keyPairGenerator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ct.d.f126756a.d() : keyStore, (i10 & 2) != 0 ? ct.d.f126756a.f() : keyPairGenerator);
    }
}
