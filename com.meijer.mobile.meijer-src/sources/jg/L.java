package jg;

import cf.InterfaceC6504a;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u001aB3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Ljg/L;", "Ljg/K;", "Lcom/google/firebase/f;", "firebaseApp", "LLf/e;", "firebaseInstallations", "Lmg/j;", "sessionSettings", "Ljg/h;", "eventGDTLogger", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/f;LLf/e;Lmg/j;Ljg/h;Lkotlin/coroutines/CoroutineContext;)V", "Ljg/I;", "sessionEvent", "", "g", "(Ljg/I;)V", "", "i", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "()Z", "Ljg/H;", "sessionDetails", "a", "(Ljg/H;)V", "Lcom/google/firebase/f;", "b", "LLf/e;", "c", "Lmg/j;", "d", "Ljg/h;", "e", "Lkotlin/coroutines/CoroutineContext;", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class L implements K {

    /* renamed from: g, reason: collision with root package name */
    private static final double f140449g = Math.random();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.google.firebase.f firebaseApp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lf.e firebaseInstallations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mg.j sessionSettings;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15014h eventGDTLogger;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext backgroundDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", l = {70, 71, 77}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f140455a;

        /* renamed from: b, reason: collision with root package name */
        Object f140456b;

        /* renamed from: c, reason: collision with root package name */
        Object f140457c;

        /* renamed from: d, reason: collision with root package name */
        Object f140458d;

        /* renamed from: e, reason: collision with root package name */
        Object f140459e;

        /* renamed from: f, reason: collision with root package name */
        Object f140460f;

        /* renamed from: g, reason: collision with root package name */
        int f140461g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ SessionDetails f140463i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SessionDetails sessionDetails, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f140463i = sessionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new b(this.f140463i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f140461g
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r8.f140460f
                mg.j r0 = (mg.j) r0
                java.lang.Object r1 = r8.f140459e
                jg.H r1 = (jg.SessionDetails) r1
                java.lang.Object r2 = r8.f140458d
                com.google.firebase.f r2 = (com.google.firebase.f) r2
                java.lang.Object r3 = r8.f140457c
                jg.J r3 = (jg.J) r3
                java.lang.Object r4 = r8.f140456b
                jg.L r4 = (jg.L) r4
                java.lang.Object r5 = r8.f140455a
                jg.t r5 = (jg.C15025t) r5
                kotlin.ResultKt.b(r9)
                r7 = r3
                r3 = r0
                r0 = r7
                r7 = r2
                r2 = r1
                r1 = r7
            L32:
                r7 = r4
                goto L9d
            L35:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L3d:
                kotlin.ResultKt.b(r9)
                goto L6c
            L41:
                kotlin.ResultKt.b(r9)
                goto L53
            L45:
                kotlin.ResultKt.b(r9)
                jg.L r9 = jg.L.this
                r8.f140461g = r4
                java.lang.Object r9 = jg.L.f(r9, r8)
                if (r9 != r0) goto L53
                goto L95
            L53:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Lb0
                jg.t$a r9 = jg.C15025t.INSTANCE
                jg.L r1 = jg.L.this
                Lf.e r1 = jg.L.d(r1)
                r8.f140461g = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L6c
                goto L95
            L6c:
                r5 = r9
                jg.t r5 = (jg.C15025t) r5
                jg.L r4 = jg.L.this
                jg.J r3 = jg.J.f140446a
                com.google.firebase.f r9 = jg.L.c(r4)
                jg.H r1 = r8.f140463i
                jg.L r6 = jg.L.this
                mg.j r6 = jg.L.e(r6)
                kg.b r7 = kg.C15124b.f141827a
                r8.f140455a = r5
                r8.f140456b = r4
                r8.f140457c = r3
                r8.f140458d = r9
                r8.f140459e = r1
                r8.f140460f = r6
                r8.f140461g = r2
                java.lang.Object r2 = r7.c(r8)
                if (r2 != r0) goto L96
            L95:
                return r0
            L96:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r0
                r0 = r3
                r3 = r6
                goto L32
            L9d:
                r4 = r9
                java.util.Map r4 = (java.util.Map) r4
                r9 = r5
                java.lang.String r5 = r9.getFid()
                java.lang.String r6 = r9.getAuthToken()
                jg.I r9 = r0.a(r1, r2, r3, r4, r5, r6)
                jg.L.b(r7, r9)
            Lb0:
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.L.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {98, 104}, m = "shouldLogSession")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f140464a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f140465b;

        /* renamed from: d, reason: collision with root package name */
        int f140467d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f140465b = obj;
            this.f140467d |= Integer.MIN_VALUE;
            return L.this.i(this);
        }
    }

    public L(com.google.firebase.f firebaseApp, Lf.e firebaseInstallations, mg.j sessionSettings, InterfaceC15014h eventGDTLogger, @InterfaceC6504a CoroutineContext backgroundDispatcher) {
        Intrinsics.j(firebaseApp, "firebaseApp");
        Intrinsics.j(firebaseInstallations, "firebaseInstallations");
        Intrinsics.j(sessionSettings, "sessionSettings");
        Intrinsics.j(eventGDTLogger, "eventGDTLogger");
        Intrinsics.j(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.a(sessionEvent);
            FS.log_d("FirebaseSessions", "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            FS.log_e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    private final boolean h() {
        return f140449g <= this.sessionSettings.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof jg.L.c
            if (r0 == 0) goto L13
            r0 = r9
            jg.L$c r0 = (jg.L.c) r0
            int r1 = r0.f140467d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140467d = r1
            goto L18
        L13:
            jg.L$c r0 = new jg.L$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f140465b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f140467d
            r3 = 2
            r4 = 0
            java.lang.String r5 = "FirebaseSessions"
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f140464a
            jg.L r0 = (jg.L) r0
            kotlin.ResultKt.b(r9)
            goto L8e
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            java.lang.Object r2 = r0.f140464a
            jg.L r2 = (jg.L) r2
            kotlin.ResultKt.b(r9)
            goto L54
        L43:
            kotlin.ResultKt.b(r9)
            kg.b r9 = kg.C15124b.f141827a
            r0.f140464a = r8
            r0.f140467d = r6
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L53
            goto L8c
        L53:
            r2 = r8
        L54:
            java.util.Map r9 = (java.util.Map) r9
            java.util.Collection r9 = r9.values()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r7 = r9 instanceof java.util.Collection
            if (r7 == 0) goto L6a
            r7 = r9
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L6a
            goto Lb5
        L6a:
            java.util.Iterator r9 = r9.iterator()
        L6e:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto Lb5
            java.lang.Object r7 = r9.next()
            kg.c r7 = (kg.InterfaceC15125c) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto L6e
            mg.j r9 = r2.sessionSettings
            r0.f140464a = r2
            r0.f140467d = r3
            java.lang.Object r9 = r9.f(r0)
            if (r9 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r0 = r2
        L8e:
            mg.j r9 = r0.sessionSettings
            boolean r9 = r9.c()
            if (r9 != 0) goto La0
            java.lang.String r9 = "Sessions SDK disabled through settings API. Events will not be sent."
            com.fullstory.FS.log_d(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r9
        La0:
            boolean r9 = r0.h()
            if (r9 != 0) goto Lb0
            java.lang.String r9 = "Sessions SDK has dropped this session due to sampling."
            com.fullstory.FS.log_d(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r9
        Lb0:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.a(r6)
            return r9
        Lb5:
            java.lang.String r9 = "Sessions SDK disabled through data collection. Events will not be sent."
            com.fullstory.FS.log_d(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.a(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.L.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jg.K
    public void a(SessionDetails sessionDetails) {
        Intrinsics.j(sessionDetails, "sessionDetails");
        C15809k.d(C15784P.a(this.backgroundDispatcher), null, null, new b(sessionDetails, null), 3, null);
    }
}
