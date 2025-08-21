package com.meijer.mobile.subscription.ux.subscribedItems;

import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.subscription.ux.subscribedItems.q;
import cr.SubscriptionDetails;
import ir.C14846a;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import sp.Y;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\n2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020$0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/m;", "Landroidx/lifecycle/c0;", "LRo/c;", "productsRepository", "Lsp/Y;", "productStateRepository", "Lir/a;", "subscriptionRepository", "<init>", "(LRo/c;Lsp/Y;Lir/a;)V", "", "s", "()V", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "r", "(Ljava/lang/String;)V", "a", "LRo/c;", "b", "Lsp/Y;", "c", "Lir/a;", "Lpv/B;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q;", "d", "Lpv/B;", "_productDetailsFlow", "Lpv/P;", "e", "Lpv/P;", "u", "()Lpv/P;", "productDetailsFlow", "Lpv/A;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/s;", "f", "Lpv/A;", "_navigationEvents", "Lpv/F;", "g", "Lpv/F;", "t", "()Lpv/F;", "navigationEvents", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Y productStateRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14846a subscriptionRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<q> _productDetailsFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<q> productDetailsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<s> _navigationEvents;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<s> navigationEvents;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemViewModel$fetchProductDetails$1", f = "SubscribedItemViewModel.kt", l = {74, 82}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f119789a;

        /* renamed from: b, reason: collision with root package name */
        Object f119790b;

        /* renamed from: c, reason: collision with root package name */
        Object f119791c;

        /* renamed from: d, reason: collision with root package name */
        Object f119792d;

        /* renamed from: e, reason: collision with root package name */
        int f119793e;

        /* renamed from: f, reason: collision with root package name */
        int f119794f;

        /* renamed from: g, reason: collision with root package name */
        int f119795g;

        /* renamed from: h, reason: collision with root package name */
        int f119796h;

        /* renamed from: i, reason: collision with root package name */
        int f119797i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f119798j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f119800l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f119800l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = m.this.new a(this.f119800l, continuation);
            aVar.f119798j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
        /* JADX WARN: Type inference failed for: r1v18, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f119797i
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L40
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r9.f119790b
                Co.h r0 = (Co.ProductFullDetails) r0
                java.lang.Object r0 = r9.f119789a
                java.lang.Object r1 = r9.f119798j
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r10)
                goto Lc8
            L1e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L26:
                java.lang.Object r1 = r9.f119792d
                mv.O r1 = (mv.InterfaceC15783O) r1
                java.lang.Object r1 = r9.f119791c
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r9.f119790b
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r9.f119789a
                mv.O r1 = (mv.InterfaceC15783O) r1
                java.lang.Object r1 = r9.f119798j
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L3e
                goto L6d
            L3e:
                r10 = move-exception
                goto L72
            L40:
                kotlin.ResultKt.b(r10)
                java.lang.Object r10 = r9.f119798j
                r1 = r10
                mv.O r1 = (mv.InterfaceC15783O) r1
                com.meijer.mobile.subscription.ux.subscribedItems.m r10 = com.meijer.mobile.subscription.ux.subscribedItems.m.this
                java.lang.String r5 = r9.f119800l
                kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3e
                Ro.c r10 = com.meijer.mobile.subscription.ux.subscribedItems.m.n(r10)     // Catch: java.lang.Exception -> L3e
                r9.f119798j = r1     // Catch: java.lang.Exception -> L3e
                r9.f119789a = r1     // Catch: java.lang.Exception -> L3e
                r9.f119790b = r9     // Catch: java.lang.Exception -> L3e
                r9.f119791c = r9     // Catch: java.lang.Exception -> L3e
                r9.f119792d = r1     // Catch: java.lang.Exception -> L3e
                r9.f119793e = r4     // Catch: java.lang.Exception -> L3e
                r9.f119794f = r4     // Catch: java.lang.Exception -> L3e
                r9.f119795g = r4     // Catch: java.lang.Exception -> L3e
                r9.f119796h = r4     // Catch: java.lang.Exception -> L3e
                r9.f119797i = r3     // Catch: java.lang.Exception -> L3e
                java.lang.Object r10 = r10.l(r5, r9)     // Catch: java.lang.Exception -> L3e
                if (r10 != r0) goto L6d
                goto Lc6
            L6d:
                java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Exception -> L3e
                goto L83
            L72:
                kotlin.coroutines.CoroutineContext r3 = r9.getContext()
                mv.E0.i(r3)
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
                java.lang.Object r10 = kotlin.ResultKt.a(r10)
                java.lang.Object r10 = kotlin.Result.b(r10)
            L83:
                com.meijer.mobile.subscription.ux.subscribedItems.m r3 = com.meijer.mobile.subscription.ux.subscribedItems.m.this
                boolean r5 = kotlin.Result.h(r10)
                if (r5 == 0) goto Lc9
                r5 = r10
                Co.h r5 = (Co.ProductFullDetails) r5
                qw.a$a r6 = qw.a.INSTANCE
                java.lang.String r7 = r5.toString()
                java.lang.Object[] r7 = new java.lang.Object[]{r7}
                java.lang.String r8 = "SubscribedItemViewModel::fetchProductDetails - Product details fetched successfully"
                r6.k(r8, r7)
                sp.Y r6 = com.meijer.mobile.subscription.ux.subscribedItems.m.m(r3)
                java.util.List r7 = kotlin.collections.CollectionsKt.e(r5)
                r6.j1(r7)
                pv.A r3 = com.meijer.mobile.subscription.ux.subscribedItems.m.p(r3)
                com.meijer.mobile.subscription.ux.subscribedItems.s$a r6 = new com.meijer.mobile.subscription.ux.subscribedItems.s$a
                r6.<init>(r5)
                r9.f119798j = r1
                r9.f119789a = r10
                r9.f119790b = r5
                r1 = 0
                r9.f119791c = r1
                r9.f119792d = r1
                r9.f119793e = r4
                r9.f119797i = r2
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
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r1 = "Failed to fetch product details"
                java.lang.Object[] r2 = new java.lang.Object[r4]
                r0.f(r10, r1, r2)
            Ld8:
                kotlin.Unit r10 = kotlin.Unit.f143329a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscribedItems.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemViewModel$fetchSubscriptionData$1", f = "SubscribedItemViewModel.kt", l = {51}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f119801a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f119803a;

            a(m mVar) {
                this.f119803a = mVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SubscriptionDetails> list, Continuation<? super Unit> continuation) {
                Object value;
                InterfaceC16549B interfaceC16549B = this.f119803a._productDetailsFlow;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, list.isEmpty() ? new q.Empty(null, 1, null) : new q.SubscriptionDetailsLoaded(list)));
                return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f119801a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16561f<List<SubscriptionDetails>> interfaceC16561fD = m.this.subscriptionRepository.d();
                    a aVar = new a(m.this);
                    this.f119801a = 1;
                    if (interfaceC16561fD.collect(aVar, this) == objF) {
                        return objF;
                    }
                }
            } catch (Exception e10) {
                qw.a.INSTANCE.f(e10, "Failed to fetch subscription details", new Object[0]);
                m.this._productDetailsFlow.setValue(new q.Error(null, 1, null));
            }
            return Unit.f143329a;
        }
    }

    public m(Ro.c productsRepository, Y productStateRepository, C14846a subscriptionRepository) {
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(productStateRepository, "productStateRepository");
        Intrinsics.j(subscriptionRepository, "subscriptionRepository");
        this.productsRepository = productsRepository;
        this.productStateRepository = productStateRepository;
        this.subscriptionRepository = subscriptionRepository;
        InterfaceC16549B<q> interfaceC16549BA = S.a(q.c.f119810a);
        this._productDetailsFlow = interfaceC16549BA;
        this.productDetailsFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<s> interfaceC16548AB = C16555H.b(0, 0, null, 6, null);
        this._navigationEvents = interfaceC16548AB;
        this.navigationEvents = C16563h.b(interfaceC16548AB);
    }

    public final void r(String code) {
        Intrinsics.j(code, "code");
        this._productDetailsFlow.setValue(q.c.f119810a);
        C15809k.d(d0.a(this), null, null, new a(code, null), 3, null);
    }

    public final void s() {
        this._productDetailsFlow.setValue(q.c.f119810a);
        C15809k.d(d0.a(this), null, null, new b(null), 3, null);
    }

    public final InterfaceC16553F<s> t() {
        return this.navigationEvents;
    }

    public final P<q> u() {
        return this.productDetailsFlow;
    }
}
