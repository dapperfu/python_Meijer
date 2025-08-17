package io.constructor.data.model.recommendations;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013\u0012\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013HÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010J\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010K\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010*Jö\u0001\u0010L\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\t2\b\b\u0003\u0010\u0010\u001a\u00020\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0016\b\u0003\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00172\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\tHÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010+\u001a\u0004\b/\u0010*R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010+\u001a\u0004\b0\u0010*R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%¨\u0006S"}, d2 = {"Lio/constructor/data/model/recommendations/RecommendationResultClickRequestBody;", "Ljava/io/Serializable;", "podId", "", "strategyId", "itemId", "variationId", "resultId", "numResultsPerPage", "", "resultPage", "resultCount", "resultPositionOnPage", "c", "i", "s", "key", "ui", "us", "", "analyticsTags", "", "beacon", "", "section", "_dt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "()Ljava/lang/String;", "getI", "getItemId", "getKey", "getNumResultsPerPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPodId", "getResultCount", "getResultId", "getResultPage", "getResultPositionOnPage", "getS", "()I", "getSection", "getStrategyId", "getUi", "getUs", "()Ljava/util/List;", "getVariationId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lio/constructor/data/model/recommendations/RecommendationResultClickRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RecommendationResultClickRequestBody implements Serializable {
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String i;
    private final String itemId;
    private final String key;
    private final Integer numResultsPerPage;
    private final String podId;
    private final Integer resultCount;
    private final String resultId;
    private final Integer resultPage;
    private final Integer resultPositionOnPage;
    private final int s;
    private final String section;
    private final String strategyId;
    private final String ui;
    private final List<String> us;
    private final String variationId;

    public RecommendationResultClickRequestBody(@g(name = "pod_id") String podId, @g(name = "strategy_id") String strategyId, @g(name = "item_id") String itemId, @g(name = "variation_id") String str, @g(name = "result_id") String str2, @g(name = "num_results_per_page") Integer num, @g(name = "result_page") Integer num2, @g(name = "result_count") Integer num3, @g(name = "result_position_on_page") Integer num4, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int i11, @g(name = "key") String key, @g(name = "ui") String str3, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "beacon") Boolean bool, @g(name = "section") String str4, @g(name = "_dt") Long l10) {
        Intrinsics.j(podId, "podId");
        Intrinsics.j(strategyId, "strategyId");
        Intrinsics.j(itemId, "itemId");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        this.podId = podId;
        this.strategyId = strategyId;
        this.itemId = itemId;
        this.variationId = str;
        this.resultId = str2;
        this.numResultsPerPage = num;
        this.resultPage = num2;
        this.resultCount = num3;
        this.resultPositionOnPage = num4;
        this.c = c10;
        this.i = i10;
        this.s = i11;
        this.key = key;
        this.ui = str3;
        this.us = us2;
        this.analyticsTags = map;
        this.beacon = bool;
        this.section = str4;
        this._dt = l10;
    }

    public static /* synthetic */ RecommendationResultClickRequestBody copy$default(RecommendationResultClickRequestBody recommendationResultClickRequestBody, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, String str7, int i10, String str8, String str9, List list, Map map, Boolean bool, String str10, Long l10, int i11, Object obj) {
        Long l11;
        String str11;
        String str12 = (i11 & 1) != 0 ? recommendationResultClickRequestBody.podId : str;
        String str13 = (i11 & 2) != 0 ? recommendationResultClickRequestBody.strategyId : str2;
        String str14 = (i11 & 4) != 0 ? recommendationResultClickRequestBody.itemId : str3;
        String str15 = (i11 & 8) != 0 ? recommendationResultClickRequestBody.variationId : str4;
        String str16 = (i11 & 16) != 0 ? recommendationResultClickRequestBody.resultId : str5;
        Integer num5 = (i11 & 32) != 0 ? recommendationResultClickRequestBody.numResultsPerPage : num;
        Integer num6 = (i11 & 64) != 0 ? recommendationResultClickRequestBody.resultPage : num2;
        Integer num7 = (i11 & 128) != 0 ? recommendationResultClickRequestBody.resultCount : num3;
        Integer num8 = (i11 & 256) != 0 ? recommendationResultClickRequestBody.resultPositionOnPage : num4;
        String str17 = (i11 & 512) != 0 ? recommendationResultClickRequestBody.c : str6;
        String str18 = (i11 & 1024) != 0 ? recommendationResultClickRequestBody.i : str7;
        int i12 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? recommendationResultClickRequestBody.s : i10;
        String str19 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? recommendationResultClickRequestBody.key : str8;
        String str20 = (i11 & 8192) != 0 ? recommendationResultClickRequestBody.ui : str9;
        String str21 = str12;
        List list2 = (i11 & 16384) != 0 ? recommendationResultClickRequestBody.us : list;
        Map map2 = (i11 & 32768) != 0 ? recommendationResultClickRequestBody.analyticsTags : map;
        Boolean bool2 = (i11 & 65536) != 0 ? recommendationResultClickRequestBody.beacon : bool;
        String str22 = (i11 & 131072) != 0 ? recommendationResultClickRequestBody.section : str10;
        if ((i11 & 262144) != 0) {
            str11 = str22;
            l11 = recommendationResultClickRequestBody._dt;
        } else {
            l11 = l10;
            str11 = str22;
        }
        return recommendationResultClickRequestBody.copy(str21, str13, str14, str15, str16, num5, num6, num7, num8, str17, str18, i12, str19, str20, list2, map2, bool2, str11, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPodId() {
        return this.podId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: component11, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: component12, reason: from getter */
    public final int getS() {
        return this.s;
    }

    /* renamed from: component13, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component14, reason: from getter */
    public final String getUi() {
        return this.ui;
    }

    public final List<String> component15() {
        return this.us;
    }

    public final Map<String, String> component16() {
        return this.analyticsTags;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getBeacon() {
        return this.beacon;
    }

    /* renamed from: component18, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* renamed from: component19, reason: from getter */
    public final Long get_dt() {
        return this._dt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVariationId() {
        return this.variationId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getNumResultsPerPage() {
        return this.numResultsPerPage;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getResultPage() {
        return this.resultPage;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getResultCount() {
        return this.resultCount;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getResultPositionOnPage() {
        return this.resultPositionOnPage;
    }

    public final RecommendationResultClickRequestBody copy(@g(name = "pod_id") String podId, @g(name = "strategy_id") String strategyId, @g(name = "item_id") String itemId, @g(name = "variation_id") String variationId, @g(name = "result_id") String resultId, @g(name = "num_results_per_page") Integer numResultsPerPage, @g(name = "result_page") Integer resultPage, @g(name = "result_count") Integer resultCount, @g(name = "result_position_on_page") Integer resultPositionOnPage, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int s10, @g(name = "key") String key, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "beacon") Boolean beacon, @g(name = "section") String section, @g(name = "_dt") Long _dt) {
        Intrinsics.j(podId, "podId");
        Intrinsics.j(strategyId, "strategyId");
        Intrinsics.j(itemId, "itemId");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        return new RecommendationResultClickRequestBody(podId, strategyId, itemId, variationId, resultId, numResultsPerPage, resultPage, resultCount, resultPositionOnPage, c10, i10, s10, key, ui2, us2, analyticsTags, beacon, section, _dt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationResultClickRequestBody)) {
            return false;
        }
        RecommendationResultClickRequestBody recommendationResultClickRequestBody = (RecommendationResultClickRequestBody) other;
        return Intrinsics.e(this.podId, recommendationResultClickRequestBody.podId) && Intrinsics.e(this.strategyId, recommendationResultClickRequestBody.strategyId) && Intrinsics.e(this.itemId, recommendationResultClickRequestBody.itemId) && Intrinsics.e(this.variationId, recommendationResultClickRequestBody.variationId) && Intrinsics.e(this.resultId, recommendationResultClickRequestBody.resultId) && Intrinsics.e(this.numResultsPerPage, recommendationResultClickRequestBody.numResultsPerPage) && Intrinsics.e(this.resultPage, recommendationResultClickRequestBody.resultPage) && Intrinsics.e(this.resultCount, recommendationResultClickRequestBody.resultCount) && Intrinsics.e(this.resultPositionOnPage, recommendationResultClickRequestBody.resultPositionOnPage) && Intrinsics.e(this.c, recommendationResultClickRequestBody.c) && Intrinsics.e(this.i, recommendationResultClickRequestBody.i) && this.s == recommendationResultClickRequestBody.s && Intrinsics.e(this.key, recommendationResultClickRequestBody.key) && Intrinsics.e(this.ui, recommendationResultClickRequestBody.ui) && Intrinsics.e(this.us, recommendationResultClickRequestBody.us) && Intrinsics.e(this.analyticsTags, recommendationResultClickRequestBody.analyticsTags) && Intrinsics.e(this.beacon, recommendationResultClickRequestBody.beacon) && Intrinsics.e(this.section, recommendationResultClickRequestBody.section) && Intrinsics.e(this._dt, recommendationResultClickRequestBody._dt);
    }

    public int hashCode() {
        int iHashCode = ((((this.podId.hashCode() * 31) + this.strategyId.hashCode()) * 31) + this.itemId.hashCode()) * 31;
        String str = this.variationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resultId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.numResultsPerPage;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.resultPage;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.resultCount;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.resultPositionOnPage;
        int iHashCode7 = (((((((((iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + this.key.hashCode()) * 31;
        String str3 = this.ui;
        int iHashCode8 = (((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.beacon;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.section;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this._dt;
        return iHashCode11 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "RecommendationResultClickRequestBody(podId=" + this.podId + ", strategyId=" + this.strategyId + ", itemId=" + this.itemId + ", variationId=" + this.variationId + ", resultId=" + this.resultId + ", numResultsPerPage=" + this.numResultsPerPage + ", resultPage=" + this.resultPage + ", resultCount=" + this.resultCount + ", resultPositionOnPage=" + this.resultPositionOnPage + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", key=" + this.key + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", beacon=" + this.beacon + ", section=" + this.section + ", _dt=" + this._dt + ")";
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

    public final String getItemId() {
        return this.itemId;
    }

    public final String getKey() {
        return this.key;
    }

    public final Integer getNumResultsPerPage() {
        return this.numResultsPerPage;
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

    public final Integer getResultPositionOnPage() {
        return this.resultPositionOnPage;
    }

    public final int getS() {
        return this.s;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getStrategyId() {
        return this.strategyId;
    }

    public final String getUi() {
        return this.ui;
    }

    public final List<String> getUs() {
        return this.us;
    }

    public final String getVariationId() {
        return this.variationId;
    }

    public final Long get_dt() {
        return this._dt;
    }
}
