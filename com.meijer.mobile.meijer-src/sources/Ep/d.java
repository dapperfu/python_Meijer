package Ep;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15805i;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import yo.k;
import zp.CustomerSavings;
import zp.DigitalReceipt;
import zp.DigitalReceiptsResponse;
import zp.MonthSavingsSummary;
import zp.ReceiptIdentifier;
import zp.c;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001'B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0019H\u0096A¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010,R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R#\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u000f0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010/R#\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u000f018\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b;\u00105¨\u0006="}, d2 = {"LEp/d;", "LEp/f;", "LEp/a;", "LEp/g;", "receiptsDataSource", "LEp/e;", "nextGenDataSource", "Lyo/k;", "userManager", "Lzl/k;", "featureManager", "<init>", "(LEp/g;LEp/e;Lyo/k;Lzl/k;)V", "Lzp/d;", "receiptsResponse", "", "Lzp/b;", "nextGenReceipts", "Lzp/h;", "sortOrder", "l", "(Lzp/d;Ljava/util/List;Lzp/h;)Lzp/d;", "j$/time/LocalDate", "startDate", "endDate", "", "pageIndex", "pageSize", "i", "(Lj$/time/LocalDate;Lj$/time/LocalDate;IILzp/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzp/f;", "identifier", "Lzp/c;", "d", "(Lzp/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "year", "Lzp/a;", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LEp/g;", "LEp/e;", "c", "Lyo/k;", "Lzl/k;", "Lpv/B;", "e", "Lpv/B;", "_receiptsFlow", "Lpv/P;", "f", "Lpv/P;", "k", "()Lpv/P;", "receiptsFlow", "Lzp/e;", "g", "_savingsFlow", "h", "getSavingsFlow", "savingsFlow", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements f, a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g receiptsDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e nextGenDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<List<DigitalReceipt>> _receiptsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<List<DigitalReceipt>> receiptsFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<List<MonthSavingsSummary>> _savingsFlow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final P<List<MonthSavingsSummary>> savingsFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lzp/d;", "<anonymous>", "(Lmv/O;)Lzp/d;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.DigitalReceiptsRepository$getReceipts$2", f = "DigitalReceiptsRepository.kt", l = {113, 114, 114}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super DigitalReceiptsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f8131a;

        /* renamed from: b, reason: collision with root package name */
        Object f8132b;

        /* renamed from: c, reason: collision with root package name */
        Object f8133c;

        /* renamed from: d, reason: collision with root package name */
        Object f8134d;

        /* renamed from: e, reason: collision with root package name */
        int f8135e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f8136f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ zp.h f8138h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f8139i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalDate f8140j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LocalDate f8141k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f8142l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(((DigitalReceipt) t11).getTransactionDateTime(), ((DigitalReceipt) t10).getTransactionDateTime());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ep.d$b$b, reason: collision with other inner class name */
        public static final class C0162b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(((MonthSavingsSummary) t11).getYearMonth(), ((MonthSavingsSummary) t10).getYearMonth());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lzp/b;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.DigitalReceiptsRepository$getReceipts$2$nextGen$1", f = "DigitalReceiptsRepository.kt", l = {90}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends DigitalReceipt>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f8143a;

            /* renamed from: b, reason: collision with root package name */
            int f8144b;

            /* renamed from: c, reason: collision with root package name */
            int f8145c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f8146d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f8147e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f8148f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalDate f8149g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ LocalDate f8150h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ zp.h f8151i;

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends DigitalReceipt>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super List<DigitalReceipt>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(int i10, d dVar, LocalDate localDate, LocalDate localDate2, zp.h hVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f8147e = i10;
                this.f8148f = dVar;
                this.f8149g = localDate;
                this.f8150h = localDate2;
                this.f8151i = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f8147e, this.f8148f, this.f8149g, this.f8150h, this.f8151i, continuation);
                cVar.f8146d = obj;
                return cVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<DigitalReceipt>> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r9.f8145c
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 != r3) goto L1a
                    java.lang.Object r0 = r9.f8143a
                    mv.O r0 = (mv.InterfaceC15783O) r0
                    java.lang.Object r0 = r9.f8146d
                    mv.O r0 = (mv.InterfaceC15783O) r0
                    kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L18
                    goto L4c
                L18:
                    r10 = move-exception
                    goto L57
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    kotlin.ResultKt.b(r10)
                    java.lang.Object r10 = r9.f8146d
                    mv.O r10 = (mv.InterfaceC15783O) r10
                    int r1 = r9.f8147e
                    if (r1 > r3) goto L98
                    Ep.d r1 = r9.f8148f
                    j$.time.LocalDate r4 = r9.f8149g
                    j$.time.LocalDate r5 = r9.f8150h
                    zp.h r6 = r9.f8151i
                    kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L53
                    Ep.e r1 = Ep.d.a(r1)     // Catch: java.lang.Throwable -> L53
                    r9.f8146d = r10     // Catch: java.lang.Throwable -> L53
                    r9.f8143a = r10     // Catch: java.lang.Throwable -> L53
                    r9.f8144b = r2     // Catch: java.lang.Throwable -> L53
                    r9.f8145c = r3     // Catch: java.lang.Throwable -> L53
                    java.lang.Object r1 = r1.e(r4, r5, r6, r9)     // Catch: java.lang.Throwable -> L53
                    if (r1 != r0) goto L4a
                    return r0
                L4a:
                    r0 = r10
                    r10 = r1
                L4c:
                    java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Throwable -> L18
                    goto L61
                L53:
                    r0 = move-exception
                    r8 = r0
                    r0 = r10
                    r10 = r8
                L57:
                    kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                    java.lang.Object r10 = kotlin.ResultKt.a(r10)
                    java.lang.Object r10 = kotlin.Result.b(r10)
                L61:
                    java.lang.Throwable r1 = kotlin.Result.e(r10)
                    if (r1 != 0) goto L68
                    goto L92
                L68:
                    kotlin.coroutines.CoroutineContext r10 = r0.getCoroutineContext()     // Catch: java.lang.Throwable -> L85
                    mv.E0.i(r10)     // Catch: java.lang.Throwable -> L85
                    boolean r10 = r1 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L85
                    if (r10 != 0) goto L87
                    qw.a$a r10 = qw.a.INSTANCE     // Catch: java.lang.Throwable -> L85
                    java.lang.String r0 = "Failed to fetch next-gen receipts"
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L85
                    r10.f(r1, r0, r2)     // Catch: java.lang.Throwable -> L85
                    java.util.List r10 = kotlin.collections.CollectionsKt.m()     // Catch: java.lang.Throwable -> L85
                    java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Throwable -> L85
                    goto L92
                L85:
                    r10 = move-exception
                    goto L88
                L87:
                    throw r1     // Catch: java.lang.Throwable -> L85
                L88:
                    kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                    java.lang.Object r10 = kotlin.ResultKt.a(r10)
                    java.lang.Object r10 = kotlin.Result.b(r10)
                L92:
                    kotlin.ResultKt.b(r10)
                    java.util.List r10 = (java.util.List) r10
                    return r10
                L98:
                    java.util.List r10 = kotlin.collections.CollectionsKt.m()
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: Ep.d.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lzp/d;", "<anonymous>", "(Lmv/O;)Lzp/d;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.DigitalReceiptsRepository$getReceipts$2$receiptsResponse$1", f = "DigitalReceiptsRepository.kt", l = {106}, m = "invokeSuspend")
        /* renamed from: Ep.d$b$d, reason: collision with other inner class name */
        static final class C0163d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super DigitalReceiptsResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f8152a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f8153b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalDate f8154c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ LocalDate f8155d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f8156e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f8157f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0163d(d dVar, LocalDate localDate, LocalDate localDate2, int i10, int i11, Continuation<? super C0163d> continuation) {
                super(2, continuation);
                this.f8153b = dVar;
                this.f8154c = localDate;
                this.f8155d = localDate2;
                this.f8156e = i10;
                this.f8157f = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0163d(this.f8153b, this.f8154c, this.f8155d, this.f8156e, this.f8157f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super DigitalReceiptsResponse> continuation) {
                return ((C0163d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f8152a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                g gVar = this.f8153b.receiptsDataSource;
                LocalDateTime localDateTimeAtStartOfDay = this.f8154c.atStartOfDay();
                Intrinsics.i(localDateTimeAtStartOfDay, "atStartOfDay(...)");
                LocalDateTime localDateTimeT = this.f8155d.T(LocalTime.now());
                Intrinsics.i(localDateTimeT, "atTime(...)");
                int i11 = this.f8156e;
                int i12 = this.f8157f;
                this.f8152a = 1;
                Object objA = gVar.a(i11, i12, localDateTimeAtStartOfDay, localDateTimeT, this);
                if (objA == objF) {
                    return objF;
                }
                return objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zp.h hVar, int i10, LocalDate localDate, LocalDate localDate2, int i11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f8138h = hVar;
            this.f8139i = i10;
            this.f8140j = localDate;
            this.f8141k = localDate2;
            this.f8142l = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = d.this.new b(this.f8138h, this.f8139i, this.f8140j, this.f8141k, this.f8142l, continuation);
            bVar.f8136f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super DigitalReceiptsResponse> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ep.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((DigitalReceipt) t10).getTransactionDateTime(), ((DigitalReceipt) t11).getTransactionDateTime());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ep.d$d, reason: collision with other inner class name */
    public static final class C0164d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((DigitalReceipt) t11).getTransactionDateTime(), ((DigitalReceipt) t10).getTransactionDateTime());
        }
    }

    public d(g receiptsDataSource, e nextGenDataSource, k userManager, zl.k featureManager) {
        Intrinsics.j(receiptsDataSource, "receiptsDataSource");
        Intrinsics.j(nextGenDataSource, "nextGenDataSource");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureManager, "featureManager");
        this.receiptsDataSource = receiptsDataSource;
        this.nextGenDataSource = nextGenDataSource;
        this.userManager = userManager;
        this.featureManager = featureManager;
        InterfaceC16549B<List<DigitalReceipt>> interfaceC16549BA = S.a(CollectionsKt.m());
        this._receiptsFlow = interfaceC16549BA;
        this.receiptsFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16549B<List<MonthSavingsSummary>> interfaceC16549BA2 = S.a(CollectionsKt.m());
        this._savingsFlow = interfaceC16549BA2;
        this.savingsFlow = C16563h.c(interfaceC16549BA2);
    }

    public static /* synthetic */ Object j(d dVar, LocalDate localDate, LocalDate localDate2, int i10, int i11, zp.h hVar, Continuation continuation, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            localDate = k.u(dVar.userManager, null, 1, null).l();
        }
        if ((i12 & 2) != 0) {
            localDate2 = LocalDate.now();
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 20;
        }
        if ((i12 & 16) != 0) {
            hVar = zp.h.f173157c;
        }
        zp.h hVar2 = hVar;
        return dVar.i(localDate, localDate2, i10, i11, hVar2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DigitalReceiptsResponse l(DigitalReceiptsResponse receiptsResponse, List<DigitalReceipt> nextGenReceipts, zp.h sortOrder) {
        return DigitalReceiptsResponse.b(receiptsResponse, CollectionsKt.Z0(CollectionsKt.P0(receiptsResponse.e(), nextGenReceipts), sortOrder == zp.h.f173157c ? new C0164d() : new c()), null, 0, null, 0, 30, null);
    }

    @Override // Ep.a
    public Object b(int i10, Continuation<? super CustomerSavings> continuation) {
        return this.receiptsDataSource.b(i10, continuation);
    }

    public final P<List<DigitalReceipt>> k() {
        return this.receiptsFlow;
    }

    @Override // Ep.f
    public Object d(ReceiptIdentifier receiptIdentifier, Continuation<? super zp.c> continuation) {
        if (receiptIdentifier.getReceiptId() != null) {
            return this.receiptsDataSource.d(receiptIdentifier, continuation);
        }
        if (receiptIdentifier.getUuid() != null) {
            Object objD = this.nextGenDataSource.d(receiptIdentifier, continuation);
            if (objD == IntrinsicsKt.f()) {
                return objD;
            }
            return (zp.c) objD;
        }
        return new c.NotFound(receiptIdentifier);
    }

    public final Object i(LocalDate localDate, LocalDate localDate2, int i10, int i11, zp.h hVar, Continuation<? super DigitalReceiptsResponse> continuation) {
        return C15805i.g(continuation.getContext(), new b(hVar, i10, localDate, localDate2, i11, null), continuation);
    }
}
