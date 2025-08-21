package com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings;

import Ch.d;
import Eh.CustomerPropertiesResponse;
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
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import zp.CustomerSavings;
import zp.DigitalReceiptsResponse;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/serverapi/rxjava/observables/receiptsAndSavings/ReceiptsAndSavingsDataSource;", "", "LEp/d;", "receiptsRepository", "LCh/d;", "preferencesRepository", "Lmv/K;", "ioDispatcher", "<init>", "(LEp/d;LCh/d;Lmv/K;)V", "j$/time/LocalDateTime", "dateEnrolledInDigitalReceipts", "now", "Lcom/meijer/mobile/serverapi/response/receiptsandsavings/ReceiptsAndSavingsResponse;", "getCustomerProperties", "(Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEp/d;", "LCh/d;", "Lmv/K;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReceiptsAndSavingsDataSource {
    public static final int $stable = 8;
    private final AbstractC15779K ioDispatcher;
    private final d preferencesRepository;
    private final Ep.d receiptsRepository;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/serverapi/response/receiptsandsavings/ReceiptsAndSavingsResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/serverapi/response/receiptsandsavings/ReceiptsAndSavingsResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$getCustomerProperties$2", f = "ReceiptsAndSavingsDataSource.kt", l = {40, 43, 44, 45, 46}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ReceiptsAndSavingsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f117623a;

        /* renamed from: b, reason: collision with root package name */
        Object f117624b;

        /* renamed from: c, reason: collision with root package name */
        Object f117625c;

        /* renamed from: d, reason: collision with root package name */
        Object f117626d;

        /* renamed from: e, reason: collision with root package name */
        Object f117627e;

        /* renamed from: f, reason: collision with root package name */
        Object f117628f;

        /* renamed from: g, reason: collision with root package name */
        Object f117629g;

        /* renamed from: h, reason: collision with root package name */
        Object f117630h;

        /* renamed from: i, reason: collision with root package name */
        Object f117631i;

        /* renamed from: j, reason: collision with root package name */
        Object f117632j;

        /* renamed from: k, reason: collision with root package name */
        int f117633k;

        /* renamed from: l, reason: collision with root package name */
        int f117634l;

        /* renamed from: m, reason: collision with root package name */
        int f117635m;

        /* renamed from: n, reason: collision with root package name */
        int f117636n;

        /* renamed from: o, reason: collision with root package name */
        int f117637o;

        /* renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f117638p;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ LocalDateTime f117640r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ LocalDateTime f117641s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/l;", "<anonymous>", "(Lmv/O;)LEh/l;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$getCustomerProperties$2$1$customerProperties$1", f = "ReceiptsAndSavingsDataSource.kt", l = {31}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$a$a, reason: collision with other inner class name */
        static final class C1892a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super CustomerPropertiesResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117642a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsDataSource f117643b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1892a(ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource, Continuation<? super C1892a> continuation) {
                super(2, continuation);
                this.f117643b = receiptsAndSavingsDataSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1892a(this.f117643b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super CustomerPropertiesResponse> continuation) {
                return ((C1892a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f117642a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                d dVar = this.f117643b.preferencesRepository;
                this.f117642a = 1;
                Object objC = dVar.c(this);
                if (objC == objF) {
                    return objF;
                }
                return objC;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lzp/a;", "<anonymous>", "(Lmv/O;)Lzp/a;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$getCustomerProperties$2$1$customerSavings$1", f = "ReceiptsAndSavingsDataSource.kt", l = {l3.f93325e}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super CustomerSavings>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117644a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsDataSource f117645b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f117645b = receiptsAndSavingsDataSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f117645b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super CustomerSavings> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f117644a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Ep.d dVar = this.f117645b.receiptsRepository;
                this.f117644a = 1;
                Object objC = Ep.a.c(dVar, 0, this, 1, null);
                if (objC == objF) {
                    return objF;
                }
                return objC;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lzp/d;", "<anonymous>", "(Lmv/O;)Lzp/d;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.receiptsAndSavings.ReceiptsAndSavingsDataSource$getCustomerProperties$2$1$digitalReceiptsSummary$1", f = "ReceiptsAndSavingsDataSource.kt", l = {34}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super DigitalReceiptsResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f117646a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ReceiptsAndSavingsDataSource f117647b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalDateTime f117648c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalDateTime f117649d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ReceiptsAndSavingsDataSource receiptsAndSavingsDataSource, LocalDateTime localDateTime, LocalDateTime localDateTime2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f117647b = receiptsAndSavingsDataSource;
                this.f117648c = localDateTime;
                this.f117649d = localDateTime2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f117647b, this.f117648c, this.f117649d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super DigitalReceiptsResponse> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f117646a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Ep.d dVar = this.f117647b.receiptsRepository;
                LocalDate localDateL = this.f117648c.l();
                Intrinsics.i(localDateL, "toLocalDate(...)");
                LocalDate localDateL2 = this.f117649d.l();
                Intrinsics.i(localDateL2, "toLocalDate(...)");
                this.f117646a = 1;
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
            this.f117640r = localDateTime;
            this.f117641s = localDateTime2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = ReceiptsAndSavingsDataSource.this.new a(this.f117640r, this.f117641s, continuation);
            aVar.f117638p = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ReceiptsAndSavingsResponse> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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

    public ReceiptsAndSavingsDataSource(Ep.d receiptsRepository, d preferencesRepository, AbstractC15779K ioDispatcher) {
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
        return C15805i.g(this.ioDispatcher, new a(localDateTime, localDateTime2, null), continuation);
    }
}
