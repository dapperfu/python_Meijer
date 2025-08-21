package Ih;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ol.OrderHistoryItem;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lol/b;", "j$/time/LocalDateTime", "now", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "a", "(Ljava/util/List;Lj$/time/LocalDateTime;)Ljava/lang/String;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class j {
    public static final String a(List<OrderHistoryItem> list, LocalDateTime now) {
        Object next;
        Object next2;
        Object next3;
        String code;
        String code2;
        String code3;
        Intrinsics.j(list, "<this>");
        Intrinsics.j(now, "now");
        if (list.isEmpty()) {
            return null;
        }
        LocalDate localDateL = now.l();
        LocalTime localTime = now.toLocalTime();
        List<OrderHistoryItem> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (Intrinsics.e(((OrderHistoryItem) obj).getPickUpSlotInfo().getPickupDate(), localDateL)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (localTime.compareTo(((OrderHistoryItem) obj2).getPickUpSlotInfo().getPickUpSlotTime()) <= 0) {
                arrayList2.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list3 = (List) pair.a();
        List list4 = (List) pair.b();
        Iterator it = list3.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                LocalTime pickUpSlotTime = ((OrderHistoryItem) next).getPickUpSlotInfo().getPickUpSlotTime();
                if (pickUpSlotTime == null) {
                    pickUpSlotTime = LocalTime.MAX;
                }
                do {
                    Object next4 = it.next();
                    LocalTime pickUpSlotTime2 = ((OrderHistoryItem) next4).getPickUpSlotInfo().getPickUpSlotTime();
                    if (pickUpSlotTime2 == null) {
                        pickUpSlotTime2 = LocalTime.MAX;
                    }
                    if (pickUpSlotTime.compareTo(pickUpSlotTime2) > 0) {
                        next = next4;
                        pickUpSlotTime = pickUpSlotTime2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        OrderHistoryItem orderHistoryItem = (OrderHistoryItem) next;
        if (orderHistoryItem != null && (code3 = orderHistoryItem.getCode()) != null) {
            return code3;
        }
        Iterator it2 = list4.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                LocalTime pickUpSlotTime3 = ((OrderHistoryItem) next2).getPickUpSlotInfo().getPickUpSlotTime();
                if (pickUpSlotTime3 == null) {
                    pickUpSlotTime3 = LocalTime.MIN;
                }
                do {
                    Object next5 = it2.next();
                    LocalTime pickUpSlotTime4 = ((OrderHistoryItem) next5).getPickUpSlotInfo().getPickUpSlotTime();
                    if (pickUpSlotTime4 == null) {
                        pickUpSlotTime4 = LocalTime.MIN;
                    }
                    if (pickUpSlotTime3.compareTo(pickUpSlotTime4) < 0) {
                        next2 = next5;
                        pickUpSlotTime3 = pickUpSlotTime4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        OrderHistoryItem orderHistoryItem2 = (OrderHistoryItem) next2;
        if (orderHistoryItem2 != null && (code2 = orderHistoryItem2.getCode()) != null) {
            return code2;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list2) {
            if (localDateL.compareTo((ChronoLocalDate) ((OrderHistoryItem) obj3).getPickUpSlotInfo().getPickupDate()) < 0) {
                arrayList4.add(obj3);
            }
        }
        Iterator it3 = arrayList4.iterator();
        if (it3.hasNext()) {
            next3 = it3.next();
            if (it3.hasNext()) {
                OrderHistoryItem orderHistoryItem3 = (OrderHistoryItem) next3;
                LocalDateTime localDateTimeOf = LocalDateTime.of(orderHistoryItem3.getPickUpSlotInfo().getPickupDate(), orderHistoryItem3.getPickUpSlotInfo().getPickUpSlotTime());
                do {
                    Object next6 = it3.next();
                    OrderHistoryItem orderHistoryItem4 = (OrderHistoryItem) next6;
                    LocalDateTime localDateTimeOf2 = LocalDateTime.of(orderHistoryItem4.getPickUpSlotInfo().getPickupDate(), orderHistoryItem4.getPickUpSlotInfo().getPickUpSlotTime());
                    if (localDateTimeOf.compareTo(localDateTimeOf2) > 0) {
                        next3 = next6;
                        localDateTimeOf = localDateTimeOf2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next3 = null;
        }
        OrderHistoryItem orderHistoryItem5 = (OrderHistoryItem) next3;
        if (orderHistoryItem5 == null || (code = orderHistoryItem5.getCode()) == null) {
            return null;
        }
        return code;
    }

    public static /* synthetic */ String b(List list, LocalDateTime localDateTime, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDateTime = LocalDateTime.now();
        }
        return a(list, localDateTime);
    }
}
