package Zo;

import Ho.ProductSponsorship;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import io.constructor.data.model.common.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pp.e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001aU\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00020\u00100\u00022\n\u0010\n\u001a\u00060\bj\u0002`\t2 \u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0002\u0018\u00010\u000bj\u0004\u0018\u0001`\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpp/e;", "sponsorshipsDataStore", "", "Lio/constructor/data/model/common/Result;", "potentialSponsoredProducts", "", "c", "(Lpp/e;Ljava/util/List;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "LQo/a;", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "extras", "Lkotlin/Pair;", "", "a", "(ILjava/util/Map;)Ljava/util/List;", "", "b", "(Lio/constructor/data/model/common/Result;)Z", "constructor_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class b {
    public static final List<Pair<String, List<String>>> a(int i10, Map<FilterFacet, List<FilterFacetOption>> map) {
        Set<FilterFacet> setKeySet;
        Collection collectionM;
        ArrayList arrayList = new ArrayList();
        if (map != null && (setKeySet = map.keySet()) != null) {
            for (FilterFacet filterFacet : setKeySet) {
                String name = filterFacet.getName();
                List<FilterFacetOption> list = map.get(filterFacet);
                if (list != null) {
                    List<FilterFacetOption> list2 = list;
                    collectionM = new ArrayList(CollectionsKt.x(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        String value = ((FilterFacetOption) it.next()).getValue();
                        if (value == null) {
                            value = "";
                        }
                        collectionM.add(value);
                    }
                } else {
                    collectionM = CollectionsKt.m();
                }
                arrayList.add(new Pair(name, collectionM));
            }
        }
        return CollectionsKt.Q0(arrayList, TuplesKt.a("availableInStores", CollectionsKt.e(String.valueOf(i10))));
    }

    public static final void c(e sponsorshipsDataStore, List<Result> potentialSponsoredProducts) {
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(potentialSponsoredProducts, "potentialSponsoredProducts");
        ArrayList arrayList = new ArrayList();
        for (Object obj : potentialSponsoredProducts) {
            if (b((Result) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String id2 = ((Result) it.next()).getData().getId();
            if (id2 != null) {
                arrayList2.add(id2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new ProductSponsorship((String) it2.next(), Ho.b.f13064b, null, 4, null));
        }
        sponsorshipsDataStore.d(arrayList3);
    }

    private static final boolean b(Result result) {
        Map<String, Boolean> labels = result.getLabels();
        if (labels != null) {
            return Intrinsics.e(labels.get("is_sponsored"), Boolean.TRUE);
        }
        return false;
    }
}
