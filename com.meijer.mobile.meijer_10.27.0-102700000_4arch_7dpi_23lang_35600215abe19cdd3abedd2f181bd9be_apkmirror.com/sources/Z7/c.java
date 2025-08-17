package Z7;

import B2.InterfaceC2943h;
import F2.f;
import W7.EndPointInfo;
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
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LZ7/c;", "LZ7/b;", "LB2/h;", "LF2/f;", "dataStore", "<init>", "(LB2/h;)V", "LW7/a;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endPointInfo", "", "c", "(LW7/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LB2/h;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class c implements Z7.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2943h<F2.f> dataStore;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"LZ7/c$a;", "", "<init>", "()V", "LF2/f$a;", "", "b", "LF2/f$a;", "a", "()LF2/f$a;", "APP_ID", "c", "BEACON_URL", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42450a = new a();

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
    static final class b extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42453a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42454b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f42454b = obj;
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
            if (this.f42453a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f42454b;
                a aVar = a.f42450a;
                cVar.h(aVar.a());
                cVar.h(aVar.b());
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Z7.c$c, reason: collision with other inner class name */
    public static final class C0907c implements InterfaceC17152f<EndPointInfo> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f42455a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Z7.c$c$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f42456a;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$$inlined$map$1$2", f = "EndPointInfoDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: Z7.c$c$a$a, reason: collision with other inner class name */
            public static final class C0908a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f42457a;

                /* renamed from: b, reason: collision with root package name */
                int f42458b;

                public C0908a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f42457a = obj;
                    this.f42458b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f42456a = interfaceC17153g;
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
                    boolean r0 = r8 instanceof Z7.c.C0907c.a.C0908a
                    if (r0 == 0) goto L13
                    r0 = r8
                    Z7.c$c$a$a r0 = (Z7.c.C0907c.a.C0908a) r0
                    int r1 = r0.f42458b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42458b = r1
                    goto L18
                L13:
                    Z7.c$c$a$a r0 = new Z7.c$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f42457a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f42458b
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
                    tv.g r8 = r6.f42456a
                    F2.f r7 = (F2.f) r7
                    Z7.c$a r2 = Z7.c.a.f42450a
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
                    W7.a r7 = new W7.a
                    r7.<init>(r4, r5)
                    r0.f42458b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L65
                    return r1
                L65:
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Z7.c.C0907c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C0907c(InterfaceC17152f interfaceC17152f) {
            this.f42455a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super EndPointInfo> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f42455a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LF2/f;", "", "exception", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$2", f = "EndPointInfoDataSourceImpl.kt", l = {l3.f92486e}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC17153g<? super F2.f>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42460a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42461b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f42462c;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super F2.f> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f42461b = interfaceC17153g;
            dVar.f42462c = th2;
            return dVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42460a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f42461b;
                x8.f.b("dtxStorage", "reading data: endpoint info could not be retrieved", (Throwable) this.f42462c);
                F2.f fVarA = F2.g.a();
                this.f42461b = null;
                this.f42460a = 1;
                if (interfaceC17153g.emit(fVarA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LW7/a;", "", "exception", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$getEndPointInfo$4", f = "EndPointInfoDataSourceImpl.kt", l = {42}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function3<InterfaceC17153g<? super EndPointInfo>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42463a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42464b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f42465c;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super EndPointInfo> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.f42464b = interfaceC17153g;
            eVar.f42465c = th2;
            return eVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42463a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f42464b;
                x8.f.b("dtxStorage", "mapping data: endpoint info could not be retrieved", (Throwable) this.f42465c);
                EndPointInfo endPointInfo = new EndPointInfo("", "");
                this.f42464b = null;
                this.f42463a = 1;
                if (interfaceC17153g.emit(endPointInfo, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "preferences", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.storage.preference.EndPointInfoDataSourceImpl$setEndPointInfo$2", f = "EndPointInfoDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42466a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f42467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EndPointInfo f42468c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(EndPointInfo endPointInfo, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f42468c = endPointInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f42468c, continuation);
            fVar.f42467b = obj;
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
            if (this.f42466a == 0) {
                ResultKt.b(obj);
                F2.c cVar = (F2.c) this.f42467b;
                a aVar = a.f42450a;
                cVar.i(aVar.a(), this.f42468c.getApplicationId());
                cVar.i(aVar.b(), this.f42468c.getUrl());
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(InterfaceC2943h<F2.f> dataStore) {
        Intrinsics.j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // Z7.b
    public Object a(Continuation<? super Unit> continuation) {
        x8.f.a("dtxStorage", "endpoint preferences are cleared");
        Object objA = F2.j.a(this.dataStore, new b(null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
    }

    @Override // Z7.b
    public Object b(Continuation<? super EndPointInfo> continuation) {
        return C17154h.A(C17154h.g(new C0907c(C17154h.g(this.dataStore.getData(), new d(null))), new e(null)), continuation);
    }

    @Override // Z7.b
    public Object c(EndPointInfo endPointInfo, Continuation<? super Unit> continuation) {
        x8.f.a("dtxStorage", "endpoint info is updated: " + endPointInfo);
        Object objA = F2.j.a(this.dataStore, new f(endPointInfo, null), continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
    }
}
