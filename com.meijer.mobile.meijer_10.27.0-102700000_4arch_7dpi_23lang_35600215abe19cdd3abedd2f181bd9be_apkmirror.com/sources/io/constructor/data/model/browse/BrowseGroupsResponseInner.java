package io.constructor.data.model.browse;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.FilterGroup;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/constructor/data/model/browse/BrowseGroupsResponseInner;", "Ljava/io/Serializable;", "groups", "", "Lio/constructor/data/model/common/FilterGroup;", "(Ljava/util/List;)V", "getGroups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BrowseGroupsResponseInner implements Serializable {
    private final List<FilterGroup> groups;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrowseGroupsResponseInner copy$default(BrowseGroupsResponseInner browseGroupsResponseInner, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = browseGroupsResponseInner.groups;
        }
        return browseGroupsResponseInner.copy(list);
    }

    public final List<FilterGroup> component1() {
        return this.groups;
    }

    public final BrowseGroupsResponseInner copy(@g(name = "groups") List<FilterGroup> groups) {
        return new BrowseGroupsResponseInner(groups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BrowseGroupsResponseInner) && Intrinsics.e(this.groups, ((BrowseGroupsResponseInner) other).groups);
    }

    public int hashCode() {
        List<FilterGroup> list = this.groups;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "BrowseGroupsResponseInner(groups=" + this.groups + ")";
    }

    public final List<FilterGroup> getGroups() {
        return this.groups;
    }

    public BrowseGroupsResponseInner(@g(name = "groups") List<FilterGroup> list) {
        this.groups = list;
    }
}
