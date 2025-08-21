package com.radiusnetworks.flybuy.sdk.data.order;

import com.radiusnetworks.flybuy.api.model.PickupStates;
import com.radiusnetworks.flybuy.sdk.data.defaults.SdkDefaultsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toStates", "Lcom/radiusnetworks/flybuy/sdk/data/order/States;", "Lcom/radiusnetworks/flybuy/api/model/PickupStates;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StatesKt {
    public static final States toStates(PickupStates pickupStates) {
        List<String> order;
        List<String> customer;
        List<String> orderOpen;
        List<String> customerOpen;
        List<String> orderDeferred;
        List<String> customerDeferred;
        if (pickupStates == null || (order = pickupStates.getOrder()) == null) {
            order = SdkDefaultsKt.getDEFAULT_PICKUP_STATES().getOrder();
        }
        List listM1 = CollectionsKt.m1(order);
        if (pickupStates == null || (customer = pickupStates.getCustomer()) == null) {
            customer = SdkDefaultsKt.getDEFAULT_PICKUP_STATES().getCustomer();
        }
        List listM12 = CollectionsKt.m1(customer);
        if (pickupStates == null || (orderOpen = pickupStates.getOrderOpen()) == null) {
            orderOpen = SdkDefaultsKt.getDEFAULT_PICKUP_STATES().getOrderOpen();
        }
        List listM13 = CollectionsKt.m1(orderOpen);
        if (pickupStates == null || (customerOpen = pickupStates.getCustomerOpen()) == null) {
            customerOpen = SdkDefaultsKt.getDEFAULT_PICKUP_STATES().getCustomerOpen();
        }
        List listM14 = CollectionsKt.m1(customerOpen);
        if (pickupStates == null || (orderDeferred = pickupStates.getOrderDeferred()) == null) {
            orderDeferred = SdkDefaultsKt.getDEFAULT_PICKUP_STATES().getOrderDeferred();
        }
        List listM15 = CollectionsKt.m1(orderDeferred);
        if (pickupStates == null || (customerDeferred = pickupStates.getCustomerDeferred()) == null) {
            customerDeferred = SdkDefaultsKt.getDEFAULT_PICKUP_STATES().getCustomerDeferred();
        }
        return new States(listM1, listM12, listM13, listM14, listM15, CollectionsKt.m1(customerDeferred));
    }
}
