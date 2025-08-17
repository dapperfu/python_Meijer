package Vp;

import com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest;
import com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequestEventData;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LVp/i;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;", "header", "", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemRemoteID;", "remoteID", "Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;", "a", "(LVp/i;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;Ljava/lang/String;)Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {
    public static final UpdateItemRequest a(UpdateItemRequest updateItemRequest, ShopAndScanTripEntity.TransactionHeader header, String remoteID) {
        Intrinsics.j(updateItemRequest, "<this>");
        Intrinsics.j(header, "header");
        Intrinsics.j(remoteID, "remoteID");
        return new UpdateItemRequest("UPDATE_QUANTITY", com.meijer.mobile.shopandscan.data.local.entity.b.c(header), new UpdateItemRequestEventData(Integer.parseInt(remoteID), updateItemRequest.getQuantity(), Ol.g.f24077b.getType()));
    }
}
