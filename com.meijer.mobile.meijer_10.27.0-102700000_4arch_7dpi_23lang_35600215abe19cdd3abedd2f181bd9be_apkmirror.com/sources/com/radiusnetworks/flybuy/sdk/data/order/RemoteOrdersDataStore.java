package com.radiusnetworks.flybuy.sdk.data.order;

import android.content.Context;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.model.GetOrdersResponse;
import com.radiusnetworks.flybuy.api.model.OrderResponse;
import com.radiusnetworks.flybuy.api.model.UpdateOrderRequestData;
import com.radiusnetworks.flybuy.api.network.common.ApiEmptyResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfoKt;
import com.radiusnetworks.flybuy.sdk.data.location.LocationPermissionState;
import com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore;
import com.radiusnetworks.flybuy.sdk.data.room.dao.BeaconRegionDao;
import com.radiusnetworks.flybuy.sdk.data.room.dao.OrderDao;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabaseExtensionsKt;
import com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Customer;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.data.room.domain.OrderKt;
import com.radiusnetworks.flybuy.sdk.manager.OrdersManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16623P;
import qv.C16639f0;
import qv.C16644i;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JV\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0016J0\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0016J0\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0016J0\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0016J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J.\u0010%\u001a\u00020\u00062$\u0010\u000e\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fH\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/order/RemoteOrdersDataStore;", "Lcom/radiusnetworks/flybuy/sdk/data/order/RemoteOrdersRepository;", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "claimOrder", "", "code", "", "customerInfo", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "pickupType", "spotIdentifier", "handoffVehicleLocation", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "createOrder", "orderInfo", "Lcom/radiusnetworks/flybuy/sdk/data/order/CreateOrderInfo;", "event", "orderEventInfo", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "findOrder", "getOrder", "orderId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrdersInDb", "orders", "", "beaconRegions", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "updateCustomer", "", "sendPermissionState", "sync", "updatePushToken", "token", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalUnsignedTypes
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RemoteOrdersDataStore implements RemoteOrdersRepository {
    private final Context applicationContext;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$event$5, reason: invalid class name */
    public static final class AnonymousClass5 extends Lambda implements Function1<ApiResponse<Unit>, Unit> {
        final /* synthetic */ OrderEventInfo $orderEventInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(OrderEventInfo orderEventInfo) {
            super(1);
            this.$orderEventInfo = orderEventInfo;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Unit> apiResponse) {
            invoke2(apiResponse);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(OrderEventInfo orderEventInfo, AppDatabase db2) {
            Intrinsics.j(orderEventInfo, "$orderEventInfo");
            Intrinsics.j(db2, "$db");
            AppDatabaseExtensionsKt.updateOrderStates(db2, orderEventInfo.getOrderId(), orderEventInfo.getState(), orderEventInfo.getCustomerState(), null);
            if (orderEventInfo.getCustomerRatingValue() != null) {
                db2.orderDao$core_defaultRelease().updateCustomerRating(orderEventInfo.getOrderId(), orderEventInfo.getCustomerRatingValue().intValue(), orderEventInfo.getCustomerRatingComments());
            }
            if (orderEventInfo.getSpotIdentifier() != null) {
                db2.orderDao$core_defaultRelease().updateSpotIdentifier(orderEventInfo.getOrderId(), orderEventInfo.getSpotIdentifier());
            }
            if (orderEventInfo.getEventType() == OrderEventType.PICKUP_TYPE_CHANGE) {
                db2.orderDao$core_defaultRelease().updatePickupType(orderEventInfo.getOrderId(), orderEventInfo.getPickupType());
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ApiResponse<Unit> response) {
            Intrinsics.j(response, "response");
            if ((response instanceof ApiSuccessResponse) || (response instanceof ApiEmptyResponse)) {
                final AppDatabase companion = AppDatabase.INSTANCE.getInstance(RemoteOrdersDataStore.this.applicationContext);
                final OrderEventInfo orderEventInfo = this.$orderEventInfo;
                companion.runInTransaction(new Runnable() { // from class: com.radiusnetworks.flybuy.sdk.data.order.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        RemoteOrdersDataStore.AnonymousClass5.invoke$lambda$1(orderEventInfo, companion);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "<anonymous>", "(Lqv/O;)Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$getOrder$2", f = "RemoteOrdersDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$getOrder$2, reason: invalid class name and case insensitive filesystem */
    public static final class C130182 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Order>, Object> {
        final /* synthetic */ int $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130182(int i10, Continuation<? super C130182> continuation) {
            super(2, continuation);
            this.$orderId = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RemoteOrdersDataStore.this.new C130182(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Order> continuation) {
            return ((C130182) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.label == 0) {
                ResultKt.b(obj);
                return AppDatabase.INSTANCE.getInstance(RemoteOrdersDataStore.this.applicationContext).orderDao$core_defaultRelease().findOrderByOrderId(this.$orderId);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$updatePushToken$1", f = "RemoteOrdersDataStore.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$updatePushToken$1, reason: invalid class name and case insensitive filesystem */
    public static final class C130231 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ RemoteOrdersDataStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130231(String str, RemoteOrdersDataStore remoteOrdersDataStore, Continuation<? super C130231> continuation) {
            super(2, continuation);
            this.$token = str;
            this.this$0 = remoteOrdersDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C130231(this.$token, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C130231) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            IntrinsicsKt.f();
            if (this.label == 0) {
                ResultKt.b(obj);
                List<Order> open = FlyBuyCore.getOrders().getOpen();
                String str = this.$token;
                final RemoteOrdersDataStore remoteOrdersDataStore = this.this$0;
                for (Order order : open) {
                    if (!Intrinsics.e(order.getPushToken(), str)) {
                        final UpdateOrderRequestData updateOrderRequestData = new UpdateOrderRequestData(order.getSite().getId(), null, null, null, null, null, str, 62, null);
                        final String redemptionCode = order.getRedemptionCode();
                        if (redemptionCode != null) {
                            ApiExtensionsKt.executeApi(remoteOrdersDataStore.applicationContext, new Function0<ApiResponse<OrderResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$updatePushToken$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final ApiResponse<OrderResponse> invoke() {
                                    return FlyBuyApi.updateOrder(redemptionCode, updateOrderRequestData);
                                }
                            }, new Function1<OrderResponse, Pair<? extends Order, ? extends List<? extends BeaconRegion>>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$updatePushToken$1$1$1$2
                                @Override // kotlin.jvm.functions.Function1
                                public final Pair<Order, List<BeaconRegion>> invoke(OrderResponse it) {
                                    Intrinsics.j(it, "it");
                                    return OrderKt.toOrderAndBeaconRegions(it);
                                }
                            }, new Function1<ApiResponse<Pair<? extends Order, ? extends List<? extends BeaconRegion>>>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$updatePushToken$1$1$1$3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Pair<? extends Order, ? extends List<? extends BeaconRegion>>> apiResponse) {
                                    invoke2((ApiResponse<Pair<Order, List<BeaconRegion>>>) apiResponse);
                                    return Unit.f142422a;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(ApiResponse<Pair<Order, List<BeaconRegion>>> rsp) {
                                    Order order2;
                                    Intrinsics.j(rsp, "rsp");
                                    if (!(rsp instanceof ApiSuccessResponse) || (order2 = (Order) ((Pair) ((ApiSuccessResponse) rsp).getBody()).c()) == null) {
                                        return;
                                    }
                                    AppDatabase.INSTANCE.getInstance(remoteOrdersDataStore.applicationContext).orderDao$core_defaultRelease().insertOrUpdate(order2);
                                }
                            }, null);
                        }
                    }
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public RemoteOrdersDataStore(Context applicationContext) {
        Intrinsics.j(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertOrdersInDb(final List<Order> orders, final List<BeaconRegion> beaconRegions, final boolean updateCustomer) {
        final AppDatabase companion = AppDatabase.INSTANCE.getInstance(this.applicationContext);
        companion.runInTransaction(new Runnable() { // from class: com.radiusnetworks.flybuy.sdk.data.order.a
            @Override // java.lang.Runnable
            public final void run() {
                RemoteOrdersDataStore.insertOrdersInDb$lambda$4(orders, beaconRegions, updateCustomer, companion);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertOrdersInDb$lambda$4(List orders, List list, boolean z10, AppDatabase db2) {
        Customer customer;
        Intrinsics.j(orders, "$orders");
        Intrinsics.j(db2, "$db");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(orders, 10));
        Iterator it = orders.iterator();
        while (it.hasNext()) {
            Order order = (Order) it.next();
            if (z10) {
                try {
                    customer = (Customer) CollectionsKt.s0(db2.customerDao$core_defaultRelease().currentUser());
                } catch (Exception unused) {
                    customer = null;
                }
                OrderKt.updateOrderWithCustomerInfo(order, customer);
            }
            arrayList.add(order);
        }
        OrderDao orderDaoOrderDao$core_defaultRelease = db2.orderDao$core_defaultRelease();
        Order[] orderArr = (Order[]) arrayList.toArray(new Order[0]);
        orderDaoOrderDao$core_defaultRelease.insertOrUpdateAll((Order[]) Arrays.copyOf(orderArr, orderArr.length));
        if (list != null) {
            BeaconRegionDao beaconRegionDaoBeaconRegionDao$core_defaultRelease = db2.beaconRegionDao$core_defaultRelease();
            BeaconRegion[] beaconRegionArr = (BeaconRegion[]) list.toArray(new BeaconRegion[0]);
            beaconRegionDaoBeaconRegionDao$core_defaultRelease.insertAll((BeaconRegion[]) Arrays.copyOf(beaconRegionArr, beaconRegionArr.length));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPermissionState(int orderId) throws Exception {
        FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
        LocationPermissionState locationPermissionStateCurrentLocationPermissionState = flyBuyCore.currentLocationPermissionState();
        OrdersManager.event$default(FlyBuyCore.getOrders(), new OrderEventInfo(orderId, OrderEventType.PERMISSION_UPDATE, null, null, null, null, null, null, null, locationPermissionStateCurrentLocationPermissionState, null, null, null, null, null, null, null, null, 261628, null), null, 2, null);
        flyBuyCore.setLastLocationPermissionState(locationPermissionStateCurrentLocationPermissionState);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersRepository
    public void claimOrder(final String code, final CustomerInfo customerInfo, final String pickupType, final String spotIdentifier, final String handoffVehicleLocation, final Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(code, "code");
        Intrinsics.j(customerInfo, "customerInfo");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<OrderResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.claimOrder.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<OrderResponse> invoke() {
                return FlyBuyApi.claimOrder(code, CustomerInfoKt.toApiClaimOrder(customerInfo, pickupType, spotIdentifier, handoffVehicleLocation));
            }
        }, new Function1<OrderResponse, Pair<? extends Order, ? extends List<? extends BeaconRegion>>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.claimOrder.2
            @Override // kotlin.jvm.functions.Function1
            public final Pair<Order, List<BeaconRegion>> invoke(OrderResponse it) {
                Intrinsics.j(it, "it");
                return OrderKt.toOrderAndBeaconRegions(it);
            }
        }, new Function1<ApiResponse<Pair<? extends Order, ? extends List<? extends BeaconRegion>>>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.claimOrder.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Pair<? extends Order, ? extends List<? extends BeaconRegion>>> apiResponse) throws Exception {
                invoke2((ApiResponse<Pair<Order, List<BeaconRegion>>>) apiResponse);
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<Pair<Order, List<BeaconRegion>>> response) throws Exception {
                Order order;
                Intrinsics.j(response, "response");
                if (!(response instanceof ApiSuccessResponse) || (order = (Order) ((Pair) ((ApiSuccessResponse) response).getBody()).c()) == null) {
                    return;
                }
                RemoteOrdersDataStore remoteOrdersDataStore = RemoteOrdersDataStore.this;
                remoteOrdersDataStore.sendPermissionState(order.getId());
                AppDatabase.INSTANCE.getInstance(remoteOrdersDataStore.applicationContext).orderDao$core_defaultRelease().insertOrUpdateAll(order);
            }
        }, new Function2<Pair<? extends Order, ? extends List<? extends BeaconRegion>>, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.claimOrder.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Order, ? extends List<? extends BeaconRegion>> pair, SdkError sdkError) {
                invoke2((Pair<Order, ? extends List<BeaconRegion>>) pair, sdkError);
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<Order, ? extends List<BeaconRegion>> pair, SdkError sdkError) {
                Function2<Order, SdkError, Unit> function2 = callback;
                if (function2 != null) {
                    function2.invoke(pair != null ? pair.c() : null, sdkError);
                }
            }
        });
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersRepository
    public void createOrder(final CreateOrderInfo orderInfo, final Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(orderInfo, "orderInfo");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<OrderResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.createOrder.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<OrderResponse> invoke() {
                return FlyBuyApi.createOrder(CreateOrderInfoKt.toApiCreateOrderData(orderInfo));
            }
        }, new Function1<OrderResponse, Pair<? extends Order, ? extends List<? extends BeaconRegion>>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.createOrder.2
            @Override // kotlin.jvm.functions.Function1
            public final Pair<Order, List<BeaconRegion>> invoke(OrderResponse it) {
                Intrinsics.j(it, "it");
                return OrderKt.toOrderAndBeaconRegions(it);
            }
        }, new Function1<ApiResponse<Pair<? extends Order, ? extends List<? extends BeaconRegion>>>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.createOrder.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Pair<? extends Order, ? extends List<? extends BeaconRegion>>> apiResponse) throws Exception {
                invoke2((ApiResponse<Pair<Order, List<BeaconRegion>>>) apiResponse);
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<Pair<Order, List<BeaconRegion>>> response) throws Exception {
                Order order;
                Intrinsics.j(response, "response");
                if (!(response instanceof ApiSuccessResponse) || (order = (Order) ((Pair) ((ApiSuccessResponse) response).getBody()).c()) == null) {
                    return;
                }
                RemoteOrdersDataStore remoteOrdersDataStore = RemoteOrdersDataStore.this;
                remoteOrdersDataStore.sendPermissionState(order.getId());
                AppDatabase.INSTANCE.getInstance(remoteOrdersDataStore.applicationContext).orderDao$core_defaultRelease().insertOrUpdate(order);
            }
        }, new Function2<Pair<? extends Order, ? extends List<? extends BeaconRegion>>, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.createOrder.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Order, ? extends List<? extends BeaconRegion>> pair, SdkError sdkError) {
                invoke2((Pair<Order, ? extends List<BeaconRegion>>) pair, sdkError);
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<Order, ? extends List<BeaconRegion>> pair, SdkError sdkError) {
                Function2<Order, SdkError, Unit> function2 = callback;
                if (function2 != null) {
                    function2.invoke(pair != null ? pair.c() : null, sdkError);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    @Override // com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void event(final com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo r8, final kotlin.jvm.functions.Function2<? super com.radiusnetworks.flybuy.sdk.data.room.domain.Order, ? super com.radiusnetworks.flybuy.sdk.data.common.SdkError, kotlin.Unit> r9) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.event(com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo, kotlin.jvm.functions.Function2):void");
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersRepository
    public void findOrder(final String code, final Function2<? super Order, ? super SdkError, Unit> callback) {
        Object next;
        Intrinsics.j(code, "code");
        Iterator<T> it = FlyBuyCore.getOrders().getAll().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.e(((Order) next).getRedemptionCode(), code)) {
                    break;
                }
            }
        }
        Order order = (Order) next;
        if (order == null) {
            ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<OrderResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$findOrder$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ApiResponse<OrderResponse> invoke() {
                    return FlyBuyApi.findOrder(code);
                }
            }, new Function1<OrderResponse, Pair<? extends Order, ? extends List<? extends BeaconRegion>>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$findOrder$3$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Pair<Order, List<BeaconRegion>> invoke(OrderResponse it2) {
                    Customer customer;
                    Intrinsics.j(it2, "it");
                    Pair<Order, List<BeaconRegion>> orderAndBeaconRegions = OrderKt.toOrderAndBeaconRegions(it2);
                    RemoteOrdersDataStore remoteOrdersDataStore = this.$this_run;
                    Order orderC = orderAndBeaconRegions.c();
                    if (orderC != null) {
                        try {
                            customer = (Customer) CollectionsKt.s0(AppDatabase.INSTANCE.getInstance(remoteOrdersDataStore.applicationContext).customerDao$core_defaultRelease().currentUser());
                        } catch (Exception unused) {
                            customer = null;
                        }
                        OrderKt.updateOrderWithCustomerInfo(orderC, customer);
                    }
                    return orderAndBeaconRegions;
                }
            }, new Function1<ApiResponse<Pair<? extends Order, ? extends List<? extends BeaconRegion>>>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$findOrder$3$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Pair<? extends Order, ? extends List<? extends BeaconRegion>>> apiResponse) {
                    invoke2((ApiResponse<Pair<Order, List<BeaconRegion>>>) apiResponse);
                    return Unit.f142422a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ApiResponse<Pair<Order, List<BeaconRegion>>> response) {
                    Intrinsics.j(response, "response");
                    if (response instanceof ApiSuccessResponse) {
                        ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) response;
                        Order order2 = (Order) ((Pair) apiSuccessResponse.getBody()).c();
                        if (order2 != null) {
                            this.$this_run.insertOrdersInDb(CollectionsKt.e(order2), (List) ((Pair) apiSuccessResponse.getBody()).d(), true);
                        }
                    }
                }
            }, new Function2<Pair<? extends Order, ? extends List<? extends BeaconRegion>>, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore$findOrder$3$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Order, ? extends List<? extends BeaconRegion>> pair, SdkError sdkError) {
                    invoke2((Pair<Order, ? extends List<BeaconRegion>>) pair, sdkError);
                    return Unit.f142422a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Pair<Order, ? extends List<BeaconRegion>> pair, SdkError sdkError) {
                    Function2<Order, SdkError, Unit> function2 = callback;
                    if (function2 != null) {
                        function2.invoke(pair != null ? pair.c() : null, sdkError);
                    }
                }
            });
        } else if (callback != null) {
            callback.invoke(order, null);
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersRepository
    public void sync(final Function2<? super List<Order>, ? super SdkError, Unit> callback) {
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<GetOrdersResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.sync.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<GetOrdersResponse> invoke() {
                return FlyBuyApi.getOrders();
            }
        }, new Function1<GetOrdersResponse, Pair<? extends List<? extends Order>, ? extends List<? extends BeaconRegion>>>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.sync.2
            @Override // kotlin.jvm.functions.Function1
            public final Pair<List<Order>, List<BeaconRegion>> invoke(GetOrdersResponse it) {
                Intrinsics.j(it, "it");
                return OrderKt.toOrdersAndBeaconRegions(it);
            }
        }, new Function1<ApiResponse<Pair<? extends List<? extends Order>, ? extends List<? extends BeaconRegion>>>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.sync.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Pair<? extends List<? extends Order>, ? extends List<? extends BeaconRegion>>> apiResponse) {
                invoke2((ApiResponse<Pair<List<Order>, List<BeaconRegion>>>) apiResponse);
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<Pair<List<Order>, List<BeaconRegion>>> response) {
                Intrinsics.j(response, "response");
                if (response instanceof ApiSuccessResponse) {
                    ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) response;
                    List list = (List) ((Pair) apiSuccessResponse.getBody()).c();
                    if (list != null) {
                        RemoteOrdersDataStore.this.insertOrdersInDb(list, (List) ((Pair) apiSuccessResponse.getBody()).d(), false);
                    }
                    String pushToken = FlyBuyApi.INSTANCE.getPushToken();
                    if (pushToken != null) {
                        RemoteOrdersDataStore.this.updatePushToken(pushToken);
                    }
                }
            }
        }, new Function2<Pair<? extends List<? extends Order>, ? extends List<? extends BeaconRegion>>, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersDataStore.sync.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends Order>, ? extends List<? extends BeaconRegion>> pair, SdkError sdkError) {
                invoke2((Pair<? extends List<Order>, ? extends List<BeaconRegion>>) pair, sdkError);
                return Unit.f142422a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<? extends List<Order>, ? extends List<BeaconRegion>> pair, SdkError sdkError) {
                Function2<List<Order>, SdkError, Unit> function2 = callback;
                if (function2 != null) {
                    function2.invoke(pair != null ? pair.c() : null, sdkError);
                }
            }
        });
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersRepository
    public void updatePushToken(String token) {
        Intrinsics.j(token, "token");
        C16648k.d(C16623P.a(C16639f0.b()), null, null, new C130231(token, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getOrder(int i10, Continuation<? super Order> continuation) {
        return C16644i.g(C16639f0.b(), new C130182(i10, null), continuation);
    }
}
