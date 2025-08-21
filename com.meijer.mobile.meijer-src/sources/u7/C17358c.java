package u7;

import M7.i;
import M7.m;
import X7.SessionInformationMetrics;
import a8.InterfaceC5667a;
import b8.MetricsDataModel;
import com.dynatrace.agent.storage.db.EventRecord;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import h8.C14488b;
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
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import org.json.JSONException;
import org.json.JSONObject;
import u7.C17358c;
import y7.InterfaceC18294a;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017Jd\u0010&\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 2\u0014\b\u0002\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0#H\u0082@¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,JI\u00103\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016¢\u0006\u0004\b3\u00104J1\u00105\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00100\u001a\u00020/2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016¢\u0006\u0004\b5\u00106J/\u00109\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010FR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010P\u001a\b\u0012\u0004\u0012\u00020L0K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010M\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lu7/c;", "Lu7/h;", "Lu7/a;", "oneAgentConfiguration", "Ly7/a;", "timeProvider", "LY7/d;", "eventDatabase", "LX7/b;", "metricsCache", "Lmv/O;", "coroutineScope", "Lh8/b;", "viewContextManager", "Lb8/h;", "serverConfigurationDataSource", "La8/a;", "dynamicConfigDataSource", "LL7/c;", "eventThrottler", "LL7/a;", "eventFlowGovernor", "<init>", "(Lu7/a;Ly7/a;LY7/d;LX7/b;Lmv/O;Lh8/b;Lb8/h;La8/a;LL7/c;LL7/a;)V", "Lorg/json/JSONObject;", "jsonObject", "", "recordTimestamp", "", "LM7/b;", "overridableAttributes", "protectedAttributes", "", "", "eventContext", "Lkotlin/Function0;", "collectBasicMetrics", "", "h", "(Lorg/json/JSONObject;JLjava/util/List;Ljava/util/List;[Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/dynatrace/agent/storage/db/EventRecord;", "eventRecord", "Lmv/C0;", "k", "(Lcom/dynatrace/agent/storage/db/EventRecord;)Lmv/C0;", "startTimestamp", "duration", "LX7/g;", "sessionInformationMetrics", "", "isApiReported", "a", "(Lorg/json/JSONObject;JJLX7/g;Z[Ljava/lang/Object;)V", "c", "(Lorg/json/JSONObject;LX7/g;[Ljava/lang/Object;)V", "Lb8/d;", "metricsData", "b", "(Lorg/json/JSONObject;JLX7/g;Lb8/d;)V", "Lu7/a;", "Ly7/a;", "LY7/d;", "d", "LX7/b;", "e", "Lmv/O;", "f", "Lh8/b;", "g", "Lb8/h;", "La8/a;", "i", "LL7/c;", "j", "LL7/a;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "LL7/b;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getModifiers$com_dynatrace_agent_release", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "modifiers", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: u7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17358c implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OneAgentConfiguration oneAgentConfiguration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18294a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Y7.d eventDatabase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final X7.b metricsCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C14488b viewContextManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b8.h serverConfigurationDataSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5667a dynamicConfigDataSource;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final L7.c eventThrottler;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final L7.a eventFlowGovernor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedQueue<L7.b> modifiers;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$1", f = "OneAgentEventDispatcher.kt", l = {177}, m = "invokeSuspend")
    /* renamed from: u7.c$a */
    static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163788a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f163790c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f163791d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SessionInformationMetrics f163792e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object[] f163793f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject, long j10, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f163790c = jSONObject;
            this.f163791d = j10;
            this.f163792e = sessionInformationMetrics;
            this.f163793f = objArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C17358c.this.new a(this.f163790c, this.f163791d, this.f163792e, this.f163793f, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163788a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17358c c17358c = C17358c.this;
                JSONObject jSONObject = this.f163790c;
                long j10 = this.f163791d;
                List listM = CollectionsKt.m();
                List listE = CollectionsKt.e(new m(this.f163792e));
                Object[] objArr = this.f163793f;
                this.f163788a = 1;
                if (C17358c.i(c17358c, jSONObject, j10, listM, listE, objArr, null, this, 32, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$2", f = "OneAgentEventDispatcher.kt", l = {214}, m = "invokeSuspend")
    /* renamed from: u7.c$b */
    static final class b extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163794a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f163796c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f163797d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SessionInformationMetrics f163798e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object[] f163799f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JSONObject jSONObject, Object obj, SessionInformationMetrics sessionInformationMetrics, Object[] objArr, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f163796c = jSONObject;
            this.f163797d = obj;
            this.f163798e = sessionInformationMetrics;
            this.f163799f = objArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C17358c.this.new b(this.f163796c, this.f163797d, this.f163798e, this.f163799f, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163794a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17358c c17358c = C17358c.this;
                JSONObject jSONObject = this.f163796c;
                Object obj2 = this.f163797d;
                Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Number");
                long jLongValue = ((Number) obj2).longValue();
                List listM = CollectionsKt.m();
                List listE = CollectionsKt.e(new m(this.f163798e));
                Object[] objArr = this.f163799f;
                this.f163794a = 1;
                if (C17358c.i(c17358c, jSONObject, jLongValue, listM, listE, objArr, null, this, 32, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher$dispatchEvent$3", f = "OneAgentEventDispatcher.kt", l = {239}, m = "invokeSuspend")
    /* renamed from: u7.c$c, reason: collision with other inner class name */
    static final class C2593c extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163800a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f163802c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f163803d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ SessionInformationMetrics f163804e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MetricsDataModel f163805f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2593c(JSONObject jSONObject, long j10, SessionInformationMetrics sessionInformationMetrics, MetricsDataModel metricsDataModel, Continuation<? super C2593c> continuation) {
            super(1, continuation);
            this.f163802c = jSONObject;
            this.f163803d = j10;
            this.f163804e = sessionInformationMetrics;
            this.f163805f = metricsDataModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C17358c.this.new C2593c(this.f163802c, this.f163803d, this.f163804e, this.f163805f, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List k(MetricsDataModel metricsDataModel) {
            return i.f(metricsDataModel);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C2593c) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163800a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17358c c17358c = C17358c.this;
                JSONObject jSONObject = this.f163802c;
                long j10 = this.f163803d;
                List listM = CollectionsKt.m();
                List listE = CollectionsKt.e(new m(this.f163804e));
                final MetricsDataModel metricsDataModel = this.f163805f;
                Function0 function0 = new Function0() { // from class: u7.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C17358c.C2593c.k(metricsDataModel);
                    }
                };
                this.f163800a = 1;
                if (c17358c.h(jSONObject, j10, listM, listE, null, function0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher", f = "OneAgentEventDispatcher.kt", l = {339}, m = "dispatchInternalEvent")
    /* renamed from: u7.c$d */
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f163806a;

        /* renamed from: b, reason: collision with root package name */
        Object f163807b;

        /* renamed from: c, reason: collision with root package name */
        Object f163808c;

        /* renamed from: d, reason: collision with root package name */
        Object f163809d;

        /* renamed from: e, reason: collision with root package name */
        Object f163810e;

        /* renamed from: f, reason: collision with root package name */
        Object f163811f;

        /* renamed from: g, reason: collision with root package name */
        long f163812g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f163813h;

        /* renamed from: j, reason: collision with root package name */
        int f163815j;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f163813h = obj;
            this.f163815j |= Integer.MIN_VALUE;
            return C17358c.this.h(null, 0L, null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.OneAgentEventDispatcher$storeEvent$1", f = "OneAgentEventDispatcher.kt", l = {HttpResponseStatus.ERROR_METHOD_NOT_ALLOWED}, m = "invokeSuspend")
    /* renamed from: u7.c$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163816a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EventRecord f163818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(EventRecord eventRecord, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f163818c = eventRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17358c.this.new e(this.f163818c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163816a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (C17358c.this.eventThrottler.a()) {
                    Y7.d dVar = C17358c.this.eventDatabase;
                    EventRecord eventRecord = this.f163818c;
                    z8.f.a("dtxDispatchingEvents", "storing event: " + eventRecord);
                    this.f163816a = 1;
                    if (dVar.b(eventRecord, this) == objF) {
                        return objF;
                    }
                } else {
                    z8.f.a("dtxDispatchingEvents", "event is dropped by throttling");
                }
            }
            return Unit.f143329a;
        }
    }

    public C17358c(OneAgentConfiguration oneAgentConfiguration, InterfaceC18294a timeProvider, Y7.d eventDatabase, X7.b metricsCache, InterfaceC15783O coroutineScope, C14488b viewContextManager, b8.h serverConfigurationDataSource, InterfaceC5667a dynamicConfigDataSource, L7.c eventThrottler, L7.a eventFlowGovernor) {
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
    public final java.lang.Object h(org.json.JSONObject r21, long r22, java.util.List<? extends M7.b> r24, java.util.List<? extends M7.b> r25, java.lang.Object[] r26, kotlin.jvm.functions.Function0<? extends java.util.List<? extends M7.b>> r27, kotlin.coroutines.Continuation<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.C17358c.h(org.json.JSONObject, long, java.util.List, java.util.List, java.lang.Object[], kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object i(final C17358c c17358c, JSONObject jSONObject, long j10, List list, List list2, Object[] objArr, Function0 function0, Continuation continuation, int i10, Object obj) {
        return c17358c.h(jSONObject, j10, list, list2, objArr, (i10 & 32) != 0 ? new Function0() { // from class: u7.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C17358c.j(this.f163776a);
            }
        } : function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(C17358c c17358c) {
        return i.e(c17358c.metricsCache);
    }

    private final C0 k(EventRecord eventRecord) {
        return C15809k.d(this.coroutineScope, null, null, new e(eventRecord, null), 3, null);
    }

    @Override // u7.h
    public void a(JSONObject jsonObject, long startTimestamp, long duration, SessionInformationMetrics sessionInformationMetrics, boolean isApiReported, Object[] eventContext) throws JSONException {
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

    @Override // u7.h
    public void b(JSONObject jsonObject, long startTimestamp, SessionInformationMetrics sessionInformationMetrics, MetricsDataModel metricsData) throws JSONException {
        Intrinsics.j(jsonObject, "jsonObject");
        Intrinsics.j(sessionInformationMetrics, "sessionInformationMetrics");
        Intrinsics.j(metricsData, "metricsData");
        jsonObject.put("start_time", startTimestamp);
        jsonObject.put("duration", 0);
        jsonObject.remove("characteristics.is_api_reported");
        this.eventFlowGovernor.b(new C2593c(jsonObject, startTimestamp, sessionInformationMetrics, metricsData, null));
    }

    @Override // u7.h
    public void c(JSONObject jsonObject, SessionInformationMetrics sessionInformationMetrics, Object[] eventContext) {
        Intrinsics.j(jsonObject, "jsonObject");
        Intrinsics.j(sessionInformationMetrics, "sessionInformationMetrics");
        Object objOpt = jsonObject.opt("start_time");
        Object objOpt2 = jsonObject.opt("duration");
        if (!(objOpt instanceof Long) && !(objOpt instanceof Integer)) {
            z8.f.a("dtxDispatchingEvents", "The given JSON event must have a valid start_time! json: " + jsonObject);
            return;
        }
        if ((objOpt2 instanceof Long) || (objOpt2 instanceof Integer)) {
            this.eventFlowGovernor.b(new b(jsonObject, objOpt, sessionInformationMetrics, eventContext, null));
            return;
        }
        z8.f.a("dtxDispatchingEvents", "The given JSON event must have a valid duration! json: " + jsonObject);
    }
}
