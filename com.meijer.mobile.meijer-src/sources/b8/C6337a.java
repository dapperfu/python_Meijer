package b8;

import B2.InterfaceC2911h;
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
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb8/a;", "", "LB2/h;", "LF2/f;", "dataStore", "<init>", "(LB2/h;)V", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestamp", "", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB2/h;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: b8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6337a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2911h<F2.f> dataStore;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lb8/a$a;", "", "<init>", "()V", "LF2/f$a;", "", "b", "LF2/f$a;", "a", "()LF2/f$a;", "LATEST_CRASH_TIMESTAMP_KEY", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b8.a$a, reason: collision with other inner class name */
    public static final class C1193a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1193a f60100a = new C1193a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Long> LATEST_CRASH_TIMESTAMP_KEY = F2.i.f("reason_crash");

        public final f.a<Long> a() {
            return LATEST_CRASH_TIMESTAMP_KEY;
        }

        private C1193a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: b8.a$b */
    public static final class b implements InterfaceC16561f<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f60102a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: b8.a$b$a, reason: collision with other inner class name */
        public static final class C1194a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f60103a;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$$inlined$map$1$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {50}, m = "emit")
            /* renamed from: b8.a$b$a$a, reason: collision with other inner class name */
            public static final class C1195a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f60104a;

                /* renamed from: b, reason: collision with root package name */
                int f60105b;

                public C1195a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f60104a = obj;
                    this.f60105b |= Integer.MIN_VALUE;
                    return C1194a.this.emit(null, this);
                }
            }

            public C1194a(InterfaceC16562g interfaceC16562g) {
                this.f60103a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof b8.C6337a.b.C1194a.C1195a
                    if (r0 == 0) goto L13
                    r0 = r8
                    b8.a$b$a$a r0 = (b8.C6337a.b.C1194a.C1195a) r0
                    int r1 = r0.f60105b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f60105b = r1
                    goto L18
                L13:
                    b8.a$b$a$a r0 = new b8.a$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f60104a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f60105b
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
                    pv.g r8 = r6.f60103a
                    F2.f r7 = (F2.f) r7
                    b8.a$a r2 = b8.C6337a.C1193a.f60100a
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
                    r0.f60105b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L5a
                    return r1
                L5a:
                    kotlin.Unit r7 = kotlin.Unit.f143329a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: b8.C6337a.b.C1194a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC16561f interfaceC16561f) {
            this.f60102a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super Long> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f60102a.collect(new C1194a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LF2/f;", "", "exception", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: b8.a$c */
    static final class c extends SuspendLambda implements Function3<InterfaceC16562g<? super F2.f>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60107a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60108b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60109c;

        c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super F2.f> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            c cVar = new c(continuation);
            cVar.f60108b = interfaceC16562g;
            cVar.f60109c = th2;
            return cVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60107a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f60108b;
                z8.f.b("dtxStorage", "reading data: anr timestamp could not be retrieved", (Throwable) this.f60109c);
                F2.f fVarA = F2.g.a();
                this.f60108b = null;
                this.f60107a = 1;
                if (interfaceC16562g.emit(fVarA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "", "", "exception", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$getCrashTimestamp$4", f = "DataStoreExitReasonTimestampDataSource.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: b8.a$d */
    static final class d extends SuspendLambda implements Function3<InterfaceC16562g<? super Long>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60110a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60111b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60112c;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Long> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f60111b = interfaceC16562g;
            dVar.f60112c = th2;
            return dVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60110a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f60111b;
                z8.f.b("dtxStorage", "mapping data: anr timestamp could not be retrieved", (Throwable) this.f60112c);
                Long lE = Boxing.e(-1L);
                this.f60111b = null;
                this.f60110a = 1;
                if (interfaceC16562g.emit(lE, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.DataStoreExitReasonTimestampDataSource$saveCrashTimestamp$2", f = "DataStoreExitReasonTimestampDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: b8.a$e */
    static final class e extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60113a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60114b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f60115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f60115c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f60115c, continuation);
            eVar.f60114b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((e) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f60113a == 0) {
                ResultKt.b(obj);
                ((F2.c) this.f60114b).i(C1193a.f60100a.a(), Boxing.e(this.f60115c));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C6337a(InterfaceC2911h<F2.f> dataStore) {
        Intrinsics.j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    public final Object a(Continuation<? super Long> continuation) {
        return C16563h.A(C16563h.g(new b(C16563h.g(this.dataStore.getData(), new c(null))), new d(null)), continuation);
    }

    public final Object b(long j10, Continuation<? super Unit> continuation) {
        z8.f.a("dtxStorage", "anr timestamp is updated: " + j10);
        Object objA = F2.j.a(this.dataStore, new e(j10, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }
}
