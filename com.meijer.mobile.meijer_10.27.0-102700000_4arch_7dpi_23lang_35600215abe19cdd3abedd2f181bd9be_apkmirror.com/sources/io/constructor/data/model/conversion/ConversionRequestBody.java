package io.constructor.data.model.conversion;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013\u0012\u0016\b\u0001\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013HÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003Jè\u0001\u0010F\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0016\b\u0003\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\n2\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\u000fHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\t\u0010!R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$¨\u0006M"}, d2 = {"Lio/constructor/data/model/conversion/ConversionRequestBody;", "Ljava/io/Serializable;", "searchTerm", "", "itemID", "variationId", "itemName", "revenue", "conversionType", "isCustomType", "", "displayName", "c", "i", "s", "", "key", "ui", "us", "", "analyticsTags", "", "beacon", "section", "_dt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "()Ljava/lang/String;", "getConversionType", "getDisplayName", "getI", "getItemID", "getItemName", "getKey", "getRevenue", "getS", "()I", "getSearchTerm", "getSection", "getUi", "getUs", "()Ljava/util/List;", "getVariationId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)Lio/constructor/data/model/conversion/ConversionRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ConversionRequestBody implements Serializable {
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String conversionType;
    private final String displayName;
    private final String i;
    private final Boolean isCustomType;
    private final String itemID;
    private final String itemName;
    private final String key;
    private final String revenue;
    private final int s;
    private final String searchTerm;
    private final String section;
    private final String ui;
    private final List<String> us;
    private final String variationId;

    public ConversionRequestBody(@g(name = "search_term") String searchTerm, @g(name = "item_id") String itemID, @g(name = "variation_id") String str, @g(name = "item_name") String itemName, @g(name = "revenue") String revenue, @g(name = "type") String str2, @g(name = "is_custom_type") Boolean bool, @g(name = "display_name") String str3, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int i11, @g(name = "key") String key, @g(name = "ui") String str4, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "beacon") Boolean bool2, @g(name = "section") String str5, @g(name = "_dt") Long l10) {
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(itemID, "itemID");
        Intrinsics.j(itemName, "itemName");
        Intrinsics.j(revenue, "revenue");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        this.searchTerm = searchTerm;
        this.itemID = itemID;
        this.variationId = str;
        this.itemName = itemName;
        this.revenue = revenue;
        this.conversionType = str2;
        this.isCustomType = bool;
        this.displayName = str3;
        this.c = c10;
        this.i = i10;
        this.s = i11;
        this.key = key;
        this.ui = str4;
        this.us = us2;
        this.analyticsTags = map;
        this.beacon = bool2;
        this.section = str5;
        this._dt = l10;
    }

    public static /* synthetic */ ConversionRequestBody copy$default(ConversionRequestBody conversionRequestBody, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, int i10, String str10, String str11, List list, Map map, Boolean bool2, String str12, Long l10, int i11, Object obj) {
        Long l11;
        String str13;
        String str14 = (i11 & 1) != 0 ? conversionRequestBody.searchTerm : str;
        String str15 = (i11 & 2) != 0 ? conversionRequestBody.itemID : str2;
        String str16 = (i11 & 4) != 0 ? conversionRequestBody.variationId : str3;
        String str17 = (i11 & 8) != 0 ? conversionRequestBody.itemName : str4;
        String str18 = (i11 & 16) != 0 ? conversionRequestBody.revenue : str5;
        String str19 = (i11 & 32) != 0 ? conversionRequestBody.conversionType : str6;
        Boolean bool3 = (i11 & 64) != 0 ? conversionRequestBody.isCustomType : bool;
        String str20 = (i11 & 128) != 0 ? conversionRequestBody.displayName : str7;
        String str21 = (i11 & 256) != 0 ? conversionRequestBody.c : str8;
        String str22 = (i11 & 512) != 0 ? conversionRequestBody.i : str9;
        int i12 = (i11 & 1024) != 0 ? conversionRequestBody.s : i10;
        String str23 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? conversionRequestBody.key : str10;
        String str24 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? conversionRequestBody.ui : str11;
        List list2 = (i11 & 8192) != 0 ? conversionRequestBody.us : list;
        String str25 = str14;
        Map map2 = (i11 & 16384) != 0 ? conversionRequestBody.analyticsTags : map;
        Boolean bool4 = (i11 & 32768) != 0 ? conversionRequestBody.beacon : bool2;
        String str26 = (i11 & 65536) != 0 ? conversionRequestBody.section : str12;
        if ((i11 & 131072) != 0) {
            str13 = str26;
            l11 = conversionRequestBody._dt;
        } else {
            l11 = l10;
            str13 = str26;
        }
        return conversionRequestBody.copy(str25, str15, str16, str17, str18, str19, bool3, str20, str21, str22, i12, str23, str24, list2, map2, bool4, str13, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    /* renamed from: component10, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: component11, reason: from getter */
    public final int getS() {
        return this.s;
    }

    /* renamed from: component12, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component13, reason: from getter */
    public final String getUi() {
        return this.ui;
    }

    public final List<String> component14() {
        return this.us;
    }

    public final Map<String, String> component15() {
        return this.analyticsTags;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getBeacon() {
        return this.beacon;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* renamed from: component18, reason: from getter */
    public final Long get_dt() {
        return this._dt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getItemID() {
        return this.itemID;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVariationId() {
        return this.variationId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRevenue() {
        return this.revenue;
    }

    /* renamed from: component6, reason: from getter */
    public final String getConversionType() {
        return this.conversionType;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsCustomType() {
        return this.isCustomType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final ConversionRequestBody copy(@g(name = "search_term") String searchTerm, @g(name = "item_id") String itemID, @g(name = "variation_id") String variationId, @g(name = "item_name") String itemName, @g(name = "revenue") String revenue, @g(name = "type") String conversionType, @g(name = "is_custom_type") Boolean isCustomType, @g(name = "display_name") String displayName, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") int s10, @g(name = "key") String key, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "beacon") Boolean beacon, @g(name = "section") String section, @g(name = "_dt") Long _dt) {
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(itemID, "itemID");
        Intrinsics.j(itemName, "itemName");
        Intrinsics.j(revenue, "revenue");
        Intrinsics.j(c10, "c");
        Intrinsics.j(i10, "i");
        Intrinsics.j(key, "key");
        Intrinsics.j(us2, "us");
        return new ConversionRequestBody(searchTerm, itemID, variationId, itemName, revenue, conversionType, isCustomType, displayName, c10, i10, s10, key, ui2, us2, analyticsTags, beacon, section, _dt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversionRequestBody)) {
            return false;
        }
        ConversionRequestBody conversionRequestBody = (ConversionRequestBody) other;
        return Intrinsics.e(this.searchTerm, conversionRequestBody.searchTerm) && Intrinsics.e(this.itemID, conversionRequestBody.itemID) && Intrinsics.e(this.variationId, conversionRequestBody.variationId) && Intrinsics.e(this.itemName, conversionRequestBody.itemName) && Intrinsics.e(this.revenue, conversionRequestBody.revenue) && Intrinsics.e(this.conversionType, conversionRequestBody.conversionType) && Intrinsics.e(this.isCustomType, conversionRequestBody.isCustomType) && Intrinsics.e(this.displayName, conversionRequestBody.displayName) && Intrinsics.e(this.c, conversionRequestBody.c) && Intrinsics.e(this.i, conversionRequestBody.i) && this.s == conversionRequestBody.s && Intrinsics.e(this.key, conversionRequestBody.key) && Intrinsics.e(this.ui, conversionRequestBody.ui) && Intrinsics.e(this.us, conversionRequestBody.us) && Intrinsics.e(this.analyticsTags, conversionRequestBody.analyticsTags) && Intrinsics.e(this.beacon, conversionRequestBody.beacon) && Intrinsics.e(this.section, conversionRequestBody.section) && Intrinsics.e(this._dt, conversionRequestBody._dt);
    }

    public int hashCode() {
        int iHashCode = ((this.searchTerm.hashCode() * 31) + this.itemID.hashCode()) * 31;
        String str = this.variationId;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.itemName.hashCode()) * 31) + this.revenue.hashCode()) * 31;
        String str2 = this.conversionType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isCustomType;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.displayName;
        int iHashCode5 = (((((((((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.c.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.s)) * 31) + this.key.hashCode()) * 31;
        String str4 = this.ui;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool2 = this.beacon;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.section;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l10 = this._dt;
        return iHashCode9 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "ConversionRequestBody(searchTerm=" + this.searchTerm + ", itemID=" + this.itemID + ", variationId=" + this.variationId + ", itemName=" + this.itemName + ", revenue=" + this.revenue + ", conversionType=" + this.conversionType + ", isCustomType=" + this.isCustomType + ", displayName=" + this.displayName + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", key=" + this.key + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", beacon=" + this.beacon + ", section=" + this.section + ", _dt=" + this._dt + ")";
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

    public final String getConversionType() {
        return this.conversionType;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getI() {
        return this.i;
    }

    public final String getItemID() {
        return this.itemID;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getRevenue() {
        return this.revenue;
    }

    public final int getS() {
        return this.s;
    }

    public final String getSearchTerm() {
        return this.searchTerm;
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

    public final String getVariationId() {
        return this.variationId;
    }

    public final Long get_dt() {
        return this._dt;
    }

    public final Boolean isCustomType() {
        return this.isCustomType;
    }
}
