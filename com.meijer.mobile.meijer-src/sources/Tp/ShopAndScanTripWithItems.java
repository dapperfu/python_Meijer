package Tp;

import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LTp/q;", "", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "trip", "", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "items", "<init>", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "b", "()Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "Ljava/util/List;", "()Ljava/util/List;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tp.q, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanTripWithItems {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanTripEntity trip;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ShopAndScanItemEntity> items;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanTripWithItems)) {
            return false;
        }
        ShopAndScanTripWithItems shopAndScanTripWithItems = (ShopAndScanTripWithItems) other;
        return Intrinsics.e(this.trip, shopAndScanTripWithItems.trip) && Intrinsics.e(this.items, shopAndScanTripWithItems.items);
    }

    public ShopAndScanTripWithItems(ShopAndScanTripEntity trip, List<ShopAndScanItemEntity> list) {
        Intrinsics.j(trip, "trip");
        this.trip = trip;
        this.items = list;
    }

    public final List<ShopAndScanItemEntity> a() {
        return this.items;
    }

    /* renamed from: b, reason: from getter */
    public final ShopAndScanTripEntity getTrip() {
        return this.trip;
    }

    public int hashCode() {
        int iHashCode = this.trip.hashCode() * 31;
        List<ShopAndScanItemEntity> list = this.items;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ShopAndScanTripWithItems(trip=" + this.trip + ", items=" + this.items + ')';
    }
}
