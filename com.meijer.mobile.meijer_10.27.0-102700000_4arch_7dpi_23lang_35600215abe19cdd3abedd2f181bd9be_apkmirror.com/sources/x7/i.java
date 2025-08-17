package x7;

import E7.RetryInfo;
import G7.d;
import W7.EndPointInfo;
import com.dynatrace.agent.storage.db.EventRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import w7.InterfaceC17801a;
import x7.e;
import y7.AbstractC18186a;
import y7.ServerDataUpdate;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010&\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001821\u0010%\u001a-\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#\u0012\u0006\u0012\u0004\u0018\u00010$0\u001fH\u0082@¢\u0006\u0004\b&\u0010'J@\u0010+\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010.J(\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b1\u00102J>\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00107R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00109¨\u0006;"}, d2 = {"Lx7/i;", "Lx7/h;", "LW7/d;", "eventDatabase", "Lw7/a;", "timeProvider", "<init>", "(LW7/d;Lw7/a;)V", "Ly7/c;", "serverDataUpdate", "Lx7/a;", "g", "(Ly7/c;)Lx7/a;", "", "Lcom/dynatrace/agent/storage/db/EventRecord;", "sentData", "", "moreDataPending", "h", "(Ly7/c;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LG7/d$a;", "response", "LW7/a;", "targetEndpoint", "Lx7/j;", "retryManager", "Lx7/e;", "nextRetryState", "i", "(LG7/d$a;LW7/a;Lx7/j;Lx7/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LG7/d$b;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "serverData", "Lkotlin/coroutines/Continuation;", "", "onValidConfig", "j", "(LG7/d$b;LW7/a;Lx7/j;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "disableTime", "commState", "k", "(JLx7/e;LW7/a;Lx7/j;Ly7/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()J", "LG7/d;", "configResponse", "c", "(LG7/d;LW7/a;Lx7/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dataResponse", "a", "(LG7/d;LW7/a;Ljava/util/List;Lx7/j;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LW7/d;", "Lw7/a;", "", "J", "lastConfigurationReceptionTimeMs", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W7.d eventDatabase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long lastConfigurationReceptionTimeMs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.ResponseProcessorImpl", f = "ResponseProcessorImpl.kt", l = {145}, m = "contextForValidDataRequestResponse")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f169436a;

        /* renamed from: b, reason: collision with root package name */
        boolean f169437b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f169438c;

        /* renamed from: e, reason: collision with root package name */
        int f169440e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f169438c = obj;
            this.f169440e |= Integer.MIN_VALUE;
            return i.this.h(null, null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly7/c;", "serverDataUpdate", "Lx7/a;", "<anonymous>", "(Ly7/c;)Lx7/a;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.ResponseProcessorImpl$handleConfigResponse$2", f = "ResponseProcessorImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<ServerDataUpdate, Continuation<? super CommunicationContext>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169441a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f169442b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = i.this.new b(continuation);
            bVar.f169442b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ServerDataUpdate serverDataUpdate, Continuation<? super CommunicationContext> continuation) {
            return ((b) create(serverDataUpdate, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f169441a == 0) {
                ResultKt.b(obj);
                return i.this.g((ServerDataUpdate) this.f169442b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly7/c;", "serverDataUpdate", "Lx7/a;", "<anonymous>", "(Ly7/c;)Lx7/a;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.ResponseProcessorImpl$handleDataResponse$2", f = "ResponseProcessorImpl.kt", l = {129}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<ServerDataUpdate, Continuation<? super CommunicationContext>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169444a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f169445b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<EventRecord> f169447d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f169448e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<EventRecord> list, boolean z10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f169447d = list;
            this.f169448e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = i.this.new c(this.f169447d, this.f169448e, continuation);
            cVar.f169445b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ServerDataUpdate serverDataUpdate, Continuation<? super CommunicationContext> continuation) {
            return ((c) create(serverDataUpdate, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169444a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ServerDataUpdate serverDataUpdate = (ServerDataUpdate) this.f169445b;
            i iVar = i.this;
            List<EventRecord> list = this.f169447d;
            boolean z10 = this.f169448e;
            this.f169444a = 1;
            Object objH = iVar.h(serverDataUpdate, list, z10, this);
            if (objH == objF) {
                return objF;
            }
            return objH;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.ResponseProcessorImpl", f = "ResponseProcessorImpl.kt", l = {235}, m = "obtainDisabledContext-bz6L7rs")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f169449a;

        /* renamed from: b, reason: collision with root package name */
        Object f169450b;

        /* renamed from: c, reason: collision with root package name */
        Object f169451c;

        /* renamed from: d, reason: collision with root package name */
        Object f169452d;

        /* renamed from: e, reason: collision with root package name */
        Object f169453e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f169454f;

        /* renamed from: h, reason: collision with root package name */
        int f169456h;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f169454f = obj;
            this.f169456h |= Integer.MIN_VALUE;
            return i.this.k(0L, null, null, null, null, this);
        }
    }

    public i(W7.d eventDatabase, InterfaceC17801a timeProvider) {
        Intrinsics.j(eventDatabase, "eventDatabase");
        Intrinsics.j(timeProvider, "timeProvider");
        this.eventDatabase = eventDatabase;
        this.timeProvider = timeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(y7.ServerDataUpdate r11, java.util.List<com.dynatrace.agent.storage.db.EventRecord> r12, boolean r13, kotlin.coroutines.Continuation<? super x7.CommunicationContext> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof x7.i.a
            if (r0 == 0) goto L13
            r0 = r14
            x7.i$a r0 = (x7.i.a) r0
            int r1 = r0.f169440e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169440e = r1
            goto L18
        L13:
            x7.i$a r0 = new x7.i$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f169438c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f169440e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r13 = r0.f169437b
            java.lang.Object r11 = r0.f169436a
            y7.c r11 = (y7.ServerDataUpdate) r11
            kotlin.ResultKt.b(r14)
        L2e:
            r8 = r11
            goto L4a
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            kotlin.ResultKt.b(r14)
            W7.d r14 = r10.eventDatabase
            r0.f169436a = r11
            r0.f169437b = r13
            r0.f169440e = r3
            java.lang.Object r12 = r14.a(r12, r0)
            if (r12 != r1) goto L2e
            return r1
        L4a:
            y7.a r11 = r8.getState()
            y7.a$a r12 = y7.AbstractC18186a.C2744a.f170329a
            boolean r11 = kotlin.jvm.internal.Intrinsics.e(r11, r12)
            if (r11 == 0) goto L6a
            java.lang.String r11 = "dtxCommunication"
            java.lang.String r12 = "response handling: disable agent due to AgentState in data response"
            x8.f.a(r11, r12)
            x7.a r4 = new x7.a
            long r5 = x7.k.b()
            x7.e$c r7 = x7.e.c.f169414a
            r9 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        L6a:
            if (r13 == 0) goto L7b
            x7.a r4 = new x7.a
            kotlin.time.Duration$Companion r11 = kotlin.time.Duration.INSTANCE
            long r5 = r11.c()
            x7.e$e r7 = x7.e.C2717e.f169416a
            r9 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        L7b:
            x7.a r4 = new x7.a
            long r5 = x7.d.a()
            x7.e$f r7 = new x7.e$f
            r11 = 0
            r7.<init>(r11, r3, r11)
            r9 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.i.h(y7.c, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(long r6, x7.e r8, W7.EndPointInfo r9, x7.j r10, y7.ServerDataUpdate r11, kotlin.coroutines.Continuation<? super x7.CommunicationContext> r12) {
        /*
            r5 = this;
            boolean r0 = r12 instanceof x7.i.d
            if (r0 == 0) goto L13
            r0 = r12
            x7.i$d r0 = (x7.i.d) r0
            int r1 = r0.f169456h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169456h = r1
            goto L18
        L13:
            x7.i$d r0 = new x7.i$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f169454f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f169456h
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            long r6 = r0.f169449a
            java.lang.Object r8 = r0.f169453e
            r11 = r8
            y7.c r11 = (y7.ServerDataUpdate) r11
            java.lang.Object r8 = r0.f169452d
            r10 = r8
            x7.j r10 = (x7.j) r10
            java.lang.Object r8 = r0.f169451c
            r9 = r8
            W7.a r9 = (W7.EndPointInfo) r9
            java.lang.Object r8 = r0.f169450b
            x7.e r8 = (x7.e) r8
            kotlin.ResultKt.b(r12)
        L3d:
            r4 = r9
            r9 = r8
            r7 = r6
            r6 = r4
            goto L62
        L42:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4a:
            kotlin.ResultKt.b(r12)
            W7.d r12 = r5.eventDatabase
            r0.f169450b = r8
            r0.f169451c = r9
            r0.f169452d = r10
            r0.f169453e = r11
            r0.f169449a = r6
            r0.f169456h = r3
            java.lang.Object r12 = r12.c(r0)
            if (r12 != r1) goto L3d
            return r1
        L62:
            r10.a(r6)
            x7.a r6 = new x7.a
            r10 = r11
            r11 = 0
            r6.<init>(r7, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.i.k(long, x7.e, W7.a, x7.j, y7.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object l(i iVar, long j10, e eVar, EndPointInfo endPointInfo, j jVar, ServerDataUpdate serverDataUpdate, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = k.b();
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            eVar = e.c.f169414a;
        }
        return iVar.k(j11, eVar, endPointInfo, jVar, (i10 & 16) != 0 ? new ServerDataUpdate(AbstractC18186a.C2744a.f170329a, null, null) : serverDataUpdate, continuation);
    }

    @Override // x7.h
    public Object a(G7.d dVar, EndPointInfo endPointInfo, List<EventRecord> list, j jVar, boolean z10, Continuation<? super CommunicationContext> continuation) {
        if (dVar instanceof d.Retry) {
            return i((d.Retry) dVar, endPointInfo, jVar, new e.Waiting(e.b.f169410b), continuation);
        }
        if (dVar instanceof d.TooManyRequests) {
            return l(this, ((d.TooManyRequests) dVar).getDelay(), new e.ConfigAwaiting(e.b.f169411c), endPointInfo, jVar, null, continuation, 16, null);
        }
        if (dVar instanceof d.Success) {
            return j((d.Success) dVar, endPointInfo, jVar, new c(list, z10, null), continuation);
        }
        if (dVar instanceof d.C0160d) {
            return l(this, 0L, null, endPointInfo, jVar, null, continuation, 19, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // x7.h
    public long b() {
        Duration.Companion companion = Duration.INSTANCE;
        long jA = this.timeProvider.a();
        DurationUnit durationUnit = DurationUnit.f147508d;
        return Duration.V(DurationKt.t(jA, durationUnit), DurationKt.t(this.lastConfigurationReceptionTimeMs, durationUnit));
    }

    @Override // x7.h
    public Object c(G7.d dVar, EndPointInfo endPointInfo, j jVar, Continuation<? super CommunicationContext> continuation) {
        if (dVar instanceof d.Retry) {
            return i((d.Retry) dVar, endPointInfo, jVar, new e.ConfigAwaiting(e.b.f169410b), continuation);
        }
        if (dVar instanceof d.TooManyRequests) {
            return l(this, ((d.TooManyRequests) dVar).getDelay(), new e.ConfigAwaiting(e.b.f169411c), endPointInfo, jVar, null, continuation, 16, null);
        }
        if (dVar instanceof d.Success) {
            return j((d.Success) dVar, endPointInfo, jVar, new b(null), continuation);
        }
        if (dVar instanceof d.C0160d) {
            return l(this, 0L, null, endPointInfo, jVar, null, continuation, 19, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommunicationContext g(ServerDataUpdate serverDataUpdate) {
        if (!Intrinsics.e(serverDataUpdate.getState(), AbstractC18186a.C2744a.f170329a)) {
            return new CommunicationContext(Duration.INSTANCE.c(), new e.Waiting(null, 1, null), serverDataUpdate, null);
        }
        x8.f.a("dtxCommunication", "response handling: disable agent due to AgentState in config response");
        return new CommunicationContext(k.b(), e.c.f169414a, serverDataUpdate, null);
    }

    private final Object i(d.Retry retry, EndPointInfo endPointInfo, j jVar, e eVar, Continuation<? super CommunicationContext> continuation) {
        AbstractC18186a state;
        ServerDataUpdate serverDataUpdate = retry.getServerDataUpdate();
        ServerDataUpdate serverDataUpdateB = null;
        if (serverDataUpdate != null) {
            state = serverDataUpdate.getState();
        } else {
            state = null;
        }
        AbstractC18186a.C2744a c2744a = AbstractC18186a.C2744a.f170329a;
        if (Intrinsics.e(state, c2744a)) {
            x8.f.a("dtxCommunication", "response handling: disable agent due to AgentState in " + retry);
            return l(this, 0L, null, endPointInfo, jVar, retry.getServerDataUpdate(), continuation, 3, null);
        }
        RetryInfo retryInfoC = jVar.c(endPointInfo, retry.getRetryReason());
        if (k.c(retryInfoC)) {
            x8.f.a("dtxCommunication", "response handling: disable agent due to max retry attempts reached");
            long jA = k.a(retryInfoC);
            if (retry.getServerDataUpdate() != null) {
                serverDataUpdateB = ServerDataUpdate.b(retry.getServerDataUpdate(), c2744a, null, null, 6, null);
            }
            return l(this, jA, null, endPointInfo, jVar, serverDataUpdateB, continuation, 2, null);
        }
        return new CommunicationContext(k.a(retryInfoC), eVar, retry.getServerDataUpdate(), null);
    }

    private final Object j(d.Success success, EndPointInfo endPointInfo, j jVar, Function2<? super ServerDataUpdate, ? super Continuation<? super CommunicationContext>, ? extends Object> function2, Continuation<? super CommunicationContext> continuation) {
        jVar.a(endPointInfo);
        this.lastConfigurationReceptionTimeMs = this.timeProvider.a();
        x8.f.a("dtxCommunication", "response handling: updated last config reception time: " + this.lastConfigurationReceptionTimeMs);
        return function2.invoke(success.getServerDataUpdate(), continuation);
    }
}
