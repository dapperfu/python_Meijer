package Iq;

import Fq.FavoriteListItem;
import com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LFq/a;", "Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "b", "(LFq/a;)Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "a", "(Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;)LFq/a;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {
    public static final FavoriteListItem a(FavoriteListItemWireModel favoriteListItemWireModel) {
        Intrinsics.j(favoriteListItemWireModel, "<this>");
        return new FavoriteListItem(favoriteListItemWireModel.getListItemId(), favoriteListItemWireModel.getListItemTypeId(), favoriteListItemWireModel.getItemDisplayOrder(), favoriteListItemWireModel.getItemPartNumber(), favoriteListItemWireModel.getItemDescription(), favoriteListItemWireModel.getIsItemInActiveList());
    }

    public static final FavoriteListItemWireModel b(FavoriteListItem favoriteListItem) {
        Intrinsics.j(favoriteListItem, "<this>");
        return new FavoriteListItemWireModel(favoriteListItem.getListItemId(), favoriteListItem.getListItemTypeId(), favoriteListItem.getItemDisplayOrder(), favoriteListItem.getItemPartNumber(), favoriteListItem.b(), favoriteListItem.getIsItemInActiveList());
    }
}
