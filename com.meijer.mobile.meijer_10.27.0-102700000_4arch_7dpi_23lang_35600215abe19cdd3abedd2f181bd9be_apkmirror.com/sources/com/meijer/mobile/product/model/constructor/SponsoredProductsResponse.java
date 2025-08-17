package com.meijer.mobile.product.model.constructor;

import android.annotation.SuppressLint;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0001\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJN\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0018\b\u0003\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR'\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponse;", "Ljava/io/Serializable;", "Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;", "response", "", "", "", "request", "resultId", "rawData", "<init>", "(Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;", "c", "()Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "Ljava/lang/String;", "d", "setRawData", "(Ljava/lang/String;)V", "constructor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"SerializableUsage"})
/* loaded from: classes11.dex */
public final /* data */ class SponsoredProductsResponse implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SponsoredProductsResponseInner response;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> request;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String resultId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String rawData;

    public final SponsoredProductsResponse copy(@g(name = "response") SponsoredProductsResponseInner response, @g(name = "request") Map<String, ? extends Object> request, @g(name = "result_id") String resultId, String rawData) {
        return new SponsoredProductsResponse(response, request, resultId, rawData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SponsoredProductsResponse)) {
            return false;
        }
        SponsoredProductsResponse sponsoredProductsResponse = (SponsoredProductsResponse) other;
        return Intrinsics.e(this.response, sponsoredProductsResponse.response) && Intrinsics.e(this.request, sponsoredProductsResponse.request) && Intrinsics.e(this.resultId, sponsoredProductsResponse.resultId) && Intrinsics.e(this.rawData, sponsoredProductsResponse.rawData);
    }

    public int hashCode() {
        SponsoredProductsResponseInner sponsoredProductsResponseInner = this.response;
        int iHashCode = (sponsoredProductsResponseInner == null ? 0 : sponsoredProductsResponseInner.hashCode()) * 31;
        Map<String, Object> map = this.request;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.resultId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rawData;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SponsoredProductsResponse(response=" + this.response + ", request=" + this.request + ", resultId=" + this.resultId + ", rawData=" + this.rawData + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    public final Map<String, Object> b() {
        return this.request;
    }

    /* renamed from: c, reason: from getter */
    public final SponsoredProductsResponseInner getResponse() {
        return this.response;
    }

    /* renamed from: d, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    public SponsoredProductsResponse(@g(name = "response") SponsoredProductsResponseInner sponsoredProductsResponseInner, @g(name = "request") Map<String, ? extends Object> map, @g(name = "result_id") String str, String str2) {
        this.response = sponsoredProductsResponseInner;
        this.request = map;
        this.resultId = str;
        this.rawData = str2;
    }
}
