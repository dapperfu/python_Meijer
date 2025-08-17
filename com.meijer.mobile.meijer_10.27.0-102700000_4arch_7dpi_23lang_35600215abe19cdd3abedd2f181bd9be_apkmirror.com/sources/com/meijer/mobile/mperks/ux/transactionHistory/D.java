package com.meijer.mobile.mperks.ux.transactionHistory;

import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.mperks.networking.domain.models.MperkTransaction;
import com.meijer.mobile.mperks.ux.transactionHistory.AbstractC12683a;
import com.meijer.mobile.mperks.ux.transactionHistory.AbstractC12684b;
import com.meijer.mobile.mperks.ux.transactionHistory.H;
import eo.C13719g;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\u001d8\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/D;", "Landroidx/lifecycle/c0;", "Leo/g;", "rewardsRepository", "<init>", "(Leo/g;)V", "", "s", "()V", "", "maxItemCount", "", "continuationToken", "", "includeAdjustmentDetails", "isLoadMore", "t", "(ILjava/lang/String;Ljava/lang/Boolean;Z)V", "Lcom/meijer/mobile/mperks/ux/transactionHistory/b;", "action", "w", "(Lcom/meijer/mobile/mperks/ux/transactionHistory/b;)V", "a", "Leo/g;", "Ltv/B;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H;", "b", "Ltv/B;", "_transactionState", "Ltv/P;", "c", "Ltv/P;", "v", "()Ltv/P;", "transactionStateFlow", "Lcom/meijer/mobile/mperks/ux/transactionHistory/a;", "d", "_pointBalanceState", "e", "r", "pointBalanceStateFlow", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;", "f", "Ljava/util/List;", "currentTransactionsList", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class D extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13719g rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<H> _transactionState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<H> transactionStateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<AbstractC12683a> _pointBalanceState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<AbstractC12683a> pointBalanceStateFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<MperkTransaction> currentTransactionsList;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryViewModel$getPointsBalance$1", f = "TransactionHistoryViewModel.kt", l = {65}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114655a;

        /* renamed from: b, reason: collision with root package name */
        int f114656b;

        /* renamed from: c, reason: collision with root package name */
        int f114657c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f114658d;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = D.this.new a(continuation);
            aVar.f114658d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f114657c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r8.f114655a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r8.f114658d
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L42
            L18:
                r9 = move-exception
                goto L4d
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f114658d
                qv.O r9 = (qv.InterfaceC16622O) r9
                com.meijer.mobile.mperks.ux.transactionHistory.D r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L49
                eo.g r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.n(r1)     // Catch: java.lang.Throwable -> L49
                r8.f114658d = r9     // Catch: java.lang.Throwable -> L49
                r8.f114655a = r9     // Catch: java.lang.Throwable -> L49
                r8.f114656b = r3     // Catch: java.lang.Throwable -> L49
                r8.f114657c = r2     // Catch: java.lang.Throwable -> L49
                java.lang.Object r1 = r1.p(r8)     // Catch: java.lang.Throwable -> L49
                if (r1 != r0) goto L40
                return r0
            L40:
                r0 = r9
                r9 = r1
            L42:
                com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse r9 = (com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse) r9     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L57
            L49:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L4d:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            L57:
                com.meijer.mobile.mperks.ux.transactionHistory.D r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.this
                boolean r2 = kotlin.Result.h(r9)
                if (r2 == 0) goto Lbc
                r2 = r9
                com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse r2 = (com.meijer.mobile.mperks.networking.domain.models.MperksGetBalanceResponse) r2
                boolean r4 = r2.getSuccess()
                java.lang.String r5 = "mPerks_get_balance_response"
                if (r4 == 0) goto Laf
                uw.a$a r4 = uw.a.INSTANCE
                uw.a$b r4 = r4.x(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Point balance: "
                r5.append(r6)
                com.meijer.mobile.mperks.networking.domain.models.GetBalancePayload r6 = r2.getPayload()
                if (r6 == 0) goto L89
                int r6 = r6.getTotalPoints()
                java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.d(r6)
                goto L8a
            L89:
                r6 = 0
            L8a:
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.Object[] r6 = new java.lang.Object[r3]
                r4.q(r5, r6)
                tv.B r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.o(r1)
                com.meijer.mobile.mperks.ux.transactionHistory.a$c r4 = new com.meijer.mobile.mperks.ux.transactionHistory.a$c
                com.meijer.mobile.mperks.networking.domain.models.GetBalancePayload r2 = r2.getPayload()
                if (r2 == 0) goto La7
                int r2 = r2.getTotalPoints()
                goto La8
            La7:
                r2 = r3
            La8:
                r4.<init>(r2)
                r1.setValue(r4)
                goto Lbc
            Laf:
                uw.a$a r1 = uw.a.INSTANCE
                uw.a$b r1 = r1.x(r5)
                java.lang.String r2 = "No points balance."
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r1.q(r2, r4)
            Lbc:
                com.meijer.mobile.mperks.ux.transactionHistory.D r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.this
                java.lang.Throwable r9 = kotlin.Result.e(r9)
                if (r9 == 0) goto Le3
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                qv.E0.i(r0)
                boolean r0 = r9 instanceof java.lang.Error
                if (r0 != 0) goto Le2
                uw.a$a r0 = uw.a.INSTANCE
                java.lang.String r2 = "Failed to load Mperks Points balance."
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r0.f(r9, r2, r3)
                tv.B r9 = com.meijer.mobile.mperks.ux.transactionHistory.D.o(r1)
                com.meijer.mobile.mperks.ux.transactionHistory.a$a r0 = com.meijer.mobile.mperks.ux.transactionHistory.AbstractC12683a.C1821a.f114725a
                r9.setValue(r0)
                goto Le3
            Le2:
                throw r9
            Le3:
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.D.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryViewModel$getTransactionHistory$1", f = "TransactionHistoryViewModel.kt", l = {95}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114660a;

        /* renamed from: b, reason: collision with root package name */
        int f114661b;

        /* renamed from: c, reason: collision with root package name */
        int f114662c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f114663d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f114665f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f114666g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Boolean f114667h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f114668i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, String str, Boolean bool, boolean z10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f114665f = i10;
            this.f114666g = str;
            this.f114667h = bool;
            this.f114668i = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = D.this.new b(this.f114665f, this.f114666g, this.f114667h, this.f114668i, continuation);
            bVar.f114663d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.D.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public D(C13719g rewardsRepository) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        this.rewardsRepository = rewardsRepository;
        InterfaceC17140B<H> interfaceC17140BA = S.a(H.d.f114677a);
        this._transactionState = interfaceC17140BA;
        this.transactionStateFlow = interfaceC17140BA;
        InterfaceC17140B<AbstractC12683a> interfaceC17140BA2 = S.a(AbstractC12683a.b.f114726a);
        this._pointBalanceState = interfaceC17140BA2;
        this.pointBalanceStateFlow = interfaceC17140BA2;
        this.currentTransactionsList = CollectionsKt.m();
        s();
        u(this, 20, "", Boolean.TRUE, false, 8, null);
    }

    static /* synthetic */ void u(D d10, int i10, String str, Boolean bool, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        d10.t(i10, str, bool, z10);
    }

    public final P<AbstractC12683a> r() {
        return this.pointBalanceStateFlow;
    }

    public final P<H> v() {
        return this.transactionStateFlow;
    }

    public final void w(AbstractC12684b action) {
        Intrinsics.j(action, "action");
        if (!(action instanceof AbstractC12684b.FetchTransactions)) {
            throw new NoWhenBranchMatchedException();
        }
        this._transactionState.setValue(H.d.f114677a);
        AbstractC12684b.FetchTransactions fetchTransactions = (AbstractC12684b.FetchTransactions) action;
        t(fetchTransactions.getMaxItemCount(), fetchTransactions.getContinuationToken(), fetchTransactions.getIncludeAdjustmentDetails(), true);
    }

    private final void s() {
        C16648k.d(d0.a(this), null, null, new a(null), 3, null);
    }

    private final void t(int maxItemCount, String continuationToken, Boolean includeAdjustmentDetails, boolean isLoadMore) {
        C16648k.d(d0.a(this), null, null, new b(maxItemCount, continuationToken, includeAdjustmentDetails, isLoadMore, null), 3, null);
    }
}
