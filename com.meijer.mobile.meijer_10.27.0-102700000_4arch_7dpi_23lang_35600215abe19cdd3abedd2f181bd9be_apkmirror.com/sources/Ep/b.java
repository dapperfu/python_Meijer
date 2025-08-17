package Ep;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.squareup.moshi.t;
import j$.time.LocalDateTime;
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
import zp.CustomerSavings;
import zp.DigitalReceiptsResponse;
import zp.ReceiptIdentifier;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B/\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"LEp/b;", "LEp/g;", "LXi/a;", "tokenProvider", "LBp/a;", "digitalReceiptsApi", "Lcom/squareup/moshi/t;", "moshi", "Lqv/K;", "ioDispatcher", "<init>", "(LXi/a;LBp/a;Lcom/squareup/moshi/t;Lqv/K;)V", "", "currentPage", "pageSize", "j$/time/LocalDateTime", "startDate", "endDate", "Lzp/d;", "a", "(IILj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzp/f;", "identifier", "Lzp/c;", "d", "(Lzp/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "year", "Lzp/a;", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LXi/a;", "LBp/a;", "c", "Lcom/squareup/moshi/t;", "Lqv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Xi.a tokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bp.a digitalReceiptsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t moshi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lzp/d;", "<anonymous>", "(Lqv/O;)Lzp/d;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.DigitalReceiptsDataSource$getDigitalReceipts$2", f = "DigitalReceiptsDataSource.kt", l = {59, 58}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super DigitalReceiptsResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f9387a;

        /* renamed from: b, reason: collision with root package name */
        int f9388b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalDateTime f9390d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LocalDateTime f9391e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9392f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f9393g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LocalDateTime localDateTime, LocalDateTime localDateTime2, int i10, int i11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f9390d = localDateTime;
            this.f9391e = localDateTime2;
            this.f9392f = i10;
            this.f9393g = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(this.f9390d, this.f9391e, this.f9392f, this.f9393g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super DigitalReceiptsResponse> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
        
            if (r14 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f9388b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r14)
                goto L6d
            L12:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1a:
                java.lang.Object r1 = r13.f9387a
                Bp.a r1 = (Bp.a) r1
                kotlin.ResultKt.b(r14)
                goto L3c
            L22:
                kotlin.ResultKt.b(r14)
                Ep.b r14 = Ep.b.this
                Bp.a r1 = Ep.b.e(r14)
                Ep.b r14 = Ep.b.this
                Xi.a r14 = Ep.b.g(r14)
                r13.f9387a = r1
                r13.f9388b = r3
                java.lang.Object r14 = r14.c(r13)
                if (r14 != r0) goto L3c
                goto L6c
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r14 = (com.meijer.mobile.authentication.core.model.BearerToken) r14
                j$.time.LocalDateTime r3 = r13.f9390d
                j$.time.format.DateTimeFormatter r4 = vk.C17590a.ISO_LOCAL_DATE_TIME
                java.lang.String r6 = r3.format(r4)
                java.lang.String r3 = "format(...)"
                kotlin.jvm.internal.Intrinsics.i(r6, r3)
                j$.time.LocalDateTime r5 = r13.f9391e
                java.lang.String r7 = r5.format(r4)
                kotlin.jvm.internal.Intrinsics.i(r7, r3)
                com.meijer.mobile.receipt.service.api.models.DigitalReceiptsRequest r5 = new com.meijer.mobile.receipt.service.api.models.DigitalReceiptsRequest
                int r8 = r13.f9392f
                int r9 = r13.f9393g
                r11 = 16
                r12 = 0
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                r3 = 0
                r13.f9387a = r3
                r13.f9388b = r2
                java.lang.Object r14 = r1.b(r14, r5, r13)
                if (r14 != r0) goto L6d
            L6c:
                return r0
            L6d:
                retrofit2.Response r14 = (retrofit2.Response) r14
                boolean r0 = r14.isSuccessful()
                if (r0 == 0) goto L96
                java.lang.Object r14 = r14.body()
                com.meijer.mobile.receipt.service.api.models.DigitalReceiptsResponseJson r14 = (com.meijer.mobile.receipt.service.api.models.DigitalReceiptsResponseJson) r14
                if (r14 == 0) goto L88
                int r0 = r13.f9393g
                int r1 = r13.f9392f
                zp.d r14 = Cp.c.a(r14, r0, r1)
                if (r14 == 0) goto L88
                return r14
            L88:
                zp.d r0 = new zp.d
                r6 = 31
                r7 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
            L96:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ep.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lzp/a;", "<anonymous>", "(Lqv/O;)Lzp/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.DigitalReceiptsDataSource$getSavingsForYear$2", f = "DigitalReceiptsDataSource.kt", l = {108, 107}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Ep.b$b, reason: collision with other inner class name */
    static final class C0132b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super CustomerSavings>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f9394a;

        /* renamed from: b, reason: collision with root package name */
        Object f9395b;

        /* renamed from: c, reason: collision with root package name */
        int f9396c;

        /* renamed from: d, reason: collision with root package name */
        int f9397d;

        /* renamed from: e, reason: collision with root package name */
        int f9398e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9399f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9401h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0132b(int i10, Continuation<? super C0132b> continuation) {
            super(2, continuation);
            this.f9401h = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0132b c0132b = b.this.new C0132b(this.f9401h, continuation);
            c0132b.f9399f = obj;
            return c0132b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super CustomerSavings> continuation) {
            return ((C0132b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[Catch: all -> 0x001b, TryCatch #3 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x0087, B:29:0x008f, B:30:0x00a1, B:31:0x00a6), top: B:53:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[Catch: all -> 0x001b, TryCatch #3 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x0087, B:29:0x008f, B:30:0x00a1, B:31:0x00a6), top: B:53:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ep.b.C0132b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lzp/c;", "<anonymous>", "(Lqv/O;)Lzp/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.DigitalReceiptsDataSource$viewReceipt$2", f = "DigitalReceiptsDataSource.kt", l = {81, BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super zp.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f9402a;

        /* renamed from: b, reason: collision with root package name */
        Object f9403b;

        /* renamed from: c, reason: collision with root package name */
        Object f9404c;

        /* renamed from: d, reason: collision with root package name */
        int f9405d;

        /* renamed from: e, reason: collision with root package name */
        int f9406e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9407f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ReceiptIdentifier f9409h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReceiptIdentifier receiptIdentifier, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f9409h = receiptIdentifier;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long g() {
            return 0L;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = b.this.new c(this.f9409h, continuation);
            cVar.f9407f = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super zp.c> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:7:0x0017, B:27:0x0096, B:29:0x009e, B:30:0x00a9, B:31:0x00ae), top: B:62:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:7:0x0017, B:27:0x0096, B:29:0x009e, B:30:0x00a9, B:31:0x00ae), top: B:62:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e2 A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:37:0x00c5, B:39:0x00c9, B:43:0x00d6, B:47:0x00e7, B:46:0x00e2), top: B:60:0x00c5 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00f2 A[PHI: r14
          0x00f2: PHI (r14v25 java.lang.Object) = (r14v12 java.lang.Object), (r14v14 java.lang.Object) binds: [B:36:0x00c3, B:49:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ep.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(Xi.a tokenProvider, Bp.a digitalReceiptsApi, t moshi, AbstractC16618K ioDispatcher) {
        Intrinsics.j(tokenProvider, "tokenProvider");
        Intrinsics.j(digitalReceiptsApi, "digitalReceiptsApi");
        Intrinsics.j(moshi, "moshi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.tokenProvider = tokenProvider;
        this.digitalReceiptsApi = digitalReceiptsApi;
        this.moshi = moshi;
        this.ioDispatcher = ioDispatcher;
    }

    @Override // Ep.h
    public Object a(int i10, int i11, LocalDateTime localDateTime, LocalDateTime localDateTime2, Continuation<? super DigitalReceiptsResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new a(localDateTime, localDateTime2, i11, i10, null), continuation);
    }

    @Override // Ep.a
    public Object b(int i10, Continuation<? super CustomerSavings> continuation) {
        return C16644i.g(this.ioDispatcher, new C0132b(i10, null), continuation);
    }

    @Override // Ep.f
    public Object d(ReceiptIdentifier receiptIdentifier, Continuation<? super zp.c> continuation) {
        return C16644i.g(this.ioDispatcher, new c(receiptIdentifier, null), continuation);
    }
}
