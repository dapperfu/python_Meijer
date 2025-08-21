package io.constructor.data.model.browse;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.FilterFacet;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/constructor/data/model/browse/BrowseFacetsResponseInner;", "Ljava/io/Serializable;", "facets", "", "Lio/constructor/data/model/common/FilterFacet;", "resultCount", "", "(Ljava/util/List;I)V", "getFacets", "()Ljava/util/List;", "getResultCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BrowseFacetsResponseInner implements Serializable {
    private final List<FilterFacet> facets;
    private final int resultCount;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrowseFacetsResponseInner copy$default(BrowseFacetsResponseInner browseFacetsResponseInner, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = browseFacetsResponseInner.facets;
        }
        if ((i11 & 2) != 0) {
            i10 = browseFacetsResponseInner.resultCount;
        }
        return browseFacetsResponseInner.copy(list, i10);
    }

    public final List<FilterFacet> component1() {
        return this.facets;
    }

    /* renamed from: component2, reason: from getter */
    public final int getResultCount() {
        return this.resultCount;
    }

    public final BrowseFacetsResponseInner copy(@g(name = "facets") List<FilterFacet> facets, @g(name = "total_num_results") int resultCount) {
        return new BrowseFacetsResponseInner(facets, resultCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowseFacetsResponseInner)) {
            return false;
        }
        BrowseFacetsResponseInner browseFacetsResponseInner = (BrowseFacetsResponseInner) other;
        return Intrinsics.e(this.facets, browseFacetsResponseInner.facets) && this.resultCount == browseFacetsResponseInner.resultCount;
    }

    public int hashCode() {
        List<FilterFacet> list = this.facets;
        return ((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.resultCount);
    }

    public String toString() {
        return "BrowseFacetsResponseInner(facets=" + this.facets + ", resultCount=" + this.resultCount + ")";
    }

    public final List<FilterFacet> getFacets() {
        return this.facets;
    }

    public final int getResultCount() {
        return this.resultCount;
    }

    public BrowseFacetsResponseInner(@g(name = "facets") List<FilterFacet> list, @g(name = "total_num_results") int i10) {
        this.facets = list;
        this.resultCount = i10;
    }
}
