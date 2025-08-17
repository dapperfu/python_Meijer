package com.meijer.mobile.shopandscan.data.local.entity;

import Ol.Header;
import Vp.StartTripRequest;
import Vp.g;
import Xp.ShopAndScanTrip;
import android.os.Build;
import com.meijer.mobile.greenville.model.request.trip.status.TransactionHeaderRequest;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LVp/f;", "request", "", "tripId", "LOl/c;", "header", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "a", "(LVp/f;Ljava/lang/String;LOl/c;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;", "Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "c", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity$d;)Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "LXp/f;", "b", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;)LXp/f;", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {
    public static final ShopAndScanTripEntity a(StartTripRequest request, String tripId, Header header) {
        Intrinsics.j(request, "request");
        Intrinsics.j(tripId, "tripId");
        ShopAndScanTripEntity.User user = new ShopAndScanTripEntity.User(request.getDigitalId(), request.getMPerksBarcode());
        ShopAndScanTripEntity.Store store = new ShopAndScanTripEntity.Store(request.getStore().getId(), request.getStore().getName(), request.getStore().getZip());
        ShopAndScanTripEntity.Cart cart = new ShopAndScanTripEntity.Cart(0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
        String mmaAppVersion = request.getMmaAppVersion();
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.i(RELEASE, "RELEASE");
        ShopAndScanTripEntity.Audit audit = new ShopAndScanTripEntity.Audit(mmaAppVersion, RELEASE, Build.MANUFACTURER + ' ' + Build.MODEL);
        ShopAndScanTripEntity.TransactionHeader transactionHeader = header != null ? new ShopAndScanTripEntity.TransactionHeader(header.getStoreId(), header.getTransactionDateTime(), header.getTransactionDateTimeUTC(), header.getEventTimeStamp(), header.getEventTimeStampUTC(), header.getDeviceId(), header.getDeviceOS(), header.getDeviceAppVersion(), header.getDeviceOSVersion(), header.getTransactionStatus(), header.getTransactionId(), header.getTrackingId(), header.getTransactionNumber(), header.getTerminal()) : null;
        boolean isGreenville = request.getIsGreenville();
        String string = LocalDateTime.now().toString();
        Intrinsics.i(string, "toString(...)");
        return new ShopAndScanTripEntity(tripId, user, store, cart, audit, transactionHeader, string, isGreenville, false);
    }

    public static final ShopAndScanTrip b(ShopAndScanTripEntity shopAndScanTripEntity) {
        Intrinsics.j(shopAndScanTripEntity, "<this>");
        String string = UUID.fromString(shopAndScanTripEntity.getTripId()).toString();
        Intrinsics.i(string, "toString(...)");
        ShopAndScanTrip.UserDetails userDetails = new ShopAndScanTrip.UserDetails(shopAndScanTripEntity.getUser().getDigitalId(), shopAndScanTripEntity.getUser().getMPerksBarcode());
        ShopAndScanTrip.StoreDetails storeDetails = new ShopAndScanTrip.StoreDetails(shopAndScanTripEntity.getStore().getId(), shopAndScanTripEntity.getStore().getName(), shopAndScanTripEntity.getStore().getZip(), shopAndScanTripEntity.getIsGreenville());
        ShopAndScanTrip.CartDetails cartDetails = new ShopAndScanTrip.CartDetails(shopAndScanTripEntity.getCart().getWasTotal(), shopAndScanTripEntity.getCart().getNowTotal(), shopAndScanTripEntity.getCart().getTotalTax(), shopAndScanTripEntity.getCart().getTotalSavings(), shopAndScanTripEntity.getCart().getTotalPriceWithTax());
        ShopAndScanTrip.AuditDetails auditDetails = new ShopAndScanTrip.AuditDetails(shopAndScanTripEntity.getAudit().getMmaAppVersion(), shopAndScanTripEntity.getAudit().getOsVersion(), shopAndScanTripEntity.getAudit().getPhoneModel());
        ShopAndScanTripEntity.TransactionHeader header = shopAndScanTripEntity.getHeader();
        String strA = header != null ? ShopAndScanTripEntity.TransactionHeader.INSTANCE.a(header) : null;
        LocalDateTime localDateTime = LocalDateTime.parse(shopAndScanTripEntity.getStartTime());
        Intrinsics.i(localDateTime, "parse(...)");
        return new ShopAndScanTrip(string, userDetails, storeDetails, cartDetails, auditDetails, CollectionsKt.m(), strA, localDateTime, shopAndScanTripEntity.getIsCheckoutInProgress());
    }

    public static final TransactionHeaderRequest c(ShopAndScanTripEntity.TransactionHeader transactionHeader) {
        Intrinsics.j(transactionHeader, "<this>");
        OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
        Intrinsics.i(offsetDateTimeNow, "now(...)");
        int storeId = transactionHeader.getStoreId();
        return new TransactionHeaderRequest(transactionHeader.getTransactionDateTime(), transactionHeader.getTransactionDateTimeUTC(), storeId, transactionHeader.getTerminal(), g.b(offsetDateTimeNow), g.c(offsetDateTimeNow), transactionHeader.getDeviceId(), transactionHeader.getDeviceOS(), transactionHeader.getDeviceAppVersion(), transactionHeader.getDeviceOSVersion(), transactionHeader.getTransactionStatus(), transactionHeader.getTransactionId(), transactionHeader.getTrackingId(), transactionHeader.getTransactionNumber());
    }
}
