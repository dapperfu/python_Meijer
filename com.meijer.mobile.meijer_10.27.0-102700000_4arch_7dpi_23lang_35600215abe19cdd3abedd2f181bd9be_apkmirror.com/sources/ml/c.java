package ml;

import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.OrderHistoryItemDto;
import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.OrderHistoryResponse;
import com.meijer.mobile.product.model.hybris.api.models.search.HybrisSortDescriptor;
import com.meijer.mobile.product.model.search.api.Pagination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nl.OrderHistory;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryResponse;", "Lnl/a;", "a", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryResponse;)Lnl/a;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class c {
    public static final OrderHistory a(OrderHistoryResponse orderHistoryResponse) {
        Intrinsics.j(orderHistoryResponse, "<this>");
        List<OrderHistoryItemDto> listB = orderHistoryResponse.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(C15639b.a((OrderHistoryItemDto) it.next()));
        }
        Pagination pagination = orderHistoryResponse.getPagination();
        List<HybrisSortDescriptor> listD = orderHistoryResponse.d();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listD, 10));
        Iterator<T> it2 = listD.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Mo.a.a((HybrisSortDescriptor) it2.next()));
        }
        return new OrderHistory(arrayList, pagination, arrayList2, orderHistoryResponse.getOffloadedOrders());
    }
}
