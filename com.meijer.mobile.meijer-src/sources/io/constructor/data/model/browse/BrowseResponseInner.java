package io.constructor.data.model.browse;

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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005¢\u0006\u0002\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005HÆ\u0003J\u0085\u0001\u0010(\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u000eHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u00060"}, d2 = {"Lio/constructor/data/model/browse/BrowseResponseInner;", "Ljava/io/Serializable;", "collection", "Lio/constructor/data/model/browse/Collection;", "facets", "", "Lio/constructor/data/model/common/FilterFacet;", "groups", "Lio/constructor/data/model/common/FilterGroup;", "results", "Lio/constructor/data/model/common/Result;", "filterSortOptions", "Lio/constructor/data/model/common/FilterSortOption;", "resultCount", "", "resultSources", "Lio/constructor/data/model/common/ResultSources;", "refinedContent", "Lio/constructor/data/model/common/RefinedContent;", "(Lio/constructor/data/model/browse/Collection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILio/constructor/data/model/common/ResultSources;Ljava/util/List;)V", "getCollection", "()Lio/constructor/data/model/browse/Collection;", "getFacets", "()Ljava/util/List;", "getFilterSortOptions", "getGroups", "getRefinedContent", "getResultCount", "()I", "getResultSources", "()Lio/constructor/data/model/common/ResultSources;", "getResults", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BrowseResponseInner implements Serializable {
    private final Collection collection;
    private final List<FilterFacet> facets;
    private final List<FilterSortOption> filterSortOptions;
    private final List<FilterGroup> groups;
    private final List<RefinedContent> refinedContent;
    private final int resultCount;
    private final ResultSources resultSources;
    private final List<Result> results;

    public BrowseResponseInner(@g(name = "collection") Collection collection, @g(name = "facets") List<FilterFacet> list, @g(name = "groups") List<FilterGroup> list2, @g(name = "results") List<Result> list3, @g(name = "sort_options") List<FilterSortOption> list4, @g(name = "total_num_results") int i10, @g(name = "result_sources") ResultSources resultSources, @g(name = "refined_content") List<RefinedContent> list5) {
        this.collection = collection;
        this.facets = list;
        this.groups = list2;
        this.results = list3;
        this.filterSortOptions = list4;
        this.resultCount = i10;
        this.resultSources = resultSources;
        this.refinedContent = list5;
    }

    public static /* synthetic */ BrowseResponseInner copy$default(BrowseResponseInner browseResponseInner, Collection collection, List list, List list2, List list3, List list4, int i10, ResultSources resultSources, List list5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            collection = browseResponseInner.collection;
        }
        if ((i11 & 2) != 0) {
            list = browseResponseInner.facets;
        }
        if ((i11 & 4) != 0) {
            list2 = browseResponseInner.groups;
        }
        if ((i11 & 8) != 0) {
            list3 = browseResponseInner.results;
        }
        if ((i11 & 16) != 0) {
            list4 = browseResponseInner.filterSortOptions;
        }
        if ((i11 & 32) != 0) {
            i10 = browseResponseInner.resultCount;
        }
        if ((i11 & 64) != 0) {
            resultSources = browseResponseInner.resultSources;
        }
        if ((i11 & 128) != 0) {
            list5 = browseResponseInner.refinedContent;
        }
        ResultSources resultSources2 = resultSources;
        List list6 = list5;
        List list7 = list4;
        int i12 = i10;
        return browseResponseInner.copy(collection, list, list2, list3, list7, i12, resultSources2, list6);
    }

    /* renamed from: component1, reason: from getter */
    public final Collection getCollection() {
        return this.collection;
    }

    public final List<FilterFacet> component2() {
        return this.facets;
    }

    public final List<FilterGroup> component3() {
        return this.groups;
    }

    public final List<Result> component4() {
        return this.results;
    }

    public final List<FilterSortOption> component5() {
        return this.filterSortOptions;
    }

    /* renamed from: component6, reason: from getter */
    public final int getResultCount() {
        return this.resultCount;
    }

    /* renamed from: component7, reason: from getter */
    public final ResultSources getResultSources() {
        return this.resultSources;
    }

    public final List<RefinedContent> component8() {
        return this.refinedContent;
    }

    public final BrowseResponseInner copy(@g(name = "collection") Collection collection, @g(name = "facets") List<FilterFacet> facets, @g(name = "groups") List<FilterGroup> groups, @g(name = "results") List<Result> results, @g(name = "sort_options") List<FilterSortOption> filterSortOptions, @g(name = "total_num_results") int resultCount, @g(name = "result_sources") ResultSources resultSources, @g(name = "refined_content") List<RefinedContent> refinedContent) {
        return new BrowseResponseInner(collection, facets, groups, results, filterSortOptions, resultCount, resultSources, refinedContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowseResponseInner)) {
            return false;
        }
        BrowseResponseInner browseResponseInner = (BrowseResponseInner) other;
        return Intrinsics.e(this.collection, browseResponseInner.collection) && Intrinsics.e(this.facets, browseResponseInner.facets) && Intrinsics.e(this.groups, browseResponseInner.groups) && Intrinsics.e(this.results, browseResponseInner.results) && Intrinsics.e(this.filterSortOptions, browseResponseInner.filterSortOptions) && this.resultCount == browseResponseInner.resultCount && Intrinsics.e(this.resultSources, browseResponseInner.resultSources) && Intrinsics.e(this.refinedContent, browseResponseInner.refinedContent);
    }

    public int hashCode() {
        Collection collection = this.collection;
        int iHashCode = (collection == null ? 0 : collection.hashCode()) * 31;
        List<FilterFacet> list = this.facets;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<FilterGroup> list2 = this.groups;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Result> list3 = this.results;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<FilterSortOption> list4 = this.filterSortOptions;
        int iHashCode5 = (((iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31) + Integer.hashCode(this.resultCount)) * 31;
        ResultSources resultSources = this.resultSources;
        int iHashCode6 = (iHashCode5 + (resultSources == null ? 0 : resultSources.hashCode())) * 31;
        List<RefinedContent> list5 = this.refinedContent;
        return iHashCode6 + (list5 != null ? list5.hashCode() : 0);
    }

    public String toString() {
        return "BrowseResponseInner(collection=" + this.collection + ", facets=" + this.facets + ", groups=" + this.groups + ", results=" + this.results + ", filterSortOptions=" + this.filterSortOptions + ", resultCount=" + this.resultCount + ", resultSources=" + this.resultSources + ", refinedContent=" + this.refinedContent + ")";
    }

    public final Collection getCollection() {
        return this.collection;
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

    public final List<RefinedContent> getRefinedContent() {
        return this.refinedContent;
    }

    public final int getResultCount() {
        return this.resultCount;
    }

    public final ResultSources getResultSources() {
        return this.resultSources;
    }

    public final List<Result> getResults() {
        return this.results;
    }

    public /* synthetic */ BrowseResponseInner(Collection collection, List list, List list2, List list3, List list4, int i10, ResultSources resultSources, List list5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, list, list2, list3, (i11 & 16) != 0 ? null : list4, i10, resultSources, list5);
    }
}
