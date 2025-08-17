package Ep;

import com.squareup.moshi.t;
import j$.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;
import zp.DigitalReceipt;
import zp.ReceiptIdentifier;
import zp.c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 ¨\u0006!"}, d2 = {"LEp/e;", "LEp/f;", "LXi/a;", "tokenProvider", "LBp/b;", "nextGenReceiptsApi", "Lcom/squareup/moshi/t;", "moshi", "Lqv/K;", "ioDispatcher", "<init>", "(LXi/a;LBp/b;Lcom/squareup/moshi/t;Lqv/K;)V", "j$/time/LocalDate", "startDate", "endDate", "Lzp/h;", "sortOrder", "", "Lzp/b;", "e", "(Lj$/time/LocalDate;Lj$/time/LocalDate;Lzp/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzp/f;", "identifier", "Lzp/c$b;", "d", "(Lzp/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LXi/a;", "b", "LBp/b;", "c", "Lcom/squareup/moshi/t;", "Lqv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Xi.a tokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bp.b nextGenReceiptsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t moshi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "Lzp/b;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.NextGenReceiptsDataSource$getReceipts$2", f = "NextGenReceiptsDataSource.kt", l = {56, 55}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends DigitalReceipt>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f9450a;

        /* renamed from: b, reason: collision with root package name */
        Object f9451b;

        /* renamed from: c, reason: collision with root package name */
        Object f9452c;

        /* renamed from: d, reason: collision with root package name */
        Object f9453d;

        /* renamed from: e, reason: collision with root package name */
        Object f9454e;

        /* renamed from: f, reason: collision with root package name */
        int f9455f;

        /* renamed from: g, reason: collision with root package name */
        int f9456g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f9457h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalDate f9459j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LocalDate f9460k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ zp.h f9461l;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends DigitalReceipt>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<DigitalReceipt>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LocalDate localDate, LocalDate localDate2, zp.h hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f9459j = localDate;
            this.f9460k = localDate2;
            this.f9461l = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = e.this.new a(this.f9459j, this.f9460k, this.f9461l, continuation);
            aVar.f9457h = obj;
            return aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<DigitalReceipt>> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:7:0x0019, B:27:0x00c0, B:29:0x00c8, B:30:0x00e0, B:32:0x00e6, B:33:0x00f4, B:34:0x00f9, B:35:0x00fe, B:19:0x0061), top: B:53:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f9 A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:7:0x0019, B:27:0x00c0, B:29:0x00c8, B:30:0x00e0, B:32:0x00e6, B:33:0x00f4, B:34:0x00f9, B:35:0x00fe, B:19:0x0061), top: B:53:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ep.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lzp/c$b;", "<anonymous>", "(Lqv/O;)Lzp/c$b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.NextGenReceiptsDataSource$viewReceipt$2", f = "NextGenReceiptsDataSource.kt", l = {83, 82}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super c.Pdf>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f9462a;

        /* renamed from: b, reason: collision with root package name */
        Object f9463b;

        /* renamed from: c, reason: collision with root package name */
        Object f9464c;

        /* renamed from: d, reason: collision with root package name */
        int f9465d;

        /* renamed from: e, reason: collision with root package name */
        int f9466e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9467f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ReceiptIdentifier f9469h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReceiptIdentifier receiptIdentifier, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f9469h = receiptIdentifier;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = e.this.new b(this.f9469h, continuation);
            bVar.f9467f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super c.Pdf> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x001a, B:29:0x0093, B:31:0x009b, B:32:0x00ad, B:33:0x00b2, B:23:0x0076, B:25:0x007e, B:34:0x00b3, B:35:0x00ba, B:19:0x0056), top: B:48:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x001a, B:29:0x0093, B:31:0x009b, B:32:0x00ad, B:33:0x00b2, B:23:0x0076, B:25:0x007e, B:34:0x00b3, B:35:0x00ba, B:19:0x0056), top: B:48:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ep.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(Xi.a tokenProvider, Bp.b nextGenReceiptsApi, t moshi, AbstractC16618K ioDispatcher) {
        Intrinsics.j(tokenProvider, "tokenProvider");
        Intrinsics.j(nextGenReceiptsApi, "nextGenReceiptsApi");
        Intrinsics.j(moshi, "moshi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.tokenProvider = tokenProvider;
        this.nextGenReceiptsApi = nextGenReceiptsApi;
        this.moshi = moshi;
        this.ioDispatcher = ioDispatcher;
    }

    @Override // Ep.f
    public Object d(ReceiptIdentifier receiptIdentifier, Continuation<? super c.Pdf> continuation) {
        return C16644i.g(this.ioDispatcher, new b(receiptIdentifier, null), continuation);
    }

    public final Object e(LocalDate localDate, LocalDate localDate2, zp.h hVar, Continuation<? super List<DigitalReceipt>> continuation) {
        return C16644i.g(this.ioDispatcher, new a(localDate, localDate2, hVar, null), continuation);
    }
}
