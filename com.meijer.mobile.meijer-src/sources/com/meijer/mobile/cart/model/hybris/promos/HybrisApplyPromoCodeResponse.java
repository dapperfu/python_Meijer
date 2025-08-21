package com.meijer.mobile.cart.model.hybris.promos;

import com.meijer.mobile.cart.model.hybris.Cart;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/promos/HybrisApplyPromoCodeResponse;", "", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "cart", "Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCodeResponse;", "promo", "<init>", "(Lcom/meijer/mobile/cart/model/hybris/Cart;Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCodeResponse;)V", "copy", "(Lcom/meijer/mobile/cart/model/hybris/Cart;Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCodeResponse;)Lcom/meijer/mobile/cart/model/hybris/promos/HybrisApplyPromoCodeResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/cart/model/hybris/Cart;", "()Lcom/meijer/mobile/cart/model/hybris/Cart;", "b", "Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCodeResponse;", "()Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCodeResponse;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisApplyPromoCodeResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Cart cart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPromoCodeResponse promo;

    public HybrisApplyPromoCodeResponse(@g(name = "cart") Cart cart, @g(name = "promo") HybrisPromoCodeResponse promo) {
        Intrinsics.j(cart, "cart");
        Intrinsics.j(promo, "promo");
        this.cart = cart;
        this.promo = promo;
    }

    public final HybrisApplyPromoCodeResponse copy(@g(name = "cart") Cart cart, @g(name = "promo") HybrisPromoCodeResponse promo) {
        Intrinsics.j(cart, "cart");
        Intrinsics.j(promo, "promo");
        return new HybrisApplyPromoCodeResponse(cart, promo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisApplyPromoCodeResponse)) {
            return false;
        }
        HybrisApplyPromoCodeResponse hybrisApplyPromoCodeResponse = (HybrisApplyPromoCodeResponse) other;
        return Intrinsics.e(this.cart, hybrisApplyPromoCodeResponse.cart) && Intrinsics.e(this.promo, hybrisApplyPromoCodeResponse.promo);
    }

    public int hashCode() {
        return (this.cart.hashCode() * 31) + this.promo.hashCode();
    }

    public String toString() {
        return "HybrisApplyPromoCodeResponse(cart=" + this.cart + ", promo=" + this.promo + ')';
    }

    /* renamed from: a, reason: from getter */
    public final Cart getCart() {
        return this.cart;
    }

    /* renamed from: b, reason: from getter */
    public final HybrisPromoCodeResponse getPromo() {
        return this.promo;
    }

    public /* synthetic */ HybrisApplyPromoCodeResponse(Cart cart, HybrisPromoCodeResponse hybrisPromoCodeResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cart, (i10 & 2) != 0 ? new HybrisPromoCodeResponse(null, 0, null, 7, null) : hybrisPromoCodeResponse);
    }
}
