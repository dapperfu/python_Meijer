package mg;

import B2.InterfaceC2911h;
import cf.InterfaceC6504a;
import java.util.concurrent.atomic.AtomicReference;
import jg.X;
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
import mv.C15784P;
import mv.C15807j;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0016\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lmg/m;", "Lmg/l;", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Ljg/X;", "timeProvider", "LB2/h;", "Lmg/h;", "sessionConfigsDataStore", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljg/X;LB2/h;)V", "", "b", "()Z", "c", "()Ljava/lang/Boolean;", "", "a", "()Ljava/lang/Double;", "", "e", "()Ljava/lang/Integer;", "sessionConfigs", "", "d", "(Lmg/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Ljg/X;", "LB2/h;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sessionConfigsAtomicReference", "h", "()Lmg/h;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext backgroundDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final X timeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2911h<SessionConfigs> sessionConfigsDataStore;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<SessionConfigs> sessionConfigsAtomicReference;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$1", f = "SettingsCache.kt", l = {73}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151055a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: mg.m$a$a, reason: collision with other inner class name */
        /* synthetic */ class C2325a implements InterfaceC16562g, FunctionAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AtomicReference<SessionConfigs> f151057a;

            C2325a(AtomicReference<SessionConfigs> atomicReference) {
                this.f151057a = atomicReference;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionConfigs sessionConfigs, Continuation<? super Unit> continuation) {
                Object objG = a.g(this.f151057a, sessionConfigs, continuation);
                return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC16562g) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f151057a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object g(AtomicReference atomicReference, SessionConfigs sessionConfigs, Continuation continuation) {
            atomicReference.set(sessionConfigs);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f151055a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f data = m.this.sessionConfigsDataStore.getData();
                C2325a c2325a = new C2325a(m.this.sessionConfigsAtomicReference);
                this.f151055a = 1;
                if (data.collect(c2325a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lmg/h;", "<anonymous>", "(Lmv/O;)Lmg/h;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", f = "SettingsCache.kt", l = {64}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super SessionConfigs>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151058a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return m.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super SessionConfigs> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f151058a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16561f data = m.this.sessionConfigsDataStore.getData();
            this.f151058a = 1;
            Object objA = C16563h.A(data, this);
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
        /* synthetic */ Object f151060a;

        /* renamed from: c, reason: collision with root package name */
        int f151062c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f151060a = obj;
            this.f151062c |= Integer.MIN_VALUE;
            return m.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmg/h;", "it", "<anonymous>", "(Lmg/h;)Lmg/h;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$updateConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<SessionConfigs, Continuation<? super SessionConfigs>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151063a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SessionConfigs f151064b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SessionConfigs sessionConfigs, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f151064b = sessionConfigs;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f151064b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SessionConfigs sessionConfigs, Continuation<? super SessionConfigs> continuation) {
            return ((d) create(sessionConfigs, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f151063a == 0) {
                ResultKt.b(obj);
                return this.f151064b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m(@InterfaceC6504a CoroutineContext backgroundDispatcher, X timeProvider, InterfaceC2911h<SessionConfigs> sessionConfigsDataStore) {
        Intrinsics.j(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.timeProvider = timeProvider;
        this.sessionConfigsDataStore = sessionConfigsDataStore;
        this.sessionConfigsAtomicReference = new AtomicReference<>();
        C15809k.d(C15784P.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    private final SessionConfigs h() {
        if (this.sessionConfigsAtomicReference.get() == null) {
            U.d.a(this.sessionConfigsAtomicReference, null, C15807j.b(null, new b(null), 1, null));
        }
        SessionConfigs sessionConfigs = this.sessionConfigsAtomicReference.get();
        Intrinsics.i(sessionConfigs, "get(...)");
        return sessionConfigs;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(mg.SessionConfigs r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mg.m.c
            if (r0 == 0) goto L13
            r0 = r7
            mg.m$c r0 = (mg.m.c) r0
            int r1 = r0.f151062c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151062c = r1
            goto L18
        L13:
            mg.m$c r0 = new mg.m$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f151060a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f151062c
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
            B2.h<mg.h> r7 = r5.sessionConfigsDataStore     // Catch: java.io.IOException -> L29
            mg.m$d r2 = new mg.m$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L29
            r0.f151062c = r3     // Catch: java.io.IOException -> L29
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
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.m.d(mg.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mg.l
    public Double a() {
        return h().getSessionSamplingRate();
    }

    @Override // mg.l
    public boolean b() {
        Long cacheUpdatedTimeSeconds = h().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = h().getCacheDurationSeconds();
        if (cacheUpdatedTimeSeconds != null && cacheDurationSeconds != null && this.timeProvider.a().getSeconds() - cacheUpdatedTimeSeconds.longValue() < cacheDurationSeconds.intValue()) {
            return false;
        }
        return true;
    }

    @Override // mg.l
    public Boolean c() {
        return h().getSessionsEnabled();
    }

    @Override // mg.l
    public Integer e() {
        return h().getSessionTimeoutSeconds();
    }
}
