package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0001\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eHÆ\u0003Jv\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0003\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u000b\u0010\u0012R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lio/constructor/data/model/common/Result;", "Ljava/io/Serializable;", "data", "Lio/constructor/data/model/common/ResultData;", "matchedTerms", "", "", "variations", "variationsMap", "", "value", "isSlotted", "", "labels", "", "(Lio/constructor/data/model/common/ResultData;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getData", "()Lio/constructor/data/model/common/ResultData;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLabels", "()Ljava/util/Map;", "getMatchedTerms", "()Ljava/util/List;", "getValue", "()Ljava/lang/String;", "getVariations", "getVariationsMap", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lio/constructor/data/model/common/ResultData;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lio/constructor/data/model/common/Result;", "equals", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Result implements Serializable {
    private final ResultData data;
    private final Boolean isSlotted;
    private final Map<String, Boolean> labels;
    private final List<String> matchedTerms;
    private final String value;
    private final List<Result> variations;
    private final Object variationsMap;

    public static /* synthetic */ Result copy$default(Result result, ResultData resultData, List list, List list2, Object obj, String str, Boolean bool, Map map, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            resultData = result.data;
        }
        if ((i10 & 2) != 0) {
            list = result.matchedTerms;
        }
        if ((i10 & 4) != 0) {
            list2 = result.variations;
        }
        if ((i10 & 8) != 0) {
            obj = result.variationsMap;
        }
        if ((i10 & 16) != 0) {
            str = result.value;
        }
        if ((i10 & 32) != 0) {
            bool = result.isSlotted;
        }
        if ((i10 & 64) != 0) {
            map = result.labels;
        }
        Boolean bool2 = bool;
        Map map2 = map;
        String str2 = str;
        List list3 = list2;
        return result.copy(resultData, list, list3, obj, str2, bool2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final ResultData getData() {
        return this.data;
    }

    public final List<String> component2() {
        return this.matchedTerms;
    }

    public final List<Result> component3() {
        return this.variations;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getVariationsMap() {
        return this.variationsMap;
    }

    /* renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsSlotted() {
        return this.isSlotted;
    }

    public final Map<String, Boolean> component7() {
        return this.labels;
    }

    public final Result copy(@g(name = "data") ResultData data, @g(name = "matched_terms") List<String> matchedTerms, @g(name = "variations") List<Result> variations, @g(name = "variations_map") Object variationsMap, @g(name = "value") String value, @g(name = "is_slotted") Boolean isSlotted, @g(name = "labels") Map<String, Boolean> labels) {
        Intrinsics.j(data, "data");
        Intrinsics.j(value, "value");
        return new Result(data, matchedTerms, variations, variationsMap, value, isSlotted, labels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result)) {
            return false;
        }
        Result result = (Result) other;
        return Intrinsics.e(this.data, result.data) && Intrinsics.e(this.matchedTerms, result.matchedTerms) && Intrinsics.e(this.variations, result.variations) && Intrinsics.e(this.variationsMap, result.variationsMap) && Intrinsics.e(this.value, result.value) && Intrinsics.e(this.isSlotted, result.isSlotted) && Intrinsics.e(this.labels, result.labels);
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        List<String> list = this.matchedTerms;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Result> list2 = this.variations;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Object obj = this.variationsMap;
        int iHashCode4 = (((iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31) + this.value.hashCode()) * 31;
        Boolean bool = this.isSlotted;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Boolean> map = this.labels;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "Result(data=" + this.data + ", matchedTerms=" + this.matchedTerms + ", variations=" + this.variations + ", variationsMap=" + this.variationsMap + ", value=" + this.value + ", isSlotted=" + this.isSlotted + ", labels=" + this.labels + ")";
    }

    public Result(@g(name = "data") ResultData data, @g(name = "matched_terms") List<String> list, @g(name = "variations") List<Result> list2, @g(name = "variations_map") Object obj, @g(name = "value") String value, @g(name = "is_slotted") Boolean bool, @g(name = "labels") Map<String, Boolean> map) {
        Intrinsics.j(data, "data");
        Intrinsics.j(value, "value");
        this.data = data;
        this.matchedTerms = list;
        this.variations = list2;
        this.variationsMap = obj;
        this.value = value;
        this.isSlotted = bool;
        this.labels = map;
    }

    public final ResultData getData() {
        return this.data;
    }

    public final Map<String, Boolean> getLabels() {
        return this.labels;
    }

    public final List<String> getMatchedTerms() {
        return this.matchedTerms;
    }

    public final String getValue() {
        return this.value;
    }

    public final List<Result> getVariations() {
        return this.variations;
    }

    public final Object getVariationsMap() {
        return this.variationsMap;
    }

    public final Boolean isSlotted() {
        return this.isSlotted;
    }
}
