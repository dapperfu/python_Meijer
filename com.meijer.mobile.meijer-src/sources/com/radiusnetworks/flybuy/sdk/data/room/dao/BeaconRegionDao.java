package com.radiusnetworks.flybuy.sdk.data.room.dao;

import androidx.view.AbstractC6127A;
import com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.OrderAndBeaconRegions;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003H'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t0\b2\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\t0\bH'¢\u0006\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/dao/BeaconRegionDao;", "", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;", "region", "", "insertAll", "([Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;)V", "Landroidx/lifecycle/A;", "", "getAll", "()Landroidx/lifecycle/A;", "deleteAll", "()V", "beaconRegion", "delete", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/BeaconRegion;)V", "", "orderId", "getBeaconRegionsForOrder", "(I)Landroidx/lifecycle/A;", "findBeaconRegionsForOrder", "(I)Ljava/util/List;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/OrderAndBeaconRegions;", "getOrderAndBeaconRegions", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BeaconRegionDao {
    void delete(BeaconRegion beaconRegion);

    void deleteAll();

    List<BeaconRegion> findBeaconRegionsForOrder(int orderId);

    AbstractC6127A<List<BeaconRegion>> getAll();

    AbstractC6127A<List<BeaconRegion>> getBeaconRegionsForOrder(int orderId);

    AbstractC6127A<List<OrderAndBeaconRegions>> getOrderAndBeaconRegions();

    void insertAll(BeaconRegion... region);
}
