package Ao;

import Ao.W;
import Co.ProductFullDetails;
import androidx.recyclerview.widget.RecyclerView;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LAo/M;", "", "<init>", "()V", "", "isFrequentlyBoughtTogetherImpression", "", "cartId", "", "LCo/h;", "productList", "Lii/f;", "b", "(ZLjava/lang/String;Ljava/util/List;)Lii/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f1665a = new M();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, List list, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("product details page");
        TrackingData.v("products view");
        TrackingData.h("cartID", str);
        TrackingData.h("componentName", "Frequently Bought Together");
        TrackingData.h("&&events", "event140");
        List<ProductFullDetails> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (ProductFullDetails productFullDetails : list2) {
            W.Details detailsD = W.Details.Companion.d(W.Details.INSTANCE, productFullDetails, null, 2, null);
            arrayList.add(detailsD.h(((-65626) & 1) != 0 ? detailsD.upc : null, ((-65626) & 2) != 0 ? detailsD.productSubstitutedUpc : null, ((-65626) & 4) != 0 ? detailsD.backupProductUpc : null, ((-65626) & 8) != 0 ? detailsD.quantity : null, ((-65626) & 16) != 0 ? detailsD.price : null, ((-65626) & 32) != 0 ? detailsD.sumTotal : null, ((-65626) & 64) != 0 ? detailsD.department : null, ((-65626) & 128) != 0 ? detailsD.isAlcohol : null, ((-65626) & 256) != 0 ? detailsD.isSuccess : null, ((-65626) & 512) != 0 ? detailsD.isBuyAgain : null, ((-65626) & 1024) != 0 ? detailsD.isOutOfStock : null, ((-65626) & RecyclerView.m.FLAG_MOVED) != 0 ? detailsD.isBackup : null, ((-65626) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsD.itemSelectedFromRecommendation : null, ((-65626) & 8192) != 0 ? detailsD.isLowStock : null, ((-65626) & 16384) != 0 ? detailsD.doNotSubstitute : null, ((-65626) & 32768) != 0 ? detailsD.providedByRecommendations : null, ((-65626) & 65536) != 0 ? detailsD.pageType : null, ((-65626) & 131072) != 0 ? detailsD.isOutOfStockItemRemoved : null, ((-65626) & 262144) != 0 ? detailsD.discountDetails : null, ((-65626) & 524288) != 0 ? detailsD.isSubstitution : null, ((-65626) & 1048576) != 0 ? detailsD.isSubstitutionComplete : null, ((-65626) & 2097152) != 0 ? detailsD.isSubstitutionFindSimilar : null, ((-65626) & 4194304) != 0 ? detailsD.addingFindSimilarSubToCart : null, ((-65626) & 8388608) != 0 ? detailsD.isBopasPlacedOrder : null, ((-65626) & 16777216) != 0 ? detailsD.isBopasEligibleCart : null, ((-65626) & 33554432) != 0 ? detailsD.isSponsoredCriteo : null, ((-65626) & 67108864) != 0 ? detailsD.isAddedFromPlp : null, ((-65626) & 134217728) != 0 ? detailsD.isTrackCartRemoval : null, ((-65626) & 268435456) != 0 ? detailsD.coupons : null, ((-65626) & 536870912) != 0 ? detailsD.isCouponApplied : null, ((-65626) & 1073741824) != 0 ? detailsD.complexPromo : null, ((-65626) & Integer.MIN_VALUE) != 0 ? detailsD.isLowStockItemAdded : null, (16383 & 1) != 0 ? detailsD.isLowStockItemRemoved : null, (16383 & 2) != 0 ? detailsD.sponsorship : null, (16383 & 4) != 0 ? detailsD.isCarouselSponsoredAdded : null, (16383 & 8) != 0 ? detailsD.isCarouselSponsored : Boolean.valueOf(productFullDetails.F()), (16383 & 16) != 0 ? detailsD.isPreOrderEBTOrder : null, (16383 & 32) != 0 ? detailsD.isPostOrderEBTOrder : null, (16383 & 64) != 0 ? detailsD.orderEbtEligibleTotal : null, (16383 & 128) != 0 ? detailsD.ebtCapturedAmount : null, (16383 & 256) != 0 ? detailsD.isEZCDOrder : null, (16383 & 512) != 0 ? detailsD.qtyRequestedAvailableItemTL : null, (16383 & 1024) != 0 ? detailsD.returnedUnavailableItems : null, (16383 & RecyclerView.m.FLAG_MOVED) != 0 ? detailsD.qtyRequestedOOSItemTL : null, (16383 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsD.qtyAddedFromAddAllButtonTL : null, (16383 & 8192) != 0 ? detailsD.variantsInteracted : null));
        }
        TrackingData.e(W.j(arrayList));
        return Unit.f143329a;
    }

    public final TrackingData b(boolean isFrequentlyBoughtTogetherImpression, final String cartId, final List<ProductFullDetails> productList) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(productList, "productList");
        return C14760g.a(C14756c.a(isFrequentlyBoughtTogetherImpression ? "carousel impressions : edaa - Frequently Bought Together" : "carousel scroll : edaa - Frequently Bought Together"), new Function1() { // from class: Ao.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return M.c(cartId, productList, (TrackingData) obj);
            }
        });
    }

    private M() {
    }
}
