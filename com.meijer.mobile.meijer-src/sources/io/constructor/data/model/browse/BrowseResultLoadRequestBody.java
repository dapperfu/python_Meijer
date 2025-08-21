package io.constructor.data.model.browse;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.model.common.TrackingItem;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003JÊ\u0001\u0010?\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\t2\b\b\u0003\u0010\u000e\u001a\u00020\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00142\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\tHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'¨\u0006F"}, d2 = {"Lio/constructor/data/model/browse/BrowseResultLoadRequestBody;", "Ljava/io/Serializable;", "filterName", "", "filterValue", "items", "", "Lio/constructor/data/model/common/TrackingItem;", "resultCount", "", "url", "c", "i", "s", "key", "ui", "us", "analyticsTags", "", "beacon", "", "section", "_dt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "()Ljava/lang/String;", "getFilterName", "getFilterValue", "getI", "getItems", "()Ljava/util/List;", "getKey", "getResultCount", "()I", "getS", "getSection", "getUi", "getUrl", "getUs", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lio/constructor/data/model/browse/BrowseResultLoadRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BrowseResultLoadRequestBody implements Serializable {
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String filterName;
    private final String filterValue;
    private final String i;
    private final List<TrackingItem> items;
    private final String key;
    private final int resultCount;
    private final int s;
    private final String section;
    private final String ui;
    private final String url;
    private final List<String> us;

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

    /* renamed from: component2, reason: from getter */
    public final String getFilterValue() {
        return this.filterValue;
    }

    public final List<TrackingItem> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final int getResultCount() {
        return this.resultCount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
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

    public final BrowseResultLoadRequestBody copy(@g(name = "filter_name") String filterName, @g(name = "filter_value") String filterValue, @g(name = "items") List<TrackingItem> items, @g(name = "result_count") int resultCount, @g(name = "url") String url, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int s10, @g(name = "key") String key, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "beacon") Boolean beacon, @g(name = "section") String section, @g(name = "_dt") Long _dt) {
        Intrinsics.j(filterName, "filterName");
        Intrinsics.j(filterValue, "filterValue");
        Intrinsics.j(url, "url");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        return new BrowseResultLoadRequestBody(filterName, filterValue, items, resultCount, url, c10, i10, s10, key, ui2, us2, analyticsTags, beacon, section, _dt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowseResultLoadRequestBody)) {
            return false;
        }
        BrowseResultLoadRequestBody browseResultLoadRequestBody = (BrowseResultLoadRequestBody) other;
        return Intrinsics.e(this.filterName, browseResultLoadRequestBody.filterName) && Intrinsics.e(this.filterValue, browseResultLoadRequestBody.filterValue) && Intrinsics.e(this.items, browseResultLoadRequestBody.items) && this.resultCount == browseResultLoadRequestBody.resultCount && Intrinsics.e(this.url, browseResultLoadRequestBody.url) && Intrinsics.e(this.c, browseResultLoadRequestBody.c) && Intrinsics.e(this.i, browseResultLoadRequestBody.i) && this.s == browseResultLoadRequestBody.s && Intrinsics.e(this.key, browseResultLoadRequestBody.key) && Intrinsics.e(this.ui, browseResultLoadRequestBody.ui) && Intrinsics.e(this.us, browseResultLoadRequestBody.us) && Intrinsics.e(this.analyticsTags, browseResultLoadRequestBody.analyticsTags) && Intrinsics.e(this.beacon, browseResultLoadRequestBody.beacon) && Intrinsics.e(this.section, browseResultLoadRequestBody.section) && Intrinsics.e(this._dt, browseResultLoadRequestBody._dt);
    }

    public int hashCode() {
        int iHashCode = ((this.filterName.hashCode() * 31) + this.filterValue.hashCode()) * 31;
        List<TrackingItem> list = this.items;
        int iHashCode2 = (((((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.resultCount)) * 31) + this.url.hashCode()) * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + this.key.hashCode()) * 31;
        String str = this.ui;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.beacon;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.section;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this._dt;
        return iHashCode6 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "BrowseResultLoadRequestBody(filterName=" + this.filterName + ", filterValue=" + this.filterValue + ", items=" + this.items + ", resultCount=" + this.resultCount + ", url=" + this.url + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", key=" + this.key + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", beacon=" + this.beacon + ", section=" + this.section + ", _dt=" + this._dt + ")";
    }

    public BrowseResultLoadRequestBody(@g(name = "filter_name") String filterName, @g(name = "filter_value") String filterValue, @g(name = "items") List<TrackingItem> list, @g(name = "result_count") int i10, @g(name = "url") String url, @g(name = "c") String c10, @g(name = "i") String i11, @g(name = "s") int i12, @g(name = "key") String key, @g(name = "ui") String str, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "beacon") Boolean bool, @g(name = "section") String str2, @g(name = "_dt") Long l10) {
        Intrinsics.j(filterName, "filterName");
        Intrinsics.j(filterValue, "filterValue");
        Intrinsics.j(url, "url");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i11, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        this.filterName = filterName;
        this.filterValue = filterValue;
        this.items = list;
        this.resultCount = i10;
        this.url = url;
        this.c = c10;
        this.i = i11;
        this.s = i12;
        this.key = key;
        this.ui = str;
        this.us = us2;
        this.analyticsTags = map;
        this.beacon = bool;
        this.section = str2;
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

    public final String getFilterName() {
        return this.filterName;
    }

    public final String getFilterValue() {
        return this.filterValue;
    }

    public final String getI() {
        return this.i;
    }

    public final List<TrackingItem> getItems() {
        return this.items;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getResultCount() {
        return this.resultCount;
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
