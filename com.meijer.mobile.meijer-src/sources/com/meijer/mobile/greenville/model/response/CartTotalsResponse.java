package com.meijer.mobile.greenville.model.response;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJV\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b \u0010\u001b¨\u0006!"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/CartTotalsResponse;", "", "", "cartWasTotal", "cartNowTotal", "cartSavingsTotal", "cartRewardTotal", "cartTmdDiscount", "cartDepositTotal", "cartTotalWithTax", "<init>", "(DDDDDDD)V", "copy", "(DDDDDDD)Lcom/meijer/mobile/greenville/model/response/CartTotalsResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "g", "()D", "b", "c", "d", "e", "f", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CartTotalsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartWasTotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartNowTotal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartSavingsTotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartRewardTotal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartTmdDiscount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartDepositTotal;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double cartTotalWithTax;

    public final CartTotalsResponse copy(@g(name = "cartWasTotal") double cartWasTotal, @g(name = "cartNowTotal") double cartNowTotal, @g(name = "cartSavingsTotal") double cartSavingsTotal, @g(name = "cartRewardTotal") double cartRewardTotal, @g(name = "cartTmdDiscount") double cartTmdDiscount, @g(name = "depositTotal") double cartDepositTotal, @g(name = "basketTotalWithTax") double cartTotalWithTax) {
        return new CartTotalsResponse(cartWasTotal, cartNowTotal, cartSavingsTotal, cartRewardTotal, cartTmdDiscount, cartDepositTotal, cartTotalWithTax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartTotalsResponse)) {
            return false;
        }
        CartTotalsResponse cartTotalsResponse = (CartTotalsResponse) other;
        return Double.compare(this.cartWasTotal, cartTotalsResponse.cartWasTotal) == 0 && Double.compare(this.cartNowTotal, cartTotalsResponse.cartNowTotal) == 0 && Double.compare(this.cartSavingsTotal, cartTotalsResponse.cartSavingsTotal) == 0 && Double.compare(this.cartRewardTotal, cartTotalsResponse.cartRewardTotal) == 0 && Double.compare(this.cartTmdDiscount, cartTotalsResponse.cartTmdDiscount) == 0 && Double.compare(this.cartDepositTotal, cartTotalsResponse.cartDepositTotal) == 0 && Double.compare(this.cartTotalWithTax, cartTotalsResponse.cartTotalWithTax) == 0;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.cartWasTotal) * 31) + Double.hashCode(this.cartNowTotal)) * 31) + Double.hashCode(this.cartSavingsTotal)) * 31) + Double.hashCode(this.cartRewardTotal)) * 31) + Double.hashCode(this.cartTmdDiscount)) * 31) + Double.hashCode(this.cartDepositTotal)) * 31) + Double.hashCode(this.cartTotalWithTax);
    }

    public String toString() {
        return "CartTotalsResponse(cartWasTotal=" + this.cartWasTotal + ", cartNowTotal=" + this.cartNowTotal + ", cartSavingsTotal=" + this.cartSavingsTotal + ", cartRewardTotal=" + this.cartRewardTotal + ", cartTmdDiscount=" + this.cartTmdDiscount + ", cartDepositTotal=" + this.cartDepositTotal + ", cartTotalWithTax=" + this.cartTotalWithTax + ')';
    }

    /* renamed from: a, reason: from getter */
    public final double getCartDepositTotal() {
        return this.cartDepositTotal;
    }

    /* renamed from: b, reason: from getter */
    public final double getCartNowTotal() {
        return this.cartNowTotal;
    }

    /* renamed from: c, reason: from getter */
    public final double getCartRewardTotal() {
        return this.cartRewardTotal;
    }

    /* renamed from: d, reason: from getter */
    public final double getCartSavingsTotal() {
        return this.cartSavingsTotal;
    }

    /* renamed from: e, reason: from getter */
    public final double getCartTmdDiscount() {
        return this.cartTmdDiscount;
    }

    /* renamed from: f, reason: from getter */
    public final double getCartTotalWithTax() {
        return this.cartTotalWithTax;
    }

    /* renamed from: g, reason: from getter */
    public final double getCartWasTotal() {
        return this.cartWasTotal;
    }

    public CartTotalsResponse(@g(name = "cartWasTotal") double d10, @g(name = "cartNowTotal") double d11, @g(name = "cartSavingsTotal") double d12, @g(name = "cartRewardTotal") double d13, @g(name = "cartTmdDiscount") double d14, @g(name = "depositTotal") double d15, @g(name = "basketTotalWithTax") double d16) {
        this.cartWasTotal = d10;
        this.cartNowTotal = d11;
        this.cartSavingsTotal = d12;
        this.cartRewardTotal = d13;
        this.cartTmdDiscount = d14;
        this.cartDepositTotal = d15;
        this.cartTotalWithTax = d16;
    }
}
