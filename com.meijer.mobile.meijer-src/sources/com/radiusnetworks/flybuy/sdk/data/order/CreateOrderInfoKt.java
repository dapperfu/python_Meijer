package com.radiusnetworks.flybuy.sdk.data.order;

import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.model.CreateOrderRequestData;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.room.domain.PickupWindowKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toApiCreateOrderData", "Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequestData;", "Lcom/radiusnetworks/flybuy/sdk/data/order/CreateOrderInfo;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateOrderInfoKt {
    public static final CreateOrderRequestData toApiCreateOrderData(CreateOrderInfo createOrderInfo) {
        Intrinsics.j(createOrderInfo, "<this>");
        int siteID = createOrderInfo.getSiteID();
        String name = createOrderInfo.getName();
        FlyBuyApi flyBuyApi = FlyBuyApi.INSTANCE;
        String customerApiToken = flyBuyApi.getCustomerApiToken();
        String carType = createOrderInfo.getCarType();
        String carColor = createOrderInfo.getCarColor();
        String licensePlate = createOrderInfo.getLicensePlate();
        String phone = createOrderInfo.getPhone();
        String partnerIdentifier = createOrderInfo.getPartnerIdentifier();
        String pushToken = createOrderInfo.getPushToken();
        if (pushToken == null) {
            pushToken = flyBuyApi.getPushToken();
        }
        return new CreateOrderRequestData(siteID, name, customerApiToken, carType, carColor, licensePlate, phone, partnerIdentifier, pushToken, PickupWindowKt.toApiString(createOrderInfo.getPickupWindow()), createOrderInfo.getState(), createOrderInfo.getPickupType(), Boolean.valueOf(FlyBuyCore.getConfigOptions().getDeferredLocationTrackingEnabled()), createOrderInfo.getSpotIdentifier(), createOrderInfo.getHandoffVehicleLocation(), createOrderInfo.getPartnerIdentifierForCustomer(), createOrderInfo.getPartnerIdentifierForCrew(), createOrderInfo.getDisableOrderFire(), createOrderInfo.getDisablePromiseTimeScheduling(), createOrderInfo.getOrderFireMakeIntervalSeconds());
    }
}
