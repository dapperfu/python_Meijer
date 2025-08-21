package com.radiusnetworks.flybuy.sdk.data.operations;

import androidx.view.AbstractC6127A;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.order.CreateOrderInfo;
import com.radiusnetworks.flybuy.sdk.data.order.LocalOrdersRepository;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J#\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\n2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001c\u001a\u00020\u001a2$\u0010\u001b\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\b2\u001e\u0010\u001b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018¢\u0006\u0004\b\u001f\u0010 J5\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u001e\u0010\u001b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018¢\u0006\u0004\b#\u0010$J[\u0010*\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\b2\b\u0010(\u001a\u0004\u0018\u00010\b2\b\u0010)\u001a\u0004\u0018\u00010\b2\u001e\u0010\u001b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b-\u0010.J-\u00102\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/2\u0016\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u000101¢\u0006\u0004\b2\u00103J5\u00106\u001a\u00020\u001a2\u0006\u00105\u001a\u0002042\u001e\u0010\u001b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\n8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\n8F¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128F¢\u0006\u0006\u001a\u0004\bB\u0010@¨\u0006D"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/OrdersOperation;", "", "Lcom/radiusnetworks/flybuy/sdk/data/order/LocalOrdersRepository;", "localOrdersRepository", "Lcom/radiusnetworks/flybuy/sdk/data/operations/RemoteOrdersOperation;", "remoteOrdersOperation", "<init>", "(Lcom/radiusnetworks/flybuy/sdk/data/order/LocalOrdersRepository;Lcom/radiusnetworks/flybuy/sdk/data/operations/RemoteOrdersOperation;)V", "", "redemptionCode", "Landroidx/lifecycle/A;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "getOrder", "(Ljava/lang/String;)Landroidx/lifecycle/A;", "", PreferencesHelper.PREF_ID, "(I)Landroidx/lifecycle/A;", "orderId", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "getBeaconRegionsForOrder", "", "orderHasBeaconRegions", "(I)Z", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "", "callback", "sync", "(Lkotlin/jvm/functions/Function2;)V", "code", "findOrder", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/order/CreateOrderInfo;", "createOrderInfo", "createOrder", "(Lcom/radiusnetworks/flybuy/sdk/data/order/CreateOrderInfo;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "customerInfo", "pickupType", "spotIdentifier", "handoffVehicleLocation", "claimOrder", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "token", "updatePushToken", "(Ljava/lang/String;)V", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;", "pushData", "Lkotlin/Function1;", "updateFromPushData", "(Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushData;Lkotlin/jvm/functions/Function1;)V", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "orderEventInfo", "event", "(Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/order/LocalOrdersRepository;", "Lcom/radiusnetworks/flybuy/sdk/data/operations/RemoteOrdersOperation;", "getOpenLiveData", "()Landroidx/lifecycle/A;", "openLiveData", "getAllLiveData", "allLiveData", "getAll", "()Ljava/util/List;", "all", "getOpen", "open", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrdersOperation {
    private final LocalOrdersRepository localOrdersRepository;
    private final RemoteOrdersOperation remoteOrdersOperation;

    public final AbstractC6127A<Order> getOrder(String redemptionCode) {
        Intrinsics.j(redemptionCode, "redemptionCode");
        return this.localOrdersRepository.getOrder(redemptionCode);
    }

    public OrdersOperation(LocalOrdersRepository localOrdersRepository, RemoteOrdersOperation remoteOrdersOperation) {
        Intrinsics.j(localOrdersRepository, "localOrdersRepository");
        Intrinsics.j(remoteOrdersOperation, "remoteOrdersOperation");
        this.localOrdersRepository = localOrdersRepository;
        this.remoteOrdersOperation = remoteOrdersOperation;
    }

    public final void claimOrder(String code, CustomerInfo customerInfo, String pickupType, String spotIdentifier, String handoffVehicleLocation, Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(code, "code");
        Intrinsics.j(customerInfo, "customerInfo");
        this.remoteOrdersOperation.claimOrder(code, customerInfo, pickupType, spotIdentifier, handoffVehicleLocation, callback);
    }

    public final void createOrder(CreateOrderInfo createOrderInfo, Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(createOrderInfo, "createOrderInfo");
        this.remoteOrdersOperation.createOrder(createOrderInfo, callback);
    }

    public final void event(OrderEventInfo orderEventInfo, Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(orderEventInfo, "orderEventInfo");
        this.remoteOrdersOperation.event(orderEventInfo, callback);
    }

    public final void findOrder(String code, Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(code, "code");
        this.remoteOrdersOperation.findOrder(code, callback);
    }

    public final List<Order> getAll() {
        return this.localOrdersRepository.getAll();
    }

    public final AbstractC6127A<List<Order>> getAllLiveData() {
        return this.localOrdersRepository.getAllLiveData();
    }

    public final AbstractC6127A<List<BeaconRegion>> getBeaconRegionsForOrder(int orderId) {
        return this.localOrdersRepository.getBeaconRegionsForOrder(orderId);
    }

    public final List<Order> getOpen() {
        return this.localOrdersRepository.getOpen();
    }

    public final AbstractC6127A<List<Order>> getOpenLiveData() {
        return this.localOrdersRepository.getOpenLiveData();
    }

    public final AbstractC6127A<Order> getOrder(int id2) {
        return this.localOrdersRepository.getOrder(id2);
    }

    public final boolean orderHasBeaconRegions(int orderId) {
        return !this.localOrdersRepository.findBeaconRegionsForOrder(orderId).isEmpty();
    }

    public final void sync(Function2<? super List<Order>, ? super SdkError, Unit> callback) {
        this.remoteOrdersOperation.sync(callback);
    }

    public final void updateFromPushData(FlybuyPushData pushData, Function1<? super SdkError, Unit> callback) {
        Intrinsics.j(pushData, "pushData");
        this.localOrdersRepository.updateOrderFromPush(pushData, callback);
    }

    public final void updatePushToken(String token) {
        Intrinsics.j(token, "token");
        this.remoteOrdersOperation.updatePushToken(token);
    }
}
