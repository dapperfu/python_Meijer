package vl;

import com.meijer.mobile.digitalshopping.api.timeslots.model.PickupDay;
import com.meijer.mobile.digitalshopping.api.timeslots.model.ReservationSlot;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ul.FulfillmentDay;
import wk.C17898a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/PickupDay;", "", "storeId", "Lul/c;", "a", "(Lcom/meijer/mobile/digitalshopping/api/timeslots/model/PickupDay;Ljava/lang/String;)Lul/c;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vl.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C17688e {
    public static final FulfillmentDay a(PickupDay pickupDay, String storeId) {
        Intrinsics.j(pickupDay, "<this>");
        Intrinsics.j(storeId, "storeId");
        Object objA = wk.d.a(pickupDay.getDate(), C17898a.ISO_LOCAL_DATE, new Dh.a());
        Intrinsics.i(objA, "toDateTime(...)");
        LocalDate localDate = (LocalDate) objA;
        List<ReservationSlot> listB = pickupDay.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(C17689f.a((ReservationSlot) it.next(), storeId, pickupDay.getDate(), pickupDay.getScheduleType()));
        }
        return new FulfillmentDay(localDate, arrayList);
    }
}
