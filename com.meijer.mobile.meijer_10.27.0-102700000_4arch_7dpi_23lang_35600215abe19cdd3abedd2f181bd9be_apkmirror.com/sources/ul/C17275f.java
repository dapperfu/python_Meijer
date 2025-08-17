package ul;

import com.meijer.mobile.digitalshopping.api.timeslots.model.ReservationSlot;
import ij.FulfillmentSlot;
import j$.time.LocalDate;
import j$.time.LocalTime;
import kj.C15170c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlot;", "", "storeId", "pickupDate", "", "scheduleType", "Lij/c;", "a", "(Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlot;Ljava/lang/String;Ljava/lang/String;I)Lij/c;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ul.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C17275f {
    public static final FulfillmentSlot a(ReservationSlot reservationSlot, String storeId, String pickupDate, int i10) {
        Intrinsics.j(reservationSlot, "<this>");
        Intrinsics.j(storeId, "storeId");
        Intrinsics.j(pickupDate, "pickupDate");
        String id2 = reservationSlot.getId();
        Object objA = vk.d.a(pickupDate, C17590a.ISO_LOCAL_DATE, new Ch.a());
        Intrinsics.i(objA, "toDateTime(...)");
        LocalDate localDate = (LocalDate) objA;
        String startTime = reservationSlot.getStartTime();
        C17590a c17590a = C17590a.f164803a;
        Object objA2 = vk.d.a(startTime, c17590a.u(), new C15170c());
        Intrinsics.i(objA2, "toDateTime(...)");
        LocalTime localTime = (LocalTime) objA2;
        Object objA3 = vk.d.a(reservationSlot.getEndTime(), c17590a.u(), new C15170c());
        Intrinsics.i(objA3, "toDateTime(...)");
        return new FulfillmentSlot(id2, storeId, i10, localDate, localTime, (LocalTime) objA3, vk.e.f164830a.b(reservationSlot.getSlotTimeZone()), reservationSlot.getIsAvailable(), reservationSlot.getActiveSlotTransactionId(), reservationSlot.getMustOrderBy(), reservationSlot.getMustHoldBy(), false, null, 6144, null);
    }
}
