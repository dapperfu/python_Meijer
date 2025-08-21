package vl;

import com.meijer.mobile.digitalshopping.api.timeslots.model.OmsDeliveryWindowResponse;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import jj.FulfillmentSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lj.C15514c;
import wk.C17898a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryWindowResponse;", "", "storeId", "date", "", "scheduleType", "partnerCustomerId", "Ljj/c;", "a", "(Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryWindowResponse;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljj/c;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vl.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C17686c {
    public static final FulfillmentSlot a(OmsDeliveryWindowResponse omsDeliveryWindowResponse, String storeId, String date, int i10, String str) {
        Intrinsics.j(omsDeliveryWindowResponse, "<this>");
        Intrinsics.j(storeId, "storeId");
        Intrinsics.j(date, "date");
        String id2 = omsDeliveryWindowResponse.getId();
        Object objA = wk.d.a(date, C17898a.ISO_LOCAL_DATE, new Dh.a());
        Intrinsics.i(objA, "toDateTime(...)");
        LocalDate localDate = (LocalDate) objA;
        String startTime = omsDeliveryWindowResponse.getStartTime();
        C17898a c17898a = C17898a.f167225a;
        Object objA2 = wk.d.a(startTime, c17898a.s(), new C15514c());
        Intrinsics.i(objA2, "toDateTime(...)");
        LocalTime localTime = (LocalTime) objA2;
        Object objA3 = wk.d.a(omsDeliveryWindowResponse.getEndTime(), c17898a.s(), new C15514c());
        Intrinsics.i(objA3, "toDateTime(...)");
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.i(zoneIdSystemDefault, "systemDefault(...)");
        return new FulfillmentSlot(id2, storeId, i10, localDate, localTime, (LocalTime) objA3, zoneIdSystemDefault, omsDeliveryWindowResponse.getAvailability().getAvailable(), null, null, null, false, str, 3840, null);
    }

    public static /* synthetic */ FulfillmentSlot b(OmsDeliveryWindowResponse omsDeliveryWindowResponse, String str, String str2, int i10, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 4;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        return a(omsDeliveryWindowResponse, str, str2, i10, str3);
    }
}
