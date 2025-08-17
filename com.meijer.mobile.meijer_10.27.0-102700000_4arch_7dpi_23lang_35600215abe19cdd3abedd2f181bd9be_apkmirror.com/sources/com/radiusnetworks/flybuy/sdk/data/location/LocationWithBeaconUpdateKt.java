package com.radiusnetworks.flybuy.sdk.data.location;

import com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventType;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"toApiOrderEvent", "Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "Lcom/radiusnetworks/flybuy/sdk/data/location/LocationWithBeaconUpdate;", "orderId", "", "possibleWrongSiteId", "etaSeconds", "etaSource", "", "(Lcom/radiusnetworks/flybuy/sdk/data/location/LocationWithBeaconUpdate;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/radiusnetworks/flybuy/sdk/data/order/OrderEventInfo;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocationWithBeaconUpdateKt {
    @ExperimentalUnsignedTypes
    public static final OrderEventInfo toApiOrderEvent(LocationWithBeaconUpdate locationWithBeaconUpdate, int i10, Integer num, Integer num2, String str) {
        Intrinsics.j(locationWithBeaconUpdate, "<this>");
        OrderEventType orderEventType = OrderEventType.LOCATION_UPDATE;
        double longitude = locationWithBeaconUpdate.getLongitude();
        double latitude = locationWithBeaconUpdate.getLatitude();
        float accuracy = locationWithBeaconUpdate.getAccuracy();
        float speed = locationWithBeaconUpdate.getSpeed();
        return new OrderEventInfo(i10, orderEventType, Double.valueOf(longitude), Double.valueOf(latitude), Float.valueOf(accuracy), Float.valueOf(speed), num2, null, locationWithBeaconUpdate.getBeacons(), null, null, null, null, null, num, str, locationWithBeaconUpdate.getLocationAt(), null, 147072, null);
    }

    public static /* synthetic */ OrderEventInfo toApiOrderEvent$default(LocationWithBeaconUpdate locationWithBeaconUpdate, int i10, Integer num, Integer num2, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            num2 = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        return toApiOrderEvent(locationWithBeaconUpdate, i10, num, num2, str);
    }
}
