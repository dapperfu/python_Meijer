package com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings;

import Bh.d;
import Dh.CustomerPropertiesResponse;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.serverapi.response.receiptsandsavings.ReceiptsAndSavingsResponse;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;
import zp.CustomerSavings;
import zp.DigitalReceiptsResponse;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/serverapi/rxjava/observables/receiptsAndSavings/ReceiptsAndSavingsDataSource;", "", "LEp/d;", "receiptsRepository", "LBh/d;", "preferencesRepository", "Lqv/K;", "ioDispatcher", "<init>", "(LEp/d;LBh/d;Lqv/K;)V", "j$/time/LocalDateTime", "dateEnrolledInDigitalReceipts", "now", "Lcom/meijer/mobile/serverapi/response/receiptsandsavings/ReceiptsAndSavingsResponse;", "getCustomerProperties", "(Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEp/d;", "LBh/d;", "Lqv/K;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReceiptsAndSavingsDataSource {
    public static final int $stable = 8;
    private final AbstractC16618K ioDispatcher;
    private final d preferencesRepository;
    private final Ep.d receiptsRepository;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/serverapi/response/receiptsandsavings/ReceiptsAndSavingsResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/serverapi/response/receiptsandsavings/ReceiptsAndSavingsResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$getCustomerProperties$2", f = "ReceiptsAndSavingsDataSource.kt", l = {40, 43, 44, 45, 46}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ReceiptsAndSavingsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f116678a;

        /* renamed from: b, reason: collision with root package name */
        Object f116679b;

        /* renamed from: c, reason: collision with root package name */
        Object f116680c;

        /* renamed from: d, reason: collision with root package name */
        Object f116681d;

        /* renamed from: e, reason: collision with root package name */
        Object f116682e;

        /* renamed from: f, reason: collision with root package name */
        Object f116683f;

        /* renamed from: g, reason: collision with root package name */
        Object f116684g;

        /* renamed from: h, reason: collision with root package name */
        Object f116685h;

        /* renamed from: i, reason: collision with root package name */
        Object f116686i;

        /* renamed from: j, reason: collision with root package name */
        Object f116687j;

        /* renamed from: k, reason: collision with root package name */
        int f116688k;

        /* renamed from: l, reason: collision with root package name */
        int f116689l;

        /* renamed from: m, reason: collision with root package name */
        int f116690m;

        /* renamed from: n, reason: collision with root package name */
        int f116691n;

        /* renamed from: o, reason: collision with root package name */
        int f116692o;

        /* renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f116693p;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ LocalDateTime f116695r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ LocalDateTime f116696s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/l;", "<anonymous>", "(Lqv/O;)LDh/l;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$getCustomerProperties$2$1$customerProperties$1", f = "ReceiptsAndSavingsDataSource.kt", l = {31}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$a$a, reason: collision with other inner class name */
        static final class C1885a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super CustomerPropertiesResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f116697a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsDataSource f116698b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1885a(ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource, Continuation<? super C1885a> continuation) {
                super(2, continuation);
                this.f116698b = receiptsAndSavingsDataSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1885a(this.f116698b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super CustomerPropertiesResponse> continuation) {
                return ((C1885a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f116697a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                d dVar = this.f116698b.preferencesRepository;
                this.f116697a = 1;
                Object objC = dVar.c(this);
                if (objC == objF) {
                    return objF;
                }
                return objC;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lzp/a;", "<anonymous>", "(Lqv/O;)Lzp/a;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$getCustomerProperties$2$1$customerSavings$1", f = "ReceiptsAndSavingsDataSource.kt", l = {l3.f92486e}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super CustomerSavings>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f116699a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsDataSource f116700b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f116700b = receiptsAndSavingsDataSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f116700b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super CustomerSavings> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f116699a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Ep.d dVar = this.f116700b.receiptsRepository;
                this.f116699a = 1;
                Object objC = Ep.a.c(dVar, 0, this, 1, null);
                if (objC == objF) {
                    return objF;
                }
                return objC;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lzp/d;", "<anonymous>", "(Lqv/O;)Lzp/d;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$getCustomerProperties$2$1$digitalReceiptsSummary$1", f = "ReceiptsAndSavingsDataSource.kt", l = {34}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super DigitalReceiptsResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f116701a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsDataSource f116702b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalDateTime f116703c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalDateTime f116704d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource, LocalDateTime localDateTime, LocalDateTime localDateTime2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f116702b = receiptsAndSavingsDataSource;
                this.f116703c = localDateTime;
                this.f116704d = localDateTime2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f116702b, this.f116703c, this.f116704d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super DigitalReceiptsResponse> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f116701a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Ep.d dVar = this.f116702b.receiptsRepository;
                LocalDate localDateL = this.f116703c.l();
                Intrinsics.i(localDateL, "toLocalDate(...)");
                LocalDate localDateL2 = this.f116704d.l();
                Intrinsics.i(localDateL2, "toLocalDate(...)");
                this.f116701a = 1;
                Object objJ = Ep.d.j(dVar, localDateL, localDateL2, 0, 0, null, this, 28, null);
                if (objJ == objF) {
                    return objF;
                }
                return objJ;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LocalDateTime localDateTime, LocalDateTime localDateTime2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f116695r = localDateTime;
            this.f116696s = localDateTime2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = ReceiptsAndSavingsDataSource.this.new a(this.f116695r, this.f116696s, continuation);
            aVar.f116693p = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ReceiptsAndSavingsResponse> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0246  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x025d A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:10:0x0045, B:51:0x0290, B:17:0x008a, B:44:0x0253, B:46:0x025d, B:47:0x0261, B:20:0x00cc, B:40:0x0219, B:23:0x0108, B:36:0x01e0, B:26:0x013f, B:33:0x01bf, B:29:0x015c), top: B:63:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x02b3  */
        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 719
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ReceiptsAndSavingsDataSource(Ep.d receiptsRepository, d preferencesRepository, AbstractC16618K ioDispatcher) {
        Intrinsics.j(receiptsRepository, "receiptsRepository");
        Intrinsics.j(preferencesRepository, "preferencesRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.receiptsRepository = receiptsRepository;
        this.preferencesRepository = preferencesRepository;
        this.ioDispatcher = ioDispatcher;
    }

    public static /* synthetic */ Object getCustomerProperties$default(ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource, LocalDateTime localDateTime, LocalDateTime localDateTime2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            localDateTime2 = LocalDateTime.now();
        }
        return receiptsAndSavingsDataSource.getCustomerProperties(localDateTime, localDateTime2, continuation);
    }

    public final Object getCustomerProperties(LocalDateTime localDateTime, LocalDateTime localDateTime2, Continuation<? super ReceiptsAndSavingsResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new a(localDateTime, localDateTime2, null), continuation);
    }
}
