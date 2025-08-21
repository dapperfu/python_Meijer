package io.constructor.data.model.purchase;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0016\b\u0001\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00101\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u00102\u001a\u00020\u0006HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010HÆ\u0003J´\u0001\u0010:\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0016\b\u0003\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00132\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\fHÖ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#¨\u0006A"}, d2 = {"Lio/constructor/data/model/purchase/PurchaseRequestBody;", "Ljava/io/Serializable;", "items", "", "Lio/constructor/data/model/purchase/PurchaseItem;", "orderId", "", "revenue", "", "c", "i", "s", "", "ui", "us", "analyticsTags", "", "key", "beacon", "", "_dt", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "get_dt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnalyticsTags", "()Ljava/util/Map;", "getBeacon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC", "()Ljava/lang/String;", "getI", "getItems", "()Ljava/util/List;", "getKey", "getOrderId", "getRevenue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getS", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUi", "getUs", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lio/constructor/data/model/purchase/PurchaseRequestBody;", "equals", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PurchaseRequestBody implements Serializable {
    private final Long _dt;
    private final Map<String, String> analyticsTags;
    private final Boolean beacon;
    private final String c;
    private final String i;
    private final List<PurchaseItem> items;
    private final String key;
    private final String orderId;
    private final Double revenue;
    private final Integer s;
    private final String ui;
    private final List<String> us;

    public static /* synthetic */ PurchaseRequestBody copy$default(PurchaseRequestBody purchaseRequestBody, List list, String str, Double d10, String str2, String str3, Integer num, String str4, List list2, Map map, String str5, Boolean bool, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = purchaseRequestBody.items;
        }
        if ((i10 & 2) != 0) {
            str = purchaseRequestBody.orderId;
        }
        if ((i10 & 4) != 0) {
            d10 = purchaseRequestBody.revenue;
        }
        if ((i10 & 8) != 0) {
            str2 = purchaseRequestBody.c;
        }
        if ((i10 & 16) != 0) {
            str3 = purchaseRequestBody.i;
        }
        if ((i10 & 32) != 0) {
            num = purchaseRequestBody.s;
        }
        if ((i10 & 64) != 0) {
            str4 = purchaseRequestBody.ui;
        }
        if ((i10 & 128) != 0) {
            list2 = purchaseRequestBody.us;
        }
        if ((i10 & 256) != 0) {
            map = purchaseRequestBody.analyticsTags;
        }
        if ((i10 & 512) != 0) {
            str5 = purchaseRequestBody.key;
        }
        if ((i10 & 1024) != 0) {
            bool = purchaseRequestBody.beacon;
        }
        if ((i10 & RecyclerView.m.FLAG_MOVED) != 0) {
            l10 = purchaseRequestBody._dt;
        }
        Boolean bool2 = bool;
        Long l11 = l10;
        Map map2 = map;
        String str6 = str5;
        String str7 = str4;
        List list3 = list2;
        String str8 = str3;
        Integer num2 = num;
        return purchaseRequestBody.copy(list, str, d10, str2, str8, num2, str7, list3, map2, str6, bool2, l11);
    }

    public final List<PurchaseItem> component1() {
        return this.items;
    }

    /* renamed from: component10, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getBeacon() {
        return this.beacon;
    }

    /* renamed from: component12, reason: from getter */
    public final Long get_dt() {
        return this._dt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getRevenue() {
        return this.revenue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: component5, reason: from getter */
    public final String getI() {
        return this.i;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getS() {
        return this.s;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUi() {
        return this.ui;
    }

    public final List<String> component8() {
        return this.us;
    }

    public final Map<String, String> component9() {
        return this.analyticsTags;
    }

    public final PurchaseRequestBody copy(@g(name = "items") List<PurchaseItem> items, @g(name = NotificationsManager.INTENT_EXTRA_ORDER_ID) String orderId, @g(name = "revenue") Double revenue, @g(name = "c") String c10, @g(name = "i") String i10, @g(name = "s") Integer s10, @g(name = "ui") String ui2, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> analyticsTags, @g(name = "key") String key, @g(name = "beacon") Boolean beacon, @g(name = "_dt") Long _dt) {
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(us2, "us");
        return new PurchaseRequestBody(items, orderId, revenue, c10, i10, s10, ui2, us2, analyticsTags, key, beacon, _dt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseRequestBody)) {
            return false;
        }
        PurchaseRequestBody purchaseRequestBody = (PurchaseRequestBody) other;
        return Intrinsics.e(this.items, purchaseRequestBody.items) && Intrinsics.e(this.orderId, purchaseRequestBody.orderId) && Intrinsics.e(this.revenue, purchaseRequestBody.revenue) && Intrinsics.e(this.c, purchaseRequestBody.c) && Intrinsics.e(this.i, purchaseRequestBody.i) && Intrinsics.e(this.s, purchaseRequestBody.s) && Intrinsics.e(this.ui, purchaseRequestBody.ui) && Intrinsics.e(this.us, purchaseRequestBody.us) && Intrinsics.e(this.analyticsTags, purchaseRequestBody.analyticsTags) && Intrinsics.e(this.key, purchaseRequestBody.key) && Intrinsics.e(this.beacon, purchaseRequestBody.beacon) && Intrinsics.e(this._dt, purchaseRequestBody._dt);
    }

    public int hashCode() {
        List<PurchaseItem> list = this.items;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.orderId.hashCode()) * 31;
        Double d10 = this.revenue;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.s;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.ui;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.us.hashCode()) * 31;
        Map<String, String> map = this.analyticsTags;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.key;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.beacon;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l10 = this._dt;
        return iHashCode9 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseRequestBody(items=" + this.items + ", orderId=" + this.orderId + ", revenue=" + this.revenue + ", c=" + this.c + ", i=" + this.i + ", s=" + this.s + ", ui=" + this.ui + ", us=" + this.us + ", analyticsTags=" + this.analyticsTags + ", key=" + this.key + ", beacon=" + this.beacon + ", _dt=" + this._dt + ")";
    }

    public PurchaseRequestBody(@g(name = "items") List<PurchaseItem> list, @g(name = NotificationsManager.INTENT_EXTRA_ORDER_ID) String orderId, @g(name = "revenue") Double d10, @g(name = "c") String str, @g(name = "i") String str2, @g(name = "s") Integer num, @g(name = "ui") String str3, @g(name = "us") List<String> us2, @g(name = "analytics_tags") Map<String, String> map, @g(name = "key") String str4, @g(name = "beacon") Boolean bool, @g(name = "_dt") Long l10) {
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(us2, "us");
        this.items = list;
        this.orderId = orderId;
        this.revenue = d10;
        this.c = str;
        this.i = str2;
        this.s = num;
        this.ui = str3;
        this.us = us2;
        this.analyticsTags = map;
        this.key = str4;
        this.beacon = bool;
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

    public final List<PurchaseItem> getItems() {
        return this.items;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Double getRevenue() {
        return this.revenue;
    }

    public final Integer getS() {
        return this.s;
    }

    public final String getUi() {
        return this.ui;
    }

    public final List<String> getUs() {
        return this.us;
    }

    public final Long get_dt() {
        return this._dt;
    }
}
