package io.constructor.data.model.recommendations;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003JÒ\u0001\u0010C\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00102\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00142\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020\u0005HÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010*\u001a\u0004\b,\u0010)R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006J"}, d2 = {"Lio/constructor/data/model/recommendations/RecommendationResultViewRequestBody;", "Ljava/io/Serializable;", "podId", "", "numResultsViewed", "", "resultPage", "resultCount", "resultId", "url", "c", "i", "s", "key", "ui", "us", "", "analyticsTags", "", "beacon", "", "section", "_dt", "", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "()Ljava/lang/String;", "getI", "getKey", "getNumResultsViewed", "()I", "getPodId", "getResultCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResultId", "getResultPage", "getS", "getSection", "getUi", "getUrl", "getUs", "()Ljava/util/List;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lio/constructor/data/model/recommendations/RecommendationResultViewRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RecommendationResultViewRequestBody implements Serializable {
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String i;
    private final String key;
    private final int numResultsViewed;
    private final String podId;
    private final Integer resultCount;
    private final String resultId;
    private final Integer resultPage;
    private final int s;
    private final String section;
    private final String ui;
    private final String url;
    private final List<String> us;

    /* renamed from: component1, reason: from getter */
    public final String getPodId() {
        return this.podId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUi() {
        return this.ui;
    }

    public final List<String> component12() {
        return this.us;
    }

    public final Map<String, String> component13() {
        return this.analyticsTags;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getBeacon() {
        return this.beacon;
    }

    /* renamed from: component15, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* renamed from: component16, reason: from getter */
    public final Long get_dt() {
        return this._dt;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumResultsViewed() {
        return this.numResultsViewed;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getResultPage() {
        return this.resultPage;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getResultCount() {
        return this.resultCount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component7, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: component8, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: component9, reason: from getter */
    public final int getS() {
        return this.s;
    }

    public final RecommendationResultViewRequestBody copy(@g(name = "pod_id") String podId, @g(name = "num_results_viewed") int numResultsViewed, @g(name = "result_page") Integer resultPage, @g(name = "result_count") Integer resultCount, @g(name = "result_id") String resultId, @g(name = "url") String url, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int s10, @g(name = "key") String key, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "beacon") Boolean beacon, @g(name = "section") String section, @g(name = "_dt") Long _dt) {
        Intrinsics.j(podId, "podId");
        Intrinsics.j(url, "url");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        return new RecommendationResultViewRequestBody(podId, numResultsViewed, resultPage, resultCount, resultId, url, c10, i10, s10, key, ui2, us2, analyticsTags, beacon, section, _dt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationResultViewRequestBody)) {
            return false;
        }
        RecommendationResultViewRequestBody recommendationResultViewRequestBody = (RecommendationResultViewRequestBody) other;
        return Intrinsics.e(this.podId, recommendationResultViewRequestBody.podId) && this.numResultsViewed == recommendationResultViewRequestBody.numResultsViewed && Intrinsics.e(this.resultPage, recommendationResultViewRequestBody.resultPage) && Intrinsics.e(this.resultCount, recommendationResultViewRequestBody.resultCount) && Intrinsics.e(this.resultId, recommendationResultViewRequestBody.resultId) && Intrinsics.e(this.url, recommendationResultViewRequestBody.url) && Intrinsics.e(this.c, recommendationResultViewRequestBody.c) && Intrinsics.e(this.i, recommendationResultViewRequestBody.i) && this.s == recommendationResultViewRequestBody.s && Intrinsics.e(this.key, recommendationResultViewRequestBody.key) && Intrinsics.e(this.ui, recommendationResultViewRequestBody.ui) && Intrinsics.e(this.us, recommendationResultViewRequestBody.us) && Intrinsics.e(this.analyticsTags, recommendationResultViewRequestBody.analyticsTags) && Intrinsics.e(this.beacon, recommendationResultViewRequestBody.beacon) && Intrinsics.e(this.section, recommendationResultViewRequestBody.section) && Intrinsics.e(this._dt, recommendationResultViewRequestBody._dt);
    }

    public int hashCode() {
        int iHashCode = ((this.podId.hashCode() * 31) + Integer.hashCode(this.numResultsViewed)) * 31;
        Integer num = this.resultPage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.resultCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.resultId;
        int iHashCode4 = (((((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.url.hashCode()) * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + this.key.hashCode()) * 31;
        String str2 = this.ui;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.beacon;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.section;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this._dt;
        return iHashCode8 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationResultViewRequestBody(podId=" + this.podId + ", numResultsViewed=" + this.numResultsViewed + ", resultPage=" + this.resultPage + ", resultCount=" + this.resultCount + ", resultId=" + this.resultId + ", url=" + this.url + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", key=" + this.key + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", beacon=" + this.beacon + ", section=" + this.section + ", _dt=" + this._dt + ")";
    }

    public RecommendationResultViewRequestBody(@g(name = "pod_id") String podId, @g(name = "num_results_viewed") int i10, @g(name = "result_page") Integer num, @g(name = "result_count") Integer num2, @g(name = "result_id") String str, @g(name = "url") String url, @g(name = "c") String c10, @g(name = "i") String i11, @g(name = "s") int i12, @g(name = "key") String key, @g(name = "ui") String str2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "beacon") Boolean bool, @g(name = "section") String str3, @g(name = "_dt") Long l10) {
        Intrinsics.j(podId, "podId");
        Intrinsics.j(url, "url");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i11, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        this.podId = podId;
        this.numResultsViewed = i10;
        this.resultPage = num;
        this.resultCount = num2;
        this.resultId = str;
        this.url = url;
        this.c = c10;
        this.i = i11;
        this.s = i12;
        this.key = key;
        this.ui = str2;
        this.us = us2;
        this.analyticsTags = map;
        this.beacon = bool;
        this.section = str3;
        this._dt = l10;
    }

    public final Map<String, String> getAnalyticsTags() {
        return this.analyticsTags;
    }

    public final Boolean getBeacon() {
        return this.beacon;
    }

    public final String getC() {
        return this.c;
    }

    public final String getI() {
        return this.i;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getNumResultsViewed() {
        return this.numResultsViewed;
    }

    public final String getPodId() {
        return this.podId;
    }

    public final Integer getResultCount() {
        return this.resultCount;
    }

    public final String getResultId() {
        return this.resultId;
    }

    public final Integer getResultPage() {
        return this.resultPage;
    }

    public final int getS() {
        return this.s;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getUi() {
        return this.ui;
    }

    public final String getUrl() {
        return this.url;
    }

    public final List<String> getUs() {
        return this.us;
    }

    public final Long get_dt() {
        return this._dt;
    }
}
