package Cp;

import com.meijer.mobile.receipt.service.api.models.DigitalReceiptJson;
import com.meijer.mobile.receipt.service.api.models.DigitalReceiptsResponseJson;
import com.meijer.mobile.receipt.service.api.models.MonthSavingsSummaryJson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import zp.DigitalReceiptsResponse;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptsResponseJson;", "", "currentPage", "pageSize", "Lzp/d;", "a", "(Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptsResponseJson;II)Lzp/d;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c {
    public static final DigitalReceiptsResponse a(DigitalReceiptsResponseJson digitalReceiptsResponseJson, int i10, int i11) {
        List listM;
        Intrinsics.j(digitalReceiptsResponseJson, "<this>");
        boolean z10 = i10 == 0 || digitalReceiptsResponseJson.getReceiptsCount() < i11;
        List<DigitalReceiptJson> listB = digitalReceiptsResponseJson.b();
        if (listB != null) {
            List<DigitalReceiptJson> list = listB;
            listM = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(b.a((DigitalReceiptJson) it.next()));
            }
        } else {
            listM = CollectionsKt.m();
        }
        List list2 = listM;
        List<MonthSavingsSummaryJson> listC = digitalReceiptsResponseJson.c();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        Iterator<T> it2 = listC.iterator();
        while (it2.hasNext()) {
            arrayList.add(d.a((MonthSavingsSummaryJson) it2.next()));
        }
        return new DigitalReceiptsResponse(list2, arrayList, RangesKt.f(i10, 1), z10 ? null : Integer.valueOf(RangesKt.f(i10, 1) + 1), z10 ? RangesKt.f(i10, 1) : i10 + 1);
    }
}
