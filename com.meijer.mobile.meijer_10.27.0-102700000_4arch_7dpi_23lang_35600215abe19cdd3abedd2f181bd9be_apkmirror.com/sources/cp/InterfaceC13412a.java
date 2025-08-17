package cp;

import Co.Department;
import Co.ProductFullDetails;
import Go.SuggestionResult;
import Oo.SearchResult;
import Po.Cursor;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import gp.InterfaceC14304b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ(\u0010\r\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\u0005j\u0002`\nH¦@¢\u0006\u0004\b\r\u0010\tJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\n0\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011Jt\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\"\b\u0002\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0018\u00010\u0016j\u0004\u0018\u0001`\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010!\u001a\u0004\u0018\u00010 2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H¦@¢\u0006\u0004\b!\u0010\"Jt\u0010$\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\"\b\u0002\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0018\u00010\u0016j\u0004\u0018\u0001`\u0019H¦@¢\u0006\u0004\b$\u0010%Jt\u0010'\u001a\u00020\u001d2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\"\b\u0002\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0018\u00010\u0016j\u0004\u0018\u0001`\u0019H¦@¢\u0006\u0004\b'\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lcp/a;", "Lgp/b;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "query", "LGo/d;", "c", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "LCo/h;", "b", "", "upcs", "a", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pageSize", "currentPage", "LPo/a;", "cursor", "", "LQo/a;", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "selectedFacets", "LQo/g;", "selectedSort", "LOo/b;", "h", "(ILjava/lang/String;IILPo/a;Ljava/util/Map;LQo/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCo/b;", "g", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "categoryCode", "f", "(ILjava/lang/String;IILPo/a;LQo/g;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectionId", "d", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13412a extends InterfaceC14304b {
    @Override // gp.InterfaceC14304b
    Object a(int i10, List<String> list, Continuation<? super List<ProductFullDetails>> continuation);

    Object b(int i10, String str, Continuation<? super ProductFullDetails> continuation);

    Object c(int i10, String str, Continuation<? super SuggestionResult> continuation);

    Object d(int i10, String str, int i11, int i12, Cursor cursor, FilterSortOption filterSortOption, Map<FilterFacet, List<FilterFacetOption>> map, Continuation<? super SearchResult> continuation);

    Object f(int i10, String str, int i11, int i12, Cursor cursor, FilterSortOption filterSortOption, Map<FilterFacet, List<FilterFacetOption>> map, Continuation<? super SearchResult> continuation);

    Object g(int i10, Continuation<? super Department> continuation);

    Object h(int i10, String str, int i11, int i12, Cursor cursor, Map<FilterFacet, List<FilterFacetOption>> map, FilterSortOption filterSortOption, Continuation<? super SearchResult> continuation);

    static /* synthetic */ Object e(InterfaceC13412a interfaceC13412a, int i10, String str, int i11, int i12, Cursor cursor, Map map, FilterSortOption filterSortOption, Continuation continuation, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSearchResults");
        }
        if ((i13 & 4) != 0) {
            i11 = 30;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return interfaceC13412a.h(i10, str, i14, i12, (i13 & 16) != 0 ? null : cursor, (i13 & 32) != 0 ? null : map, (i13 & 64) != 0 ? null : filterSortOption, continuation);
    }

    static /* synthetic */ Object i(InterfaceC13412a interfaceC13412a, int i10, String str, int i11, int i12, Cursor cursor, FilterSortOption filterSortOption, Map map, Continuation continuation, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductsForDepartment");
        }
        if ((i13 & 4) != 0) {
            i11 = 100;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return interfaceC13412a.f(i10, str, i14, i12, (i13 & 16) != 0 ? null : cursor, (i13 & 32) != 0 ? null : filterSortOption, (i13 & 64) != 0 ? null : map, continuation);
    }

    static /* synthetic */ Object j(InterfaceC13412a interfaceC13412a, int i10, String str, int i11, int i12, Cursor cursor, FilterSortOption filterSortOption, Map map, Continuation continuation, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductsForCollection");
        }
        if ((i13 & 4) != 0) {
            i11 = 100;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return interfaceC13412a.d(i10, str, i14, i12, (i13 & 16) != 0 ? null : cursor, (i13 & 32) != 0 ? null : filterSortOption, (i13 & 64) != 0 ? null : map, continuation);
    }
}
