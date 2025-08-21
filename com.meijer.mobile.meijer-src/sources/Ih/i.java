package Ih;

import Vh.OrderCardEmptyOrErrorStateDecorator;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import hj.OrderDetail;
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
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import ol.OrderHistory;
import ol.OrderHistoryItem;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import xl.OrderSubstitutionsDetail;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LIh/i;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;)V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "r", "(Ljava/lang/String;)V", "Lhj/c;", "orderDetail", "s", "(Ljava/lang/String;Lhj/c;)V", "Lol/b;", "", "v", "(Lol/b;)Z", "t", "()V", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "Lpv/B;", "LIh/n;", "b", "Lpv/B;", "_viewState", "Lpv/P;", "c", "Lpv/P;", "u", "()Lpv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class i extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<OrdersCardViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<OrdersCardViewState> viewState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.OrdersCardViewModel$fetchOrderDetails$1", f = "OrdersCardViewModel.kt", l = {92}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f14638a;

        /* renamed from: b, reason: collision with root package name */
        Object f14639b;

        /* renamed from: c, reason: collision with root package name */
        Object f14640c;

        /* renamed from: d, reason: collision with root package name */
        Object f14641d;

        /* renamed from: e, reason: collision with root package name */
        int f14642e;

        /* renamed from: f, reason: collision with root package name */
        int f14643f;

        /* renamed from: g, reason: collision with root package name */
        int f14644g;

        /* renamed from: h, reason: collision with root package name */
        int f14645h;

        /* renamed from: i, reason: collision with root package name */
        int f14646i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f14647j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f14649l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14649l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = i.this.new a(this.f14649l, continuation);
            aVar.f14647j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            int i10;
            AbstractC6392a.Companion companion;
            Object value2;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f14646i;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f14647j;
                    i iVar = i.this;
                    String str = this.f14649l;
                    Result.Companion companion2 = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = iVar.ordersRepository;
                    this.f14647j = interfaceC15783O;
                    this.f14638a = interfaceC15783O;
                    this.f14639b = this;
                    this.f14640c = this;
                    this.f14641d = interfaceC15783O;
                    this.f14642e = 0;
                    this.f14643f = 0;
                    this.f14644g = 0;
                    this.f14645h = 0;
                    this.f14646i = 1;
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
            String str2 = this.f14649l;
            if (Result.h(objB)) {
                OrderDetail orderDetail = (OrderDetail) objB;
                if (orderDetail.getOrderStatus() != hj.f.f135694k && orderDetail.getOrderStatus() != hj.f.f135695l) {
                    InterfaceC16549B interfaceC16549B = iVar2._viewState;
                    do {
                        value2 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value2, ((OrdersCardViewState) value2).a(false, null, Vh.d.b(orderDetail, false, 1, null), null)));
                } else {
                    qw.a.INSTANCE.a("Order is ready for pick up, fetching substitutions", new Object[0]);
                    iVar2.s(str2, orderDetail);
                }
            }
            i iVar3 = i.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "unable to fetch order details", new Object[0]);
                InterfaceC16549B interfaceC16549B2 = iVar3._viewState;
                do {
                    value = interfaceC16549B2.getValue();
                    i10 = Gh.e.f12653r;
                    companion = AbstractC6392a.INSTANCE;
                } while (!interfaceC16549B2.e(value, ((OrdersCardViewState) value).a(false, null, null, new OrderCardEmptyOrErrorStateDecorator(i10, companion.d(Gh.h.f12962q3, new Object[0]), companion.d(Gh.h.f12955p3, new Object[0])))));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.OrdersCardViewModel$fetchOrderSubstitutions$1", f = "OrdersCardViewModel.kt", l = {l3.f93324d}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f14650a;

        /* renamed from: b, reason: collision with root package name */
        Object f14651b;

        /* renamed from: c, reason: collision with root package name */
        Object f14652c;

        /* renamed from: d, reason: collision with root package name */
        Object f14653d;

        /* renamed from: e, reason: collision with root package name */
        int f14654e;

        /* renamed from: f, reason: collision with root package name */
        int f14655f;

        /* renamed from: g, reason: collision with root package name */
        int f14656g;

        /* renamed from: h, reason: collision with root package name */
        int f14657h;

        /* renamed from: i, reason: collision with root package name */
        int f14658i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f14659j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f14661l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ OrderDetail f14662m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, OrderDetail orderDetail, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f14661l = str;
            this.f14662m = orderDetail;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = i.this.new b(this.f14661l, this.f14662m, continuation);
            bVar.f14659j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14658i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f14659j;
                    i iVar = i.this;
                    String str = this.f14661l;
                    Result.Companion companion = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = iVar.ordersRepository;
                    this.f14659j = interfaceC15783O;
                    this.f14650a = interfaceC15783O;
                    this.f14651b = this;
                    this.f14652c = this;
                    this.f14653d = interfaceC15783O;
                    this.f14654e = 0;
                    this.f14655f = 0;
                    this.f14656g = 0;
                    this.f14657h = 0;
                    this.f14658i = 1;
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
            String str2 = this.f14661l;
            i iVar2 = i.this;
            OrderDetail orderDetail = this.f14662m;
            if (Result.h(objB)) {
                OrderSubstitutionsDetail orderSubstitutionsDetail = (OrderSubstitutionsDetail) objB;
                qw.a.INSTANCE.a("Fetched substitutions for order " + str2, new Object[0]);
                InterfaceC16549B interfaceC16549B = iVar2._viewState;
                do {
                    value2 = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value2, ((OrdersCardViewState) value2).a(false, null, Vh.d.a(orderDetail, orderSubstitutionsDetail.getHasUserConfirmedSubstitutionPreferences()), null)));
            }
            i iVar3 = i.this;
            OrderDetail orderDetail2 = this.f14662m;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "unable to fetch order substitutions, update order detail response", new Object[0]);
                InterfaceC16549B interfaceC16549B2 = iVar3._viewState;
                do {
                    value = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value, ((OrdersCardViewState) value).a(false, null, Vh.d.a(orderDetail2, true), null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.OrdersCardViewModel$fetchOrdersCardInfo$2", f = "OrdersCardViewModel.kt", l = {47}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f14663a;

        /* renamed from: b, reason: collision with root package name */
        Object f14664b;

        /* renamed from: c, reason: collision with root package name */
        Object f14665c;

        /* renamed from: d, reason: collision with root package name */
        Object f14666d;

        /* renamed from: e, reason: collision with root package name */
        int f14667e;

        /* renamed from: f, reason: collision with root package name */
        int f14668f;

        /* renamed from: g, reason: collision with root package name */
        int f14669g;

        /* renamed from: h, reason: collision with root package name */
        int f14670h;

        /* renamed from: i, reason: collision with root package name */
        int f14671i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f14672j;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = i.this.new c(continuation);
            cVar.f14672j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            int i10;
            AbstractC6392a.Companion companion;
            Object value2;
            OrdersCardViewState ordersCardViewState;
            List<OrderHistoryItem> listB1;
            OrderCardEmptyOrErrorStateDecorator orderCardEmptyOrErrorStateDecorator;
            Object objA;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f14671i;
            try {
                if (i11 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f14672j;
                    i iVar = i.this;
                    Result.Companion companion2 = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = iVar.ordersRepository;
                    this.f14672j = interfaceC15783O;
                    this.f14663a = interfaceC15783O;
                    this.f14664b = this;
                    this.f14665c = this;
                    this.f14666d = interfaceC15783O;
                    this.f14667e = 0;
                    this.f14668f = 0;
                    this.f14669g = 0;
                    this.f14670h = 0;
                    this.f14671i = 1;
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
                    InterfaceC16549B interfaceC16549B = iVar2._viewState;
                    do {
                        value2 = interfaceC16549B.getValue();
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
                            int i12 = Gh.e.f12649n;
                            AbstractC6392a.Companion companion4 = AbstractC6392a.INSTANCE;
                            orderCardEmptyOrErrorStateDecorator = new OrderCardEmptyOrErrorStateDecorator(i12, companion4.d(Gh.h.f12948o3, new Object[0]), companion4.d(Gh.h.f12941n3, new Object[0]));
                        } else {
                            orderCardEmptyOrErrorStateDecorator = null;
                        }
                    } while (!interfaceC16549B.e(value2, ordersCardViewState.a(false, listB1, null, orderCardEmptyOrErrorStateDecorator)));
                }
            }
            i iVar3 = i.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "unable to fetch order history", new Object[0]);
                InterfaceC16549B interfaceC16549B2 = iVar3._viewState;
                do {
                    value = interfaceC16549B2.getValue();
                    i10 = Gh.e.f12653r;
                    companion = AbstractC6392a.INSTANCE;
                } while (!interfaceC16549B2.e(value, ((OrdersCardViewState) value).a(false, null, null, new OrderCardEmptyOrErrorStateDecorator(i10, companion.d(Gh.h.f12962q3, new Object[0]), companion.d(Gh.h.f12955p3, new Object[0])))));
            }
            return Unit.f143329a;
        }
    }

    public i(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository) {
        Intrinsics.j(ordersRepository, "ordersRepository");
        this.ordersRepository = ordersRepository;
        InterfaceC16549B<OrdersCardViewState> interfaceC16549BA = S.a(new OrdersCardViewState(false, null, null, null, 15, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v(OrderHistoryItem orderHistoryItem) {
        return CollectionsKt.p("CANCELLING", "CANCELLED", "COMPLETED").contains(orderHistoryItem.getStatus());
    }

    public final void t() {
        OrdersCardViewState value;
        InterfaceC16549B<OrdersCardViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrdersCardViewState.b(value, true, null, null, null, 14, null)));
        C15809k.d(d0.a(this), null, null, new c(null), 3, null);
    }

    public final P<OrdersCardViewState> u() {
        return this.viewState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(String orderId) {
        C15809k.d(d0.a(this), null, null, new a(orderId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(String orderId, OrderDetail orderDetail) {
        C15809k.d(d0.a(this), null, null, new b(orderId, orderDetail, null), 3, null);
    }
}
