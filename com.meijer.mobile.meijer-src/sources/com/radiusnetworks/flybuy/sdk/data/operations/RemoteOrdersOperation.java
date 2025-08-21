package com.radiusnetworks.flybuy.sdk.data.operations;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.order.CreateOrderInfo;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo;
import com.radiusnetworks.flybuy.sdk.data.order.RemoteOrdersRepository;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JT\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fJ.\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fJ.\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fJ.\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\u000e\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fJ,\u0010\u0019\u001a\u00020\u00062$\u0010\u000e\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fJ\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/RemoteOrdersOperation;", "", "remoteOrdersRepository", "Lcom/radiusnetworks/flybuy/sdk/data/order/RemoteOrdersRepository;", "(Lcom/radiusnetworks/flybuy/sdk/data/order/RemoteOrdersRepository;)V", "claimOrder", "", "code", "", "customerInfo", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "pickupType", "spotIdentifier", "handoffVehicleLocation", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "createOrder", "createOrderInfo", "Lcom/radiusnetworks/flybuy/sdk/data/order/CreateOrderInfo;", "event", "orderEventInfo", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "findOrder", "sync", "", "updatePushToken", "token", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RemoteOrdersOperation {
    private final RemoteOrdersRepository remoteOrdersRepository;

    public RemoteOrdersOperation(RemoteOrdersRepository remoteOrdersRepository) {
        Intrinsics.j(remoteOrdersRepository, "remoteOrdersRepository");
        this.remoteOrdersRepository = remoteOrdersRepository;
    }

    public final void claimOrder(String code, CustomerInfo customerInfo, String pickupType, String spotIdentifier, String handoffVehicleLocation, Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(code, "code");
        Intrinsics.j(customerInfo, "customerInfo");
        this.remoteOrdersRepository.claimOrder(code, customerInfo, pickupType, spotIdentifier, handoffVehicleLocation, callback);
    }

    public final void createOrder(CreateOrderInfo createOrderInfo, Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(createOrderInfo, "createOrderInfo");
        this.remoteOrdersRepository.createOrder(createOrderInfo, callback);
    }

    public final void event(OrderEventInfo orderEventInfo, Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(orderEventInfo, "orderEventInfo");
        this.remoteOrdersRepository.event(orderEventInfo, callback);
    }

    public final void findOrder(String code, Function2<? super Order, ? super SdkError, Unit> callback) {
        Intrinsics.j(code, "code");
        this.remoteOrdersRepository.findOrder(code, callback);
    }

    public final void sync(Function2<? super List<Order>, ? super SdkError, Unit> callback) {
        this.remoteOrdersRepository.sync(callback);
    }

    public final void updatePushToken(String token) {
        Intrinsics.j(token, "token");
        this.remoteOrdersRepository.updatePushToken(token);
    }
}
