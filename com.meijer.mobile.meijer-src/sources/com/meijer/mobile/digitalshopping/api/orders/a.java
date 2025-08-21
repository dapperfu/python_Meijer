package com.meijer.mobile.digitalshopping.api.orders;

import Hl.FlyBuyOrderDetail;
import com.fullstory.FS;
import com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable.OrderIsEditCancelableResponse;
import com.meijer.mobile.digitalshopping.api.orders.model.orderrewards.OrderRewardPointsForOrderResponse;
import com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceResponse;
import com.meijer.mobile.fulfillment.flybuy.api.models.PickUpOrderUpdate;
import com.meijer.mobile.fulfillment.flybuy.api.models.PickUpOrderUpdateRequest;
import com.meijer.mobile.fulfillment.flybuy.api.models.PickUpOrderUpdateResponse;
import com.meijer.mobile.fulfillment.flybuy.api.models.UrlShortnerResponse;
import com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import fj.CartChanges;
import hj.OrderDetail;
import il.C14768C;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ml.InterfaceC15731a;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.E0;
import mv.InterfaceC15783O;
import ol.OrderHistory;
import pl.TipNotification;
import ql.InterfaceC16681a;
import retrofit2.HttpException;
import retrofit2.Response;
import sl.InterfaceC17081a;
import xl.OrderSubstitutionsDetail;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b \u0010!J$\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b\"\u0010!J\u001c\u0010'\u001a\u00020&2\n\u0010%\u001a\u00060#j\u0002`$H\u0086@¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u00020&2\n\u0010%\u001a\u00060#j\u0002`$H\u0086@¢\u0006\u0004\b)\u0010(J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010*\u001a\u00020&H\u0000¢\u0006\u0004\b,\u0010-J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020&0+2\n\u0010%\u001a\u00060#j\u0002`$H\u0086@¢\u0006\u0004\b.\u0010(J(\u00100\u001a\u00060#j\u0002`$2\n\u0010%\u001a\u00060#j\u0002`$2\u0006\u0010/\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b0\u00101J\u001c\u00102\u001a\u00060#j\u0002`$2\u0006\u0010*\u001a\u00020&H\u0086@¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002042\u0006\u0010*\u001a\u00020&H\u0086@¢\u0006\u0004\b5\u00103J\u0018\u00107\u001a\u0002062\u0006\u0010*\u001a\u00020&H\u0086@¢\u0006\u0004\b7\u00103J$\u00108\u001a\u0002062\n\u0010%\u001a\u00060#j\u0002`$2\u0006\u0010/\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b8\u00101J&\u0010:\u001a\u0004\u0018\u0001092\n\u0010%\u001a\u00060#j\u0002`$2\u0006\u0010/\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b:\u00101J\u0018\u0010;\u001a\u0002042\u0006\u0010*\u001a\u00020&H\u0086@¢\u0006\u0004\b;\u00103J\u001e\u0010?\u001a\u0004\u0018\u00010>2\n\u0010=\u001a\u00060#j\u0002`<H\u0086@¢\u0006\u0004\b?\u0010(J*\u0010@\u001a\u0004\u0018\u0001092\n\u0010%\u001a\u00060#j\u0002`$2\n\u0010=\u001a\u00060#j\u0002`<H\u0086@¢\u0006\u0004\b@\u0010AJ&\u0010C\u001a\u0004\u0018\u0001092\u0006\u0010B\u001a\u00020#2\n\u0010%\u001a\u00060#j\u0002`$H\u0086@¢\u0006\u0004\bC\u0010AJ\u0018\u0010E\u001a\u00020D2\u0006\u0010%\u001a\u00020\u001cH\u0086@¢\u0006\u0004\bE\u0010FJ$\u0010K\u001a\u00020J2\n\u0010G\u001a\u00060#j\u0002`$2\u0006\u0010I\u001a\u00020HH\u0086@¢\u0006\u0004\bK\u0010LJ\u001c\u0010N\u001a\u00020M2\n\u0010%\u001a\u00060#j\u0002`$H\u0086@¢\u0006\u0004\bN\u0010(J@\u0010T\u001a\u00020S2\n\u0010%\u001a\u00060#j\u0002`$2\u0006\u0010O\u001a\u00020\u001c2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001c0PH\u0086@¢\u0006\u0004\bT\u0010UJ\u001a\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010V\u001a\u00020#H\u0086@¢\u0006\u0004\bX\u0010(J\u001c\u0010Z\u001a\u00020Y2\n\u0010%\u001a\u00060#j\u0002`$H\u0086@¢\u0006\u0004\bZ\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020&0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010t¨\u0006v"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/a;", "", "LYi/a;", "tokenProvider", "LTq/j;", "storeProvider", "Lml/a;", "archivedOrdersApi", "Lml/d;", "ordersApi", "Lml/e;", "ordersDigitalApi", "Lsl/a;", "orderSubstitutionApi", "LEl/a;", "flyBuyApi", "Lql/a;", "orderRewardApi", "Lrl/c;", "orderShortenerUrlApi", "Lil/C;", "cartProvider", "Lcom/squareup/moshi/t;", "moshi", "Lmv/K;", "ioDispatcher", "<init>", "(LYi/a;LTq/j;Lml/a;Lml/d;Lml/e;Lsl/a;LEl/a;Lql/a;Lrl/c;Lil/C;Lcom/squareup/moshi/t;Lmv/K;)V", "", "currentPage", "pageSize", "Lol/a;", "z", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lhj/c;", "s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y", "orderDetail", "Lio/reactivex/u;", "G", "(Lhj/c;)Lio/reactivex/u;", "w", "storeId", "o", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "(Lhj/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;", "E", "Lfj/e;", "p", "q", "", "m", "F", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "Lpl/b;", "D", "K", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newPhoneNumber", "r", "LHl/b;", "v", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flyBuyOrderId", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderUpdate;", "pickUpOrderUpdate", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderUpdateResponse;", "J", "(Ljava/lang/String;Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lxl/a;", "x", "unitId", "", "acceptedLineItemIds", "rejectedLineItemIds", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/UpdateSubstitutionAcceptanceResponse;", "I", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shortCode", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/UrlShortnerResponse;", "C", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;", "B", "a", "LYi/a;", "b", "LTq/j;", "c", "Lml/a;", "d", "Lml/d;", "e", "Lml/e;", "f", "Lsl/a;", "g", "LEl/a;", "h", "Lql/a;", "i", "Lrl/c;", "j", "Lil/C;", "k", "Lcom/squareup/moshi/t;", "l", "Lmv/K;", "LEk/n;", "LEk/n;", "latestDetailStore", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yi.a tokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15731a archivedOrdersApi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ml.d ordersApi;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ml.e ordersDigitalApi;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17081a orderSubstitutionApi;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final El.a flyBuyApi;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16681a orderRewardApi;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final rl.c orderShortenerUrlApi;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C14768C cartProvider;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.moshi.t moshi;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Ek.n<OrderDetail> latestDetailStore;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.digitalshopping.api.orders.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1396a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[hj.f.values().length];
            try {
                iArr[hj.f.f135688e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hj.f.f135691h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hj.f.f135690g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hj.f.f135687d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hj.f.f135693j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$cancelEditOrder$2", f = "OrdersRepository.kt", l = {418, HttpResponseStatus.ERROR_EXPECTATION_FAILED, HttpResponseStatus.ERROR_UNPROCESSABLE_ENTITY}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97885a;

        /* renamed from: b, reason: collision with root package name */
        Object f97886b;

        /* renamed from: c, reason: collision with root package name */
        Object f97887c;

        /* renamed from: d, reason: collision with root package name */
        Object f97888d;

        /* renamed from: e, reason: collision with root package name */
        int f97889e;

        /* renamed from: f, reason: collision with root package name */
        int f97890f;

        /* renamed from: g, reason: collision with root package name */
        int f97891g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f97892h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f97894j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f97895k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, int i10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f97894j = str;
            this.f97895k = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = a.this.new b(this.f97894j, this.f97895k, continuation);
            bVar.f97892h = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0048: MOVE (r1 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:73), block:B:19:0x0048 */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #3 {all -> 0x00f8, blocks: (B:34:0x00c0, B:36:0x00c8, B:44:0x00fb, B:45:0x0100), top: B:64:0x00c0 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[Catch: all -> 0x00f8, TRY_ENTER, TryCatch #3 {all -> 0x00f8, blocks: (B:34:0x00c0, B:36:0x00c8, B:44:0x00fb, B:45:0x0100), top: B:64:0x00c0 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$cancelOrder$2", f = "OrdersRepository.kt", l = {227, 226}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97896a;

        /* renamed from: b, reason: collision with root package name */
        Object f97897b;

        /* renamed from: c, reason: collision with root package name */
        Object f97898c;

        /* renamed from: d, reason: collision with root package name */
        int f97899d;

        /* renamed from: e, reason: collision with root package name */
        int f97900e;

        /* renamed from: f, reason: collision with root package name */
        int f97901f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f97902g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f97904i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f97905j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f97904i = str;
            this.f97905j = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = a.this.new c(this.f97904i, this.f97905j, continuation);
            cVar.f97902g = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super String> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x008c, B:29:0x0094, B:30:0x009f, B:31:0x00a4), top: B:55:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x008c, B:29:0x0094, B:30:0x009f, B:31:0x00a4), top: B:55:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository", f = "OrdersRepository.kt", l = {260, 263}, m = "cancelOrder")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97906a;

        /* renamed from: b, reason: collision with root package name */
        Object f97907b;

        /* renamed from: c, reason: collision with root package name */
        Object f97908c;

        /* renamed from: d, reason: collision with root package name */
        int f97909d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f97910e;

        /* renamed from: g, reason: collision with root package name */
        int f97912g;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97910e = obj;
            this.f97912g |= Integer.MIN_VALUE;
            return a.this.n(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository", f = "OrdersRepository.kt", l = {342, 345}, m = "editOrder")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97913a;

        /* renamed from: b, reason: collision with root package name */
        Object f97914b;

        /* renamed from: c, reason: collision with root package name */
        Object f97915c;

        /* renamed from: d, reason: collision with root package name */
        int f97916d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f97917e;

        /* renamed from: g, reason: collision with root package name */
        int f97919g;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97917e = obj;
            this.f97919g |= Integer.MIN_VALUE;
            return a.this.p(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lfj/e;", "<anonymous>", "(Lmv/O;)Lfj/e;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$editOrder$4", f = "OrdersRepository.kt", l = {388, 387, 394}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super CartChanges>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97920a;

        /* renamed from: b, reason: collision with root package name */
        Object f97921b;

        /* renamed from: c, reason: collision with root package name */
        Object f97922c;

        /* renamed from: d, reason: collision with root package name */
        int f97923d;

        /* renamed from: e, reason: collision with root package name */
        int f97924e;

        /* renamed from: f, reason: collision with root package name */
        int f97925f;

        /* renamed from: g, reason: collision with root package name */
        int f97926g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f97927h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f97929j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f97930k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, int i10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f97929j = str;
            this.f97930k = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = a.this.new f(this.f97929j, this.f97930k, continuation);
            fVar.f97927h = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super CartChanges> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[Catch: all -> 0x0044, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:33:0x00af, B:35:0x00b7, B:36:0x00c5, B:37:0x00ca), top: B:83:0x003f }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[Catch: all -> 0x0044, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:33:0x00af, B:35:0x00b7, B:36:0x00c5, B:37:0x00ca), top: B:83:0x003f }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 384
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$editPhoneNumber$2", f = "OrdersRepository.kt", l = {562, 561}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97931a;

        /* renamed from: b, reason: collision with root package name */
        Object f97932b;

        /* renamed from: c, reason: collision with root package name */
        Object f97933c;

        /* renamed from: d, reason: collision with root package name */
        Object f97934d;

        /* renamed from: e, reason: collision with root package name */
        int f97935e;

        /* renamed from: f, reason: collision with root package name */
        int f97936f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f97937g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f97939i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f97940j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f97939i = str;
            this.f97940j = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = a.this.new g(this.f97939i, this.f97940j, continuation);
            gVar.f97937g = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x0094, B:29:0x009c, B:30:0x00a7, B:31:0x00ac), top: B:51:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a7 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x0094, B:29:0x009c, B:30:0x00a7, B:31:0x00ac), top: B:51:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lhj/c;", "<anonymous>", "(Lmv/O;)Lhj/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$getArchivedOrderDetails$2", f = "OrdersRepository.kt", l = {153, 152}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderDetail>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97941a;

        /* renamed from: b, reason: collision with root package name */
        Object f97942b;

        /* renamed from: c, reason: collision with root package name */
        Object f97943c;

        /* renamed from: d, reason: collision with root package name */
        int f97944d;

        /* renamed from: e, reason: collision with root package name */
        int f97945e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f97946f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f97948h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f97948h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = a.this.new h(this.f97948h, continuation);
            hVar.f97946f = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderDetail> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0018, B:27:0x0084, B:29:0x008c, B:30:0x009a, B:31:0x009f), top: B:54:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0018, B:27:0x0084, B:29:0x008c, B:30:0x009a, B:31:0x009f), top: B:54:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lol/a;", "<anonymous>", "(Lmv/O;)Lol/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$getArchivedOrderHistory$2", f = "OrdersRepository.kt", l = {132, 131}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderHistory>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97949a;

        /* renamed from: b, reason: collision with root package name */
        Object f97950b;

        /* renamed from: c, reason: collision with root package name */
        Object f97951c;

        /* renamed from: d, reason: collision with root package name */
        Object f97952d;

        /* renamed from: e, reason: collision with root package name */
        Object f97953e;

        /* renamed from: f, reason: collision with root package name */
        Object f97954f;

        /* renamed from: g, reason: collision with root package name */
        int f97955g;

        /* renamed from: h, reason: collision with root package name */
        int f97956h;

        /* renamed from: i, reason: collision with root package name */
        int f97957i;

        /* renamed from: j, reason: collision with root package name */
        int f97958j;

        /* renamed from: k, reason: collision with root package name */
        int f97959k;

        /* renamed from: l, reason: collision with root package name */
        int f97960l;

        /* renamed from: m, reason: collision with root package name */
        int f97961m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f97962n;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f97964p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f97965q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, int i11, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f97964p = i10;
            this.f97965q = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = a.this.new i(this.f97964p, this.f97965q, continuation);
            iVar.f97962n = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderHistory> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00e9, code lost:
        
            if (r0 == r9) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LHl/b;", "<anonymous>", "(Lmv/O;)LHl/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$getFlyBuyOrder$2", f = "OrdersRepository.kt", l = {583}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FlyBuyOrderDetail>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97966a;

        /* renamed from: b, reason: collision with root package name */
        int f97967b;

        /* renamed from: c, reason: collision with root package name */
        int f97968c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f97969d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f97971f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f97971f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = a.this.new j(this.f97971f, continuation);
            jVar.f97969d = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FlyBuyOrderDetail> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0044, B:19:0x004c, B:20:0x005a, B:21:0x005f), top: B:44:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0044, B:19:0x004c, B:20:0x005a, B:21:0x005f), top: B:44:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f97968c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r6.f97966a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r6.f97969d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L44
            L17:
                r7 = move-exception
                goto L64
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f97969d
                mv.O r7 = (mv.InterfaceC15783O) r7
                com.meijer.mobile.digitalshopping.api.orders.a r1 = com.meijer.mobile.digitalshopping.api.orders.a.this
                int r3 = r6.f97971f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L60
                El.a r1 = com.meijer.mobile.digitalshopping.api.orders.a.d(r1)     // Catch: java.lang.Throwable -> L60
                r6.f97969d = r7     // Catch: java.lang.Throwable -> L60
                r6.f97966a = r7     // Catch: java.lang.Throwable -> L60
                r4 = 0
                r6.f97967b = r4     // Catch: java.lang.Throwable -> L60
                r6.f97968c = r2     // Catch: java.lang.Throwable -> L60
                java.lang.Object r1 = r1.a(r3, r6)     // Catch: java.lang.Throwable -> L60
                if (r1 != r0) goto L42
                return r0
            L42:
                r0 = r7
                r7 = r1
            L44:
                retrofit2.Response r7 = (retrofit2.Response) r7     // Catch: java.lang.Throwable -> L17
                boolean r1 = r7.isSuccessful()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L5a
                java.lang.Object r7 = r7.body()     // Catch: java.lang.Throwable -> L17
                kotlin.jvm.internal.Intrinsics.g(r7)     // Catch: java.lang.Throwable -> L17
                com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderResponse r7 = (com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderResponse) r7     // Catch: java.lang.Throwable -> L17
                java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L6e
            L5a:
                retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch: java.lang.Throwable -> L17
                r1.<init>(r7)     // Catch: java.lang.Throwable -> L17
                throw r1     // Catch: java.lang.Throwable -> L17
            L60:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L64:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            L6e:
                boolean r1 = kotlin.Result.h(r7)
                if (r1 == 0) goto L7a
                com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderResponse r7 = (com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderResponse) r7
                Hl.b r7 = Fl.c.c(r7)
            L7a:
                java.lang.Object r7 = kotlin.Result.b(r7)
                com.meijer.mobile.digitalshopping.api.orders.a r1 = com.meijer.mobile.digitalshopping.api.orders.a.this
                java.lang.Throwable r2 = kotlin.Result.e(r7)
                if (r2 != 0) goto L87
                goto Laa
            L87:
                kotlin.coroutines.CoroutineContext r7 = r0.getCoroutineContext()     // Catch: java.lang.Throwable -> L93
                mv.E0.i(r7)     // Catch: java.lang.Throwable -> L93
                boolean r7 = r2 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L93
                if (r7 == 0) goto L95
                throw r2     // Catch: java.lang.Throwable -> L93
            L93:
                r7 = move-exception
                goto La0
            L95:
                com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException$a r7 = com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException.INSTANCE     // Catch: java.lang.Throwable -> L93
                com.squareup.moshi.t r0 = com.meijer.mobile.digitalshopping.api.orders.a.e(r1)     // Catch: java.lang.Throwable -> L93
                java.lang.Throwable r7 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L93
                throw r7     // Catch: java.lang.Throwable -> L93
            La0:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            Laa:
                kotlin.ResultKt.b(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository", f = "OrdersRepository.kt", l = {208}, m = "getOrderConfirmation")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f97972a;

        /* renamed from: b, reason: collision with root package name */
        Object f97973b;

        /* renamed from: c, reason: collision with root package name */
        int f97974c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f97975d;

        /* renamed from: f, reason: collision with root package name */
        int f97977f;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f97975d = obj;
            this.f97977f |= Integer.MIN_VALUE;
            return a.this.w(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lxl/a;", "<anonymous>", "(Lmv/O;)Lxl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$getOrderDetailsWithSubstitutions$2", f = "OrdersRepository.kt", l = {647}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderSubstitutionsDetail>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97978a;

        /* renamed from: b, reason: collision with root package name */
        int f97979b;

        /* renamed from: c, reason: collision with root package name */
        int f97980c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f97981d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f97983f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f97983f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = a.this.new l(this.f97983f, continuation);
            lVar.f97981d = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderSubstitutionsDetail> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0049, B:19:0x0051, B:20:0x0063, B:21:0x0068), top: B:38:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0049, B:19:0x0051, B:20:0x0063, B:21:0x0068), top: B:38:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f97980c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r6.f97978a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r6.f97981d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L49
            L17:
                r7 = move-exception
                goto L6d
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f97981d
                mv.O r7 = (mv.InterfaceC15783O) r7
                com.meijer.mobile.digitalshopping.api.orders.a r1 = com.meijer.mobile.digitalshopping.api.orders.a.this
                java.lang.String r3 = r6.f97983f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L69
                sl.a r1 = com.meijer.mobile.digitalshopping.api.orders.a.h(r1)     // Catch: java.lang.Throwable -> L69
                com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.OrderSubstitutionRequest r4 = new com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.OrderSubstitutionRequest     // Catch: java.lang.Throwable -> L69
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L69
                r6.f97981d = r7     // Catch: java.lang.Throwable -> L69
                r6.f97978a = r7     // Catch: java.lang.Throwable -> L69
                r3 = 0
                r6.f97979b = r3     // Catch: java.lang.Throwable -> L69
                r6.f97980c = r2     // Catch: java.lang.Throwable -> L69
                java.lang.Object r1 = r1.b(r4, r6)     // Catch: java.lang.Throwable -> L69
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r7
                r7 = r1
            L49:
                retrofit2.Response r7 = (retrofit2.Response) r7     // Catch: java.lang.Throwable -> L17
                boolean r1 = r7.isSuccessful()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L63
                java.lang.Object r7 = r7.body()     // Catch: java.lang.Throwable -> L17
                kotlin.jvm.internal.Intrinsics.g(r7)     // Catch: java.lang.Throwable -> L17
                com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.OrderSubstitutionResponse r7 = (com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.OrderSubstitutionResponse) r7     // Catch: java.lang.Throwable -> L17
                xl.a r7 = com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.a.a(r7)     // Catch: java.lang.Throwable -> L17
                java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L77
            L63:
                retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch: java.lang.Throwable -> L17
                r1.<init>(r7)     // Catch: java.lang.Throwable -> L17
                throw r1     // Catch: java.lang.Throwable -> L17
            L69:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L6d:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            L77:
                com.meijer.mobile.digitalshopping.api.orders.a r1 = com.meijer.mobile.digitalshopping.api.orders.a.this
                java.lang.Throwable r2 = kotlin.Result.e(r7)
                if (r2 != 0) goto L80
                goto La3
            L80:
                kotlin.coroutines.CoroutineContext r7 = r0.getCoroutineContext()     // Catch: java.lang.Throwable -> L8c
                mv.E0.i(r7)     // Catch: java.lang.Throwable -> L8c
                boolean r7 = r2 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L8c
                if (r7 == 0) goto L8e
                throw r2     // Catch: java.lang.Throwable -> L8c
            L8c:
                r7 = move-exception
                goto L99
            L8e:
                com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException$a r7 = com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException.INSTANCE     // Catch: java.lang.Throwable -> L8c
                com.squareup.moshi.t r0 = com.meijer.mobile.digitalshopping.api.orders.a.e(r1)     // Catch: java.lang.Throwable -> L8c
                java.lang.Throwable r7 = r7.a(r2, r0)     // Catch: java.lang.Throwable -> L8c
                throw r7     // Catch: java.lang.Throwable -> L8c
            L99:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            La3:
                kotlin.ResultKt.b(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lhj/c;", "<anonymous>", "(Lmv/O;)Lhj/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$getOrderDetailsWithUnfulfilledEntries$2", f = "OrdersRepository.kt", l = {179, 178}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderDetail>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97984a;

        /* renamed from: b, reason: collision with root package name */
        Object f97985b;

        /* renamed from: c, reason: collision with root package name */
        Object f97986c;

        /* renamed from: d, reason: collision with root package name */
        Object f97987d;

        /* renamed from: e, reason: collision with root package name */
        Object f97988e;

        /* renamed from: f, reason: collision with root package name */
        Object f97989f;

        /* renamed from: g, reason: collision with root package name */
        Object f97990g;

        /* renamed from: h, reason: collision with root package name */
        int f97991h;

        /* renamed from: i, reason: collision with root package name */
        int f97992i;

        /* renamed from: j, reason: collision with root package name */
        int f97993j;

        /* renamed from: k, reason: collision with root package name */
        int f97994k;

        /* renamed from: l, reason: collision with root package name */
        int f97995l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f97996m;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f97998o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f97998o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = a.this.new m(this.f97998o, continuation);
            mVar.f97996m = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderDetail> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:51|(1:(5:6|7|8|26|(7:28|36|(1:38)|39|(3:48|42|43)|46|47)(2:31|32))(2:11|12))(2:13|14))(4:16|52|17|(2:19|25)(1:20))|21|22|50|23|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
        
            if (r15 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 352
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lol/a;", "<anonymous>", "(Lmv/O;)Lol/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$getOrderHistory$2", f = "OrdersRepository.kt", l = {104, 103}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderHistory>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f97999a;

        /* renamed from: b, reason: collision with root package name */
        Object f98000b;

        /* renamed from: c, reason: collision with root package name */
        int f98001c;

        /* renamed from: d, reason: collision with root package name */
        int f98002d;

        /* renamed from: e, reason: collision with root package name */
        int f98003e;

        /* renamed from: f, reason: collision with root package name */
        int f98004f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f98005g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f98007i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f98008j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i10, int i11, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f98007i = i10;
            this.f98008j = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = a.this.new n(this.f98007i, this.f98008j, continuation);
            nVar.f98005g = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderHistory> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[Catch: all -> 0x001d, TryCatch #4 {all -> 0x001d, blocks: (B:7:0x0017, B:27:0x0097, B:29:0x009f, B:30:0x00ad, B:31:0x00b2), top: B:60:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[Catch: all -> 0x001d, TryCatch #4 {all -> 0x001d, blocks: (B:7:0x0017, B:27:0x0097, B:29:0x009f, B:30:0x00ad, B:31:0x00b2), top: B:60:0x0017 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$getPointsForOrder$2", f = "OrdersRepository.kt", l = {716, 715}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderRewardPointsForOrderResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98009a;

        /* renamed from: b, reason: collision with root package name */
        Object f98010b;

        /* renamed from: c, reason: collision with root package name */
        Object f98011c;

        /* renamed from: d, reason: collision with root package name */
        int f98012d;

        /* renamed from: e, reason: collision with root package name */
        int f98013e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f98014f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f98016h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f98016h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            o oVar = a.this.new o(this.f98016h, continuation);
            oVar.f98014f = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderRewardPointsForOrderResponse> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x0089, B:29:0x0091, B:30:0x009f, B:31:0x00a4), top: B:51:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x0089, B:29:0x0091, B:30:0x009f, B:31:0x00a4), top: B:51:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/UrlShortnerResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/fulfillment/flybuy/api/models/UrlShortnerResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$getShorterURL$2", f = "OrdersRepository.kt", l = {697}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UrlShortnerResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98017a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f98019c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f98019c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new p(this.f98019c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UrlShortnerResponse> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98017a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                rl.c cVar = a.this.orderShortenerUrlApi;
                String string = StringsKt.C1(this.f98019c).toString();
                this.f98017a = 1;
                obj = cVar.a(string, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                return response.body();
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lpl/b;", "<anonymous>", "(Lmv/O;)Lpl/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$getTipNotification$2", f = "OrdersRepository.kt", l = {508, 507}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super TipNotification>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98020a;

        /* renamed from: b, reason: collision with root package name */
        Object f98021b;

        /* renamed from: c, reason: collision with root package name */
        Object f98022c;

        /* renamed from: d, reason: collision with root package name */
        int f98023d;

        /* renamed from: e, reason: collision with root package name */
        int f98024e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f98025f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f98027h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f98027h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            q qVar = a.this.new q(this.f98027h, continuation);
            qVar.f98025f = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super TipNotification> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x0085, B:29:0x008d, B:30:0x009f, B:31:0x00a4), top: B:51:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0016, B:27:0x0085, B:29:0x008d, B:30:0x009f, B:31:0x00a4), top: B:51:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$isOrderCancelable$2", f = "OrdersRepository.kt", l = {HttpResponseStatus.REDIRECTION_NOT_MODIFIED, HttpResponseStatus.REDIRECTION_SEE_OTHER}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderIsEditCancelableResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98028a;

        /* renamed from: b, reason: collision with root package name */
        Object f98029b;

        /* renamed from: c, reason: collision with root package name */
        Object f98030c;

        /* renamed from: d, reason: collision with root package name */
        Object f98031d;

        /* renamed from: e, reason: collision with root package name */
        int f98032e;

        /* renamed from: f, reason: collision with root package name */
        int f98033f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f98034g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderDetail f98036i;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            r rVar = a.this.new r(this.f98036i, continuation);
            rVar.f98034g = obj;
            return rVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(OrderDetail orderDetail, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f98036i = orderDetail;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderIsEditCancelableResponse> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:23:0x0083, B:25:0x008c, B:29:0x0096, B:31:0x009c, B:33:0x00a2, B:35:0x00a8, B:37:0x00ae, B:39:0x00b4, B:41:0x00ba, B:43:0x00c0, B:45:0x00ca, B:47:0x00d7, B:46:0x00cf), top: B:73:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:23:0x0083, B:25:0x008c, B:29:0x0096, B:31:0x009c, B:33:0x00a2, B:35:0x00a8, B:37:0x00ae, B:39:0x00b4, B:41:0x00ba, B:43:0x00c0, B:45:0x00ca, B:47:0x00d7, B:46:0x00cf), top: B:73:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:23:0x0083, B:25:0x008c, B:29:0x0096, B:31:0x009c, B:33:0x00a2, B:35:0x00a8, B:37:0x00ae, B:39:0x00b4, B:41:0x00ba, B:43:0x00c0, B:45:0x00ca, B:47:0x00d7, B:46:0x00cf), top: B:73:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ba A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:23:0x0083, B:25:0x008c, B:29:0x0096, B:31:0x009c, B:33:0x00a2, B:35:0x00a8, B:37:0x00ae, B:39:0x00b4, B:41:0x00ba, B:43:0x00c0, B:45:0x00ca, B:47:0x00d7, B:46:0x00cf), top: B:73:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ca A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:23:0x0083, B:25:0x008c, B:29:0x0096, B:31:0x009c, B:33:0x00a2, B:35:0x00a8, B:37:0x00ae, B:39:0x00b4, B:41:0x00ba, B:43:0x00c0, B:45:0x00ca, B:47:0x00d7, B:46:0x00cf), top: B:73:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00cf A[Catch: all -> 0x0091, TryCatch #1 {all -> 0x0091, blocks: (B:23:0x0083, B:25:0x008c, B:29:0x0096, B:31:0x009c, B:33:0x00a2, B:35:0x00a8, B:37:0x00ae, B:39:0x00b4, B:41:0x00ba, B:43:0x00c0, B:45:0x00ca, B:47:0x00d7, B:46:0x00cf), top: B:73:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0100 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0019, B:51:0x00f8, B:53:0x0100, B:54:0x010e, B:55:0x0113), top: B:72:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0019, B:51:0x00f8, B:53:0x0100, B:54:0x010e, B:55:0x0113), top: B:72:0x0019 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$isOrderEditable$2", f = "OrdersRepository.kt", l = {446, 445}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderIsEditCancelableResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98037a;

        /* renamed from: b, reason: collision with root package name */
        Object f98038b;

        /* renamed from: c, reason: collision with root package name */
        Object f98039c;

        /* renamed from: d, reason: collision with root package name */
        Object f98040d;

        /* renamed from: e, reason: collision with root package name */
        int f98041e;

        /* renamed from: f, reason: collision with root package name */
        int f98042f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f98043g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderDetail f98045i;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            s sVar = a.this.new s(this.f98045i, continuation);
            sVar.f98043g = obj;
            return sVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(OrderDetail orderDetail, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f98045i = orderDetail;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderIsEditCancelableResponse> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:23:0x0083, B:25:0x008c, B:30:0x0098, B:32:0x00a2, B:34:0x00a8, B:36:0x00ae, B:38:0x00b4, B:40:0x00be, B:42:0x00cb, B:41:0x00c3), top: B:68:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:23:0x0083, B:25:0x008c, B:30:0x0098, B:32:0x00a2, B:34:0x00a8, B:36:0x00ae, B:38:0x00b4, B:40:0x00be, B:42:0x00cb, B:41:0x00c3), top: B:68:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:23:0x0083, B:25:0x008c, B:30:0x0098, B:32:0x00a2, B:34:0x00a8, B:36:0x00ae, B:38:0x00b4, B:40:0x00be, B:42:0x00cb, B:41:0x00c3), top: B:68:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:23:0x0083, B:25:0x008c, B:30:0x0098, B:32:0x00a2, B:34:0x00a8, B:36:0x00ae, B:38:0x00b4, B:40:0x00be, B:42:0x00cb, B:41:0x00c3), top: B:68:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3 A[Catch: all -> 0x0092, TryCatch #1 {all -> 0x0092, blocks: (B:23:0x0083, B:25:0x008c, B:30:0x0098, B:32:0x00a2, B:34:0x00a8, B:36:0x00ae, B:38:0x00b4, B:40:0x00be, B:42:0x00cb, B:41:0x00c3), top: B:68:0x0083 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f3 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0019, B:46:0x00eb, B:48:0x00f3, B:49:0x0101, B:50:0x0106), top: B:67:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0101 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0019, B:46:0x00eb, B:48:0x00f3, B:49:0x0101, B:50:0x0106), top: B:67:0x0019 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 323
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/UpdateSubstitutionAcceptanceResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/UpdateSubstitutionAcceptanceResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$updateOrderSubstitutionAcceptance$2", f = "OrdersRepository.kt", l = {674}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateSubstitutionAcceptanceResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98046a;

        /* renamed from: b, reason: collision with root package name */
        int f98047b;

        /* renamed from: c, reason: collision with root package name */
        int f98048c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f98049d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f98051f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f98052g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<Integer> f98053h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List<Integer> f98054i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, int i10, List<Integer> list, List<Integer> list2, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f98051f = str;
            this.f98052g = i10;
            this.f98053h = list;
            this.f98054i = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            t tVar = a.this.new t(this.f98051f, this.f98052g, this.f98053h, this.f98054i, continuation);
            tVar.f98049d = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateSubstitutionAcceptanceResponse> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0053, B:19:0x005b, B:20:0x0069, B:21:0x006e), top: B:34:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0053, B:19:0x005b, B:20:0x0069, B:21:0x006e), top: B:34:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f98048c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r9.f98046a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r9.f98049d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L17
                goto L53
            L17:
                r10 = move-exception
                goto L73
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                kotlin.ResultKt.b(r10)
                java.lang.Object r10 = r9.f98049d
                mv.O r10 = (mv.InterfaceC15783O) r10
                com.meijer.mobile.digitalshopping.api.orders.a r1 = com.meijer.mobile.digitalshopping.api.orders.a.this
                java.lang.String r3 = r9.f98051f
                int r4 = r9.f98052g
                java.util.List<java.lang.Integer> r5 = r9.f98053h
                java.util.List<java.lang.Integer> r6 = r9.f98054i
                kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L6f
                sl.a r1 = com.meijer.mobile.digitalshopping.api.orders.a.h(r1)     // Catch: java.lang.Throwable -> L6f
                com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceRequest r7 = new com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceRequest     // Catch: java.lang.Throwable -> L6f
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.d(r4)     // Catch: java.lang.Throwable -> L6f
                r7.<init>(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6f
                r9.f98049d = r10     // Catch: java.lang.Throwable -> L6f
                r9.f98046a = r10     // Catch: java.lang.Throwable -> L6f
                r3 = 0
                r9.f98047b = r3     // Catch: java.lang.Throwable -> L6f
                r9.f98048c = r2     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r1 = r1.a(r7, r9)     // Catch: java.lang.Throwable -> L6f
                if (r1 != r0) goto L51
                return r0
            L51:
                r0 = r10
                r10 = r1
            L53:
                retrofit2.Response r10 = (retrofit2.Response) r10     // Catch: java.lang.Throwable -> L17
                boolean r1 = r10.isSuccessful()     // Catch: java.lang.Throwable -> L17
                if (r1 == 0) goto L69
                java.lang.Object r10 = r10.body()     // Catch: java.lang.Throwable -> L17
                kotlin.jvm.internal.Intrinsics.g(r10)     // Catch: java.lang.Throwable -> L17
                com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceResponse r10 = (com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceResponse) r10     // Catch: java.lang.Throwable -> L17
                java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Throwable -> L17
                goto L7d
            L69:
                retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch: java.lang.Throwable -> L17
                r1.<init>(r10)     // Catch: java.lang.Throwable -> L17
                throw r1     // Catch: java.lang.Throwable -> L17
            L6f:
                r0 = move-exception
                r8 = r0
                r0 = r10
                r10 = r8
            L73:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r10 = kotlin.ResultKt.a(r10)
                java.lang.Object r10 = kotlin.Result.b(r10)
            L7d:
                com.meijer.mobile.digitalshopping.api.orders.a r1 = com.meijer.mobile.digitalshopping.api.orders.a.this
                java.lang.Throwable r2 = kotlin.Result.e(r10)
                if (r2 == 0) goto L9c
                kotlin.coroutines.CoroutineContext r10 = r0.getCoroutineContext()
                mv.E0.i(r10)
                boolean r10 = r2 instanceof java.lang.Error
                if (r10 == 0) goto L91
                throw r2
            L91:
                com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException$a r10 = com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException.INSTANCE
                com.squareup.moshi.t r0 = com.meijer.mobile.digitalshopping.api.orders.a.e(r1)
                java.lang.Throwable r10 = r10.a(r2, r0)
                throw r10
            L9c:
                kotlin.ResultKt.b(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderUpdateResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderUpdateResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$updatePickUpOrder$2", f = "OrdersRepository.kt", l = {606}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super PickUpOrderUpdateResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98055a;

        /* renamed from: b, reason: collision with root package name */
        Object f98056b;

        /* renamed from: c, reason: collision with root package name */
        Object f98057c;

        /* renamed from: d, reason: collision with root package name */
        Object f98058d;

        /* renamed from: e, reason: collision with root package name */
        int f98059e;

        /* renamed from: f, reason: collision with root package name */
        int f98060f;

        /* renamed from: g, reason: collision with root package name */
        int f98061g;

        /* renamed from: h, reason: collision with root package name */
        int f98062h;

        /* renamed from: i, reason: collision with root package name */
        int f98063i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f98064j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ PickUpOrderUpdate f98066l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f98067m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(PickUpOrderUpdate pickUpOrderUpdate, String str, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f98066l = pickUpOrderUpdate;
            this.f98067m = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            u uVar = a.this.new u(this.f98066l, this.f98067m, continuation);
            uVar.f98064j = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super PickUpOrderUpdateResponse> continuation) {
            return ((u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Response response;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98063i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f98064j;
                    a aVar = a.this;
                    PickUpOrderUpdate pickUpOrderUpdate = this.f98066l;
                    String str = this.f98067m;
                    Result.Companion companion = Result.INSTANCE;
                    El.a aVar2 = aVar.flyBuyApi;
                    PickUpOrderUpdateRequest pickUpOrderUpdateRequest = new PickUpOrderUpdateRequest(pickUpOrderUpdate);
                    this.f98064j = interfaceC15783O;
                    this.f98055a = interfaceC15783O;
                    this.f98056b = this;
                    this.f98057c = this;
                    this.f98058d = interfaceC15783O;
                    this.f98059e = 0;
                    this.f98060f = 0;
                    this.f98061g = 0;
                    this.f98062h = 0;
                    this.f98063i = 1;
                    obj = aVar2.b(pickUpOrderUpdateRequest, str, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                response = (Response) obj;
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.g(objBody);
                objB = Result.b(objBody);
                a aVar3 = a.this;
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    try {
                        throw DigitalShoppingApiException.INSTANCE.a(thE, aVar3.moshi);
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.INSTANCE;
                        objB = Result.b(ResultKt.a(th2));
                    }
                }
                ResultKt.b(objB);
                return objB;
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.orders.OrdersRepository$updateTipNotificationToClosed$2", f = "OrdersRepository.kt", l = {534, 533}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98068a;

        /* renamed from: b, reason: collision with root package name */
        Object f98069b;

        /* renamed from: c, reason: collision with root package name */
        Object f98070c;

        /* renamed from: d, reason: collision with root package name */
        Object f98071d;

        /* renamed from: e, reason: collision with root package name */
        int f98072e;

        /* renamed from: f, reason: collision with root package name */
        int f98073f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f98074g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f98076i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f98077j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str, String str2, Continuation<? super v> continuation) {
            super(2, continuation);
            this.f98076i = str;
            this.f98077j = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            v vVar = a.this.new v(this.f98076i, this.f98077j, continuation);
            vVar.f98074g = obj;
            return vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        
            if (r15 == r0) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDetail H(OrderDetail orderDetail, OrderDetail it) {
        Intrinsics.j(it, "it");
        return orderDetail;
    }

    public a(Yi.a tokenProvider, Tq.j storeProvider, InterfaceC15731a archivedOrdersApi, ml.d ordersApi, ml.e ordersDigitalApi, InterfaceC17081a orderSubstitutionApi, El.a flyBuyApi, InterfaceC16681a orderRewardApi, rl.c orderShortenerUrlApi, C14768C cartProvider, com.squareup.moshi.t moshi, AbstractC15779K ioDispatcher) {
        Intrinsics.j(tokenProvider, "tokenProvider");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(archivedOrdersApi, "archivedOrdersApi");
        Intrinsics.j(ordersApi, "ordersApi");
        Intrinsics.j(ordersDigitalApi, "ordersDigitalApi");
        Intrinsics.j(orderSubstitutionApi, "orderSubstitutionApi");
        Intrinsics.j(flyBuyApi, "flyBuyApi");
        Intrinsics.j(orderRewardApi, "orderRewardApi");
        Intrinsics.j(orderShortenerUrlApi, "orderShortenerUrlApi");
        Intrinsics.j(cartProvider, "cartProvider");
        Intrinsics.j(moshi, "moshi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.tokenProvider = tokenProvider;
        this.storeProvider = storeProvider;
        this.archivedOrdersApi = archivedOrdersApi;
        this.ordersApi = ordersApi;
        this.ordersDigitalApi = ordersDigitalApi;
        this.orderSubstitutionApi = orderSubstitutionApi;
        this.flyBuyApi = flyBuyApi;
        this.orderRewardApi = orderRewardApi;
        this.orderShortenerUrlApi = orderShortenerUrlApi;
        this.cartProvider = cartProvider;
        this.moshi = moshi;
        this.ioDispatcher = ioDispatcher;
        this.latestDetailStore = new Ek.n<>(new OrderDetail(null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0, 0, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, false, false, null, null, null, null, false, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 31, null));
    }

    public static /* synthetic */ Object A(a aVar, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 20;
        }
        return aVar.z(i10, i11, continuation);
    }

    public static /* synthetic */ Object u(a aVar, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 10;
        }
        return aVar.t(i10, i11, continuation);
    }

    public final Object B(String str, Continuation<? super OrderRewardPointsForOrderResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new o(str, null), continuation);
    }

    public final Object C(String str, Continuation<? super UrlShortnerResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new p(str, null), continuation);
    }

    public final Object D(String str, Continuation<? super TipNotification> continuation) {
        return C15805i.g(this.ioDispatcher, new q(str, null), continuation);
    }

    public final Object E(OrderDetail orderDetail, Continuation<? super OrderIsEditCancelableResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new r(orderDetail, null), continuation);
    }

    public final Object F(OrderDetail orderDetail, Continuation<? super OrderIsEditCancelableResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new s(orderDetail, null), continuation);
    }

    public final io.reactivex.u<OrderDetail> G(final OrderDetail orderDetail) {
        Intrinsics.j(orderDetail, "orderDetail");
        FS.setUserVars(MapsKt.g(TuplesKt.a("orderNumber", orderDetail.getCode())));
        return this.latestDetailStore.a(new Function1() { // from class: ml.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.meijer.mobile.digitalshopping.api.orders.a.H(orderDetail, (OrderDetail) obj);
            }
        });
    }

    public final Object I(String str, int i10, List<Integer> list, List<Integer> list2, Continuation<? super UpdateSubstitutionAcceptanceResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new t(str, i10, list, list2, null), continuation);
    }

    public final Object J(String str, PickUpOrderUpdate pickUpOrderUpdate, Continuation<? super PickUpOrderUpdateResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new u(pickUpOrderUpdate, str, null), continuation);
    }

    public final Object K(String str, String str2, Continuation<? super Unit> continuation) {
        return C15805i.g(this.ioDispatcher, new v(str2, str, null), continuation);
    }

    public final Object m(String str, int i10, Continuation<? super Unit> continuation) {
        return C15805i.g(this.ioDispatcher, new b(str, i10, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r2 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(hj.OrderDetail r19, kotlin.coroutines.Continuation<? super java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.n(hj.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object o(String str, int i10, Continuation<? super String> continuation) {
        return C15805i.g(this.ioDispatcher, new c(str, i10, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r2 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(hj.OrderDetail r19, kotlin.coroutines.Continuation<? super fj.CartChanges> r20) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.p(hj.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object q(String str, int i10, Continuation<? super CartChanges> continuation) {
        return C15805i.g(this.ioDispatcher, new f(str, i10, null), continuation);
    }

    public final Object r(String str, String str2, Continuation<? super Unit> continuation) {
        return C15805i.g(this.ioDispatcher, new g(str, str2, null), continuation);
    }

    public final Object s(String str, Continuation<? super OrderDetail> continuation) {
        return C15805i.g(this.ioDispatcher, new h(str, null), continuation);
    }

    public final Object t(int i10, int i11, Continuation<? super OrderHistory> continuation) {
        return C15805i.g(this.ioDispatcher, new i(i10, i11, null), continuation);
    }

    public final Object v(int i10, Continuation<? super FlyBuyOrderDetail> continuation) {
        return C15805i.g(this.ioDispatcher, new j(i10, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r5, kotlin.coroutines.Continuation<? super io.reactivex.u<hj.OrderDetail>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.digitalshopping.api.orders.a.k
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.digitalshopping.api.orders.a$k r0 = (com.meijer.mobile.digitalshopping.api.orders.a.k) r0
            int r1 = r0.f97977f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97977f = r1
            goto L18
        L13:
            com.meijer.mobile.digitalshopping.api.orders.a$k r0 = new com.meijer.mobile.digitalshopping.api.orders.a$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f97975d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f97977f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f97973b
            com.meijer.mobile.digitalshopping.api.orders.a r5 = (com.meijer.mobile.digitalshopping.api.orders.a) r5
            java.lang.Object r5 = r0.f97972a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.b(r6)
            goto L6c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.b(r6)
            Ek.n<hj.c> r6 = r4.latestDetailStore
            java.lang.Object r6 = r6.p()
            r2 = r6
            hj.c r2 = (hj.OrderDetail) r2
            java.lang.String r2 = r2.getCode()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r5)
            if (r2 == 0) goto L50
            goto L51
        L50:
            r6 = 0
        L51:
            hj.c r6 = (hj.OrderDetail) r6
            if (r6 == 0) goto L5c
            io.reactivex.u r6 = io.reactivex.u.i(r6)
            if (r6 == 0) goto L5c
            return r6
        L5c:
            r0.f97972a = r5
            r0.f97973b = r4
            r6 = 0
            r0.f97974c = r6
            r0.f97977f = r3
            java.lang.Object r6 = r4.y(r5, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            io.reactivex.u r5 = io.reactivex.u.i(r6)
            java.lang.String r6 = "run(...)"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.digitalshopping.api.orders.a.w(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object x(String str, Continuation<? super OrderSubstitutionsDetail> continuation) {
        return C15805i.g(this.ioDispatcher, new l(str, null), continuation);
    }

    public final Object y(String str, Continuation<? super OrderDetail> continuation) {
        return C15805i.g(this.ioDispatcher, new m(str, null), continuation);
    }

    public final Object z(int i10, int i11, Continuation<? super OrderHistory> continuation) {
        return C15805i.g(this.ioDispatcher, new n(i10, i11, null), continuation);
    }
}
