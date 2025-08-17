package mj;

import com.meijer.mobile.cart.model.hybris.HybrisDeliveryMode;
import com.meijer.mobile.cart.model.hybris.orderdetails.OrderEntryJson;
import com.meijer.mobile.store.model.hybris.HybrisPointOfService;
import ej.DeliveryMode;
import gj.OrderEntry;
import jj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderEntryJson;", "Lgj/d;", "a", "(Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderEntryJson;)Lgj/d;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e {
    public static final OrderEntry a(OrderEntryJson orderEntryJson) {
        Intrinsics.j(orderEntryJson, "<this>");
        mk.b bVarA = Lo.b.a(orderEntryJson.getBasePrice());
        HybrisDeliveryMode deliveryMode = orderEntryJson.getDeliveryMode();
        DeliveryMode deliveryModeA = deliveryMode != null ? p.a(deliveryMode) : null;
        HybrisPointOfService deliveryPointOfService = orderEntryJson.getDeliveryPointOfService();
        return new OrderEntry(bVarA, deliveryModeA, deliveryPointOfService != null ? Uq.c.a(deliveryPointOfService) : null, orderEntryJson.getEntryNumber(), Io.d.b(orderEntryJson.getProduct()), orderEntryJson.getQuantity(), Lo.b.a(orderEntryJson.getTotalPrice()), orderEntryJson.getUpdateable());
    }
}
