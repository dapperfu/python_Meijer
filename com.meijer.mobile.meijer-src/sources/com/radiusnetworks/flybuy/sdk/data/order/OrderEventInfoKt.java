package com.radiusnetworks.flybuy.sdk.data.order;

import com.radiusnetworks.flybuy.api.model.OrderEventRequestData;
import com.radiusnetworks.flybuy.sdk.data.beacons.Beacon;
import com.radiusnetworks.flybuy.sdk.data.beacons.BeaconKt;
import com.radiusnetworks.flybuy.sdk.data.location.LocationPermissionState;
import com.radiusnetworks.flybuy.sdk.data.location.LocationPermissionStateKt;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¨\u0006\u0003"}, d2 = {"toApiOrderEvent", "Lcom/radiusnetworks/flybuy/api/model/OrderEventRequestData;", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class OrderEventInfoKt {
    @ExperimentalUnsignedTypes
    public static final OrderEventRequestData toApiOrderEvent(OrderEventInfo orderEventInfo) {
        ArrayList arrayList;
        Intrinsics.j(orderEventInfo, "<this>");
        int orderId = orderEventInfo.getOrderId();
        com.radiusnetworks.flybuy.api.model.OrderEventType apiOrderEventType = OrderEventTypeKt.toApiOrderEventType(orderEventInfo.getEventType());
        Double longitude = orderEventInfo.getLongitude();
        Double latitude = orderEventInfo.getLatitude();
        Float accuracy = orderEventInfo.getAccuracy();
        Float speed = orderEventInfo.getSpeed();
        Integer etaSeconds = orderEventInfo.getEtaSeconds();
        String customerState = orderEventInfo.getCustomerState();
        List<Beacon> beacons = orderEventInfo.getBeacons();
        if (beacons != null) {
            arrayList = new ArrayList(CollectionsKt.x(beacons, 10));
            Iterator<T> it = beacons.iterator();
            while (it.hasNext()) {
                arrayList.add(BeaconKt.toApiBeacon((Beacon) it.next()));
            }
        } else {
            arrayList = null;
        }
        LocationPermissionState locationPermission = orderEventInfo.getLocationPermission();
        com.radiusnetworks.flybuy.api.model.LocationPermissionState apiLocationPermissionState = locationPermission != null ? LocationPermissionStateKt.toApiLocationPermissionState(locationPermission) : null;
        String state = orderEventInfo.getState();
        Integer customerRatingValue = orderEventInfo.getCustomerRatingValue();
        String customerRatingComments = orderEventInfo.getCustomerRatingComments();
        String spotIdentifier = orderEventInfo.getSpotIdentifier();
        Integer possibleWrongSiteId = orderEventInfo.getPossibleWrongSiteId();
        String etaSource = orderEventInfo.getEtaSource();
        Instant locationAt = orderEventInfo.getLocationAt();
        return new OrderEventRequestData(orderId, apiOrderEventType, longitude, latitude, accuracy, speed, etaSeconds, customerState, arrayList, apiLocationPermissionState, state, customerRatingValue, customerRatingComments, spotIdentifier, possibleWrongSiteId, etaSource, locationAt != null ? locationAt.toString() : null, orderEventInfo.getPickupType(), orderEventInfo.getCustomerCarColor(), orderEventInfo.getCustomerCarType(), orderEventInfo.getCustomerLicensePlate(), orderEventInfo.getHandoffVehicleLocation());
    }
}
