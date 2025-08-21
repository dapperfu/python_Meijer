package com.meijer.mobile.cart.model.hybris.orders;

import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionResult;", "", "", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionOrderEntryConsumed;", "consumedEntries", "", "description", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotion;", FlybuyPushData.MESSAGE_TYPE_PROMOTION, "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotion;)V", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotion;)Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionResult;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotion;", "()Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotion;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisPromotionResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPromotionOrderEntryConsumed> consumedEntries;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPromotion promotion;

    public HybrisPromotionResult() {
        this(null, null, null, 7, null);
    }

    public final HybrisPromotionResult copy(@g(name = "consumedEntries") List<HybrisPromotionOrderEntryConsumed> consumedEntries, @g(name = "description") String description, @g(name = FlybuyPushData.MESSAGE_TYPE_PROMOTION) HybrisPromotion promotion) {
        return new HybrisPromotionResult(consumedEntries, description, promotion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPromotionResult)) {
            return false;
        }
        HybrisPromotionResult hybrisPromotionResult = (HybrisPromotionResult) other;
        return Intrinsics.e(this.consumedEntries, hybrisPromotionResult.consumedEntries) && Intrinsics.e(this.description, hybrisPromotionResult.description) && Intrinsics.e(this.promotion, hybrisPromotionResult.promotion);
    }

    public int hashCode() {
        List<HybrisPromotionOrderEntryConsumed> list = this.consumedEntries;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        HybrisPromotion hybrisPromotion = this.promotion;
        return iHashCode2 + (hybrisPromotion != null ? hybrisPromotion.hashCode() : 0);
    }

    public String toString() {
        return "HybrisPromotionResult(consumedEntries=" + this.consumedEntries + ", description=" + this.description + ", promotion=" + this.promotion + ')';
    }

    public HybrisPromotionResult(@g(name = "consumedEntries") List<HybrisPromotionOrderEntryConsumed> list, @g(name = "description") String str, @g(name = FlybuyPushData.MESSAGE_TYPE_PROMOTION) HybrisPromotion hybrisPromotion) {
        this.consumedEntries = list;
        this.description = str;
        this.promotion = hybrisPromotion;
    }

    public final List<HybrisPromotionOrderEntryConsumed> a() {
        return this.consumedEntries;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final HybrisPromotion getPromotion() {
        return this.promotion;
    }

    public /* synthetic */ HybrisPromotionResult(List list, String str, HybrisPromotion hybrisPromotion, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : hybrisPromotion);
    }
}
