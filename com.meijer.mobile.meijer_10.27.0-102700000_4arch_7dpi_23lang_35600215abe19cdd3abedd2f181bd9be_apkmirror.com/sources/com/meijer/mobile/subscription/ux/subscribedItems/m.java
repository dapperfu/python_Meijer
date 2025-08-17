package com.meijer.mobile.subscription.ux.subscribedItems;

import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.subscription.ux.subscribedItems.q;
import cr.SubscriptionDetails;
import ir.C14758a;
import java.util.List;
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
import qv.C16648k;
import qv.InterfaceC16622O;
import sp.Y;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020$0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/m;", "Landroidx/lifecycle/c0;", "LRo/c;", "productsRepository", "Lsp/Y;", "productStateRepository", "Lir/a;", "subscriptionRepository", "<init>", "(LRo/c;Lsp/Y;Lir/a;)V", "", "s", "()V", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "r", "(Ljava/lang/String;)V", "a", "LRo/c;", "b", "Lsp/Y;", "c", "Lir/a;", "Ltv/B;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q;", "d", "Ltv/B;", "_productDetailsFlow", "Ltv/P;", "e", "Ltv/P;", "u", "()Ltv/P;", "productDetailsFlow", "Ltv/A;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/s;", "f", "Ltv/A;", "_navigationEvents", "Ltv/F;", "g", "Ltv/F;", "t", "()Ltv/F;", "navigationEvents", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Y productStateRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14758a subscriptionRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<q> _productDetailsFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<q> productDetailsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<s> _navigationEvents;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<s> navigationEvents;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemViewModel$fetchProductDetails$1", f = "SubscribedItemViewModel.kt", l = {74, 82}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f118841a;

        /* renamed from: b, reason: collision with root package name */
        Object f118842b;

        /* renamed from: c, reason: collision with root package name */
        Object f118843c;

        /* renamed from: d, reason: collision with root package name */
        Object f118844d;

        /* renamed from: e, reason: collision with root package name */
        int f118845e;

        /* renamed from: f, reason: collision with root package name */
        int f118846f;

        /* renamed from: g, reason: collision with root package name */
        int f118847g;

        /* renamed from: h, reason: collision with root package name */
        int f118848h;

        /* renamed from: i, reason: collision with root package name */
        int f118849i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f118850j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f118852l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f118852l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = m.this.new a(this.f118852l, continuation);
            aVar.f118850j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
        /* JADX WARN: Type inference failed for: r1v18, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f118849i
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L40
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r9.f118842b
                Co.h r0 = (Co.ProductFullDetails) r0
                java.lang.Object r0 = r9.f118841a
                java.lang.Object r1 = r9.f118850j
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r10)
                goto Lc8
            L1e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L26:
                java.lang.Object r1 = r9.f118844d
                qv.O r1 = (qv.InterfaceC16622O) r1
                java.lang.Object r1 = r9.f118843c
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r9.f118842b
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r9.f118841a
                qv.O r1 = (qv.InterfaceC16622O) r1
                java.lang.Object r1 = r9.f118850j
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L3e
                goto L6d
            L3e:
                r10 = move-exception
                goto L72
            L40:
                kotlin.ResultKt.b(r10)
                java.lang.Object r10 = r9.f118850j
                r1 = r10
                qv.O r1 = (qv.InterfaceC16622O) r1
                com.meijer.mobile.subscription.ux.subscribedItems.m r10 = com.meijer.mobile.subscription.ux.subscribedItems.m.this
                java.lang.String r5 = r9.f118852l
                kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3e
                Ro.c r10 = com.meijer.mobile.subscription.ux.subscribedItems.m.n(r10)     // Catch: java.lang.Exception -> L3e
                r9.f118850j = r1     // Catch: java.lang.Exception -> L3e
                r9.f118841a = r1     // Catch: java.lang.Exception -> L3e
                r9.f118842b = r9     // Catch: java.lang.Exception -> L3e
                r9.f118843c = r9     // Catch: java.lang.Exception -> L3e
                r9.f118844d = r1     // Catch: java.lang.Exception -> L3e
                r9.f118845e = r4     // Catch: java.lang.Exception -> L3e
                r9.f118846f = r4     // Catch: java.lang.Exception -> L3e
                r9.f118847g = r4     // Catch: java.lang.Exception -> L3e
                r9.f118848h = r4     // Catch: java.lang.Exception -> L3e
                r9.f118849i = r3     // Catch: java.lang.Exception -> L3e
                java.lang.Object r10 = r10.l(r5, r9)     // Catch: java.lang.Exception -> L3e
                if (r10 != r0) goto L6d
                goto Lc6
            L6d:
                java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Exception -> L3e
                goto L83
            L72:
                kotlin.coroutines.CoroutineContext r3 = r9.getContext()
                qv.E0.i(r3)
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
                java.lang.Object r10 = kotlin.ResultKt.a(r10)
                java.lang.Object r10 = kotlin.Result.b(r10)
            L83:
                com.meijer.mobile.subscription.ux.subscribedItems.m r3 = com.meijer.mobile.subscription.ux.subscribedItems.m.this
                boolean r5 = kotlin.Result.h(r10)
                if (r5 == 0) goto Lc9
                r5 = r10
                Co.h r5 = (Co.ProductFullDetails) r5
                uw.a$a r6 = uw.a.INSTANCE
                java.lang.String r7 = r5.toString()
                java.lang.Object[] r7 = new java.lang.Object[]{r7}
                java.lang.String r8 = "SubscribedItemViewModel::fetchProductDetails - Product details fetched successfully"
                r6.k(r8, r7)
                sp.Y r6 = com.meijer.mobile.subscription.ux.subscribedItems.m.m(r3)
                java.util.List r7 = kotlin.collections.CollectionsKt.e(r5)
                r6.j1(r7)
                tv.A r3 = com.meijer.mobile.subscription.ux.subscribedItems.m.p(r3)
                com.meijer.mobile.subscription.ux.subscribedItems.s$a r6 = new com.meijer.mobile.subscription.ux.subscribedItems.s$a
                r6.<init>(r5)
                r9.f118850j = r1
                r9.f118841a = r10
                r9.f118842b = r5
                r1 = 0
                r9.f118843c = r1
                r9.f118844d = r1
                r9.f118845e = r4
                r9.f118849i = r2
                java.lang.Object r1 = r3.emit(r6, r9)
                if (r1 != r0) goto Lc7
            Lc6:
                return r0
            Lc7:
                r0 = r10
            Lc8:
                r10 = r0
            Lc9:
                java.lang.Throwable r10 = kotlin.Result.e(r10)
                if (r10 == 0) goto Ld8
                uw.a$a r0 = uw.a.INSTANCE
                java.lang.String r1 = "Failed to fetch product details"
                java.lang.Object[] r2 = new java.lang.Object[r4]
                r0.f(r10, r1, r2)
            Ld8:
                kotlin.Unit r10 = kotlin.Unit.f142422a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscribedItems.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemViewModel$fetchSubscriptionData$1", f = "SubscribedItemViewModel.kt", l = {51}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118853a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f118855a;

            a(m mVar) {
                this.f118855a = mVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SubscriptionDetails> list, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC17140B interfaceC17140B = this.f118855a._productDetailsFlow;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, list.isEmpty() ? new q.Empty(null, 1, null) : new q.SubscriptionDetailsLoaded(list)));
                return Unit.f142422a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return m.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118853a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17152f<List<SubscriptionDetails>> interfaceC17152fC = m.this.subscriptionRepository.c();
                    a aVar = new a(m.this);
                    this.f118853a = 1;
                    if (interfaceC17152fC.collect(aVar, this) == objF) {
                        return objF;
                    }
                }
            } catch (Exception e10) {
                uw.a.INSTANCE.f(e10, "Failed to fetch subscription details", new Object[0]);
                m.this._productDetailsFlow.setValue(new q.Error(null, 1, null));
            }
            return Unit.f142422a;
        }
    }

    public m(Ro.c productsRepository, Y productStateRepository, C14758a subscriptionRepository) {
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(productStateRepository, "productStateRepository");
        Intrinsics.j(subscriptionRepository, "subscriptionRepository");
        this.productsRepository = productsRepository;
        this.productStateRepository = productStateRepository;
        this.subscriptionRepository = subscriptionRepository;
        InterfaceC17140B<q> interfaceC17140BA = S.a(q.c.f118862a);
        this._productDetailsFlow = interfaceC17140BA;
        this.productDetailsFlow = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<s> interfaceC17139AB = C17146H.b(0, 0, null, 6, null);
        this._navigationEvents = interfaceC17139AB;
        this.navigationEvents = C17154h.b(interfaceC17139AB);
    }

    public final void r(String code) {
        Intrinsics.j(code, "code");
        this._productDetailsFlow.setValue(q.c.f118862a);
        C16648k.d(d0.a(this), null, null, new a(code, null), 3, null);
    }

    public final void s() {
        this._productDetailsFlow.setValue(q.c.f118862a);
        C16648k.d(d0.a(this), null, null, new b(null), 3, null);
    }

    public final InterfaceC17144F<s> t() {
        return this.navigationEvents;
    }

    public final P<q> u() {
        return this.productDetailsFlow;
    }
}
