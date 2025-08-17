package Z7;

import B2.InterfaceC2943h;
import F2.f;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"LZ7/a;", "", "LB2/h;", "LF2/f;", "dataStore", "<init>", "(LB2/h;)V", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestamp", "", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB2/h;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2943h<F2.f> dataStore;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LZ7/a$a;", "", "<init>", "()V", "LF2/f$a;", "", "b", "LF2/f$a;", "a", "()LF2/f$a;", "LATEST_CRASH_TIMESTAMP_KEY", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Z7.a$a, reason: collision with other inner class name */
    public static final class C0904a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0904a f42433a = new C0904a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Long> LATEST_CRASH_TIMESTAMP_KEY = F2.i.f("reason_crash");

        public final f.a<Long> a() {
            return LATEST_CRASH_TIMESTAMP_KEY;
        }

        private C0904a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements InterfaceC17152f<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f42435a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Z7.a$b$a, reason: collision with other inner class name */
        public static final class C0905a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f42436a;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {50}, m = "emit")
            /* renamed from: Z7.a$b$a$a, reason: collision with other inner class name */
            public static final class C0906a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f42437a;

                /* renamed from: b, reason: collision with root package name */
                int f42438b;

                public C0906a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f42437a = obj;
                    this.f42438b |= Integer.MIN_VALUE;
                    return C0905a.this.emit(null, this);
                }
            }

            public C0905a(InterfaceC17153g interfaceC17153g) {
                this.f42436a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Z7.a.b.C0905a.C0906a
                    if (r0 == 0) goto L13
                    r0 = r8
                    Z7.a$b$a$a r0 = (Z7.a.b.C0905a.C0906a) r0
                    int r1 = r0.f42438b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42438b = r1
                    goto L18
                L13:
                    Z7.a$b$a$a r0 = new Z7.a$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f42437a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f42438b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r8)
                    goto L5a
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    kotlin.ResultKt.b(r8)
                    tv.g r8 = r6.f42436a
                    F2.f r7 = (F2.f) r7
                    Z7.a$a r2 = Z7.a.C0904a.f42433a
                    F2.f$a r2 = r2.a()
                    java.lang.Object r7 = r7.b(r2)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 == 0) goto L4b
                    long r4 = r7.longValue()
                    goto L4d
                L4b:
                    r4 = -1
                L4d:
                    java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.e(r4)
                    r0.f42438b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L5a
                    return r1
                L5a:
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Z7.a.b.C0905a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC17152f interfaceC17152f) {
            this.f42435a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Long> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f42435a.collect(new C0905a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LF2/f;", "", "exception", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {36}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function3<InterfaceC17153g<? super F2.f>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42440a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42441b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f42442c;

        c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super F2.f> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            c cVar = new c(continuation);
            cVar.f42441b = interfaceC17153g;
            cVar.f42442c = th2;
            return cVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42440a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f42441b;
                x8.f.b("dtxStorage", "reading data: anr timestamp could not be retrieved", (Throwable) this.f42442c);
                F2.f fVarA = F2.g.a();
                this.f42441b = null;
                this.f42440a = 1;
                if (interfaceC17153g.emit(fVarA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "", "", "exception", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$4", f = "DataStoreExitReasonTimestampDataSource.kt", l = {43}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC17153g<? super Long>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42443a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42444b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f42445c;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Long> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f42444b = interfaceC17153g;
            dVar.f42445c = th2;
            return dVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42443a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f42444b;
                x8.f.b("dtxStorage", "mapping data: anr timestamp could not be retrieved", (Throwable) this.f42445c);
                Long lE = Boxing.e(-1L);
                this.f42444b = null;
                this.f42443a = 1;
                if (interfaceC17153g.emit(lE, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$saveCrashTimestamp$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42446a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42447b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f42448c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f42448c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f42448c, continuation);
            eVar.f42447b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((e) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f42446a == 0) {
                ResultKt.b(obj);
                ((F2.c) this.f42447b).i(C0904a.f42433a.a(), Boxing.e(this.f42448c));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(InterfaceC2943h<F2.f> dataStore) {
        Intrinsics.j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    public final Object a(Continuation<? super Long> continuation) {
        return C17154h.A(C17154h.g(new b(C17154h.g(this.dataStore.getData(), new c(null))), new d(null)), continuation);
    }

    public final Object b(long j10, Continuation<? super Unit> continuation) {
        x8.f.a("dtxStorage", "anr timestamp is updated: " + j10);
        Object objA = F2.j.a(this.dataStore, new e(j10, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
    }
}
