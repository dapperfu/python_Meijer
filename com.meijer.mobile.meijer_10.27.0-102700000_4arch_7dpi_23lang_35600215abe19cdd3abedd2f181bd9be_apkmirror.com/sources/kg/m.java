package kg;

import B2.InterfaceC2943h;
import af.InterfaceC5598a;
import hg.X;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import qv.C16623P;
import qv.C16646j;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\u0016\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lkg/m;", "Lkg/l;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Lhg/X;", "timeProvider", "LB2/h;", "Lkg/h;", "sessionConfigsDataStore", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lhg/X;LB2/h;)V", "", "c", "()Z", "d", "()Ljava/lang/Boolean;", "", "a", "()Ljava/lang/Double;", "", "e", "()Ljava/lang/Integer;", "sessionConfigs", "", "b", "(Lkg/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Lhg/X;", "LB2/h;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sessionConfigsAtomicReference", "h", "()Lkg/h;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext backgroundDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final X timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2943h<SessionConfigs> sessionConfigsDataStore;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<SessionConfigs> sessionConfigsAtomicReference;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141909a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: kg.m$a$a, reason: collision with other inner class name */
        /* synthetic */ class C2243a implements InterfaceC17153g, FunctionAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AtomicReference<SessionConfigs> f141911a;

            C2243a(AtomicReference<SessionConfigs> atomicReference) {
                this.f141911a = atomicReference;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionConfigs sessionConfigs, Continuation<? super Unit> continuation) {
                Object objG = a.g(this.f141911a, sessionConfigs, continuation);
                return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC17153g) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f141911a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return m.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object g(AtomicReference atomicReference, SessionConfigs sessionConfigs, Continuation continuation) {
            atomicReference.set(sessionConfigs);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f141909a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f data = m.this.sessionConfigsDataStore.getData();
                C2243a c2243a = new C2243a(m.this.sessionConfigsAtomicReference);
                this.f141909a = 1;
                if (data.collect(c2243a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lkg/h;", "<anonymous>", "(Lqv/O;)Lkg/h;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", f = "SettingsCache.kt", l = {64}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super SessionConfigs>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141912a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return m.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super SessionConfigs> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f141912a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17152f data = m.this.sessionConfigsDataStore.getData();
            this.f141912a = 1;
            Object objA = C17154h.A(data, this);
            if (objA == objF) {
                return objF;
            }
            return objA;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", l = {98}, m = "updateConfigs")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f141914a;

        /* renamed from: c, reason: collision with root package name */
        int f141916c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f141914a = obj;
            this.f141916c |= Integer.MIN_VALUE;
            return m.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkg/h;", "it", "<anonymous>", "(Lkg/h;)Lkg/h;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<SessionConfigs, Continuation<? super SessionConfigs>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141917a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SessionConfigs f141918b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SessionConfigs sessionConfigs, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f141918b = sessionConfigs;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f141918b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SessionConfigs sessionConfigs, Continuation<? super SessionConfigs> continuation) {
            return ((d) create(sessionConfigs, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f141917a == 0) {
                ResultKt.b(obj);
                return this.f141918b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m(@InterfaceC5598a CoroutineContext backgroundDispatcher, X timeProvider, InterfaceC2943h<SessionConfigs> sessionConfigsDataStore) {
        Intrinsics.j(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.timeProvider = timeProvider;
        this.sessionConfigsDataStore = sessionConfigsDataStore;
        this.sessionConfigsAtomicReference = new AtomicReference<>();
        C16648k.d(C16623P.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    private final SessionConfigs h() {
        if (this.sessionConfigsAtomicReference.get() == null) {
            U.d.a(this.sessionConfigsAtomicReference, null, C16646j.b(null, new b(null), 1, null));
        }
        SessionConfigs sessionConfigs = this.sessionConfigsAtomicReference.get();
        Intrinsics.i(sessionConfigs, "get(...)");
        return sessionConfigs;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kg.SessionConfigs r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kg.m.c
            if (r0 == 0) goto L13
            r0 = r7
            kg.m$c r0 = (kg.m.c) r0
            int r1 = r0.f141916c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141916c = r1
            goto L18
        L13:
            kg.m$c r0 = new kg.m$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f141914a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f141916c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r7)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r7)
            B2.h<kg.h> r7 = r5.sessionConfigsDataStore     // Catch: java.io.IOException -> L29
            kg.m$d r2 = new kg.m$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L29
            r0.f141916c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r7.a(r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to update config values: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            com.fullstory.FS.log_w(r7, r6)
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.m.b(kg.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kg.l
    public Double a() {
        return h().getSessionSamplingRate();
    }

    @Override // kg.l
    public boolean c() {
        Long cacheUpdatedTimeSeconds = h().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = h().getCacheDurationSeconds();
        if (cacheUpdatedTimeSeconds != null && cacheDurationSeconds != null && this.timeProvider.a().getSeconds() - cacheUpdatedTimeSeconds.longValue() < cacheDurationSeconds.intValue()) {
            return false;
        }
        return true;
    }

    @Override // kg.l
    public Boolean d() {
        return h().getSessionsEnabled();
    }

    @Override // kg.l
    public Integer e() {
        return h().getSessionTimeoutSeconds();
    }
}
