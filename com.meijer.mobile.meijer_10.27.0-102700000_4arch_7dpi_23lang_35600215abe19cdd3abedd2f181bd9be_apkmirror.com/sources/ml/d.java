package ml;

import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.PickUpSlotInfoDto;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.OffsetDateTime;
import jj.r;
import kj.C15170c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.OrdersPickUpSlotInfo;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;", "Lnl/c;", "a", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/PickUpSlotInfoDto;)Lnl/c;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d {
    public static final OrdersPickUpSlotInfo a(PickUpSlotInfoDto pickUpSlotInfoDto) {
        Intrinsics.j(pickUpSlotInfoDto, "<this>");
        String activePickupSlotId = pickUpSlotInfoDto.getActivePickupSlotId();
        String activeSlotTransactionId = pickUpSlotInfoDto.getActiveSlotTransactionId();
        String pickUpSlotDay = pickUpSlotInfoDto.getPickUpSlotDay();
        boolean pickUpSlotIsAvailable = pickUpSlotInfoDto.getPickUpSlotIsAvailable();
        String pickUpSlotDateTime = pickUpSlotInfoDto.getPickUpSlotDateTime();
        OffsetDateTime offsetDateTime = pickUpSlotDateTime != null ? (OffsetDateTime) vk.d.b(pickUpSlotDateTime, C17590a.f164803a.s(), new r()) : null;
        String pickUpSlotTime = pickUpSlotInfoDto.getPickUpSlotTime();
        LocalTime localTime = pickUpSlotTime != null ? (LocalTime) vk.d.b(pickUpSlotTime, C17590a.f164803a.r(), new C15170c()) : null;
        String pickupDate = pickUpSlotInfoDto.getPickupDate();
        return new OrdersPickUpSlotInfo(activePickupSlotId, activeSlotTransactionId, pickUpSlotDay, pickUpSlotIsAvailable, offsetDateTime, localTime, pickupDate != null ? (LocalDate) vk.d.b(pickupDate, C17590a.DATE_FORMAT_MM_DD_YYYY, new Ch.a()) : null, pickUpSlotInfoDto.getPickupSlotId(), pickUpSlotInfoDto.getScheduleTypeId());
    }
}
