package com.meijer.mobile.cart.model.hybris.orders;

import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u008c\u0001\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b!\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001d\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b'\u0010*R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b&\u0010*¨\u0006+"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPrice;", "", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "totalPrice", "billingTime", "totalTax", "subTotal", "deliveryCost", "totalDiscounts", "", "Lcom/meijer/mobile/cart/model/hybris/orders/HybrisPromotionResult;", "appliedProductPromotions", "appliedOrderPromotions", "potentialProductPromotions", "potentialOrderPromotions", "<init>", "(Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "copy", "(Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/meijer/mobile/cart/model/hybris/orders/HybrisOrderPrice;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "i", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "b", "c", "j", "d", "g", "e", "f", "h", "Ljava/util/List;", "()Ljava/util/List;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisOrderPrice {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalPrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice billingTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalTax;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice subTotal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice deliveryCost;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalDiscounts;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPromotionResult> appliedProductPromotions;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPromotionResult> appliedOrderPromotions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPromotionResult> potentialProductPromotions;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPromotionResult> potentialOrderPromotions;

    public HybrisOrderPrice() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final HybrisOrderPrice copy(@g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "billingTime") HybrisPrice billingTime, @g(name = "totalTax") HybrisPrice totalTax, @g(name = "subTotal") HybrisPrice subTotal, @g(name = "deliveryCost") HybrisPrice deliveryCost, @g(name = "totalDiscounts") HybrisPrice totalDiscounts, @g(name = "appliedProductPromotions") List<HybrisPromotionResult> appliedProductPromotions, @g(name = "appliedOrderPromotions") List<HybrisPromotionResult> appliedOrderPromotions, @g(name = "potentialProductPromotions") List<HybrisPromotionResult> potentialProductPromotions, @g(name = "potentialOrderPromotions") List<HybrisPromotionResult> potentialOrderPromotions) {
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(billingTime, "billingTime");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(appliedProductPromotions, "appliedProductPromotions");
        Intrinsics.j(appliedOrderPromotions, "appliedOrderPromotions");
        Intrinsics.j(potentialProductPromotions, "potentialProductPromotions");
        Intrinsics.j(potentialOrderPromotions, "potentialOrderPromotions");
        return new HybrisOrderPrice(totalPrice, billingTime, totalTax, subTotal, deliveryCost, totalDiscounts, appliedProductPromotions, appliedOrderPromotions, potentialProductPromotions, potentialOrderPromotions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisOrderPrice)) {
            return false;
        }
        HybrisOrderPrice hybrisOrderPrice = (HybrisOrderPrice) other;
        return Intrinsics.e(this.totalPrice, hybrisOrderPrice.totalPrice) && Intrinsics.e(this.billingTime, hybrisOrderPrice.billingTime) && Intrinsics.e(this.totalTax, hybrisOrderPrice.totalTax) && Intrinsics.e(this.subTotal, hybrisOrderPrice.subTotal) && Intrinsics.e(this.deliveryCost, hybrisOrderPrice.deliveryCost) && Intrinsics.e(this.totalDiscounts, hybrisOrderPrice.totalDiscounts) && Intrinsics.e(this.appliedProductPromotions, hybrisOrderPrice.appliedProductPromotions) && Intrinsics.e(this.appliedOrderPromotions, hybrisOrderPrice.appliedOrderPromotions) && Intrinsics.e(this.potentialProductPromotions, hybrisOrderPrice.potentialProductPromotions) && Intrinsics.e(this.potentialOrderPromotions, hybrisOrderPrice.potentialOrderPromotions);
    }

    public int hashCode() {
        return (((((((((((((((((this.totalPrice.hashCode() * 31) + this.billingTime.hashCode()) * 31) + this.totalTax.hashCode()) * 31) + this.subTotal.hashCode()) * 31) + this.deliveryCost.hashCode()) * 31) + this.totalDiscounts.hashCode()) * 31) + this.appliedProductPromotions.hashCode()) * 31) + this.appliedOrderPromotions.hashCode()) * 31) + this.potentialProductPromotions.hashCode()) * 31) + this.potentialOrderPromotions.hashCode();
    }

    public String toString() {
        return "HybrisOrderPrice(totalPrice=" + this.totalPrice + ", billingTime=" + this.billingTime + ", totalTax=" + this.totalTax + ", subTotal=" + this.subTotal + ", deliveryCost=" + this.deliveryCost + ", totalDiscounts=" + this.totalDiscounts + ", appliedProductPromotions=" + this.appliedProductPromotions + ", appliedOrderPromotions=" + this.appliedOrderPromotions + ", potentialProductPromotions=" + this.potentialProductPromotions + ", potentialOrderPromotions=" + this.potentialOrderPromotions + ')';
    }

    public HybrisOrderPrice(@g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "billingTime") HybrisPrice billingTime, @g(name = "totalTax") HybrisPrice totalTax, @g(name = "subTotal") HybrisPrice subTotal, @g(name = "deliveryCost") HybrisPrice deliveryCost, @g(name = "totalDiscounts") HybrisPrice totalDiscounts, @g(name = "appliedProductPromotions") List<HybrisPromotionResult> appliedProductPromotions, @g(name = "appliedOrderPromotions") List<HybrisPromotionResult> appliedOrderPromotions, @g(name = "potentialProductPromotions") List<HybrisPromotionResult> potentialProductPromotions, @g(name = "potentialOrderPromotions") List<HybrisPromotionResult> potentialOrderPromotions) {
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(billingTime, "billingTime");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(appliedProductPromotions, "appliedProductPromotions");
        Intrinsics.j(appliedOrderPromotions, "appliedOrderPromotions");
        Intrinsics.j(potentialProductPromotions, "potentialProductPromotions");
        Intrinsics.j(potentialOrderPromotions, "potentialOrderPromotions");
        this.totalPrice = totalPrice;
        this.billingTime = billingTime;
        this.totalTax = totalTax;
        this.subTotal = subTotal;
        this.deliveryCost = deliveryCost;
        this.totalDiscounts = totalDiscounts;
        this.appliedProductPromotions = appliedProductPromotions;
        this.appliedOrderPromotions = appliedOrderPromotions;
        this.potentialProductPromotions = potentialProductPromotions;
        this.potentialOrderPromotions = potentialOrderPromotions;
    }

    public final List<HybrisPromotionResult> a() {
        return this.appliedOrderPromotions;
    }

    public final List<HybrisPromotionResult> b() {
        return this.appliedProductPromotions;
    }

    /* renamed from: c, reason: from getter */
    public final HybrisPrice getBillingTime() {
        return this.billingTime;
    }

    /* renamed from: d, reason: from getter */
    public final HybrisPrice getDeliveryCost() {
        return this.deliveryCost;
    }

    public final List<HybrisPromotionResult> e() {
        return this.potentialOrderPromotions;
    }

    public final List<HybrisPromotionResult> f() {
        return this.potentialProductPromotions;
    }

    /* renamed from: g, reason: from getter */
    public final HybrisPrice getSubTotal() {
        return this.subTotal;
    }

    /* renamed from: h, reason: from getter */
    public final HybrisPrice getTotalDiscounts() {
        return this.totalDiscounts;
    }

    /* renamed from: i, reason: from getter */
    public final HybrisPrice getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: j, reason: from getter */
    public final HybrisPrice getTotalTax() {
        return this.totalTax;
    }

    public /* synthetic */ HybrisOrderPrice(HybrisPrice hybrisPrice, HybrisPrice hybrisPrice2, HybrisPrice hybrisPrice3, HybrisPrice hybrisPrice4, HybrisPrice hybrisPrice5, HybrisPrice hybrisPrice6, List list, List list2, List list3, List list4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice, (i10 & 2) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice2, (i10 & 4) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice3, (i10 & 8) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice4, (i10 & 16) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice5, (i10 & 32) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f92485d, null) : hybrisPrice6, (i10 & 64) != 0 ? CollectionsKt.m() : list, (i10 & 128) != 0 ? CollectionsKt.m() : list2, (i10 & 256) != 0 ? CollectionsKt.m() : list3, (i10 & 512) != 0 ? CollectionsKt.m() : list4);
    }
}
