package Iq;

import Fq.ShoppingListItem;
import com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import th.j;
import vk.C17590a;
import vk.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "LFq/c;", "a", "(Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;)LFq/c;", "b", "(LFq/c;)Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {
    public static final ShoppingListItem a(ShoppingListItemWireModel shoppingListItemWireModel) {
        LocalDateTime localDateTime;
        LocalDateTime localDateTime2;
        Intrinsics.j(shoppingListItemWireModel, "<this>");
        long listItemId = shoppingListItemWireModel.getListItemId();
        String itemDescription = shoppingListItemWireModel.getItemDescription();
        int quantity = shoppingListItemWireModel.getQuantity();
        String itemPartNumber = shoppingListItemWireModel.getItemPartNumber();
        int listItemTypeId = shoppingListItemWireModel.getListItemTypeId();
        int itemDisplayOrder = shoppingListItemWireModel.getItemDisplayOrder();
        Integer storeId = shoppingListItemWireModel.getStoreId();
        int iIntValue = storeId != null ? storeId.intValue() : 0;
        String notes = shoppingListItemWireModel.getNotes();
        boolean isComplete = shoppingListItemWireModel.getIsComplete();
        boolean isFavorite = shoppingListItemWireModel.getIsFavorite();
        String listingId = shoppingListItemWireModel.getListingId();
        String promotionStart = shoppingListItemWireModel.getPromotionStart();
        LocalDate localDateL = (promotionStart == null || (localDateTime2 = (LocalDateTime) d.b(promotionStart, C17590a.f164803a.s(), new j())) == null) ? null : localDateTime2.l();
        String promotionEnd = shoppingListItemWireModel.getPromotionEnd();
        LocalDate localDateL2 = (promotionEnd == null || (localDateTime = (LocalDateTime) d.b(promotionEnd, C17590a.f164803a.s(), new j())) == null) ? null : localDateTime.l();
        Long couponId = shoppingListItemWireModel.getCouponId();
        return new ShoppingListItem(listItemId, listItemTypeId, itemDisplayOrder, itemPartNumber, itemDescription, quantity, iIntValue, notes, isComplete, isFavorite, listingId, localDateL, localDateL2, couponId != null ? couponId.longValue() : 0L, null, 16384, null);
    }

    public static final ShoppingListItemWireModel b(ShoppingListItem shoppingListItem) {
        LocalDateTime localDateTimeAtStartOfDay;
        LocalDateTime localDateTimeAtStartOfDay2;
        Intrinsics.j(shoppingListItem, "<this>");
        long listItemId = shoppingListItem.getListItemId();
        String itemDescription = shoppingListItem.getItemDescription();
        int quantity = shoppingListItem.getQuantity();
        String itemPartNumber = shoppingListItem.getItemPartNumber();
        int listItemTypeId = shoppingListItem.getListItemTypeId();
        int itemDisplayOrder = shoppingListItem.getItemDisplayOrder();
        Integer numValueOf = Integer.valueOf(shoppingListItem.getStoreId());
        String notes = shoppingListItem.getNotes();
        boolean isComplete = shoppingListItem.getIsComplete();
        boolean isFavorite = shoppingListItem.getIsFavorite();
        String listingId = shoppingListItem.getListingId();
        LocalDate promotionStart = shoppingListItem.getPromotionStart();
        String str = null;
        String str2 = (promotionStart == null || (localDateTimeAtStartOfDay2 = promotionStart.atStartOfDay()) == null) ? null : localDateTimeAtStartOfDay2.format(C17590a.ISO_LOCAL_DATE_TIME);
        LocalDate promotionEnd = shoppingListItem.getPromotionEnd();
        if (promotionEnd != null && (localDateTimeAtStartOfDay = promotionEnd.atStartOfDay()) != null) {
            str = localDateTimeAtStartOfDay.format(C17590a.ISO_LOCAL_DATE_TIME);
        }
        return new ShoppingListItemWireModel(listItemId, itemDescription, quantity, itemPartNumber, listItemTypeId, itemDisplayOrder, numValueOf, notes, isComplete, isFavorite, listingId, str2, str, Long.valueOf(shoppingListItem.getCouponId()));
    }
}
