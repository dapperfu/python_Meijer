package jg;

import B2.InterfaceC2911h;
import cf.InterfaceC6504a;
import com.fullstory.FS;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\b\u0001\u0018\u00002\u00020\u0001:\u0001 BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00105\u001a\u00020\u000b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010;\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010B\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Ljg/U;", "Ljg/T;", "Lmg/j;", "sessionsSettings", "Ljg/N;", "sessionGenerator", "Ljg/K;", "sessionFirelogPublisher", "Ljg/X;", "timeProvider", "LB2/h;", "Ljg/E;", "sessionDataStore", "Ljg/w;", "processDataManager", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lmg/j;Ljg/N;Ljg/K;Ljg/X;LB2/h;Ljg/w;Lkotlin/coroutines/CoroutineContext;)V", "", "sessionId", "Ljg/U$b;", "type", "", "q", "(Ljava/lang/String;Ljg/U$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionData", "", "p", "(Ljg/E;)Z", "n", "o", "b", "()V", "c", "Lmg/j;", "Ljg/N;", "d", "Ljg/K;", "e", "Ljg/X;", "f", "LB2/h;", "g", "Ljg/w;", "h", "Lkotlin/coroutines/CoroutineContext;", "i", "Ljg/E;", "m", "()Ljg/E;", "r", "(Ljg/E;)V", "localSessionData", "value", "j", "Z", "a", "()Z", "isInForeground", "k", "Ljg/U$b;", "getPreviousNotificationType$com_google_firebase_firebase_sessions", "()Ljg/U$b;", "setPreviousNotificationType$com_google_firebase_firebase_sessions", "(Ljg/U$b;)V", "previousNotificationType", "l", "Ljava/lang/String;", "previousSessionId", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class U implements T {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mg.j sessionsSettings;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final N sessionGenerator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final K sessionFirelogPublisher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final X timeProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2911h<SessionData> sessionDataStore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15028w processDataManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext backgroundDispatcher;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public SessionData localSessionData;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isInForeground;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private b previousNotificationType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String previousSessionId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140500a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Ljg/E;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {92}, m = "invokeSuspend")
        /* renamed from: jg.U$a$a, reason: collision with other inner class name */
        static final class C2223a extends SuspendLambda implements Function3<InterfaceC16562g<? super SessionData>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f140502a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f140503b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f140504c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ U f140505d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2223a(U u10, Continuation<? super C2223a> continuation) {
                super(3, continuation);
                this.f140505d = u10;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super SessionData> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
                C2223a c2223a = new C2223a(this.f140505d, continuation);
                c2223a.f140503b = interfaceC16562g;
                c2223a.f140504c = th2;
                return c2223a.invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f140502a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f140503b;
                    Throwable th2 = (Throwable) this.f140504c;
                    SessionData sessionData = new SessionData(this.f140505d.sessionGenerator.a(null), (Time) null, (Map) null, 4, (DefaultConstructorMarker) null);
                    FS.log_d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.f140503b = null;
                    this.f140502a = 1;
                    if (interfaceC16562g.emit(sessionData, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ U f140506a;

            b(U u10) {
                this.f140506a = u10;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionData sessionData, Continuation<? super Unit> continuation) {
                this.f140506a.r(sessionData);
                Object objQ = this.f140506a.q(sessionData.getSessionDetails().getSessionId(), b.f140507a, continuation);
                return objQ == IntrinsicsKt.f() ? objQ : Unit.f143329a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return U.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f140500a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fG = C16563h.g(U.this.sessionDataStore.getData(), new C2223a(U.this, null));
                b bVar = new b(U.this);
                this.f140500a = 1;
                if (interfaceC16561fG.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ljg/U$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f140507a = new b("GENERAL", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f140508b = new b("FALLBACK", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f140509c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f140510d;

        static {
            b[] bVarArrA = a();
            f140509c = bVarArrA;
            f140510d = EnumEntriesKt.a(bVarArrA);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f140507a, f140508b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f140509c.clone();
        }

        private b(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", l = {112}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140511a;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljg/E;", "sessionData", "<anonymous>", "(Ljg/E;)Ljg/E;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<SessionData, Continuation<? super SessionData>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f140513a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f140514b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U f140515c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(U u10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f140515c = u10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f140515c, continuation);
                aVar.f140514b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((a) create(sessionData, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f140513a == 0) {
                    ResultKt.b(obj);
                    return SessionData.c((SessionData) this.f140514b, null, this.f140515c.timeProvider.a(), null, 5, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return U.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f140511a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC2911h interfaceC2911h = U.this.sessionDataStore;
                    a aVar = new a(U.this, null);
                    this.f140511a = 1;
                    if (interfaceC2911h.a(aVar, this) == objF) {
                        return objF;
                    }
                }
            } catch (Exception e10) {
                FS.log_d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                U u10 = U.this;
                u10.r(SessionData.c(u10.m(), null, U.this.timeProvider.a(), null, 5, null));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {135, 186}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140516a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SessionData f140518c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljg/E;", "currentSessionData", "<anonymous>", "(Ljg/E;)Ljg/E;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<SessionData, Continuation<? super SessionData>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f140519a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f140520b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U f140521c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(U u10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f140521c = u10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f140521c, continuation);
                aVar.f140520b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((a) create(sessionData, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Map<String, ProcessData> mapE;
                SessionDetails sessionDetails;
                IntrinsicsKt.f();
                if (this.f140519a == 0) {
                    ResultKt.b(obj);
                    SessionData sessionData = (SessionData) this.f140520b;
                    boolean zP = this.f140521c.p(sessionData);
                    boolean zN = this.f140521c.n(sessionData);
                    boolean zO = this.f140521c.o(sessionData);
                    if (zN) {
                        mapE = this.f140521c.processDataManager.f();
                    } else if (zO) {
                        mapE = this.f140521c.processDataManager.c(sessionData.e());
                    } else {
                        mapE = sessionData.e();
                    }
                    if (zN) {
                        sessionDetails = null;
                    } else {
                        sessionDetails = sessionData.getSessionDetails();
                    }
                    if (!zP && !zN) {
                        if (zO) {
                            return SessionData.c(sessionData, null, null, this.f140521c.processDataManager.c(mapE), 3, null);
                        }
                        return sessionData;
                    }
                    SessionDetails sessionDetailsA = this.f140521c.sessionGenerator.a(sessionDetails);
                    this.f140521c.sessionFirelogPublisher.a(sessionDetailsA);
                    this.f140521c.processDataManager.d();
                    return sessionData.b(sessionDetailsA, null, mapE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SessionData sessionData, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f140518c = sessionData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return U.this.new e(this.f140518c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r10.a(r0, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            if (r10.q(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            return r1;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r9.f140516a
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L23
                if (r0 == r3) goto L1b
                if (r0 != r2) goto L13
                kotlin.ResultKt.b(r10)
                goto L9a
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L20
                goto L9a
            L20:
                r0 = move-exception
                r10 = r0
                goto L3d
            L23:
                kotlin.ResultKt.b(r10)
                jg.U r10 = jg.U.this     // Catch: java.lang.Exception -> L20
                B2.h r10 = jg.U.e(r10)     // Catch: java.lang.Exception -> L20
                jg.U$e$a r0 = new jg.U$e$a     // Catch: java.lang.Exception -> L20
                jg.U r4 = jg.U.this     // Catch: java.lang.Exception -> L20
                r5 = 0
                r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L20
                r9.f140516a = r3     // Catch: java.lang.Exception -> L20
                java.lang.Object r10 = r10.a(r0, r9)     // Catch: java.lang.Exception -> L20
                if (r10 != r1) goto L9a
                goto L99
            L3d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "App foregrounded, failed to update data. Message: "
                r0.append(r3)
                java.lang.String r10 = r10.getMessage()
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                java.lang.String r0 = "FirebaseSessions"
                com.fullstory.FS.log_d(r0, r10)
                jg.U r10 = jg.U.this
                jg.E r0 = r9.f140518c
                boolean r10 = jg.U.k(r10, r0)
                if (r10 == 0) goto L9a
                jg.U r10 = jg.U.this
                jg.N r10 = jg.U.g(r10)
                jg.E r0 = r9.f140518c
                jg.H r0 = r0.getSessionDetails()
                jg.H r4 = r10.a(r0)
                jg.U r10 = jg.U.this
                jg.E r3 = r9.f140518c
                r7 = 4
                r8 = 0
                r5 = 0
                r6 = 0
                jg.E r0 = jg.SessionData.c(r3, r4, r5, r6, r7, r8)
                r10.r(r0)
                jg.U r10 = jg.U.this
                jg.K r10 = jg.U.f(r10)
                r10.a(r4)
                jg.U r10 = jg.U.this
                java.lang.String r0 = r4.getSessionId()
                jg.U$b r3 = jg.U.b.f140508b
                r9.f140516a = r2
                java.lang.Object r10 = jg.U.l(r10, r0, r3, r9)
                if (r10 != r1) goto L9a
            L99:
                return r1
            L9a:
                kotlin.Unit r10 = kotlin.Unit.f143329a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.U.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", l = {199}, m = "notifySubscribers")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f140522a;

        /* renamed from: b, reason: collision with root package name */
        Object f140523b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f140524c;

        /* renamed from: e, reason: collision with root package name */
        int f140526e;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f140524c = obj;
            this.f140526e |= Integer.MIN_VALUE;
            return U.this.q(null, null, this);
        }
    }

    @Override // jg.T
    public void b() {
        this.isInForeground = false;
        if (this.localSessionData == null) {
            FS.log_d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        FS.log_d("FirebaseSessions", "App backgrounded on " + this.processDataManager.a());
        C15809k.d(C15784P.a(this.backgroundDispatcher), null, null, new d(null), 3, null);
    }

    @Override // jg.T
    public void c() {
        this.isInForeground = true;
        if (this.localSessionData == null) {
            FS.log_d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        SessionData sessionDataM = m();
        FS.log_d("FirebaseSessions", "App foregrounded on " + this.processDataManager.a());
        if (p(sessionDataM) || o(sessionDataM)) {
            C15809k.d(C15784P.a(this.backgroundDispatcher), null, null, new e(sessionDataM, null), 3, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f140507a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f140508b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public U(mg.j sessionsSettings, N sessionGenerator, K sessionFirelogPublisher, X timeProvider, InterfaceC2911h<SessionData> sessionDataStore, InterfaceC15028w processDataManager, @InterfaceC6504a CoroutineContext backgroundDispatcher) {
        Intrinsics.j(sessionsSettings, "sessionsSettings");
        Intrinsics.j(sessionGenerator, "sessionGenerator");
        Intrinsics.j(sessionFirelogPublisher, "sessionFirelogPublisher");
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(sessionDataStore, "sessionDataStore");
        Intrinsics.j(processDataManager, "processDataManager");
        Intrinsics.j(backgroundDispatcher, "backgroundDispatcher");
        this.sessionsSettings = sessionsSettings;
        this.sessionGenerator = sessionGenerator;
        this.sessionFirelogPublisher = sessionFirelogPublisher;
        this.timeProvider = timeProvider;
        this.sessionDataStore = sessionDataStore;
        this.processDataManager = processDataManager;
        this.backgroundDispatcher = backgroundDispatcher;
        this.previousNotificationType = b.f140507a;
        this.previousSessionId = "";
        C15809k.d(C15784P.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r6, jg.U.b r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof jg.U.f
            if (r0 == 0) goto L13
            r0 = r8
            jg.U$f r0 = (jg.U.f) r0
            int r1 = r0.f140526e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140526e = r1
            goto L18
        L13:
            jg.U$f r0 = new jg.U$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f140524c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f140526e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f140523b
            r7 = r6
            jg.U$b r7 = (jg.U.b) r7
            java.lang.Object r6 = r0.f140522a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.b(r8)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.ResultKt.b(r8)
            r5.previousNotificationType = r7
            java.lang.String r8 = r5.previousSessionId
            boolean r8 = kotlin.jvm.internal.Intrinsics.e(r8, r6)
            if (r8 == 0) goto L4a
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        L4a:
            r5.previousSessionId = r6
            kg.b r8 = kg.C15124b.f141827a
            r0.f140522a = r6
            r0.f140523b = r7
            r0.f140526e = r3
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r8 = r8.values()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L67:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lcd
            java.lang.Object r0 = r8.next()
            kg.c r0 = (kg.InterfaceC15125c) r0
            kg.c$b r1 = new kg.c$b
            r1.<init>(r6)
            r0.a(r1)
            int[] r1 = jg.U.c.$EnumSwitchMapping$0
            int r2 = r7.ordinal()
            r1 = r1[r2]
            java.lang.String r2 = "Notified "
            if (r1 == r3) goto Lac
            r4 = 2
            if (r1 != r4) goto La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            kg.c$a r0 = r0.c()
            r1.append(r0)
            java.lang.String r0 = " of new fallback session "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto Lc7
        La6:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            kg.c$a r0 = r0.c()
            r1.append(r0)
            java.lang.String r0 = " of new session "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        Lc7:
            java.lang.String r1 = "FirebaseSessions"
            com.fullstory.FS.log_d(r1, r0)
            goto L67
        Lcd:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.U.q(java.lang.String, jg.U$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jg.T
    /* renamed from: a, reason: from getter */
    public boolean getIsInForeground() {
        return this.isInForeground;
    }

    public final SessionData m() {
        SessionData sessionData = this.localSessionData;
        if (sessionData != null) {
            return sessionData;
        }
        Intrinsics.x("localSessionData");
        return null;
    }

    public final void r(SessionData sessionData) {
        Intrinsics.j(sessionData, "<set-?>");
        this.localSessionData = sessionData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(SessionData sessionData) {
        Map<String, ProcessData> mapE = sessionData.e();
        if (mapE != null) {
            boolean zE = this.processDataManager.e(mapE);
            if (zE) {
                FS.log_d("FirebaseSessions", "Cold app start detected");
            }
            return zE;
        }
        FS.log_d("FirebaseSessions", "No process data map");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(SessionData sessionData) {
        Map<String, ProcessData> mapE = sessionData.e();
        if (mapE != null) {
            boolean zB = this.processDataManager.b(mapE);
            if (zB) {
                FS.log_d("FirebaseSessions", "Process " + this.processDataManager.a() + " is stale");
            }
            return zB;
        }
        FS.log_d("FirebaseSessions", "No process data for " + this.processDataManager.a());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(SessionData sessionData) {
        Time backgroundTime = sessionData.getBackgroundTime();
        boolean z10 = false;
        if (backgroundTime != null) {
            if (Duration.t(this.timeProvider.a().c(backgroundTime), this.sessionsSettings.b()) > 0) {
                z10 = true;
            }
            if (z10) {
                FS.log_d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " is expired");
            }
            return z10;
        }
        FS.log_d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " has not backgrounded yet");
        return false;
    }
}
