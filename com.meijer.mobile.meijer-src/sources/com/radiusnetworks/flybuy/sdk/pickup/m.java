package com.radiusnetworks.flybuy.sdk.pickup;

import android.content.Context;
import android.content.Intent;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.location.LocationPermissionState;
import com.radiusnetworks.flybuy.sdk.data.location.LocationPermissionStateKt;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventType;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.data.room.domain.OrderKt;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.manager.OrdersManager;
import com.radiusnetworks.flybuy.sdk.pickup.service.LocationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class m {
    public static final void a(PickupManager pickupManager) {
        PickupManager pickupManager2 = pickupManager;
        Intrinsics.j(pickupManager2, "<this>");
        List<Order> open = FlyBuyCore.getOrders().getOpen();
        ArrayList arrayList = new ArrayList();
        for (Object obj : open) {
            if (!OrderKt.getLocationTrackingDeferred((Order) obj)) {
                arrayList.add(obj);
            }
        }
        LocationPermissionState locationPermissionStateCurrentLocationPermissionState = FlyBuyCore.INSTANCE.currentLocationPermissionState();
        if (LocationPermissionStateKt.isLocationTrackingAllowed(locationPermissionStateCurrentLocationPermissionState) && !arrayList.isEmpty()) {
            LogExtensionsKt.logd(pickupManager2, false, "Starting location service...");
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Order) it.next()).getLocationTrackingEnabled()) {
                    Context context = pickupManager2.getApplicationContext$pickup_defaultRelease();
                    Intrinsics.j(pickupManager2, "<this>");
                    Intrinsics.j(context, "context");
                    try {
                        context.startService(new Intent(context, (Class<?>) LocationService.class));
                        break;
                    } catch (IllegalStateException e10) {
                        LogExtensionsKt.loge$default(pickupManager2, false, e10, null, new Object[0], 4, null);
                    }
                } else {
                    pickupManager2 = pickupManager;
                }
            }
        }
        if (locationPermissionStateCurrentLocationPermissionState != FlyBuyCore.INSTANCE.getLastLocationPermissionState() && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LocationPermissionState locationPermissionState = locationPermissionStateCurrentLocationPermissionState;
                OrdersManager.event$default(FlyBuyCore.getOrders(), new OrderEventInfo(((Order) it2.next()).getId(), OrderEventType.PERMISSION_UPDATE, null, null, null, null, null, null, null, locationPermissionState, null, null, null, null, null, null, null, null, null, null, null, null, 4193788, null), null, 2, null);
                locationPermissionStateCurrentLocationPermissionState = locationPermissionState;
            }
        }
        FlyBuyCore.INSTANCE.setLastLocationPermissionState(locationPermissionStateCurrentLocationPermissionState);
    }
}
