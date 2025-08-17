package com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution;

import com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.OrderSubstitutionResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wl.OrderSubstitutionsDetail;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse;", "Lwl/a;", "a", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse;)Lwl/a;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class a {
    public static final OrderSubstitutionsDetail a(OrderSubstitutionResponse orderSubstitutionResponse) {
        ArrayList arrayList;
        Intrinsics.j(orderSubstitutionResponse, "<this>");
        String id2 = orderSubstitutionResponse.getId();
        String orderId = orderSubstitutionResponse.getOrderId();
        String fulfillmentPartner = orderSubstitutionResponse.getFulfillmentPartner();
        List<OrderSubstitutionResponse.LineItem> listC = orderSubstitutionResponse.c();
        if (listC != null) {
            List<OrderSubstitutionResponse.LineItem> list = listC;
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((OrderSubstitutionResponse.LineItem) it.next()).l());
            }
        } else {
            arrayList = null;
        }
        return new OrderSubstitutionsDetail(id2, orderId, fulfillmentPartner, arrayList, orderSubstitutionResponse.getSubstitutionPreference());
    }
}
