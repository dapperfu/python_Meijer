package io.constructor.data.model.search;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0001\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\u001f"}, d2 = {"Lio/constructor/data/model/search/SearchResponse;", "Ljava/io/Serializable;", "response", "Lio/constructor/data/model/search/SearchResponseInner;", "request", "", "", "", "resultId", "rawData", "(Lio/constructor/data/model/search/SearchResponseInner;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getRawData", "()Ljava/lang/String;", "setRawData", "(Ljava/lang/String;)V", "getRequest", "()Ljava/util/Map;", "getResponse", "()Lio/constructor/data/model/search/SearchResponseInner;", "getResultId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SearchResponse implements Serializable {
    private String rawData;
    private final Map<String, Object> request;
    private final SearchResponseInner response;
    private final String resultId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResponse copy$default(SearchResponse searchResponse, SearchResponseInner searchResponseInner, Map map, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            searchResponseInner = searchResponse.response;
        }
        if ((i10 & 2) != 0) {
            map = searchResponse.request;
        }
        if ((i10 & 4) != 0) {
            str = searchResponse.resultId;
        }
        if ((i10 & 8) != 0) {
            str2 = searchResponse.rawData;
        }
        return searchResponse.copy(searchResponseInner, map, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchResponseInner getResponse() {
        return this.response;
    }

    public final Map<String, Object> component2() {
        return this.request;
    }

    /* renamed from: component3, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    public final SearchResponse copy(@g(name = "response") SearchResponseInner response, @g(name = "request") Map<String, ? extends Object> request, @g(name = "result_id") String resultId, String rawData) {
        return new SearchResponse(response, request, resultId, rawData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResponse)) {
            return false;
        }
        SearchResponse searchResponse = (SearchResponse) other;
        return Intrinsics.e(this.response, searchResponse.response) && Intrinsics.e(this.request, searchResponse.request) && Intrinsics.e(this.resultId, searchResponse.resultId) && Intrinsics.e(this.rawData, searchResponse.rawData);
    }

    public int hashCode() {
        SearchResponseInner searchResponseInner = this.response;
        int iHashCode = (searchResponseInner == null ? 0 : searchResponseInner.hashCode()) * 31;
        Map<String, Object> map = this.request;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.resultId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rawData;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SearchResponse(response=" + this.response + ", request=" + this.request + ", resultId=" + this.resultId + ", rawData=" + this.rawData + ")";
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final Map<String, Object> getRequest() {
        return this.request;
    }

    public final SearchResponseInner getResponse() {
        return this.response;
    }

    public final String getResultId() {
        return this.resultId;
    }

    public final void setRawData(String str) {
        this.rawData = str;
    }

    public SearchResponse(@g(name = "response") SearchResponseInner searchResponseInner, @g(name = "request") Map<String, ? extends Object> map, @g(name = "result_id") String str, String str2) {
        this.response = searchResponseInner;
        this.request = map;
        this.resultId = str;
        this.rawData = str2;
    }
}
