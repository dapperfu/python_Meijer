package Qo;

import io.constructor.data.model.common.FilterGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LQo/e;", "Lio/constructor/data/model/common/FilterGroup;", "a", "(LQo/e;)Lio/constructor/data/model/common/FilterGroup;", "b", "(Lio/constructor/data/model/common/FilterGroup;)LQo/e;", "search_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qo.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5099f {
    public static final FilterGroup a(FilterGroup filterGroup) {
        ArrayList arrayList;
        Intrinsics.j(filterGroup, "<this>");
        List<FilterGroup> listA = filterGroup.a();
        ArrayList arrayList2 = null;
        if (listA != null) {
            List<FilterGroup> list = listA;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(a((FilterGroup) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<FilterGroup> listE = filterGroup.e();
        if (listE != null) {
            List<FilterGroup> list2 = listE;
            arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a((FilterGroup) it2.next()));
            }
        }
        return new FilterGroup(arrayList, arrayList2, filterGroup.getCount(), filterGroup.getDisplayName(), filterGroup.getGroupId(), null);
    }

    public static final FilterGroup b(FilterGroup filterGroup) {
        ArrayList arrayList;
        Intrinsics.j(filterGroup, "<this>");
        List<FilterGroup> children = filterGroup.getChildren();
        ArrayList arrayList2 = null;
        if (children != null) {
            List<FilterGroup> list = children;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(b((FilterGroup) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List<FilterGroup> parents = filterGroup.getParents();
        if (parents != null) {
            List<FilterGroup> list2 = parents;
            arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b((FilterGroup) it2.next()));
            }
        }
        return new FilterGroup(arrayList, filterGroup.getCount(), filterGroup.getDisplayName(), filterGroup.getGroupId(), arrayList2);
    }
}
