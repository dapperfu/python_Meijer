package x7;

import Z7.ServerConfigurationV4;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import k8.q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import qv.AbstractC16618K;
import qv.C16648k;
import qv.InterfaceC16622O;
import x7.e;
import y7.AbstractC18186a;
import y7.InterfaceC18187b;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010?R$\u0010E\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010B\u001a\u0004\b;\u0010C\"\u0004\b$\u0010D¨\u0006F"}, d2 = {"Lx7/c;", "Lx7/b;", "LD7/c;", "networkDataSource", "Lqv/K;", "coroutineDispatcher", "LH7/b;", "dispatchableDataProvider", "Lx7/h;", "responseProcessor", "Ly7/b;", "serverDataListener", "Lqv/O;", "coroutineScope", "<init>", "(LD7/c;Lqv/K;LH7/b;Lx7/h;Ly7/b;Lqv/O;)V", "Lx7/a;", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "LZ7/j;", "config", "Lk8/q;", "configV3", "", "a", "(LZ7/j;Lk8/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(Lk8/q;)V", "communicationContext", "m", "(Lx7/a;)V", "b", "()V", "LD7/c;", "Lqv/K;", "c", "LH7/b;", "Lx7/h;", "e", "Ly7/b;", "f", "Lqv/O;", "Lx7/g;", "g", "Lx7/g;", "dispatchScheduler", "Lx7/j;", "h", "Lx7/j;", "retryManager", "LB7/b;", "i", "LB7/b;", "requestBodyMapper", "LH7/d;", "LH7/d;", "toDataRequestMapper", "Lx7/e;", "k", "Lx7/e;", "currentCommunicationState", "Lx7/l;", "Lx7/l;", "serverDataMaintainer", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "serverId", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements x7.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D7.c networkDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K coroutineDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final H7.b dispatchableDataProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h responseProcessor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18187b serverDataListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g dispatchScheduler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final j retryManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final B7.b requestBodyMapper;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final H7.d toDataRequestMapper;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private x7.e currentCommunicationState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private l serverDataMaintainer;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private volatile Integer serverId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl", f = "CommunicationManagerImpl.kt", l = {196, HttpResponseStatus.SUCCESS_ACCEPTED, HttpResponseStatus.SUCCESS_NO_CONTENT}, m = "dispatchData")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f169382a;

        /* renamed from: b, reason: collision with root package name */
        Object f169383b;

        /* renamed from: c, reason: collision with root package name */
        Object f169384c;

        /* renamed from: d, reason: collision with root package name */
        boolean f169385d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f169386e;

        /* renamed from: g, reason: collision with root package name */
        int f169388g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f169386e = obj;
            this.f169388g |= Integer.MIN_VALUE;
            return c.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl", f = "CommunicationManagerImpl.kt", l = {180, 179}, m = "obtainConfiguration")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f169389a;

        /* renamed from: b, reason: collision with root package name */
        Object f169390b;

        /* renamed from: c, reason: collision with root package name */
        Object f169391c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f169392d;

        /* renamed from: f, reason: collision with root package name */
        int f169394f;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f169392d = obj;
            this.f169394f |= Integer.MIN_VALUE;
            return c.this.l(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$scheduleNextCommunicationAttempt$1", f = "CommunicationManagerImpl.kt", l = {126}, m = "invokeSuspend")
    /* renamed from: x7.c$c, reason: collision with other inner class name */
    static final class C2716c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169395a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CommunicationContext f169397c;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$scheduleNextCommunicationAttempt$1$1", f = "CommunicationManagerImpl.kt", l = {129, 134, 135, 139, 160}, m = "invokeSuspend")
        /* renamed from: x7.c$c$a */
        static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f169398a;

            /* renamed from: b, reason: collision with root package name */
            int f169399b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CommunicationContext f169400c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f169401d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CommunicationContext communicationContext, c cVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f169400c = communicationContext;
                this.f169401d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new a(this.f169400c, this.f169401d, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
            
                if (r15 != r0) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
            
                if (r15 == r0) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
            
                if (r15 == r0) goto L59;
             */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 251
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: x7.c.C2716c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2716c(CommunicationContext communicationContext, Continuation<? super C2716c> continuation) {
            super(2, continuation);
            this.f169397c = communicationContext;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new C2716c(this.f169397c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C2716c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169395a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g gVar = c.this.dispatchScheduler;
                long waitingTime = this.f169397c.getWaitingTime();
                a aVar = new a(this.f169397c, c.this, null);
                this.f169395a = 1;
                if (gVar.a(waitingTime, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$stopCommunication$1", f = "CommunicationManagerImpl.kt", l = {171}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169402a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169402a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g gVar = c.this.dispatchScheduler;
                this.f169402a = 1;
                if (gVar.b(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$updateV3Config$1", f = "CommunicationManagerImpl.kt", l = {85}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169404a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f169406c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(q qVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f169406c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new e(this.f169406c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169404a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                l lVar = c.this.serverDataMaintainer;
                if (lVar == null) {
                    Intrinsics.y("serverDataMaintainer");
                    lVar = null;
                }
                q qVar = this.f169406c;
                this.f169404a = 1;
                if (lVar.e(qVar, this) == objF) {
                    return objF;
                }
            }
            x8.f.a("dtxCommunication", "received external config v3 update: " + this.f169406c);
            return Unit.f142422a;
        }
    }

    public c(D7.c networkDataSource, AbstractC16618K coroutineDispatcher, H7.b dispatchableDataProvider, h responseProcessor, InterfaceC18187b serverDataListener, InterfaceC16622O coroutineScope) {
        Intrinsics.j(networkDataSource, "networkDataSource");
        Intrinsics.j(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.j(dispatchableDataProvider, "dispatchableDataProvider");
        Intrinsics.j(responseProcessor, "responseProcessor");
        Intrinsics.j(serverDataListener, "serverDataListener");
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.networkDataSource = networkDataSource;
        this.coroutineDispatcher = coroutineDispatcher;
        this.dispatchableDataProvider = dispatchableDataProvider;
        this.responseProcessor = responseProcessor;
        this.serverDataListener = serverDataListener;
        this.coroutineScope = coroutineScope;
        this.dispatchScheduler = new g(coroutineScope, coroutineDispatcher);
        j jVar = new j();
        this.retryManager = jVar;
        B7.b bVar = new B7.b(1);
        this.requestBodyMapper = bVar;
        this.toDataRequestMapper = new H7.d(bVar, jVar);
        this.currentCommunicationState = e.d.f169415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation<? super x7.CommunicationContext> r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.c.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation<? super x7.CommunicationContext> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof x7.c.b
            if (r0 == 0) goto L13
            r0 = r12
            x7.c$b r0 = (x7.c.b) r0
            int r1 = r0.f169394f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169394f = r1
            goto L18
        L13:
            x7.c$b r0 = new x7.c$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f169392d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f169394f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r12)
            return r12
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            java.lang.Object r2 = r0.f169391c
            x7.h r2 = (x7.h) r2
            java.lang.Object r4 = r0.f169390b
            W7.a r4 = (W7.EndPointInfo) r4
            java.lang.Object r6 = r0.f169389a
            x7.c r6 = (x7.c) r6
            kotlin.ResultKt.b(r12)
            goto L82
        L45:
            kotlin.ResultKt.b(r12)
            H7.b r12 = r11.dispatchableDataProvider
            W7.a r12 = r12.getActiveEndpoint()
            x7.h r2 = r11.responseProcessor
            D7.c r6 = r11.networkDataSource
            D7.a r7 = new D7.a
            x7.l r8 = r11.serverDataMaintainer
            if (r8 != 0) goto L5e
            java.lang.String r8 = "serverDataMaintainer"
            kotlin.jvm.internal.Intrinsics.y(r8)
            r8 = r5
        L5e:
            x7.f r8 = r8.b()
            x7.j r9 = r11.retryManager
            E7.a r9 = r9.b(r12)
            java.lang.Integer r10 = r11.getServerId()
            r7.<init>(r12, r8, r9, r10)
            r0.f169389a = r11
            r0.f169390b = r12
            r0.f169391c = r2
            r0.f169394f = r4
            java.lang.Object r4 = r6.b(r7, r0)
            if (r4 != r1) goto L7e
            goto L94
        L7e:
            r6 = r4
            r4 = r12
            r12 = r6
            r6 = r11
        L82:
            G7.d r12 = (G7.d) r12
            x7.j r6 = r6.retryManager
            r0.f169389a = r5
            r0.f169390b = r5
            r0.f169391c = r5
            r0.f169394f = r3
            java.lang.Object r12 = r2.c(r12, r4, r6, r0)
            if (r12 != r1) goto L95
        L94:
            return r1
        L95:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.c.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // x7.b
    public Object a(ServerConfigurationV4 serverConfigurationV4, q qVar, Continuation<? super Unit> continuation) {
        LocalServerData localServerData = new LocalServerData(AbstractC18186a.C2744a.f170329a, serverConfigurationV4, qVar);
        x8.f.a("dtxCommunication", "launching BPv4 communication with initial " + localServerData);
        this.serverDataMaintainer = new l(localServerData, this.serverDataListener);
        m(new CommunicationContext(Duration.INSTANCE.c(), new e.ConfigAwaiting(e.b.f169409a), null, null));
        return Unit.f142422a;
    }

    @Override // x7.b
    public void b() {
        C16648k.d(this.coroutineScope, this.coroutineDispatcher, null, new d(null), 2, null);
        this.currentCommunicationState = e.d.f169415a;
        x8.f.a("dtxCommunication", "terminated agent communication");
    }

    @Override // x7.b
    public void c(Integer num) {
        this.serverId = num;
    }

    @Override // x7.b
    public void d(q config) {
        Intrinsics.j(config, "config");
        if (this.serverDataMaintainer != null) {
            C16648k.d(this.coroutineScope, this.coroutineDispatcher, null, new e(config, null), 2, null);
        }
    }

    /* renamed from: k, reason: from getter */
    public Integer getServerId() {
        return this.serverId;
    }

    public final void m(CommunicationContext communicationContext) {
        Intrinsics.j(communicationContext, "communicationContext");
        x8.f.a("dtxCommunication", "heartbeat: next communication attempt scheduled with " + communicationContext);
        this.currentCommunicationState = communicationContext.getCommState();
        if (communicationContext.getCommState() instanceof e.d) {
            return;
        }
        C16648k.d(this.coroutineScope, this.coroutineDispatcher, null, new C2716c(communicationContext, null), 2, null);
    }
}
