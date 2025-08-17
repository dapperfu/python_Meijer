package Wo;

import Oo.SearchResult;
import Po.Cursor;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterGroup;
import Qo.FilterSortOption;
import So.ProductCollectionQuery;
import com.meijer.mobile.product.model.search.api.Pagination;
import com.meijer.mobile.product.model.search.api.Query;
import com.meijer.mobile.product.model.search.api.ResultSources;
import com.meijer.mobile.product.model.search.api.ResultSourcesData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n*\b\u0012\u0004\u0012\u00020\u00140\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\n*\b\u0012\u0004\u0012\u00020\u00180\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0017\u001a\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\n*\b\u0012\u0004\u0012\u00020\u001b0\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0017\u001a\u0013\u0010\u001f\u001a\u00020\u001b*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"LSo/d$d;", "", "query", "", "currentPage", "pageSize", "LOo/b;", "h", "(LSo/d$d;Ljava/lang/String;II)LOo/b;", "LSo/d$j;", "", "LCo/h;", "f", "(LSo/d$j;)Ljava/util/List;", "Lcom/meijer/mobile/product/model/search/api/ResultSources;", "g", "(LSo/d$j;)Lcom/meijer/mobile/product/model/search/api/ResultSources;", "LPo/a;", "b", "(LSo/d$j;)LPo/a;", "LSo/d$g;", "LQo/a;", "c", "(Ljava/util/List;)Ljava/util/List;", "LSo/d$p;", "LQo/g;", "i", "LSo/d$h;", "LQo/e;", "d", "LSo/d$c;", "e", "(LSo/d$c;)LSo/d$h;", "LSo/d$q;", "", "a", "(LSo/d$q;)Z", "apollo_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class b {
    private static final List<FilterFacet> c(List<ProductCollectionQuery.FilterOption> list) {
        ArrayList arrayList;
        List<ProductCollectionQuery.FilterOption> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        for (ProductCollectionQuery.FilterOption filterOption : list2) {
            String displayName = filterOption.getDisplayName();
            String name = filterOption.getName();
            String selectionType = filterOption.getSelectionType();
            boolean hidden = filterOption.getHidden();
            List<ProductCollectionQuery.Option> listD = filterOption.d();
            if (listD != null) {
                List<ProductCollectionQuery.Option> list3 = listD;
                arrayList = new ArrayList(CollectionsKt.x(list3, 10));
                for (ProductCollectionQuery.Option option : list3) {
                    arrayList.add(new FilterFacetOption(option.getCount(), option.getDisplayName(), option.getStatus(), option.getValue()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new FilterFacet(name, displayName, null, null, arrayList, selectionType, Boolean.valueOf(hidden)));
        }
        return arrayList2;
    }

    private static final List<FilterGroup> d(List<ProductCollectionQuery.GroupFilterOption> list) {
        List<ProductCollectionQuery.GroupFilterOption> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (ProductCollectionQuery.GroupFilterOption groupFilterOption : list2) {
            String displayName = groupFilterOption.getDisplayName();
            if (displayName == null) {
                displayName = "";
            }
            String str = displayName;
            List<ProductCollectionQuery.Child> listA = groupFilterOption.a();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(e((ProductCollectionQuery.Child) it.next()));
            }
            List<FilterGroup> listD = d(arrayList2);
            String groupId = groupFilterOption.getGroupId();
            int count = groupFilterOption.getCount();
            arrayList.add(new FilterGroup(listD, Integer.valueOf(count), str, groupId, CollectionsKt.m()));
        }
        return arrayList;
    }

    private static final ResultSources g(ProductCollectionQuery.ItemConnection itemConnection) {
        return new ResultSources(new ResultSourcesData(Integer.valueOf(itemConnection.getTotalCount())), new ResultSourcesData(null), 0, 4, null);
    }

    public static final SearchResult h(ProductCollectionQuery.Collection collection, String query, int i10, int i11) {
        Intrinsics.j(collection, "<this>");
        Intrinsics.j(query, "query");
        return new SearchResult(g(collection.getOnFilterableProductDisplayResult().getItemConnection()), query, new Query(null, null, 3, null), new Pagination(collection.getOnFilterableProductDisplayResult().getItemConnection().getPageInfo().getEndCursor() == null ? 0 : i10, i11, (int) Math.ceil(collection.getOnFilterableProductDisplayResult().getItemConnection().getTotalCount() / i11), collection.getOnFilterableProductDisplayResult().getItemConnection().getTotalCount()), b(collection.getOnFilterableProductDisplayResult().getItemConnection()), f(collection.getOnFilterableProductDisplayResult().getItemConnection()), c(collection.getOnFilterableProductDisplayResult().b()), i(collection.getOnFilterableProductDisplayResult().e()), null, d(collection.getOnFilterableProductDisplayResult().c()), 256, null);
    }

    private static final List<FilterSortOption> i(List<ProductCollectionQuery.SortOption> list) {
        List<ProductCollectionQuery.SortOption> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (ProductCollectionQuery.SortOption sortOption : list2) {
            String displayName = sortOption.getDisplayName();
            String sortBy = sortOption.getSortBy();
            String sortOrder = sortOption.getSortOrder();
            String status = sortOption.getStatus();
            if (status == null) {
                status = "";
            }
            arrayList.add(new FilterSortOption(displayName, sortBy, sortOrder, status));
        }
        return arrayList;
    }

    private static final boolean a(ProductCollectionQuery.Stock stock) {
        String stockStatus = stock.getStockStatus();
        if (stockStatus != null) {
            int iHashCode = stockStatus.hashCode();
            if (iHashCode != -1834264542) {
                if (iHashCode != -442154872) {
                    if (iHashCode == 1928030449 && stockStatus.equals("inStock")) {
                        return true;
                    }
                    return false;
                }
                if (stockStatus.equals("inStoreOnly")) {
                    return true;
                }
                return false;
            }
            if (stockStatus.equals("lowStock")) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static final Cursor b(ProductCollectionQuery.ItemConnection itemConnection) {
        String endCursor = itemConnection.getPageInfo().getEndCursor();
        boolean hasNextPage = itemConnection.getPageInfo().getHasNextPage();
        return new Cursor(endCursor, itemConnection.getPageInfo().getStartCursor(), Boolean.valueOf(hasNextPage), Boolean.valueOf(itemConnection.getPageInfo().getHasPreviousPage()));
    }

    private static final ProductCollectionQuery.GroupFilterOption e(ProductCollectionQuery.Child child) {
        return new ProductCollectionQuery.GroupFilterOption(child.getCount(), child.getDisplayName(), child.getGroupId(), CollectionsKt.m());
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<Co.ProductFullDetails> f(So.ProductCollectionQuery.ItemConnection r76) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wo.b.f(So.d$j):java.util.List");
    }
}
