package lj;

import com.meijer.mobile.cart.model.hybris.checkout.HybrisPickupSlotInfo;
import gj.PickupSlotInfo;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import wk.C17898a;
import wk.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;", "Lgj/c;", "a", "(Lcom/meijer/mobile/cart/model/hybris/checkout/HybrisPickupSlotInfo;)Lgj/c;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: lj.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15515d {
    public static final PickupSlotInfo a(HybrisPickupSlotInfo hybrisPickupSlotInfo) {
        String string;
        String string2;
        String string3;
        String string4;
        Intrinsics.j(hybrisPickupSlotInfo, "<this>");
        String pickUpSlotId = hybrisPickupSlotInfo.getPickUpSlotId();
        String activePickupSlotId = hybrisPickupSlotInfo.getActivePickupSlotId();
        String pickUpDateString = hybrisPickupSlotInfo.getPickUpDateString();
        LocalDate localDate = null;
        LocalDate localDate2 = (pickUpDateString == null || (string4 = StringsKt.C1(pickUpDateString).toString()) == null) ? null : (LocalDate) wk.d.a(string4, C17898a.DATE_FORMAT_MM_DD_YYYY, new Dh.a());
        String pickUpSlotTimeString = hybrisPickupSlotInfo.getPickUpSlotTimeString();
        LocalTime localTime = (pickUpSlotTimeString == null || (string3 = StringsKt.C1(pickUpSlotTimeString).toString()) == null) ? null : (LocalTime) wk.d.a(string3, C17898a.f167225a.r(), new C15514c());
        String pickUpEndTimeString = hybrisPickupSlotInfo.getPickUpEndTimeString();
        LocalTime localTime2 = (pickUpEndTimeString == null || (string2 = StringsKt.C1(pickUpEndTimeString).toString()) == null) ? null : (LocalTime) wk.d.a(string2, C17898a.f167225a.r(), new C15514c());
        String pickUpSlotTimeZoneString = hybrisPickupSlotInfo.getPickUpSlotTimeZoneString();
        ZoneId zoneIdB = pickUpSlotTimeZoneString != null ? e.f167252a.b(pickUpSlotTimeZoneString) : null;
        boolean pickUpSlotIsAvailable = hybrisPickupSlotInfo.getPickUpSlotIsAvailable();
        String activeSlotTransactionId = hybrisPickupSlotInfo.getActiveSlotTransactionId();
        String pickUpSlotTime = hybrisPickupSlotInfo.getPickUpSlotTime();
        String pickUpSlotDay = hybrisPickupSlotInfo.getPickUpSlotDay();
        String pickUpSlotDateString = hybrisPickupSlotInfo.getPickUpSlotDateString();
        if (pickUpSlotDateString != null && (string = StringsKt.C1(pickUpSlotDateString).toString()) != null) {
            localDate = (LocalDate) wk.d.a(string, C17898a.DATE_FORMAT_MM_DD_YYYY, new Dh.a());
        }
        return new PickupSlotInfo(pickUpSlotId, localTime2, activePickupSlotId, localTime, localDate2, zoneIdB, pickUpSlotIsAvailable, activeSlotTransactionId, pickUpSlotTime, pickUpSlotDay, hybrisPickupSlotInfo.getScheduleTypeId(), localDate, hybrisPickupSlotInfo.getEarlyDelivery());
    }
}
