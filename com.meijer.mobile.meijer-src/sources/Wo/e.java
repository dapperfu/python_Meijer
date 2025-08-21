package Wo;

import Co.ProductFullDetails;
import Oo.SearchResult;
import Po.Cursor;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterGroup;
import Qo.FilterSortOption;
import So.ProductSearchQuery;
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

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t*\b\u0012\u0004\u0012\u00020\u00110\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\t*\b\u0012\u0004\u0012\u00020\u00150\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\t*\b\u0012\u0004\u0012\u00020\u00190\tH\u0000¢\u0006\u0004\b\u001d\u0010\u0014\u001a\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010$\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"LSo/g$q;", "", "query", "", "currentPage", "pageSize", "LOo/b;", "h", "(LSo/g$q;Ljava/lang/String;II)LOo/b;", "", "LCo/h;", "f", "(LSo/g$q;)Ljava/util/List;", "LSo/g$j;", "LPo/a;", "b", "(LSo/g$j;)LPo/a;", "LSo/g$g;", "LQo/a;", "c", "(Ljava/util/List;)Ljava/util/List;", "LSo/g$r;", "LQo/g;", "i", "LSo/g$c;", "LSo/g$h;", "e", "(LSo/g$c;)LSo/g$h;", "LQo/e;", "d", "LSo/g$p;", "Lcom/meijer/mobile/product/model/search/api/ResultSources;", "g", "(LSo/g$p;)Lcom/meijer/mobile/product/model/search/api/ResultSources;", "LSo/g$s;", "", "a", "(LSo/g$s;)Z", "apollo_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class e {
    public static final Cursor b(ProductSearchQuery.ItemConnection itemConnection) {
        Intrinsics.j(itemConnection, "<this>");
        String endCursor = itemConnection.getPageInfo().getEndCursor();
        boolean hasNextPage = itemConnection.getPageInfo().getHasNextPage();
        return new Cursor(endCursor, itemConnection.getPageInfo().getStartCursor(), Boolean.valueOf(hasNextPage), Boolean.valueOf(itemConnection.getPageInfo().getHasPreviousPage()));
    }

    public static final List<FilterFacet> c(List<ProductSearchQuery.FilterOption> list) {
        ArrayList arrayList;
        Intrinsics.j(list, "<this>");
        List<ProductSearchQuery.FilterOption> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        for (ProductSearchQuery.FilterOption filterOption : list2) {
            String displayName = filterOption.getDisplayName();
            String name = filterOption.getName();
            String selectionType = filterOption.getSelectionType();
            boolean hidden = filterOption.getHidden();
            List<ProductSearchQuery.Option> listD = filterOption.d();
            if (listD != null) {
                List<ProductSearchQuery.Option> list3 = listD;
                arrayList = new ArrayList(CollectionsKt.x(list3, 10));
                for (ProductSearchQuery.Option option : list3) {
                    arrayList.add(new FilterFacetOption(option.getCount(), option.getDisplayName(), option.getStatus(), option.getValue()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new FilterFacet(name, displayName, null, null, arrayList, selectionType, Boolean.valueOf(hidden)));
        }
        return arrayList2;
    }

    public static final List<FilterGroup> d(List<ProductSearchQuery.GroupFilterOption> list) {
        Intrinsics.j(list, "<this>");
        List<ProductSearchQuery.GroupFilterOption> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (ProductSearchQuery.GroupFilterOption groupFilterOption : list2) {
            String displayName = groupFilterOption.getDisplayName();
            if (displayName == null) {
                displayName = "";
            }
            String str = displayName;
            List<ProductSearchQuery.Child> listA = groupFilterOption.a();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(e((ProductSearchQuery.Child) it.next()));
            }
            List<FilterGroup> listD = d(arrayList2);
            String groupId = groupFilterOption.getGroupId();
            int count = groupFilterOption.getCount();
            arrayList.add(new FilterGroup(listD, Integer.valueOf(count), str, groupId, CollectionsKt.m()));
        }
        return arrayList;
    }

    public static final ProductSearchQuery.GroupFilterOption e(ProductSearchQuery.Child child) {
        Intrinsics.j(child, "<this>");
        return new ProductSearchQuery.GroupFilterOption(child.getCount(), child.getDisplayName(), child.getGroupId(), CollectionsKt.m());
    }

    private static final ResultSources g(ProductSearchQuery.ResultCounts resultCounts) {
        return new ResultSources(new ResultSourcesData(Integer.valueOf(resultCounts != null ? resultCounts.getTokenMatch() : 0)), new ResultSourcesData(Integer.valueOf(resultCounts != null ? resultCounts.getEmbeddingsMatch() : 0)), resultCounts != null ? resultCounts.getTotalCount() : 0);
    }

    public static final SearchResult h(ProductSearchQuery.Search search, String query, int i10, int i11) {
        List<ProductSearchQuery.GroupFilterOption> listC;
        List<ProductSearchQuery.SortOption> listF;
        List<ProductSearchQuery.FilterOption> listB;
        ProductSearchQuery.ItemConnection itemConnection;
        ProductSearchQuery.ResultCounts resultCounts;
        ProductSearchQuery.ResultCounts resultCounts2;
        ProductSearchQuery.ItemConnection itemConnection2;
        ProductSearchQuery.PageInfo pageInfo;
        Intrinsics.j(search, "<this>");
        Intrinsics.j(query, "query");
        List<ProductFullDetails> listF2 = f(search);
        ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResult = search.getOnSearchProductDisplayResult();
        List<FilterGroup> listM = null;
        ResultSources resultSourcesG = g(onSearchProductDisplayResult != null ? onSearchProductDisplayResult.getResultCounts() : null);
        Query query2 = new Query(new Query.Value(""), "");
        ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResult2 = search.getOnSearchProductDisplayResult();
        int totalCount = 0;
        if (((onSearchProductDisplayResult2 == null || (itemConnection2 = onSearchProductDisplayResult2.getItemConnection()) == null || (pageInfo = itemConnection2.getPageInfo()) == null) ? null : pageInfo.getEndCursor()) == null) {
            i10 = 0;
        }
        ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResult3 = search.getOnSearchProductDisplayResult();
        int iCeil = (int) Math.ceil(((onSearchProductDisplayResult3 == null || (resultCounts2 = onSearchProductDisplayResult3.getResultCounts()) == null) ? 0 : resultCounts2.getTotalCount()) / i11);
        ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResult4 = search.getOnSearchProductDisplayResult();
        if (onSearchProductDisplayResult4 != null && (resultCounts = onSearchProductDisplayResult4.getResultCounts()) != null) {
            totalCount = resultCounts.getTotalCount();
        }
        Pagination pagination = new Pagination(i10, i11, iCeil, totalCount);
        ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResult5 = search.getOnSearchProductDisplayResult();
        Cursor cursorB = (onSearchProductDisplayResult5 == null || (itemConnection = onSearchProductDisplayResult5.getItemConnection()) == null) ? null : b(itemConnection);
        ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResult6 = search.getOnSearchProductDisplayResult();
        List<FilterFacet> listC2 = (onSearchProductDisplayResult6 == null || (listB = onSearchProductDisplayResult6.b()) == null) ? null : c(listB);
        if (listC2 == null) {
            listC2 = CollectionsKt.m();
        }
        List<FilterFacet> list = listC2;
        ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResult7 = search.getOnSearchProductDisplayResult();
        List<FilterSortOption> listI = (onSearchProductDisplayResult7 == null || (listF = onSearchProductDisplayResult7.f()) == null) ? null : i(listF);
        if (listI == null) {
            listI = CollectionsKt.m();
        }
        List<FilterSortOption> list2 = listI;
        ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResult8 = search.getOnSearchProductDisplayResult();
        if (onSearchProductDisplayResult8 != null && (listC = onSearchProductDisplayResult8.c()) != null) {
            listM = d(listC);
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return new SearchResult(resultSourcesG, query, query2, pagination, cursorB, listF2, list, list2, null, listM);
    }

    public static final List<FilterSortOption> i(List<ProductSearchQuery.SortOption> list) {
        Intrinsics.j(list, "<this>");
        List<ProductSearchQuery.SortOption> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (ProductSearchQuery.SortOption sortOption : list2) {
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

    private static final boolean a(ProductSearchQuery.Stock stock) {
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<Co.ProductFullDetails> f(So.ProductSearchQuery.Search r76) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wo.e.f(So.g$q):java.util.List");
    }
}
