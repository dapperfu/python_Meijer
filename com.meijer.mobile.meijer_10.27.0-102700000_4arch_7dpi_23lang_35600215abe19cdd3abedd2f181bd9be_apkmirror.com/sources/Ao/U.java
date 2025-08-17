package Ao;

import Ao.W;
import Co.ProductFullDetails;
import androidx.recyclerview.widget.RecyclerView;
import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LAo/U;", "", "<init>", "()V", "Lmk/i;", "itemToRemove", "itemToAdd", "LCo/h;", "itemToAddProductFullDetails", "", "itemPrice", "Lhi/f;", "b", "(Lmk/i;Lmk/i;LCo/h;D)Lhi/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final U f1199a = new U();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(mk.i iVar, mk.i iVar2, ProductFullDetails productFullDetails, double d10, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("find substitution page");
        TrackingData.h("productID", iVar.h2());
        TrackingData.h("productIDForSubstitution", iVar2.h2());
        W.Details detailsA = W.Details.INSTANCE.a(productFullDetails, Double.valueOf(iVar2.getQuantity()));
        String strH2 = iVar2.h2();
        String strH22 = iVar.h2();
        Double dValueOf = Double.valueOf(d10);
        Boolean bool = Boolean.TRUE;
        TrackingData.e(W.i(detailsA.h(((-65626) & 1) != 0 ? detailsA.upc : strH2, ((-65626) & 2) != 0 ? detailsA.productSubstitutedUpc : strH22, ((-65626) & 4) != 0 ? detailsA.backupProductUpc : null, ((-65626) & 8) != 0 ? detailsA.quantity : null, ((-65626) & 16) != 0 ? detailsA.price : dValueOf, ((-65626) & 32) != 0 ? detailsA.sumTotal : null, ((-65626) & 64) != 0 ? detailsA.department : null, ((-65626) & 128) != 0 ? detailsA.isAlcohol : null, ((-65626) & 256) != 0 ? detailsA.isSuccess : null, ((-65626) & 512) != 0 ? detailsA.isBuyAgain : null, ((-65626) & 1024) != 0 ? detailsA.isOutOfStock : null, ((-65626) & RecyclerView.m.FLAG_MOVED) != 0 ? detailsA.isBackup : null, ((-65626) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsA.itemSelectedFromRecommendation : null, ((-65626) & 8192) != 0 ? detailsA.isLowStock : null, ((-65626) & 16384) != 0 ? detailsA.doNotSubstitute : null, ((-65626) & 32768) != 0 ? detailsA.providedByRecommendations : null, ((-65626) & 65536) != 0 ? detailsA.pageType : null, ((-65626) & 131072) != 0 ? detailsA.isOutOfStockItemRemoved : null, ((-65626) & 262144) != 0 ? detailsA.discountDetails : null, ((-65626) & 524288) != 0 ? detailsA.isSubstitution : bool, ((-65626) & 1048576) != 0 ? detailsA.isSubstitutionComplete : bool, ((-65626) & 2097152) != 0 ? detailsA.isSubstitutionFindSimilar : null, ((-65626) & 4194304) != 0 ? detailsA.addingFindSimilarSubToCart : null, ((-65626) & 8388608) != 0 ? detailsA.isBopasPlacedOrder : null, ((-65626) & 16777216) != 0 ? detailsA.isBopasEligibleCart : null, ((-65626) & 33554432) != 0 ? detailsA.isSponsoredCriteo : null, ((-65626) & 67108864) != 0 ? detailsA.isAddedFromPlp : null, ((-65626) & 134217728) != 0 ? detailsA.isTrackCartRemoval : null, ((-65626) & 268435456) != 0 ? detailsA.coupons : null, ((-65626) & 536870912) != 0 ? detailsA.isCouponApplied : null, ((-65626) & 1073741824) != 0 ? detailsA.complexPromo : null, ((-65626) & Integer.MIN_VALUE) != 0 ? detailsA.isLowStockItemAdded : null, (16383 & 1) != 0 ? detailsA.isLowStockItemRemoved : null, (16383 & 2) != 0 ? detailsA.sponsorship : null, (16383 & 4) != 0 ? detailsA.isCarouselSponsoredAdded : null, (16383 & 8) != 0 ? detailsA.isCarouselSponsored : null, (16383 & 16) != 0 ? detailsA.isPreOrderEBTOrder : null, (16383 & 32) != 0 ? detailsA.isPostOrderEBTOrder : null, (16383 & 64) != 0 ? detailsA.orderEbtEligibleTotal : null, (16383 & 128) != 0 ? detailsA.ebtCapturedAmount : null, (16383 & 256) != 0 ? detailsA.isEZCDOrder : null, (16383 & 512) != 0 ? detailsA.qtyRequestedAvailableItemTL : null, (16383 & 1024) != 0 ? detailsA.returnedUnavailableItems : null, (16383 & RecyclerView.m.FLAG_MOVED) != 0 ? detailsA.qtyRequestedOOSItemTL : null, (16383 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsA.qtyAddedFromAddAllButtonTL : null, (16383 & 8192) != 0 ? detailsA.variantsInteracted : null)));
        return Unit.f142422a;
    }

    public final TrackingData b(final mk.i itemToRemove, final mk.i itemToAdd, final ProductFullDetails itemToAddProductFullDetails, final double itemPrice) {
        Intrinsics.j(itemToRemove, "itemToRemove");
        Intrinsics.j(itemToAdd, "itemToAdd");
        Intrinsics.j(itemToAddProductFullDetails, "itemToAddProductFullDetails");
        return C14480g.a(C14476c.a("event: Substitution: suggested product"), new Function1() { // from class: Ao.T
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return U.c(itemToRemove, itemToAdd, itemToAddProductFullDetails, itemPrice, (TrackingData) obj);
            }
        });
    }

    private U() {
    }
}
