package Pl;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006$"}, d2 = {"LPl/a;", "", "", "cartWasTotal", "cartNowTotal", "cartSavingsTotal", "cartRewardTotal", "cartTaxTotal", "cartTmdDiscount", "cartDepositTotal", "cartTotalWithTax", "<init>", "(DDDDDDDD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "e", "()D", "b", "c", "d", "getCartRewardTotal", "f", "getCartTmdDiscount", "g", "getCartDepositTotal", "h", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pl.a, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class CartTotals {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartWasTotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartNowTotal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartSavingsTotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartRewardTotal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartTaxTotal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartTmdDiscount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartDepositTotal;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartTotalWithTax;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartTotals)) {
            return false;
        }
        CartTotals cartTotals = (CartTotals) other;
        return Double.compare(this.cartWasTotal, cartTotals.cartWasTotal) == 0 && Double.compare(this.cartNowTotal, cartTotals.cartNowTotal) == 0 && Double.compare(this.cartSavingsTotal, cartTotals.cartSavingsTotal) == 0 && Double.compare(this.cartRewardTotal, cartTotals.cartRewardTotal) == 0 && Double.compare(this.cartTaxTotal, cartTotals.cartTaxTotal) == 0 && Double.compare(this.cartTmdDiscount, cartTotals.cartTmdDiscount) == 0 && Double.compare(this.cartDepositTotal, cartTotals.cartDepositTotal) == 0 && Double.compare(this.cartTotalWithTax, cartTotals.cartTotalWithTax) == 0;
    }

    /* renamed from: a, reason: from getter */
    public final double getCartNowTotal() {
        return this.cartNowTotal;
    }

    /* renamed from: b, reason: from getter */
    public final double getCartSavingsTotal() {
        return this.cartSavingsTotal;
    }

    /* renamed from: c, reason: from getter */
    public final double getCartTaxTotal() {
        return this.cartTaxTotal;
    }

    /* renamed from: d, reason: from getter */
    public final double getCartTotalWithTax() {
        return this.cartTotalWithTax;
    }

    /* renamed from: e, reason: from getter */
    public final double getCartWasTotal() {
        return this.cartWasTotal;
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.cartWasTotal) * 31) + Double.hashCode(this.cartNowTotal)) * 31) + Double.hashCode(this.cartSavingsTotal)) * 31) + Double.hashCode(this.cartRewardTotal)) * 31) + Double.hashCode(this.cartTaxTotal)) * 31) + Double.hashCode(this.cartTmdDiscount)) * 31) + Double.hashCode(this.cartDepositTotal)) * 31) + Double.hashCode(this.cartTotalWithTax);
    }

    public String toString() {
        return "CartTotals(cartWasTotal=" + this.cartWasTotal + ", cartNowTotal=" + this.cartNowTotal + ", cartSavingsTotal=" + this.cartSavingsTotal + ", cartRewardTotal=" + this.cartRewardTotal + ", cartTaxTotal=" + this.cartTaxTotal + ", cartTmdDiscount=" + this.cartTmdDiscount + ", cartDepositTotal=" + this.cartDepositTotal + ", cartTotalWithTax=" + this.cartTotalWithTax + ')';
    }

    public CartTotals(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.cartWasTotal = d10;
        this.cartNowTotal = d11;
        this.cartSavingsTotal = d12;
        this.cartRewardTotal = d13;
        this.cartTaxTotal = d14;
        this.cartTmdDiscount = d15;
        this.cartDepositTotal = d16;
        this.cartTotalWithTax = d17;
    }
}
