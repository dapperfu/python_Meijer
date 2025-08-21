package nl;

import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.PickUpSlotInfoDto;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.OffsetDateTime;
import kj.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lj.C15514c;
import ol.OrdersPickUpSlotInfo;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;", "Lol/c;", "a", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;)Lol/c;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {
    public static final OrdersPickUpSlotInfo a(PickUpSlotInfoDto pickUpSlotInfoDto) {
        Intrinsics.j(pickUpSlotInfoDto, "<this>");
        String activePickupSlotId = pickUpSlotInfoDto.getActivePickupSlotId();
        String activeSlotTransactionId = pickUpSlotInfoDto.getActiveSlotTransactionId();
        String pickUpSlotDay = pickUpSlotInfoDto.getPickUpSlotDay();
        boolean pickUpSlotIsAvailable = pickUpSlotInfoDto.getPickUpSlotIsAvailable();
        String pickUpSlotDateTime = pickUpSlotInfoDto.getPickUpSlotDateTime();
        OffsetDateTime offsetDateTime = pickUpSlotDateTime != null ? (OffsetDateTime) wk.d.b(pickUpSlotDateTime, C17898a.f167225a.s(), new r()) : null;
        String pickUpSlotTime = pickUpSlotInfoDto.getPickUpSlotTime();
        LocalTime localTime = pickUpSlotTime != null ? (LocalTime) wk.d.b(pickUpSlotTime, C17898a.f167225a.r(), new C15514c()) : null;
        String pickupDate = pickUpSlotInfoDto.getPickupDate();
        return new OrdersPickUpSlotInfo(activePickupSlotId, activeSlotTransactionId, pickUpSlotDay, pickUpSlotIsAvailable, offsetDateTime, localTime, pickupDate != null ? (LocalDate) wk.d.b(pickupDate, C17898a.DATE_FORMAT_MM_DD_YYYY, new Dh.a()) : null, pickUpSlotInfoDto.getPickupSlotId(), pickUpSlotInfoDto.getScheduleTypeId());
    }
}
