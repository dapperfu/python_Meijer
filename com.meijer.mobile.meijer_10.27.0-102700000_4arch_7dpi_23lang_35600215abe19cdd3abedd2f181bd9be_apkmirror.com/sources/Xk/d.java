package Xk;

import Fq.ShoppingListItem;
import Fq.ShoppingListStore;
import Ok.Coupon;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ej.Entry;
import ej.ShoppingCart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vl.CartEntry;

@Metadata(d1 = {"\u0000F\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aq\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0011\u0010\u0012\u001aI\u0010\u0017\u001a\u00020\u0010*\u00020\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "LOk/a;", "LFq/e;", "shoppingList", "Lej/C;", "shoppingCart", "LTq/h;", PlaceTypes.STORE, "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "LXk/b;", "associatedProducts", "", "LPk/b;", "couponActionLoadingStates", "LXk/c;", "b", "(Ljava/util/List;LFq/e;Lej/C;LTq/h;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;", "LFq/c;", "shoppingListItem", "associatedProductsState", "couponActionLoadingState", "a", "(LOk/a;LFq/c;Lej/C;LTq/h;LXk/b;LPk/b;)LXk/c;", "state_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class d {
    public static final CouponState a(Coupon coupon, ShoppingListItem shoppingListItem, ShoppingCart shoppingCart, Tq.h hVar, AssociatedProductsState associatedProductsState, Pk.b couponActionLoadingState) {
        List listM;
        List<Entry> listP;
        Intrinsics.j(coupon, "<this>");
        Intrinsics.j(associatedProductsState, "associatedProductsState");
        Intrinsics.j(couponActionLoadingState, "couponActionLoadingState");
        if (shoppingCart == null || (listP = shoppingCart.p()) == null) {
            listM = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listP) {
                List<Long> listO = ((Entry) obj).m().o();
                if (listO == null) {
                    listO = CollectionsKt.m();
                }
                if (listO.contains(Long.valueOf(coupon.getOfferId()))) {
                    arrayList.add(obj);
                }
            }
            CartEntry.Companion companion = CartEntry.INSTANCE;
            listM = new ArrayList(CollectionsKt.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listM.add(companion.a((Entry) it.next()));
            }
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return new CouponState(coupon, hVar, associatedProductsState, shoppingListItem, listM, couponActionLoadingState);
    }

    public static final List<CouponState> b(List<Coupon> list, ShoppingListStore shoppingListStore, ShoppingCart shoppingCart, Tq.h hVar, Map<Long, AssociatedProductsState> associatedProducts, Map<String, ? extends Pk.b> couponActionLoadingStates) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(associatedProducts, "associatedProducts");
        Intrinsics.j(couponActionLoadingStates, "couponActionLoadingStates");
        List<Coupon> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (Coupon coupon : list2) {
            ShoppingListItem shoppingListItemF = shoppingListStore != null ? shoppingListStore.f(coupon) : null;
            AssociatedProductsState associatedProductsState = associatedProducts.get(Long.valueOf(coupon.getOfferId()));
            if (associatedProductsState == null) {
                associatedProductsState = new AssociatedProductsState(null, null, 3, null);
            }
            AssociatedProductsState associatedProductsState2 = associatedProductsState;
            Pk.b bVar = couponActionLoadingStates.get(String.valueOf(coupon.getOfferId()));
            if (bVar == null) {
                bVar = Pk.b.f28321b;
            }
            ShoppingCart shoppingCart2 = shoppingCart;
            Tq.h hVar2 = hVar;
            arrayList.add(a(coupon, shoppingListItemF, shoppingCart2, hVar2, associatedProductsState2, bVar));
            shoppingCart = shoppingCart2;
            hVar = hVar2;
        }
        return arrayList;
    }

    public static /* synthetic */ List c(List list, ShoppingListStore shoppingListStore, ShoppingCart shoppingCart, Tq.h hVar, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            shoppingListStore = null;
        }
        if ((i10 & 2) != 0) {
            shoppingCart = null;
        }
        if ((i10 & 4) != 0) {
            hVar = null;
        }
        if ((i10 & 8) != 0) {
            map = MapsKt.k();
        }
        if ((i10 & 16) != 0) {
            map2 = MapsKt.k();
        }
        return b(list, shoppingListStore, shoppingCart, hVar, map, map2);
    }
}
