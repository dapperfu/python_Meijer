package io.constructor.data.model.browse;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0001\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0018\b\u0003\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006\u001f"}, d2 = {"Lio/constructor/data/model/browse/BrowseResponse;", "Ljava/io/Serializable;", "response", "Lio/constructor/data/model/browse/BrowseResponseInner;", "resultId", "", "request", "", "", "rawData", "(Lio/constructor/data/model/browse/BrowseResponseInner;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getRawData", "()Ljava/lang/String;", "setRawData", "(Ljava/lang/String;)V", "getRequest", "()Ljava/util/Map;", "getResponse", "()Lio/constructor/data/model/browse/BrowseResponseInner;", "getResultId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BrowseResponse implements Serializable {
    private String rawData;
    private final Map<String, Object> request;
    private final BrowseResponseInner response;
    private final String resultId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrowseResponse copy$default(BrowseResponse browseResponse, BrowseResponseInner browseResponseInner, String str, Map map, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            browseResponseInner = browseResponse.response;
        }
        if ((i10 & 2) != 0) {
            str = browseResponse.resultId;
        }
        if ((i10 & 4) != 0) {
            map = browseResponse.request;
        }
        if ((i10 & 8) != 0) {
            str2 = browseResponse.rawData;
        }
        return browseResponse.copy(browseResponseInner, str, map, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final BrowseResponseInner getResponse() {
        return this.response;
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

    public final BrowseResponse copy(@g(name = "response") BrowseResponseInner response, @g(name = "result_id") String resultId, @g(name = "request") Map<String, ? extends Object> request, String rawData) {
        return new BrowseResponse(response, resultId, request, rawData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowseResponse)) {
            return false;
        }
        BrowseResponse browseResponse = (BrowseResponse) other;
        return Intrinsics.e(this.response, browseResponse.response) && Intrinsics.e(this.resultId, browseResponse.resultId) && Intrinsics.e(this.request, browseResponse.request) && Intrinsics.e(this.rawData, browseResponse.rawData);
    }

    public int hashCode() {
        BrowseResponseInner browseResponseInner = this.response;
        int iHashCode = (browseResponseInner == null ? 0 : browseResponseInner.hashCode()) * 31;
        String str = this.resultId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.request;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.rawData;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BrowseResponse(response=" + this.response + ", resultId=" + this.resultId + ", request=" + this.request + ", rawData=" + this.rawData + ")";
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final Map<String, Object> getRequest() {
        return this.request;
    }

    public final BrowseResponseInner getResponse() {
        return this.response;
    }

    public final String getResultId() {
        return this.resultId;
    }

    public final void setRawData(String str) {
        this.rawData = str;
    }

    public BrowseResponse(@g(name = "response") BrowseResponseInner browseResponseInner, @g(name = "result_id") String str, @g(name = "request") Map<String, ? extends Object> map, String str2) {
        this.response = browseResponseInner;
        this.resultId = str;
        this.request = map;
        this.rawData = str2;
    }
}
