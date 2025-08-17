package Ep;

import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.receipt.service.api.models.SubmitTransactionResponse;
import kotlin.Metadata;
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
import zp.TransactionDetails;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LEp/i;", "", "LXi/a;", "userTokenGateway", "LBp/c;", "transactionsApi", "Lqv/K;", "ioDispatcher", "<init>", "(LXi/a;LBp/c;Lqv/K;)V", "Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionResponse;", "response", "", "f", "(Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionResponse;)V", "Lzp/i;", "transactionDetails", "d", "(Lzp/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "barcode", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LXi/a;", "b", "LBp/c;", "c", "Lqv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Xi.a userTokenGateway;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bp.c transactionsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.SubmitTransactionDataSource$submitManualTransactionInfo$2", f = "SubmitTransactionDataSource.kt", l = {34, 33}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f9473a;

        /* renamed from: b, reason: collision with root package name */
        Object f9474b;

        /* renamed from: c, reason: collision with root package name */
        Object f9475c;

        /* renamed from: d, reason: collision with root package name */
        int f9476d;

        /* renamed from: e, reason: collision with root package name */
        int f9477e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9478f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TransactionDetails f9480h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TransactionDetails transactionDetails, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f9480h = transactionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = i.this.new a(this.f9480h, continuation);
            aVar.f9478f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
        
            if (r8 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f9477e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3b
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r0 = r7.f9473a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r7.f9478f
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L1a
                goto L82
            L1a:
                r8 = move-exception
                goto L9e
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                int r1 = r7.f9476d
                java.lang.Object r3 = r7.f9475c
                Bp.c r3 = (Bp.c) r3
                java.lang.Object r4 = r7.f9474b
                qv.O r4 = (qv.InterfaceC16622O) r4
                java.lang.Object r5 = r7.f9473a
                zp.i r5 = (zp.TransactionDetails) r5
                java.lang.Object r6 = r7.f9478f
                qv.O r6 = (qv.InterfaceC16622O) r6
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L1a
                goto L68
            L3b:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f9478f
                r4 = r8
                qv.O r4 = (qv.InterfaceC16622O) r4
                Ep.i r8 = Ep.i.this
                zp.i r5 = r7.f9480h
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L1a
                Bp.c r1 = Ep.i.a(r8)     // Catch: java.lang.Throwable -> L1a
                Xi.a r8 = Ep.i.b(r8)     // Catch: java.lang.Throwable -> L1a
                r7.f9478f = r4     // Catch: java.lang.Throwable -> L1a
                r7.f9473a = r5     // Catch: java.lang.Throwable -> L1a
                r7.f9474b = r4     // Catch: java.lang.Throwable -> L1a
                r7.f9475c = r1     // Catch: java.lang.Throwable -> L1a
                r6 = 0
                r7.f9476d = r6     // Catch: java.lang.Throwable -> L1a
                r7.f9477e = r3     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r8 = r8.c(r7)     // Catch: java.lang.Throwable -> L1a
                if (r8 != r0) goto L65
                goto L81
            L65:
                r3 = r1
                r1 = r6
                r6 = r4
            L68:
                com.meijer.mobile.authentication.core.model.BearerToken r8 = (com.meijer.mobile.authentication.core.model.BearerToken) r8     // Catch: java.lang.Throwable -> L1a
                com.meijer.mobile.receipt.service.api.models.SubmitTransactionRequest r5 = Cp.g.a(r5)     // Catch: java.lang.Throwable -> L1a
                r7.f9478f = r6     // Catch: java.lang.Throwable -> L1a
                r7.f9473a = r4     // Catch: java.lang.Throwable -> L1a
                r4 = 0
                r7.f9474b = r4     // Catch: java.lang.Throwable -> L1a
                r7.f9475c = r4     // Catch: java.lang.Throwable -> L1a
                r7.f9476d = r1     // Catch: java.lang.Throwable -> L1a
                r7.f9477e = r2     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r8 = r3.b(r8, r5, r7)     // Catch: java.lang.Throwable -> L1a
                if (r8 != r0) goto L82
            L81:
                return r0
            L82:
                retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Throwable -> L1a
                boolean r0 = r8.isSuccessful()     // Catch: java.lang.Throwable -> L1a
                if (r0 == 0) goto L98
                java.lang.Object r8 = r8.body()     // Catch: java.lang.Throwable -> L1a
                kotlin.jvm.internal.Intrinsics.g(r8)     // Catch: java.lang.Throwable -> L1a
                com.meijer.mobile.receipt.service.api.models.SubmitTransactionResponse r8 = (com.meijer.mobile.receipt.service.api.models.SubmitTransactionResponse) r8     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L1a
                goto La8
            L98:
                retrofit2.HttpException r0 = new retrofit2.HttpException     // Catch: java.lang.Throwable -> L1a
                r0.<init>(r8)     // Catch: java.lang.Throwable -> L1a
                throw r0     // Catch: java.lang.Throwable -> L1a
            L9e:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            La8:
                Ep.i r0 = Ep.i.this
                boolean r1 = kotlin.Result.h(r8)
                if (r1 == 0) goto Lc3
                com.meijer.mobile.receipt.service.api.models.SubmitTransactionResponse r8 = (com.meijer.mobile.receipt.service.api.models.SubmitTransactionResponse) r8     // Catch: java.lang.Throwable -> Lbc
                Ep.i.c(r0, r8)     // Catch: java.lang.Throwable -> Lbc
                kotlin.Unit r8 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> Lbc
                java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> Lbc
                goto Lc7
            Lbc:
                r8 = move-exception
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
            Lc3:
                java.lang.Object r8 = kotlin.Result.b(r8)
            Lc7:
                kotlin.ResultKt.b(r8)
                kotlin.Unit r8 = kotlin.Unit.f142422a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Ep.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.receipt.service.domain.SubmitTransactionDataSource$submitTransactionBarcode$2", f = "SubmitTransactionDataSource.kt", l = {45, 44}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f9481a;

        /* renamed from: b, reason: collision with root package name */
        Object f9482b;

        /* renamed from: c, reason: collision with root package name */
        Object f9483c;

        /* renamed from: d, reason: collision with root package name */
        int f9484d;

        /* renamed from: e, reason: collision with root package name */
        int f9485e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9486f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f9488h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f9488h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = i.this.new b(this.f9488h, continuation);
            bVar.f9486f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x001b, TryCatch #3 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x008a, B:29:0x0092, B:30:0x00a0, B:31:0x00a5), top: B:60:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[Catch: all -> 0x001b, TryCatch #3 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x008a, B:29:0x0092, B:30:0x00a0, B:31:0x00a5), top: B:60:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00f7 A[PHI: r10
          0x00f7: PHI (r10v28 java.lang.Object) = (r10v20 java.lang.Object), (r10v22 java.lang.Object) binds: [B:47:0x00e2, B:51:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ep.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i(Xi.a userTokenGateway, Bp.c transactionsApi, AbstractC16618K ioDispatcher) {
        Intrinsics.j(userTokenGateway, "userTokenGateway");
        Intrinsics.j(transactionsApi, "transactionsApi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.userTokenGateway = userTokenGateway;
        this.transactionsApi = transactionsApi;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(SubmitTransactionResponse response) {
        j jVarE = j.INSTANCE.a(response.getStatusCode()).e(response.getMessage());
        if (jVarE == j.f9490d) {
            jVarE = null;
        }
        if (jVarE != null) {
            throw RetrofitException.Companion.f(RetrofitException.INSTANCE, jVarE, null, 2, null);
        }
    }

    public final Object d(TransactionDetails transactionDetails, Continuation<? super Unit> continuation) {
        Object objG = C16644i.g(this.ioDispatcher, new a(transactionDetails, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    public final Object e(String str, Continuation<? super Unit> continuation) {
        Object objG = C16644i.g(this.ioDispatcher, new b(str, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }
}
