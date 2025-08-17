package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lio/constructor/data/model/common/FilterSortOption;", "Ljava/io/Serializable;", "displayName", "", "sortBy", "sortOrder", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getSortBy", "getSortOrder", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FilterSortOption implements Serializable {
    private final String displayName;
    private final String sortBy;
    private final String sortOrder;
    private final String status;

    public static /* synthetic */ FilterSortOption copy$default(FilterSortOption filterSortOption, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = filterSortOption.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = filterSortOption.sortBy;
        }
        if ((i10 & 4) != 0) {
            str3 = filterSortOption.sortOrder;
        }
        if ((i10 & 8) != 0) {
            str4 = filterSortOption.status;
        }
        return filterSortOption.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSortBy() {
        return this.sortBy;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSortOrder() {
        return this.sortOrder;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final FilterSortOption copy(@g(name = "display_name") String displayName, @g(name = "sort_by") String sortBy, @g(name = "sort_order") String sortOrder, @g(name = "status") String status) {
        Intrinsics.j(displayName, "displayName");
        Intrinsics.j(sortBy, "sortBy");
        Intrinsics.j(sortOrder, "sortOrder");
        Intrinsics.j(status, "status");
        return new FilterSortOption(displayName, sortBy, sortOrder, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterSortOption)) {
            return false;
        }
        FilterSortOption filterSortOption = (FilterSortOption) other;
        return Intrinsics.e(this.displayName, filterSortOption.displayName) && Intrinsics.e(this.sortBy, filterSortOption.sortBy) && Intrinsics.e(this.sortOrder, filterSortOption.sortOrder) && Intrinsics.e(this.status, filterSortOption.status);
    }

    public int hashCode() {
        return (((((this.displayName.hashCode() * 31) + this.sortBy.hashCode()) * 31) + this.sortOrder.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "FilterSortOption(displayName=" + this.displayName + ", sortBy=" + this.sortBy + ", sortOrder=" + this.sortOrder + ", status=" + this.status + ")";
    }

    public FilterSortOption(@g(name = "display_name") String displayName, @g(name = "sort_by") String sortBy, @g(name = "sort_order") String sortOrder, @g(name = "status") String status) {
        Intrinsics.j(displayName, "displayName");
        Intrinsics.j(sortBy, "sortBy");
        Intrinsics.j(sortOrder, "sortOrder");
        Intrinsics.j(status, "status");
        this.displayName = displayName;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.status = status;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getSortBy() {
        return this.sortBy;
    }

    public final String getSortOrder() {
        return this.sortOrder;
    }

    public final String getStatus() {
        return this.status;
    }
}
