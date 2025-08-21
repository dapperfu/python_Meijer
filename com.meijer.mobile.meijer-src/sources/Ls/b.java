package Ls;

import Js.WeeklyAdItem;
import j$.time.LocalDate;
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

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LLs/b;", "", "LKs/b;", "dataSource", "Lmv/K;", "ioDispatcher", "<init>", "(LKs/b;Lmv/K;)V", "LJs/b;", "itemFromList", "itemDetails", "d", "(LJs/b;LJs/b;)LJs/b;", "", "productId", "publicationId", "c", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LKs/b;", "b", "Lmv/K;", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ks.b dataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LJs/b;", "<anonymous>", "(Lmv/O;)LJs/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.calls.GetFlippWeeklyAdProductDetailsCall$call$2", f = "GetFlippWeeklyAdProductDetailsCall.kt", l = {57, 58, 58, 60, 63}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super WeeklyAdItem>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19466a;

        /* renamed from: b, reason: collision with root package name */
        Object f19467b;

        /* renamed from: c, reason: collision with root package name */
        Object f19468c;

        /* renamed from: d, reason: collision with root package name */
        Object f19469d;

        /* renamed from: e, reason: collision with root package name */
        int f19470e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f19471f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f19472g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f19473h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f19474i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LJs/b;", "<anonymous>", "(Lmv/O;)LJs/b;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.calls.GetFlippWeeklyAdProductDetailsCall$call$2$detailItem$1", f = "GetFlippWeeklyAdProductDetailsCall.kt", l = {54}, m = "invokeSuspend")
        /* renamed from: Ls.b$a$a, reason: collision with other inner class name */
        static final class C0343a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super WeeklyAdItem>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f19475a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f19476b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f19477c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0343a(b bVar, int i10, Continuation<? super C0343a> continuation) {
                super(2, continuation);
                this.f19476b = bVar;
                this.f19477c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0343a(this.f19476b, this.f19477c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super WeeklyAdItem> continuation) {
                return ((C0343a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f19475a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Ks.b bVar = this.f19476b.dataSource;
                int i11 = this.f19477c;
                this.f19475a = 1;
                Object objE = bVar.e(i11, this);
                if (objE == objF) {
                    return objF;
                }
                return objE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LJs/b;", "<anonymous>", "(Lmv/O;)LJs/b;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.calls.GetFlippWeeklyAdProductDetailsCall$call$2$itemFromList$1", f = "GetFlippWeeklyAdProductDetailsCall.kt", l = {52}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: Ls.b$a$b, reason: collision with other inner class name */
        static final class C0344b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super WeeklyAdItem>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f19478a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f19479b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f19480c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f19481d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0344b(b bVar, int i10, int i11, Continuation<? super C0344b> continuation) {
                super(2, continuation);
                this.f19479b = bVar;
                this.f19480c = i10;
                this.f19481d = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0344b(this.f19479b, this.f19480c, this.f19481d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super WeeklyAdItem> continuation) {
                return ((C0344b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f19478a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Ks.b bVar = this.f19479b.dataSource;
                    int i11 = this.f19480c;
                    this.f19478a = 1;
                    obj = bVar.f(i11, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                int i12 = this.f19481d;
                for (Object obj2 : (Iterable) obj) {
                    if (((WeeklyAdItem) obj2).getItemId() == i12) {
                        return obj2;
                    }
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, b bVar, int i11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f19472g = i10;
            this.f19473h = bVar;
            this.f19474i = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f19472g, this.f19473h, this.f19474i, continuation);
            aVar.f19471f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super WeeklyAdItem> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x013c A[EDGE_INSN: B:49:0x013c->B:47:0x013c BREAK  A[LOOP:0: B:42:0x0124->B:51:?], SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ls.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(Ks.b dataSource, AbstractC15779K ioDispatcher) {
        Intrinsics.j(dataSource, "dataSource");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.dataSource = dataSource;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeeklyAdItem d(WeeklyAdItem itemFromList, WeeklyAdItem itemDetails) {
        if (itemFromList == null) {
            return null;
        }
        LocalDate startDate = itemDetails.getStartDate();
        if (startDate == null) {
            startDate = itemFromList.getStartDate();
        }
        LocalDate localDate = startDate;
        LocalDate endDate = itemDetails.getEndDate();
        if (endDate == null) {
            endDate = itemFromList.getEndDate();
        }
        return WeeklyAdItem.b(itemDetails, 0, 0, null, null, null, 0, 0, localDate, endDate, null, 0L, null, null, null, null, null, null, null, false, null, null, null, 4193919, null);
    }

    public final Object c(int i10, int i11, Continuation<? super WeeklyAdItem> continuation) {
        return C15805i.g(this.ioDispatcher, new a(i11, this, i10, null), continuation);
    }
}
