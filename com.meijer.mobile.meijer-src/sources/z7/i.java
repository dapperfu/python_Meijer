package z7;

import A7.ServerDataUpdate;
import A7.a;
import G7.RetryInfo;
import I7.d;
import Y7.EndPointInfo;
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
import y7.InterfaceC18294a;
import z7.e;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010&\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001821\u0010%\u001a-\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0#\u0012\u0006\u0012\u0004\u0018\u00010$0\u001fH\u0082@¢\u0006\u0004\b&\u0010'J@\u0010+\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010.J(\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b1\u00102J>\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00107R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00109¨\u0006;"}, d2 = {"Lz7/i;", "Lz7/h;", "LY7/d;", "eventDatabase", "Ly7/a;", "timeProvider", "<init>", "(LY7/d;Ly7/a;)V", "LA7/c;", "serverDataUpdate", "Lz7/a;", "g", "(LA7/c;)Lz7/a;", "", "Lcom/dynatrace/agent/storage/db/EventRecord;", "sentData", "", "moreDataPending", "h", "(LA7/c;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LI7/d$a;", "response", "LY7/a;", "targetEndpoint", "Lz7/j;", "retryManager", "Lz7/e;", "nextRetryState", "i", "(LI7/d$a;LY7/a;Lz7/j;Lz7/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LI7/d$b;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "serverData", "Lkotlin/coroutines/Continuation;", "", "onValidConfig", "j", "(LI7/d$b;LY7/a;Lz7/j;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "disableTime", "commState", "k", "(JLz7/e;LY7/a;Lz7/j;LA7/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "()J", "LI7/d;", "configResponse", "b", "(LI7/d;LY7/a;Lz7/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dataResponse", "a", "(LI7/d;LY7/a;Ljava/util/List;Lz7/j;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LY7/d;", "Ly7/a;", "", "J", "lastConfigurationReceptionTimeMs", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Y7.d eventDatabase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18294a timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long lastConfigurationReceptionTimeMs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.ResponseProcessorImpl", f = "ResponseProcessorImpl.kt", l = {145}, m = "contextForValidDataRequestResponse")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f172585a;

        /* renamed from: b, reason: collision with root package name */
        boolean f172586b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f172587c;

        /* renamed from: e, reason: collision with root package name */
        int f172589e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f172587c = obj;
            this.f172589e |= Integer.MIN_VALUE;
            return i.this.h(null, null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA7/c;", "serverDataUpdate", "Lz7/a;", "<anonymous>", "(LA7/c;)Lz7/a;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.ResponseProcessorImpl$handleConfigResponse$2", f = "ResponseProcessorImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<ServerDataUpdate, Continuation<? super CommunicationContext>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172590a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f172591b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = i.this.new b(continuation);
            bVar.f172591b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ServerDataUpdate serverDataUpdate, Continuation<? super CommunicationContext> continuation) {
            return ((b) create(serverDataUpdate, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f172590a == 0) {
                ResultKt.b(obj);
                return i.this.g((ServerDataUpdate) this.f172591b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA7/c;", "serverDataUpdate", "Lz7/a;", "<anonymous>", "(LA7/c;)Lz7/a;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.ResponseProcessorImpl$handleDataResponse$2", f = "ResponseProcessorImpl.kt", l = {129}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<ServerDataUpdate, Continuation<? super CommunicationContext>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172593a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f172594b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<EventRecord> f172596d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f172597e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<EventRecord> list, boolean z10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f172596d = list;
            this.f172597e = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = i.this.new c(this.f172596d, this.f172597e, continuation);
            cVar.f172594b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ServerDataUpdate serverDataUpdate, Continuation<? super CommunicationContext> continuation) {
            return ((c) create(serverDataUpdate, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f172593a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ServerDataUpdate serverDataUpdate = (ServerDataUpdate) this.f172594b;
            i iVar = i.this;
            List<EventRecord> list = this.f172596d;
            boolean z10 = this.f172597e;
            this.f172593a = 1;
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
        long f172598a;

        /* renamed from: b, reason: collision with root package name */
        Object f172599b;

        /* renamed from: c, reason: collision with root package name */
        Object f172600c;

        /* renamed from: d, reason: collision with root package name */
        Object f172601d;

        /* renamed from: e, reason: collision with root package name */
        Object f172602e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172603f;

        /* renamed from: h, reason: collision with root package name */
        int f172605h;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f172603f = obj;
            this.f172605h |= Integer.MIN_VALUE;
            return i.this.k(0L, null, null, null, null, this);
        }
    }

    public i(Y7.d eventDatabase, InterfaceC18294a timeProvider) {
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
    public final java.lang.Object h(A7.ServerDataUpdate r11, java.util.List<com.dynatrace.agent.storage.db.EventRecord> r12, boolean r13, kotlin.coroutines.Continuation<? super z7.CommunicationContext> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof z7.i.a
            if (r0 == 0) goto L13
            r0 = r14
            z7.i$a r0 = (z7.i.a) r0
            int r1 = r0.f172589e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172589e = r1
            goto L18
        L13:
            z7.i$a r0 = new z7.i$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f172587c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f172589e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r13 = r0.f172586b
            java.lang.Object r11 = r0.f172585a
            A7.c r11 = (A7.ServerDataUpdate) r11
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
            Y7.d r14 = r10.eventDatabase
            r0.f172585a = r11
            r0.f172586b = r13
            r0.f172589e = r3
            java.lang.Object r12 = r14.a(r12, r0)
            if (r12 != r1) goto L2e
            return r1
        L4a:
            A7.a r11 = r8.getState()
            A7.a$a r12 = A7.a.C0006a.f178a
            boolean r11 = kotlin.jvm.internal.Intrinsics.e(r11, r12)
            if (r11 == 0) goto L6a
            java.lang.String r11 = "dtxCommunication"
            java.lang.String r12 = "response handling: disable agent due to AgentState in data response"
            z8.f.a(r11, r12)
            z7.a r4 = new z7.a
            long r5 = z7.k.b()
            z7.e$c r7 = z7.e.c.f172563a
            r9 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        L6a:
            if (r13 == 0) goto L7b
            z7.a r4 = new z7.a
            kotlin.time.Duration$Companion r11 = kotlin.time.Duration.INSTANCE
            long r5 = r11.c()
            z7.e$e r7 = z7.e.C2786e.f172565a
            r9 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        L7b:
            z7.a r4 = new z7.a
            long r5 = z7.d.a()
            z7.e$f r7 = new z7.e$f
            r11 = 0
            r7.<init>(r11, r3, r11)
            r9 = 0
            r4.<init>(r5, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.i.h(A7.c, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(long r6, z7.e r8, Y7.EndPointInfo r9, z7.j r10, A7.ServerDataUpdate r11, kotlin.coroutines.Continuation<? super z7.CommunicationContext> r12) {
        /*
            r5 = this;
            boolean r0 = r12 instanceof z7.i.d
            if (r0 == 0) goto L13
            r0 = r12
            z7.i$d r0 = (z7.i.d) r0
            int r1 = r0.f172605h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172605h = r1
            goto L18
        L13:
            z7.i$d r0 = new z7.i$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f172603f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f172605h
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            long r6 = r0.f172598a
            java.lang.Object r8 = r0.f172602e
            r11 = r8
            A7.c r11 = (A7.ServerDataUpdate) r11
            java.lang.Object r8 = r0.f172601d
            r10 = r8
            z7.j r10 = (z7.j) r10
            java.lang.Object r8 = r0.f172600c
            r9 = r8
            Y7.a r9 = (Y7.EndPointInfo) r9
            java.lang.Object r8 = r0.f172599b
            z7.e r8 = (z7.e) r8
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
            Y7.d r12 = r5.eventDatabase
            r0.f172599b = r8
            r0.f172600c = r9
            r0.f172601d = r10
            r0.f172602e = r11
            r0.f172598a = r6
            r0.f172605h = r3
            java.lang.Object r12 = r12.deleteAll(r0)
            if (r12 != r1) goto L3d
            return r1
        L62:
            r10.a(r6)
            z7.a r6 = new z7.a
            r10 = r11
            r11 = 0
            r6.<init>(r7, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.i.k(long, z7.e, Y7.a, z7.j, A7.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object l(i iVar, long j10, e eVar, EndPointInfo endPointInfo, j jVar, ServerDataUpdate serverDataUpdate, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = k.b();
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            eVar = e.c.f172563a;
        }
        return iVar.k(j11, eVar, endPointInfo, jVar, (i10 & 16) != 0 ? new ServerDataUpdate(a.C0006a.f178a, null, null) : serverDataUpdate, continuation);
    }

    @Override // z7.h
    public Object a(I7.d dVar, EndPointInfo endPointInfo, List<EventRecord> list, j jVar, boolean z10, Continuation<? super CommunicationContext> continuation) {
        if (dVar instanceof d.Retry) {
            return i((d.Retry) dVar, endPointInfo, jVar, new e.Waiting(e.b.f172559b), continuation);
        }
        if (dVar instanceof d.TooManyRequests) {
            return l(this, ((d.TooManyRequests) dVar).getDelay(), new e.ConfigAwaiting(e.b.f172560c), endPointInfo, jVar, null, continuation, 16, null);
        }
        if (dVar instanceof d.Success) {
            return j((d.Success) dVar, endPointInfo, jVar, new c(list, z10, null), continuation);
        }
        if (dVar instanceof d.C0229d) {
            return l(this, 0L, null, endPointInfo, jVar, null, continuation, 19, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // z7.h
    public Object b(I7.d dVar, EndPointInfo endPointInfo, j jVar, Continuation<? super CommunicationContext> continuation) {
        if (dVar instanceof d.Retry) {
            return i((d.Retry) dVar, endPointInfo, jVar, new e.ConfigAwaiting(e.b.f172559b), continuation);
        }
        if (dVar instanceof d.TooManyRequests) {
            return l(this, ((d.TooManyRequests) dVar).getDelay(), new e.ConfigAwaiting(e.b.f172560c), endPointInfo, jVar, null, continuation, 16, null);
        }
        if (dVar instanceof d.Success) {
            return j((d.Success) dVar, endPointInfo, jVar, new b(null), continuation);
        }
        if (dVar instanceof d.C0229d) {
            return l(this, 0L, null, endPointInfo, jVar, null, continuation, 19, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // z7.h
    public long c() {
        Duration.Companion companion = Duration.INSTANCE;
        long jA = this.timeProvider.a();
        DurationUnit durationUnit = DurationUnit.f148416d;
        return Duration.V(DurationKt.t(jA, durationUnit), DurationKt.t(this.lastConfigurationReceptionTimeMs, durationUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommunicationContext g(ServerDataUpdate serverDataUpdate) {
        if (!Intrinsics.e(serverDataUpdate.getState(), a.C0006a.f178a)) {
            return new CommunicationContext(Duration.INSTANCE.c(), new e.Waiting(null, 1, null), serverDataUpdate, null);
        }
        z8.f.a("dtxCommunication", "response handling: disable agent due to AgentState in config response");
        return new CommunicationContext(k.b(), e.c.f172563a, serverDataUpdate, null);
    }

    private final Object i(d.Retry retry, EndPointInfo endPointInfo, j jVar, e eVar, Continuation<? super CommunicationContext> continuation) {
        A7.a state;
        ServerDataUpdate serverDataUpdate = retry.getServerDataUpdate();
        ServerDataUpdate serverDataUpdateB = null;
        if (serverDataUpdate != null) {
            state = serverDataUpdate.getState();
        } else {
            state = null;
        }
        a.C0006a c0006a = a.C0006a.f178a;
        if (Intrinsics.e(state, c0006a)) {
            z8.f.a("dtxCommunication", "response handling: disable agent due to AgentState in " + retry);
            return l(this, 0L, null, endPointInfo, jVar, retry.getServerDataUpdate(), continuation, 3, null);
        }
        RetryInfo retryInfoC = jVar.c(endPointInfo, retry.getRetryReason());
        if (k.c(retryInfoC)) {
            z8.f.a("dtxCommunication", "response handling: disable agent due to max retry attempts reached");
            long jA = k.a(retryInfoC);
            if (retry.getServerDataUpdate() != null) {
                serverDataUpdateB = ServerDataUpdate.b(retry.getServerDataUpdate(), c0006a, null, null, 6, null);
            }
            return l(this, jA, null, endPointInfo, jVar, serverDataUpdateB, continuation, 2, null);
        }
        return new CommunicationContext(k.a(retryInfoC), eVar, retry.getServerDataUpdate(), null);
    }

    private final Object j(d.Success success, EndPointInfo endPointInfo, j jVar, Function2<? super ServerDataUpdate, ? super Continuation<? super CommunicationContext>, ? extends Object> function2, Continuation<? super CommunicationContext> continuation) {
        jVar.a(endPointInfo);
        this.lastConfigurationReceptionTimeMs = this.timeProvider.a();
        z8.f.a("dtxCommunication", "response handling: updated last config reception time: " + this.lastConfigurationReceptionTimeMs);
        return function2.invoke(success.getServerDataUpdate(), continuation);
    }
}
