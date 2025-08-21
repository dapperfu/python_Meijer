package Pk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0006*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00010\u0007¢\u0006\u0004\b\t\u0010\n*\n\u0010\u000b\"\u00020\u00002\u00020\u0000¨\u0006\f"}, d2 = {"", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "LPk/c;", "a", "(J)LPk/c;", "T", "", "ids", "b", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "OfferId", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class e {
    public static final c a(long j10) {
        return new CouponIdentityImpl(j10);
    }

    public static final <T extends c> List<T> b(List<? extends T> list, List<Long> ids) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(ids, "ids");
        List<? extends T> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(Long.valueOf(((c) obj).getOfferId()), obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = ids.iterator();
        while (it.hasNext()) {
            c cVar = (c) linkedHashMap.get(Long.valueOf(((Number) it.next()).longValue()));
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
