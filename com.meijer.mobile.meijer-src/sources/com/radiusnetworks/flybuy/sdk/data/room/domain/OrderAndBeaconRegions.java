package com.radiusnetworks.flybuy.sdk.data.room.domain;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/domain/OrderAndBeaconRegions;", "", "()V", "beaconRegions", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "getBeaconRegions", "()Ljava/util/List;", "setBeaconRegions", "(Ljava/util/List;)V", "order", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "getOrder", "()Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "setOrder", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderAndBeaconRegions {
    private List<BeaconRegion> beaconRegions = new ArrayList();
    public Order order;

    public final List<BeaconRegion> getBeaconRegions() {
        return this.beaconRegions;
    }

    public final Order getOrder() {
        Order order = this.order;
        if (order != null) {
            return order;
        }
        Intrinsics.x("order");
        return null;
    }

    public final void setBeaconRegions(List<BeaconRegion> list) {
        Intrinsics.j(list, "<set-?>");
        this.beaconRegions = list;
    }

    public final void setOrder(Order order) {
        Intrinsics.j(order, "<set-?>");
        this.order = order;
    }
}
