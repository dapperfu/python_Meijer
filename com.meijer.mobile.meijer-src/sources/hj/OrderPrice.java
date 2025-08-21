package hj;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,¨\u00063"}, d2 = {"Lhj/e;", "", "Lnk/b;", "totalPrice", "billingTime", "totalTax", "subTotal", "deliveryCost", "totalDiscounts", "", "Lhj/j;", "appliedProductPromotions", "appliedOrderPromotions", "potentialProductPromotions", "potentialOrderPromotions", "<init>", "(Lnk/b;Lnk/b;Lnk/b;Lnk/b;Lnk/b;Lnk/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/b;", "getTotalPrice", "()Lnk/b;", "b", "getBillingTime", "c", "getTotalTax", "d", "getSubTotal", "e", "getDeliveryCost", "f", "getTotalDiscounts", "g", "Ljava/util/List;", "getAppliedProductPromotions", "()Ljava/util/List;", "h", "getAppliedOrderPromotions", "i", "getPotentialProductPromotions", "j", "getPotentialOrderPromotions", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.e, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class OrderPrice {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b totalPrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b billingTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b totalTax;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b subTotal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b deliveryCost;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b totalDiscounts;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromotionResult> appliedProductPromotions;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromotionResult> appliedOrderPromotions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromotionResult> potentialProductPromotions;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromotionResult> potentialOrderPromotions;

    public OrderPrice() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPrice)) {
            return false;
        }
        OrderPrice orderPrice = (OrderPrice) other;
        return Intrinsics.e(this.totalPrice, orderPrice.totalPrice) && Intrinsics.e(this.billingTime, orderPrice.billingTime) && Intrinsics.e(this.totalTax, orderPrice.totalTax) && Intrinsics.e(this.subTotal, orderPrice.subTotal) && Intrinsics.e(this.deliveryCost, orderPrice.deliveryCost) && Intrinsics.e(this.totalDiscounts, orderPrice.totalDiscounts) && Intrinsics.e(this.appliedProductPromotions, orderPrice.appliedProductPromotions) && Intrinsics.e(this.appliedOrderPromotions, orderPrice.appliedOrderPromotions) && Intrinsics.e(this.potentialProductPromotions, orderPrice.potentialProductPromotions) && Intrinsics.e(this.potentialOrderPromotions, orderPrice.potentialOrderPromotions);
    }

    public OrderPrice(nk.b totalPrice, nk.b billingTime, nk.b totalTax, nk.b subTotal, nk.b deliveryCost, nk.b totalDiscounts, List<PromotionResult> appliedProductPromotions, List<PromotionResult> appliedOrderPromotions, List<PromotionResult> potentialProductPromotions, List<PromotionResult> potentialOrderPromotions) {
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

    public int hashCode() {
        return (((((((((((((((((this.totalPrice.hashCode() * 31) + this.billingTime.hashCode()) * 31) + this.totalTax.hashCode()) * 31) + this.subTotal.hashCode()) * 31) + this.deliveryCost.hashCode()) * 31) + this.totalDiscounts.hashCode()) * 31) + this.appliedProductPromotions.hashCode()) * 31) + this.appliedOrderPromotions.hashCode()) * 31) + this.potentialProductPromotions.hashCode()) * 31) + this.potentialOrderPromotions.hashCode();
    }

    public String toString() {
        return "OrderPrice(totalPrice=" + this.totalPrice + ", billingTime=" + this.billingTime + ", totalTax=" + this.totalTax + ", subTotal=" + this.subTotal + ", deliveryCost=" + this.deliveryCost + ", totalDiscounts=" + this.totalDiscounts + ", appliedProductPromotions=" + this.appliedProductPromotions + ", appliedOrderPromotions=" + this.appliedOrderPromotions + ", potentialProductPromotions=" + this.potentialProductPromotions + ", potentialOrderPromotions=" + this.potentialOrderPromotions + ')';
    }

    public /* synthetic */ OrderPrice(nk.b bVar, nk.b bVar2, nk.b bVar3, nk.b bVar4, nk.b bVar5, nk.b bVar6, List list, List list2, List list3, List list4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar, (i10 & 2) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar2, (i10 & 4) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar3, (i10 & 8) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar4, (i10 & 16) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar5, (i10 & 32) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar6, (i10 & 64) != 0 ? CollectionsKt.m() : list, (i10 & 128) != 0 ? CollectionsKt.m() : list2, (i10 & 256) != 0 ? CollectionsKt.m() : list3, (i10 & 512) != 0 ? CollectionsKt.m() : list4);
    }
}
