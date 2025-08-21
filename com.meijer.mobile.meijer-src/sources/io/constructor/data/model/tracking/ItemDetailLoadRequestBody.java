package io.constructor.data.model.tracking;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e\u0012\u0016\b\u0001\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jº\u0001\u0010;\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\nHÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 ¨\u0006B"}, d2 = {"Lio/constructor/data/model/tracking/ItemDetailLoadRequestBody;", "Ljava/io/Serializable;", "itemName", "", "itemId", "variationId", "url", "c", "i", "s", "", "key", "ui", "us", "", "analyticsTags", "", "beacon", "", "section", "_dt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "()Ljava/lang/String;", "getI", "getItemId", "getItemName", "getKey", "getS", "()I", "getSection", "getUi", "getUrl", "getUs", "()Ljava/util/List;", "getVariationId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lio/constructor/data/model/tracking/ItemDetailLoadRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ItemDetailLoadRequestBody implements Serializable {
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String i;
    private final String itemId;
    private final String itemName;
    private final String key;
    private final int s;
    private final String section;
    private final String ui;
    private final String url;
    private final List<String> us;
    private final String variationId;

    /* renamed from: component1, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    public final List<String> component10() {
        return this.us;
    }

    public final Map<String, String> component11() {
        return this.analyticsTags;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getBeacon() {
        return this.beacon;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* renamed from: component14, reason: from getter */
    public final Long get_dt() {
        return this._dt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVariationId() {
        return this.variationId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component5, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: component6, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: component7, reason: from getter */
    public final int getS() {
        return this.s;
    }

    /* renamed from: component8, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUi() {
        return this.ui;
    }

    public final ItemDetailLoadRequestBody copy(@g(name = "item_name") String itemName, @g(name = "item_id") String itemId, @g(name = "variation_id") String variationId, @g(name = "url") String url, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int s10, @g(name = "key") String key, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "beacon") Boolean beacon, @g(name = "section") String section, @g(name = "_dt") Long _dt) {
        Intrinsics.j(itemName, "itemName");
        Intrinsics.j(itemId, "itemId");
        Intrinsics.j(url, "url");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        return new ItemDetailLoadRequestBody(itemName, itemId, variationId, url, c10, i10, s10, key, ui2, us2, analyticsTags, beacon, section, _dt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDetailLoadRequestBody)) {
            return false;
        }
        ItemDetailLoadRequestBody itemDetailLoadRequestBody = (ItemDetailLoadRequestBody) other;
        return Intrinsics.e(this.itemName, itemDetailLoadRequestBody.itemName) && Intrinsics.e(this.itemId, itemDetailLoadRequestBody.itemId) && Intrinsics.e(this.variationId, itemDetailLoadRequestBody.variationId) && Intrinsics.e(this.url, itemDetailLoadRequestBody.url) && Intrinsics.e(this.c, itemDetailLoadRequestBody.c) && Intrinsics.e(this.i, itemDetailLoadRequestBody.i) && this.s == itemDetailLoadRequestBody.s && Intrinsics.e(this.key, itemDetailLoadRequestBody.key) && Intrinsics.e(this.ui, itemDetailLoadRequestBody.ui) && Intrinsics.e(this.us, itemDetailLoadRequestBody.us) && Intrinsics.e(this.analyticsTags, itemDetailLoadRequestBody.analyticsTags) && Intrinsics.e(this.beacon, itemDetailLoadRequestBody.beacon) && Intrinsics.e(this.section, itemDetailLoadRequestBody.section) && Intrinsics.e(this._dt, itemDetailLoadRequestBody._dt);
    }

    public int hashCode() {
        int iHashCode = ((this.itemName.hashCode() * 31) + this.itemId.hashCode()) * 31;
        String str = this.variationId;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.url.hashCode()) * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + this.key.hashCode()) * 31;
        String str2 = this.ui;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.beacon;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.section;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this._dt;
        return iHashCode6 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "ItemDetailLoadRequestBody(itemName=" + this.itemName + ", itemId=" + this.itemId + ", variationId=" + this.variationId + ", url=" + this.url + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", key=" + this.key + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", beacon=" + this.beacon + ", section=" + this.section + ", _dt=" + this._dt + ")";
    }

    public ItemDetailLoadRequestBody(@g(name = "item_name") String itemName, @g(name = "item_id") String itemId, @g(name = "variation_id") String str, @g(name = "url") String url, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int i11, @g(name = "key") String key, @g(name = "ui") String str2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "beacon") Boolean bool, @g(name = "section") String str3, @g(name = "_dt") Long l10) {
        Intrinsics.j(itemName, "itemName");
        Intrinsics.j(itemId, "itemId");
        Intrinsics.j(url, "url");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        this.itemName = itemName;
        this.itemId = itemId;
        this.variationId = str;
        this.url = url;
        this.c = c10;
        this.i = i10;
        this.s = i11;
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

    public final String getItemId() {
        return this.itemId;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final String getKey() {
        return this.key;
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

    public final String getVariationId() {
        return this.variationId;
    }

    public final Long get_dt() {
        return this._dt;
    }
}
