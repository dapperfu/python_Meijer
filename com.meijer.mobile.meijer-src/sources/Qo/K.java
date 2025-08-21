package Qo;

import Co.Department;
import Qo.l;
import android.net.Uri;
import com.medallia.digital.mobilesdk.l3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import nk.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnk/l;", "LQo/l;", "a", "(Lnk/l;)LQo/l;", "Landroid/net/Uri;", "deeplink", "LQo/l$k;", "c", "(Lnk/l;Landroid/net/Uri;)LQo/l$k;", "deeplinkQuery", "networkQuery", "b", "(LQo/l$k;LQo/l$k;)LQo/l$k;", "search_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class K {
    public static final l a(nk.l lVar) {
        Intrinsics.j(lVar, "<this>");
        if (lVar instanceof l.BrowseCollection) {
            l.BrowseCollection browseCollection = (l.BrowseCollection) lVar;
            return new l.BrowseCollection(new Department(null, null, null, browseCollection.getName(), null, false, browseCollection.getCollectionId(), null, 183, null), 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, 32766, null);
        }
        if (lVar instanceof l.Recommendations) {
            return new l.Recommendations(((l.Recommendations) lVar).getType(), null, 0, 0, null, null, 0, null, false, null, 1022, null);
        }
        if (lVar instanceof l.Coupon) {
            return new l.Coupon(((l.Coupon) lVar).getCoupon(), 0, 0, null, false, null, 62, null);
        }
        if (lVar instanceof l.Reward) {
            l.Reward reward = (l.Reward) lVar;
            return new l.Reward(reward.getRewardId(), reward.getRewardTitle(), 0, 0, null, null, null, 0, null, false, null, 2044, null);
        }
        if (lVar instanceof l.Department) {
            l.Department department = (l.Department) lVar;
            return new l.Department(new Department(null, null, department.getId(), department.getName(), null, false, null, null, 243, null), 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, 32766, null);
        }
        if (lVar instanceof l.d) {
            return new l.Favorites(0, 0, null, null, 0, null, false, null, l3.f93323c, null);
        }
        if (lVar instanceof l.Personalized) {
            return new l.Personalized(((l.Personalized) lVar).getProductType(), 0, 0, null, null, 0, null, false, null, 510, null);
        }
        if (lVar instanceof l.Search) {
            return new l.Search(((l.Search) lVar).getSearchTerm(), null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, 524286, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final l.k b(l.k deeplinkQuery, l.k networkQuery) {
        Object next;
        FilterSortOption selectedSort;
        Object next2;
        FilterFacetOption filterFacetOption;
        Object next3;
        Intrinsics.j(deeplinkQuery, "deeplinkQuery");
        Intrinsics.j(networkQuery, "networkQuery");
        Iterator<T> it = networkQuery.u3().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            FilterSortOption filterSortOption = (FilterSortOption) next;
            String sortBy = filterSortOption.getSortBy();
            FilterSortOption selectedSort2 = deeplinkQuery.getSelectedSort();
            if (Intrinsics.e(sortBy, selectedSort2 != null ? selectedSort2.getSortBy() : null)) {
                String sortOrder = filterSortOption.getSortOrder();
                FilterSortOption selectedSort3 = deeplinkQuery.getSelectedSort();
                if (Intrinsics.e(sortOrder, selectedSort3 != null ? selectedSort3.getSortOrder() : null)) {
                    break;
                }
            }
        }
        FilterSortOption filterSortOption2 = (FilterSortOption) next;
        if (filterSortOption2 == null || (selectedSort = FilterSortOption.b(filterSortOption2, null, null, null, "selected", 7, null)) == null) {
            selectedSort = deeplinkQuery.getSelectedSort();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<FilterFacet, List<FilterFacetOption>> mapF3 = deeplinkQuery.F3();
        if (mapF3 != null) {
            for (Map.Entry<FilterFacet, List<FilterFacetOption>> entry : mapF3.entrySet()) {
                Iterator<T> it2 = networkQuery.c1().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.e(((FilterFacet) next2).getName(), entry.getKey().getName())) {
                        break;
                    }
                }
                FilterFacet filterFacet = (FilterFacet) next2;
                if (filterFacet != null) {
                    List<FilterFacetOption> value = entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (FilterFacetOption filterFacetOption2 : value) {
                        List<FilterFacetOption> listB = filterFacet.b();
                        if (listB != null) {
                            Iterator<T> it3 = listB.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it3.next();
                                if (Intrinsics.e(((FilterFacetOption) next3).getValue(), filterFacetOption2.getValue())) {
                                    break;
                                }
                            }
                            filterFacetOption = (FilterFacetOption) next3;
                        } else {
                            filterFacetOption = null;
                        }
                        if (filterFacetOption != null) {
                            arrayList.add(filterFacetOption);
                        }
                    }
                    linkedHashMap.put(filterFacet, arrayList);
                }
            }
        }
        return networkQuery.x0(networkQuery.u3(), networkQuery.c1(), selectedSort, linkedHashMap);
    }

    public static final l.k c(nk.l lVar, Uri deeplink) {
        l lVar2;
        List listB1;
        List listB12;
        Intrinsics.j(lVar, "<this>");
        Intrinsics.j(deeplink, "deeplink");
        l lVarA = a(lVar);
        if (!(lVarA instanceof l.k)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = deeplink.getQueryParameterNames();
        Intrinsics.i(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            if (StringsKt.H(str, "text", true)) {
                lVar2 = lVarA;
            } else if (StringsKt.H(str, "sort_order", true)) {
                String queryParameter = deeplink.getQueryParameter(str);
                if (queryParameter != null && (listB12 = StringsKt.b1(queryParameter, new String[]{"-"}, false, 0, 6, null)) != null) {
                    if (listB12.size() != 2) {
                        listB12 = null;
                    }
                    if (listB12 != null) {
                        String str2 = (String) listB12.get(0);
                        ((l.k) lVarA).q1(new FilterSortOption(str2, str2, (String) listB12.get(1), "selected"));
                    }
                }
                lVar2 = lVarA;
            } else {
                Intrinsics.g(str);
                lVar2 = lVarA;
                FilterFacet filterFacet = new FilterFacet(str, null, null, null, null, null, null, 64, null);
                ArrayList arrayList = new ArrayList();
                String queryParameter2 = deeplink.getQueryParameter(str);
                if (queryParameter2 != null && (listB1 = StringsKt.b1(queryParameter2, new String[]{","}, false, 0, 6, null)) != null) {
                    Iterator it = listB1.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new FilterFacetOption(0, null, "selected", (String) it.next()));
                    }
                }
                linkedHashMap.put(filterFacet, arrayList);
            }
            lVarA = lVar2;
        }
        l.k kVar = (l.k) lVarA;
        kVar.n0(linkedHashMap);
        return kVar;
    }
}
