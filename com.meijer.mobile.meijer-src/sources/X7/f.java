package X7;

import K7.j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import mv.C0;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LX7/f;", "", "LK7/j;", "sessionProvider", "LK7/g;", "metricsUpdater", "Lb8/g;", "metricsRepository", "Lkotlin/time/Duration;", "interval", "Lmv/O;", "coroutineScope", "<init>", "(LK7/j;LK7/g;Lb8/g;JLmv/O;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "d", "()V", "a", "LK7/j;", "LK7/g;", "Lb8/g;", "J", "e", "Lmv/O;", "Lmv/C0;", "f", "Lmv/C0;", "job", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j sessionProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final K7.g metricsUpdater;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b8.g metricsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long interval;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C0 job;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.metrics.PeriodicMetricsStorageWorker", f = "PeriodicMetricsStorageWorker.kt", l = {64, 65}, m = "run")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41686a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41687b;

        /* renamed from: d, reason: collision with root package name */
        int f41689d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41687b = obj;
            this.f41689d |= Integer.MIN_VALUE;
            return f.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.metrics.PeriodicMetricsStorageWorker$start$1", f = "PeriodicMetricsStorageWorker.kt", l = {41}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f41690a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f41690a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                f fVar = f.this;
                this.f41690a = 1;
                if (fVar.c(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public /* synthetic */ f(j jVar, K7.g gVar, b8.g gVar2, long j10, InterfaceC15783O interfaceC15783O, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, gVar, gVar2, j10, interfaceC15783O);
    }

    private f(j sessionProvider, K7.g metricsUpdater, b8.g metricsRepository, long j10, InterfaceC15783O coroutineScope) {
        Intrinsics.j(sessionProvider, "sessionProvider");
        Intrinsics.j(metricsUpdater, "metricsUpdater");
        Intrinsics.j(metricsRepository, "metricsRepository");
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.sessionProvider = sessionProvider;
        this.metricsUpdater = metricsUpdater;
        this.metricsRepository = metricsRepository;
        this.interval = j10;
        this.coroutineScope = coroutineScope;
    }

    private final Object b(Continuation<? super Unit> continuation) {
        X7.b metricsCache;
        K7.c cVarA = K7.c.INSTANCE.a();
        if (cVarA == null || (metricsCache = cVarA.getMetricsCache()) == null) {
            return Unit.f143329a;
        }
        this.metricsUpdater.a(metricsCache);
        Object objB = this.metricsRepository.b(b8.e.a(metricsCache, this.sessionProvider.a()), continuation);
        return objB == IntrinsicsKt.f() ? objB : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (mv.Z.c(r5, r0) != r1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0084 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X7.f.a
            if (r0 == 0) goto L13
            r0 = r8
            X7.f$a r0 = (X7.f.a) r0
            int r1 = r0.f41689d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41689d = r1
            goto L18
        L13:
            X7.f$a r0 = new X7.f$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f41687b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41689d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f41686a
            X7.f r2 = (X7.f) r2
            kotlin.ResultKt.b(r8)
        L2f:
            r8 = r2
            goto L64
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f41686a
            X7.f r2 = (X7.f) r2
            kotlin.ResultKt.b(r8)
            goto L7a
        L41:
            kotlin.ResultKt.b(r8)
            K7.c$a r8 = K7.c.INSTANCE
            K7.c r8 = r8.a()
            if (r8 == 0) goto L51
            X7.b r8 = r8.getMetricsCache()
            goto L52
        L51:
            r8 = 0
        L52:
            if (r8 != 0) goto L5e
            java.lang.String r8 = "dtxEnrichment"
            java.lang.String r0 = "failed to initialize MetricsWorker, CoreComponent not available"
            z8.f.a(r8, r0)
            kotlin.Unit r8 = kotlin.Unit.f143329a
            return r8
        L5e:
            K7.g r2 = r7.metricsUpdater
            r2.b(r8)
            r8 = r7
        L64:
            mv.C0 r2 = r8.job
            if (r2 == 0) goto L87
            boolean r2 = r2.a()
            if (r2 != r4) goto L87
            r0.f41686a = r8
            r0.f41689d = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 != r1) goto L79
            goto L86
        L79:
            r2 = r8
        L7a:
            long r5 = r2.interval
            r0.f41686a = r2
            r0.f41689d = r3
            java.lang.Object r8 = mv.Z.c(r5, r0)
            if (r8 != r1) goto L2f
        L86:
            return r1
        L87:
            kotlin.Unit r8 = kotlin.Unit.f143329a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X7.f.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
        if (this.job == null) {
            this.job = C15809k.d(this.coroutineScope, null, null, new b(null), 3, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(j jVar, K7.g gVar, b8.g gVar2, long j10, InterfaceC15783O interfaceC15783O, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 8) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j10 = DurationKt.s(5, DurationUnit.f148417e);
        }
        this(jVar, gVar, gVar2, j10, (i10 & 16) != 0 ? C15784P.a(C15800f0.b()) : interfaceC15783O, null);
    }
}
