package rn;

import Gk.UIEvent;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import com.meijer.mobile.product.model.search.api.Pagination;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gi.InterfaceC14261a;
import gj.OrderDetail;
import hi.TrackingData;
import hk.CartPreviewDecorator;
import iv.C14764a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.C15195a;
import kn.C15196b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nl.OrderHistory;
import nl.OrderHistoryItem;
import qv.AbstractC16618K;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import sn.Paginator;
import tp.Builder;
import tp.EnumC17127a;
import tv.C17154h;
import tv.InterfaceC17140B;
import uw.a;
import xk.C18066d;
import xo.AbstractC18074b;
import xo.InStoreOrdersItemDecorator;
import xo.OrderHistoryHeaderDecorator;
import xo.OrdersItemDecorator;
import zp.DigitalReceipt;
import zp.DigitalReceiptsResponse;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0003FBDBK\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u0017J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\"\u0010'\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0015H\u0002¢\u0006\u0004\b)\u0010\u0017J#\u0010/\u001a\u00020\u00152\n\u0010,\u001a\u00060*j\u0002`+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020\u00152\u0006\u00106\u001a\u0002052\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00152\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0015H\u0014¢\u0006\u0004\b=\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020S0W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R(\u0010e\u001a\u00020]8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bd\u0010\u0017\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010i\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010_\u001a\u0004\bg\u0010a\"\u0004\bh\u0010cR2\u0010q\u001a\u0012\u0012\b\u0012\u00060*j\u0002`+\u0012\u0004\u0012\u00020*0j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lrn/h0;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "LEp/d;", "digitalReceiptsRepository", "Lhl/m;", "cartRepository", "Lyo/k;", "userManager", "LQn/I;", "flyBuyManager", "Lgi/a;", "analyticsEngine", "Lxo/d;", "orderUrlProvider", "Lqv/K;", "ioDispatcher", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;LEp/d;Lhl/m;Lyo/k;LQn/I;Lgi/a;Lxo/d;Lqv/K;)V", "", "H", "()V", "Lzp/d;", "response", "W", "(Lzp/d;)V", "", "throwable", "P", "(Ljava/lang/Throwable;)V", "I", "Lnl/a;", "orderHistoryResponse", "O", "(Lnl/a;)V", "", "shouldCallArchivedOrders", "Q", "(Lnl/a;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Ltp/a;", "flowType", "S", "(Ljava/lang/String;Ltp/a;)V", "Lrn/h0$c;", "action", "N", "(Lrn/h0$c;)V", "Ltp/b;", "builder", "updateRatedAndTippedOrder", "(Ltp/b;Ltp/a;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "onCleared", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "b", "LEp/d;", "c", "Lhl/m;", "d", "Lyo/k;", "e", "LQn/I;", "f", "Lgi/a;", "g", "Lxo/d;", "h", "Lqv/K;", "LNu/a;", "i", "LNu/a;", "compositeDisposable", "Ltv/B;", "Lrn/h0$e;", "j", "Ltv/B;", "_viewState", "Ltv/P;", "k", "Ltv/P;", "M", "()Ltv/P;", "viewState", "Lsn/a;", "l", "Lsn/a;", "K", "()Lsn/a;", "U", "(Lsn/a;)V", "getPaginator$annotations", "paginator", "m", "J", "setInStoreOrdersPaginator", "inStoreOrdersPaginator", "Lkotlin/Pair;", "n", "Lkotlin/Pair;", "L", "()Lkotlin/Pair;", "V", "(Lkotlin/Pair;)V", "rateAndTippedOrder", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class h0 extends androidx.view.c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ep.d digitalReceiptsRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Qn.I flyBuyManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xo.d orderUrlProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Nu.a compositeDisposable;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<OrdersViewState> _viewState;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final tv.P<OrdersViewState> viewState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Paginator paginator;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Paginator inStoreOrdersPaginator;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Pair<String, String> rateAndTippedOrder;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        a(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lzp/b;", "receipts", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrdersViewModel$3", f = "OrdersViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<List<? extends DigitalReceipt>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f159559a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f159560b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = h0.this.new b(continuation);
            bVar.f159560b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            OrdersViewState ordersViewState;
            List listE;
            ArrayList arrayList;
            IntrinsicsKt.f();
            if (this.f159559a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            List list = (List) this.f159560b;
            InterfaceC17140B interfaceC17140B = h0.this._viewState;
            do {
                value = interfaceC17140B.getValue();
                ordersViewState = (OrdersViewState) value;
                listE = CollectionsKt.e(OrderHistoryHeaderDecorator.INSTANCE.a("past_order"));
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(InStoreOrdersItemDecorator.INSTANCE.a((DigitalReceipt) it.next()));
                }
            } while (!interfaceC17140B.e(value, OrdersViewState.b(ordersViewState, false, false, false, false, null, null, null, null, false, false, CollectionsKt.P0(listE, arrayList), false, list.isEmpty(), false, false, 25087, null)));
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<DigitalReceipt> list, Continuation<? super Unit> continuation) {
            return ((b) create(list, continuation)).invokeSuspend(Unit.f142422a);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lrn/h0$c;", "", "<init>", "()V", "g", "b", "d", "a", "c", "j", "i", "e", "f", "h", "Lrn/h0$c$a;", "Lrn/h0$c$b;", "Lrn/h0$c$c;", "Lrn/h0$c$d;", "Lrn/h0$c$e;", "Lrn/h0$c$f;", "Lrn/h0$c$g;", "Lrn/h0$c$h;", "Lrn/h0$c$i;", "Lrn/h0$c$j;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/h0$c$a;", "Lrn/h0$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f159562a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "FetchInStoreOrders";
            }

            public int hashCode() {
                return -1602885440;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/h0$c$b;", "Lrn/h0$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f159563a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "FetchOrders";
            }

            public int hashCode() {
                return -1508300858;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/h0$c$c;", "Lrn/h0$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$c$c, reason: collision with other inner class name */
        public static final /* data */ class C2482c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C2482c f159564a = new C2482c();

            private C2482c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2482c);
            }

            public String toString() {
                return "LoadMoreInStoreOrders";
            }

            public int hashCode() {
                return -576983059;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/h0$c$d;", "Lrn/h0$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f159565a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "LoadMoreOrders";
            }

            public int hashCode() {
                return 2089232697;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lrn/h0$c$e;", "Lrn/h0$c;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Ltp/a;", "flowType", "<init>", "(Ljava/lang/String;Ltp/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ltp/a;", "()Ltp/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$c$e, reason: from toString */
        public static final /* data */ class RateShopper extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC17127a flowType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateShopper)) {
                    return false;
                }
                RateShopper rateShopper = (RateShopper) other;
                return Intrinsics.e(this.orderId, rateShopper.orderId) && this.flowType == rateShopper.flowType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RateShopper(String orderId, EnumC17127a flowType) {
                super(null);
                Intrinsics.j(orderId, "orderId");
                Intrinsics.j(flowType, "flowType");
                this.orderId = orderId;
                this.flowType = flowType;
            }

            /* renamed from: a, reason: from getter */
            public final EnumC17127a getFlowType() {
                return this.flowType;
            }

            /* renamed from: b, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            public int hashCode() {
                return (this.orderId.hashCode() * 31) + this.flowType.hashCode();
            }

            public String toString() {
                return "RateShopper(orderId=" + this.orderId + ", flowType=" + this.flowType + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00060\u0002j\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Lrn/h0$c$f;", "Lrn/h0$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/core/model/common/ResourceId;", "a", "Ljava/lang/String;", "orderId", "b", "tipAmount", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$c$f, reason: from toString */
        public static final /* data */ class SetRateAndTippedDetails extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String tipAmount;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetRateAndTippedDetails)) {
                    return false;
                }
                SetRateAndTippedDetails setRateAndTippedDetails = (SetRateAndTippedDetails) other;
                return Intrinsics.e(this.orderId, setRateAndTippedDetails.orderId) && Intrinsics.e(this.tipAmount, setRateAndTippedDetails.tipAmount);
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* renamed from: b, reason: from getter */
            public final String getTipAmount() {
                return this.tipAmount;
            }

            public int hashCode() {
                return (this.orderId.hashCode() * 31) + this.tipAmount.hashCode();
            }

            public String toString() {
                return "SetRateAndTippedDetails(orderId=" + this.orderId + ", tipAmount=" + this.tipAmount + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/h0$c$g;", "Lrn/h0$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final g f159570a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public String toString() {
                return "UpdateOrderList";
            }

            public int hashCode() {
                return 971061322;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lrn/h0$c$h;", "Lrn/h0$c;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$c$h, reason: from toString */
        public static final /* data */ class UpdatePaymentMethod extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdatePaymentMethod) && Intrinsics.e(this.orderId, ((UpdatePaymentMethod) other).orderId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatePaymentMethod(String orderId) {
                super(null);
                Intrinsics.j(orderId, "orderId");
                this.orderId = orderId;
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            public int hashCode() {
                return this.orderId.hashCode();
            }

            public String toString() {
                return "UpdatePaymentMethod(orderId=" + this.orderId + ')';
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrn/h0$c$i;", "Lrn/h0$c;", "", "Lcom/meijer/mobile/meijer/activity/orders/screens/orderhistory/OrderId;", "orderId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$c$i, reason: from toString */
        public static final /* data */ class ViewOrderDetails extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final long orderId;

            public ViewOrderDetails(long j10) {
                super(null);
                this.orderId = j10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewOrderDetails) && this.orderId == ((ViewOrderDetails) other).orderId;
            }

            /* renamed from: a, reason: from getter */
            public final long getOrderId() {
                return this.orderId;
            }

            public int hashCode() {
                return Long.hashCode(this.orderId);
            }

            public String toString() {
                return "ViewOrderDetails(orderId=" + this.orderId + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/h0$c$j;", "Lrn/h0$c;", "Lzp/g;", "receipt", "<init>", "(Lzp/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/g;", "()Lzp/g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$c$j, reason: from toString */
        public static final /* data */ class ViewReceiptDetails extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final zp.g receipt;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewReceiptDetails) && Intrinsics.e(this.receipt, ((ViewReceiptDetails) other).receipt);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewReceiptDetails(zp.g receipt) {
                super(null);
                Intrinsics.j(receipt, "receipt");
                this.receipt = receipt;
            }

            /* renamed from: a, reason: from getter */
            public final zp.g getReceipt() {
                return this.receipt;
            }

            public int hashCode() {
                return this.receipt.hashCode();
            }

            public String toString() {
                return "ViewReceiptDetails(receipt=" + this.receipt + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lrn/h0$d;", "", "<init>", "()V", "c", "d", "a", "b", "e", "Lrn/h0$d$a;", "Lrn/h0$d$b;", "Lrn/h0$d$c;", "Lrn/h0$d$d;", "Lrn/h0$d$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/h0$d$a;", "Lrn/h0$d;", "Lzp/g;", "receipt", "<init>", "(Lzp/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/g;", "()Lzp/g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$d$a, reason: from toString */
        public static final /* data */ class GoToReceiptDetailEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final zp.g receipt;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToReceiptDetailEvent) && Intrinsics.e(this.receipt, ((GoToReceiptDetailEvent) other).receipt);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoToReceiptDetailEvent(zp.g receipt) {
                super(null);
                Intrinsics.j(receipt, "receipt");
                this.receipt = receipt;
            }

            /* renamed from: a, reason: from getter */
            public final zp.g getReceipt() {
                return this.receipt;
            }

            public int hashCode() {
                return this.receipt.hashCode();
            }

            public String toString() {
                return "GoToReceiptDetailEvent(receipt=" + this.receipt + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lrn/h0$d$b;", "Lrn/h0$d;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$d$b, reason: from toString */
        public static final /* data */ class GoToUpdatePaymentMethodEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToUpdatePaymentMethodEvent) && Intrinsics.e(this.orderId, ((GoToUpdatePaymentMethodEvent) other).orderId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoToUpdatePaymentMethodEvent(String orderId) {
                super(null);
                Intrinsics.j(orderId, "orderId");
                this.orderId = orderId;
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            public int hashCode() {
                return this.orderId.hashCode();
            }

            public String toString() {
                return "GoToUpdatePaymentMethodEvent(orderId=" + this.orderId + ')';
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrn/h0$d$c;", "Lrn/h0$d;", "Ltp/b;", "builder", "Ltp/a;", "flowType", "<init>", "(Ltp/b;Ltp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltp/b;", "()Ltp/b;", "b", "Ltp/a;", "()Ltp/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$d$c, reason: from toString */
        public static final /* data */ class RateShopperEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Builder builder;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC17127a flowType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateShopperEvent)) {
                    return false;
                }
                RateShopperEvent rateShopperEvent = (RateShopperEvent) other;
                return Intrinsics.e(this.builder, rateShopperEvent.builder) && this.flowType == rateShopperEvent.flowType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RateShopperEvent(Builder builder, EnumC17127a flowType) {
                super(null);
                Intrinsics.j(builder, "builder");
                Intrinsics.j(flowType, "flowType");
                this.builder = builder;
                this.flowType = flowType;
            }

            /* renamed from: a, reason: from getter */
            public final Builder getBuilder() {
                return this.builder;
            }

            /* renamed from: b, reason: from getter */
            public final EnumC17127a getFlowType() {
                return this.flowType;
            }

            public int hashCode() {
                return (this.builder.hashCode() * 31) + this.flowType.hashCode();
            }

            public String toString() {
                return "RateShopperEvent(builder=" + this.builder + ", flowType=" + this.flowType + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lrn/h0$d$d;", "Lrn/h0$d;", "Lak/a;", "title", "message", "positiveButtonText", "<init>", "(Lak/a;Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "c", "()Lak/a;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$d$d, reason: collision with other inner class name and from toString */
        public static final /* data */ class Show503Error extends d {

            /* renamed from: d, reason: collision with root package name */
            public static final int f159578d = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a positiveButtonText;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Show503Error)) {
                    return false;
                }
                Show503Error show503Error = (Show503Error) other;
                return Intrinsics.e(this.title, show503Error.title) && Intrinsics.e(this.message, show503Error.message) && Intrinsics.e(this.positiveButtonText, show503Error.positiveButtonText);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Show503Error(AbstractC5607a title, AbstractC5607a message, AbstractC5607a positiveButtonText) {
                super(null);
                Intrinsics.j(title, "title");
                Intrinsics.j(message, "message");
                Intrinsics.j(positiveButtonText, "positiveButtonText");
                this.title = title;
                this.message = message;
                this.positiveButtonText = positiveButtonText;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getPositiveButtonText() {
                return this.positiveButtonText;
            }

            /* renamed from: c, reason: from getter */
            public final AbstractC5607a getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.positiveButtonText.hashCode();
            }

            public String toString() {
                return "Show503Error(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ')';
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrn/h0$d$e;", "Lrn/h0$d;", "", "Lcom/meijer/mobile/meijer/activity/orders/screens/orderhistory/OrderId;", "orderId", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.h0$d$e, reason: from toString */
        public static final /* data */ class ViewOrderEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final long orderId;

            public ViewOrderEvent(long j10) {
                super(null);
                this.orderId = j10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewOrderEvent) && this.orderId == ((ViewOrderEvent) other).orderId;
            }

            /* renamed from: a, reason: from getter */
            public final long getOrderId() {
                return this.orderId;
            }

            public int hashCode() {
                return Long.hashCode(this.orderId);
            }

            public String toString() {
                return "ViewOrderEvent(orderId=" + this.orderId + ')';
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J¾\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b\u0005\u0010'R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b-\u00100R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b*\u00105R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b+\u00100R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b8\u0010'R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b6\u0010'R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b:\u0010'R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b;\u0010'¨\u0006<"}, d2 = {"Lrn/h0$e;", "", "", "isProgressBarVisible", "isEmptyOrderHistoryVisible", "isOrderHistoryVisible", "isOrderHistoryErrorVisible", "", "Lxo/e;", "ordersList", "Lxo/b;", "orderHistoryDecorators", "LGk/a;", "Lrn/h0$d;", "ordersUIEvent", "Lhk/a;", "cartDecorator", "isOnlineStoreOrdersLoading", "isInStoreOrdersLoading", "inStoreOrdersList", "isInStoreOrdersErrorVisible", "isInStoreOrdersEmptyPageVisible", "isMoreOrdersToLoad", "isTheLastOrdersPage", "<init>", "(ZZZZLjava/util/List;Ljava/util/List;LGk/a;Lhk/a;ZZLjava/util/List;ZZZZ)V", "a", "(ZZZZLjava/util/List;Ljava/util/List;LGk/a;Lhk/a;ZZLjava/util/List;ZZZZ)Lrn/h0$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "o", "()Z", "b", "h", "c", "d", "n", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "g", "LGk/a;", "()LGk/a;", "Lhk/a;", "()Lhk/a;", "i", "m", "j", "k", "l", "p", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rn.h0$e, reason: from toString */
    public static final /* data */ class OrdersViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isProgressBarVisible;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEmptyOrderHistoryVisible;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOrderHistoryVisible;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOrderHistoryErrorVisible;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrdersItemDecorator> ordersList;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AbstractC18074b> orderHistoryDecorators;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final UIEvent<d> ordersUIEvent;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final CartPreviewDecorator cartDecorator;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOnlineStoreOrdersLoading;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isInStoreOrdersLoading;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AbstractC18074b> inStoreOrdersList;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isInStoreOrdersErrorVisible;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isInStoreOrdersEmptyPageVisible;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMoreOrdersToLoad;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isTheLastOrdersPage;

        public OrdersViewState() {
            this(false, false, false, false, null, null, null, null, false, false, null, false, false, false, false, 32767, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrdersViewState)) {
                return false;
            }
            OrdersViewState ordersViewState = (OrdersViewState) other;
            return this.isProgressBarVisible == ordersViewState.isProgressBarVisible && this.isEmptyOrderHistoryVisible == ordersViewState.isEmptyOrderHistoryVisible && this.isOrderHistoryVisible == ordersViewState.isOrderHistoryVisible && this.isOrderHistoryErrorVisible == ordersViewState.isOrderHistoryErrorVisible && Intrinsics.e(this.ordersList, ordersViewState.ordersList) && Intrinsics.e(this.orderHistoryDecorators, ordersViewState.orderHistoryDecorators) && Intrinsics.e(this.ordersUIEvent, ordersViewState.ordersUIEvent) && Intrinsics.e(this.cartDecorator, ordersViewState.cartDecorator) && this.isOnlineStoreOrdersLoading == ordersViewState.isOnlineStoreOrdersLoading && this.isInStoreOrdersLoading == ordersViewState.isInStoreOrdersLoading && Intrinsics.e(this.inStoreOrdersList, ordersViewState.inStoreOrdersList) && this.isInStoreOrdersErrorVisible == ordersViewState.isInStoreOrdersErrorVisible && this.isInStoreOrdersEmptyPageVisible == ordersViewState.isInStoreOrdersEmptyPageVisible && this.isMoreOrdersToLoad == ordersViewState.isMoreOrdersToLoad && this.isTheLastOrdersPage == ordersViewState.isTheLastOrdersPage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OrdersViewState(boolean z10, boolean z11, boolean z12, boolean z13, List<OrdersItemDecorator> ordersList, List<? extends AbstractC18074b> orderHistoryDecorators, UIEvent<d> ordersUIEvent, CartPreviewDecorator cartDecorator, boolean z14, boolean z15, List<? extends AbstractC18074b> inStoreOrdersList, boolean z16, boolean z17, boolean z18, boolean z19) {
            Intrinsics.j(ordersList, "ordersList");
            Intrinsics.j(orderHistoryDecorators, "orderHistoryDecorators");
            Intrinsics.j(ordersUIEvent, "ordersUIEvent");
            Intrinsics.j(cartDecorator, "cartDecorator");
            Intrinsics.j(inStoreOrdersList, "inStoreOrdersList");
            this.isProgressBarVisible = z10;
            this.isEmptyOrderHistoryVisible = z11;
            this.isOrderHistoryVisible = z12;
            this.isOrderHistoryErrorVisible = z13;
            this.ordersList = ordersList;
            this.orderHistoryDecorators = orderHistoryDecorators;
            this.ordersUIEvent = ordersUIEvent;
            this.cartDecorator = cartDecorator;
            this.isOnlineStoreOrdersLoading = z14;
            this.isInStoreOrdersLoading = z15;
            this.inStoreOrdersList = inStoreOrdersList;
            this.isInStoreOrdersErrorVisible = z16;
            this.isInStoreOrdersEmptyPageVisible = z17;
            this.isMoreOrdersToLoad = z18;
            this.isTheLastOrdersPage = z19;
        }

        public static /* synthetic */ OrdersViewState b(OrdersViewState ordersViewState, boolean z10, boolean z11, boolean z12, boolean z13, List list, List list2, UIEvent uIEvent, CartPreviewDecorator cartPreviewDecorator, boolean z14, boolean z15, List list3, boolean z16, boolean z17, boolean z18, boolean z19, int i10, Object obj) {
            return ordersViewState.a((i10 & 1) != 0 ? ordersViewState.isProgressBarVisible : z10, (i10 & 2) != 0 ? ordersViewState.isEmptyOrderHistoryVisible : z11, (i10 & 4) != 0 ? ordersViewState.isOrderHistoryVisible : z12, (i10 & 8) != 0 ? ordersViewState.isOrderHistoryErrorVisible : z13, (i10 & 16) != 0 ? ordersViewState.ordersList : list, (i10 & 32) != 0 ? ordersViewState.orderHistoryDecorators : list2, (i10 & 64) != 0 ? ordersViewState.ordersUIEvent : uIEvent, (i10 & 128) != 0 ? ordersViewState.cartDecorator : cartPreviewDecorator, (i10 & 256) != 0 ? ordersViewState.isOnlineStoreOrdersLoading : z14, (i10 & 512) != 0 ? ordersViewState.isInStoreOrdersLoading : z15, (i10 & 1024) != 0 ? ordersViewState.inStoreOrdersList : list3, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? ordersViewState.isInStoreOrdersErrorVisible : z16, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? ordersViewState.isInStoreOrdersEmptyPageVisible : z17, (i10 & 8192) != 0 ? ordersViewState.isMoreOrdersToLoad : z18, (i10 & 16384) != 0 ? ordersViewState.isTheLastOrdersPage : z19);
        }

        public final OrdersViewState a(boolean isProgressBarVisible, boolean isEmptyOrderHistoryVisible, boolean isOrderHistoryVisible, boolean isOrderHistoryErrorVisible, List<OrdersItemDecorator> ordersList, List<? extends AbstractC18074b> orderHistoryDecorators, UIEvent<d> ordersUIEvent, CartPreviewDecorator cartDecorator, boolean isOnlineStoreOrdersLoading, boolean isInStoreOrdersLoading, List<? extends AbstractC18074b> inStoreOrdersList, boolean isInStoreOrdersErrorVisible, boolean isInStoreOrdersEmptyPageVisible, boolean isMoreOrdersToLoad, boolean isTheLastOrdersPage) {
            Intrinsics.j(ordersList, "ordersList");
            Intrinsics.j(orderHistoryDecorators, "orderHistoryDecorators");
            Intrinsics.j(ordersUIEvent, "ordersUIEvent");
            Intrinsics.j(cartDecorator, "cartDecorator");
            Intrinsics.j(inStoreOrdersList, "inStoreOrdersList");
            return new OrdersViewState(isProgressBarVisible, isEmptyOrderHistoryVisible, isOrderHistoryVisible, isOrderHistoryErrorVisible, ordersList, orderHistoryDecorators, ordersUIEvent, cartDecorator, isOnlineStoreOrdersLoading, isInStoreOrdersLoading, inStoreOrdersList, isInStoreOrdersErrorVisible, isInStoreOrdersEmptyPageVisible, isMoreOrdersToLoad, isTheLastOrdersPage);
        }

        /* renamed from: c, reason: from getter */
        public final CartPreviewDecorator getCartDecorator() {
            return this.cartDecorator;
        }

        public final List<AbstractC18074b> d() {
            return this.inStoreOrdersList;
        }

        public final List<AbstractC18074b> e() {
            return this.orderHistoryDecorators;
        }

        public final List<OrdersItemDecorator> f() {
            return this.ordersList;
        }

        public final UIEvent<d> g() {
            return this.ordersUIEvent;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsEmptyOrderHistoryVisible() {
            return this.isEmptyOrderHistoryVisible;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((Boolean.hashCode(this.isProgressBarVisible) * 31) + Boolean.hashCode(this.isEmptyOrderHistoryVisible)) * 31) + Boolean.hashCode(this.isOrderHistoryVisible)) * 31) + Boolean.hashCode(this.isOrderHistoryErrorVisible)) * 31) + this.ordersList.hashCode()) * 31) + this.orderHistoryDecorators.hashCode()) * 31) + this.ordersUIEvent.hashCode()) * 31) + this.cartDecorator.hashCode()) * 31) + Boolean.hashCode(this.isOnlineStoreOrdersLoading)) * 31) + Boolean.hashCode(this.isInStoreOrdersLoading)) * 31) + this.inStoreOrdersList.hashCode()) * 31) + Boolean.hashCode(this.isInStoreOrdersErrorVisible)) * 31) + Boolean.hashCode(this.isInStoreOrdersEmptyPageVisible)) * 31) + Boolean.hashCode(this.isMoreOrdersToLoad)) * 31) + Boolean.hashCode(this.isTheLastOrdersPage);
        }

        /* renamed from: i, reason: from getter */
        public final boolean getIsInStoreOrdersEmptyPageVisible() {
            return this.isInStoreOrdersEmptyPageVisible;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getIsInStoreOrdersErrorVisible() {
            return this.isInStoreOrdersErrorVisible;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getIsInStoreOrdersLoading() {
            return this.isInStoreOrdersLoading;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getIsMoreOrdersToLoad() {
            return this.isMoreOrdersToLoad;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getIsOnlineStoreOrdersLoading() {
            return this.isOnlineStoreOrdersLoading;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getIsOrderHistoryErrorVisible() {
            return this.isOrderHistoryErrorVisible;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getIsProgressBarVisible() {
            return this.isProgressBarVisible;
        }

        /* renamed from: p, reason: from getter */
        public final boolean getIsTheLastOrdersPage() {
            return this.isTheLastOrdersPage;
        }

        public String toString() {
            return "OrdersViewState(isProgressBarVisible=" + this.isProgressBarVisible + ", isEmptyOrderHistoryVisible=" + this.isEmptyOrderHistoryVisible + ", isOrderHistoryVisible=" + this.isOrderHistoryVisible + ", isOrderHistoryErrorVisible=" + this.isOrderHistoryErrorVisible + ", ordersList=" + this.ordersList + ", orderHistoryDecorators=" + this.orderHistoryDecorators + ", ordersUIEvent=" + this.ordersUIEvent + ", cartDecorator=" + this.cartDecorator + ", isOnlineStoreOrdersLoading=" + this.isOnlineStoreOrdersLoading + ", isInStoreOrdersLoading=" + this.isInStoreOrdersLoading + ", inStoreOrdersList=" + this.inStoreOrdersList + ", isInStoreOrdersErrorVisible=" + this.isInStoreOrdersErrorVisible + ", isInStoreOrdersEmptyPageVisible=" + this.isInStoreOrdersEmptyPageVisible + ", isMoreOrdersToLoad=" + this.isMoreOrdersToLoad + ", isTheLastOrdersPage=" + this.isTheLastOrdersPage + ')';
        }

        public /* synthetic */ OrdersViewState(boolean z10, boolean z11, boolean z12, boolean z13, List list, List list2, UIEvent uIEvent, CartPreviewDecorator cartPreviewDecorator, boolean z14, boolean z15, List list3, boolean z16, boolean z17, boolean z18, boolean z19, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? CollectionsKt.m() : list, (i10 & 32) != 0 ? CollectionsKt.m() : list2, (i10 & 64) != 0 ? new UIEvent(null, 1, null) : uIEvent, (i10 & 128) != 0 ? new CartPreviewDecorator(false, 0, 3, null) : cartPreviewDecorator, (i10 & 256) != 0 ? false : z14, (i10 & 512) != 0 ? true : z15, (i10 & 1024) != 0 ? CollectionsKt.m() : list3, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z16, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z17, (i10 & 8192) != 0 ? true : z18, (i10 & 16384) != 0 ? false : z19);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrdersViewModel$fetchInStoreOrders$1", f = "OrdersViewModel.kt", l = {220}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f159598a;

        /* renamed from: b, reason: collision with root package name */
        int f159599b;

        /* renamed from: c, reason: collision with root package name */
        int f159600c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f159601d;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = h0.this.new f(continuation);
            fVar.f159601d = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                r25 = this;
                r6 = r25
                java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r6.f159600c
                r1 = 1
                if (r0 == 0) goto L26
                if (r0 != r1) goto L1e
                java.lang.Object r0 = r6.f159598a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r6.f159601d
                r1 = r0
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r26)     // Catch: java.lang.Throwable -> L1c
                r0 = r26
                goto L57
            L1c:
                r0 = move-exception
                goto L60
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                kotlin.ResultKt.b(r26)
                java.lang.Object r0 = r6.f159601d
                r10 = r0
                qv.O r10 = (qv.InterfaceC16622O) r10
                rn.h0 r0 = rn.h0.this
                kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L5e
                r2 = r0
                Ep.d r0 = rn.h0.A(r2)     // Catch: java.lang.Throwable -> L5e
                sn.a r2 = r2.getInStoreOrdersPaginator()     // Catch: java.lang.Throwable -> L5e
                int r3 = r2.getNextPage()     // Catch: java.lang.Throwable -> L5e
                r6.f159601d = r10     // Catch: java.lang.Throwable -> L5e
                r6.f159598a = r10     // Catch: java.lang.Throwable -> L5e
                r2 = 0
                r6.f159599b = r2     // Catch: java.lang.Throwable -> L5e
                r6.f159600c = r1     // Catch: java.lang.Throwable -> L5e
                r1 = 0
                r2 = 0
                r4 = 0
                r5 = 0
                r7 = 27
                r8 = 0
                java.lang.Object r0 = Ep.d.j(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5e
                if (r0 != r9) goto L56
                return r9
            L56:
                r1 = r10
            L57:
                zp.d r0 = (zp.DigitalReceiptsResponse) r0     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r0 = kotlin.Result.b(r0)     // Catch: java.lang.Throwable -> L1c
                goto L6a
            L5e:
                r0 = move-exception
                r1 = r10
            L60:
                kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
                java.lang.Object r0 = kotlin.ResultKt.a(r0)
                java.lang.Object r0 = kotlin.Result.b(r0)
            L6a:
                rn.h0 r2 = rn.h0.this
                boolean r3 = kotlin.Result.h(r0)
                if (r3 == 0) goto L78
                r3 = r0
                zp.d r3 = (zp.DigitalReceiptsResponse) r3
                rn.h0.G(r2, r3)
            L78:
                rn.h0 r2 = rn.h0.this
                java.lang.Throwable r0 = kotlin.Result.e(r0)
                if (r0 == 0) goto L90
                kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
                qv.E0.i(r1)
                boolean r1 = r0 instanceof java.lang.Error
                if (r1 != 0) goto L8f
                rn.h0.D(r2, r0)
                goto L90
            L8f:
                throw r0
            L90:
                rn.h0 r0 = rn.h0.this
                tv.B r0 = rn.h0.C(r0)
            L96:
                java.lang.Object r1 = r0.getValue()
                r7 = r1
                rn.h0$e r7 = (rn.h0.OrdersViewState) r7
                r23 = 32255(0x7dff, float:4.5199E-41)
                r24 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                rn.h0$e r2 = rn.h0.OrdersViewState.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                boolean r1 = r0.e(r1, r2)
                if (r1 == 0) goto L96
                kotlin.Unit r0 = kotlin.Unit.f142422a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rn.h0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrdersViewModel$fetchOrderHistory$2", f = "OrdersViewModel.kt", l = {270, 272}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f159603a;

        /* renamed from: b, reason: collision with root package name */
        Object f159604b;

        /* renamed from: c, reason: collision with root package name */
        int f159605c;

        /* renamed from: d, reason: collision with root package name */
        int f159606d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f159607e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f159609g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f159609g = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(TrackingData trackingData) {
            trackingData.h("errorDisplayingOrderHistory", "1");
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = h0.this.new g(this.f159609g, continuation);
            gVar.f159607e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        
            if (r2.Q(r5, r4, r23) == r6) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 341
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rn.h0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrdersViewModel", f = "OrdersViewModel.kt", l = {358}, m = "onFetchOrdersSuccess")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f159610a;

        /* renamed from: b, reason: collision with root package name */
        Object f159611b;

        /* renamed from: c, reason: collision with root package name */
        Object f159612c;

        /* renamed from: d, reason: collision with root package name */
        Object f159613d;

        /* renamed from: e, reason: collision with root package name */
        Object f159614e;

        /* renamed from: f, reason: collision with root package name */
        boolean f159615f;

        /* renamed from: g, reason: collision with root package name */
        int f159616g;

        /* renamed from: h, reason: collision with root package name */
        int f159617h;

        /* renamed from: i, reason: collision with root package name */
        int f159618i;

        /* renamed from: j, reason: collision with root package name */
        int f159619j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f159620k;

        /* renamed from: m, reason: collision with root package name */
        int f159622m;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f159620k = obj;
            this.f159622m |= Integer.MIN_VALUE;
            return h0.this.Q(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrdersViewModel$onLaunchRateAndTipActivity$1", f = "OrdersViewModel.kt", l = {HttpResponseStatus.ERROR_METHOD_NOT_ALLOWED}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f159623a;

        /* renamed from: b, reason: collision with root package name */
        Object f159624b;

        /* renamed from: c, reason: collision with root package name */
        Object f159625c;

        /* renamed from: d, reason: collision with root package name */
        Object f159626d;

        /* renamed from: e, reason: collision with root package name */
        int f159627e;

        /* renamed from: f, reason: collision with root package name */
        int f159628f;

        /* renamed from: g, reason: collision with root package name */
        int f159629g;

        /* renamed from: h, reason: collision with root package name */
        int f159630h;

        /* renamed from: i, reason: collision with root package name */
        int f159631i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f159632j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f159634l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ EnumC17127a f159635m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, EnumC17127a enumC17127a, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f159634l = str;
            this.f159635m = enumC17127a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = h0.this.new i(this.f159634l, this.f159635m, continuation);
            iVar.f159632j = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object objY;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159631i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC16622O) this.f159632j;
                    h0 h0Var = h0.this;
                    String str = this.f159634l;
                    Result.Companion companion = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = h0Var.ordersRepository;
                    this.f159632j = r23;
                    this.f159623a = r23;
                    this.f159624b = this;
                    this.f159625c = this;
                    this.f159626d = r23;
                    this.f159627e = 0;
                    this.f159628f = 0;
                    this.f159629g = 0;
                    this.f159630h = 0;
                    this.f159631i = 1;
                    objY = aVar.y(str, this);
                    i10 = r23;
                    if (objY == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC16622O) this.f159632j;
                    ResultKt.b(obj);
                    objY = obj;
                    i10 = r24;
                }
                objB = Result.b(objY);
                r22 = i10;
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
                r22 = i10;
            }
            h0 h0Var2 = h0.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                uw.a.INSTANCE.f(thE, "Error in getting OrderDetails With Unfulfilled Entries in OrdersViewModel", new Object[0]);
                InterfaceC17140B interfaceC17140B = h0Var2._viewState;
                do {
                    value2 = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value2, new C15195a().d((OrdersViewState) value2)));
            }
            h0 h0Var3 = h0.this;
            EnumC17127a enumC17127a = this.f159635m;
            if (Result.h(objB)) {
                Builder builderG0 = ((OrderDetail) objB).g0();
                InterfaceC17140B interfaceC17140B2 = h0Var3._viewState;
                do {
                    value = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value, OrdersViewState.b((OrdersViewState) value, false, false, false, false, null, null, new UIEvent(new d.RateShopperEvent(builderG0, enumC17127a)), null, false, false, null, false, false, false, false, 32702, null)));
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b0() {
        return 0;
    }

    public h0(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, Ep.d digitalReceiptsRepository, hl.m cartRepository, yo.k userManager, Qn.I flyBuyManager, InterfaceC14261a analyticsEngine, xo.d orderUrlProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(digitalReceiptsRepository, "digitalReceiptsRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(flyBuyManager, "flyBuyManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(orderUrlProvider, "orderUrlProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.ordersRepository = ordersRepository;
        this.digitalReceiptsRepository = digitalReceiptsRepository;
        this.cartRepository = cartRepository;
        this.userManager = userManager;
        this.flyBuyManager = flyBuyManager;
        this.analyticsEngine = analyticsEngine;
        this.orderUrlProvider = orderUrlProvider;
        this.ioDispatcher = ioDispatcher;
        Nu.a aVar = new Nu.a();
        this.compositeDisposable = aVar;
        InterfaceC17140B<OrdersViewState> interfaceC17140BA = tv.S.a(new OrdersViewState(false, false, false, false, null, null, null, new CartPreviewDecorator(userManager.b(), 0, 2, null), false, false, null, false, false, false, false, 32639, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        this.paginator = new Paginator(0, 0, 0, 0, false, 31, null);
        this.inStoreOrdersPaginator = new Paginator(1, 0, 2, 0, false, 26, null);
        if (userManager.b()) {
            io.reactivex.l<Integer> lVarSubscribeOn = cartRepository.Q().distinctUntilChanged().subscribeOn(C14764a.b());
            final Function1 function1 = new Function1() { // from class: rn.e0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h0.v(this.f159485a, (Integer) obj);
                }
            };
            Pu.g<? super Integer> gVar = new Pu.g() { // from class: rn.f0
                @Override // Pu.g
                public final void accept(Object obj) {
                    h0.w(function1, obj);
                }
            };
            final a aVar2 = new a(uw.a.INSTANCE);
            Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: rn.g0
                @Override // Pu.g
                public final void accept(Object obj) {
                    h0.x(aVar2, obj);
                }
            }), aVar);
        }
        if (userManager.b()) {
            C17154h.J(C17154h.O(digitalReceiptsRepository.k(), new b(null)), androidx.view.d0.a(this));
        }
    }

    private final void H() {
        if (!this.inStoreOrdersPaginator.g() || this.inStoreOrdersPaginator.getIsPaginating()) {
            return;
        }
        this.inStoreOrdersPaginator = Paginator.b(this.inStoreOrdersPaginator, 0, 0, 0, 0, true, 15, null);
        C16648k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new f(null), 2, null);
    }

    private final void I() {
        OrdersViewState value;
        if (!this.paginator.g() || this.paginator.getIsPaginating() || this.viewState.getValue().getIsTheLastOrdersPage()) {
            InterfaceC17140B<OrdersViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, OrdersViewState.b(value, false, false, false, false, null, null, null, null, false, false, null, false, false, false, false, 32511, null)));
        } else {
            Paginator paginatorB = Paginator.b(this.paginator, 0, 0, 0, 0, true, 15, null);
            this.paginator = paginatorB;
            C16648k.d(androidx.view.d0.a(this), null, null, new g(paginatorB.getNextPage() == this.paginator.getTotalPages() - 1, null), 3, null);
        }
    }

    private final void O(OrderHistory orderHistoryResponse) {
        OrdersViewState value;
        OrdersViewState value2;
        Pagination pagination = orderHistoryResponse.getPagination();
        this.paginator = Paginator.b(this.paginator, 0, pagination.getCurrentPage() + 1, 0, pagination.getTotalPages(), false, 5, null);
        InterfaceC17140B<OrdersViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, OrdersViewState.b(value, false, false, false, false, null, null, null, null, false, false, null, false, false, false, false, 32511, null)));
        if (orderHistoryResponse.getOffloadedOrders()) {
            if (this.paginator.f() || !this.paginator.getIsPaginating()) {
                List<OrderHistoryItem> listB = orderHistoryResponse.b();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
                Iterator<T> it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(OrdersItemDecorator.INSTANCE.b((OrderHistoryItem) it.next(), this.orderUrlProvider));
                }
                InterfaceC17140B<OrdersViewState> interfaceC17140B2 = this._viewState;
                do {
                    value2 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value2, OrdersViewState.b(new C15196b(arrayList, false, 2, null).b(value2), false, false, false, false, null, null, null, null, false, false, null, false, false, false, false, 32511, null)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Throwable throwable) {
        OrdersViewState value;
        uw.a.INSTANCE.e(throwable);
        this.inStoreOrdersPaginator = Paginator.b(this.inStoreOrdersPaginator, 0, 0, 0, 0, false, 15, null);
        if ((throwable instanceof HttpException) && ((HttpException) throwable).code() == 503) {
            T();
            return;
        }
        InterfaceC17140B<OrdersViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, OrdersViewState.b(value, false, false, false, false, null, null, null, null, false, false, CollectionsKt.m(), true, false, false, false, 25599, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(nl.OrderHistory r31, boolean r32, kotlin.coroutines.Continuation<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.h0.Q(nl.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("errorDisplayingOrderHistory", "1");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        OrdersViewState value;
        AbstractC5607a.Companion companion;
        InterfaceC17140B<OrdersViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            companion = AbstractC5607a.INSTANCE;
        } while (!interfaceC17140B.e(value, OrdersViewState.b(value, false, false, false, false, null, null, new UIEvent(new d.Show503Error(companion.d(yr.Q.f170963F, new Object[0]), companion.d(yr.Q.f170962E, new Object[0]), companion.d(yr.Q.f170986b, new Object[0]))), null, false, false, null, false, false, false, false, 32703, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(final DigitalReceiptsResponse response) {
        OrdersViewState value;
        InterfaceC17140B<OrdersViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, OrdersViewState.b(value, false, false, false, false, null, null, null, null, false, false, null, false, false, false, false, 32511, null)));
        this.inStoreOrdersPaginator = Paginator.b(this.inStoreOrdersPaginator, C18066d.b(response.getNextPage(), new Function0() { // from class: rn.Y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(h0.X(response));
            }
        }), 0, response.getTotalPages(), 0, false, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double Y() {
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double a0() {
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(h0 h0Var, Integer num) {
        OrdersViewState value;
        OrdersViewState ordersViewState;
        CartPreviewDecorator cartDecorator;
        InterfaceC17140B<OrdersViewState> interfaceC17140B = h0Var._viewState;
        do {
            value = interfaceC17140B.getValue();
            ordersViewState = value;
            cartDecorator = ordersViewState.getCartDecorator();
            Intrinsics.g(num);
        } while (!interfaceC17140B.e(value, OrdersViewState.b(ordersViewState, false, false, false, false, null, null, null, CartPreviewDecorator.b(cartDecorator, false, num.intValue(), 1, null), false, false, null, false, false, false, false, 32639, null)));
        return Unit.f142422a;
    }

    /* renamed from: J, reason: from getter */
    public final Paginator getInStoreOrdersPaginator() {
        return this.inStoreOrdersPaginator;
    }

    /* renamed from: K, reason: from getter */
    public final Paginator getPaginator() {
        return this.paginator;
    }

    public final Pair<String, String> L() {
        Pair<String, String> pair = this.rateAndTippedOrder;
        if (pair != null) {
            return pair;
        }
        Intrinsics.y("rateAndTippedOrder");
        return null;
    }

    public final tv.P<OrdersViewState> M() {
        return this.viewState;
    }

    public final void N(c action) {
        OrdersViewState value;
        OrdersViewState value2;
        OrdersViewState value3;
        OrdersViewState value4;
        OrdersViewState value5;
        OrdersViewState value6;
        OrdersViewState value7;
        Intrinsics.j(action, "action");
        if (action instanceof c.b) {
            this.paginator = new Paginator(0, 0, 0, 0, false, 31, null);
            InterfaceC17140B<OrdersViewState> interfaceC17140B = this._viewState;
            do {
                value7 = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value7, OrdersViewState.b(value7, true, false, false, false, CollectionsKt.m(), CollectionsKt.m(), null, null, false, false, null, false, false, true, false, 24256, null)));
            I();
            return;
        }
        if (action instanceof c.d) {
            if (!this.viewState.getValue().getIsProgressBarVisible()) {
                InterfaceC17140B<OrdersViewState> interfaceC17140B2 = this._viewState;
                do {
                    value6 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value6, OrdersViewState.b(value6, false, false, false, false, null, null, null, null, true, false, null, false, false, this.paginator.g() || this.paginator.f(), false, 24319, null)));
            }
            I();
            return;
        }
        if (action instanceof c.a) {
            InterfaceC17140B<OrdersViewState> interfaceC17140B3 = this._viewState;
            do {
                value5 = interfaceC17140B3.getValue();
            } while (!interfaceC17140B3.e(value5, OrdersViewState.b(value5, false, false, false, false, null, null, null, null, false, true, null, false, false, false, false, 30207, null)));
            H();
            return;
        }
        if (action instanceof c.C2482c) {
            H();
            return;
        }
        if (action instanceof c.ViewReceiptDetails) {
            InterfaceC17140B<OrdersViewState> interfaceC17140B4 = this._viewState;
            do {
                value4 = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value4, OrdersViewState.b(value4, false, false, false, false, null, null, new UIEvent(new d.GoToReceiptDetailEvent(((c.ViewReceiptDetails) action).getReceipt())), null, false, false, null, false, false, false, false, 32703, null)));
            return;
        }
        if (action instanceof c.RateShopper) {
            c.RateShopper rateShopper = (c.RateShopper) action;
            S(rateShopper.getOrderId(), rateShopper.getFlowType());
            return;
        }
        if (action instanceof c.g) {
            List<OrdersItemDecorator> listF = this._viewState.getValue().f();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listF, 10));
            for (OrdersItemDecorator ordersItemDecoratorC : listF) {
                if (Intrinsics.e(ordersItemDecoratorC.getOrderNumber(), L().c())) {
                    ordersItemDecoratorC = OrdersItemDecorator.c(ordersItemDecoratorC, null, null, null, null, null, null, null, null, OrdersItemDecorator.INSTANCE.c(L().d()), true, false, false, null, false, null, false, false, 122111, null);
                }
                arrayList.add(ordersItemDecoratorC);
            }
            InterfaceC17140B<OrdersViewState> interfaceC17140B5 = this._viewState;
            do {
                value3 = interfaceC17140B5.getValue();
            } while (!interfaceC17140B5.e(value3, new C15196b(arrayList, true).b(value3)));
            return;
        }
        if (action instanceof c.SetRateAndTippedDetails) {
            c.SetRateAndTippedDetails setRateAndTippedDetails = (c.SetRateAndTippedDetails) action;
            V(TuplesKt.a(setRateAndTippedDetails.getOrderId(), setRateAndTippedDetails.getTipAmount()));
        } else if (action instanceof c.UpdatePaymentMethod) {
            InterfaceC17140B<OrdersViewState> interfaceC17140B6 = this._viewState;
            do {
                value2 = interfaceC17140B6.getValue();
            } while (!interfaceC17140B6.e(value2, OrdersViewState.b(value2, false, false, false, false, null, null, new UIEvent(new d.GoToUpdatePaymentMethodEvent(((c.UpdatePaymentMethod) action).getOrderId())), null, false, false, null, false, false, false, false, 32703, null)));
        } else {
            if (!(action instanceof c.ViewOrderDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17140B<OrdersViewState> interfaceC17140B7 = this._viewState;
            do {
                value = interfaceC17140B7.getValue();
            } while (!interfaceC17140B7.e(value, OrdersViewState.b(value, false, false, false, false, null, null, new UIEvent(new d.ViewOrderEvent(((c.ViewOrderDetails) action).getOrderId())), null, false, false, null, false, false, false, false, 32703, null)));
        }
    }

    public final void U(Paginator paginator) {
        Intrinsics.j(paginator, "<set-?>");
        this.paginator = paginator;
    }

    public final void V(Pair<String, String> pair) {
        Intrinsics.j(pair, "<set-?>");
        this.rateAndTippedOrder = pair;
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.compositeDisposable.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        this.flyBuyManager.D();
    }

    public final void updateRatedAndTippedOrder(Builder builder, EnumC17127a flowType) {
        OrdersViewState value;
        Iterator it;
        ArrayList arrayList;
        Intrinsics.j(builder, "builder");
        Intrinsics.j(flowType, "flowType");
        List<OrdersItemDecorator> listF = this._viewState.getValue().f();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listF, 10));
        Iterator it2 = listF.iterator();
        while (it2.hasNext()) {
            OrdersItemDecorator ordersItemDecoratorC = (OrdersItemDecorator) it2.next();
            if (Intrinsics.e(ordersItemDecoratorC.getOrderNumber(), builder.getOrderId())) {
                boolean z10 = C18066d.a(builder.getTipAmount(), new Function0() { // from class: rn.a0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Double.valueOf(h0.Y());
                    }
                }) > 0.0d;
                boolean z11 = C18066d.b(builder.getRating(), new Function0() { // from class: rn.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(h0.Z());
                    }
                }) > 0;
                it = it2;
                arrayList = arrayList2;
                ordersItemDecoratorC = OrdersItemDecorator.c(ordersItemDecoratorC, null, null, null, null, null, null, null, null, OrdersItemDecorator.INSTANCE.c(String.valueOf(builder.getTipAmount())), z10, z10, z11, flowType, (z10 && z11) ? false : true, null, false, false, 114943, null);
            } else {
                it = it2;
                arrayList = arrayList2;
            }
            arrayList.add(ordersItemDecoratorC);
            arrayList2 = arrayList;
            it2 = it;
        }
        ArrayList arrayList3 = arrayList2;
        InterfaceC17140B<OrdersViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, new C15196b(arrayList3, C18066d.a(builder.getTipAmount(), new Function0() { // from class: rn.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Double.valueOf(h0.a0());
            }
        }) > 0.0d || C18066d.b(builder.getRating(), new Function0() { // from class: rn.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(h0.b0());
            }
        }) > 0).b(value)));
    }

    private final void S(String orderId, EnumC17127a flowType) {
        C16648k.d(androidx.view.d0.a(this), null, null, new i(orderId, flowType, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X(DigitalReceiptsResponse digitalReceiptsResponse) {
        return digitalReceiptsResponse.getCurrentPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
