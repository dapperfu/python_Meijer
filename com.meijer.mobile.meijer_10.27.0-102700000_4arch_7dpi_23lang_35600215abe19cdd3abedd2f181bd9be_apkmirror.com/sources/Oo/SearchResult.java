package Oo;

import Co.ProductFullDetails;
import Po.Cursor;
import Qo.FilterFacet;
import Qo.FilterGroup;
import Qo.FilterSortOption;
import com.meijer.mobile.product.model.search.api.Pagination;
import com.meijer.mobile.product.model.search.api.Query;
import com.meijer.mobile.product.model.search.api.ResultSources;
import com.meijer.mobile.product.model.search.api.SpellingSuggestion;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b\"\u00101R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b&\u00104R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b5\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b,\u00104¨\u0006:"}, d2 = {"LOo/b;", "", "Lcom/meijer/mobile/product/model/search/api/ResultSources;", "resultSources", "", "freeTextSearch", "Lcom/meijer/mobile/product/model/search/api/Query;", "currentQuery", "Lcom/meijer/mobile/product/model/search/api/Pagination;", "pagination", "LPo/a;", "cursor", "", "LCo/h;", "products", "LQo/a;", "facets", "LQo/g;", "sorts", "Lcom/meijer/mobile/product/model/search/api/SpellingSuggestion;", "spellingSuggestion", "LQo/e;", "groups", "<init>", "(Lcom/meijer/mobile/product/model/search/api/ResultSources;Ljava/lang/String;Lcom/meijer/mobile/product/model/search/api/Query;Lcom/meijer/mobile/product/model/search/api/Pagination;LPo/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/meijer/mobile/product/model/search/api/SpellingSuggestion;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/product/model/search/api/ResultSources;", "g", "()Lcom/meijer/mobile/product/model/search/api/ResultSources;", "b", "Ljava/lang/String;", "c", "Lcom/meijer/mobile/product/model/search/api/Query;", "getCurrentQuery", "()Lcom/meijer/mobile/product/model/search/api/Query;", "d", "Lcom/meijer/mobile/product/model/search/api/Pagination;", "e", "()Lcom/meijer/mobile/product/model/search/api/Pagination;", "LPo/a;", "()LPo/a;", "f", "Ljava/util/List;", "()Ljava/util/List;", "h", "i", "Lcom/meijer/mobile/product/model/search/api/SpellingSuggestion;", "()Lcom/meijer/mobile/product/model/search/api/SpellingSuggestion;", "j", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Oo.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SearchResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ResultSources resultSources;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String freeTextSearch;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Query currentQuery;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pagination pagination;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Cursor cursor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductFullDetails> products;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FilterFacet> facets;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FilterSortOption> sorts;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final SpellingSuggestion spellingSuggestion;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FilterGroup> groups;

    public SearchResult() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) other;
        return Intrinsics.e(this.resultSources, searchResult.resultSources) && Intrinsics.e(this.freeTextSearch, searchResult.freeTextSearch) && Intrinsics.e(this.currentQuery, searchResult.currentQuery) && Intrinsics.e(this.pagination, searchResult.pagination) && Intrinsics.e(this.cursor, searchResult.cursor) && Intrinsics.e(this.products, searchResult.products) && Intrinsics.e(this.facets, searchResult.facets) && Intrinsics.e(this.sorts, searchResult.sorts) && Intrinsics.e(this.spellingSuggestion, searchResult.spellingSuggestion) && Intrinsics.e(this.groups, searchResult.groups);
    }

    public SearchResult(ResultSources resultSources, String freeTextSearch, Query currentQuery, Pagination pagination, Cursor cursor, List<ProductFullDetails> products, List<FilterFacet> facets, List<FilterSortOption> sorts, SpellingSuggestion spellingSuggestion, List<FilterGroup> groups) {
        Intrinsics.j(freeTextSearch, "freeTextSearch");
        Intrinsics.j(currentQuery, "currentQuery");
        Intrinsics.j(pagination, "pagination");
        Intrinsics.j(products, "products");
        Intrinsics.j(facets, "facets");
        Intrinsics.j(sorts, "sorts");
        Intrinsics.j(groups, "groups");
        this.resultSources = resultSources;
        this.freeTextSearch = freeTextSearch;
        this.currentQuery = currentQuery;
        this.pagination = pagination;
        this.cursor = cursor;
        this.products = products;
        this.facets = facets;
        this.sorts = sorts;
        this.spellingSuggestion = spellingSuggestion;
        this.groups = groups;
    }

    /* renamed from: a, reason: from getter */
    public final Cursor getCursor() {
        return this.cursor;
    }

    public final List<FilterFacet> b() {
        return this.facets;
    }

    /* renamed from: c, reason: from getter */
    public final String getFreeTextSearch() {
        return this.freeTextSearch;
    }

    public final List<FilterGroup> d() {
        return this.groups;
    }

    /* renamed from: e, reason: from getter */
    public final Pagination getPagination() {
        return this.pagination;
    }

    public final List<ProductFullDetails> f() {
        return this.products;
    }

    /* renamed from: g, reason: from getter */
    public final ResultSources getResultSources() {
        return this.resultSources;
    }

    public final List<FilterSortOption> h() {
        return this.sorts;
    }

    public int hashCode() {
        ResultSources resultSources = this.resultSources;
        int iHashCode = (((((((resultSources == null ? 0 : resultSources.hashCode()) * 31) + this.freeTextSearch.hashCode()) * 31) + this.currentQuery.hashCode()) * 31) + this.pagination.hashCode()) * 31;
        Cursor cursor = this.cursor;
        int iHashCode2 = (((((((iHashCode + (cursor == null ? 0 : cursor.hashCode())) * 31) + this.products.hashCode()) * 31) + this.facets.hashCode()) * 31) + this.sorts.hashCode()) * 31;
        SpellingSuggestion spellingSuggestion = this.spellingSuggestion;
        return ((iHashCode2 + (spellingSuggestion != null ? spellingSuggestion.hashCode() : 0)) * 31) + this.groups.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final SpellingSuggestion getSpellingSuggestion() {
        return this.spellingSuggestion;
    }

    public String toString() {
        return "SearchResult(resultSources=" + this.resultSources + ", freeTextSearch=" + this.freeTextSearch + ", currentQuery=" + this.currentQuery + ", pagination=" + this.pagination + ", cursor=" + this.cursor + ", products=" + this.products + ", facets=" + this.facets + ", sorts=" + this.sorts + ", spellingSuggestion=" + this.spellingSuggestion + ", groups=" + this.groups + ')';
    }

    public /* synthetic */ SearchResult(ResultSources resultSources, String str, Query query, Pagination pagination, Cursor cursor, List list, List list2, List list3, SpellingSuggestion spellingSuggestion, List list4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Query query2;
        resultSources = (i10 & 1) != 0 ? null : resultSources;
        str = (i10 & 2) != 0 ? "" : str;
        if ((i10 & 4) != 0) {
            query2 = new Query(new Query.Value(str + ":relevance"), null, 2, null);
        } else {
            query2 = query;
        }
        this(resultSources, str, query2, (i10 & 8) != 0 ? new Pagination(0, 0, 0, 0, 15, null) : pagination, (i10 & 16) != 0 ? null : cursor, (i10 & 32) != 0 ? CollectionsKt.m() : list, (i10 & 64) != 0 ? CollectionsKt.m() : list2, (i10 & 128) != 0 ? CollectionsKt.m() : list3, (i10 & 256) == 0 ? spellingSuggestion : null, (i10 & 512) != 0 ? CollectionsKt.m() : list4);
    }
}
