package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0018\b\u0001\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0019\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0003J\u0098\u0001\u0010,\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0016\b\u0003\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0018\b\u0003\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R!\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00063"}, d2 = {"Lio/constructor/data/model/common/FilterFacet;", "Ljava/io/Serializable;", "displayName", "", "name", "status", "", "", "min", "", "max", "options", "", "Lio/constructor/data/model/common/FilterFacetOption;", "type", "hidden", "", "data", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getDisplayName", "()Ljava/lang/String;", "getHidden", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMax", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMin", "getName", "getOptions", "()Ljava/util/List;", "getStatus", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lio/constructor/data/model/common/FilterFacet;", "equals", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FilterFacet implements Serializable {
    private final Map<String, Object> data;
    private final String displayName;
    private final Boolean hidden;
    private final Double max;
    private final Double min;
    private final String name;
    private final List<FilterFacetOption> options;
    private final Map<String, Object> status;
    private final String type;

    public static /* synthetic */ FilterFacet copy$default(FilterFacet filterFacet, String str, String str2, Map map, Double d10, Double d11, List list, String str3, Boolean bool, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = filterFacet.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = filterFacet.name;
        }
        if ((i10 & 4) != 0) {
            map = filterFacet.status;
        }
        if ((i10 & 8) != 0) {
            d10 = filterFacet.min;
        }
        if ((i10 & 16) != 0) {
            d11 = filterFacet.max;
        }
        if ((i10 & 32) != 0) {
            list = filterFacet.options;
        }
        if ((i10 & 64) != 0) {
            str3 = filterFacet.type;
        }
        if ((i10 & 128) != 0) {
            bool = filterFacet.hidden;
        }
        if ((i10 & 256) != 0) {
            map2 = filterFacet.data;
        }
        Boolean bool2 = bool;
        Map map3 = map2;
        List list2 = list;
        String str4 = str3;
        Double d12 = d11;
        Map map4 = map;
        return filterFacet.copy(str, str2, map4, d10, d12, list2, str4, bool2, map3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> component3() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getMin() {
        return this.min;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getMax() {
        return this.max;
    }

    public final List<FilterFacetOption> component6() {
        return this.options;
    }

    /* renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    public final Map<String, Object> component9() {
        return this.data;
    }

    public final FilterFacet copy(@g(name = "display_name") String displayName, @g(name = "name") String name, @g(name = "status") Map<String, ? extends Object> status, @g(name = "min") Double min, @g(name = "max") Double max, @g(name = "options") List<FilterFacetOption> options, @g(name = "type") String type, @g(name = "hidden") Boolean hidden, @g(name = "data") Map<String, ? extends Object> data) {
        Intrinsics.j(name, "name");
        return new FilterFacet(displayName, name, status, min, max, options, type, hidden, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterFacet)) {
            return false;
        }
        FilterFacet filterFacet = (FilterFacet) other;
        return Intrinsics.e(this.displayName, filterFacet.displayName) && Intrinsics.e(this.name, filterFacet.name) && Intrinsics.e(this.status, filterFacet.status) && Intrinsics.e(this.min, filterFacet.min) && Intrinsics.e(this.max, filterFacet.max) && Intrinsics.e(this.options, filterFacet.options) && Intrinsics.e(this.type, filterFacet.type) && Intrinsics.e(this.hidden, filterFacet.hidden) && Intrinsics.e(this.data, filterFacet.data);
    }

    public int hashCode() {
        String str = this.displayName;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31;
        Map<String, Object> map = this.status;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Double d10 = this.min;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.max;
        int iHashCode4 = (iHashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List<FilterFacetOption> list = this.options;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hidden;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Object> map2 = this.data;
        return iHashCode7 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "FilterFacet(displayName=" + this.displayName + ", name=" + this.name + ", status=" + this.status + ", min=" + this.min + ", max=" + this.max + ", options=" + this.options + ", type=" + this.type + ", hidden=" + this.hidden + ", data=" + this.data + ")";
    }

    public FilterFacet(@g(name = "display_name") String str, @g(name = "name") String name, @g(name = "status") Map<String, ? extends Object> map, @g(name = "min") Double d10, @g(name = "max") Double d11, @g(name = "options") List<FilterFacetOption> list, @g(name = "type") String str2, @g(name = "hidden") Boolean bool, @g(name = "data") Map<String, ? extends Object> map2) {
        Intrinsics.j(name, "name");
        this.displayName = str;
        this.name = name;
        this.status = map;
        this.min = d10;
        this.max = d11;
        this.options = list;
        this.type = str2;
        this.hidden = bool;
        this.data = map2;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final Double getMax() {
        return this.max;
    }

    public final Double getMin() {
        return this.min;
    }

    public final String getName() {
        return this.name;
    }

    public final List<FilterFacetOption> getOptions() {
        return this.options;
    }

    public final Map<String, Object> getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }
}
