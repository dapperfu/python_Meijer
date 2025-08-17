package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012 \b\u0001\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005\u0012\u001c\b\u0003\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J!\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032 \b\u0003\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u00052\u001c\b\u0003\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR%\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lio/constructor/data/model/common/VariationsMap;", "Ljava/io/Serializable;", "dtype", "", "values", "", "groupBy", "", "filterBy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "getDtype", "()Ljava/lang/String;", "getFilterBy", "setFilterBy", "(Ljava/lang/String;)V", "getGroupBy", "()Ljava/util/List;", "getValues", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VariationsMap implements Serializable {
    private final String dtype;
    private String filterBy;
    private final List<Map<String, String>> groupBy;
    private final Map<String, Map<String, String>> values;

    /* JADX WARN: Multi-variable type inference failed */
    public VariationsMap(@g(name = "dtype") String dtype, @g(name = "values") Map<String, ? extends Map<String, String>> values, @g(name = "group_by") List<? extends Map<String, String>> list, @g(name = "filter_by") String str) {
        Intrinsics.j(dtype, "dtype");
        Intrinsics.j(values, "values");
        this.dtype = dtype;
        this.values = values;
        this.groupBy = list;
        this.filterBy = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VariationsMap copy$default(VariationsMap variationsMap, String str, Map map, List list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = variationsMap.dtype;
        }
        if ((i10 & 2) != 0) {
            map = variationsMap.values;
        }
        if ((i10 & 4) != 0) {
            list = variationsMap.groupBy;
        }
        if ((i10 & 8) != 0) {
            str2 = variationsMap.filterBy;
        }
        return variationsMap.copy(str, map, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDtype() {
        return this.dtype;
    }

    public final Map<String, Map<String, String>> component2() {
        return this.values;
    }

    public final List<Map<String, String>> component3() {
        return this.groupBy;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFilterBy() {
        return this.filterBy;
    }

    public final VariationsMap copy(@g(name = "dtype") String dtype, @g(name = "values") Map<String, ? extends Map<String, String>> values, @g(name = "group_by") List<? extends Map<String, String>> groupBy, @g(name = "filter_by") String filterBy) {
        Intrinsics.j(dtype, "dtype");
        Intrinsics.j(values, "values");
        return new VariationsMap(dtype, values, groupBy, filterBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VariationsMap)) {
            return false;
        }
        VariationsMap variationsMap = (VariationsMap) other;
        return Intrinsics.e(this.dtype, variationsMap.dtype) && Intrinsics.e(this.values, variationsMap.values) && Intrinsics.e(this.groupBy, variationsMap.groupBy) && Intrinsics.e(this.filterBy, variationsMap.filterBy);
    }

    public int hashCode() {
        int iHashCode = ((this.dtype.hashCode() * 31) + this.values.hashCode()) * 31;
        List<Map<String, String>> list = this.groupBy;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.filterBy;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VariationsMap(dtype=" + this.dtype + ", values=" + this.values + ", groupBy=" + this.groupBy + ", filterBy=" + this.filterBy + ")";
    }

    public final String getDtype() {
        return this.dtype;
    }

    public final String getFilterBy() {
        return this.filterBy;
    }

    public final List<Map<String, String>> getGroupBy() {
        return this.groupBy;
    }

    public final Map<String, Map<String, String>> getValues() {
        return this.values;
    }

    public final void setFilterBy(String str) {
        this.filterBy = str;
    }

    public /* synthetic */ VariationsMap(String str, Map map, List list, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : str2);
    }
}
