package bt;

import bt.C6409a;
import gw.C14419h;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import mv.C15805i;
import mv.InterfaceC15783O;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\u00028\u0000\"\n\b\u0000\u0010\u001a*\u0004\u0018\u00010\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006%"}, d2 = {"Lbt/b;", "LRs/a;", "", "algorithm", "keyId", "claimsProvider", "signature", "rawValue", "Lkotlin/coroutines/CoroutineContext;", "computeDispatcher", "<init>", "(Ljava/lang/String;Ljava/lang/String;LRs/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lbt/a;", "jwks", "f", "(Lbt/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lzv/a;", "deserializationStrategy", "a", "(Lzv/a;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "c", "d", "e", "Lkotlin/coroutines/CoroutineContext;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements Rs.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Rs.a f60618a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String algorithm;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String keyId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String signature;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String rawValue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext computeDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.jwt.Jwt$hasValidSignature$2", f = "Jwt.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60624a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6409a f60625b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f60626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6409a c6409a, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f60625b = c6409a;
            this.f60626c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f60625b, this.f60626c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Boolean> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
            Object next;
            C14419h.Companion companion;
            C14419h c14419hA;
            byte[] bArrB0;
            C14419h c14419hA2;
            byte[] bArrB02;
            byte[] bArrB03;
            IntrinsicsKt.f();
            if (this.f60624a == 0) {
                ResultKt.b(obj);
                List<C6409a.C1206a> listA = this.f60625b.a();
                b bVar = this.f60626c;
                Iterator<T> it = listA.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.e(((C6409a.C1206a) next).getKeyId(), bVar.getKeyId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C6409a.C1206a c1206a = (C6409a.C1206a) next;
                if (c1206a == null) {
                    return Boxing.a(false);
                }
                if (!Intrinsics.e(c1206a.getUse(), "sig")) {
                    return Boxing.a(false);
                }
                if (!Intrinsics.e(c1206a.getKeyType(), "RSA")) {
                    return Boxing.a(false);
                }
                if (!Intrinsics.e(c1206a.getAlgorithm(), "RS256")) {
                    return Boxing.a(false);
                }
                String modulus = c1206a.getModulus();
                if (modulus != null && (c14419hA = (companion = C14419h.INSTANCE).a(modulus)) != null && (bArrB0 = c14419hA.b0()) != null) {
                    BigInteger bigInteger = new BigInteger(1, bArrB0);
                    String exponent = c1206a.getExponent();
                    if (exponent != null && (c14419hA2 = companion.a(exponent)) != null && (bArrB02 = c14419hA2.b0()) != null) {
                        BigInteger bigInteger2 = new BigInteger(1, bArrB02);
                        byte[] bytes = StringsKt.z1(this.f60626c.getRawValue(), '.', null, 2, null).getBytes(Charsets.UTF_8);
                        Intrinsics.i(bytes, "getBytes(...)");
                        try {
                            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigInteger, bigInteger2));
                            Signature signature = Signature.getInstance("SHA256withRSA");
                            signature.initVerify(publicKeyGeneratePublic);
                            signature.update(bytes);
                            C14419h c14419hA3 = companion.a(this.f60626c.getSignature());
                            if (c14419hA3 != null && (bArrB03 = c14419hA3.b0()) != null) {
                                return Boxing.a(signature.verify(bArrB03));
                            }
                            return Boxing.a(false);
                        } catch (Exception unused) {
                            return Boxing.a(false);
                        }
                    }
                    return Boxing.a(false);
                }
                return Boxing.a(false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(String algorithm, String keyId, Rs.a claimsProvider, String signature, String rawValue, CoroutineContext computeDispatcher) {
        Intrinsics.j(algorithm, "algorithm");
        Intrinsics.j(keyId, "keyId");
        Intrinsics.j(claimsProvider, "claimsProvider");
        Intrinsics.j(signature, "signature");
        Intrinsics.j(rawValue, "rawValue");
        Intrinsics.j(computeDispatcher, "computeDispatcher");
        this.f60618a = claimsProvider;
        this.algorithm = algorithm;
        this.keyId = keyId;
        this.signature = signature;
        this.rawValue = rawValue;
        this.computeDispatcher = computeDispatcher;
    }

    @Override // Rs.a
    public <T> T a(InterfaceC18555a<? extends T> deserializationStrategy) {
        Intrinsics.j(deserializationStrategy, "deserializationStrategy");
        return (T) this.f60618a.a(deserializationStrategy);
    }

    /* renamed from: b, reason: from getter */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    /* renamed from: c, reason: from getter */
    public final String getKeyId() {
        return this.keyId;
    }

    /* renamed from: d, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }

    /* renamed from: e, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public boolean equals(Object other) {
        return other instanceof b ? Intrinsics.e(((b) other).rawValue, this.rawValue) : super.equals(other);
    }

    public final Object f(C6409a c6409a, Continuation<? super Boolean> continuation) {
        return C15805i.g(this.computeDispatcher, new a(c6409a, this, null), continuation);
    }

    public int hashCode() {
        return this.rawValue.hashCode();
    }

    public String toString() {
        return this.rawValue;
    }
}
