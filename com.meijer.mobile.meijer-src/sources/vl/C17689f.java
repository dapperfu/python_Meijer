package vl;

import com.meijer.mobile.digitalshopping.api.timeslots.model.ReservationSlot;
import j$.time.LocalDate;
import j$.time.LocalTime;
import jj.FulfillmentSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lj.C15514c;
import wk.C17898a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlot;", "", "storeId", "pickupDate", "", "scheduleType", "Ljj/c;", "a", "(Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlot;Ljava/lang/String;Ljava/lang/String;I)Ljj/c;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vl.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C17689f {
    public static final FulfillmentSlot a(ReservationSlot reservationSlot, String storeId, String pickupDate, int i10) {
        Intrinsics.j(reservationSlot, "<this>");
        Intrinsics.j(storeId, "storeId");
        Intrinsics.j(pickupDate, "pickupDate");
        String id2 = reservationSlot.getId();
        Object objA = wk.d.a(pickupDate, C17898a.ISO_LOCAL_DATE, new Dh.a());
        Intrinsics.i(objA, "toDateTime(...)");
        LocalDate localDate = (LocalDate) objA;
        String startTime = reservationSlot.getStartTime();
        C17898a c17898a = C17898a.f167225a;
        Object objA2 = wk.d.a(startTime, c17898a.t(), new C15514c());
        Intrinsics.i(objA2, "toDateTime(...)");
        LocalTime localTime = (LocalTime) objA2;
        Object objA3 = wk.d.a(reservationSlot.getEndTime(), c17898a.t(), new C15514c());
        Intrinsics.i(objA3, "toDateTime(...)");
        return new FulfillmentSlot(id2, storeId, i10, localDate, localTime, (LocalTime) objA3, wk.e.f167252a.b(reservationSlot.getSlotTimeZone()), reservationSlot.getIsAvailable(), reservationSlot.getActiveSlotTransactionId(), reservationSlot.getMustOrderBy(), reservationSlot.getMustHoldBy(), false, null, 6144, null);
    }
}
