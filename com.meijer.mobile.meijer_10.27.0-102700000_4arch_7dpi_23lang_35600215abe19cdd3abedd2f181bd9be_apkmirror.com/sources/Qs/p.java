package Qs;

import Qs.p;
import at.C6154b;
import com.okta.authfoundation.client.AccessTokenValidator;
import com.okta.authfoundation.client.DeviceSecretValidator;
import com.okta.authfoundation.client.IdTokenValidator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import okhttp3.d;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001_B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R+\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010&\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\b\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010-\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020'8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\b\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u00104\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\b\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u0010;\u001a\u0002052\u0006\u0010\u0006\u001a\u0002058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\b\u001a\u0004\b7\u00108\"\u0004\b9\u0010:RW\u0010D\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=\u0012\u0006\u0012\u0004\u0018\u00010\u00010<2\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=\u0012\u0006\u0012\u0004\u0018\u00010\u00010<8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010\b\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CRW\u0010I\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0=\u0012\u0006\u0012\u0004\u0018\u00010\u00010<2\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0=\u0012\u0006\u0012\u0004\u0018\u00010\u00010<8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\b\u001a\u0004\bG\u0010A\"\u0004\bH\u0010CR+\u0010P\u001a\u00020J2\u0006\u0010\u0006\u001a\u00020J8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\b\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR+\u0010W\u001a\u00020Q2\u0006\u0010\u0006\u001a\u00020Q8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010\b\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010^\u001a\u00020X2\u0006\u0010\u0006\u001a\u00020X8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010\b\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006`"}, d2 = {"LQs/p;", "", "<init>", "()V", "Lkotlin/Function0;", "Lokhttp3/d$a;", "<set-?>", "c", "LQs/r;", "E", "()Lkotlin/jvm/functions/Function0;", "L", "(Lkotlin/jvm/functions/Function0;)V", "okHttpClientFactory", "Lkotlin/coroutines/CoroutineContext;", "d", "C", "()Lkotlin/coroutines/CoroutineContext;", "setIoDispatcher", "(Lkotlin/coroutines/CoroutineContext;)V", "ioDispatcher", "e", "x", "setComputeDispatcher", "computeDispatcher", "Lat/b;", "f", "A", "()Lat/b;", "setEventCoordinator", "(Lat/b;)V", "eventCoordinator", "LSs/m;", "g", "w", "()LSs/m;", "setClock", "(LSs/m;)V", "clock", "Lcom/okta/authfoundation/client/IdTokenValidator;", "h", "B", "()Lcom/okta/authfoundation/client/IdTokenValidator;", "setIdTokenValidator", "(Lcom/okta/authfoundation/client/IdTokenValidator;)V", "idTokenValidator", "Lcom/okta/authfoundation/client/AccessTokenValidator;", "i", "u", "()Lcom/okta/authfoundation/client/AccessTokenValidator;", "setAccessTokenValidator", "(Lcom/okta/authfoundation/client/AccessTokenValidator;)V", "accessTokenValidator", "Lcom/okta/authfoundation/client/DeviceSecretValidator;", "j", "z", "()Lcom/okta/authfoundation/client/DeviceSecretValidator;", "setDeviceSecretValidator", "(Lcom/okta/authfoundation/client/DeviceSecretValidator;)V", "deviceSecretValidator", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "LSs/b;", "k", "v", "()Lkotlin/jvm/functions/Function1;", "setCacheFactory", "(Lkotlin/jvm/functions/Function1;)V", "cacheFactory", "LVs/s;", "l", "G", "setTokenStorageFactory", "tokenStorageFactory", "LVs/q;", "m", "F", "()LVs/q;", "setTokenEncryptionHandler", "(LVs/q;)V", "tokenEncryptionHandler", "LQv/j;", "n", "y", "()LQv/j;", "setCookieJar", "(LQv/j;)V", "cookieJar", "Lkotlin/time/Duration;", "o", "D", "()J", "setLoginCancellationDebounceTime-LRDsOJo", "(J)V", "loginCancellationDebounceTime", "a", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f31385b = {Reflection.f(new MutablePropertyReference1Impl(p.class, "okHttpClientFactory", "getOkHttpClientFactory()Lkotlin/jvm/functions/Function0;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "ioDispatcher", "getIoDispatcher()Lkotlin/coroutines/CoroutineContext;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "computeDispatcher", "getComputeDispatcher()Lkotlin/coroutines/CoroutineContext;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "eventCoordinator", "getEventCoordinator()Lcom/okta/authfoundation/events/EventCoordinator;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "clock", "getClock()Lcom/okta/authfoundation/client/OidcClock;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "idTokenValidator", "getIdTokenValidator()Lcom/okta/authfoundation/client/IdTokenValidator;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "accessTokenValidator", "getAccessTokenValidator()Lcom/okta/authfoundation/client/AccessTokenValidator;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "deviceSecretValidator", "getDeviceSecretValidator()Lcom/okta/authfoundation/client/DeviceSecretValidator;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "cacheFactory", "getCacheFactory()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "tokenStorageFactory", "getTokenStorageFactory()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "tokenEncryptionHandler", "getTokenEncryptionHandler()Lcom/okta/authfoundation/credential/TokenEncryptionHandler;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "cookieJar", "getCookieJar()Lokhttp3/CookieJar;", 0)), Reflection.f(new MutablePropertyReference1Impl(p.class, "loginCancellationDebounceTime", "getLoginCancellationDebounceTime-UwyO8pc()J", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final p f31384a = new p();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final r okHttpClientFactory = new r(new Function0() { // from class: Qs.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.K();
        }
    });

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final r ioDispatcher = new r(new Function0() { // from class: Qs.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.I();
        }
    });

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final r computeDispatcher = new r(new Function0() { // from class: Qs.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.q();
        }
    });

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final r eventCoordinator = new r(new Function0() { // from class: Qs.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.t();
        }
    });

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final r clock = new r(new Function0() { // from class: Qs.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.p();
        }
    });

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final r idTokenValidator = new r(new Function0() { // from class: Qs.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.H();
        }
    });

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final r accessTokenValidator = new r(new Function0() { // from class: Qs.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.n();
        }
    });

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final r deviceSecretValidator = new r(new Function0() { // from class: Qs.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.s();
        }
    });

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final r cacheFactory = new r(new Function0() { // from class: Qs.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.o();
        }
    });

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final r tokenStorageFactory = new r(new Function0() { // from class: Qs.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.N();
        }
    });

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final r tokenEncryptionHandler = new r(new Function0() { // from class: Qs.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.M();
        }
    });

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final r cookieJar = new r(new Function0() { // from class: Qs.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.r();
        }
    });

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final r loginCancellationDebounceTime = new r(new Function0() { // from class: Qs.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p.J();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LQs/p$a;", "", "<init>", "()V", "", "<set-?>", "c", "LQs/r;", "b", "()Ljava/lang/String;", "setKeyAlias", "(Ljava/lang/String;)V", "keyAlias", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f31400b = {Reflection.f(new MutablePropertyReference1Impl(a.class, "keyAlias", "getKeyAlias()Ljava/lang/String;", 0))};

        /* renamed from: a, reason: collision with root package name */
        public static final a f31399a = new a();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final r keyAlias = new r(new Function0() { // from class: Qs.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.a.c();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "com.okta.authfoundation.rsakey";
        }

        public final String b() {
            return (String) keyAlias.a(this, f31400b[0]);
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdTokenValidator H() {
        return I.f31367a.E().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext I() {
        return I.f31367a.F().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration J() {
        return I.f31367a.G().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 K() {
        return I.f31367a.H().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vs.q M() {
        return I.f31367a.I().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 N() {
        return I.f31367a.J().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccessTokenValidator n() {
        return I.f31367a.x().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 o() {
        return I.f31367a.y().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ss.m p() {
        return I.f31367a.z().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext q() {
        return I.f31367a.A().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Qv.j r() {
        return I.f31367a.B().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceSecretValidator s() {
        return I.f31367a.C().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6154b t() {
        return I.f31367a.D().invoke();
    }

    public final C6154b A() {
        return (C6154b) eventCoordinator.a(this, f31385b[3]);
    }

    public final IdTokenValidator B() {
        return (IdTokenValidator) idTokenValidator.a(this, f31385b[5]);
    }

    public final CoroutineContext C() {
        return (CoroutineContext) ioDispatcher.a(this, f31385b[1]);
    }

    public final long D() {
        return ((Duration) loginCancellationDebounceTime.a(this, f31385b[12])).getRawValue();
    }

    public final Function0<d.a> E() {
        return (Function0) okHttpClientFactory.a(this, f31385b[0]);
    }

    public final Vs.q F() {
        return (Vs.q) tokenEncryptionHandler.a(this, f31385b[10]);
    }

    public final Function1<Continuation<? super Vs.s>, Object> G() {
        return (Function1) tokenStorageFactory.a(this, f31385b[9]);
    }

    public final void L(Function0<? extends d.a> function0) {
        Intrinsics.j(function0, "<set-?>");
        okHttpClientFactory.b(this, f31385b[0], function0);
    }

    public final AccessTokenValidator u() {
        return (AccessTokenValidator) accessTokenValidator.a(this, f31385b[6]);
    }

    public final Function1<Continuation<? super Ss.b>, Object> v() {
        return (Function1) cacheFactory.a(this, f31385b[8]);
    }

    public final Ss.m w() {
        return (Ss.m) clock.a(this, f31385b[4]);
    }

    public final CoroutineContext x() {
        return (CoroutineContext) computeDispatcher.a(this, f31385b[2]);
    }

    public final Qv.j y() {
        return (Qv.j) cookieJar.a(this, f31385b[11]);
    }

    public final DeviceSecretValidator z() {
        return (DeviceSecretValidator) deviceSecretValidator.a(this, f31385b[7]);
    }

    private p() {
    }
}
