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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LZ7/i;", "LZ7/h;", "LB2/h;", "LF2/f;", "dataStore", "<init>", "(LB2/h;)V", "LZ7/j;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configurationV4", "", "c", "(LZ7/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LB2/h;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2943h<F2.f> dataStore;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"LZ7/i$a;", "", "<init>", "()V", "LF2/f$a;", "", "b", "LF2/f$a;", "d", "()LF2/f$a;", "REVISION", "", "c", "MAX_BEACON_SIZE_KIB", "MAX_EVENT_SIZE_KIB", "", "e", "a", "CAPTURE", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42542a = new a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Long> REVISION = F2.i.f("sc_revision");

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Integer> MAX_BEACON_SIZE_KIB = F2.i.e("sc_max_beacon_size_kib");

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Integer> MAX_EVENT_SIZE_KIB = F2.i.e("sc_max_event_size_kib");

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final f.a<Boolean> CAPTURE = F2.i.a("sc_capture");

        public final f.a<Boolean> a() {
            return CAPTURE;
        }

        public final f.a<Integer> b() {
            return MAX_BEACON_SIZE_KIB;
        }

        public final f.a<Integer> c() {
            return MAX_EVENT_SIZE_KIB;
        }

        public final f.a<Long> d() {
            return REVISION;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$clearPreferences$2", f = "ServerConfigurationDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42547a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42548b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f42548b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((b) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f42547a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f42548b;
                a aVar = a.f42542a;
                cVar.h(aVar.d());
                cVar.h(aVar.b());
                cVar.h(aVar.c());
                cVar.h(aVar.a());
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c implements InterfaceC17152f<ServerConfigurationV4> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f42549a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f42550a;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$getServerConfiguration$$inlined$map$1$2", f = "ServerConfigurationDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: Z7.i$c$a$a, reason: collision with other inner class name */
            public static final class C0911a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f42551a;

                /* renamed from: b, reason: collision with root package name */
                int f42552b;

                public C0911a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f42551a = obj;
                    this.f42552b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f42550a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof Z7.i.c.a.C0911a
                    if (r0 == 0) goto L13
                    r0 = r13
                    Z7.i$c$a$a r0 = (Z7.i.c.a.C0911a) r0
                    int r1 = r0.f42552b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42552b = r1
                    goto L18
                L13:
                    Z7.i$c$a$a r0 = new Z7.i$c$a$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f42551a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f42552b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r13)
                    goto L87
                L29:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L31:
                    kotlin.ResultKt.b(r13)
                    tv.g r13 = r11.f42550a
                    F2.f r12 = (F2.f) r12
                    Z7.i$a r2 = Z7.i.a.f42542a
                    F2.f$a r4 = r2.b()
                    java.lang.Object r4 = r12.b(r4)
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    if (r4 == 0) goto L4c
                    int r4 = r4.intValue()
                L4a:
                    r8 = r4
                    goto L4f
                L4c:
                    r4 = 1024(0x400, float:1.435E-42)
                    goto L4a
                L4f:
                    F2.f$a r4 = r2.c()
                    java.lang.Object r4 = r12.b(r4)
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    if (r4 == 0) goto L61
                    int r4 = r4.intValue()
                L5f:
                    r9 = r4
                    goto L64
                L61:
                    r4 = 256(0x100, float:3.59E-43)
                    goto L5f
                L64:
                    F2.f$a r2 = r2.a()
                    java.lang.Object r12 = r12.b(r2)
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    if (r12 == 0) goto L76
                    boolean r12 = r12.booleanValue()
                    r10 = r12
                    goto L77
                L76:
                    r10 = r3
                L77:
                    Z7.j r5 = new Z7.j
                    r6 = 0
                    r5.<init>(r6, r8, r9, r10)
                    r0.f42552b = r3
                    java.lang.Object r12 = r13.emit(r5, r0)
                    if (r12 != r1) goto L87
                    return r1
                L87:
                    kotlin.Unit r12 = kotlin.Unit.f142422a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: Z7.i.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC17152f interfaceC17152f) {
            this.f42549a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super ServerConfigurationV4> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f42549a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LF2/f;", "", "exception", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$getServerConfiguration$2", f = "ServerConfigurationDataSourceImpl.kt", l = {37}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC17153g<? super F2.f>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42554a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42555b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f42556c;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super F2.f> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f42555b = interfaceC17153g;
            dVar.f42556c = th2;
            return dVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42554a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f42555b;
                x8.f.b("dtxStorage", "reading data: Configuration could not be retrieved", (Throwable) this.f42556c);
                F2.f fVarA = F2.g.a();
                this.f42555b = null;
                this.f42554a = 1;
                if (interfaceC17153g.emit(fVarA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LZ7/j;", "", "exception", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$getServerConfiguration$4", f = "ServerConfigurationDataSourceImpl.kt", l = {56}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function3<InterfaceC17153g<? super ServerConfigurationV4>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42557a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42558b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f42559c;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super ServerConfigurationV4> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.f42558b = interfaceC17153g;
            eVar.f42559c = th2;
            return eVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42557a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f42558b;
                x8.f.b("dtxStorage", "mapping data: Configuration could not be retrieved", (Throwable) this.f42559c);
                ServerConfigurationV4 serverConfigurationV4 = new ServerConfigurationV4(0L, 1024, 256, true);
                this.f42558b = null;
                this.f42557a = 1;
                if (interfaceC17153g.emit(serverConfigurationV4, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$setServerConfiguration$2", f = "ServerConfigurationDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42560a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ServerConfigurationV4 f42562c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ServerConfigurationV4 serverConfigurationV4, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f42562c = serverConfigurationV4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f42562c, continuation);
            fVar.f42561b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((f) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f42560a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f42561b;
                a aVar = a.f42542a;
                cVar.i(aVar.d(), Boxing.e(this.f42562c.getRevision()));
                cVar.i(aVar.b(), Boxing.d(this.f42562c.getMaxBeaconSizeKib()));
                cVar.i(aVar.c(), Boxing.d(this.f42562c.getMaxEventSizeKib()));
                cVar.i(aVar.a(), Boxing.a(this.f42562c.getCapture()));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public i(InterfaceC2943h<F2.f> dataStore) {
        Intrinsics.j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // Z7.h
    public Object a(Continuation<? super Unit> continuation) {
        x8.f.a("dtxStorage", "configuration preferences are cleared");
        Object objA = F2.j.a(this.dataStore, new b(null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
    }

    @Override // Z7.h
    public Object b(Continuation<? super ServerConfigurationV4> continuation) {
        return C17154h.A(C17154h.g(new c(C17154h.g(this.dataStore.getData(), new d(null))), new e(null)), continuation);
    }

    @Override // Z7.h
    public Object c(ServerConfigurationV4 serverConfigurationV4, Continuation<? super Unit> continuation) {
        x8.f.a("dtxStorage", "configuration is updated: " + serverConfigurationV4);
        Object objA = F2.j.a(this.dataStore, new f(serverConfigurationV4, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
    }
}
