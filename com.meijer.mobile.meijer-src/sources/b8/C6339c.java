package b8;

import B2.InterfaceC2911h;
import F2.f;
import Y7.EndPointInfo;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb8/c;", "Lb8/b;", "LB2/h;", "LF2/f;", "dataStore", "<init>", "(LB2/h;)V", "LY7/a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endPointInfo", "", "c", "(LY7/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LB2/h;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: b8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6339c implements InterfaceC6338b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2911h<F2.f> dataStore;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lb8/c$a;", "", "<init>", "()V", "LF2/f$a;", "", "b", "LF2/f$a;", "a", "()LF2/f$a;", "APP_ID", "c", "BEACON_URL", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b8.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60117a = new a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> APP_ID = F2.i.g("ep_app_id");

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final f.a<String> BEACON_URL = F2.i.g("ep_beacon_url");

        public final f.a<String> a() {
            return APP_ID;
        }

        public final f.a<String> b() {
            return BEACON_URL;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$clearPreferences$2", f = "EndPointInfoDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: b8.c$b */
    static final class b extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60120a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60121b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f60121b = obj;
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
            if (this.f60120a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f60121b;
                a aVar = a.f60117a;
                cVar.h(aVar.a());
                cVar.h(aVar.b());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: b8.c$c, reason: collision with other inner class name */
    public static final class C1196c implements InterfaceC16561f<EndPointInfo> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f60122a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: b8.c$c$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f60123a;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2", f = "EndPointInfoDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: b8.c$c$a$a, reason: collision with other inner class name */
            public static final class C1197a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f60124a;

                /* renamed from: b, reason: collision with root package name */
                int f60125b;

                public C1197a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f60124a = obj;
                    this.f60125b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f60123a = interfaceC16562g;
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
                    boolean r0 = r8 instanceof b8.C6339c.C1196c.a.C1197a
                    if (r0 == 0) goto L13
                    r0 = r8
                    b8.c$c$a$a r0 = (b8.C6339c.C1196c.a.C1197a) r0
                    int r1 = r0.f60125b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f60125b = r1
                    goto L18
                L13:
                    b8.c$c$a$a r0 = new b8.c$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f60124a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f60125b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r8)
                    goto L65
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    kotlin.ResultKt.b(r8)
                    pv.g r8 = r6.f60123a
                    F2.f r7 = (F2.f) r7
                    b8.c$a r2 = b8.C6339c.a.f60117a
                    F2.f$a r4 = r2.a()
                    java.lang.Object r4 = r7.b(r4)
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.String r5 = ""
                    if (r4 != 0) goto L49
                    r4 = r5
                L49:
                    F2.f$a r2 = r2.b()
                    java.lang.Object r7 = r7.b(r2)
                    java.lang.String r7 = (java.lang.String) r7
                    if (r7 != 0) goto L56
                    goto L57
                L56:
                    r5 = r7
                L57:
                    Y7.a r7 = new Y7.a
                    r7.<init>(r4, r5)
                    r0.f60125b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L65
                    return r1
                L65:
                    kotlin.Unit r7 = kotlin.Unit.f143329a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: b8.C6339c.C1196c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C1196c(InterfaceC16561f interfaceC16561f) {
            this.f60122a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super EndPointInfo> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f60122a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LF2/f;", "", "exception", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$2", f = "EndPointInfoDataSourceImpl.kt", l = {l3.f93325e}, m = "invokeSuspend")
    /* renamed from: b8.c$d */
    static final class d extends SuspendLambda implements Function3<InterfaceC16562g<? super F2.f>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60127a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60128b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60129c;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super F2.f> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f60128b = interfaceC16562g;
            dVar.f60129c = th2;
            return dVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60127a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f60128b;
                z8.f.b("dtxStorage", "reading data: endpoint info could not be retrieved", (Throwable) this.f60129c);
                F2.f fVarA = F2.g.a();
                this.f60128b = null;
                this.f60127a = 1;
                if (interfaceC16562g.emit(fVarA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LY7/a;", "", "exception", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$4", f = "EndPointInfoDataSourceImpl.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: b8.c$e */
    static final class e extends SuspendLambda implements Function3<InterfaceC16562g<? super EndPointInfo>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60130a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f60131b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60132c;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super EndPointInfo> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.f60131b = interfaceC16562g;
            eVar.f60132c = th2;
            return eVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60130a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f60131b;
                z8.f.b("dtxStorage", "mapping data: endpoint info could not be retrieved", (Throwable) this.f60132c);
                EndPointInfo endPointInfo = new EndPointInfo("", "");
                this.f60131b = null;
                this.f60130a = 1;
                if (interfaceC16562g.emit(endPointInfo, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$setEndPointInfo$2", f = "EndPointInfoDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: b8.c$f */
    static final class f extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60133a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60134b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndPointInfo f60135c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(EndPointInfo endPointInfo, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f60135c = endPointInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f60135c, continuation);
            fVar.f60134b = obj;
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
            if (this.f60133a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f60134b;
                a aVar = a.f60117a;
                cVar.i(aVar.a(), this.f60135c.getApplicationId());
                cVar.i(aVar.b(), this.f60135c.getUrl());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C6339c(InterfaceC2911h<F2.f> dataStore) {
        Intrinsics.j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // b8.InterfaceC6338b
    public Object a(Continuation<? super Unit> continuation) {
        z8.f.a("dtxStorage", "endpoint preferences are cleared");
        Object objA = F2.j.a(this.dataStore, new b(null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }

    @Override // b8.InterfaceC6338b
    public Object b(Continuation<? super EndPointInfo> continuation) {
        return C16563h.A(C16563h.g(new C1196c(C16563h.g(this.dataStore.getData(), new d(null))), new e(null)), continuation);
    }

    @Override // b8.InterfaceC6338b
    public Object c(EndPointInfo endPointInfo, Continuation<? super Unit> continuation) {
        z8.f.a("dtxStorage", "endpoint info is updated: " + endPointInfo);
        Object objA = F2.j.a(this.dataStore, new f(endPointInfo, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
    }
}
