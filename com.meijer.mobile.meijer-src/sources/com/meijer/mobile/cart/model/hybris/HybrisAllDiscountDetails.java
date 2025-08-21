package com.meijer.mobile.cart.model.hybris;

import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisSavings;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisAllDiscountDetails;", "", "", "Lcom/meijer/mobile/cart/model/hybris/PromoDiscountJson;", "discounts", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "totalSavings", "<init>", "(Ljava/util/List;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;)V", "copy", "(Ljava/util/List;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;)Lcom/meijer/mobile/cart/model/hybris/HybrisAllDiscountDetails;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisAllDiscountDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromoDiscountJson> discounts;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisSavings totalSavings;

    /* JADX WARN: Multi-variable type inference failed */
    public HybrisAllDiscountDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final HybrisAllDiscountDetails copy(@g(name = "discounts") List<PromoDiscountJson> discounts, @g(name = "totalSavings") HybrisSavings totalSavings) {
        Intrinsics.j(discounts, "discounts");
        Intrinsics.j(totalSavings, "totalSavings");
        return new HybrisAllDiscountDetails(discounts, totalSavings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisAllDiscountDetails)) {
            return false;
        }
        HybrisAllDiscountDetails hybrisAllDiscountDetails = (HybrisAllDiscountDetails) other;
        return Intrinsics.e(this.discounts, hybrisAllDiscountDetails.discounts) && Intrinsics.e(this.totalSavings, hybrisAllDiscountDetails.totalSavings);
    }

    public int hashCode() {
        return (this.discounts.hashCode() * 31) + this.totalSavings.hashCode();
    }

    public String toString() {
        return "HybrisAllDiscountDetails(discounts=" + this.discounts + ", totalSavings=" + this.totalSavings + ')';
    }

    public HybrisAllDiscountDetails(@g(name = "discounts") List<PromoDiscountJson> discounts, @g(name = "totalSavings") HybrisSavings totalSavings) {
        Intrinsics.j(discounts, "discounts");
        Intrinsics.j(totalSavings, "totalSavings");
        this.discounts = discounts;
        this.totalSavings = totalSavings;
    }

    public final List<PromoDiscountJson> a() {
        return this.discounts;
    }

    /* renamed from: b, reason: from getter */
    public final HybrisSavings getTotalSavings() {
        return this.totalSavings;
    }

    public /* synthetic */ HybrisAllDiscountDetails(List list, HybrisSavings hybrisSavings, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? new HybrisSavings(null, 0.0d, 3, null) : hybrisSavings);
    }
}
