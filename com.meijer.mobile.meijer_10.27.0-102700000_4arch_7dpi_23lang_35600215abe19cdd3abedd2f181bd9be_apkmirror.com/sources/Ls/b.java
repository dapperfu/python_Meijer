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
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LLs/b;", "", "LKs/b;", "dataSource", "Lqv/K;", "ioDispatcher", "<init>", "(LKs/b;Lqv/K;)V", "LJs/b;", "itemFromList", "itemDetails", "d", "(LJs/b;LJs/b;)LJs/b;", "", "productId", "publicationId", "c", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LKs/b;", "b", "Lqv/K;", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ks.b dataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LJs/b;", "<anonymous>", "(Lqv/O;)LJs/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.calls.GetFlippWeeklyAdProductDetailsCall$call$2", f = "GetFlippWeeklyAdProductDetailsCall.kt", l = {57, 58, 58, 60, 63}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super WeeklyAdItem>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f18722a;

        /* renamed from: b, reason: collision with root package name */
        Object f18723b;

        /* renamed from: c, reason: collision with root package name */
        Object f18724c;

        /* renamed from: d, reason: collision with root package name */
        Object f18725d;

        /* renamed from: e, reason: collision with root package name */
        int f18726e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f18727f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f18728g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b f18729h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f18730i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LJs/b;", "<anonymous>", "(Lqv/O;)LJs/b;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.calls.GetFlippWeeklyAdProductDetailsCall$call$2$detailItem$1", f = "GetFlippWeeklyAdProductDetailsCall.kt", l = {54}, m = "invokeSuspend")
        /* renamed from: Ls.b$a$a, reason: collision with other inner class name */
        static final class C0320a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super WeeklyAdItem>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f18731a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f18732b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f18733c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0320a(b bVar, int i10, Continuation<? super C0320a> continuation) {
                super(2, continuation);
                this.f18732b = bVar;
                this.f18733c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0320a(this.f18732b, this.f18733c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super WeeklyAdItem> continuation) {
                return ((C0320a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f18731a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Ks.b bVar = this.f18732b.dataSource;
                int i11 = this.f18733c;
                this.f18731a = 1;
                Object objE = bVar.e(i11, this);
                if (objE == objF) {
                    return objF;
                }
                return objE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LJs/b;", "<anonymous>", "(Lqv/O;)LJs/b;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.calls.GetFlippWeeklyAdProductDetailsCall$call$2$itemFromList$1", f = "GetFlippWeeklyAdProductDetailsCall.kt", l = {52}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: Ls.b$a$b, reason: collision with other inner class name */
        static final class C0321b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super WeeklyAdItem>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f18734a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f18735b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f18736c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f18737d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0321b(b bVar, int i10, int i11, Continuation<? super C0321b> continuation) {
                super(2, continuation);
                this.f18735b = bVar;
                this.f18736c = i10;
                this.f18737d = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0321b(this.f18735b, this.f18736c, this.f18737d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super WeeklyAdItem> continuation) {
                return ((C0321b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f18734a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Ks.b bVar = this.f18735b.dataSource;
                    int i11 = this.f18736c;
                    this.f18734a = 1;
                    obj = bVar.f(i11, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                int i12 = this.f18737d;
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
            this.f18728g = i10;
            this.f18729h = bVar;
            this.f18730i = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f18728g, this.f18729h, this.f18730i, continuation);
            aVar.f18727f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super WeeklyAdItem> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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

    public b(Ks.b dataSource, AbstractC16618K ioDispatcher) {
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
        return C16644i.g(this.ioDispatcher, new a(i11, this, i10, null), continuation);
    }
}
