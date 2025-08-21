package nk;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u000b*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnk/f;", "product", "", "quantity", "Lnk/i;", "b", "(Lnk/f;D)Lnk/i;", "c", "", "d", "(Lnk/f;I)Lnk/i;", "T", "", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "a", "(Ljava/util/List;)Ljava/util/Map;", "models_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class k {
    public static final <T extends i> Map<String, T> a(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        List<? extends T> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(((i) obj).g2(), obj);
        }
        return linkedHashMap;
    }

    public static final i b(f product, double d10) {
        Intrinsics.j(product, "product");
        return new ProductQuantityImpl(product, d10);
    }

    public static final i c(f fVar, double d10) {
        Intrinsics.j(fVar, "<this>");
        return b(fVar, d10);
    }

    public static final i d(f fVar, int i10) {
        Intrinsics.j(fVar, "<this>");
        return c(fVar, i10);
    }
}
