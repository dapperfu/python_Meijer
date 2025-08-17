package Fq;

import Js.WeeklyAdItem;
import Ok.Coupon;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mk.f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0004*\u00020\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u0004*\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u0012*\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LJs/b;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "LFq/c;", "e", "(LJs/b;I)LFq/c;", "LFq/a;", "d", "(LFq/a;)LFq/c;", "LOk/a;", "f", "(LOk/a;)LFq/c;", "Lmk/c;", "quantity", "g", "(Lmk/c;I)LFq/c;", "weeklyAdItem", "", "a", "(LFq/c;LJs/b;)Z", "LOk/c;", "coupon", "b", "(LFq/c;LOk/c;)Z", "Lmk/f;", "product", "c", "(LFq/c;Lmk/f;)Z", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class d {
    public static /* synthetic */ ShoppingListItem h(mk.c cVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return g(cVar, i10);
    }

    public static final boolean a(ShoppingListItem shoppingListItem, WeeklyAdItem weeklyAdItem) {
        Intrinsics.j(shoppingListItem, "<this>");
        if (weeklyAdItem == null || shoppingListItem.getListingId() == null) {
            return false;
        }
        return weeklyAdItem.C(shoppingListItem.getListingId(), shoppingListItem.x());
    }

    public static final boolean b(ShoppingListItem shoppingListItem, Ok.c coupon) {
        Intrinsics.j(shoppingListItem, "<this>");
        Intrinsics.j(coupon, "coupon");
        return shoppingListItem.getCouponId() == coupon.getOfferId();
    }

    public static final boolean c(ShoppingListItem shoppingListItem, f fVar) {
        Intrinsics.j(shoppingListItem, "<this>");
        if (fVar != null) {
            return Intrinsics.e(fVar.getCode(), shoppingListItem.getItemPartNumber());
        }
        return false;
    }

    public static final ShoppingListItem d(FavoriteListItem favoriteListItem) {
        Intrinsics.j(favoriteListItem, "<this>");
        return new ShoppingListItem(0L, 0, 0, favoriteListItem.getItemPartNumber(), favoriteListItem.b(), 1, 0, null, false, true, null, null, null, 0L, null, 32198, null);
    }

    public static final ShoppingListItem e(WeeklyAdItem weeklyAdItem, int i10) {
        Intrinsics.j(weeklyAdItem, "<this>");
        String strValueOf = String.valueOf(weeklyAdItem.getItemId());
        String productName = weeklyAdItem.getProductName();
        LocalDate endDate = weeklyAdItem.getEndDate();
        String description = weeklyAdItem.getDescription();
        return new ShoppingListItem(0L, 0, 0, null, productName, 0, i10, (description == null || description.length() >= 60) ? null : description, false, false, strValueOf, null, endDate, 0L, null, 27439, null);
    }

    public static final ShoppingListItem f(Coupon coupon) {
        Intrinsics.j(coupon, "<this>");
        long offerId = coupon.getOfferId();
        String description = coupon.getDescription();
        LocalDateTime redemptionStartDate = coupon.getRedemptionStartDate();
        LocalDate localDateL = redemptionStartDate != null ? redemptionStartDate.l() : null;
        LocalDateTime redemptionEndDate = coupon.getRedemptionEndDate();
        return new ShoppingListItem(0L, 0, 0, null, description, 0, 0, null, false, false, null, localDateL, redemptionEndDate != null ? redemptionEndDate.l() : null, offerId, null, 18415, null);
    }

    public static final ShoppingListItem g(mk.c cVar, int i10) {
        Intrinsics.j(cVar, "<this>");
        return new ShoppingListItem(0L, 0, 0, cVar.getCode(), cVar.getName(), RangesKt.f(i10, 1), 0, null, false, false, null, null, null, 0L, null, 32710, null);
    }
}
