package io.constructor.data.model.search;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.FilterFacet;
import io.constructor.data.model.common.FilterGroup;
import io.constructor.data.model.common.FilterSortOption;
import io.constructor.data.model.common.RefinedContent;
import io.constructor.data.model.common.Result;
import io.constructor.data.model.common.ResultSources;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003HÆ\u0003J\u008c\u0001\u0010)\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\fHÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00062"}, d2 = {"Lio/constructor/data/model/search/SearchResponseInner;", "Ljava/io/Serializable;", "facets", "", "Lio/constructor/data/model/common/FilterFacet;", "groups", "Lio/constructor/data/model/common/FilterGroup;", "results", "Lio/constructor/data/model/common/Result;", "filterSortOptions", "Lio/constructor/data/model/common/FilterSortOption;", "resultCount", "", "redirect", "Lio/constructor/data/model/search/Redirect;", "resultSources", "Lio/constructor/data/model/common/ResultSources;", "refinedContent", "Lio/constructor/data/model/common/RefinedContent;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lio/constructor/data/model/search/Redirect;Lio/constructor/data/model/common/ResultSources;Ljava/util/List;)V", "getFacets", "()Ljava/util/List;", "getFilterSortOptions", "getGroups", "getRedirect", "()Lio/constructor/data/model/search/Redirect;", "getRefinedContent", "getResultCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResultSources", "()Lio/constructor/data/model/common/ResultSources;", "getResults", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lio/constructor/data/model/search/Redirect;Lio/constructor/data/model/common/ResultSources;Ljava/util/List;)Lio/constructor/data/model/search/SearchResponseInner;", "equals", "", "other", "", "hashCode", "toString", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SearchResponseInner implements Serializable {
    private final List<FilterFacet> facets;
    private final List<FilterSortOption> filterSortOptions;
    private final List<FilterGroup> groups;
    private final Redirect redirect;
    private final List<RefinedContent> refinedContent;
    private final Integer resultCount;
    private final ResultSources resultSources;
    private final List<Result> results;

    public SearchResponseInner(@g(name = "facets") List<FilterFacet> list, @g(name = "groups") List<FilterGroup> list2, @g(name = "results") List<Result> list3, @g(name = "sort_options") List<FilterSortOption> list4, @g(name = "total_num_results") Integer num, @g(name = "redirect") Redirect redirect, @g(name = "result_sources") ResultSources resultSources, @g(name = "refined_content") List<RefinedContent> list5) {
        this.facets = list;
        this.groups = list2;
        this.results = list3;
        this.filterSortOptions = list4;
        this.resultCount = num;
        this.redirect = redirect;
        this.resultSources = resultSources;
        this.refinedContent = list5;
    }

    public static /* synthetic */ SearchResponseInner copy$default(SearchResponseInner searchResponseInner, List list, List list2, List list3, List list4, Integer num, Redirect redirect, ResultSources resultSources, List list5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = searchResponseInner.facets;
        }
        if ((i10 & 2) != 0) {
            list2 = searchResponseInner.groups;
        }
        if ((i10 & 4) != 0) {
            list3 = searchResponseInner.results;
        }
        if ((i10 & 8) != 0) {
            list4 = searchResponseInner.filterSortOptions;
        }
        if ((i10 & 16) != 0) {
            num = searchResponseInner.resultCount;
        }
        if ((i10 & 32) != 0) {
            redirect = searchResponseInner.redirect;
        }
        if ((i10 & 64) != 0) {
            resultSources = searchResponseInner.resultSources;
        }
        if ((i10 & 128) != 0) {
            list5 = searchResponseInner.refinedContent;
        }
        ResultSources resultSources2 = resultSources;
        List list6 = list5;
        Integer num2 = num;
        Redirect redirect2 = redirect;
        return searchResponseInner.copy(list, list2, list3, list4, num2, redirect2, resultSources2, list6);
    }

    public final List<FilterFacet> component1() {
        return this.facets;
    }

    public final List<FilterGroup> component2() {
        return this.groups;
    }

    public final List<Result> component3() {
        return this.results;
    }

    public final List<FilterSortOption> component4() {
        return this.filterSortOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getResultCount() {
        return this.resultCount;
    }

    /* renamed from: component6, reason: from getter */
    public final Redirect getRedirect() {
        return this.redirect;
    }

    /* renamed from: component7, reason: from getter */
    public final ResultSources getResultSources() {
        return this.resultSources;
    }

    public final List<RefinedContent> component8() {
        return this.refinedContent;
    }

    public final SearchResponseInner copy(@g(name = "facets") List<FilterFacet> facets, @g(name = "groups") List<FilterGroup> groups, @g(name = "results") List<Result> results, @g(name = "sort_options") List<FilterSortOption> filterSortOptions, @g(name = "total_num_results") Integer resultCount, @g(name = "redirect") Redirect redirect, @g(name = "result_sources") ResultSources resultSources, @g(name = "refined_content") List<RefinedContent> refinedContent) {
        return new SearchResponseInner(facets, groups, results, filterSortOptions, resultCount, redirect, resultSources, refinedContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResponseInner)) {
            return false;
        }
        SearchResponseInner searchResponseInner = (SearchResponseInner) other;
        return Intrinsics.e(this.facets, searchResponseInner.facets) && Intrinsics.e(this.groups, searchResponseInner.groups) && Intrinsics.e(this.results, searchResponseInner.results) && Intrinsics.e(this.filterSortOptions, searchResponseInner.filterSortOptions) && Intrinsics.e(this.resultCount, searchResponseInner.resultCount) && Intrinsics.e(this.redirect, searchResponseInner.redirect) && Intrinsics.e(this.resultSources, searchResponseInner.resultSources) && Intrinsics.e(this.refinedContent, searchResponseInner.refinedContent);
    }

    public int hashCode() {
        List<FilterFacet> list = this.facets;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FilterGroup> list2 = this.groups;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Result> list3 = this.results;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<FilterSortOption> list4 = this.filterSortOptions;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.resultCount;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Redirect redirect = this.redirect;
        int iHashCode6 = (iHashCode5 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        ResultSources resultSources = this.resultSources;
        int iHashCode7 = (iHashCode6 + (resultSources == null ? 0 : resultSources.hashCode())) * 31;
        List<RefinedContent> list5 = this.refinedContent;
        return iHashCode7 + (list5 != null ? list5.hashCode() : 0);
    }

    public String toString() {
        return "SearchResponseInner(facets=" + this.facets + ", groups=" + this.groups + ", results=" + this.results + ", filterSortOptions=" + this.filterSortOptions + ", resultCount=" + this.resultCount + ", redirect=" + this.redirect + ", resultSources=" + this.resultSources + ", refinedContent=" + this.refinedContent + ")";
    }

    public final List<FilterFacet> getFacets() {
        return this.facets;
    }

    public final List<FilterSortOption> getFilterSortOptions() {
        return this.filterSortOptions;
    }

    public final List<FilterGroup> getGroups() {
        return this.groups;
    }

    public final Redirect getRedirect() {
        return this.redirect;
    }

    public final List<RefinedContent> getRefinedContent() {
        return this.refinedContent;
    }

    public final Integer getResultCount() {
        return this.resultCount;
    }

    public final ResultSources getResultSources() {
        return this.resultSources;
    }

    public final List<Result> getResults() {
        return this.results;
    }

    public /* synthetic */ SearchResponseInner(List list, List list2, List list3, List list4, Integer num, Redirect redirect, ResultSources resultSources, List list5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i10 & 8) != 0 ? null : list4, num, redirect, resultSources, list5);
    }
}
