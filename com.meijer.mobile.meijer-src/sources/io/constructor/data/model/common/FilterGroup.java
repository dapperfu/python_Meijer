package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0018\b\u0001\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u0019\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0003Jl\u0010\u001f\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\u0018\b\u0003\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006&"}, d2 = {"Lio/constructor/data/model/common/FilterGroup;", "Ljava/io/Serializable;", "children", "", "parents", "count", "", "displayName", "", "groupId", "data", "", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getChildren", "()Ljava/util/List;", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Ljava/util/Map;", "getDisplayName", "()Ljava/lang/String;", "getGroupId", "getParents", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/constructor/data/model/common/FilterGroup;", "equals", "", "other", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FilterGroup implements Serializable {
    private final List<FilterGroup> children;
    private final Integer count;
    private final Map<String, Object> data;
    private final String displayName;
    private final String groupId;
    private final List<FilterGroup> parents;

    public static /* synthetic */ FilterGroup copy$default(FilterGroup filterGroup, List list, List list2, Integer num, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = filterGroup.children;
        }
        if ((i10 & 2) != 0) {
            list2 = filterGroup.parents;
        }
        if ((i10 & 4) != 0) {
            num = filterGroup.count;
        }
        if ((i10 & 8) != 0) {
            str = filterGroup.displayName;
        }
        if ((i10 & 16) != 0) {
            str2 = filterGroup.groupId;
        }
        if ((i10 & 32) != 0) {
            map = filterGroup.data;
        }
        String str3 = str2;
        Map map2 = map;
        return filterGroup.copy(list, list2, num, str, str3, map2);
    }

    public final List<FilterGroup> component1() {
        return this.children;
    }

    public final List<FilterGroup> component2() {
        return this.parents;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    public final Map<String, Object> component6() {
        return this.data;
    }

    public final FilterGroup copy(@g(name = "children") List<FilterGroup> children, @g(name = "parents") List<FilterGroup> parents, @g(name = "count") Integer count, @g(name = "display_name") String displayName, @g(name = "group_id") String groupId, @g(name = "data") Map<String, ? extends Object> data) {
        Intrinsics.j(displayName, "displayName");
        Intrinsics.j(groupId, "groupId");
        return new FilterGroup(children, parents, count, displayName, groupId, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterGroup)) {
            return false;
        }
        FilterGroup filterGroup = (FilterGroup) other;
        return Intrinsics.e(this.children, filterGroup.children) && Intrinsics.e(this.parents, filterGroup.parents) && Intrinsics.e(this.count, filterGroup.count) && Intrinsics.e(this.displayName, filterGroup.displayName) && Intrinsics.e(this.groupId, filterGroup.groupId) && Intrinsics.e(this.data, filterGroup.data);
    }

    public int hashCode() {
        List<FilterGroup> list = this.children;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FilterGroup> list2 = this.parents;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.displayName.hashCode()) * 31) + this.groupId.hashCode()) * 31;
        Map<String, Object> map = this.data;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "FilterGroup(children=" + this.children + ", parents=" + this.parents + ", count=" + this.count + ", displayName=" + this.displayName + ", groupId=" + this.groupId + ", data=" + this.data + ")";
    }

    public FilterGroup(@g(name = "children") List<FilterGroup> list, @g(name = "parents") List<FilterGroup> list2, @g(name = "count") Integer num, @g(name = "display_name") String displayName, @g(name = "group_id") String groupId, @g(name = "data") Map<String, ? extends Object> map) {
        Intrinsics.j(displayName, "displayName");
        Intrinsics.j(groupId, "groupId");
        this.children = list;
        this.parents = list2;
        this.count = num;
        this.displayName = displayName;
        this.groupId = groupId;
        this.data = map;
    }

    public final List<FilterGroup> getChildren() {
        return this.children;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final List<FilterGroup> getParents() {
        return this.parents;
    }
}
