package com.meijer.mobile.cart.model.hybris.orders;

import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.product.model.hybris.api.models.HybrisImage;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J¶\u0001\u0010\u0018\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\b\b\u0003\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u001bR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b&\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b*\u0010\u001bR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b+\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b2\u0010\u001bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b6\u0010\u001bR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b7\u0010\u001b¨\u00068"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotion;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "", "couldFireMessages", "description", "", "enabled", "endDate", "firedMessages", "", "priority", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;", "productBanner", "promotionGroup", "promotionType", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionRestriction;", "restrictions", "startDate", "title", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ILcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionRestriction;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ILcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionRestriction;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotion;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "Z", "()Z", "e", "f", "g", "I", "h", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;", "()Lcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;", "i", "j", "k", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionRestriction;", "()Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionRestriction;", "l", "m", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisPromotion {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> couldFireMessages;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> firedMessages;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int priority;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisImage productBanner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promotionGroup;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promotionType;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPromotionRestriction restrictions;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startDate;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public HybrisPromotion() {
        this(null, null, null, false, null, null, 0, null, null, null, null, null, null, 8191, null);
    }

    public final HybrisPromotion copy(@g(name = "code") String code, @g(name = "couldFireMessages") List<String> couldFireMessages, @g(name = "description") String description, @g(name = "enabled") boolean enabled, @g(name = "endDate") String endDate, @g(name = "firedMessages") List<String> firedMessages, @g(name = "priority") int priority, @g(name = "productBanner") HybrisImage productBanner, @g(name = "promotionGroup") String promotionGroup, @g(name = "promotionType") String promotionType, @g(name = "restrictions") HybrisPromotionRestriction restrictions, @g(name = "startDate") String startDate, @g(name = "title") String title) {
        Intrinsics.j(code, "code");
        return new HybrisPromotion(code, couldFireMessages, description, enabled, endDate, firedMessages, priority, productBanner, promotionGroup, promotionType, restrictions, startDate, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPromotion)) {
            return false;
        }
        HybrisPromotion hybrisPromotion = (HybrisPromotion) other;
        return Intrinsics.e(this.code, hybrisPromotion.code) && Intrinsics.e(this.couldFireMessages, hybrisPromotion.couldFireMessages) && Intrinsics.e(this.description, hybrisPromotion.description) && this.enabled == hybrisPromotion.enabled && Intrinsics.e(this.endDate, hybrisPromotion.endDate) && Intrinsics.e(this.firedMessages, hybrisPromotion.firedMessages) && this.priority == hybrisPromotion.priority && Intrinsics.e(this.productBanner, hybrisPromotion.productBanner) && Intrinsics.e(this.promotionGroup, hybrisPromotion.promotionGroup) && Intrinsics.e(this.promotionType, hybrisPromotion.promotionType) && Intrinsics.e(this.restrictions, hybrisPromotion.restrictions) && Intrinsics.e(this.startDate, hybrisPromotion.startDate) && Intrinsics.e(this.title, hybrisPromotion.title);
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        List<String> list = this.couldFireMessages;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.description;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str2 = this.endDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list2 = this.firedMessages;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.priority)) * 31;
        HybrisImage hybrisImage = this.productBanner;
        int iHashCode6 = (iHashCode5 + (hybrisImage == null ? 0 : hybrisImage.hashCode())) * 31;
        String str3 = this.promotionGroup;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promotionType;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        HybrisPromotionRestriction hybrisPromotionRestriction = this.restrictions;
        int iHashCode9 = (iHashCode8 + (hybrisPromotionRestriction == null ? 0 : hybrisPromotionRestriction.hashCode())) * 31;
        String str5 = this.startDate;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "HybrisPromotion(code=" + this.code + ", couldFireMessages=" + this.couldFireMessages + ", description=" + this.description + ", enabled=" + this.enabled + ", endDate=" + this.endDate + ", firedMessages=" + this.firedMessages + ", priority=" + this.priority + ", productBanner=" + this.productBanner + ", promotionGroup=" + this.promotionGroup + ", promotionType=" + this.promotionType + ", restrictions=" + this.restrictions + ", startDate=" + this.startDate + ", title=" + this.title + ')';
    }

    public HybrisPromotion(@g(name = "code") String code, @g(name = "couldFireMessages") List<String> list, @g(name = "description") String str, @g(name = "enabled") boolean z10, @g(name = "endDate") String str2, @g(name = "firedMessages") List<String> list2, @g(name = "priority") int i10, @g(name = "productBanner") HybrisImage hybrisImage, @g(name = "promotionGroup") String str3, @g(name = "promotionType") String str4, @g(name = "restrictions") HybrisPromotionRestriction hybrisPromotionRestriction, @g(name = "startDate") String str5, @g(name = "title") String str6) {
        Intrinsics.j(code, "code");
        this.code = code;
        this.couldFireMessages = list;
        this.description = str;
        this.enabled = z10;
        this.endDate = str2;
        this.firedMessages = list2;
        this.priority = i10;
        this.productBanner = hybrisImage;
        this.promotionGroup = str3;
        this.promotionType = str4;
        this.restrictions = hybrisPromotionRestriction;
        this.startDate = str5;
        this.title = str6;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final List<String> b() {
        return this.couldFireMessages;
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: e, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final List<String> f() {
        return this.firedMessages;
    }

    /* renamed from: g, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: h, reason: from getter */
    public final HybrisImage getProductBanner() {
        return this.productBanner;
    }

    /* renamed from: i, reason: from getter */
    public final String getPromotionGroup() {
        return this.promotionGroup;
    }

    /* renamed from: j, reason: from getter */
    public final String getPromotionType() {
        return this.promotionType;
    }

    /* renamed from: k, reason: from getter */
    public final HybrisPromotionRestriction getRestrictions() {
        return this.restrictions;
    }

    /* renamed from: l, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ HybrisPromotion(String str, List list, String str2, boolean z10, String str3, List list2, int i10, HybrisImage hybrisImage, String str4, String str5, HybrisPromotionRestriction hybrisPromotionRestriction, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "-1" : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : list2, (i11 & 64) == 0 ? i10 : 0, (i11 & 128) != 0 ? null : hybrisImage, (i11 & 256) != 0 ? null : str4, (i11 & 512) != 0 ? null : str5, (i11 & 1024) != 0 ? null : hybrisPromotionRestriction, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str6, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str7);
    }
}
