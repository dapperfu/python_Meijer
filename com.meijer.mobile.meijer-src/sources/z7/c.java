package z7;

import A7.a;
import b8.ServerConfigurationV4;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
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
import m8.q;
import mv.AbstractC15779K;
import mv.C15809k;
import mv.InterfaceC15783O;
import z7.e;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010?R$\u0010E\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010B\u001a\u0004\b;\u0010C\"\u0004\b$\u0010D¨\u0006F"}, d2 = {"Lz7/c;", "Lz7/b;", "LF7/c;", "networkDataSource", "Lmv/K;", "coroutineDispatcher", "LJ7/b;", "dispatchableDataProvider", "Lz7/h;", "responseProcessor", "LA7/b;", "serverDataListener", "Lmv/O;", "coroutineScope", "<init>", "(LF7/c;Lmv/K;LJ7/b;Lz7/h;LA7/b;Lmv/O;)V", "Lz7/a;", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "Lb8/j;", "config", "Lm8/q;", "configV3", "", "d", "(Lb8/j;Lm8/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lm8/q;)V", "communicationContext", "m", "(Lz7/a;)V", "b", "()V", "LF7/c;", "Lmv/K;", "c", "LJ7/b;", "Lz7/h;", "e", "LA7/b;", "f", "Lmv/O;", "Lz7/g;", "g", "Lz7/g;", "dispatchScheduler", "Lz7/j;", "h", "Lz7/j;", "retryManager", "LD7/b;", "i", "LD7/b;", "requestBodyMapper", "LJ7/d;", "LJ7/d;", "toDataRequestMapper", "Lz7/e;", "k", "Lz7/e;", "currentCommunicationState", "Lz7/l;", "Lz7/l;", "serverDataMaintainer", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "serverId", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements InterfaceC18459b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final F7.c networkDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K coroutineDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final J7.b dispatchableDataProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h responseProcessor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final A7.b serverDataListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g dispatchScheduler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final j retryManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final D7.b requestBodyMapper;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final J7.d toDataRequestMapper;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private z7.e currentCommunicationState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private l serverDataMaintainer;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private volatile Integer serverId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl", f = "CommunicationManagerImpl.kt", l = {196, HttpResponseStatus.SUCCESS_ACCEPTED, HttpResponseStatus.SUCCESS_NO_CONTENT}, m = "dispatchData")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f172531a;

        /* renamed from: b, reason: collision with root package name */
        Object f172532b;

        /* renamed from: c, reason: collision with root package name */
        Object f172533c;

        /* renamed from: d, reason: collision with root package name */
        boolean f172534d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f172535e;

        /* renamed from: g, reason: collision with root package name */
        int f172537g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f172535e = obj;
            this.f172537g |= Integer.MIN_VALUE;
            return c.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl", f = "CommunicationManagerImpl.kt", l = {180, 179}, m = "obtainConfiguration")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f172538a;

        /* renamed from: b, reason: collision with root package name */
        Object f172539b;

        /* renamed from: c, reason: collision with root package name */
        Object f172540c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f172541d;

        /* renamed from: f, reason: collision with root package name */
        int f172543f;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f172541d = obj;
            this.f172543f |= Integer.MIN_VALUE;
            return c.this.l(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$scheduleNextCommunicationAttempt$1", f = "CommunicationManagerImpl.kt", l = {126}, m = "invokeSuspend")
    /* renamed from: z7.c$c, reason: collision with other inner class name */
    static final class C2785c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172544a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CommunicationContext f172546c;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$scheduleNextCommunicationAttempt$1$1", f = "CommunicationManagerImpl.kt", l = {129, 134, 135, 139, 160}, m = "invokeSuspend")
        /* renamed from: z7.c$c$a */
        static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f172547a;

            /* renamed from: b, reason: collision with root package name */
            int f172548b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CommunicationContext f172549c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f172550d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CommunicationContext communicationContext, c cVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f172549c = communicationContext;
                this.f172550d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new a(this.f172549c, this.f172550d, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.f143329a);
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
                throw new UnsupportedOperationException("Method not decompiled: z7.c.C2785c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2785c(CommunicationContext communicationContext, Continuation<? super C2785c> continuation) {
            super(2, continuation);
            this.f172546c = communicationContext;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new C2785c(this.f172546c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C2785c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f172544a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g gVar = c.this.dispatchScheduler;
                long waitingTime = this.f172546c.getWaitingTime();
                a aVar = new a(this.f172546c, c.this, null);
                this.f172544a = 1;
                if (gVar.a(waitingTime, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$stopCommunication$1", f = "CommunicationManagerImpl.kt", l = {171}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172551a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f172551a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g gVar = c.this.dispatchScheduler;
                this.f172551a = 1;
                if (gVar.b(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.CommunicationManagerImpl$updateV3Config$1", f = "CommunicationManagerImpl.kt", l = {85}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f172553a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f172555c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(q qVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f172555c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new e(this.f172555c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f172553a;
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
                    Intrinsics.x("serverDataMaintainer");
                    lVar = null;
                }
                q qVar = this.f172555c;
                this.f172553a = 1;
                if (lVar.e(qVar, this) == objF) {
                    return objF;
                }
            }
            z8.f.a("dtxCommunication", "received external config v3 update: " + this.f172555c);
            return Unit.f143329a;
        }
    }

    public c(F7.c networkDataSource, AbstractC15779K coroutineDispatcher, J7.b dispatchableDataProvider, h responseProcessor, A7.b serverDataListener, InterfaceC15783O coroutineScope) {
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
        D7.b bVar = new D7.b(1);
        this.requestBodyMapper = bVar;
        this.toDataRequestMapper = new J7.d(bVar, jVar);
        this.currentCommunicationState = e.d.f172564a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation<? super z7.CommunicationContext> r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.c.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation<? super z7.CommunicationContext> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof z7.c.b
            if (r0 == 0) goto L13
            r0 = r12
            z7.c$b r0 = (z7.c.b) r0
            int r1 = r0.f172543f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172543f = r1
            goto L18
        L13:
            z7.c$b r0 = new z7.c$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f172541d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f172543f
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
            java.lang.Object r2 = r0.f172540c
            z7.h r2 = (z7.h) r2
            java.lang.Object r4 = r0.f172539b
            Y7.a r4 = (Y7.EndPointInfo) r4
            java.lang.Object r6 = r0.f172538a
            z7.c r6 = (z7.c) r6
            kotlin.ResultKt.b(r12)
            goto L82
        L45:
            kotlin.ResultKt.b(r12)
            J7.b r12 = r11.dispatchableDataProvider
            Y7.a r12 = r12.getActiveEndpoint()
            z7.h r2 = r11.responseProcessor
            F7.c r6 = r11.networkDataSource
            F7.a r7 = new F7.a
            z7.l r8 = r11.serverDataMaintainer
            if (r8 != 0) goto L5e
            java.lang.String r8 = "serverDataMaintainer"
            kotlin.jvm.internal.Intrinsics.x(r8)
            r8 = r5
        L5e:
            z7.f r8 = r8.b()
            z7.j r9 = r11.retryManager
            G7.a r9 = r9.b(r12)
            java.lang.Integer r10 = r11.getServerId()
            r7.<init>(r12, r8, r9, r10)
            r0.f172538a = r11
            r0.f172539b = r12
            r0.f172540c = r2
            r0.f172543f = r4
            java.lang.Object r4 = r6.b(r7, r0)
            if (r4 != r1) goto L7e
            goto L94
        L7e:
            r6 = r4
            r4 = r12
            r12 = r6
            r6 = r11
        L82:
            I7.d r12 = (I7.d) r12
            z7.j r6 = r6.retryManager
            r0.f172538a = r5
            r0.f172539b = r5
            r0.f172540c = r5
            r0.f172543f = r3
            java.lang.Object r12 = r2.b(r12, r4, r6, r0)
            if (r12 != r1) goto L95
        L94:
            return r1
        L95:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.c.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // z7.InterfaceC18459b
    public void a(q config) {
        Intrinsics.j(config, "config");
        if (this.serverDataMaintainer != null) {
            C15809k.d(this.coroutineScope, this.coroutineDispatcher, null, new e(config, null), 2, null);
        }
    }

    @Override // z7.InterfaceC18459b
    public void b() {
        C15809k.d(this.coroutineScope, this.coroutineDispatcher, null, new d(null), 2, null);
        this.currentCommunicationState = e.d.f172564a;
        z8.f.a("dtxCommunication", "terminated agent communication");
    }

    @Override // z7.InterfaceC18459b
    public void c(Integer num) {
        this.serverId = num;
    }

    @Override // z7.InterfaceC18459b
    public Object d(ServerConfigurationV4 serverConfigurationV4, q qVar, Continuation<? super Unit> continuation) {
        LocalServerData localServerData = new LocalServerData(a.C0006a.f178a, serverConfigurationV4, qVar);
        z8.f.a("dtxCommunication", "launching BPv4 communication with initial " + localServerData);
        this.serverDataMaintainer = new l(localServerData, this.serverDataListener);
        m(new CommunicationContext(Duration.INSTANCE.c(), new e.ConfigAwaiting(e.b.f172558a), null, null));
        return Unit.f143329a;
    }

    /* renamed from: k, reason: from getter */
    public Integer getServerId() {
        return this.serverId;
    }

    public final void m(CommunicationContext communicationContext) {
        Intrinsics.j(communicationContext, "communicationContext");
        z8.f.a("dtxCommunication", "heartbeat: next communication attempt scheduled with " + communicationContext);
        this.currentCommunicationState = communicationContext.getCommState();
        if (communicationContext.getCommState() instanceof e.d) {
            return;
        }
        C15809k.d(this.coroutineScope, this.coroutineDispatcher, null, new C2785c(communicationContext, null), 2, null);
    }
}
