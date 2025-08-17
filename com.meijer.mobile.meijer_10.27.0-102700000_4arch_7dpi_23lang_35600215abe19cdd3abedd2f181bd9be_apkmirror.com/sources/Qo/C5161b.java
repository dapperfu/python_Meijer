package Qo;

import io.constructor.data.model.common.FilterFacet;
import io.constructor.data.model.common.FilterFacetOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/constructor/data/model/common/FilterFacet;", "LQo/a;", "a", "(Lio/constructor/data/model/common/FilterFacet;)LQo/a;", "search_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qo.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5161b {
    public static final FilterFacet a(FilterFacet filterFacet) {
        ArrayList arrayList;
        Intrinsics.j(filterFacet, "<this>");
        String name = filterFacet.getName();
        String displayName = filterFacet.getDisplayName();
        Double min = filterFacet.getMin();
        Double max = filterFacet.getMax();
        List<FilterFacetOption> options = filterFacet.getOptions();
        if (options != null) {
            List<FilterFacetOption> list = options;
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C5163d.a((FilterFacetOption) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new FilterFacet(name, displayName, min, max, arrayList, filterFacet.getType(), filterFacet.getHidden());
    }
}
