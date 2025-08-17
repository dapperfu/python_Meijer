package hg;

import B2.InterfaceC2943h;
import af.InterfaceC5598a;
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
import qv.C16623P;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\b\u0001\u0018\u00002\u00020\u0001:\u0001 BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00105\u001a\u00020\u000b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010;\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010B\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lhg/U;", "Lhg/T;", "Lkg/j;", "sessionsSettings", "Lhg/N;", "sessionGenerator", "Lhg/K;", "sessionFirelogPublisher", "Lhg/X;", "timeProvider", "LB2/h;", "Lhg/E;", "sessionDataStore", "Lhg/w;", "processDataManager", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lkg/j;Lhg/N;Lhg/K;Lhg/X;LB2/h;Lhg/w;Lkotlin/coroutines/CoroutineContext;)V", "", "sessionId", "Lhg/U$b;", "type", "", "q", "(Ljava/lang/String;Lhg/U$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionData", "", "p", "(Lhg/E;)Z", "n", "o", "b", "()V", "c", "Lkg/j;", "Lhg/N;", "d", "Lhg/K;", "e", "Lhg/X;", "f", "LB2/h;", "g", "Lhg/w;", "h", "Lkotlin/coroutines/CoroutineContext;", "i", "Lhg/E;", "m", "()Lhg/E;", "r", "(Lhg/E;)V", "localSessionData", "value", "j", "Z", "a", "()Z", "isInForeground", "k", "Lhg/U$b;", "getPreviousNotificationType$com_google_firebase_firebase_sessions", "()Lhg/U$b;", "setPreviousNotificationType$com_google_firebase_firebase_sessions", "(Lhg/U$b;)V", "previousNotificationType", "l", "Ljava/lang/String;", "previousSessionId", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class U implements T {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kg.j sessionsSettings;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final N sessionGenerator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final K sessionFirelogPublisher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final X timeProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2943h<SessionData> sessionDataStore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14450w processDataManager;

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1", f = "SharedSessionRepository.kt", l = {94}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f134805a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lhg/E;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1", f = "SharedSessionRepository.kt", l = {92}, m = "invokeSuspend")
        /* renamed from: hg.U$a$a, reason: collision with other inner class name */
        static final class C2124a extends SuspendLambda implements Function3<InterfaceC17153g<? super SessionData>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f134807a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f134808b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f134809c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ U f134810d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2124a(U u10, Continuation<? super C2124a> continuation) {
                super(3, continuation);
                this.f134810d = u10;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super SessionData> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
                C2124a c2124a = new C2124a(this.f134810d, continuation);
                c2124a.f134808b = interfaceC17153g;
                c2124a.f134809c = th2;
                return c2124a.invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f134807a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f134808b;
                    Throwable th2 = (Throwable) this.f134809c;
                    SessionData sessionData = new SessionData(this.f134810d.sessionGenerator.a(null), (Time) null, (Map) null, 4, (DefaultConstructorMarker) null);
                    FS.log_d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.f134808b = null;
                    this.f134807a = 1;
                    if (interfaceC17153g.emit(sessionData, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ U f134811a;

            b(U u10) {
                this.f134811a = u10;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionData sessionData, Continuation<? super Unit> continuation) {
                this.f134811a.r(sessionData);
                Object objQ = this.f134811a.q(sessionData.getSessionDetails().getSessionId(), b.f134812a, continuation);
                return objQ == IntrinsicsKt.f() ? objQ : Unit.f142422a;
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
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f134805a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fG = C17154h.g(U.this.sessionDataStore.getData(), new C2124a(U.this, null));
                b bVar = new b(U.this);
                this.f134805a = 1;
                if (interfaceC17152fG.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lhg/U$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f134812a = new b("GENERAL", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f134813b = new b("FALLBACK", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f134814c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f134815d;

        static {
            b[] bVarArrA = a();
            f134814c = bVarArrA;
            f134815d = EnumEntriesKt.a(bVarArrA);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f134812a, f134813b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f134814c.clone();
        }

        private b(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1", f = "SharedSessionRepository.kt", l = {112}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f134816a;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhg/E;", "sessionData", "<anonymous>", "(Lhg/E;)Lhg/E;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appBackground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<SessionData, Continuation<? super SessionData>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f134818a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f134819b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U f134820c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(U u10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f134820c = u10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f134820c, continuation);
                aVar.f134819b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((a) create(sessionData, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f134818a == 0) {
                    ResultKt.b(obj);
                    return SessionData.c((SessionData) this.f134819b, null, this.f134820c.timeProvider.a(), null, 5, null);
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
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f134816a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC2943h interfaceC2943h = U.this.sessionDataStore;
                    a aVar = new a(U.this, null);
                    this.f134816a = 1;
                    if (interfaceC2943h.a(aVar, this) == objF) {
                        return objF;
                    }
                }
            } catch (Exception e10) {
                FS.log_d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                U u10 = U.this;
                u10.r(SessionData.c(u10.m(), null, U.this.timeProvider.a(), null, 5, null));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1", f = "SharedSessionRepository.kt", l = {135, 186}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f134821a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SessionData f134823c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhg/E;", "currentSessionData", "<anonymous>", "(Lhg/E;)Lhg/E;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl$appForeground$1$1", f = "SharedSessionRepository.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<SessionData, Continuation<? super SessionData>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f134824a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f134825b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ U f134826c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(U u10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f134826c = u10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f134826c, continuation);
                aVar.f134825b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, Continuation<? super SessionData> continuation) {
                return ((a) create(sessionData, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Map<String, ProcessData> mapE;
                SessionDetails sessionDetails;
                IntrinsicsKt.f();
                if (this.f134824a == 0) {
                    ResultKt.b(obj);
                    SessionData sessionData = (SessionData) this.f134825b;
                    boolean zP = this.f134826c.p(sessionData);
                    boolean zN = this.f134826c.n(sessionData);
                    boolean zO = this.f134826c.o(sessionData);
                    if (zN) {
                        mapE = this.f134826c.processDataManager.f();
                    } else if (zO) {
                        mapE = this.f134826c.processDataManager.c(sessionData.e());
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
                            return SessionData.c(sessionData, null, null, this.f134826c.processDataManager.c(mapE), 3, null);
                        }
                        return sessionData;
                    }
                    SessionDetails sessionDetailsA = this.f134826c.sessionGenerator.a(sessionDetails);
                    this.f134826c.sessionFirelogPublisher.a(sessionDetailsA);
                    this.f134826c.processDataManager.d();
                    return sessionData.b(sessionDetailsA, null, mapE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SessionData sessionData, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f134823c = sessionData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return U.this.new e(this.f134823c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
                int r0 = r9.f134821a
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
                hg.U r10 = hg.U.this     // Catch: java.lang.Exception -> L20
                B2.h r10 = hg.U.e(r10)     // Catch: java.lang.Exception -> L20
                hg.U$e$a r0 = new hg.U$e$a     // Catch: java.lang.Exception -> L20
                hg.U r4 = hg.U.this     // Catch: java.lang.Exception -> L20
                r5 = 0
                r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L20
                r9.f134821a = r3     // Catch: java.lang.Exception -> L20
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
                hg.U r10 = hg.U.this
                hg.E r0 = r9.f134823c
                boolean r10 = hg.U.k(r10, r0)
                if (r10 == 0) goto L9a
                hg.U r10 = hg.U.this
                hg.N r10 = hg.U.g(r10)
                hg.E r0 = r9.f134823c
                hg.H r0 = r0.getSessionDetails()
                hg.H r4 = r10.a(r0)
                hg.U r10 = hg.U.this
                hg.E r3 = r9.f134823c
                r7 = 4
                r8 = 0
                r5 = 0
                r6 = 0
                hg.E r0 = hg.SessionData.c(r3, r4, r5, r6, r7, r8)
                r10.r(r0)
                hg.U r10 = hg.U.this
                hg.K r10 = hg.U.f(r10)
                r10.a(r4)
                hg.U r10 = hg.U.this
                java.lang.String r0 = r4.getSessionId()
                hg.U$b r3 = hg.U.b.f134813b
                r9.f134821a = r2
                java.lang.Object r10 = hg.U.l(r10, r0, r3, r9)
                if (r10 != r1) goto L9a
            L99:
                return r1
            L9a:
                kotlin.Unit r10 = kotlin.Unit.f142422a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.U.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", l = {199}, m = "notifySubscribers")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f134827a;

        /* renamed from: b, reason: collision with root package name */
        Object f134828b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f134829c;

        /* renamed from: e, reason: collision with root package name */
        int f134831e;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f134829c = obj;
            this.f134831e |= Integer.MIN_VALUE;
            return U.this.q(null, null, this);
        }
    }

    @Override // hg.T
    public void b() {
        this.isInForeground = false;
        if (this.localSessionData == null) {
            FS.log_d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        FS.log_d("FirebaseSessions", "App backgrounded on " + this.processDataManager.a());
        C16648k.d(C16623P.a(this.backgroundDispatcher), null, null, new d(null), 3, null);
    }

    @Override // hg.T
    public void c() {
        this.isInForeground = true;
        if (this.localSessionData == null) {
            FS.log_d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        SessionData sessionDataM = m();
        FS.log_d("FirebaseSessions", "App foregrounded on " + this.processDataManager.a());
        if (p(sessionDataM) || o(sessionDataM)) {
            C16648k.d(C16623P.a(this.backgroundDispatcher), null, null, new e(sessionDataM, null), 3, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f134812a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f134813b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public U(kg.j sessionsSettings, N sessionGenerator, K sessionFirelogPublisher, X timeProvider, InterfaceC2943h<SessionData> sessionDataStore, InterfaceC14450w processDataManager, @InterfaceC5598a CoroutineContext backgroundDispatcher) {
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
        this.previousNotificationType = b.f134812a;
        this.previousSessionId = "";
        C16648k.d(C16623P.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r6, hg.U.b r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof hg.U.f
            if (r0 == 0) goto L13
            r0 = r8
            hg.U$f r0 = (hg.U.f) r0
            int r1 = r0.f134831e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134831e = r1
            goto L18
        L13:
            hg.U$f r0 = new hg.U$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f134829c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f134831e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f134828b
            r7 = r6
            hg.U$b r7 = (hg.U.b) r7
            java.lang.Object r6 = r0.f134827a
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
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        L4a:
            r5.previousSessionId = r6
            ig.b r8 = ig.C14720b.f137738a
            r0.f134827a = r6
            r0.f134828b = r7
            r0.f134831e = r3
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
            ig.c r0 = (ig.InterfaceC14721c) r0
            ig.c$b r1 = new ig.c$b
            r1.<init>(r6)
            r0.a(r1)
            int[] r1 = hg.U.c.$EnumSwitchMapping$0
            int r2 = r7.ordinal()
            r1 = r1[r2]
            java.lang.String r2 = "Notified "
            if (r1 == r3) goto Lac
            r4 = 2
            if (r1 != r4) goto La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            ig.c$a r0 = r0.c()
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
            ig.c$a r0 = r0.c()
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
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.U.q(java.lang.String, hg.U$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // hg.T
    /* renamed from: a, reason: from getter */
    public boolean getIsInForeground() {
        return this.isInForeground;
    }

    public final SessionData m() {
        SessionData sessionData = this.localSessionData;
        if (sessionData != null) {
            return sessionData;
        }
        Intrinsics.y("localSessionData");
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
