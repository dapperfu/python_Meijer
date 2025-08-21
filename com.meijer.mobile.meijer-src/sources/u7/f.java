package u7;

import M7.j;
import X7.SessionInformationMetrics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.Z;
import org.json.JSONException;
import org.json.JSONObject;
import w7.EnumC17849a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0016\u0010)\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0018\u0010,\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lu7/f;", "", "", "cacheTimeMillis", "Lu7/a;", "oneAgentConfiguration", "Lmv/O;", "scope", "Lu7/h;", "dispatcher", "<init>", "(JLu7/a;Lmv/O;Lu7/h;)V", "", "g", "()V", "Lorg/json/JSONObject;", "jsonObject", "startTimestamp", "duration", "LX7/g;", "sessionInformationMetrics", "f", "(Lorg/json/JSONObject;JJLX7/g;)V", "a", "J", "b", "Lmv/O;", "c", "Lu7/h;", "", "d", "Z", "getRequiresMergedAppStart", "()Z", "requiresMergedAppStart", "e", "Lorg/json/JSONObject;", "pendingEvent", "Lmv/C0;", "Lmv/C0;", "pendingJob", "isFirstStartupEventDispatched", "h", "LX7/g;", "cachedMetrics", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long cacheTimeMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O scope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h dispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean requiresMergedAppStart;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private JSONObject pendingEvent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C0 pendingJob;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isFirstStartupEventDispatched;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private SessionInformationMetrics cachedMetrics;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1", f = "OneAgentStartupEventDispatcher.kt", l = {86}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163828a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f163829b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SessionInformationMetrics f163831d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.dynatrace.agent.OneAgentStartupEventDispatcher$dispatchNativeEvent$1$1$1$1$1", f = "OneAgentStartupEventDispatcher.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f163832a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f163833b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ JSONObject f163834c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ SessionInformationMetrics f163835d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f163833b = fVar;
                this.f163834c = jSONObject;
                this.f163835d = sessionInformationMetrics;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f163833b, this.f163834c, this.f163835d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f163832a == 0) {
                    ResultKt.b(obj);
                    this.f163833b.dispatcher.c(this.f163834c, this.f163835d, null);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SessionInformationMetrics sessionInformationMetrics, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f163831d = sessionInformationMetrics;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = f.this.new b(this.f163831d, continuation);
            bVar.f163829b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC15783O interfaceC15783O;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163828a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC15783O = (InterfaceC15783O) this.f163829b;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O2 = (InterfaceC15783O) this.f163829b;
                    long j10 = f.this.cacheTimeMillis;
                    this.f163829b = interfaceC15783O2;
                    this.f163828a = 1;
                    if (Z.b(j10, this) == objF) {
                        return objF;
                    }
                    interfaceC15783O = interfaceC15783O2;
                }
                f fVar = f.this;
                SessionInformationMetrics sessionInformationMetrics = this.f163831d;
                synchronized (fVar) {
                    try {
                        JSONObject jSONObject = fVar.pendingEvent;
                        if (jSONObject != null && C15784P.i(interfaceC15783O)) {
                            C15809k.d(fVar.scope, null, null, new a(fVar, jSONObject, sessionInformationMetrics, null), 3, null);
                        }
                        fVar.g();
                        Unit unit = Unit.f143329a;
                    } finally {
                    }
                }
            } catch (Exception e10) {
                z8.f.b("dtxDispatchingEvents", "Native startupEvent is stopped to be processed", e10);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentStartupEventDispatcher$dispatchNativeEvent$1$2", f = "OneAgentStartupEventDispatcher.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163836a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f163838c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SessionInformationMetrics f163839d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JSONObject jSONObject, SessionInformationMetrics sessionInformationMetrics, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f163838c = jSONObject;
            this.f163839d = sessionInformationMetrics;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new c(this.f163838c, this.f163839d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f163836a == 0) {
                ResultKt.b(obj);
                f.this.dispatcher.c(this.f163838c, this.f163839d, null);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.pendingEvent = null;
        this.pendingJob = null;
        this.cachedMetrics = null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17849a.values().length];
            try {
                iArr[EnumC17849a.f166976f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17849a.f166975e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(long j10, OneAgentConfiguration oneAgentConfiguration, InterfaceC15783O scope, h dispatcher) {
        Intrinsics.j(oneAgentConfiguration, "oneAgentConfiguration");
        Intrinsics.j(scope, "scope");
        Intrinsics.j(dispatcher, "dispatcher");
        this.cacheTimeMillis = j10;
        this.scope = scope;
        this.dispatcher = dispatcher;
        int i10 = a.$EnumSwitchMapping$0[oneAgentConfiguration.getInstrumentationFlavor().ordinal()];
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        this.requiresMergedAppStart = z10;
    }

    public final void f(JSONObject jsonObject, long startTimestamp, long duration, SessionInformationMetrics sessionInformationMetrics) throws JSONException {
        Intrinsics.j(jsonObject, "jsonObject");
        Intrinsics.j(sessionInformationMetrics, "sessionInformationMetrics");
        JSONObject jSONObjectC = j.c(jsonObject);
        jSONObjectC.put("start_time", startTimestamp);
        jSONObjectC.put("duration", duration);
        synchronized (this) {
            try {
                if (!this.requiresMergedAppStart || this.isFirstStartupEventDispatched) {
                    C15809k.d(this.scope, null, null, new c(jSONObjectC, sessionInformationMetrics, null), 3, null);
                } else {
                    this.isFirstStartupEventDispatched = true;
                    this.cachedMetrics = sessionInformationMetrics;
                    this.pendingEvent = jSONObjectC;
                    this.pendingJob = C15809k.d(this.scope, null, null, new b(sessionInformationMetrics, null), 3, null);
                    Unit unit = Unit.f143329a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
