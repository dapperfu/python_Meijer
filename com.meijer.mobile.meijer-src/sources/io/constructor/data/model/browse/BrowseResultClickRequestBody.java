package io.constructor.data.model.browse;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f\u0012\u0016\b\u0001\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003JÐ\u0001\u0010A\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f2\u0016\b\u0003\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00132\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\bHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"¨\u0006H"}, d2 = {"Lio/constructor/data/model/browse/BrowseResultClickRequestBody;", "Ljava/io/Serializable;", "filterName", "", "filterValue", "item_id", "variation_id", "resultPositionOnPage", "", "c", "i", "s", "key", "ui", "us", "", "analyticsTags", "", "beacon", "", "section", "_dt", "", "resultId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "()Ljava/lang/String;", "getFilterName", "getFilterValue", "getI", "getItem_id", "getKey", "getResultId", "getResultPositionOnPage", "()I", "getS", "getSection", "getUi", "getUs", "()Ljava/util/List;", "getVariation_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lio/constructor/data/model/browse/BrowseResultClickRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BrowseResultClickRequestBody implements Serializable {
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String filterName;
    private final String filterValue;
    private final String i;
    private final String item_id;
    private final String key;
    private final String resultId;
    private final int resultPositionOnPage;
    private final int s;
    private final String section;
    private final String ui;
    private final List<String> us;
    private final String variation_id;

    /* renamed from: component1, reason: from getter */
    public final String getFilterName() {
        return this.filterName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUi() {
        return this.ui;
    }

    public final List<String> component11() {
        return this.us;
    }

    public final Map<String, String> component12() {
        return this.analyticsTags;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getBeacon() {
        return this.beacon;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* renamed from: component15, reason: from getter */
    public final Long get_dt() {
        return this._dt;
    }

    /* renamed from: component16, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFilterValue() {
        return this.filterValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getItem_id() {
        return this.item_id;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVariation_id() {
        return this.variation_id;
    }

    /* renamed from: component5, reason: from getter */
    public final int getResultPositionOnPage() {
        return this.resultPositionOnPage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: component7, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: component8, reason: from getter */
    public final int getS() {
        return this.s;
    }

    /* renamed from: component9, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final BrowseResultClickRequestBody copy(@g(name = "filter_name") String filterName, @g(name = "filter_value") String filterValue, @g(name = "item_id") String item_id, @g(name = "variation_id") String variation_id, @g(name = "result_position_on_page") int resultPositionOnPage, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int s10, @g(name = "key") String key, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "beacon") Boolean beacon, @g(name = "section") String section, @g(name = "_dt") Long _dt, @g(name = "result_id") String resultId) {
        Intrinsics.j(filterName, "filterName");
        Intrinsics.j(filterValue, "filterValue");
        Intrinsics.j(item_id, "item_id");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        return new BrowseResultClickRequestBody(filterName, filterValue, item_id, variation_id, resultPositionOnPage, c10, i10, s10, key, ui2, us2, analyticsTags, beacon, section, _dt, resultId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowseResultClickRequestBody)) {
            return false;
        }
        BrowseResultClickRequestBody browseResultClickRequestBody = (BrowseResultClickRequestBody) other;
        return Intrinsics.e(this.filterName, browseResultClickRequestBody.filterName) && Intrinsics.e(this.filterValue, browseResultClickRequestBody.filterValue) && Intrinsics.e(this.item_id, browseResultClickRequestBody.item_id) && Intrinsics.e(this.variation_id, browseResultClickRequestBody.variation_id) && this.resultPositionOnPage == browseResultClickRequestBody.resultPositionOnPage && Intrinsics.e(this.c, browseResultClickRequestBody.c) && Intrinsics.e(this.i, browseResultClickRequestBody.i) && this.s == browseResultClickRequestBody.s && Intrinsics.e(this.key, browseResultClickRequestBody.key) && Intrinsics.e(this.ui, browseResultClickRequestBody.ui) && Intrinsics.e(this.us, browseResultClickRequestBody.us) && Intrinsics.e(this.analyticsTags, browseResultClickRequestBody.analyticsTags) && Intrinsics.e(this.beacon, browseResultClickRequestBody.beacon) && Intrinsics.e(this.section, browseResultClickRequestBody.section) && Intrinsics.e(this._dt, browseResultClickRequestBody._dt) && Intrinsics.e(this.resultId, browseResultClickRequestBody.resultId);
    }

    public int hashCode() {
        int iHashCode = ((((this.filterName.hashCode() * 31) + this.filterValue.hashCode()) * 31) + this.item_id.hashCode()) * 31;
        String str = this.variation_id;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.resultPositionOnPage)) * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + this.key.hashCode()) * 31;
        String str2 = this.ui;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.beacon;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.section;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this._dt;
        int iHashCode7 = (iHashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str4 = this.resultId;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "BrowseResultClickRequestBody(filterName=" + this.filterName + ", filterValue=" + this.filterValue + ", item_id=" + this.item_id + ", variation_id=" + this.variation_id + ", resultPositionOnPage=" + this.resultPositionOnPage + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", key=" + this.key + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", beacon=" + this.beacon + ", section=" + this.section + ", _dt=" + this._dt + ", resultId=" + this.resultId + ")";
    }

    public BrowseResultClickRequestBody(@g(name = "filter_name") String filterName, @g(name = "filter_value") String filterValue, @g(name = "item_id") String item_id, @g(name = "variation_id") String str, @g(name = "result_position_on_page") int i10, @g(name = "c") String c10, @g(name = "i") String i11, @g(name = "s") int i12, @g(name = "key") String key, @g(name = "ui") String str2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "beacon") Boolean bool, @g(name = "section") String str3, @g(name = "_dt") Long l10, @g(name = "result_id") String str4) {
        Intrinsics.j(filterName, "filterName");
        Intrinsics.j(filterValue, "filterValue");
        Intrinsics.j(item_id, "item_id");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i11, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        this.filterName = filterName;
        this.filterValue = filterValue;
        this.item_id = item_id;
        this.variation_id = str;
        this.resultPositionOnPage = i10;
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
        this.resultId = str4;
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

    public final String getFilterName() {
        return this.filterName;
    }

    public final String getFilterValue() {
        return this.filterValue;
    }

    public final String getI() {
        return this.i;
    }

    public final String getItem_id() {
        return this.item_id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getResultId() {
        return this.resultId;
    }

    public final int getResultPositionOnPage() {
        return this.resultPositionOnPage;
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

    public final List<String> getUs() {
        return this.us;
    }

    public final String getVariation_id() {
        return this.variation_id;
    }

    public final Long get_dt() {
        return this._dt;
    }
}
