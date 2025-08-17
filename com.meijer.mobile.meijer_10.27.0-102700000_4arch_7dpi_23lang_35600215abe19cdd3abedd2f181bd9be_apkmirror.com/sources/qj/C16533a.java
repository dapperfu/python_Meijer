package qj;

import com.meijer.mobile.cart.model.hybris.timeslots.HybrisPickupSlotInfo;
import ij.FulfillmentSlot;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import kj.C15170c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vk.C17590a;
import vk.d;
import vk.e;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lij/c;", "a", "(Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;I)Lij/c;", "b", "(Lij/c;)Lcom/meijer/mobile/cart/model/hybris/timeslots/HybrisPickupSlotInfo;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: qj.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16533a {
    public static final FulfillmentSlot a(HybrisPickupSlotInfo hybrisPickupSlotInfo, int i10) {
        String pickUpEndTime;
        LocalTime localTime;
        String pickUpDate;
        LocalDate localDate;
        String pickUpSlotTimeZone;
        ZoneId zoneIdB;
        Intrinsics.j(hybrisPickupSlotInfo, "<this>");
        String activeSlotTransactionId = hybrisPickupSlotInfo.getActiveSlotTransactionId();
        String pickUpSlotId = hybrisPickupSlotInfo.getPickUpSlotId();
        String pickUpStartTime = hybrisPickupSlotInfo.getPickUpStartTime();
        if (pickUpStartTime != null) {
            C17590a c17590a = C17590a.f164803a;
            LocalTime localTime2 = (LocalTime) d.a(pickUpStartTime, c17590a.r(), new C15170c());
            if (localTime2 != null && (pickUpEndTime = hybrisPickupSlotInfo.getPickUpEndTime()) != null && (localTime = (LocalTime) d.a(pickUpEndTime, c17590a.r(), new C15170c())) != null && (pickUpDate = hybrisPickupSlotInfo.getPickUpDate()) != null && (localDate = (LocalDate) d.a(pickUpDate, C17590a.DATE_FORMAT_MM_DD_YYYY, new Ch.a())) != null && (pickUpSlotTimeZone = hybrisPickupSlotInfo.getPickUpSlotTimeZone()) != null && (zoneIdB = e.f164830a.b(pickUpSlotTimeZone)) != null) {
                boolean pickUpSlotIsAvailable = hybrisPickupSlotInfo.getPickUpSlotIsAvailable();
                Integer numV = StringsKt.v(hybrisPickupSlotInfo.getScheduleTypeId());
                return new FulfillmentSlot(pickUpSlotId, String.valueOf(i10), numV != null ? numV.intValue() : 4, localDate, localTime2, localTime, zoneIdB, pickUpSlotIsAvailable, activeSlotTransactionId, null, null, false, hybrisPickupSlotInfo.getPartnerCustomerId(), 3584, null);
            }
        }
        return null;
    }

    public static final HybrisPickupSlotInfo b(FulfillmentSlot fulfillmentSlot) {
        LocalDate date;
        LocalTime endTime;
        LocalTime startTime;
        String activeSlotTransactionId = fulfillmentSlot != null ? fulfillmentSlot.getActiveSlotTransactionId() : null;
        if (activeSlotTransactionId == null) {
            activeSlotTransactionId = "";
        }
        String id2 = fulfillmentSlot != null ? fulfillmentSlot.getId() : null;
        return new HybrisPickupSlotInfo(activeSlotTransactionId, id2 != null ? id2 : "", (fulfillmentSlot == null || (startTime = fulfillmentSlot.getStartTime()) == null) ? null : startTime.format(C17590a.f164803a.r()), (fulfillmentSlot == null || (endTime = fulfillmentSlot.getEndTime()) == null) ? null : endTime.format(C17590a.f164803a.r()), (fulfillmentSlot == null || (date = fulfillmentSlot.getDate()) == null) ? null : date.format(C17590a.DATE_FORMAT_MM_DD_YYYY), e.f164830a.a(fulfillmentSlot != null ? fulfillmentSlot.getSlotTimeZone() : null), fulfillmentSlot != null ? fulfillmentSlot.getIsAvailable() : false, String.valueOf(fulfillmentSlot != null ? Integer.valueOf(fulfillmentSlot.getScheduleType()) : null), fulfillmentSlot != null ? fulfillmentSlot.getPartnerCustomerId() : null);
    }
}
