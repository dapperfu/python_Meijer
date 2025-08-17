package ml;

import com.meijer.mobile.cart.model.hybris.orderdetails.HybrisTipAmount;
import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.DeliveryModeEnum;
import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.OrderHistoryItemDto;
import gj.TipAmount;
import j$.time.OffsetDateTime;
import jj.D;
import jj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mj.C15636b;
import mj.g;
import nl.OrderHistoryItem;
import nl.OrdersPickUpSlotInfo;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;", "Lnl/b;", "a", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;)Lnl/b;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ml.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15639b {
    public static final OrderHistoryItem a(OrderHistoryItemDto orderHistoryItemDto) {
        Intrinsics.j(orderHistoryItemDto, "<this>");
        String code = orderHistoryItemDto.getCode();
        DeliveryModeEnum deliveryModeEnumA = C15638a.a(orderHistoryItemDto.getDeliveryMode());
        String guid = orderHistoryItemDto.getGuid();
        OrdersPickUpSlotInfo ordersPickUpSlotInfoA = d.a(orderHistoryItemDto.getPickUpSlotInfo());
        String placed = orderHistoryItemDto.getPlaced();
        OffsetDateTime offsetDateTime = placed != null ? (OffsetDateTime) vk.d.b(placed, C17590a.f164803a.s(), new r()) : null;
        String status = orderHistoryItemDto.getStatus();
        String statusDisplay = orderHistoryItemDto.getStatusDisplay();
        HybrisTipAmount tipAmount = orderHistoryItemDto.getTipAmount();
        TipAmount tipAmountA = tipAmount != null ? C15636b.a(tipAmount) : null;
        String tipAuthCode = orderHistoryItemDto.getTipAuthCode();
        String tipCode = orderHistoryItemDto.getTipCode();
        String tipDate = orderHistoryItemDto.getTipDate();
        return new OrderHistoryItem(code, deliveryModeEnumA, guid, ordersPickUpSlotInfoA, offsetDateTime, status, statusDisplay, tipAmountA, tipAuthCode, tipCode, tipDate != null ? (OffsetDateTime) vk.d.b(tipDate, C17590a.f164803a.s(), new r()) : null, orderHistoryItemDto.getTippablePartner(), orderHistoryItemDto.getTippedAndRated(), Lo.b.a(orderHistoryItemDto.getTotal()), orderHistoryItemDto.getTotalItems(), g.a(orderHistoryItemDto.getTipAndRateDetails()), D.b(orderHistoryItemDto.getPaymentInfo()));
    }
}
