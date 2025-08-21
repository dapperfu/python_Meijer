package Tp;

import Xp.ShopAndScanTrip;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTp/q;", "LXp/f;", "a", "(LTp/q;)LXp/f;", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class r {
    public static final ShopAndScanTrip a(ShopAndScanTripWithItems shopAndScanTripWithItems) {
        List listM;
        Intrinsics.j(shopAndScanTripWithItems, "<this>");
        String string = UUID.fromString(shopAndScanTripWithItems.getTrip().getTripId()).toString();
        Intrinsics.i(string, "toString(...)");
        ShopAndScanTrip.UserDetails userDetails = new ShopAndScanTrip.UserDetails(shopAndScanTripWithItems.getTrip().getUser().getDigitalId(), shopAndScanTripWithItems.getTrip().getUser().getMPerksBarcode());
        ShopAndScanTrip.StoreDetails storeDetails = new ShopAndScanTrip.StoreDetails(shopAndScanTripWithItems.getTrip().getStore().getId(), shopAndScanTripWithItems.getTrip().getStore().getName(), shopAndScanTripWithItems.getTrip().getStore().getZip(), shopAndScanTripWithItems.getTrip().getIsGreenville());
        ShopAndScanTrip.CartDetails cartDetails = new ShopAndScanTrip.CartDetails(shopAndScanTripWithItems.getTrip().getCart().getWasTotal(), shopAndScanTripWithItems.getTrip().getCart().getNowTotal(), shopAndScanTripWithItems.getTrip().getCart().getTotalTax(), shopAndScanTripWithItems.getTrip().getCart().getTotalSavings(), shopAndScanTripWithItems.getTrip().getCart().getTotalPriceWithTax());
        ShopAndScanTrip.AuditDetails auditDetails = new ShopAndScanTrip.AuditDetails(shopAndScanTripWithItems.getTrip().getAudit().getMmaAppVersion(), shopAndScanTripWithItems.getTrip().getAudit().getOsVersion(), shopAndScanTripWithItems.getTrip().getAudit().getPhoneModel());
        ShopAndScanTripEntity.TransactionHeader header = shopAndScanTripWithItems.getTrip().getHeader();
        String strA = header != null ? ShopAndScanTripEntity.TransactionHeader.INSTANCE.a(header) : null;
        LocalDateTime localDateTime = LocalDateTime.parse(shopAndScanTripWithItems.getTrip().getStartTime());
        Intrinsics.i(localDateTime, "parse(...)");
        List<ShopAndScanItemEntity> listA = shopAndScanTripWithItems.a();
        if (listA != null) {
            List<ShopAndScanItemEntity> list = listA;
            listM = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(com.meijer.mobile.shopandscan.data.local.entity.a.k((ShopAndScanItemEntity) it.next()));
            }
        } else {
            listM = CollectionsKt.m();
        }
        return new ShopAndScanTrip(string, userDetails, storeDetails, cartDetails, auditDetails, listM, strA, localDateTime, shopAndScanTripWithItems.getTrip().getIsCheckoutInProgress());
    }
}
