package com.radiusnetworks.flybuy.sdk.data.defaults;

import com.radiusnetworks.flybuy.api.model.AndroidPickupLocationFilter;
import com.radiusnetworks.flybuy.api.model.AppData;
import com.radiusnetworks.flybuy.api.model.AppResponse;
import com.radiusnetworks.flybuy.api.model.PickupLocationFilters;
import com.radiusnetworks.flybuy.api.model.PickupStates;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerState;
import com.radiusnetworks.flybuy.sdk.data.order.OrderState;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"DEFAULT_APP_RESPONSE", "Lcom/radiusnetworks/flybuy/api/model/AppResponse;", "getDEFAULT_APP_RESPONSE", "()Lcom/radiusnetworks/flybuy/api/model/AppResponse;", "DEFAULT_PICKUP_LOCATION_FILTERS", "Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;", "getDEFAULT_PICKUP_LOCATION_FILTERS", "()Lcom/radiusnetworks/flybuy/api/model/PickupLocationFilters;", "DEFAULT_PICKUP_STATES", "Lcom/radiusnetworks/flybuy/api/model/PickupStates;", "getDEFAULT_PICKUP_STATES", "()Lcom/radiusnetworks/flybuy/api/model/PickupStates;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SdkDefaultsKt {
    private static final AppResponse DEFAULT_APP_RESPONSE;
    private static final PickupLocationFilters DEFAULT_PICKUP_LOCATION_FILTERS;
    private static final PickupStates DEFAULT_PICKUP_STATES;

    static {
        PickupStates pickupStates = new PickupStates(CollectionsKt.p("created", OrderState.READY, OrderState.DELAYED, OrderState.CANCELLED, "completed", OrderState.EXPIRED, "out_for_delivery", "delivery_dispatched", "driver_assigned", "picked_up", "undeliverable", "delivery_failed"), CollectionsKt.p("created", CustomerState.EN_ROUTE, CustomerState.NEARBY, CustomerState.ARRIVED, CustomerState.WAITING, "completed", "departed"), CollectionsKt.p("created", OrderState.READY, OrderState.DELAYED, "out_for_delivery", "picked_up", "delivery_dispatched", "driver_assigned"), CollectionsKt.p("created", CustomerState.EN_ROUTE, CustomerState.NEARBY, CustomerState.ARRIVED, CustomerState.WAITING), CollectionsKt.m(), CollectionsKt.e("created"));
        DEFAULT_PICKUP_STATES = pickupStates;
        PickupLocationFilters pickupLocationFilters = new PickupLocationFilters(CollectionsKt.p(new AndroidPickupLocationFilter(250, Float.valueOf(1.0f), "high_accuracy", Float.valueOf(3.0f)), new AndroidPickupLocationFilter(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, Float.valueOf(5.0f), "high_accuracy", Float.valueOf(30.0f)), new AndroidPickupLocationFilter(2000, Float.valueOf(15.0f), "high_accuracy", Float.valueOf(200.0f)), new AndroidPickupLocationFilter(-1, Float.valueOf(60.0f), "high_accuracy", Float.valueOf(400.0f))));
        DEFAULT_PICKUP_LOCATION_FILTERS = pickupLocationFilters;
        DEFAULT_APP_RESPONSE = new AppResponse(0L, new AppData(null, null, pickupLocationFilters, pickupStates, 5, null, null, null, null, 352, null), 1, null);
    }

    public static final AppResponse getDEFAULT_APP_RESPONSE() {
        return DEFAULT_APP_RESPONSE;
    }

    public static final PickupLocationFilters getDEFAULT_PICKUP_LOCATION_FILTERS() {
        return DEFAULT_PICKUP_LOCATION_FILTERS;
    }

    public static final PickupStates getDEFAULT_PICKUP_STATES() {
        return DEFAULT_PICKUP_STATES;
    }
}
