package Qs;

import Vs.j;
import at.C6295b;
import com.okta.authfoundation.client.AccessTokenValidator;
import com.okta.authfoundation.client.DeviceSecretValidator;
import com.okta.authfoundation.client.IdTokenValidator;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import mv.AbstractC15779K;
import mv.C15800f0;
import okhttp3.OkHttpClient;
import okhttp3.d;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR(\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0007\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR(\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0007\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR(\u0010.\u001a\b\u0012\u0004\u0012\u00020*0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0007\u001a\u0004\b,\u0010\t\"\u0004\b-\u0010\u000bR>\u00105\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020100\u0012\u0006\u0012\u0004\u0018\u00010\u00010/0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0007\u001a\u0004\b3\u0010\t\"\u0004\b4\u0010\u000bR>\u0010:\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020600\u0012\u0006\u0012\u0004\u0018\u00010\u00010/0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0007\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010\u000bR(\u0010?\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0007\u001a\u0004\b=\u0010\t\"\u0004\b>\u0010\u000bR(\u0010D\u001a\b\u0012\u0004\u0012\u00020@0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0007\u001a\u0004\bB\u0010\t\"\u0004\bC\u0010\u000bR(\u0010I\u001a\b\u0012\u0004\u0012\u00020E0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0007\u001a\u0004\bG\u0010\t\"\u0004\bH\u0010\u000b¨\u0006J"}, d2 = {"LQs/I;", "", "<init>", "()V", "Lkotlin/Function0;", "Lokhttp3/d$a;", "b", "Lkotlin/jvm/functions/Function0;", "H", "()Lkotlin/jvm/functions/Function0;", "setGetOkHttpClientFactory", "(Lkotlin/jvm/functions/Function0;)V", "getOkHttpClientFactory", "Lkotlin/coroutines/CoroutineContext;", "c", "F", "setGetIoDispatcher", "getIoDispatcher", "d", "A", "setGetComputeDispatcher", "getComputeDispatcher", "Lat/b;", "e", "D", "setGetEventCoordinator", "getEventCoordinator", "LSs/m;", "f", "z", "setGetClock", "getClock", "Lcom/okta/authfoundation/client/IdTokenValidator;", "g", "E", "setGetIdTokenValidator", "getIdTokenValidator", "Lcom/okta/authfoundation/client/AccessTokenValidator;", "h", "x", "setGetAccessTokenValidator", "getAccessTokenValidator", "Lcom/okta/authfoundation/client/DeviceSecretValidator;", "i", "C", "setGetDeviceSecretValidator", "getDeviceSecretValidator", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "LSs/b;", "j", "y", "setGetCacheFactory", "getCacheFactory", "LVs/s;", "k", "J", "setGetTokenStorageFactory", "getTokenStorageFactory", "LVs/q;", "l", "I", "setGetTokenEncryptionHandler", "getTokenEncryptionHandler", "LMv/j;", "m", "B", "setGetCookieJar", "getCookieJar", "Lkotlin/time/Duration;", "n", "G", "setGetLoginCancellationDebounceTime", "getLoginCancellationDebounceTime", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final I f31410a = new I();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends Function0<? extends d.a>> getOkHttpClientFactory = new Function0() { // from class: Qs.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.N();
        }
    };

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends CoroutineContext> getIoDispatcher = new Function0() { // from class: Qs.C
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.L();
        }
    };

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends CoroutineContext> getComputeDispatcher = new Function0() { // from class: Qs.D
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.t();
        }
    };

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static Function0<C6295b> getEventCoordinator = new Function0() { // from class: Qs.E
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.w();
        }
    };

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends Ss.m> getClock = new Function0() { // from class: Qs.F
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.r();
        }
    };

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends IdTokenValidator> getIdTokenValidator = new Function0() { // from class: Qs.G
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.K();
        }
    };

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends AccessTokenValidator> getAccessTokenValidator = new Function0() { // from class: Qs.H
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.p();
        }
    };

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends DeviceSecretValidator> getDeviceSecretValidator = new Function0() { // from class: Qs.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.v();
        }
    };

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends Function1<? super Continuation<? super Ss.b>, ? extends Object>> getCacheFactory = new Function0() { // from class: Qs.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.q();
        }
    };

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends Function1<? super Continuation<? super Vs.s>, ? extends Object>> getTokenStorageFactory = new Function0() { // from class: Qs.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.Q();
        }
    };

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends Vs.q> getTokenEncryptionHandler = new Function0() { // from class: Qs.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.P();
        }
    };

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static Function0<? extends Mv.j> getCookieJar = new Function0() { // from class: Qs.A
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.u();
        }
    };

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static Function0<Duration> getLoginCancellationDebounceTime = new Function0() { // from class: Qs.B
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I.M();
        }
    };

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LSs/t;", "<anonymous>", "()LSs/t;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.SdkDefaults$getCacheFactory$1$1", f = "SdkDefaults.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function1<Continuation<? super Ss.t>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f31424a;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Ss.t> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f31424a == 0) {
                ResultKt.b(obj);
                return Ss.t.INSTANCE.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVs/j;", "<anonymous>", "()LVs/j;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.authfoundation.SdkDefaults$getTokenStorageFactory$1$1", f = "SdkDefaults.kt", l = {52}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function1<Continuation<? super Vs.j>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f31425a;

        b(Continuation<? super b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Vs.j> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f31425a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            j.Companion aVar = Vs.j.INSTANCE;
            this.f31425a = 1;
            Object objC = aVar.c(this);
            if (objC == objF) {
                return objF;
            }
            return objC;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 N() {
        return new Function0() { // from class: Qs.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I.O();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.okta.authfoundation.client.c K() {
        return new com.okta.authfoundation.client.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration M() {
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.o(DurationKt.s(0, DurationUnit.f148417e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient O() {
        return new OkHttpClient();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Vs.g P() {
        return new Vs.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 Q() {
        return new b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.okta.authfoundation.client.a p() {
        return new com.okta.authfoundation.client.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 q() {
        return new a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ss.m r() {
        return new Ss.m() { // from class: Qs.y
            @Override // Ss.m
            public final long a() {
                return I.s();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mv.j u() {
        return Mv.j.f20481b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.okta.authfoundation.client.b v() {
        return new com.okta.authfoundation.client.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6295b w() {
        return new C6295b(CollectionsKt.m());
    }

    public final Function0<CoroutineContext> A() {
        return getComputeDispatcher;
    }

    public final Function0<Mv.j> B() {
        return getCookieJar;
    }

    public final Function0<DeviceSecretValidator> C() {
        return getDeviceSecretValidator;
    }

    public final Function0<C6295b> D() {
        return getEventCoordinator;
    }

    public final Function0<IdTokenValidator> E() {
        return getIdTokenValidator;
    }

    public final Function0<CoroutineContext> F() {
        return getIoDispatcher;
    }

    public final Function0<Duration> G() {
        return getLoginCancellationDebounceTime;
    }

    public final Function0<Function0<d.a>> H() {
        return getOkHttpClientFactory;
    }

    public final Function0<Vs.q> I() {
        return getTokenEncryptionHandler;
    }

    public final Function0<Function1<Continuation<? super Vs.s>, Object>> J() {
        return getTokenStorageFactory;
    }

    public final Function0<AccessTokenValidator> x() {
        return getAccessTokenValidator;
    }

    public final Function0<Function1<Continuation<? super Ss.b>, Object>> y() {
        return getCacheFactory;
    }

    public final Function0<Ss.m> z() {
        return getClock;
    }

    private I() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC15779K L() {
        return C15800f0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long s() {
        return Instant.now().getEpochSecond();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC15779K t() {
        return C15800f0.a();
    }
}
