package sp;

import Fq.FavoriteListItem;
import Fq.ShoppingListItem;
import Gp.ProductRatings;
import Ho.ProductSponsorship;
import Wk.ProductComplexPromo;
import Xk.CouponState;
import androidx.recyclerview.widget.RecyclerView;
import cr.SubscriptionDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mk.f;
import vl.CartEntry;
import vl.ProductEligibility;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B¥\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b*\u0010:R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b8\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b,\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\b4\u0010AR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0006¢\u0006\f\n\u0004\b2\u0010@\u001a\u0004\b0\u0010AR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bB\u0010KR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lsp/b;", "Lmk/f;", "T", "", "product", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "LFq/c;", "shoppingListItem", "LFq/a;", "favoriteListItem", "Lvl/a;", "cartEntry", "Lvl/b;", "eligibility", "LQo/l;", "productQuery", "", "LXk/c;", "coupons", "LPk/b;", "couponActionLoadingState", "LWk/a;", "complexPromos", "LHo/a;", "sponsorship", "LGp/c;", "productRating", "Lcr/j;", "subscription", "<init>", "(Lmk/f;Ljava/lang/String;LFq/c;LFq/a;Lvl/a;Lvl/b;LQo/l;Ljava/util/List;LPk/b;Ljava/util/List;LHo/a;LGp/c;Lcr/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/f;", "g", "()Lmk/f;", "b", "Ljava/lang/String;", "c", "LFq/c;", "j", "()LFq/c;", "d", "LFq/a;", "f", "()LFq/a;", "e", "Lvl/a;", "()Lvl/a;", "Lvl/b;", "()Lvl/b;", "LQo/l;", "h", "()LQo/l;", "Ljava/util/List;", "()Ljava/util/List;", "i", "LPk/b;", "getCouponActionLoadingState", "()LPk/b;", "k", "LHo/a;", "()LHo/a;", "l", "LGp/c;", "()LGp/c;", "m", "Lcr/j;", "getSubscription", "()Lcr/j;", "state_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sp.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductState<T extends mk.f> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShoppingListItem shoppingListItem;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final FavoriteListItem favoriteListItem;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartEntry cartEntry;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductEligibility eligibility;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Qo.l productQuery;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CouponState> coupons;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Pk.b couponActionLoadingState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductComplexPromo> complexPromos;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductSponsorship sponsorship;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductRatings productRating;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetails subscription;

    public ProductState(T product, String code, ShoppingListItem shoppingListItem, FavoriteListItem favoriteListItem, CartEntry cartEntry, ProductEligibility eligibility, Qo.l lVar, List<CouponState> coupons, Pk.b couponActionLoadingState, List<ProductComplexPromo> complexPromos, ProductSponsorship productSponsorship, ProductRatings productRatings, SubscriptionDetails subscriptionDetails) {
        Intrinsics.j(product, "product");
        Intrinsics.j(code, "code");
        Intrinsics.j(eligibility, "eligibility");
        Intrinsics.j(coupons, "coupons");
        Intrinsics.j(couponActionLoadingState, "couponActionLoadingState");
        Intrinsics.j(complexPromos, "complexPromos");
        this.product = product;
        this.code = code;
        this.shoppingListItem = shoppingListItem;
        this.favoriteListItem = favoriteListItem;
        this.cartEntry = cartEntry;
        this.eligibility = eligibility;
        this.productQuery = lVar;
        this.coupons = coupons;
        this.couponActionLoadingState = couponActionLoadingState;
        this.complexPromos = complexPromos;
        this.sponsorship = productSponsorship;
        this.productRating = productRatings;
        this.subscription = subscriptionDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductState)) {
            return false;
        }
        ProductState productState = (ProductState) other;
        return Intrinsics.e(this.product, productState.product) && Intrinsics.e(this.code, productState.code) && Intrinsics.e(this.shoppingListItem, productState.shoppingListItem) && Intrinsics.e(this.favoriteListItem, productState.favoriteListItem) && Intrinsics.e(this.cartEntry, productState.cartEntry) && Intrinsics.e(this.eligibility, productState.eligibility) && Intrinsics.e(this.productQuery, productState.productQuery) && Intrinsics.e(this.coupons, productState.coupons) && this.couponActionLoadingState == productState.couponActionLoadingState && Intrinsics.e(this.complexPromos, productState.complexPromos) && Intrinsics.e(this.sponsorship, productState.sponsorship) && Intrinsics.e(this.productRating, productState.productRating) && Intrinsics.e(this.subscription, productState.subscription);
    }

    /* renamed from: a, reason: from getter */
    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    /* renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final List<ProductComplexPromo> c() {
        return this.complexPromos;
    }

    public final List<CouponState> d() {
        return this.coupons;
    }

    /* renamed from: e, reason: from getter */
    public final ProductEligibility getEligibility() {
        return this.eligibility;
    }

    /* renamed from: f, reason: from getter */
    public final FavoriteListItem getFavoriteListItem() {
        return this.favoriteListItem;
    }

    public final T g() {
        return this.product;
    }

    /* renamed from: h, reason: from getter */
    public final Qo.l getProductQuery() {
        return this.productQuery;
    }

    public int hashCode() {
        int iHashCode = ((this.product.hashCode() * 31) + this.code.hashCode()) * 31;
        ShoppingListItem shoppingListItem = this.shoppingListItem;
        int iHashCode2 = (iHashCode + (shoppingListItem == null ? 0 : shoppingListItem.hashCode())) * 31;
        FavoriteListItem favoriteListItem = this.favoriteListItem;
        int iHashCode3 = (iHashCode2 + (favoriteListItem == null ? 0 : favoriteListItem.hashCode())) * 31;
        CartEntry cartEntry = this.cartEntry;
        int iHashCode4 = (((iHashCode3 + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31) + this.eligibility.hashCode()) * 31;
        Qo.l lVar = this.productQuery;
        int iHashCode5 = (((((((iHashCode4 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.coupons.hashCode()) * 31) + this.couponActionLoadingState.hashCode()) * 31) + this.complexPromos.hashCode()) * 31;
        ProductSponsorship productSponsorship = this.sponsorship;
        int iHashCode6 = (iHashCode5 + (productSponsorship == null ? 0 : productSponsorship.hashCode())) * 31;
        ProductRatings productRatings = this.productRating;
        int iHashCode7 = (iHashCode6 + (productRatings == null ? 0 : productRatings.hashCode())) * 31;
        SubscriptionDetails subscriptionDetails = this.subscription;
        return iHashCode7 + (subscriptionDetails != null ? subscriptionDetails.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final ProductRatings getProductRating() {
        return this.productRating;
    }

    /* renamed from: j, reason: from getter */
    public final ShoppingListItem getShoppingListItem() {
        return this.shoppingListItem;
    }

    /* renamed from: k, reason: from getter */
    public final ProductSponsorship getSponsorship() {
        return this.sponsorship;
    }

    public String toString() {
        return "ProductState(product=" + this.product + ", code=" + this.code + ", shoppingListItem=" + this.shoppingListItem + ", favoriteListItem=" + this.favoriteListItem + ", cartEntry=" + this.cartEntry + ", eligibility=" + this.eligibility + ", productQuery=" + this.productQuery + ", coupons=" + this.coupons + ", couponActionLoadingState=" + this.couponActionLoadingState + ", complexPromos=" + this.complexPromos + ", sponsorship=" + this.sponsorship + ", productRating=" + this.productRating + ", subscription=" + this.subscription + ')';
    }

    public /* synthetic */ ProductState(mk.f fVar, String str, ShoppingListItem shoppingListItem, FavoriteListItem favoriteListItem, CartEntry cartEntry, ProductEligibility productEligibility, Qo.l lVar, List list, Pk.b bVar, List list2, ProductSponsorship productSponsorship, ProductRatings productRatings, SubscriptionDetails subscriptionDetails, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i10 & 2) != 0 ? fVar.getCode() : str, (i10 & 4) != 0 ? null : shoppingListItem, (i10 & 8) != 0 ? null : favoriteListItem, (i10 & 16) != 0 ? null : cartEntry, (i10 & 32) != 0 ? new ProductEligibility(fVar, null, null, 6, null) : productEligibility, (i10 & 64) != 0 ? null : lVar, (i10 & 128) != 0 ? CollectionsKt.m() : list, (i10 & 256) != 0 ? Pk.b.f28321b : bVar, (i10 & 512) != 0 ? CollectionsKt.m() : list2, (i10 & 1024) != 0 ? null : productSponsorship, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : productRatings, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : subscriptionDetails);
    }
}
