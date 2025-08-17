package com.radiusnetworks.flybuy.sdk.data.room.dao;

import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\b\u0013\ba\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0004H'¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001e\"\u00020\u0004H'¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u001b2\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001e\"\u00020\u0004H'¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004H\u0017¢\u0006\u0004\b%\u0010\u001dJ#\u0010'\u001a\u00020\u001b2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001e\"\u00020\u0004H\u0017¢\u0006\u0004\b'\u0010#J/\u0010,\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020*H'¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000fH'¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00101\u001a\u00020*H'¢\u0006\u0004\b2\u00103J)\u00106\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000fH'¢\u0006\u0004\b9\u00100J!\u0010<\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010:H'¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000bH'¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010:H'¢\u0006\u0004\bB\u0010=J!\u0010D\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010C\u001a\u0004\u0018\u00010:H'¢\u0006\u0004\bD\u0010=J!\u0010F\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\bF\u00100J\u000f\u0010G\u001a\u00020\u001bH'¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001bH'¢\u0006\u0004\bI\u0010HR \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0006¨\u0006L"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/room/dao/OrderDao;", "", "Landroidx/lifecycle/A;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "allLiveData", "()Landroidx/lifecycle/A;", "openLiveData", "all", "()Ljava/util/List;", "open", "", "orderId", "getOrderById", "(I)Landroidx/lifecycle/A;", "", "redemptionCode", "getOrderByRedemptionCode", "(Ljava/lang/String;)Landroidx/lifecycle/A;", "findOrderByRedemptionCode", "(Ljava/lang/String;)Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "findOrderByOrderId", "(I)Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;", "order", "", "insert", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;)J", "", "update", "(Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;)V", "", "orders", "insertAll", "([Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;)Ljava/util/List;", "updateAll", "([Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Order;)V", "obj", "insertOrUpdate", "objList", "insertOrUpdateAll", "state", "customerState", "", "locationTrackingEnabled", "updateStates", "(ILjava/lang/String;Ljava/lang/String;Z)I", "orderState", "updateOrderState", "(ILjava/lang/String;)I", "enabled", "updateLocationTracking", "(IZ)I", "rating", "comments", "updateCustomerRating", "(IILjava/lang/String;)I", "spotIdentifier", "updateSpotIdentifier", "j$/time/Instant", "etaAt", "updateEtaAt", "(ILj$/time/Instant;)I", "wrongSiteId", "updateWrongSiteId", "(II)I", "estimatedReadyAt", "updateEstimatedReadyAt", "orderFiredAt", "updateOrderFiredAt", "pickupType", "updatePickupType", "deleteAll", "()V", "deleteUnclaimed", "getUnclaimed", "unclaimed", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OrderDao {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static void insertOrUpdate(OrderDao orderDao, Order obj) {
            Intrinsics.j(obj, "obj");
            if (orderDao.insert(obj) == -1) {
                orderDao.update(obj);
            }
        }

        public static void insertOrUpdateAll(OrderDao orderDao, Order... objList) {
            Intrinsics.j(objList, "objList");
            List<Long> listInsertAll = orderDao.insertAll((Order[]) Arrays.copyOf(objList, objList.length));
            ArrayList arrayList = new ArrayList();
            int size = listInsertAll.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (listInsertAll.get(i10).longValue() == -1) {
                    arrayList.add(objList[i10]);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Order[] orderArr = (Order[]) arrayList.toArray(new Order[0]);
            orderDao.updateAll((Order[]) Arrays.copyOf(orderArr, orderArr.length));
        }
    }

    List<Order> all();

    AbstractC5985A<List<Order>> allLiveData();

    void deleteAll();

    void deleteUnclaimed();

    Order findOrderByOrderId(int orderId);

    Order findOrderByRedemptionCode(String redemptionCode);

    AbstractC5985A<Order> getOrderById(int orderId);

    AbstractC5985A<Order> getOrderByRedemptionCode(String redemptionCode);

    AbstractC5985A<List<Order>> getUnclaimed();

    long insert(Order order);

    List<Long> insertAll(Order... orders);

    void insertOrUpdate(Order obj);

    void insertOrUpdateAll(Order... objList);

    List<Order> open();

    AbstractC5985A<List<Order>> openLiveData();

    void update(Order order);

    void updateAll(Order... orders);

    int updateCustomerRating(int orderId, int rating, String comments);

    int updateEstimatedReadyAt(int orderId, Instant estimatedReadyAt);

    int updateEtaAt(int orderId, Instant etaAt);

    int updateLocationTracking(int orderId, boolean enabled);

    int updateOrderFiredAt(int orderId, Instant orderFiredAt);

    int updateOrderState(int orderId, String orderState);

    int updatePickupType(int orderId, String pickupType);

    int updateSpotIdentifier(int orderId, String spotIdentifier);

    int updateStates(int orderId, String state, String customerState, boolean locationTrackingEnabled);

    int updateWrongSiteId(int orderId, int wrongSiteId);
}
