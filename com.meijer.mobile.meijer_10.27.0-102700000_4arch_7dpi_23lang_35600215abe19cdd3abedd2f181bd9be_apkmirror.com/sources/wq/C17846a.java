package wq;

import Xp.a;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXp/a;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$b$a;", "a", "(LXp/a;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$b$a;", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17846a {
    public static final ShopAndScanItemEntity.Barcode.a a(Xp.a aVar) {
        Intrinsics.j(aVar, "<this>");
        return aVar instanceof a.UPCA ? ShopAndScanItemEntity.Barcode.a.f116815a : aVar instanceof a.UPCE ? ShopAndScanItemEntity.Barcode.a.f116816b : aVar instanceof a.NSC2 ? ShopAndScanItemEntity.Barcode.a.f116817c : aVar instanceof a.EAN8 ? ShopAndScanItemEntity.Barcode.a.f116818d : aVar instanceof a.EAN13 ? ShopAndScanItemEntity.Barcode.a.f116819e : aVar instanceof a.CODE128 ? ShopAndScanItemEntity.Barcode.a.f116820f : aVar instanceof a.PLU ? ShopAndScanItemEntity.Barcode.a.f116821g : aVar instanceof a.QR ? ShopAndScanItemEntity.Barcode.a.f116822h : ShopAndScanItemEntity.Barcode.a.f116823i;
    }
}
