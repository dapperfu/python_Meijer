package com.meijer.mobile.mperks.ux.transactionHistory;

import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.mperks.networking.domain.models.MperksTransaction;
import com.meijer.mobile.mperks.ux.transactionHistory.AbstractC12809a;
import com.meijer.mobile.mperks.ux.transactionHistory.AbstractC12810b;
import com.meijer.mobile.mperks.ux.transactionHistory.H;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\u001d8\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/D;", "Landroidx/lifecycle/c0;", "Lfo/e;", "rewardsRepository", "<init>", "(Lfo/e;)V", "", "s", "()V", "", "maxItemCount", "", "continuationToken", "", "includeAdjustmentDetails", "isLoadMore", "t", "(ILjava/lang/String;Ljava/lang/Boolean;Z)V", "Lcom/meijer/mobile/mperks/ux/transactionHistory/b;", "action", "w", "(Lcom/meijer/mobile/mperks/ux/transactionHistory/b;)V", "a", "Lfo/e;", "Lpv/B;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H;", "b", "Lpv/B;", "_transactionState", "Lpv/P;", "c", "Lpv/P;", "v", "()Lpv/P;", "transactionStateFlow", "Lcom/meijer/mobile/mperks/ux/transactionHistory/a;", "d", "_pointBalanceState", "e", "r", "pointBalanceStateFlow", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "f", "Ljava/util/List;", "currentTransactionsList", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class D extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fo.e rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<H> _transactionState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<H> transactionStateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<AbstractC12809a> _pointBalanceState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<AbstractC12809a> pointBalanceStateFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<MperksTransaction> currentTransactionsList;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryViewModel$getPointsBalance$1", f = "TransactionHistoryViewModel.kt", l = {65}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115600a;

        /* renamed from: b, reason: collision with root package name */
        int f115601b;

        /* renamed from: c, reason: collision with root package name */
        int f115602c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f115603d;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = D.this.new a(continuation);
            aVar.f115603d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f115602c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r8.f115600a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r8.f115603d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L42
            L18:
                r9 = move-exception
                goto L55
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f115603d
                mv.O r9 = (mv.InterfaceC15783O) r9
                com.meijer.mobile.mperks.ux.transactionHistory.D r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L51
                fo.e r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.n(r1)     // Catch: java.lang.Throwable -> L51
                r8.f115603d = r9     // Catch: java.lang.Throwable -> L51
                r8.f115600a = r9     // Catch: java.lang.Throwable -> L51
                r8.f115601b = r3     // Catch: java.lang.Throwable -> L51
                r8.f115602c = r2     // Catch: java.lang.Throwable -> L51
                java.lang.Object r1 = r1.l(r8)     // Catch: java.lang.Throwable -> L51
                if (r1 != r0) goto L40
                return r0
            L40:
                r0 = r9
                r9 = r1
            L42:
                java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L18
                int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L18
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.d(r9)     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L5f
            L51:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L55:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            L5f:
                com.meijer.mobile.mperks.ux.transactionHistory.D r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.this
                boolean r2 = kotlin.Result.h(r9)
                if (r2 == 0) goto L98
                r2 = r9
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                qw.a$a r4 = qw.a.INSTANCE
                java.lang.String r5 = "mperks_get_balance"
                qw.a$b r4 = r4.z(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Point balance: "
                r5.append(r6)
                r5.append(r2)
                java.lang.String r5 = r5.toString()
                java.lang.Object[] r6 = new java.lang.Object[r3]
                r4.q(r5, r6)
                pv.B r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.o(r1)
                com.meijer.mobile.mperks.ux.transactionHistory.a$c r4 = new com.meijer.mobile.mperks.ux.transactionHistory.a$c
                r4.<init>(r2)
                r1.setValue(r4)
            L98:
                com.meijer.mobile.mperks.ux.transactionHistory.D r1 = com.meijer.mobile.mperks.ux.transactionHistory.D.this
                java.lang.Throwable r9 = kotlin.Result.e(r9)
                if (r9 == 0) goto Lbf
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r9 instanceof java.lang.Error
                if (r0 != 0) goto Lbe
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r2 = "Failed to load Mperks Points balance."
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r0.f(r9, r2, r3)
                pv.B r9 = com.meijer.mobile.mperks.ux.transactionHistory.D.o(r1)
                com.meijer.mobile.mperks.ux.transactionHistory.a$a r0 = com.meijer.mobile.mperks.ux.transactionHistory.AbstractC12809a.C1828a.f115670a
                r9.setValue(r0)
                goto Lbf
            Lbe:
                throw r9
            Lbf:
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.transactionHistory.D.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.transactionHistory.TransactionHistoryViewModel$getTransactionHistory$1", f = "TransactionHistoryViewModel.kt", l = {86}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115605a;

        /* renamed from: b, reason: collision with root package name */
        int f115606b;

        /* renamed from: c, reason: collision with root package name */
        int f115607c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f115608d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f115610f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f115611g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Boolean f115612h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f115613i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, String str, Boolean bool, boolean z10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f115610f = i10;
            this.f115611g = str;
            this.f115612h = bool;
            this.f115613i = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = D.this.new b(this.f115610f, this.f115611g, this.f115612h, this.f115613i, continuation);
            bVar.f115608d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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

    public D(fo.e rewardsRepository) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        this.rewardsRepository = rewardsRepository;
        InterfaceC16549B<H> interfaceC16549BA = S.a(H.d.f115622a);
        this._transactionState = interfaceC16549BA;
        this.transactionStateFlow = interfaceC16549BA;
        InterfaceC16549B<AbstractC12809a> interfaceC16549BA2 = S.a(AbstractC12809a.b.f115671a);
        this._pointBalanceState = interfaceC16549BA2;
        this.pointBalanceStateFlow = interfaceC16549BA2;
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

    public final P<AbstractC12809a> r() {
        return this.pointBalanceStateFlow;
    }

    public final P<H> v() {
        return this.transactionStateFlow;
    }

    public final void w(AbstractC12810b action) {
        Intrinsics.j(action, "action");
        if (!(action instanceof AbstractC12810b.FetchTransactions)) {
            throw new NoWhenBranchMatchedException();
        }
        this._transactionState.setValue(H.d.f115622a);
        AbstractC12810b.FetchTransactions fetchTransactions = (AbstractC12810b.FetchTransactions) action;
        t(fetchTransactions.getMaxItemCount(), fetchTransactions.getContinuationToken(), fetchTransactions.getIncludeAdjustmentDetails(), true);
    }

    private final void s() {
        C15809k.d(d0.a(this), null, null, new a(null), 3, null);
    }

    private final void t(int maxItemCount, String continuationToken, Boolean includeAdjustmentDetails, boolean isLoadMore) {
        C15809k.d(d0.a(this), null, null, new b(maxItemCount, continuationToken, includeAdjustmentDetails, isLoadMore, null), 3, null);
    }
}
