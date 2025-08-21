package nl;

import com.meijer.mobile.cart.model.hybris.orderdetails.HybrisTipAmount;
import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.DeliveryModeEnum;
import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.OrderHistoryItemDto;
import hj.TipAmount;
import j$.time.OffsetDateTime;
import kj.D;
import kj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nj.C15959b;
import nj.g;
import ol.OrderHistoryItem;
import ol.OrdersPickUpSlotInfo;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;", "Lol/b;", "a", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryItemDto;)Lol/b;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nl.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15962b {
    public static final OrderHistoryItem a(OrderHistoryItemDto orderHistoryItemDto) {
        Intrinsics.j(orderHistoryItemDto, "<this>");
        String code = orderHistoryItemDto.getCode();
        DeliveryModeEnum deliveryModeEnumA = C15961a.a(orderHistoryItemDto.getDeliveryMode());
        String guid = orderHistoryItemDto.getGuid();
        OrdersPickUpSlotInfo ordersPickUpSlotInfoA = d.a(orderHistoryItemDto.getPickUpSlotInfo());
        String placed = orderHistoryItemDto.getPlaced();
        OffsetDateTime offsetDateTime = placed != null ? (OffsetDateTime) wk.d.b(placed, C17898a.f167225a.s(), new r()) : null;
        String status = orderHistoryItemDto.getStatus();
        String statusDisplay = orderHistoryItemDto.getStatusDisplay();
        HybrisTipAmount tipAmount = orderHistoryItemDto.getTipAmount();
        TipAmount tipAmountA = tipAmount != null ? C15959b.a(tipAmount) : null;
        String tipAuthCode = orderHistoryItemDto.getTipAuthCode();
        String tipCode = orderHistoryItemDto.getTipCode();
        String tipDate = orderHistoryItemDto.getTipDate();
        return new OrderHistoryItem(code, deliveryModeEnumA, guid, ordersPickUpSlotInfoA, offsetDateTime, status, statusDisplay, tipAmountA, tipAuthCode, tipCode, tipDate != null ? (OffsetDateTime) wk.d.b(tipDate, C17898a.f167225a.s(), new r()) : null, orderHistoryItemDto.getTippablePartner(), orderHistoryItemDto.getTippedAndRated(), Lo.b.a(orderHistoryItemDto.getTotal()), orderHistoryItemDto.getTotalItems(), g.a(orderHistoryItemDto.getTipAndRateDetails()), D.b(orderHistoryItemDto.getPaymentInfo()));
    }
}
