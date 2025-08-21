package sp;

import Co.ProductFullDetails;
import Fq.FavoriteListItem;
import Fq.FavoriteListStore;
import Fq.ShoppingListItem;
import Fq.ShoppingListStore;
import Gp.ProductRatings;
import Ho.ProductSponsorship;
import Pk.Coupon;
import Xk.ProductComplexPromo;
import Yk.CouponState;
import com.google.android.libraries.places.api.model.PlaceTypes;
import cr.SubscriptionDetails;
import fj.Entry;
import fj.ShoppingCart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wl.CartEntry;
import wl.ProductEligibility;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aá\u0001\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u001e\b\u0002\u0010\u0015\u001a\u0018\u0012\b\u0012\u00060\u0010j\u0002`\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00020\u000f2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a£\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020#0\u00022\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lnk/f;", "T", "", "LFq/e;", "shoppingList", "LFq/b;", "favoritesList", "Lfj/C;", "shoppingCart", "LTq/h;", PlaceTypes.STORE, "LQo/l;", "productQuery", "LPk/a;", "coupons", "", "", "LQk/b;", "couponActionLoadingStates", "Lcom/meijer/mobile/core/models/products/ProductCode;", "LXk/a;", "complexPromosStore", "LHo/a;", "productSponsorships", "LGp/c;", "productRatings", "Lcr/j;", "subscriptionList", "Lsp/b;", "a", "(Ljava/util/List;LFq/e;LFq/b;Lfj/C;LTq/h;LQo/l;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "LFq/c;", "shoppingListItem", "LFq/a;", "favoriteListItem", "LYk/c;", "complexPromos", "productSponsorship", "productRating", "subscriptionListItem", "b", "(Lnk/f;LFq/c;LFq/a;Lfj/C;LTq/h;LQo/l;Ljava/util/List;Ljava/util/List;LHo/a;LGp/c;Lcr/j;)Lsp/b;", "state_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: sp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17117c {
    public static final <T extends nk.f> List<ProductState<T>> a(List<? extends T> list, ShoppingListStore shoppingListStore, FavoriteListStore favoriteListStore, ShoppingCart shoppingCart, Tq.h hVar, Qo.l lVar, List<Coupon> list2, Map<String, ? extends Qk.b> map, Map<String, ? extends List<ProductComplexPromo>> complexPromosStore, List<ProductSponsorship> productSponsorships, List<ProductRatings> productRatings, List<SubscriptionDetails> subscriptionList) {
        FavoriteListItem favoriteListItemF;
        FavoriteListItem favoriteListItem;
        Object next;
        Object next2;
        Object next3;
        ShoppingListStore shoppingListStore2 = shoppingListStore;
        Intrinsics.j(list, "<this>");
        List<Coupon> coupons = list2;
        Intrinsics.j(coupons, "coupons");
        Map<String, ? extends Qk.b> couponActionLoadingStates = map;
        Intrinsics.j(couponActionLoadingStates, "couponActionLoadingStates");
        Intrinsics.j(complexPromosStore, "complexPromosStore");
        Intrinsics.j(productSponsorships, "productSponsorships");
        Intrinsics.j(productRatings, "productRatings");
        Intrinsics.j(subscriptionList, "subscriptionList");
        List<? extends T> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            nk.f fVar = (nk.f) it.next();
            ShoppingListItem shoppingListItemG = null;
            if (shoppingListStore2 != null) {
                favoriteListItemF = null;
                shoppingListItemG = shoppingListStore2.g(fVar);
            } else {
                favoriteListItemF = null;
            }
            if (favoriteListStore != null) {
                favoriteListItem = favoriteListItemF;
                favoriteListItemF = favoriteListStore.f(fVar);
            } else {
                favoriteListItem = favoriteListItemF;
            }
            List listC = Yk.d.c(coupons, shoppingListStore2, shoppingCart, hVar, null, couponActionLoadingStates, 8, null);
            List<ProductComplexPromo> listM = complexPromosStore.get(fVar.getCode());
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            List<ProductComplexPromo> list4 = listM;
            Iterator<T> it2 = productSponsorships.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = favoriteListItem;
                    break;
                }
                next = it2.next();
                if (Intrinsics.e(((ProductSponsorship) next).getProductCode(), fVar.getCode())) {
                    break;
                }
            }
            ProductSponsorship productSponsorship = (ProductSponsorship) next;
            Iterator<T> it3 = productRatings.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = favoriteListItem;
                    break;
                }
                next2 = it3.next();
                if (Intrinsics.e(((ProductRatings) next2).getProductId(), fVar.getCode())) {
                    break;
                }
            }
            ProductRatings productRatings2 = (ProductRatings) next2;
            Iterator<T> it4 = subscriptionList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next3 = favoriteListItem;
                    break;
                }
                next3 = it4.next();
                if (Intrinsics.e(((SubscriptionDetails) next3).getProductInfo().getProductCode(), fVar.getCode())) {
                    break;
                }
            }
            arrayList.add(b(fVar, shoppingListItemG, favoriteListItemF, shoppingCart, hVar, lVar, listC, list4, productSponsorship, productRatings2, (SubscriptionDetails) next3));
            shoppingListStore2 = shoppingListStore;
            coupons = list2;
            couponActionLoadingStates = map;
        }
        return arrayList;
    }

    public static final <T extends nk.f> ProductState<T> b(T t10, ShoppingListItem shoppingListItem, FavoriteListItem favoriteListItem, ShoppingCart shoppingCart, Tq.h hVar, Qo.l lVar, List<CouponState> coupons, List<ProductComplexPromo> complexPromos, ProductSponsorship productSponsorship, ProductRatings productRatings, SubscriptionDetails subscriptionDetails) {
        List<Entry> listP;
        Entry entryA;
        Intrinsics.j(t10, "<this>");
        Intrinsics.j(coupons, "coupons");
        Intrinsics.j(complexPromos, "complexPromos");
        CartEntry cartEntryA = null;
        ProductFullDetails productFullDetails = t10 instanceof ProductFullDetails ? (ProductFullDetails) t10 : null;
        List<Long> listO = productFullDetails != null ? productFullDetails.o() : null;
        if (listO == null) {
            listO = CollectionsKt.m();
        }
        List listB = Pk.e.b(coupons, listO);
        if (shoppingCart != null && (listP = shoppingCart.p()) != null && (entryA = fj.l.a(listP, t10.getCode())) != null) {
            cartEntryA = CartEntry.INSTANCE.a(entryA);
        }
        return new ProductState<>(t10, null, shoppingListItem, favoriteListItem, cartEntryA, new ProductEligibility(t10, hVar, shoppingCart), lVar, listB, null, complexPromos, productSponsorship, productRatings, subscriptionDetails, 258, null);
    }

    public static /* synthetic */ List c(List list, ShoppingListStore shoppingListStore, FavoriteListStore favoriteListStore, ShoppingCart shoppingCart, Tq.h hVar, Qo.l lVar, List list2, Map map, Map map2, List list3, List list4, List list5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            shoppingListStore = null;
        }
        if ((i10 & 2) != 0) {
            favoriteListStore = null;
        }
        if ((i10 & 4) != 0) {
            shoppingCart = null;
        }
        if ((i10 & 8) != 0) {
            hVar = null;
        }
        if ((i10 & 16) != 0) {
            lVar = null;
        }
        if ((i10 & 32) != 0) {
            list2 = CollectionsKt.m();
        }
        if ((i10 & 64) != 0) {
            map = MapsKt.k();
        }
        if ((i10 & 128) != 0) {
            map2 = MapsKt.k();
        }
        if ((i10 & 256) != 0) {
            list3 = CollectionsKt.m();
        }
        if ((i10 & 512) != 0) {
            list4 = CollectionsKt.m();
        }
        if ((i10 & 1024) != 0) {
            list5 = CollectionsKt.m();
        }
        return a(list, shoppingListStore, favoriteListStore, shoppingCart, hVar, lVar, list2, map, map2, list3, list4, list5);
    }
}
