package hi;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\u001a'\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Lhi/i;", "", "", "c", "(Ljava/util/List;)Ljava/util/Map;", "", "items", "b", "(Ljava/util/List;[Lhi/i;)Ljava/util/List;", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hi.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14483j {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<AbstractC14482i> a(List<? extends AbstractC14482i> list, List<? extends AbstractC14482i> items) {
        List<AbstractC14482i> listP0;
        Intrinsics.j(list, "<this>");
        Intrinsics.j(items, "items");
        List listP02 = CollectionsKt.p0(items);
        if (listP02.isEmpty()) {
            listP02 = null;
        }
        return (listP02 == null || (listP0 = CollectionsKt.P0(list, listP02)) == null) ? list : listP0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<AbstractC14482i> b(List<? extends AbstractC14482i> list, AbstractC14482i... items) {
        List<AbstractC14482i> listP0;
        Intrinsics.j(list, "<this>");
        Intrinsics.j(items, "items");
        List listC0 = ArraysKt.c0(items);
        if (listC0.isEmpty()) {
            listC0 = null;
        }
        return (listC0 == null || (listP0 = CollectionsKt.P0(list, listC0)) == null) ? list : listP0;
    }

    public static final Map<String, String> c(List<? extends AbstractC14482i> list) {
        Intrinsics.j(list, "<this>");
        List<? extends AbstractC14482i> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list2, 10)), 16));
        for (AbstractC14482i abstractC14482i : list2) {
            Pair pairA = TuplesKt.a(abstractC14482i.getKey(), abstractC14482i.getValue());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }
}
