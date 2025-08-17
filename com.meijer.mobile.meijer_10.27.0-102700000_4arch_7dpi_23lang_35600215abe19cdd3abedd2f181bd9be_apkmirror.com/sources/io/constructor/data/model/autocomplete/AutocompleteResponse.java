package io.constructor.data.model.autocomplete;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.Result;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u001c\b\u0001\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0001\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\u001d\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0019\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003JY\u0010\u0018\u001a\u00020\u00002\u001c\b\u0003\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0018\b\u0003\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lio/constructor/data/model/autocomplete/AutocompleteResponse;", "Ljava/io/Serializable;", "sections", "", "", "", "Lio/constructor/data/model/common/Result;", "resultId", "request", "", "rawData", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getRawData", "()Ljava/lang/String;", "setRawData", "(Ljava/lang/String;)V", "getRequest", "()Ljava/util/Map;", "getResultId", "getSections", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AutocompleteResponse implements Serializable {
    private String rawData;
    private final Map<String, Object> request;
    private final String resultId;
    private final Map<String, List<Result>> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutocompleteResponse copy$default(AutocompleteResponse autocompleteResponse, Map map, String str, Map map2, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = autocompleteResponse.sections;
        }
        if ((i10 & 2) != 0) {
            str = autocompleteResponse.resultId;
        }
        if ((i10 & 4) != 0) {
            map2 = autocompleteResponse.request;
        }
        if ((i10 & 8) != 0) {
            str2 = autocompleteResponse.rawData;
        }
        return autocompleteResponse.copy(map, str, map2, str2);
    }

    public final Map<String, List<Result>> component1() {
        return this.sections;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    public final Map<String, Object> component3() {
        return this.request;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    public final AutocompleteResponse copy(@g(name = "sections") Map<String, ? extends List<Result>> sections, @g(name = "result_id") String resultId, @g(name = "request") Map<String, ? extends Object> request, String rawData) {
        return new AutocompleteResponse(sections, resultId, request, rawData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompleteResponse)) {
            return false;
        }
        AutocompleteResponse autocompleteResponse = (AutocompleteResponse) other;
        return Intrinsics.e(this.sections, autocompleteResponse.sections) && Intrinsics.e(this.resultId, autocompleteResponse.resultId) && Intrinsics.e(this.request, autocompleteResponse.request) && Intrinsics.e(this.rawData, autocompleteResponse.rawData);
    }

    public int hashCode() {
        Map<String, List<Result>> map = this.sections;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.resultId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map2 = this.request;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.rawData;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AutocompleteResponse(sections=" + this.sections + ", resultId=" + this.resultId + ", request=" + this.request + ", rawData=" + this.rawData + ")";
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final Map<String, Object> getRequest() {
        return this.request;
    }

    public final String getResultId() {
        return this.resultId;
    }

    public final Map<String, List<Result>> getSections() {
        return this.sections;
    }

    public final void setRawData(String str) {
        this.rawData = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutocompleteResponse(@g(name = "sections") Map<String, ? extends List<Result>> map, @g(name = "result_id") String str, @g(name = "request") Map<String, ? extends Object> map2, String str2) {
        this.sections = map;
        this.resultId = str;
        this.request = map2;
        this.rawData = str2;
    }
}
