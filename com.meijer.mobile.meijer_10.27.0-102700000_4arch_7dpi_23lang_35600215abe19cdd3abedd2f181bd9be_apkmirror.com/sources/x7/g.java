package x7;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.AbstractC16618K;
import qv.C0;
import qv.E0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lx7/g;", "", "Lqv/O;", "scope", "Lqv/K;", "dispatcher", "<init>", "(Lqv/O;Lqv/K;)V", "Lkotlin/time/Duration;", "schedulingTime", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "a", "(JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqv/O;", "Lqv/K;", "Lqv/C0;", "c", "Lqv/C0;", "job", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K dispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C0 job;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.RequestScheduler", f = "RequestScheduler.kt", l = {39}, m = "schedule-KLykuaI")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f169424a;

        /* renamed from: b, reason: collision with root package name */
        Object f169425b;

        /* renamed from: c, reason: collision with root package name */
        long f169426c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f169427d;

        /* renamed from: f, reason: collision with root package name */
        int f169429f;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f169427d = obj;
            this.f169429f |= Integer.MIN_VALUE;
            return g.this.a(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.communication.RequestScheduler$schedule$2", f = "RequestScheduler.kt", l = {41, 42}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169430a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f169431b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> f169432c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j10, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f169431b = j10;
            this.f169432c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f169431b, this.f169432c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (r7.invoke(r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f169430a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r7)
                goto L37
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.b(r7)
                goto L2c
            L1e:
                kotlin.ResultKt.b(r7)
                long r4 = r6.f169431b
                r6.f169430a = r3
                java.lang.Object r7 = qv.Z.c(r4, r6)
                if (r7 != r0) goto L2c
                goto L36
            L2c:
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r7 = r6.f169432c
                r6.f169430a = r2
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r0) goto L37
            L36:
                return r0
            L37:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: x7.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g(InterfaceC16622O scope, AbstractC16618K dispatcher) {
        Intrinsics.j(scope, "scope");
        Intrinsics.j(dispatcher, "dispatcher");
        this.scope = scope;
        this.dispatcher = dispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof x7.g.a
            if (r0 == 0) goto L13
            r0 = r11
            x7.g$a r0 = (x7.g.a) r0
            int r1 = r0.f169429f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f169429f = r1
            goto L18
        L13:
            x7.g$a r0 = new x7.g$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f169427d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f169429f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r8 = r0.f169426c
            java.lang.Object r10 = r0.f169425b
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r0 = r0.f169424a
            x7.g r0 = (x7.g) r0
            kotlin.ResultKt.b(r11)
            goto L52
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.ResultKt.b(r11)
            qv.C0 r11 = r7.job
            if (r11 == 0) goto L51
            r0.f169424a = r7
            r0.f169425b = r10
            r0.f169426c = r8
            r0.f169429f = r3
            java.lang.Object r11 = qv.E0.g(r11, r0)
            if (r11 != r1) goto L51
            return r1
        L51:
            r0 = r7
        L52:
            qv.O r1 = r0.scope
            qv.K r2 = r0.dispatcher
            x7.g$b r4 = new x7.g$b
            r11 = 0
            r4.<init>(r8, r10, r11)
            r5 = 2
            r6 = 0
            r3 = 0
            qv.C0 r8 = qv.C16644i.d(r1, r2, r3, r4, r5, r6)
            r0.job = r8
            kotlin.Unit r8 = kotlin.Unit.f142422a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.g.a(long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(Continuation<? super Unit> continuation) {
        C0 c02 = this.job;
        if (c02 == null) {
            return Unit.f142422a;
        }
        Object objG = E0.g(c02, continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }
}
