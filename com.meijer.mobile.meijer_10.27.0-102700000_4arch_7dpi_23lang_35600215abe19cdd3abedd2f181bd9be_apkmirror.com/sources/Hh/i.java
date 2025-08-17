package Hh;

import Uh.OrderCardEmptyOrErrorStateDecorator;
import ak.AbstractC5607a;
import androidx.view.c0;
import androidx.view.d0;
import com.medallia.digital.mobilesdk.l3;
import gj.OrderDetail;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nl.OrderHistory;
import nl.OrderHistoryItem;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import wl.OrderSubstitutionsDetail;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LHh/i;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;)V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "r", "(Ljava/lang/String;)V", "Lgj/c;", "orderDetail", "s", "(Ljava/lang/String;Lgj/c;)V", "Lnl/b;", "", "v", "(Lnl/b;)Z", "t", "()V", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "Ltv/B;", "LHh/n;", "b", "Ltv/B;", "_viewState", "Ltv/P;", "c", "Ltv/P;", "u", "()Ltv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class i extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<OrdersCardViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<OrdersCardViewState> viewState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.OrdersCardViewModel$fetchOrderDetails$1", f = "OrdersCardViewModel.kt", l = {92}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f12487a;

        /* renamed from: b, reason: collision with root package name */
        Object f12488b;

        /* renamed from: c, reason: collision with root package name */
        Object f12489c;

        /* renamed from: d, reason: collision with root package name */
        Object f12490d;

        /* renamed from: e, reason: collision with root package name */
        int f12491e;

        /* renamed from: f, reason: collision with root package name */
        int f12492f;

        /* renamed from: g, reason: collision with root package name */
        int f12493g;

        /* renamed from: h, reason: collision with root package name */
        int f12494h;

        /* renamed from: i, reason: collision with root package name */
        int f12495i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f12496j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f12498l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f12498l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = i.this.new a(this.f12498l, continuation);
            aVar.f12496j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            int i10;
            AbstractC5607a.Companion companion;
            Object value2;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f12495i;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f12496j;
                    i iVar = i.this;
                    String str = this.f12498l;
                    Result.Companion companion2 = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = iVar.ordersRepository;
                    this.f12496j = interfaceC16622O;
                    this.f12487a = interfaceC16622O;
                    this.f12488b = this;
                    this.f12489c = this;
                    this.f12490d = interfaceC16622O;
                    this.f12491e = 0;
                    this.f12492f = 0;
                    this.f12493g = 0;
                    this.f12494h = 0;
                    this.f12495i = 1;
                    obj = aVar.y(str, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion3 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            i iVar2 = i.this;
            String str2 = this.f12498l;
            if (Result.h(objB)) {
                OrderDetail orderDetail = (OrderDetail) objB;
                if (orderDetail.getOrderStatus() != gj.f.f133628k && orderDetail.getOrderStatus() != gj.f.f133629l) {
                    InterfaceC17140B interfaceC17140B = iVar2._viewState;
                    do {
                        value2 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value2, ((OrdersCardViewState) value2).a(false, null, Uh.d.b(orderDetail, false, 1, null), null)));
                } else {
                    uw.a.INSTANCE.a("Order is ready for pick up, fetching substitutions", new Object[0]);
                    iVar2.s(str2, orderDetail);
                }
            }
            i iVar3 = i.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "unable to fetch order details", new Object[0]);
                InterfaceC17140B interfaceC17140B2 = iVar3._viewState;
                do {
                    value = interfaceC17140B2.getValue();
                    i10 = Fh.e.f10462r;
                    companion = AbstractC5607a.INSTANCE;
                } while (!interfaceC17140B2.e(value, ((OrdersCardViewState) value).a(false, null, null, new OrderCardEmptyOrErrorStateDecorator(i10, companion.d(Fh.h.f10771q3, new Object[0]), companion.d(Fh.h.f10764p3, new Object[0])))));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.OrdersCardViewModel$fetchOrderSubstitutions$1", f = "OrdersCardViewModel.kt", l = {l3.f92485d}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f12499a;

        /* renamed from: b, reason: collision with root package name */
        Object f12500b;

        /* renamed from: c, reason: collision with root package name */
        Object f12501c;

        /* renamed from: d, reason: collision with root package name */
        Object f12502d;

        /* renamed from: e, reason: collision with root package name */
        int f12503e;

        /* renamed from: f, reason: collision with root package name */
        int f12504f;

        /* renamed from: g, reason: collision with root package name */
        int f12505g;

        /* renamed from: h, reason: collision with root package name */
        int f12506h;

        /* renamed from: i, reason: collision with root package name */
        int f12507i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f12508j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f12510l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ OrderDetail f12511m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, OrderDetail orderDetail, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f12510l = str;
            this.f12511m = orderDetail;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = i.this.new b(this.f12510l, this.f12511m, continuation);
            bVar.f12508j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f12507i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f12508j;
                    i iVar = i.this;
                    String str = this.f12510l;
                    Result.Companion companion = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = iVar.ordersRepository;
                    this.f12508j = interfaceC16622O;
                    this.f12499a = interfaceC16622O;
                    this.f12500b = this;
                    this.f12501c = this;
                    this.f12502d = interfaceC16622O;
                    this.f12503e = 0;
                    this.f12504f = 0;
                    this.f12505g = 0;
                    this.f12506h = 0;
                    this.f12507i = 1;
                    obj = aVar.x(str, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            String str2 = this.f12510l;
            i iVar2 = i.this;
            OrderDetail orderDetail = this.f12511m;
            if (Result.h(objB)) {
                OrderSubstitutionsDetail orderSubstitutionsDetail = (OrderSubstitutionsDetail) objB;
                uw.a.INSTANCE.a("Fetched substitutions for order " + str2, new Object[0]);
                InterfaceC17140B interfaceC17140B = iVar2._viewState;
                do {
                    value2 = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value2, ((OrdersCardViewState) value2).a(false, null, Uh.d.a(orderDetail, orderSubstitutionsDetail.getHasUserConfirmedSubstitutionPreferences()), null)));
            }
            i iVar3 = i.this;
            OrderDetail orderDetail2 = this.f12511m;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "unable to fetch order substitutions, update order detail response", new Object[0]);
                InterfaceC17140B interfaceC17140B2 = iVar3._viewState;
                do {
                    value = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value, ((OrdersCardViewState) value).a(false, null, Uh.d.a(orderDetail2, true), null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.OrdersCardViewModel$fetchOrdersCardInfo$2", f = "OrdersCardViewModel.kt", l = {47}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f12512a;

        /* renamed from: b, reason: collision with root package name */
        Object f12513b;

        /* renamed from: c, reason: collision with root package name */
        Object f12514c;

        /* renamed from: d, reason: collision with root package name */
        Object f12515d;

        /* renamed from: e, reason: collision with root package name */
        int f12516e;

        /* renamed from: f, reason: collision with root package name */
        int f12517f;

        /* renamed from: g, reason: collision with root package name */
        int f12518g;

        /* renamed from: h, reason: collision with root package name */
        int f12519h;

        /* renamed from: i, reason: collision with root package name */
        int f12520i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f12521j;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = i.this.new c(continuation);
            cVar.f12521j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            int i10;
            AbstractC5607a.Companion companion;
            Object value2;
            OrdersCardViewState ordersCardViewState;
            List<OrderHistoryItem> listB1;
            OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator;
            Object objA;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f12520i;
            try {
                if (i11 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f12521j;
                    i iVar = i.this;
                    Result.Companion companion2 = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = iVar.ordersRepository;
                    this.f12521j = interfaceC16622O;
                    this.f12512a = interfaceC16622O;
                    this.f12513b = this;
                    this.f12514c = this;
                    this.f12515d = interfaceC16622O;
                    this.f12516e = 0;
                    this.f12517f = 0;
                    this.f12518g = 0;
                    this.f12519h = 0;
                    this.f12520i = 1;
                    objA = com.meijer.mobile.digitalshopping.api.orders.a.A(aVar, 0, 0, this, 3, null);
                    if (objA == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objA = obj;
                }
                objB = Result.b(objA);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion3 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            i iVar2 = i.this;
            if (Result.h(objB)) {
                OrderHistory orderHistory = (OrderHistory) objB;
                String strB = j.b(orderHistory.b(), null, 1, null);
                if (strB != null) {
                    iVar2.r(strB);
                } else {
                    InterfaceC17140B interfaceC17140B = iVar2._viewState;
                    do {
                        value2 = interfaceC17140B.getValue();
                        ordersCardViewState = (OrdersCardViewState) value2;
                        if (orderHistory.b().isEmpty()) {
                            listB1 = null;
                        } else {
                            List<OrderHistoryItem> listB = orderHistory.b();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listB) {
                                if (iVar2.v((OrderHistoryItem) obj2)) {
                                    arrayList.add(obj2);
                                }
                            }
                            listB1 = CollectionsKt.b1(arrayList, 3);
                        }
                        if (orderHistory.b().isEmpty()) {
                            int i12 = Fh.e.f10458n;
                            AbstractC5607a.Companion companion4 = AbstractC5607a.INSTANCE;
                            orderCardEmptyOrErrorStateDecorator = new OrderCardEmptyOrErrorStateDecorator(i12, companion4.d(Fh.h.f10757o3, new Object[0]), companion4.d(Fh.h.f10750n3, new Object[0]));
                        } else {
                            orderCardEmptyOrErrorStateDecorator = null;
                        }
                    } while (!interfaceC17140B.e(value2, ordersCardViewState.a(false, listB1, null, orderCardEmptyOrErrorStateDecorator)));
                }
            }
            i iVar3 = i.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "unable to fetch order history", new Object[0]);
                InterfaceC17140B interfaceC17140B2 = iVar3._viewState;
                do {
                    value = interfaceC17140B2.getValue();
                    i10 = Fh.e.f10462r;
                    companion = AbstractC5607a.INSTANCE;
                } while (!interfaceC17140B2.e(value, ((OrdersCardViewState) value).a(false, null, null, new OrderCardEmptyOrErrorStateDecorator(i10, companion.d(Fh.h.f10771q3, new Object[0]), companion.d(Fh.h.f10764p3, new Object[0])))));
            }
            return Unit.f142422a;
        }
    }

    public i(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository) {
        Intrinsics.j(ordersRepository, "ordersRepository");
        this.ordersRepository = ordersRepository;
        InterfaceC17140B<OrdersCardViewState> interfaceC17140BA = S.a(new OrdersCardViewState(false, null, null, null, 15, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v(OrderHistoryItem orderHistoryItem) {
        return CollectionsKt.p("CANCELLING", "CANCELLED", "COMPLETED").contains(orderHistoryItem.getStatus());
    }

    public final void t() {
        OrdersCardViewState value;
        InterfaceC17140B<OrdersCardViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, OrdersCardViewState.b(value, true, null, null, null, 14, null)));
        C16648k.d(d0.a(this), null, null, new c(null), 3, null);
    }

    public final P<OrdersCardViewState> u() {
        return this.viewState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(String orderId) {
        C16648k.d(d0.a(this), null, null, new a(orderId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(String orderId, OrderDetail orderDetail) {
        C16648k.d(d0.a(this), null, null, new b(orderId, orderDetail, null), 3, null);
    }
}
