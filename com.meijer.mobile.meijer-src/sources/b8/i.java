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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb8/i;", "Lb8/h;", "LB2/h;", "LF2/f;", "dataStore", "<init>", "(LB2/h;)V", "Lb8/j;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configurationV4", "", "c", "(Lb8/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LB2/h;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2911h<F2.f> dataStore;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lb8/i$a;", "", "<init>", "()V", "LF2/f$a;", "", "b", "LF2/f$a;", "d", "()LF2/f$a;", "REVISION", "", "c", "MAX_BEACON_SIZE_KIB", "MAX_EVENT_SIZE_KIB", "", "e", "a", "CAPTURE", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60209a = new a();

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
        int f60214a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60215b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f60215b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((b) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f60214a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f60215b;
                a aVar = a.f60209a;
                cVar.h(aVar.d());
                cVar.h(aVar.b());
                cVar.h(aVar.c());
                cVar.h(aVar.a());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c implements InterfaceC16561f<ServerConfigurationV4> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f60216a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f60217a;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$getServerConfiguration$$inlined$map$1$2", f = "ServerConfigurationDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: b8.i$c$a$a, reason: collision with other inner class name */
            public static final class C1200a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f60218a;

                /* renamed from: b, reason: collision with root package name */
                int f60219b;

                public C1200a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f60218a = obj;
                    this.f60219b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f60217a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof b8.i.c.a.C1200a
                    if (r0 == 0) goto L13
                    r0 = r13
                    b8.i$c$a$a r0 = (b8.i.c.a.C1200a) r0
                    int r1 = r0.f60219b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f60219b = r1
                    goto L18
                L13:
                    b8.i$c$a$a r0 = new b8.i$c$a$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f60218a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f60219b
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
                    pv.g r13 = r11.f60217a
                    F2.f r12 = (F2.f) r12
                    b8.i$a r2 = b8.i.a.f60209a
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
                    b8.j r5 = new b8.j
                    r6 = 0
                    r5.<init>(r6, r8, r9, r10)
                    r0.f60219b = r3
                    java.lang.Object r12 = r13.emit(r5, r0)
                    if (r12 != r1) goto L87
                    return r1
                L87:
                    kotlin.Unit r12 = kotlin.Unit.f143329a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: b8.i.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC16561f interfaceC16561f) {
            this.f60216a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super ServerConfigurationV4> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f60216a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LF2/f;", "", "exception", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$getServerConfiguration$2", f = "ServerConfigurationDataSourceImpl.kt", l = {37}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC16562g<? super F2.f>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60221a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60222b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60223c;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super F2.f> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f60222b = interfaceC16562g;
            dVar.f60223c = th2;
            return dVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60221a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f60222b;
                z8.f.b("dtxStorage", "reading data: Configuration could not be retrieved", (Throwable) this.f60223c);
                F2.f fVarA = F2.g.a();
                this.f60222b = null;
                this.f60221a = 1;
                if (interfaceC16562g.emit(fVarA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lb8/j;", "", "exception", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$getServerConfiguration$4", f = "ServerConfigurationDataSourceImpl.kt", l = {56}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function3<InterfaceC16562g<? super ServerConfigurationV4>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60224a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60225b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60226c;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super ServerConfigurationV4> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.f60225b = interfaceC16562g;
            eVar.f60226c = th2;
            return eVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60224a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f60225b;
                z8.f.b("dtxStorage", "mapping data: Configuration could not be retrieved", (Throwable) this.f60226c);
                ServerConfigurationV4 serverConfigurationV4 = new ServerConfigurationV4(0L, 1024, 256, true);
                this.f60225b = null;
                this.f60224a = 1;
                if (interfaceC16562g.emit(serverConfigurationV4, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.ServerConfigurationDataSourceImpl$setServerConfiguration$2", f = "ServerConfigurationDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60227a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60228b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ServerConfigurationV4 f60229c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ServerConfigurationV4 serverConfigurationV4, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f60229c = serverConfigurationV4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f60229c, continuation);
            fVar.f60228b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
            return ((f) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f60227a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f60228b;
                a aVar = a.f60209a;
                cVar.i(aVar.d(), Boxing.e(this.f60229c.getRevision()));
                cVar.i(aVar.b(), Boxing.d(this.f60229c.getMaxBeaconSizeKib()));
                cVar.i(aVar.c(), Boxing.d(this.f60229c.getMaxEventSizeKib()));
                cVar.i(aVar.a(), Boxing.a(this.f60229c.getCapture()));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public i(InterfaceC2911h<F2.f> dataStore) {
        Intrinsics.j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // b8.h
    public Object a(Continuation<? super Unit> continuation) {
        z8.f.a("dtxStorage", "configuration preferences are cleared");
        Object objA = F2.j.a(this.dataStore, new b(null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }

    @Override // b8.h
    public Object b(Continuation<? super ServerConfigurationV4> continuation) {
        return C16563h.A(C16563h.g(new c(C16563h.g(this.dataStore.getData(), new d(null))), new e(null)), continuation);
    }

    @Override // b8.h
    public Object c(ServerConfigurationV4 serverConfigurationV4, Continuation<? super Unit> continuation) {
        z8.f.a("dtxStorage", "configuration is updated: " + serverConfigurationV4);
        Object objA = F2.j.a(this.dataStore, new f(serverConfigurationV4, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }
}
