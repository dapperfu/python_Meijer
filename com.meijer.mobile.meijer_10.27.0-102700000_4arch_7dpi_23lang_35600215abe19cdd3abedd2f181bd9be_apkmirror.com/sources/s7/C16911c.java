package s7;

import K7.i;
import K7.m;
import V7.SessionInformationMetrics;
import Z7.MetricsDataModel;
import com.dynatrace.agent.storage.db.EventRecord;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import f8.C13858b;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;
import s7.C16911c;
import w7.InterfaceC17801a;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017Jd\u0010&\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 2\u0014\b\u0002\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0#H\u0082@¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,JI\u00103\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016¢\u0006\u0004\b3\u00104J1\u00105\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00100\u001a\u00020/2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016¢\u0006\u0004\b5\u00106J/\u00109\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010FR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010P\u001a\b\u0012\u0004\u0012\u00020L0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010M\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Ls7/c;", "Ls7/h;", "Ls7/a;", "oneAgentConfiguration", "Lw7/a;", "timeProvider", "LW7/d;", "eventDatabase", "LV7/b;", "metricsCache", "Lqv/O;", "coroutineScope", "Lf8/b;", "viewContextManager", "LZ7/h;", "serverConfigurationDataSource", "LY7/a;", "dynamicConfigDataSource", "LJ7/c;", "eventThrottler", "LJ7/a;", "eventFlowGovernor", "<init>", "(Ls7/a;Lw7/a;LW7/d;LV7/b;Lqv/O;Lf8/b;LZ7/h;LY7/a;LJ7/c;LJ7/a;)V", "Lorg/json/JSONObject;", "jsonObject", "", "recordTimestamp", "", "LK7/b;", "overridableAttributes", "protectedAttributes", "", "", "eventContext", "Lkotlin/Function0;", "collectBasicMetrics", "", "h", "(Lorg/json/JSONObject;JLjava/util/List;Ljava/util/List;[Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/dynatrace/agent/storage/db/EventRecord;", "eventRecord", "Lqv/C0;", "k", "(Lcom/dynatrace/agent/storage/db/EventRecord;)Lqv/C0;", "startTimestamp", "duration", "LV7/g;", "sessionInformationMetrics", "", "isApiReported", "b", "(Lorg/json/JSONObject;JJLV7/g;Z[Ljava/lang/Object;)V", "c", "(Lorg/json/JSONObject;LV7/g;[Ljava/lang/Object;)V", "LZ7/d;", "metricsData", "a", "(Lorg/json/JSONObject;JLV7/g;LZ7/d;)V", "Ls7/a;", "Lw7/a;", "LW7/d;", "d", "LV7/b;", "e", "Lqv/O;", "f", "Lf8/b;", "g", "LZ7/h;", "LY7/a;", "i", "LJ7/c;", "j", "LJ7/a;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "LJ7/b;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getModifiers$com_dynatrace_agent_release", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "modifiers", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: s7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16911c implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OneAgentConfiguration oneAgentConfiguration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final W7.d eventDatabase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final V7.b metricsCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C13858b viewContextManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Z7.h serverConfigurationDataSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Y7.a dynamicConfigDataSource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final J7.c eventThrottler;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final J7.a eventFlowGovernor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedQueue<J7.b> modifiers;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$1", f = "OneAgentEventDispatcher.kt", l = {177}, m = "invokeSuspend")
    /* renamed from: s7.c$a */
    static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160302a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f160304c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f160305d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SessionInformationMetrics f160306e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object[] f160307f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject, long j10, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f160304c = jSONObject;
            this.f160305d = j10;
            this.f160306e = sessionInformationMetrics;
            this.f160307f = objArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C16911c.this.new a(this.f160304c, this.f160305d, this.f160306e, this.f160307f, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f160302a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C16911c c16911c = C16911c.this;
                JSONObject jSONObject = this.f160304c;
                long j10 = this.f160305d;
                List listM = CollectionsKt.m();
                List listE = CollectionsKt.e(new m(this.f160306e));
                Object[] objArr = this.f160307f;
                this.f160302a = 1;
                if (C16911c.i(c16911c, jSONObject, j10, listM, listE, objArr, null, this, 32, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$2", f = "OneAgentEventDispatcher.kt", l = {214}, m = "invokeSuspend")
    /* renamed from: s7.c$b */
    static final class b extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160308a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f160310c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f160311d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SessionInformationMetrics f160312e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object[] f160313f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JSONObject jSONObject, Object obj, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f160310c = jSONObject;
            this.f160311d = obj;
            this.f160312e = sessionInformationMetrics;
            this.f160313f = objArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C16911c.this.new b(this.f160310c, this.f160311d, this.f160312e, this.f160313f, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f160308a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C16911c c16911c = C16911c.this;
                JSONObject jSONObject = this.f160310c;
                Object obj2 = this.f160311d;
                Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Number");
                long jLongValue = ((Number) obj2).longValue();
                List listM = CollectionsKt.m();
                List listE = CollectionsKt.e(new m(this.f160312e));
                Object[] objArr = this.f160313f;
                this.f160308a = 1;
                if (C16911c.i(c16911c, jSONObject, jLongValue, listM, listE, objArr, null, this, 32, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$3", f = "OneAgentEventDispatcher.kt", l = {239}, m = "invokeSuspend")
    /* renamed from: s7.c$c, reason: collision with other inner class name */
    static final class C2500c extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160314a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f160316c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f160317d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SessionInformationMetrics f160318e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MetricsDataModel f160319f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2500c(JSONObject jSONObject, long j10, SessionInformationMetrics sessionInformationMetrics, MetricsDataModel metricsDataModel, Continuation<? super C2500c> continuation) {
            super(1, continuation);
            this.f160316c = jSONObject;
            this.f160317d = j10;
            this.f160318e = sessionInformationMetrics;
            this.f160319f = metricsDataModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C16911c.this.new C2500c(this.f160316c, this.f160317d, this.f160318e, this.f160319f, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List k(MetricsDataModel metricsDataModel) {
            return i.f(metricsDataModel);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C2500c) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f160314a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C16911c c16911c = C16911c.this;
                JSONObject jSONObject = this.f160316c;
                long j10 = this.f160317d;
                List listM = CollectionsKt.m();
                List listE = CollectionsKt.e(new m(this.f160318e));
                final MetricsDataModel metricsDataModel = this.f160319f;
                Function0 function0 = new Function0() { // from class: s7.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16911c.C2500c.k(metricsDataModel);
                    }
                };
                this.f160314a = 1;
                if (c16911c.h(jSONObject, j10, listM, listE, null, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher", f = "OneAgentEventDispatcher.kt", l = {339}, m = "dispatchInternalEvent")
    /* renamed from: s7.c$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f160320a;

        /* renamed from: b, reason: collision with root package name */
        Object f160321b;

        /* renamed from: c, reason: collision with root package name */
        Object f160322c;

        /* renamed from: d, reason: collision with root package name */
        Object f160323d;

        /* renamed from: e, reason: collision with root package name */
        Object f160324e;

        /* renamed from: f, reason: collision with root package name */
        Object f160325f;

        /* renamed from: g, reason: collision with root package name */
        long f160326g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f160327h;

        /* renamed from: j, reason: collision with root package name */
        int f160329j;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f160327h = obj;
            this.f160329j |= Integer.MIN_VALUE;
            return C16911c.this.h(null, 0L, null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher$storeEvent$1", f = "OneAgentEventDispatcher.kt", l = {HttpResponseStatus.ERROR_METHOD_NOT_ALLOWED}, m = "invokeSuspend")
    /* renamed from: s7.c$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f160330a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EventRecord f160332c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(EventRecord eventRecord, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f160332c = eventRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C16911c.this.new e(this.f160332c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f160330a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (C16911c.this.eventThrottler.a()) {
                    W7.d dVar = C16911c.this.eventDatabase;
                    EventRecord eventRecord = this.f160332c;
                    x8.f.a("dtxDispatchingEvents", "storing event: " + eventRecord);
                    this.f160330a = 1;
                    if (dVar.b(eventRecord, this) == objF) {
                        return objF;
                    }
                } else {
                    x8.f.a("dtxDispatchingEvents", "event is dropped by throttling");
                }
            }
            return Unit.f142422a;
        }
    }

    public C16911c(OneAgentConfiguration oneAgentConfiguration, InterfaceC17801a timeProvider, W7.d eventDatabase, V7.b metricsCache, InterfaceC16622O coroutineScope, C13858b viewContextManager, Z7.h serverConfigurationDataSource, Y7.a dynamicConfigDataSource, J7.c eventThrottler, J7.a eventFlowGovernor) {
        Intrinsics.j(oneAgentConfiguration, "oneAgentConfiguration");
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(eventDatabase, "eventDatabase");
        Intrinsics.j(metricsCache, "metricsCache");
        Intrinsics.j(coroutineScope, "coroutineScope");
        Intrinsics.j(viewContextManager, "viewContextManager");
        Intrinsics.j(serverConfigurationDataSource, "serverConfigurationDataSource");
        Intrinsics.j(dynamicConfigDataSource, "dynamicConfigDataSource");
        Intrinsics.j(eventThrottler, "eventThrottler");
        Intrinsics.j(eventFlowGovernor, "eventFlowGovernor");
        this.oneAgentConfiguration = oneAgentConfiguration;
        this.timeProvider = timeProvider;
        this.eventDatabase = eventDatabase;
        this.metricsCache = metricsCache;
        this.coroutineScope = coroutineScope;
        this.viewContextManager = viewContextManager;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.dynamicConfigDataSource = dynamicConfigDataSource;
        this.eventThrottler = eventThrottler;
        this.eventFlowGovernor = eventFlowGovernor;
        this.modifiers = new ConcurrentLinkedQueue<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(org.json.JSONObject r21, long r22, java.util.List<? extends K7.b> r24, java.util.List<? extends K7.b> r25, java.lang.Object[] r26, kotlin.jvm.functions.Function0<? extends java.util.List<? extends K7.b>> r27, kotlin.coroutines.Continuation<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C16911c.h(org.json.JSONObject, long, java.util.List, java.util.List, java.lang.Object[], kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object i(final C16911c c16911c, JSONObject jSONObject, long j10, List list, List list2, Object[] objArr, Function0 function0, Continuation continuation, int i10, Object obj) {
        return c16911c.h(jSONObject, j10, list, list2, objArr, (i10 & 32) != 0 ? new Function0() { // from class: s7.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C16911c.j(this.f160290a);
            }
        } : function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(C16911c c16911c) {
        return i.e(c16911c.metricsCache);
    }

    private final C0 k(EventRecord eventRecord) {
        return C16648k.d(this.coroutineScope, null, null, new e(eventRecord, null), 3, null);
    }

    @Override // s7.h
    public void a(JSONObject jsonObject, long startTimestamp, SessionInformationMetrics sessionInformationMetrics, MetricsDataModel metricsData) throws JSONException {
        Intrinsics.j(jsonObject, "jsonObject");
        Intrinsics.j(sessionInformationMetrics, "sessionInformationMetrics");
        Intrinsics.j(metricsData, "metricsData");
        jsonObject.put("start_time", startTimestamp);
        jsonObject.put("duration", 0);
        jsonObject.remove("characteristics.is_api_reported");
        this.eventFlowGovernor.b(new C2500c(jsonObject, startTimestamp, sessionInformationMetrics, metricsData, null));
    }

    @Override // s7.h
    public void b(JSONObject jsonObject, long startTimestamp, long duration, SessionInformationMetrics sessionInformationMetrics, boolean isApiReported, Object[] eventContext) throws JSONException {
        Intrinsics.j(jsonObject, "jsonObject");
        Intrinsics.j(sessionInformationMetrics, "sessionInformationMetrics");
        jsonObject.put("start_time", startTimestamp);
        jsonObject.put("duration", duration);
        if (isApiReported) {
            jsonObject.put("characteristics.is_api_reported", true);
        } else {
            jsonObject.remove("characteristics.is_api_reported");
        }
        this.eventFlowGovernor.b(new a(jsonObject, startTimestamp, sessionInformationMetrics, eventContext, null));
    }

    @Override // s7.h
    public void c(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics, Object[] eventContext) {
        Intrinsics.j(jsonObject, "jsonObject");
        Intrinsics.j(sessionInformationMetrics, "sessionInformationMetrics");
        Object objOpt = jsonObject.opt("start_time");
        Object objOpt2 = jsonObject.opt("duration");
        if (!(objOpt instanceof Long) && !(objOpt instanceof Integer)) {
            x8.f.a("dtxDispatchingEvents", "The given JSON event must have a valid start_time! json: " + jsonObject);
            return;
        }
        if ((objOpt2 instanceof Long) || (objOpt2 instanceof Integer)) {
            this.eventFlowGovernor.b(new b(jsonObject, objOpt, sessionInformationMetrics, eventContext, null));
            return;
        }
        x8.f.a("dtxDispatchingEvents", "The given JSON event must have a valid duration! json: " + jsonObject);
    }
}
