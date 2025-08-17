package com.radiusnetworks.flybuy.sdk.data.room.database;

import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"updateOrderStates", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;", "orderId", "", "state", "", "customerState", "locationTrackingEnabled", "", "(Lcom/radiusnetworks/flybuy/sdk/data/room/database/AppDatabase;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AppDatabaseExtensionsKt {
    public static final void updateOrderStates(AppDatabase appDatabase, int i10, String str, String str2, Boolean bool) {
        boolean zBooleanValue;
        Intrinsics.j(appDatabase, "<this>");
        Order orderFindOrderByOrderId = appDatabase.orderDao$core_defaultRelease().findOrderByOrderId(i10);
        if (orderFindOrderByOrderId != null) {
            if (str == null && str2 == null && bool == null) {
                return;
            }
            if (str == null) {
                str = orderFindOrderByOrderId.getState();
            }
            if (str2 == null) {
                str2 = orderFindOrderByOrderId.getCustomerState();
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
                zBooleanValue = flyBuyCore.getSdkConfig().getPickupStates().getOrderOpen().contains(str) && flyBuyCore.getSdkConfig().getPickupStates().getCustomerOpen().contains(str2);
            }
            appDatabase.orderDao$core_defaultRelease().updateStates(i10, str, str2, zBooleanValue);
        }
    }
}
