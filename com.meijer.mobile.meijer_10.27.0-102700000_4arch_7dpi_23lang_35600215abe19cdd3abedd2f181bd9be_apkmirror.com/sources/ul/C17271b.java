package ul;

import com.meijer.mobile.digitalshopping.api.timeslots.model.DTMDeliveryWindowResponse;
import com.meijer.mobile.digitalshopping.api.timeslots.model.DTMScheduleResponse;
import ij.FulfillmentSlot;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tl.FulfillmentDay;
import vk.C17590a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DTMScheduleResponse;", "", "storeId", "partnerCustomerId", "Ltl/c;", "a", "(Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DTMScheduleResponse;Ljava/lang/String;Ljava/lang/String;)Ltl/c;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ul.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C17271b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ul.b$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((FulfillmentSlot) t10).getStartTime(), ((FulfillmentSlot) t11).getStartTime());
        }
    }

    public static final FulfillmentDay a(DTMScheduleResponse dTMScheduleResponse, String storeId, String str) {
        Intrinsics.j(dTMScheduleResponse, "<this>");
        Intrinsics.j(storeId, "storeId");
        Object objA = vk.d.a(dTMScheduleResponse.getDate(), C17590a.ISO_LOCAL_DATE, new Ch.a());
        Intrinsics.i(objA, "toDateTime(...)");
        LocalDate localDate = (LocalDate) objA;
        List<DTMDeliveryWindowResponse> listB = dTMScheduleResponse.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            String str2 = storeId;
            arrayList.add(C17270a.b((DTMDeliveryWindowResponse) it.next(), str2, dTMScheduleResponse.getDate(), 0, str, 4, null));
            storeId = str2;
        }
        return new FulfillmentDay(localDate, CollectionsKt.Z0(arrayList, new a()));
    }
}
