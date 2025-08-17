package Tp;

import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J \u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH§@¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0016\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"LTp/g;", "", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "trip", "", "d", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entity", "c", "", "tripId", "", "isIsCheckoutInProgress", "g", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Ltv/f;", "LTp/q;", "b", "()Ltv/f;", "a", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g {
    Object a(Continuation<? super Unit> continuation);

    InterfaceC17152f<ShopAndScanTripWithItems> b();

    Object c(ShopAndScanTripEntity shopAndScanTripEntity, Continuation<? super Unit> continuation);

    Object d(ShopAndScanTripEntity shopAndScanTripEntity, Continuation<? super Unit> continuation);

    Object e(Continuation<? super String> continuation);

    Object f(Continuation<? super ShopAndScanTripEntity> continuation);

    Object g(String str, boolean z10, Continuation<? super Unit> continuation);
}
