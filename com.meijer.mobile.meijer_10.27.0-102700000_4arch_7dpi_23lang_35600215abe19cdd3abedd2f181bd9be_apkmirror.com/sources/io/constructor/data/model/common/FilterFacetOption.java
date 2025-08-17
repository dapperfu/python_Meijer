package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0001\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0018\b\u0003\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lio/constructor/data/model/common/FilterFacetOption;", "Ljava/io/Serializable;", "count", "", "displayName", "", "status", "value", "data", "", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCount", "()I", "getData", "()Ljava/util/Map;", "getDisplayName", "()Ljava/lang/String;", "getStatus", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FilterFacetOption implements Serializable {
    private final int count;
    private final Map<String, Object> data;
    private final String displayName;
    private final String status;
    private final String value;

    public static /* synthetic */ FilterFacetOption copy$default(FilterFacetOption filterFacetOption, int i10, String str, String str2, String str3, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = filterFacetOption.count;
        }
        if ((i11 & 2) != 0) {
            str = filterFacetOption.displayName;
        }
        if ((i11 & 4) != 0) {
            str2 = filterFacetOption.status;
        }
        if ((i11 & 8) != 0) {
            str3 = filterFacetOption.value;
        }
        if ((i11 & 16) != 0) {
            map = filterFacetOption.data;
        }
        Map map2 = map;
        String str4 = str2;
        return filterFacetOption.copy(i10, str, str4, str3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final Map<String, Object> component5() {
        return this.data;
    }

    public final FilterFacetOption copy(@g(name = "count") int count, @g(name = "display_name") String displayName, @g(name = "status") String status, @g(name = "value") String value, @g(name = "data") Map<String, ? extends Object> data) {
        return new FilterFacetOption(count, displayName, status, value, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterFacetOption)) {
            return false;
        }
        FilterFacetOption filterFacetOption = (FilterFacetOption) other;
        return this.count == filterFacetOption.count && Intrinsics.e(this.displayName, filterFacetOption.displayName) && Intrinsics.e(this.status, filterFacetOption.status) && Intrinsics.e(this.value, filterFacetOption.value) && Intrinsics.e(this.data, filterFacetOption.data);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, Object> map = this.data;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "FilterFacetOption(count=" + this.count + ", displayName=" + this.displayName + ", status=" + this.status + ", value=" + this.value + ", data=" + this.data + ")";
    }

    public final int getCount() {
        return this.count;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getValue() {
        return this.value;
    }

    public FilterFacetOption(@g(name = "count") int i10, @g(name = "display_name") String str, @g(name = "status") String str2, @g(name = "value") String str3, @g(name = "data") Map<String, ? extends Object> map) {
        this.count = i10;
        this.displayName = str;
        this.status = str2;
        this.value = str3;
        this.data = map;
    }
}
